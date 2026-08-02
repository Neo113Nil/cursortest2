package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public abstract class qcv extends t9 implements Runnable, ocv {
    private CountDownLatch closeLatch;
    private CountDownLatch connectLatch;
    private Thread connectReadThread;
    private int connectTimeout;
    private i2a dnsResolver;
    private hma draft;
    private tcv engine;
    private Map<String, String> headers;
    private OutputStream ostream;
    private Proxy proxy;
    private Socket socket;
    private SocketFactory socketFactory;
    protected URI uri;
    private Thread writeThread;

    public qcv(URI uri) {
        ima imaVar = new ima(Integer.MAX_VALUE, Collections.EMPTY_LIST, Collections.singletonList(new jzm()));
        this.uri = null;
        this.engine = null;
        this.socket = null;
        this.socketFactory = null;
        this.proxy = Proxy.NO_PROXY;
        this.connectLatch = new CountDownLatch(1);
        this.closeLatch = new CountDownLatch(1);
        this.connectTimeout = 0;
        this.dnsResolver = null;
        if (uri == null) {
            e7o.e();
            throw null;
        }
        this.uri = uri;
        this.draft = imaVar;
        this.dnsResolver = new itk();
        this.connectTimeout = 0;
        setTcpNoDelay(false);
        setReuseAddr(false);
        this.engine = new tcv(this, imaVar);
    }

    public static void access$000(qcv qcvVar, IOException iOException) {
        if (iOException instanceof SSLException) {
            qcvVar.onError(iOException);
        }
        qcvVar.engine.e();
    }

    public void addHeader(String str, String str2) {
        if (this.headers == null) {
            this.headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        }
        this.headers.put(str, str2);
    }

    public final int c() {
        int port = this.uri.getPort();
        String scheme = this.uri.getScheme();
        if ("wss".equals(scheme)) {
            if (port == -1) {
                return 443;
            }
            return port;
        }
        if (!"ws".equals(scheme)) {
            xq0.x(f1d.g("unknown scheme: ", scheme));
            return 0;
        }
        if (port == -1) {
            return 80;
        }
        return port;
    }

    public void clearHeaders() {
        this.headers = null;
    }

    public void close() {
        if (this.writeThread != null) {
            this.engine.a(1000, "", false);
        }
    }

    public void closeBlocking() throws InterruptedException {
        close();
        this.closeLatch.await();
    }

    public void closeConnection(int i, String str) {
        this.engine.b(i, str, false);
    }

    public void connect() {
        if (this.connectReadThread != null) {
            xq0.q("WebSocketClient objects are not reuseable");
            return;
        }
        Thread thread = new Thread(this);
        this.connectReadThread = thread;
        thread.setName("WebSocketConnectReadThread-" + this.connectReadThread.getId());
        this.connectReadThread.start();
    }

    public boolean connectBlocking(long j, TimeUnit timeUnit) throws InterruptedException {
        connect();
        return this.connectLatch.await(j, timeUnit) && this.engine.g();
    }

    public final boolean d() {
        if (this.proxy != Proxy.NO_PROXY) {
            this.socket = new Socket(this.proxy);
            return true;
        }
        SocketFactory socketFactory = this.socketFactory;
        if (socketFactory != null) {
            this.socket = socketFactory.createSocket();
            return false;
        }
        Socket socket = this.socket;
        if (socket == null) {
            this.socket = new Socket(this.proxy);
            return true;
        }
        if (socket.isClosed()) {
            throw new IOException();
        }
        return false;
    }

    public final void e() {
        Thread currentThread = Thread.currentThread();
        if (currentThread == this.writeThread || currentThread == this.connectReadThread) {
            xq0.q("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to ensure a successful cleanup.");
            return;
        }
        try {
            closeBlocking();
            Thread thread = this.writeThread;
            if (thread != null) {
                thread.interrupt();
                this.writeThread = null;
            }
            Thread thread2 = this.connectReadThread;
            if (thread2 != null) {
                thread2.interrupt();
                this.connectReadThread = null;
            }
            this.draft.b();
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
                this.socket = null;
            }
            this.connectLatch = new CountDownLatch(1);
            this.closeLatch = new CountDownLatch(1);
            this.engine = new tcv(this, this.draft);
        } catch (Exception e) {
            onError(e);
            this.engine.b(1006, e.getMessage(), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        String str;
        String rawPath = this.uri.getRawPath();
        String rawQuery = this.uri.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = hrg.l('?', rawPath, rawQuery);
        }
        int c = c();
        StringBuilder sb = new StringBuilder();
        sb.append(this.uri.getHost());
        sb.append((c == 80 || c == 443) ? "" : k5r.i(c, StringUtils.PROCESS_POSTFIX_DELIMITER));
        String sb2 = sb.toString();
        isd isdVar = new isd();
        isdVar.b = rawPath;
        isdVar.D("Host", sb2);
        Map<String, String> map = this.headers;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                isdVar.D(entry.getKey(), entry.getValue());
            }
        }
        tcv tcvVar = this.engine;
        qcv qcvVar = tcvVar.c;
        ima imaVar = tcvVar.f;
        imaVar.getClass();
        isdVar.D("Upgrade", "websocket");
        isdVar.D("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        imaVar.m.nextBytes(bArr);
        try {
            str = xv7.w(16, bArr);
        } catch (IOException unused) {
            str = null;
        }
        isdVar.D("Sec-WebSocket-Key", str);
        isdVar.D("Sec-WebSocket-Version", "13");
        StringBuilder sb3 = new StringBuilder();
        Iterator it = imaVar.f.iterator();
        while (it.hasNext()) {
            ((fm7) it.next()).getClass();
        }
        if (sb3.length() != 0) {
            isdVar.D("Sec-WebSocket-Extensions", sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        Iterator it2 = imaVar.i.iterator();
        while (it2.hasNext()) {
            ((jzm) ((p9e) it2.next())).getClass();
        }
        if (sb4.length() != 0) {
            isdVar.D("Sec-WebSocket-Protocol", sb4.toString());
        }
        tcvVar.i = isdVar;
        try {
            qcvVar.onWebsocketHandshakeSentAsClient(tcvVar, isdVar);
            ima imaVar2 = tcvVar.f;
            isd isdVar2 = tcvVar.i;
            imaVar2.getClass();
            StringBuilder sb5 = new StringBuilder(100);
            if (isdVar2 != 0) {
                sb5.append("GET ");
                sb5.append(isdVar2.b);
                sb5.append(" HTTP/1.1");
            } else if (!(isdVar2 instanceof cjp)) {
                xq0.x("unknown role");
                return;
            } else {
                sb5.append("HTTP/1.1 101 ");
                sb5.append(((jsd) ((cjp) isdVar2)).b);
            }
            sb5.append("\r\n");
            for (String str2 : Collections.unmodifiableSet(((TreeMap) isdVar2.a).keySet())) {
                String t = isdVar2.t(str2);
                sb5.append(str2);
                sb5.append(": ");
                sb5.append(t);
                sb5.append("\r\n");
            }
            sb5.append("\r\n");
            String sb6 = sb5.toString();
            CodingErrorAction codingErrorAction = me4.a;
            byte[] bytes = sb6.getBytes(StandardCharsets.US_ASCII);
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
            allocate.put(bytes);
            allocate.flip();
            tcvVar.k(Collections.singletonList(allocate));
        } catch (RuntimeException e) {
            tcvVar.a.h("Exception in startHandshake", e);
            qcvVar.onWebsocketError(tcvVar, e);
            throw new wxe("rejected because of " + e);
        } catch (uxe unused2) {
            throw new wxe("Handshake data rejected by client.");
        }
    }

    public final void g() {
        SSLSocketFactory socketFactory;
        SocketFactory socketFactory2 = this.socketFactory;
        if (socketFactory2 instanceof SSLSocketFactory) {
            socketFactory = (SSLSocketFactory) socketFactory2;
        } else {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, null, null);
            socketFactory = sSLContext.getSocketFactory();
        }
        this.socket = socketFactory.createSocket(this.socket, this.uri.getHost(), c(), true);
    }

    public <T> T getAttachment() {
        return (T) this.engine.o;
    }

    public ocv getConnection() {
        return this.engine;
    }

    @Override // defpackage.t9
    public Collection<ocv> getConnections() {
        return Collections.singletonList(this.engine);
    }

    public hma getDraft() {
        return this.draft;
    }

    public InetSocketAddress getLocalSocketAddress(ocv ocvVar) {
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    public p9e getProtocol() {
        ima imaVar = this.engine.f;
        if (imaVar == null) {
            return null;
        }
        return imaVar.h;
    }

    public gkn getReadyState() {
        return this.engine.e;
    }

    public InetSocketAddress getRemoteSocketAddress(ocv ocvVar) {
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    public String getResourceDescriptor() {
        return this.uri.getPath();
    }

    public SSLSession getSSLSession() {
        if (hasSSLSupport()) {
            return ((SSLSocket) this.socket).getSession();
        }
        xq0.x("This websocket uses ws instead of wss. No SSLSession available.");
        return null;
    }

    public Socket getSocket() {
        return this.socket;
    }

    public URI getURI() {
        return this.uri;
    }

    public boolean hasBufferedData() {
        return !this.engine.b.isEmpty();
    }

    public boolean hasSSLSupport() {
        return this.socket instanceof SSLSocket;
    }

    public boolean isClosed() {
        return this.engine.e == gkn.d;
    }

    public boolean isClosing() {
        return this.engine.e == gkn.c;
    }

    public boolean isFlushAndClose() {
        return this.engine.d;
    }

    public boolean isOpen() {
        return this.engine.g();
    }

    public abstract void onClose(int i, String str, boolean z);

    public abstract void onError(Exception exc);

    public abstract void onMessage(String str);

    public abstract void onOpen(cjp cjpVar);

    public void onSetSSLParameters(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    public final void onWebsocketClose(ocv ocvVar, int i, String str, boolean z) {
        stopConnectionLostTimer();
        Thread thread = this.writeThread;
        if (thread != null) {
            thread.interrupt();
        }
        onClose(i, str, z);
        this.connectLatch.countDown();
        this.closeLatch.countDown();
    }

    public void onWebsocketCloseInitiated(ocv ocvVar, int i, String str) {
        onCloseInitiated(i, str);
    }

    public void onWebsocketClosing(ocv ocvVar, int i, String str, boolean z) {
        onClosing(i, str, z);
    }

    public final void onWebsocketError(ocv ocvVar, Exception exc) {
        onError(exc);
    }

    public final void onWebsocketMessage(ocv ocvVar, String str) {
        onMessage(str);
    }

    public final void onWebsocketOpen(ocv ocvVar, ksd ksdVar) {
        startConnectionLostTimer();
        onOpen((cjp) ksdVar);
        this.connectLatch.countDown();
    }

    public void reconnect() {
        e();
        connect();
    }

    public boolean reconnectBlocking() throws InterruptedException {
        e();
        return connectBlocking();
    }

    public String removeHeader(String str) {
        Map<String, String> map = this.headers;
        if (map == null) {
            return null;
        }
        return map.remove(str);
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        InetSocketAddress inetSocketAddress;
        try {
            boolean d = d();
            this.socket.setTcpNoDelay(isTcpNoDelay());
            this.socket.setReuseAddress(isReuseAddr());
            if (!this.socket.isConnected()) {
                if (this.dnsResolver == null) {
                    inetSocketAddress = InetSocketAddress.createUnresolved(this.uri.getHost(), c());
                } else {
                    i2a i2aVar = this.dnsResolver;
                    URI uri = this.uri;
                    ((itk) i2aVar).getClass();
                    inetSocketAddress = new InetSocketAddress(InetAddress.getByName(uri.getHost()), c());
                }
                this.socket.connect(inetSocketAddress, this.connectTimeout);
            }
            if (d && "wss".equals(this.uri.getScheme())) {
                g();
            }
            Socket socket = this.socket;
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                onSetSSLParameters(sSLParameters);
                sSLSocket.setSSLParameters(sSLParameters);
            }
            InputStream inputStream = this.socket.getInputStream();
            this.ostream = this.socket.getOutputStream();
            f();
            Thread thread = new Thread(new e8h(28, this, this));
            this.writeThread = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (!isClosing() && !isClosed() && (read = inputStream.read(bArr)) != -1) {
                try {
                    this.engine.c(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException e) {
                    if (e instanceof SSLException) {
                        onError(e);
                    }
                    this.engine.e();
                } catch (RuntimeException e2) {
                    onError(e2);
                    this.engine.b(1006, e2.getMessage(), false);
                }
            }
            this.engine.e();
            this.connectReadThread = null;
        } catch (Exception e3) {
            onWebsocketError(this.engine, e3);
            this.engine.b(-1, e3.getMessage(), false);
        } catch (InternalError e4) {
            if (!(e4.getCause() instanceof InvocationTargetException) || !(e4.getCause().getCause() instanceof IOException)) {
                throw e4;
            }
            IOException iOException = (IOException) e4.getCause().getCause();
            onWebsocketError(this.engine, iOException);
            this.engine.b(-1, iOException.getMessage(), false);
        }
    }

    public void send(String str) {
        tcv tcvVar = this.engine;
        if (str == null) {
            tcvVar.getClass();
            xq0.x("Cannot send 'null' data to a WebSocketImpl.");
            return;
        }
        ima imaVar = tcvVar.f;
        boolean z = tcvVar.g == 1;
        imaVar.getClass();
        l03 l03Var = new l03(2);
        CodingErrorAction codingErrorAction = me4.a;
        l03Var.c = ByteBuffer.wrap(str.getBytes(StandardCharsets.UTF_8));
        l03Var.d = z;
        try {
            l03Var.b();
            tcvVar.j(Collections.singletonList(l03Var));
        } catch (uxe e) {
            throw new wej(e);
        }
    }

    public void sendFragmentedFrame(dsj dsjVar, ByteBuffer byteBuffer, boolean z) {
        l03 l03Var;
        tcv tcvVar = this.engine;
        ima imaVar = tcvVar.f;
        imaVar.getClass();
        dsj dsjVar2 = dsj.b;
        dsj dsjVar3 = dsj.c;
        if (dsjVar != dsjVar3 && dsjVar != dsjVar2) {
            xq0.x("Only Opcode.BINARY or  Opcode.TEXT are allowed");
            return;
        }
        if (imaVar.b != null) {
            l03Var = new l03(1);
        } else {
            imaVar.b = dsjVar;
            l03Var = dsjVar == dsjVar3 ? new l03(0) : dsjVar == dsjVar2 ? new l03(2) : null;
        }
        l03Var.c = byteBuffer;
        l03Var.a = z;
        try {
            l03Var.b();
            if (z) {
                imaVar.b = null;
            } else {
                imaVar.b = dsjVar;
            }
            tcvVar.j(Collections.singletonList(l03Var));
        } catch (uxe e) {
            xq0.t(e);
        }
    }

    @Override // defpackage.ocv
    public void sendFrame(svc svcVar) {
        this.engine.sendFrame(svcVar);
    }

    public void sendPing() {
        tcv tcvVar = this.engine;
        gsk onPreparePing = tcvVar.c.onPreparePing(tcvVar);
        if (onPreparePing != null) {
            tcvVar.sendFrame(onPreparePing);
        } else {
            jj4.j("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
    }

    public <T> void setAttachment(T t) {
        this.engine.o = t;
    }

    public void setDnsResolver(i2a i2aVar) {
        this.dnsResolver = i2aVar;
    }

    public void setProxy(Proxy proxy) {
        if (proxy != null) {
            this.proxy = proxy;
        } else {
            e7o.e();
        }
    }

    @Deprecated
    public void setSocket(Socket socket) {
        if (this.socket == null) {
            this.socket = socket;
        } else {
            xq0.q("socket has already been set");
        }
    }

    public void setSocketFactory(SocketFactory socketFactory) {
        this.socketFactory = socketFactory;
    }

    public final void onWebsocketMessage(ocv ocvVar, ByteBuffer byteBuffer) {
        onMessage(byteBuffer);
    }

    public void sendFrame(Collection<svc> collection) {
        this.engine.j(collection);
    }

    public InetSocketAddress getLocalSocketAddress() {
        tcv tcvVar = this.engine;
        return tcvVar.c.getLocalSocketAddress(tcvVar);
    }

    public InetSocketAddress getRemoteSocketAddress() {
        tcv tcvVar = this.engine;
        return tcvVar.c.getRemoteSocketAddress(tcvVar);
    }

    public void close(int i) {
        this.engine.a(i, "", false);
    }

    public void close(int i, String str) {
        this.engine.a(i, str, false);
    }

    public boolean connectBlocking() throws InterruptedException {
        connect();
        this.connectLatch.await();
        return this.engine.g();
    }

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public final void onWriteDemand(ocv ocvVar) {
    }

    public void onCloseInitiated(int i, String str) {
    }

    public void send(byte[] bArr) {
        tcv tcvVar = this.engine;
        tcvVar.getClass();
        tcvVar.i(ByteBuffer.wrap(bArr));
    }

    public void send(ByteBuffer byteBuffer) {
        this.engine.i(byteBuffer);
    }

    public void onClosing(int i, String str, boolean z) {
    }
}
