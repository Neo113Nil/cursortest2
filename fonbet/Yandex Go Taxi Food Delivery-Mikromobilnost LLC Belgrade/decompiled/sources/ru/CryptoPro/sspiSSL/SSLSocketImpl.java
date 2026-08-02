package ru.CryptoPro.sspiSSL;

import defpackage.a441;
import defpackage.cbv;
import defpackage.dx61;
import defpackage.ns61;
import defpackage.ny61;
import defpackage.or61;
import defpackage.oyr;
import defpackage.qcy0;
import defpackage.qt61;
import defpackage.s421;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.AccessController;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.ssl.cl_88;

/* loaded from: classes4.dex */
public class SSLSocketImpl extends qt61 {
    public String A;
    public SSLContextImpl B;
    public HashMap C;
    public a441 D;
    public s421 E;
    public final boolean F;
    public BiFunction G;
    public InputStream H;
    public OutputStream I;
    public qcy0 J;
    public ns61 K;
    public SSLEngineImpl L;
    public final Object M;
    public volatile int w;
    public byte x;
    public boolean y;
    public boolean z;

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, Socket socket, String str, boolean z) {
        super(socket);
        this.z = true;
        or61 or61Var = or61.w;
        this.F = true;
        this.M = new Object();
        if (!socket.isConnected()) {
            throw new SocketException("Underlying socket is not connected");
        }
        this.A = str;
        d(sSLContextImpl, false);
        this.F = z;
        k();
    }

    public static String w() {
        return Thread.currentThread().getName();
    }

    public final synchronized void a(int i) {
        this.w = i;
    }

    @Override // javax.net.ssl.SSLSocket
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        if (handshakeCompletedListener == null) {
            ny61.g("listener is null");
            return;
        }
        if (this.C == null) {
            this.C = new HashMap(4);
        }
        this.C.put(handshakeCompletedListener, AccessController.getContext());
    }

    @Override // defpackage.qt61, java.net.Socket
    public /* bridge */ /* synthetic */ void bind(SocketAddress socketAddress) throws IOException {
        super.bind(socketAddress);
    }

    public final synchronized void c(Exception exc) {
        try {
            int i = this.w;
            if (this.w < 4) {
                this.w = 4;
            }
            if (i == 1) {
                this.H.skip(r1.available());
            }
            SSLLogger.fine(w(), "called closeSocket()");
            super.close();
            if (this.w < 6) {
                this.w = i == 7 ? 7 : 6;
            }
            this.L.i(exc);
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.qt61, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SSLLogger.fine(w(), "called close()");
        e(true);
        this.L.closeInbound();
        a(7);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) throws IOException {
        if (this.a != this) {
            throw new SocketException("Already connected");
        }
        if (!(socketAddress instanceof InetSocketAddress)) {
            throw new SocketException("Cannot handle non-Inet socket addresses.");
        }
        super.connect(socketAddress, i);
        String str = this.A;
        if (str == null || str.length() == 0) {
            synchronized (this) {
                InetAddress inetAddress = getInetAddress();
                if (inetAddress != null) {
                    this.A = inetAddress.getHostName();
                }
            }
        }
        k();
    }

    public final void d(SSLContextImpl sSLContextImpl, boolean z) {
        this.w = 0;
        this.y = z;
        this.B = sSLContextImpl;
        if (!z) {
            SSLEngineImpl sSLEngineImpl = (SSLEngineImpl) sSLContextImpl.engineCreateSSLEngine();
            this.L = sSLEngineImpl;
            sSLEngineImpl.setNeedClientAuth(getNeedClientAuth());
            if (sSLContextImpl.l instanceof dx61) {
                this.L.setNeedClientAuth(true);
            }
        } else if (!sSLContextImpl.c) {
            ny61.r("SSLContextImpl is not initialized");
            return;
        } else {
            SSLEngineImpl sSLEngineImpl2 = new SSLEngineImpl(sSLContextImpl, true);
            this.L = sSLEngineImpl2;
            sSLEngineImpl2.setNeedClientAuth(getNeedClientAuth());
        }
        this.D = this.B.d(z);
        this.E = this.B.a(z);
        qcy0 qcy0Var = new qcy0();
        qcy0Var.c = new byte[cl_88.o];
        qcy0Var.b = this;
        this.J = qcy0Var;
        this.K = new ns61(this);
    }

    public final void e(boolean z) {
        SSLLogger.fine(w() + ", called closeInternal(" + z + Extension.C_BRAKE);
        int n = n();
        Object obj = null;
        try {
            if (n == 0) {
                v(z);
            } else if (n == 4) {
                SSLLogger.fine(w(), "called closeSocket()");
                super.close();
            } else if (n != 6 && n != 7) {
                synchronized (this) {
                    try {
                        int n2 = n();
                        if (n2 == 6 || n2 == 4 || n2 == 7) {
                            synchronized (this) {
                                this.w = this.w == 7 ? 7 : 6;
                                notifyAll();
                            }
                            return;
                        }
                        boolean z2 = false;
                        if (n2 != 5) {
                            try {
                                this.L.q(false);
                                this.w = 5;
                            } catch (Throwable th) {
                                this.w = 4;
                                try {
                                    v(z);
                                    z2 = true;
                                    obj = th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        }
                        if (n2 == 5) {
                            SSLLogger.fine(w() + ", close invoked again; state = " + n());
                            if (!z) {
                                synchronized (this) {
                                    this.w = this.w == 7 ? 7 : 6;
                                    notifyAll();
                                }
                                if (obj != null) {
                                    if (obj instanceof Error) {
                                        throw ((Error) obj);
                                    }
                                    if (obj instanceof RuntimeException) {
                                        throw ((RuntimeException) obj);
                                    }
                                    return;
                                }
                                return;
                            }
                            synchronized (this) {
                                while (this.w < 6) {
                                    try {
                                        wait();
                                    } catch (InterruptedException unused) {
                                    }
                                }
                            }
                            SSLLogger.fine(w() + ", after primary close; state = " + n());
                            synchronized (this) {
                                this.w = this.w == 7 ? 7 : 6;
                                notifyAll();
                            }
                            if (obj != null) {
                                if (obj instanceof Error) {
                                    throw ((Error) obj);
                                }
                                if (obj instanceof RuntimeException) {
                                    throw ((RuntimeException) obj);
                                }
                                return;
                            }
                            return;
                        }
                        if (!z2) {
                            v(z);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            synchronized (this) {
                this.w = this.w == 7 ? 7 : 6;
                notifyAll();
            }
            if (obj != null) {
                if (obj instanceof Error) {
                    throw ((Error) obj);
                }
                if (obj instanceof RuntimeException) {
                    throw ((RuntimeException) obj);
                }
            }
        } catch (Throwable th4) {
            synchronized (this) {
                this.w = this.w == 7 ? 7 : 6;
                notifyAll();
                if (obj != null) {
                    if (obj instanceof Error) {
                        throw ((Error) obj);
                    }
                    if (obj instanceof RuntimeException) {
                        throw ((RuntimeException) obj);
                    }
                }
                throw th4;
            }
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized String getApplicationProtocol() {
        return null;
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getEnableSessionCreation() {
        return this.z;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized String[] getEnabledCipherSuites() {
        return this.D.v();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledProtocols() {
        return this.E.p();
    }

    public SSLEngineImpl getEngine() {
        return this.L;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized String getHandshakeApplicationProtocol() {
        return null;
    }

    @Override // javax.net.ssl.SSLSocket
    public BiFunction getHandshakeApplicationProtocolSelector() {
        return this.G;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized SSLSession getHandshakeSession() {
        SSLEngineImpl sSLEngineImpl;
        try {
            sSLEngineImpl = this.L;
        } catch (Throwable th) {
            throw th;
        }
        return sSLEngineImpl != null ? sSLEngineImpl.getSession() : SSLSessionImpl.r;
    }

    @Override // defpackage.qt61, java.net.Socket
    public InputStream getInputStream() throws IOException {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (this.w != 0) {
            return this.K;
        }
        throw new SocketException("Socket is not connected");
    }

    @Override // defpackage.qt61, java.net.Socket
    public /* bridge */ /* synthetic */ SocketAddress getLocalSocketAddress() {
        return super.getLocalSocketAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getNeedClientAuth() {
        return this.x == 2;
    }

    @Override // defpackage.qt61, java.net.Socket
    public OutputStream getOutputStream() throws IOException {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (this.w != 0) {
            return this.J;
        }
        throw new SocketException("Socket is not connected");
    }

    @Override // defpackage.qt61, java.net.Socket
    public /* bridge */ /* synthetic */ SocketAddress getRemoteSocketAddress() {
        return super.getRemoteSocketAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLSession getSession() {
        SSLSession session;
        if (n() == 1) {
            try {
                startHandshake();
            } catch (IOException e) {
                SSLLogger.fine(Thread.currentThread().getName() + ", IOException in getSession()", (Throwable) e);
            }
        }
        synchronized (this) {
            session = this.L.getSession();
        }
        return session;
    }

    public InputStream getSockInput() {
        return this.H;
    }

    public OutputStream getSockOutput() {
        return this.I;
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedCipherSuites() {
        return this.B.j().v();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedProtocols() {
        return this.B.i().p();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getUseClientMode() {
        return !this.y;
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getWantClientAuth() {
        return this.x == 1;
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.w == 7;
    }

    public final void k() {
        this.H = super.getInputStream();
        this.I = super.getOutputStream();
        int n = n();
        if (n != 0) {
            if (n == 1) {
                return;
            }
            if (n != 2) {
                if (n == 3) {
                    return;
                }
                ny61.r("Internal error");
                return;
            }
        }
        if (this.w == 0) {
            a(1);
        } else {
            a(3);
        }
    }

    public final synchronized int n() {
        return this.w;
    }

    public final void o() {
        if (this.C != null) {
            HandshakeCompletedEvent handshakeCompletedEvent = new HandshakeCompletedEvent(this, getSession());
            Set entrySet = this.C.entrySet();
            cbv cbvVar = new cbv("HandshakeCompletedNotify-Thread");
            cbvVar.b = new HashSet(entrySet);
            cbvVar.c = handshakeCompletedEvent;
            cbvVar.start();
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        HashMap hashMap = this.C;
        if (hashMap == null) {
            ny61.g("no listeners");
        } else if (hashMap.remove(handshakeCompletedListener) == null) {
            ny61.g("listener not registered");
        } else if (this.C.isEmpty()) {
            this.C = null;
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnableSessionCreation(boolean z) {
        this.z = z;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setEnabledCipherSuites(String[] strArr) {
        this.D = new a441(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledProtocols(String[] strArr) {
        this.E = new s421(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setHandshakeApplicationProtocolSelector(BiFunction biFunction) {
        this.G = biFunction;
    }

    @Override // javax.net.ssl.SSLSocket
    public void setNeedClientAuth(boolean z) {
        this.x = z ? (byte) 2 : (byte) 0;
    }

    @Override // defpackage.qt61, java.net.Socket
    public /* bridge */ /* synthetic */ void setPerformancePreferences(int i, int i2, int i3) {
        super.setPerformancePreferences(i, i2, i3);
    }

    @Override // defpackage.qt61, java.net.Socket
    public /* bridge */ /* synthetic */ void setSoTimeout(int i) throws SocketException {
        super.setSoTimeout(i);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setUseClientMode(boolean z) {
        if (z == this.y) {
            throw new IllegalStateException(oyr.t(new StringBuilder("Invalid socket state for "), this.y ? "server" : "client", " mode"));
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public void setWantClientAuth(boolean z) {
        this.x = z ? (byte) 1 : (byte) 0;
    }

    public int startConnHandshake(byte[] bArr) throws IOException {
        int handshake;
        this.L.setSocketImpl(this);
        this.L.setEnabledCipherSuites(getEnabledCipherSuites());
        synchronized (this.M) {
            handshake = this.L.handshake(bArr);
        }
        return handshake;
    }

    @Override // javax.net.ssl.SSLSocket
    public void startHandshake() throws IOException {
        this.L.setSocketImpl(this);
        this.L.setEnabledCipherSuites(getEnabledCipherSuites());
        synchronized (this.M) {
            this.L.beginHandshake();
        }
    }

    @Override // defpackage.qt61, javax.net.ssl.SSLSocket, java.net.Socket
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final void v(boolean z) {
        SSLLogger.fine(w(), ", called closeSocket(selfInitiated)");
        if (this.a == this || this.F) {
            super.close();
            return;
        }
        if (!z) {
            return;
        }
        SSLLogger.fine(w() + ", waiting for close_notify or alert: state " + n());
        while (true) {
            try {
                int n = n();
                if (n == 6 || n == 4 || n == 7) {
                    return;
                }
                try {
                    this.K.a();
                } catch (SocketTimeoutException e) {
                    SSLLogger.warning(w() + ", received exception", e);
                    c(e);
                    throw null;
                }
            } catch (IOException e2) {
                SSLLogger.warning(w() + ", exception while waiting for close", e2);
                return;
            }
        }
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, Socket socket, InputStream inputStream, boolean z) {
        super(socket, inputStream);
        this.z = true;
        or61 or61Var = or61.w;
        this.F = true;
        this.M = new Object();
        if (!socket.isConnected()) {
            throw new SocketException("Underlying socket is not connected");
        }
        d(sSLContextImpl, true);
        this.F = z;
        k();
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, boolean z) {
        this.z = true;
        or61 or61Var = or61.w;
        this.F = true;
        this.M = new Object();
        d(sSLContextImpl, z);
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, boolean z, a441 a441Var, byte b, boolean z2, s421 s421Var) {
        this.z = true;
        or61 or61Var = or61.w;
        this.F = true;
        this.M = new Object();
        this.x = b;
        this.z = z2;
        d(sSLContextImpl, z);
        this.D = a441Var;
        this.E = s421Var;
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, boolean z, String str, int i) throws IOException {
        this(sSLContextImpl, z);
        this.A = str;
        connect(str != null ? new InetSocketAddress(str, i) : new InetSocketAddress(InetAddress.getByName(null), i), 0);
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, boolean z, String str, int i, InetAddress inetAddress, int i2) throws IOException {
        this(sSLContextImpl, z);
        this.A = str;
        bind(new InetSocketAddress(inetAddress, i2));
        connect(str != null ? new InetSocketAddress(str, i) : new InetSocketAddress(InetAddress.getByName(null), i), 0);
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, boolean z, InetAddress inetAddress, int i) throws IOException {
        this(sSLContextImpl, z);
        connect(new InetSocketAddress(inetAddress, i), 0);
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, boolean z, InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        this(sSLContextImpl, z);
        bind(new InetSocketAddress(inetAddress2, i2));
        connect(new InetSocketAddress(inetAddress, i), 0);
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, boolean z, Socket socket) throws IOException {
        super(socket);
        this.z = true;
        or61 or61Var = or61.w;
        this.F = true;
        this.M = new Object();
        if (!socket.isConnected()) {
            throw new SocketException("Underlying socket is not connected");
        }
        d(sSLContextImpl, z);
        k();
    }
}
