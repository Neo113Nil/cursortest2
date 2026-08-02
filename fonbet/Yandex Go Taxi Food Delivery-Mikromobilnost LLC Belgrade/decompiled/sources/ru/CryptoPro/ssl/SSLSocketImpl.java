package ru.CryptoPro.ssl;

import defpackage.dy31;
import defpackage.ny61;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.AlgorithmConstraints;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;
import javax.crypto.BadPaddingException;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SNIMatcher;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.ssl.util.Utilities;

/* loaded from: classes4.dex */
public final class SSLSocketImpl extends cl_6 {
    public byte A;
    public boolean B;
    public boolean C;
    public String D;
    public final boolean E;
    public AccessControlContext F;
    public cl_14 G;
    public String H;
    public AlgorithmConstraints I;
    public List J;
    public Collection K;
    public boolean L;
    public boolean M;
    public String[] N;
    public String O;
    public BiFunction P;
    public final Object Q;
    public final ReentrantLock R;
    public final Object S;
    public cl_69 T;
    public cl_80 U;
    public cl_80 V;
    public cl_7 W;
    public cl_7 Z;
    public cl_5 a0;
    public cl_5 b0;
    public boolean c0;
    public byte[] d0;
    public byte[] e0;
    public SSLContextImpl f0;
    public cl_63 g0;
    public SSLSessionImpl h0;
    public volatile SSLSessionImpl i0;
    public HashMap j0;
    public InputStream k0;
    public OutputStream l0;
    public cl_3 m0;
    public cl_4 n0;
    public cl_83 o0;
    public cl_84 p0;
    public boolean q0;
    public final ByteArrayOutputStream r0;
    public boolean s0;
    public volatile int w;
    public boolean x;
    public boolean y;
    public SSLException z;

    static {
        GetProperty.getBooleanProperty("jdk.tls.trustNameService", false);
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, String str, int i, InetAddress inetAddress, int i2) {
        this.C = true;
        this.E = true;
        this.H = null;
        this.I = null;
        List list = Collections.EMPTY_LIST;
        this.J = list;
        this.K = list;
        this.L = false;
        this.M = false;
        this.N = new String[0];
        this.O = null;
        this.Q = new Object();
        this.R = new ReentrantLock();
        this.S = new Object();
        this.p0 = cl_84.C;
        this.q0 = true;
        this.r0 = null;
        this.s0 = false;
        this.D = str;
        this.J = Utilities.addToSNIServerNameList(this.J, str);
        n(sSLContextImpl, false);
        bind(new InetSocketAddress(inetAddress, i2));
        connect(str != null ? new InetSocketAddress(str, i) : new InetSocketAddress(InetAddress.getByName(null), i), 0);
    }

    public static String n0() {
        return Thread.currentThread().getName();
    }

    public final void B(boolean z) {
        SSLLogger.fine(n0() + ", waiting for close_notify or alert: state " + a0());
        while (true) {
            try {
                int a0 = a0();
                if (a0 == 6 || a0 == 4 || a0 == 7) {
                    break;
                }
                if (this.T == null) {
                    this.T = new cl_69();
                }
                try {
                    o(this.T, true);
                } catch (SocketTimeoutException e) {
                    SSLLogger.warning(n0() + ", received exception", e);
                    e((byte) -1, e, "Did not receive close_notify from peer");
                    throw null;
                }
            } catch (IOException e2) {
                SSLLogger.warning(n0() + ", exception while waiting for close", e2);
                if (z) {
                    throw e2;
                }
                return;
            }
        }
        this.T = null;
    }

    public final void D() {
        if (this.B) {
            synchronized (this.f0.c) {
                SSLSessionContextImpl.e++;
            }
        }
        this.k0 = super.getInputStream();
        this.l0 = super.getOutputStream();
        b0();
    }

    public final void G(cl_69 cl_69Var) {
        String str;
        byte read = (byte) cl_69Var.read();
        byte read2 = (byte) cl_69Var.read();
        if (read2 == -1) {
            d(Alerts.alert_illegal_parameter, "Short alert message");
            throw null;
        }
        if (SSLLogger.isFineEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(n0());
            stringBuffer.append(", RECV ");
            stringBuffer.append(this.p0);
            stringBuffer.append(" ALERT:  ");
            if (read == 2) {
                str = "fatal, ";
            } else if (read == 1) {
                str = "warning, ";
            } else {
                stringBuffer.append("<level ");
                stringBuffer.append(read & 255);
                str = ">, ";
            }
            stringBuffer.append(str);
            SSLLogger.fine(stringBuffer.toString() + " description = " + Alerts.alertDescription(read2));
        }
        if (read != 1) {
            String str2 = "Received fatal alert: " + Alerts.alertDescription(read2);
            if (this.z == null) {
                this.z = Alerts.getSSLException(read2, str2);
            }
            d((byte) 10, str2);
            throw null;
        }
        if (read2 == 0) {
            if (this.w != 1) {
                T(false);
                return;
            } else {
                d((byte) 10, "Received close_notify during handshake");
                throw null;
            }
        }
        cl_63 cl_63Var = this.g0;
        if (cl_63Var != null) {
            cl_63Var.d(read2);
        }
    }

