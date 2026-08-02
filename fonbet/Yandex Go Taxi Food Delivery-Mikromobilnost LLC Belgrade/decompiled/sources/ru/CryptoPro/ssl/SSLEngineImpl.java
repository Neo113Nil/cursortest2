package ru.CryptoPro.ssl;

import defpackage.dy31;
import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.AlgorithmConstraints;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import javax.crypto.BadPaddingException;
import javax.net.ssl.SNIMatcher;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.ssl.util.Utilities;

/* loaded from: classes4.dex */
public final class SSLEngineImpl extends SSLEngine {
    public static final byte clauth_none = 0;
    public static final byte clauth_requested = 1;
    public static final byte clauth_required = 2;
    public cl_83 A;
    public cl_84 B;
    public cl_80 C;
    public cl_80 D;
    public cl_7 E;
    public cl_7 F;
    public cl_5 G;
    public cl_5 H;
    public boolean I;
    public byte[] J;
    public byte[] K;
    public Object L;
    public Object M;
    public Object N;
    public boolean O;
    public boolean P;
    public int a;
    public boolean b;
    public cl_31 c;
    public SSLContextImpl d;
    public cl_63 e;
    public SSLSessionImpl f;
    public volatile SSLSessionImpl g;
    public boolean h;
    public boolean i;
    public boolean j;
    public SSLException k;
    public byte l;
    public boolean m;
    public cl_29 n;
    public cl_30 o;
    public AccessControlContext p;
    public cl_14 q;
    public String r;
    public AlgorithmConstraints s;
    public List t;
    public Collection u;
    public String[] v;
    public String w;
    public BiFunction x;
    public boolean y;
    public boolean z;

    public SSLEngineImpl(SSLContextImpl sSLContextImpl) {
        this.b = false;
        this.m = true;
        this.r = null;
        this.s = null;
        List list = Collections.EMPTY_LIST;
        this.t = list;
        this.u = list;
        this.v = new String[0];
        this.w = null;
        this.y = false;
        this.B = cl_84.C;
        this.O = true;
        this.P = false;
        h(sSLContextImpl, true);
    }

    public static void g(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2, boolean z) {
        String str;
        if (byteBuffer != null && byteBufferArr != null) {
            if (i < 0 || i2 < 0 || i > byteBufferArr.length - i2) {
                ny61.s();
                return;
            }
            if (z && byteBuffer.isReadOnly()) {
                throw new ReadOnlyBufferException();
            }
            for (int i3 = i; i3 < i + i2; i3++) {
                ByteBuffer byteBuffer2 = byteBufferArr[i3];
                if (byteBuffer2 == null) {
                    str = oyr.j(i3, "appData[", "] == null");
                } else {
                    if (!z && byteBuffer2.isReadOnly()) {
                        throw new ReadOnlyBufferException();
                    }
                }
            }
            return;
        }
        str = "src/dst is null";
        ny61.g(str);
    }

    public static String t() {
        return Thread.currentThread().getName();
    }