    public final void I(cl_82 cl_82Var) {
        boolean o = cl_82Var.o(this.V);
        cl_82Var.e(this.Z);
        if (o) {
            this.b0.a();
        }
        cl_82Var.c(this.l0, this.r0);
        if (this.w < 4) {
            v(this.V);
        }
        if (this.q0 && cl_82Var.w == 23) {
            this.q0 = false;
        }
    }

    public final void P(boolean z) {
        SSLLogger.fine(n0(), ", called closeSocket(selfInitiated)");
        if (this.B) {
            this.f0.c.c();
        }
        if (this.a == this || this.E) {
            super.close();
        } else if (z) {
            B(false);
        }
    }

    public final void R() {
        ReentrantLock reentrantLock = this.R;
        reentrantLock.lock();
        try {
            if (this.p0.n <= cl_84.x.n) {
                this.Z.getClass();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void T(boolean z) {
        SSLLogger.fine(n0() + ", called closeInternal(" + z + Extension.C_BRAKE);
        int a0 = a0();
        boolean z2 = false;
        Object obj = null;
        try {
            if (a0 == 0) {
                P(z);
            } else if (a0 == 4) {
                SSLLogger.fine(n0(), "called closeSocket()");
                if (this.B) {
                    this.f0.c.c();
                }
                super.close();
            } else if (a0 != 6 && a0 != 7) {
                synchronized (this) {
                    try {
                        int a02 = a0();
                        if (a02 == 6 || a02 == 4 || a02 == 7) {
                            synchronized (this) {
                                this.w = this.w == 7 ? 7 : 6;
                                notifyAll();
                            }
                            return;
                        }
                        if (a02 != 5) {
                            try {
                                a((byte) 1, (byte) 0);
                                this.w = 5;
                            } catch (Throwable th) {
                                this.w = 4;
                                try {
                                    P(z);
                                    z2 = true;
                                    obj = th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        }
                        if (a02 == 5) {
                            SSLLogger.fine(n0() + ", close invoked again; state = " + a0());
                            if (!z) {
                                synchronized (this) {
                                    this.w = this.w == 7 ? 7 : 6;
                                    notifyAll();
                                }
                                if (z2) {
                                    g0();
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
                                SSLLogger.fine(n0() + ", after primary close; state = " + a0());
                                synchronized (this) {
                                    this.w = this.w == 7 ? 7 : 6;
                                    notifyAll();
                                }
                                if (z2) {
                                    g0();
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
                        }
                        if (this.B) {
                            this.f0.c.c();
                        }
                        if (!z2) {
                            try {
                                P(z);
                                z2 = true;
                            } catch (Throwable th3) {
                                th = th3;
                                z2 = true;
                                synchronized (this) {
                                    this.w = this.w == 7 ? 7 : 6;
                                    notifyAll();
                                    if (z2) {
                                        g0();
                                    }
                                    if (obj != null) {
                                        if (obj instanceof Error) {
                                            throw ((Error) obj);
                                        }
                                        if (obj instanceof RuntimeException) {
                                            throw ((RuntimeException) obj);
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
            synchronized (this) {
                this.w = this.w == 7 ? 7 : 6;
                notifyAll();
            }
            if (z2) {
                g0();
            }
            if (obj != null) {
                if (obj instanceof Error) {
                    throw ((Error) obj);
                }
                if (obj instanceof RuntimeException) {
                    throw ((RuntimeException) obj);
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final boolean U() {
        int a0 = a0();
        if (a0 == 0) {
            throw new SocketException("Socket is not connected");
        }
        if (a0 == 1 || a0 == 2 || a0 == 3 || a0 == 5) {
            return false;
        }
        if (a0 == 7) {
            throw new SocketException("Socket is closed");
        }
        if (this.z == null) {
            return true;
        }
        SSLException sSLException = new SSLException("Connection has been shutdown: " + this.z);
        sSLException.initCause(this.z);
        throw sSLException;
    }

    public final void W() {
        if (U() || a0() == 5) {
            throw new SocketException("Connection closed by remote host");
        }
    }

    public final void Z() {
        if (this.w != 1 && this.w != 3) {
            dy31.m("State error, change cipher specs");
            return;
        }
        cl_7 cl_7Var = this.Z;
        try {
            cl_5 cl_5Var = new cl_5();
            this.b0 = cl_5Var;
            this.V = this.g0.u(cl_5Var);
            this.Z = this.g0.q(this.b0);
            cl_7Var.d();
            this.q0 = true;
        } catch (GeneralSecurityException e) {
            throw ((SSLException) new SSLException("Algorithm missing:  ").initCause(e));
        }
    }

    public final void a(byte b, byte b2) {
        String str;
        cl_63 cl_63Var;
        if (this.w >= 5) {
            return;
        }
        if (this.w != 1 || ((cl_63Var = this.g0) != null && cl_63Var.E())) {
            cl_82 cl_82Var = new cl_82((byte) 21);
            cl_82Var.k(this.p0);
            if (SSLLogger.isFineEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(n0());
                stringBuffer.append(", SEND ");
                stringBuffer.append(this.p0);
                stringBuffer.append(" ALERT:  ");
                if (b == 2) {
                    str = "fatal, ";
                } else if (b == 1) {
                    str = "warning, ";
                } else {
                    stringBuffer.append("<level = ");
                    stringBuffer.append(b & 255);
                    str = ">, ";
                }
                stringBuffer.append(str);
                SSLLogger.fine(stringBuffer.toString() + " description = " + Alerts.alertDescription(b2));
            }
            cl_82Var.write(b);
            cl_82Var.write(b2);
            try {
                w(cl_82Var);
            } catch (IOException e) {
                SSLLogger.warning(n0() + ", exception sending alert", e);
            }
        }
    }

    public final synchronized int a0() {
        return this.w;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        try {
            if (handshakeCompletedListener == null) {
                throw new IllegalArgumentException("listener is null");
            }
            if (this.j0 == null) {
                this.j0 = new HashMap(4);
            }
            this.j0.put(handshakeCompletedListener, AccessController.getContext());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b0() {
        int i = this.w;
        if (i != 0) {
            if (i == 1) {
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    return;
                }
                ny61.r("Internal error");
                return;
            }
        }
        if (this.w == 0) {
            this.w = 1;
        } else {
            this.w = 3;
        }
        if (this.B) {
            SSLContextImpl sSLContextImpl = this.f0;
            cl_83 cl_83Var = this.o0;
            byte b = this.A;
            cl_99 cl_99Var = new cl_99(this, sSLContextImpl, cl_83Var, b != 0, false, this.p0, this.w == 1, this.c0, this.d0, this.e0);
            cl_99Var.k0 = null;
            cl_99Var.m0 = false;
            cl_99Var.h0 = b;
            this.g0 = cl_99Var;
            cl_99Var.q = this.K;
            cl_99Var.M = this.s0;
        } else {
            cl_16 cl_16Var = new cl_16(this, this.f0, this.o0, true, true, this.p0, this.w == 1, this.c0, this.d0, this.e0);
            cl_16Var.p0 = false;
            cl_16Var.q0 = Collections.EMPTY_LIST;
            cl_16Var.r0 = false;
            cl_16Var.s0 = null;
            this.g0 = cl_16Var;
            cl_16Var.p = this.J;
        }
        cl_63 cl_63Var = this.g0;
        cl_14 cl_14Var = this.G;
        cl_63Var.o = null;
        cl_63Var.n = null;
        cl_63Var.h = cl_14Var;
        cl_63Var.K = this.C;
        cl_63Var.r = this.N;
        cl_63Var.u = this.P;
    }

    @Override // ru.CryptoPro.ssl.cl_6, java.net.Socket
    public /* bridge */ /* synthetic */ void bind(SocketAddress socketAddress) throws IOException {
        super.bind(socketAddress);
    }

    public final synchronized void c(byte b, Exception exc) {
        e(b, exc, null);
        throw null;
    }

    @Override // ru.CryptoPro.ssl.cl_6, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SSLLogger.fine(n0(), "called close()");
        T(true);
        synchronized (this) {
            this.w = 7;
        }
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
        String str = this.D;
        if (str == null || str.length() == 0) {
            synchronized (this) {
                InetAddress inetAddress = getInetAddress();
                if (inetAddress != null) {
                    this.D = inetAddress.getHostName();
                }
            }
        }
        D();
    }

    public final synchronized void d(byte b, String str) {
        e(b, null, str);
        throw null;
    }

    public final synchronized void e(byte b, Throwable th, String str) {
        cl_69 cl_69Var;
        try {
            cl_3 cl_3Var = this.m0;
            if (cl_3Var != null && (cl_69Var = cl_3Var.b) != null) {
                cl_69Var.close();
            }
            this.h0.invalidate();
            if (this.i0 != null) {
                this.i0.invalidate();
            }
            int i = this.w;
            if (this.w < 4) {
                this.w = 4;
            }
            if (this.z == null) {
                if (i == 1) {
                    this.k0.skip(r1.available());
                }
                if (b != -1) {
                    a((byte) 2, b);
                }
                if (th instanceof SSLException) {
                    this.z = (SSLException) th;
                } else {
                    this.z = Alerts.getSSLException(b, th, str);
                }
            }
            SSLLogger.fine(n0(), "called closeSocket()");
            if (this.B) {
                this.f0.c.c();
            }
            super.close();
            if (this.w < 6) {
                this.w = i == 7 ? 7 : 6;
                this.W.d();
                this.Z.d();
            }
            throw this.z;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e0() {
        synchronized (this.Q) {
            try {
                if (a0() == 1) {
                    f0();
                    if (this.T == null) {
                        cl_69 cl_69Var = new cl_69();
                        this.T = cl_69Var;
                        cl_69 cl_69Var2 = this.m0.b;
                        cl_69Var.a = cl_69Var2.a;
                        cl_69Var.y = cl_69Var2.y;
                        cl_69Var.c = false;
                    }
                    o(this.T, false);
                    this.T = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        ru.CryptoPro.ssl.SSLLogger.info("Warning: Using insecure renegotiation");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f0() {
        try {
            int i = this.w;
            if (i == 0) {
                throw new SocketException("handshaking attempted on unconnected socket");
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new SocketException("connection is closed");
                    }
                    return;
                } else {
                    boolean z = this.c0;
                    if (!z && !cl_63.a0) {
                        throw new SSLHandshakeException("Insecure renegotiation is not allowed");
                    }
                    b0();
                }
            }
            if (!this.g0.D()) {
                int i2 = this.w;
                cl_63 cl_63Var = this.g0;
                if (i2 == 3) {
                    cl_63Var.r(this.p0);
                } else {
                    cl_63Var.r(null);
                }
                cl_63 cl_63Var2 = this.g0;
                if (cl_63Var2 instanceof cl_16) {
                    cl_63Var2.F();
                } else if (this.w != 1) {
                    this.g0.F();
                    this.g0.z.a();
                }
            }
        } finally {
        }
    }

    public final void g0() {
        synchronized (this.S) {
            this.W.d();
        }
        this.R.lock();
        try {
            this.Z.d();
        } finally {
            this.R.unlock();
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized String getApplicationProtocol() {
        return this.O;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized boolean getEnableSessionCreation() {
        return this.C;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized String[] getEnabledCipherSuites() {
        return this.G.a();
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized String[] getEnabledProtocols() {
        return this.o0.a();
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized String getHandshakeApplicationProtocol() {
        cl_63 cl_63Var = this.g0;
        if (cl_63Var == null || !cl_63Var.E()) {
            return null;
        }
        return this.g0.s;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized BiFunction getHandshakeApplicationProtocolSelector() {
        return this.P;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized SSLSession getHandshakeSession() {
        return this.i0;
    }

    @Override // ru.CryptoPro.ssl.cl_6, java.net.Socket
    public synchronized InputStream getInputStream() throws IOException {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (this.w == 0) {
            throw new SocketException("Socket is not connected");
        }
        return this.m0;
    }

    @Override // ru.CryptoPro.ssl.cl_6, java.net.Socket
    public /* bridge */ /* synthetic */ SocketAddress getLocalSocketAddress() {
        return super.getLocalSocketAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized boolean getNeedClientAuth() {
        return this.A == 2;
    }

    @Override // ru.CryptoPro.ssl.cl_6, java.net.Socket
    public synchronized OutputStream getOutputStream() throws IOException {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (this.w == 0) {
            throw new SocketException("Socket is not connected");
        }
        return this.n0;
    }

    @Override // ru.CryptoPro.ssl.cl_6, java.net.Socket
    public /* bridge */ /* synthetic */ SocketAddress getRemoteSocketAddress() {
        return super.getRemoteSocketAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized SSLParameters getSSLParameters() {
        SSLParameters sSLParameters;
        try {
            sSLParameters = super.getSSLParameters();
            sSLParameters.setEndpointIdentificationAlgorithm(this.H);
            sSLParameters.setAlgorithmConstraints(this.I);
            if (!this.K.isEmpty() || this.M) {
                sSLParameters.setSNIMatchers(this.K);
            } else {
                sSLParameters.setSNIMatchers(null);
            }
            if (!this.J.isEmpty() || this.L) {
                sSLParameters.setServerNames(this.J);
            } else {
                sSLParameters.setServerNames(null);
            }
            sSLParameters.setUseCipherSuitesOrder(this.s0);
            if (cl_68.b) {
                sSLParameters.setApplicationProtocols(this.N);
            }
        } catch (Throwable th) {
            throw th;
        }
        return sSLParameters;
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLSession getSession() {
        SSLSessionImpl sSLSessionImpl;
        if (a0() == 1) {
            try {
                W();
                try {
                    if (a0() == 1) {
                        e0();
                    } else {
                        f0();
                    }
                } catch (Exception e) {
                    k(e, false);
                    throw null;
                }
            } catch (IOException e2) {
                SSLLogger.fine(n0() + ", IOException in getSession()", (Throwable) e2);
            }
        }
        synchronized (this) {
            sSLSessionImpl = this.h0;
        }
        return sSLSessionImpl;
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedCipherSuites() {
        return this.f0.k().a();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedProtocols() {
        return this.f0.j().a();
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized boolean getUseClientMode() {
        return !this.B;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized boolean getWantClientAuth() {
        return this.A == 1;
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.w == 7;
    }

    public final synchronized void k(Exception exc, boolean z) {
        try {
            SSLLogger.warning(n0() + ", handling exception: " + exc.toString());
            if ((exc instanceof InterruptedIOException) && z) {
                throw ((IOException) exc);
            }
            SSLException sSLException = this.z;
            byte b = Alerts.alert_internal_error;
            if (sSLException != null) {
                if (!(exc instanceof IOException)) {
                    throw Alerts.getSSLException(Alerts.alert_internal_error, exc, "Unexpected exception");
                }
                throw ((IOException) exc);
            }
            boolean z2 = exc instanceof SSLException;
            if (!z2 && (exc instanceof IOException)) {
                try {
                    c((byte) 10, exc);
                    throw null;
                } catch (IOException unused) {
                    throw ((IOException) exc);
                }
            } else {
                if (z2) {
                    b = exc instanceof SSLHandshakeException ? Alerts.alert_handshake_failure : (byte) 10;
                }
                c(b, exc);
                throw null;
            }
        } finally {
        }
    }

    public final void k0() {
        if (this.w != 1 && this.w != 3) {
            dy31.m("State error, change cipher specs");
            return;
        }
        cl_7 cl_7Var = this.W;
        try {
            cl_5 cl_5Var = new cl_5();
            this.a0 = cl_5Var;
            this.U = this.g0.t(cl_5Var);
            this.W = this.g0.c(this.a0);
            cl_7Var.d();
        } catch (GeneralSecurityException e) {
            throw ((SSLException) new SSLException("Algorithm missing:  ").initCause(e));
        }
    }

    public final void n(SSLContextImpl sSLContextImpl, boolean z) {
        this.f0 = sSLContextImpl;
        this.h0 = SSLSessionImpl.B;
        this.i0 = null;
        this.B = z;
        this.w = 0;
        this.x = false;
        cl_7 cl_7Var = cl_7.i;
        this.W = cl_7Var;
        cl_80 cl_80Var = cl_80.h;
        this.U = cl_80Var;
        this.Z = cl_7Var;
        this.V = cl_80Var;
        this.b0 = new cl_5();
        this.a0 = new cl_5();
        this.c0 = false;
        this.d0 = new byte[0];
        this.e0 = new byte[0];
        this.G = this.f0.f(this.B);
        this.o0 = this.f0.d(this.B);
        this.T = null;
        this.F = AccessController.getContext();
        this.m0 = new cl_3(this);
        this.n0 = new cl_4(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0114, code lost:
    
        if (r10.w >= 4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
    
        r12 = r10.U;
        r11.a();
        v(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016d, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(cl_69 cl_69Var, boolean z) {
        synchronized (this.S) {
            while (true) {
                int a0 = a0();
                if (a0 != 6 && a0 != 4 && a0 != 7) {
                    boolean z2 = true;
                    try {
                        cl_69Var.x = false;
                        cl_69Var.k(this.k0, this.l0);
                        try {
                            cl_69Var.o(this.U, this.W, this.a0);
                            synchronized (this) {
                                try {
                                    switch (cl_69Var.a()) {
                                        case 20:
                                            if ((this.w == 1 || this.w == 3) && this.g0.L && !this.x) {
                                                if (cl_69Var.available() == 1 && cl_69Var.read() == 1) {
                                                    this.x = true;
                                                    k0();
                                                    this.y = true;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 21:
                                            G(cl_69Var);
                                            break;
                                        case 22:
                                            b0();
                                            if (!this.g0.D()) {
                                                int i = this.w;
                                                cl_63 cl_63Var = this.g0;
                                                if (i == 3) {
                                                    cl_63Var.r(this.p0);
                                                } else {
                                                    cl_63Var.r(null);
                                                }
                                            }
                                            this.g0.m(cl_69Var, this.y);
                                            this.y = false;
                                            this.g0.getClass();
                                            cl_63 cl_63Var2 = this.g0;
                                            if (cl_63Var2.C != 20) {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                this.c0 = cl_63Var2.c;
                                                this.d0 = cl_63Var2.d;
                                                this.e0 = cl_63Var2.e;
                                                this.O = cl_63Var2.s;
                                                this.h0 = cl_63Var2.G;
                                                this.i0 = null;
                                                this.g0 = null;
                                                this.w = 2;
                                                this.x = false;
                                                if (this.j0 != null) {
                                                    HandshakeCompletedEvent handshakeCompletedEvent = new HandshakeCompletedEvent(this, this.h0);
                                                    Set entrySet = this.j0.entrySet();
                                                    cl_96 cl_96Var = new cl_96("HandshakeCompletedNotify-Thread");
                                                    cl_96Var.a = new HashSet(entrySet);
                                                    cl_96Var.b = handshakeCompletedEvent;
                                                    cl_96Var.start();
                                                }
                                            }
                                            if (!z && this.w == 2) {
                                                break;
                                            }
                                            break;
                                        case 23:
                                            if (this.w != 2 && this.w != 3 && this.w != 5) {
                                                throw new SSLProtocolException("Data received in non-data state: " + this.w);
                                            }
                                            if (this.y) {
                                                throw new SSLProtocolException("Expecting finished message, received data");
                                            }
                                            if (!z) {
                                                throw new SSLException("Discarding app data");
                                            }
                                            cl_69Var.x = true;
                                            break;
                                        default:
                                            SSLLogger.fine(n0() + ", Received record type: " + ((int) cl_69Var.a()));
                                            break;
                                    }
                                } finally {
                                }
                            }
                        } catch (BadPaddingException e) {
                            e(cl_69Var.a() == 22 ? Alerts.alert_handshake_failure : (byte) 20, e, e.getMessage());
                            throw null;
                        }
                    } catch (EOFException e2) {
                        boolean z3 = a0() <= 1;
                        if (!cl_6.c && !z3) {
                            z2 = false;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(n0());
                        sb.append(", received EOFException: ");
                        sb.append(z2 ? "error" : "ignored");
                        SSLLogger.fine(sb.toString());
                        if (z2) {
                            Throwable sSLHandshakeException = z3 ? new SSLHandshakeException("Remote host closed connection during handshake") : new SSLProtocolException("Remote host closed connection incorrectly");
                            sSLHandshakeException.initCause(e2);
                            throw sSLHandshakeException;
                        }
                        T(false);
                    } catch (SSLProtocolException e3) {
                        try {
                            c((byte) 10, e3);
                            throw null;
                        } catch (IOException unused) {
                            throw e3;
                        }
                    }
                }
            }
            d((byte) 10, "Malformed change cipher spec msg");
            throw null;
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        HashMap hashMap = this.j0;
        if (hashMap == null) {
            throw new IllegalArgumentException("no listeners");
        }
        if (hashMap.remove(handshakeCompletedListener) == null) {
            throw new IllegalArgumentException("listener not registered");
        }
        if (this.j0.isEmpty()) {
            this.j0 = null;
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setEnableSessionCreation(boolean z) {
        this.C = z;
        cl_63 cl_63Var = this.g0;
        if (cl_63Var != null && !cl_63Var.D()) {
            this.g0.K = this.C;
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setEnabledCipherSuites(String[] strArr) {
        this.G = new cl_14(strArr);
        cl_63 cl_63Var = this.g0;
        if (cl_63Var != null && !cl_63Var.D()) {
            cl_63 cl_63Var2 = this.g0;
            cl_14 cl_14Var = this.G;
            cl_63Var2.o = null;
            cl_63Var2.n = null;
            cl_63Var2.h = cl_14Var;
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setEnabledProtocols(String[] strArr) {
        this.o0 = new cl_83(strArr);
        cl_63 cl_63Var = this.g0;
        if (cl_63Var != null && !cl_63Var.D()) {
            cl_63 cl_63Var2 = this.g0;
            cl_83 cl_83Var = this.o0;
            cl_63Var2.o = null;
            cl_63Var2.n = null;
            cl_63Var2.g = cl_83Var;
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setHandshakeApplicationProtocolSelector(BiFunction biFunction) {
        this.P = biFunction;
        cl_63 cl_63Var = this.g0;
        if (cl_63Var != null && !cl_63Var.D()) {
            this.g0.u = biFunction;
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setNeedClientAuth(boolean z) {
        this.A = z ? (byte) 2 : (byte) 0;
        cl_63 cl_63Var = this.g0;
        if (cl_63Var != null && (cl_63Var instanceof cl_99) && !cl_63Var.D()) {
            ((cl_99) this.g0).h0 = this.A;
        }
    }

    @Override // ru.CryptoPro.ssl.cl_6, java.net.Socket
    public /* bridge */ /* synthetic */ void setPerformancePreferences(int i, int i2, int i3) {
        super.setPerformancePreferences(i, i2, i3);
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setSSLParameters(SSLParameters sSLParameters) {
        try {
            super.setSSLParameters(sSLParameters);
            this.H = sSLParameters.getEndpointIdentificationAlgorithm();
            this.I = sSLParameters.getAlgorithmConstraints();
            this.s0 = sSLParameters.getUseCipherSuitesOrder();
            List<SNIServerName> serverNames = sSLParameters.getServerNames();
            if (serverNames != null) {
                this.L = serverNames.isEmpty();
                this.J = serverNames;
            }
            Collection<SNIMatcher> sNIMatchers = sSLParameters.getSNIMatchers();
            if (sNIMatchers != null) {
                this.M = sNIMatchers.isEmpty();
                this.K = sNIMatchers;
            }
            if (cl_68.b) {
                this.N = sSLParameters.getApplicationProtocols();
            }
            cl_63 cl_63Var = this.g0;
            if (cl_63Var != null && !cl_63Var.E()) {
                this.g0.getClass();
                cl_63 cl_63Var2 = this.g0;
                AlgorithmConstraints algorithmConstraints = this.I;
                cl_63Var2.o = null;
                cl_63Var2.n = null;
                cl_63Var2.i = new cl_90(algorithmConstraints);
                cl_63Var2.j = null;
                cl_63 cl_63Var3 = this.g0;
                cl_63Var3.r = this.N;
                if (this.B) {
                    cl_63Var3.q = this.K;
                    cl_63Var3.M = this.s0;
                } else {
                    cl_63Var3.p = this.J;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ru.CryptoPro.ssl.cl_6, java.net.Socket
    public void setSoTimeout(int i) throws SocketException {
        SSLLogger.fine(n0() + ", setSoTimeout(" + i + ") called.");
        super.setSoTimeout(i);
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setUseClientMode(boolean z) {
        try {
            int i = this.w;
            if (i == 0) {
                if (this.B != (!z) && this.f0.e(this.o0)) {
                    this.o0 = this.f0.d(!z);
                }
                this.B = !z;
            } else {
                if (i != 1 || this.g0.D()) {
                    SSLLogger.fine(n0() + ", setUseClientMode() invoked in state = " + this.w);
                    throw new IllegalArgumentException("Cannot change mode after SSL traffic has started");
                }
                if (this.B != (!z) && this.f0.e(this.o0)) {
                    this.o0 = this.f0.d(!z);
                }
                this.B = !z;
                this.w = 0;
                b0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setWantClientAuth(boolean z) {
        this.A = z ? (byte) 1 : (byte) 0;
        cl_63 cl_63Var = this.g0;
        if (cl_63Var != null && (cl_63Var instanceof cl_99) && !cl_63Var.D()) {
            ((cl_99) this.g0).h0 = this.A;
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public void startHandshake() throws IOException {
        W();
        try {
            if (a0() == 1) {
                e0();
            } else {
                f0();
            }
        } catch (Exception e) {
            k(e, true);
            throw null;
        }
    }

    @Override // ru.CryptoPro.ssl.cl_6, javax.net.ssl.SSLSocket, java.net.Socket
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(80);
        stringBuffer.append(Integer.toHexString(hashCode()));
        stringBuffer.append("[");
        stringBuffer.append(this.h0.getCipherSuite());
        stringBuffer.append(Extension.COLON_SPACE);
        stringBuffer.append(super.toString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public final void v(cl_80 cl_80Var) {
        if (this.w >= 4 || cl_80Var == cl_80.h || !cl_80Var.b()) {
            return;
        }
        SSLLogger.fine(n0(), "sequence number extremely close to overflow (2^64-1 packets). Closing connection.");
        d(Alerts.alert_handshake_failure, "sequence number overflow");
        throw null;
    }

    public final void w(cl_82 cl_82Var) {
        while (true) {
            if (cl_82Var.w == 23) {
                switch (a0()) {
                    case 1:
                        e0();
                    case 2:
                    case 3:
                        break;
                    case 4:
                        d((byte) 0, "error while writing to socket");
                        throw null;
                    case 5:
                    case 6:
                    case 7:
                        SSLException sSLException = this.z;
                        if (sSLException == null) {
                            throw new SocketException("Socket closed");
                        }
                        throw sSLException;
                    default:
                        dy31.m("State error, send app data");
                        return;
                }
            }
        }
        if (cl_82Var.w()) {
            return;
        }
        boolean n = cl_82Var.n();
        ReentrantLock reentrantLock = this.R;
        if (!n || getSoLinger() < 0) {
            reentrantLock.lock();
            try {
                I(cl_82Var);
                return;
            } finally {
            }
        }
        boolean interrupted = Thread.interrupted();
        try {
            if (reentrantLock.tryLock(getSoLinger(), TimeUnit.SECONDS)) {
                try {
                    I(cl_82Var);
                    reentrantLock.unlock();
                } finally {
                }
            } else {
                SSLException sSLException2 = new SSLException("SO_LINGER timeout, close_notify message cannot be sent.");
                if ((this.a != this) && !this.E) {
                    c((byte) -1, sSLException2);
                    throw null;
                }
                SSLLogger.fine(n0() + ", received exception {0}", (Throwable) sSLException2);
                this.h0.invalidate();
            }
        } catch (InterruptedException unused) {
            interrupted = true;
        }
        if (interrupted) {
            Thread.currentThread().interrupt();
        }
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, String str, int i) {
        this.C = true;
        this.E = true;
        this.H = null;
        this.I = null;
        List list = Collections.EMPTY_LIST;
        this.J = list;
        this.K = list;
        this.L = false;
        this.M = false;
        this.N = new String[0];
        this.O = null;
        this.Q = new Object();
        this.R = new ReentrantLock();
        this.S = new Object();
        this.p0 = cl_84.C;
        this.q0 = true;
        this.r0 = null;
        this.s0 = false;
        this.D = str;
        this.J = Utilities.addToSNIServerNameList(this.J, str);
        n(sSLContextImpl, false);
        connect(str != null ? new InetSocketAddress(str, i) : new InetSocketAddress(InetAddress.getByName(null), i), 0);
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl) {
        this.C = true;
        this.E = true;
        this.H = null;
        this.I = null;
        List list = Collections.EMPTY_LIST;
        this.J = list;
        this.K = list;
        this.L = false;
        this.M = false;
        this.N = new String[0];
        this.O = null;
        this.Q = new Object();
        this.R = new ReentrantLock();
        this.S = new Object();
        this.p0 = cl_84.C;
        this.q0 = true;
        this.r0 = null;
        this.s0 = false;
        n(sSLContextImpl, false);
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, InetAddress inetAddress, int i) {
        this.C = true;
        this.E = true;
        this.H = null;
        this.I = null;
        List list = Collections.EMPTY_LIST;
        this.J = list;
        this.K = list;
        this.L = false;
        this.M = false;
        this.N = new String[0];
        this.O = null;
        this.Q = new Object();
        this.R = new ReentrantLock();
        this.S = new Object();
        this.p0 = cl_84.C;
        this.q0 = true;
        this.r0 = null;
        this.s0 = false;
        n(sSLContextImpl, false);
        connect(new InetSocketAddress(inetAddress, i), 0);
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        this.C = true;
        this.E = true;
        this.H = null;
        this.I = null;
        List list = Collections.EMPTY_LIST;
        this.J = list;
        this.K = list;
        this.L = false;
        this.M = false;
        this.N = new String[0];
        this.O = null;
        this.Q = new Object();
        this.R = new ReentrantLock();
        this.S = new Object();
        this.p0 = cl_84.C;
        this.q0 = true;
        this.r0 = null;
        this.s0 = false;
        n(sSLContextImpl, false);
        bind(new InetSocketAddress(inetAddress2, i2));
        connect(new InetSocketAddress(inetAddress, i), 0);
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, Socket socket, InputStream inputStream, boolean z) {
        super(socket, inputStream);
        this.C = true;
        this.E = true;
        this.H = null;
        this.I = null;
        List list = Collections.EMPTY_LIST;
        this.J = list;
        this.K = list;
        this.L = false;
        this.M = false;
        this.N = new String[0];
        this.O = null;
        this.Q = new Object();
        this.R = new ReentrantLock();
        this.S = new Object();
        this.p0 = cl_84.C;
        this.q0 = true;
        this.r0 = null;
        this.s0 = false;
        if (!socket.isConnected()) {
            throw new SocketException("Underlying socket is not connected");
        }
        n(sSLContextImpl, true);
        this.E = z;
        D();
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, Socket socket, String str, boolean z) {
        super(socket);
        this.C = true;
        this.E = true;
        this.H = null;
        this.I = null;
        List list = Collections.EMPTY_LIST;
        this.J = list;
        this.K = list;
        this.L = false;
        this.M = false;
        this.N = new String[0];
        this.O = null;
        this.Q = new Object();
        this.R = new ReentrantLock();
        this.S = new Object();
        this.p0 = cl_84.C;
        this.q0 = true;
        this.r0 = null;
        this.s0 = false;
        if (!socket.isConnected()) {
            throw new SocketException("Underlying socket is not connected");
        }
        this.D = str;
        this.J = Utilities.addToSNIServerNameList(this.J, str);
        n(sSLContextImpl, false);
        this.E = z;
        D();
    }

    public SSLSocketImpl(SSLContextImpl sSLContextImpl, boolean z, cl_14 cl_14Var, byte b, boolean z2, cl_83 cl_83Var, String str, AlgorithmConstraints algorithmConstraints, Collection collection, boolean z3, String[] strArr) {
        this.C = true;
        this.E = true;
        this.H = null;
        this.I = null;
        List list = Collections.EMPTY_LIST;
        this.J = list;
        this.K = list;
        this.L = false;
        this.M = false;
        this.N = new String[0];
        this.O = null;
        this.Q = new Object();
        this.R = new ReentrantLock();
        this.S = new Object();
        this.p0 = cl_84.C;
        this.q0 = true;
        this.r0 = null;
        this.A = b;
        this.C = z2;
        this.H = str;
        this.I = algorithmConstraints;
        this.K = collection;
        this.s0 = z3;
        this.N = strArr;
        n(sSLContextImpl, z);
        this.G = cl_14Var;
        this.o0 = cl_83Var;
    }
}