    public final SSLEngineResult.HandshakeStatus a(SSLEngineResult.HandshakeStatus handshakeStatus) {
        boolean z;
        SSLEngineResult.HandshakeStatus handshakeStatus2;
        if (handshakeStatus != null) {
            return handshakeStatus;
        }
        synchronized (this) {
            try {
                cl_31 cl_31Var = this.c;
                synchronized (cl_31Var) {
                    try {
                        z = cl_31Var.a.size() != 0;
                    } finally {
                    }
                }
                if (z) {
                    handshakeStatus2 = SSLEngineResult.HandshakeStatus.NEED_WRAP;
                } else {
                    cl_63 cl_63Var = this.e;
                    if (cl_63Var != null) {
                        if (cl_63Var.U != null) {
                            handshakeStatus2 = SSLEngineResult.HandshakeStatus.NEED_TASK;
                        }
                    } else {
                        handshakeStatus2 = (this.a != 6 || isInboundDone()) ? SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING : SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return handshakeStatus2;
    }

    public final SSLEngineResult.HandshakeStatus b(cl_30 cl_30Var, EngineArgs engineArgs) {
        SSLEngineResult.HandshakeStatus handshakeStatus;
        cl_30 cl_30Var2;
        EngineArgs engineArgs2;
        cl_31 cl_31Var = this.c;
        cl_80 cl_80Var = this.D;
        cl_7 cl_7Var = this.F;
        cl_5 cl_5Var = this.H;
        synchronized (cl_31Var) {
            handshakeStatus = null;
            if (cl_31Var.a.size() != 0) {
                ByteBuffer byteBuffer = engineArgs.netData;
                LinkedList linkedList = cl_31Var.a;
                byteBuffer.put((ByteBuffer) linkedList.removeFirst());
                if (cl_31Var.a.size() != 0) {
                    Object first = linkedList.getFirst();
                    handshakeStatus = SSLEngineResult.HandshakeStatus.FINISHED;
                    if (first == handshakeStatus) {
                        linkedList.removeFirst();
                    } else {
                        handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_WRAP;
                    }
                }
                cl_31.a(engineArgs, true);
                cl_30Var2 = cl_30Var;
                engineArgs2 = engineArgs;
            } else {
                if (cl_31Var.b) {
                    throw new IOException("The write side was already closed");
                }
                cl_30Var.getClass();
                if (cl_80Var != cl_80.h && engineArgs.getAppRemaining() != 0) {
                    SSLEngineImpl sSLEngineImpl = cl_30Var.B;
                    cl_84 cl_84Var = cl_30Var.x;
                    sSLEngineImpl.getClass();
                    if (cl_84Var.n <= cl_84.x.n) {
                        cl_7Var.getClass();
                    }
                    int min = Math.min(engineArgs.getAppRemaining(), 16384);
                    if (min > 0) {
                        cl_30Var2 = cl_30Var;
                        engineArgs2 = engineArgs;
                        cl_30Var2.D(engineArgs2, cl_80Var, cl_7Var, cl_5Var, min);
                        cl_31.a(engineArgs2, false);
                    }
                }
                cl_30Var2 = cl_30Var;
                engineArgs2 = engineArgs;
                cl_31.a(engineArgs2, false);
            }
        }
        SSLEngineResult.HandshakeStatus a = a(handshakeStatus);
        if (this.a < 4 && !isOutboundDone() && a == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            cl_80 cl_80Var2 = this.D;
            byte b = cl_30Var2.w;
            j(cl_80Var2);
        }
        if (this.O && engineArgs2.deltaApp() > 0) {
            this.O = false;
        }
        return a;
    }

    @Override // javax.net.ssl.SSLEngine
    public void beginHandshake() throws SSLException {
        try {
            p();
        } catch (Exception e) {
            f(Alerts.alert_handshake_failure, e, "Couldn't kickstart handshaking");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SSLEngineResult c(EngineArgs engineArgs) {
        SSLEngineResult.HandshakeStatus a;
        synchronized (this) {
            cl_63 cl_63Var = this.e;
            if (cl_63Var != null) {
                cl_63Var.a();
            }
        }
        if (isInboundDone()) {
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, a(null), 0, 0);
        }
        synchronized (this) {
            try {
                int i = this.a;
                if (i != 1 && i != 0) {
                    a = null;
                    if (a == null) {
                        a = a(null);
                    }
                    if (a != SSLEngineResult.HandshakeStatus.NEED_TASK) {
                        return new SSLEngineResult(SSLEngineResult.Status.OK, a, 0, 0);
                    }
                    int I = this.n.I(engineArgs.netData);
                    if (I > this.f.getPacketBufferSize()) {
                        if (I > 33305) {
                            throw new SSLProtocolException(oyr.i(I, "Input SSL/TLS record too big: max = 33305 len = "));
                        }
                        SSLSessionImpl sSLSessionImpl = this.f;
                        synchronized (sSLSessionImpl) {
                            sSLSessionImpl.A = true;
                        }
                    }
                    if (I - 5 > engineArgs.getAppRemaining()) {
                        return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, a, 0, 0);
                    }
                    if (I == -1 || engineArgs.netData.remaining() < I) {
                        return new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, a, 0, 0);
                    }
                    try {
                        return new SSLEngineResult(isInboundDone() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK, a(k(engineArgs)), engineArgs.deltaNet(), engineArgs.deltaApp());
                    } catch (SSLException e) {
                        throw e;
                    } catch (IOException e2) {
                        SSLException sSLException = new SSLException("readRecord");
                        sSLException.initCause(e2);
                        throw sSLException;
                    }
                }
                p();
                a = a(null);
                if (a == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                    return new SSLEngineResult(SSLEngineResult.Status.OK, a, 0, 0);
                }
                if (a == null) {
                }
                if (a != SSLEngineResult.HandshakeStatus.NEED_TASK) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void closeInbound() throws SSLException {
        try {
            SSLLogger.fine(t() + " called closeInbound()");
            if (this.a != 0 && !this.j) {
                this.j = true;
                e(Alerts.alert_internal_error, "Inbound closed before receiving peer's close_notify: possible truncation attack?");
                throw null;
            }
            r();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void closeOutbound() {
        SSLLogger.fine(t() + " called closeOutbound()");
        q();
    }

    public final void d(byte b, byte b2) {
        String str;
        cl_63 cl_63Var;
        int i = this.a;
        if (i >= 6) {
            return;
        }
        if (i != 1 || ((cl_63Var = this.e) != null && cl_63Var.E())) {
            cl_30 cl_30Var = new cl_30((byte) 21, this);
            cl_30Var.k(this.B);
            if (SSLLogger.isFineEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(t());
                stringBuffer.append(", SEND ");
                stringBuffer.append(this.B);
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
            cl_30Var.write(b);
            cl_30Var.write(b2);
            try {
                i(cl_30Var);
            } catch (IOException e) {
                SSLLogger.warning(t() + ":: exception sending alert", e);
            }
        }
    }

    public final synchronized void e(byte b, String str) {
        f(b, null, str);
        throw null;
    }

    public final synchronized void f(byte b, Throwable th, String str) {
        if (str == null) {
            str = "General SSLEngine problem";
        }
        if (th == null) {
            try {
                th = Alerts.getSSLException(b, th, str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.k != null) {
            SSLLogger.fatal(t(), "fatal: engine already closed.  Rethrowing ");
            SSLLogger.fatal(th.toString());
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof SSLException) {
                throw ((SSLException) th);
            }
            if (th instanceof Exception) {
                SSLException sSLException = new SSLException("fatal SSLEngine condition");
                sSLException.initCause(th);
                throw sSLException;
            }
        }
        SSLLogger.fatal(t() + ", fatal error: " + ((int) b) + Extension.COLON_SPACE + str, th);
        int i = this.a;
        this.a = 4;
        this.b = true;
        this.f.invalidate();
        if (this.g != null) {
            this.g.invalidate();
        }
        if (i != 0) {
            d((byte) 2, b);
        }
        this.k = th instanceof SSLException ? (SSLException) th : Alerts.getSSLException(b, th, str);
        cl_31 cl_31Var = this.c;
        synchronized (cl_31Var) {
            cl_31Var.b = true;
        }
        this.a = 6;
        this.E.d();
        this.F.d();
        if (!(th instanceof RuntimeException)) {
            throw this.k;
        }
        throw ((RuntimeException) th);
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized String getApplicationProtocol() {
        return this.w;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized Runnable getDelegatedTask() {
        cl_63 cl_63Var = this.e;
        cl_65 cl_65Var = null;
        if (cl_63Var == null) {
            return null;
        }
        if (!cl_63Var.T) {
            cl_63Var.T = true;
            cl_65Var = cl_63Var.U;
        }
        return cl_65Var;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized boolean getEnableSessionCreation() {
        return this.m;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized String[] getEnabledCipherSuites() {
        return this.q.a();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized String[] getEnabledProtocols() {
        return this.A.a();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized String getHandshakeApplicationProtocol() {
        cl_63 cl_63Var = this.e;
        if (cl_63Var == null || !cl_63Var.E()) {
            return null;
        }
        return this.e.s;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized BiFunction getHandshakeApplicationProtocolSelector() {
        return this.x;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized SSLSession getHandshakeSession() {
        return this.g;
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        return a(null);
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized boolean getNeedClientAuth() {
        return this.l == 2;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized SSLParameters getSSLParameters() {
        SSLParameters sSLParameters;
        sSLParameters = super.getSSLParameters();
        sSLParameters.setEndpointIdentificationAlgorithm(this.r);
        sSLParameters.setAlgorithmConstraints(this.s);
        sSLParameters.setSNIMatchers(this.u);
        sSLParameters.setServerNames(this.t);
        sSLParameters.setUseCipherSuitesOrder(this.P);
        if (cl_68.b) {
            sSLParameters.setApplicationProtocols(this.v);
        }
        return sSLParameters;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized SSLSession getSession() {
        return this.f;
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedCipherSuites() {
        return this.d.k().a();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedProtocols() {
        return this.d.j().a();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized boolean getUseClientMode() {
        return !this.z;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized boolean getWantClientAuth() {
        return this.l == 1;
    }

    public final void h(SSLContextImpl sSLContextImpl, boolean z) {
        SSLLogger.fine("Using SSLEngineImpl, is server: " + z);
        this.d = sSLContextImpl;
        this.f = SSLSessionImpl.B;
        this.g = null;
        this.z = true;
        this.a = 0;
        this.h = false;
        this.t = Utilities.addToSNIServerNameList(this.t, getPeerHost());
        cl_7 cl_7Var = cl_7.i;
        this.E = cl_7Var;
        cl_80 cl_80Var = cl_80.h;
        this.C = cl_80Var;
        this.F = cl_7Var;
        this.D = cl_80Var;
        this.H = new cl_5();
        this.G = new cl_5();
        this.I = false;
        this.J = new byte[0];
        this.K = new byte[0];
        this.q = this.d.f(this.z);
        this.A = this.d.d(this.z);
        this.L = new Object();
        this.M = new Object();
        this.N = new Object();
        this.p = AccessController.getContext();
        this.o = new cl_30((byte) 23, this);
        cl_29 cl_29Var = new cl_29();
        cl_29Var.C = this;
        this.n = cl_29Var;
        cl_29Var.c = false;
        cl_31 cl_31Var = new cl_31();
        cl_31Var.b = false;
        cl_31Var.a = new LinkedList();
        this.c = cl_31Var;
    }

    public final void i(cl_30 cl_30Var) {
        cl_31 cl_31Var = this.c;
        cl_80 cl_80Var = this.D;
        cl_7 cl_7Var = this.F;
        cl_5 cl_5Var = this.H;
        synchronized (cl_31Var) {
            if (cl_31Var.b) {
                throw new IOException("writer side was already closed.");
            }
            switch (cl_30Var.w) {
                case 20:
                case 21:
                case 22:
                    if (!cl_30Var.w()) {
                        boolean o = cl_30Var.o(cl_80Var);
                        cl_30Var.e(cl_7Var);
                        if (o) {
                            cl_5Var.a();
                        }
                        cl_30Var.c(null, null);
                    }
                    if (cl_30Var.D) {
                        cl_31Var.a.addLast(SSLEngineResult.HandshakeStatus.FINISHED);
                    }
                    break;
                default:
                    throw new RuntimeException("unexpected byte buffers");
            }
        }
        if (this.a >= 4 || isOutboundDone()) {
            return;
        }
        j(this.D);
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized boolean isInboundDone() {
        return this.b;
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean isOutboundDone() {
        return this.c.b();
    }

    public final void j(cl_80 cl_80Var) {
        if (this.a >= 4 || cl_80Var == cl_80.h || !cl_80Var.b()) {
            return;
        }
        SSLLogger.fine(t(), "sequence number extremely close to overflow (2^64-1 packets). Closing connection.");
        e(Alerts.alert_handshake_failure, "sequence number overflow");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0138 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:16:0x0025, B:17:0x002e, B:18:0x0031, B:19:0x0130, B:21:0x0138, B:23:0x013e, B:25:0x0142, B:26:0x014c, B:29:0x0057, B:35:0x0061, B:36:0x0074, B:37:0x0075, B:39:0x0079, B:41:0x007d, B:42:0x0086, B:43:0x008d, B:44:0x008e, B:46:0x0099, B:49:0x009f, B:50:0x00a5, B:51:0x00a8, B:55:0x00c4, B:56:0x00dc, B:61:0x00e7, B:63:0x00ea, B:64:0x00ee, B:71:0x00f7, B:72:0x00fa, B:76:0x0102, B:79:0x0105, B:80:0x0109, B:83:0x0154, B:84:0x0165, B:85:0x010f, B:87:0x0115, B:89:0x0119, B:91:0x0121, B:93:0x0129, B:94:0x014e, B:95:0x0153, B:58:0x00dd), top: B:15:0x0025, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SSLEngineResult.HandshakeStatus k(EngineArgs engineArgs) {
        int i;
        SSLEngineResult.HandshakeStatus a;
        synchronized (this) {
            i = this.a;
        }
        SSLEngineResult.HandshakeStatus handshakeStatus = null;
        if (i == 4) {
            return null;
        }
        try {
            try {
                ByteBuffer P = this.n.P(this.C, this.E, this.G, this.n.R(engineArgs.netData));
                synchronized (this) {
                    try {
                        switch (this.n.a()) {
                            case 20:
                                int i2 = this.a;
                                if ((i2 != 1 && i2 != 3) || !this.e.L || this.h) {
                                    e((byte) 10, "illegal change cipher spec msg, conn state = " + this.a);
                                    throw null;
                                }
                                if (this.n.available() != 1 || this.n.read() != 1) {
                                    e((byte) 10, "Malformed change cipher spec msg");
                                    throw null;
                                }
                                this.h = true;
                                o();
                                this.i = true;
                                a = a(handshakeStatus);
                                if (this.a < 4 && !isInboundDone() && a == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
                                    cl_80 cl_80Var = this.C;
                                    this.n.a();
                                    j(cl_80Var);
                                }
                                break;
                                break;
                            case 21:
                                s();
                                a = a(handshakeStatus);
                                if (this.a < 4) {
                                    cl_80 cl_80Var2 = this.C;
                                    this.n.a();
                                    j(cl_80Var2);
                                    break;
                                }
                                break;
                            case 22:
                                n();
                                if (!this.e.D()) {
                                    int i3 = this.a;
                                    cl_63 cl_63Var = this.e;
                                    if (i3 == 3) {
                                        cl_63Var.r(this.B);
                                    } else {
                                        cl_63Var.r(null);
                                    }
                                }
                                this.e.m(this.n, this.i);
                                this.i = false;
                                this.e.getClass();
                                cl_63 cl_63Var2 = this.e;
                                if (cl_63Var2.C == 20) {
                                    this.I = cl_63Var2.c;
                                    this.J = cl_63Var2.d;
                                    this.K = cl_63Var2.e;
                                    this.w = cl_63Var2.s;
                                    this.f = cl_63Var2.G;
                                    this.g = null;
                                    cl_31 cl_31Var = this.c;
                                    synchronized (cl_31Var) {
                                        try {
                                            r10 = cl_31Var.a.size() != 0;
                                        } finally {
                                        }
                                    }
                                    SSLEngineResult.HandshakeStatus handshakeStatus2 = !r10 ? SSLEngineResult.HandshakeStatus.FINISHED : null;
                                    this.e = null;
                                    this.a = 2;
                                    this.h = false;
                                    handshakeStatus = handshakeStatus2;
                                } else {
                                    if (cl_63Var2.U == null) {
                                        r10 = false;
                                    }
                                    if (r10) {
                                        handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_TASK;
                                    }
                                }
                                a = a(handshakeStatus);
                                if (this.a < 4) {
                                }
                                break;
                            case 23:
                                int i4 = this.a;
                                if (i4 != 2 && i4 != 3 && i4 != 6) {
                                    throw new SSLProtocolException("Data received in non-data state: " + this.a);
                                }
                                if (!this.i) {
                                    if (!this.b) {
                                        engineArgs.scatter(P.slice());
                                    }
                                    a = a(handshakeStatus);
                                    if (this.a < 4) {
                                    }
                                    break;
                                } else {
                                    throw new SSLProtocolException("Expecting finished message, received data");
                                }
                            default:
                                SSLLogger.finer(t() + ", Received record type: " + ((int) this.n.a()));
                                a = a(handshakeStatus);
                                if (this.a < 4) {
                                }
                                break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return a;
            } catch (BadPaddingException e) {
                f(this.n.a() == 22 ? Alerts.alert_handshake_failure : (byte) 20, e, e.getMessage());
                throw null;
            }
        } catch (IOException e2) {
            synchronized (this) {
                f((byte) 10, e2, null);
                throw null;
            }
        }
    }

    public final void l() {
        int i = this.a;
        if (i != 1 && i != 3) {
            dy31.m("State error, change cipher specs");
            return;
        }
        cl_7 cl_7Var = this.F;
        try {
            cl_5 cl_5Var = new cl_5();
            this.H = cl_5Var;
            this.D = this.e.u(cl_5Var);
            this.F = this.e.q(this.H);
            cl_7Var.d();
            this.O = true;
        } catch (GeneralSecurityException e) {
            throw ((SSLException) new SSLException("Algorithm missing:  ").initCause(e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SSLEngineResult m(EngineArgs engineArgs) {
        SSLEngineResult.HandshakeStatus a;
        SSLEngineResult.HandshakeStatus b;
        synchronized (this) {
            cl_63 cl_63Var = this.e;
            if (cl_63Var != null) {
                cl_63Var.a();
            }
        }
        if (this.c.b()) {
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, a(null), 0, 0);
        }
        synchronized (this) {
            try {
                int i = this.a;
                if (i != 1 && i != 0) {
                    a = null;
                    if (a == null) {
                        a = a(null);
                    }
                    if (a != SSLEngineResult.HandshakeStatus.NEED_TASK) {
                        return new SSLEngineResult(SSLEngineResult.Status.OK, a, 0, 0);
                    }
                    try {
                        synchronized (this.N) {
                            b = b(this.o, engineArgs);
                        }
                        return new SSLEngineResult(isOutboundDone() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK, a(b), engineArgs.deltaApp(), engineArgs.deltaNet());
                    } catch (SSLException e) {
                        throw e;
                    } catch (IOException e2) {
                        SSLException sSLException = new SSLException("Write problems");
                        sSLException.initCause(e2);
                        throw sSLException;
                    }
                }
                p();
                a = a(null);
                if (a == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                    return new SSLEngineResult(SSLEngineResult.Status.OK, a, 0, 0);
                }
                if (a == null) {
                }
                if (a != SSLEngineResult.HandshakeStatus.NEED_TASK) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        int i = this.a;
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
        if (i == 0) {
            this.a = 1;
        } else {
            this.a = 3;
        }
        if (this.z) {
            try {
                this.m = cl_112.b(this.d);
                SSLContextImpl sSLContextImpl = this.d;
                cl_83 cl_83Var = this.A;
                byte b = this.l;
                cl_99 cl_99Var = new cl_99(this, sSLContextImpl, cl_83Var, b != 0, false, this.B, this.a == 1, this.I, this.J, this.K);
                cl_99Var.k0 = null;
                cl_99Var.m0 = false;
                cl_99Var.h0 = b;
                this.e = cl_99Var;
                cl_99Var.q = this.u;
                cl_99Var.M = this.P;
            } catch (IOException e) {
                ny61.j(e);
                return;
            }
        } else {
            cl_16 cl_16Var = new cl_16(this, this.d, this.A, true, true, this.B, this.a == 1, this.I, this.J, this.K);
            cl_16Var.p0 = false;
            cl_16Var.q0 = Collections.EMPTY_LIST;
            cl_16Var.r0 = false;
            cl_16Var.s0 = null;
            this.e = cl_16Var;
            cl_16Var.p = this.t;
        }
        cl_63 cl_63Var = this.e;
        cl_14 cl_14Var = this.q;
        cl_63Var.o = null;
        cl_63Var.n = null;
        cl_63Var.h = cl_14Var;
        cl_63Var.K = this.m;
        cl_63Var.r = this.v;
        cl_63Var.t = this.x;
    }

    public final void o() {
        int i = this.a;
        if (i != 1 && i != 3) {
            dy31.m("State error, change cipher specs");
            return;
        }
        cl_7 cl_7Var = this.E;
        try {
            cl_5 cl_5Var = new cl_5();
            this.G = cl_5Var;
            this.C = this.e.t(cl_5Var);
            this.E = this.e.c(this.G);
            cl_7Var.d();
        } catch (GeneralSecurityException e) {
            throw ((SSLException) new SSLException("Algorithm missing:  ").initCause(e));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        ru.CryptoPro.ssl.SSLLogger.info("Warning: Using insecure renegotiation");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:3:0x0001, B:13:0x0010, B:14:0x0017, B:15:0x001a, B:17:0x001e, B:20:0x0023, B:21:0x002a, B:23:0x002d, B:24:0x0032, B:25:0x003b, B:27:0x0043, B:30:0x0049, B:31:0x0053, B:33:0x0059, B:34:0x005d, B:37:0x0062, B:38:0x004f, B:41:0x0036, B:44:0x006e, B:45:0x0075), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void p() {
        try {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new SSLException("SSLEngine is closing/closed");
                        }
                        return;
                    } else {
                        boolean z = this.I;
                        if (!z && !cl_63.a0) {
                            throw new SSLHandshakeException("Insecure renegotiation is not allowed");
                        }
                    }
                }
                if (!this.e.D()) {
                    int i2 = this.a;
                    cl_63 cl_63Var = this.e;
                    if (i2 == 3) {
                        cl_63Var.r(this.B);
                    } else {
                        cl_63Var.r(null);
                    }
                    cl_63 cl_63Var2 = this.e;
                    if (cl_63Var2 instanceof cl_16) {
                        cl_63Var2.F();
                    } else if (this.a != 1) {
                        cl_63Var2.F();
                        this.e.z.a();
                    }
                }
            }
            if (!this.y) {
                throw new IllegalStateException("Client/Server mode not yet set.");
            }
            n();
            if (!this.e.D()) {
            }
        } finally {
        }
    }

    public final void q() {
        SSLLogger.fine(t() + " closeOutboundInternal()");
        if (this.c.b()) {
            return;
        }
        int i = this.a;
        if (i == 0) {
            cl_31 cl_31Var = this.c;
            synchronized (cl_31Var) {
                cl_31Var.b = true;
            }
            this.b = true;
        } else if (i != 4 && i != 6) {
            d((byte) 1, (byte) 0);
            cl_31 cl_31Var2 = this.c;
            synchronized (cl_31Var2) {
                cl_31Var2.b = true;
            }
        }
        this.F.d();
        this.a = 6;
    }

    public final void r() {
        SSLLogger.fine(t() + " closeInboundInternal()");
        if (this.b) {
            return;
        }
        q();
        this.b = true;
        this.E.d();
        this.a = 6;
    }

    public final void s() {
        String str;
        byte read = (byte) this.n.read();
        byte read2 = (byte) this.n.read();
        if (read2 == -1) {
            e(Alerts.alert_illegal_parameter, "Short alert message");
            throw null;
        }
        if (SSLLogger.isFineEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(t());
            stringBuffer.append(", RECV ");
            stringBuffer.append(this.B);
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
            if (this.k == null) {
                this.k = Alerts.getSSLException(read2, str2);
            }
            e((byte) 10, str2);
            throw null;
        }
        if (read2 != 0) {
            cl_63 cl_63Var = this.e;
            if (cl_63Var != null) {
                cl_63Var.d(read2);
                return;
            }
            return;
        }
        if (this.a == 1) {
            e((byte) 10, "Received close_notify during handshake");
            throw null;
        }
        this.j = true;
        r();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setEnableSessionCreation(boolean z) {
        this.m = z;
        cl_63 cl_63Var = this.e;
        if (cl_63Var != null && !cl_63Var.D()) {
            this.e.K = this.m;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setEnabledCipherSuites(String[] strArr) {
        this.q = new cl_14(strArr);
        cl_63 cl_63Var = this.e;
        if (cl_63Var != null && !cl_63Var.D()) {
            cl_63 cl_63Var2 = this.e;
            cl_14 cl_14Var = this.q;
            cl_63Var2.o = null;
            cl_63Var2.n = null;
            cl_63Var2.h = cl_14Var;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setEnabledProtocols(String[] strArr) {
        this.A = new cl_83(strArr);
        cl_63 cl_63Var = this.e;
        if (cl_63Var != null && !cl_63Var.D()) {
            cl_63 cl_63Var2 = this.e;
            cl_83 cl_83Var = this.A;
            cl_63Var2.o = null;
            cl_63Var2.n = null;
            cl_63Var2.g = cl_83Var;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setHandshakeApplicationProtocolSelector(BiFunction biFunction) {
        this.x = biFunction;
        cl_63 cl_63Var = this.e;
        if (cl_63Var != null && !cl_63Var.D()) {
            this.e.t = biFunction;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setNeedClientAuth(boolean z) {
        this.l = z ? (byte) 2 : (byte) 0;
        cl_63 cl_63Var = this.e;
        if (cl_63Var != null && (cl_63Var instanceof cl_99) && !cl_63Var.D()) {
            ((cl_99) this.e).h0 = this.l;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setSSLParameters(SSLParameters sSLParameters) {
        try {
            super.setSSLParameters(sSLParameters);
            this.r = sSLParameters.getEndpointIdentificationAlgorithm();
            this.s = sSLParameters.getAlgorithmConstraints();
            this.P = sSLParameters.getUseCipherSuitesOrder();
            List<SNIServerName> serverNames = sSLParameters.getServerNames();
            if (serverNames != null) {
                this.t = serverNames;
            }
            Collection<SNIMatcher> sNIMatchers = sSLParameters.getSNIMatchers();
            if (sNIMatchers != null) {
                this.u = sNIMatchers;
            }
            if (cl_68.b) {
                this.v = sSLParameters.getApplicationProtocols();
            }
            cl_63 cl_63Var = this.e;
            if (cl_63Var != null && !cl_63Var.E()) {
                this.e.getClass();
                cl_63 cl_63Var2 = this.e;
                AlgorithmConstraints algorithmConstraints = this.s;
                cl_63Var2.o = null;
                cl_63Var2.n = null;
                cl_63Var2.i = new cl_90(algorithmConstraints);
                cl_63Var2.j = null;
                cl_63 cl_63Var3 = this.e;
                cl_63Var3.r = this.v;
                if (this.z) {
                    cl_63Var3.q = this.u;
                    cl_63Var3.M = this.P;
                } else {
                    cl_63Var3.p = this.t;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setUseClientMode(boolean z) {
        try {
            int i = this.a;
            if (i == 0) {
                boolean z2 = !z;
                if (this.z != z2 && this.d.e(this.A)) {
                    this.A = this.d.d(z2);
                }
                this.z = z2;
                if (!z) {
                    try {
                        cl_112.a(this.d);
                    } catch (SSLException e) {
                        RuntimeException runtimeException = new RuntimeException("License control failed");
                        runtimeException.initCause(e);
                        throw runtimeException;
                    }
                }
                this.y = true;
            } else {
                if (i != 1 || this.e.D()) {
                    SSLLogger.fine(t() + ", setUseClientMode() invoked in state = " + this.a);
                    throw new IllegalArgumentException("Cannot change mode after SSL traffic has started");
                }
                boolean z3 = !z;
                if (this.z != z3 && this.d.e(this.A)) {
                    this.A = this.d.d(z3);
                }
                this.z = z3;
                if (!z) {
                    try {
                        cl_112.a(this.d);
                    } catch (SSLException e2) {
                        RuntimeException runtimeException2 = new RuntimeException("License control failed");
                        runtimeException2.initCause(e2);
                        throw runtimeException2;
                    }
                }
                this.a = 0;
                n();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setWantClientAuth(boolean z) {
        this.l = z ? (byte) 1 : (byte) 0;
        cl_63 cl_63Var = this.e;
        if (cl_63Var != null && (cl_63Var instanceof cl_99) && !cl_63Var.D()) {
            ((cl_99) this.e).h0 = this.l;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append(Integer.toHexString(hashCode()));
        sb.append("[SSLEngine[hostname=");
        String peerHost = getPeerHost();
        if (peerHost == null) {
            peerHost = "null";
        }
        sb.append(peerHost);
        sb.append(" port=");
        sb.append(Integer.toString(getPeerPort()));
        sb.append(" role=".concat(this.z ? "Server" : "Client"));
        sb.append("] ");
        sb.append(getSession().getCipherSuite());
        sb.append("]");
        return sb.toString();
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) throws SSLException {
        SSLEngineResult c;
        g(byteBuffer, byteBufferArr, i, i2, false);
        EngineArgs engineArgs = new EngineArgs(byteBuffer, byteBufferArr, i, i2);
        try {
            try {
                synchronized (this.M) {
                    c = c(engineArgs);
                }
                return c;
            } catch (SSLProtocolException e) {
                f((byte) 10, e, e.getMessage());
                throw null;
            } catch (Exception e2) {
                f(Alerts.alert_internal_error, e2, "problem unwrapping net record");
                throw null;
            }
        } finally {
            engineArgs.resetLim();
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) throws SSLException {
        SSLEngineResult m;
        g(byteBuffer, byteBufferArr, i, i2, true);
        EngineArgs engineArgs = new EngineArgs(byteBufferArr, i, i2, byteBuffer);
        try {
            if (byteBuffer.remaining() < 16921) {
                return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, a(null), 0, 0);
            }
            try {
                synchronized (this.L) {
                    m = m(engineArgs);
                }
                return m;
            } catch (SSLProtocolException e) {
                engineArgs.resetPos();
                f((byte) 10, e, e.getMessage());
                throw null;
            } catch (Exception e2) {
                engineArgs.resetPos();
                f(Alerts.alert_internal_error, e2, "problem wrapping app data");
                throw null;
            }
        } finally {
            engineArgs.resetLim();
        }
    }

    public SSLEngineImpl(SSLContextImpl sSLContextImpl, String str, int i) {
        super(str, i);
        this.b = false;
        this.m = true;
        this.r = null;
        this.s = null;
        List list = Collections.EMPTY_LIST;
        this.t = list;
        this.u = list;
        this.v = new String[0];
        this.w = null;
        this.y = false;
        this.B = cl_84.C;
        this.O = true;
        this.P = false;
        h(sSLContextImpl, false);
    }
}
