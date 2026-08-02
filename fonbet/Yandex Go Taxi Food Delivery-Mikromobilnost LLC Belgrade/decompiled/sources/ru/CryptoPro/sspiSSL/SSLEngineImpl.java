package ru.CryptoPro.sspiSSL;

import defpackage.a441;
import defpackage.au61;
import defpackage.g8e;
import defpackage.mu61;
import defpackage.ny61;
import defpackage.or61;
import defpackage.oyr;
import defpackage.s421;
import defpackage.vt61;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.JCSP.MSCAPI.Sspi;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.ByteBufferInputStream;
import ru.CryptoPro.ssl.EngineArgs;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.ssl.cl_88;

/* loaded from: classes4.dex */
public class SSLEngineImpl extends SSLEngine {
    public static final int E = 64 | 128;
    public static final int F = 256 | 512;
    public static final int G = 1024 | 2048;
    public static final int H = 4096 | 8192;
    public mu61 A;
    public vt61 B;
    public boolean C;
    public boolean D;
    public int a;
    public Object b;
    public Object c;
    public boolean d;
    public SSLContextImpl e;
    public final ReentrantLock f;
    public final long[] g;
    public int h;
    public boolean i;
    public SSLSessionImpl j;
    public SSLSocketImpl k;
    public byte l;
    public boolean m;
    public X509Certificate[] n;
    public X509Certificate[] o;
    public PrivateKey p;
    public X500Principal[] q;
    public boolean r;
    public boolean s;
    public LinkedList t;
    public s421 u;
    public a441 v;
    public or61 w;
    public BiFunction x;
    public final byte[] y;
    public final byte[] z;

    public SSLEngineImpl(SSLContextImpl sSLContextImpl, boolean z) {
        this.f = new ReentrantLock();
        this.g = new long[2];
        this.h = 0;
        this.i = false;
        this.k = null;
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = false;
        this.s = true;
        this.w = or61.D;
        this.y = new byte[cl_88.o];
        this.z = new byte[cl_88.o];
        this.A = null;
        this.B = null;
        this.C = false;
        this.D = false;
        this.d = z;
        k(sSLContextImpl);
    }

    public static int b(or61 or61Var) {
        int i = or61.z.a;
        int i2 = or61Var.a;
        int i3 = i <= i2 ? E : 0;
        if (or61.A.a <= i2) {
            i3 |= F;
        }
        if (or61.B.a <= i2) {
            i3 |= G;
        }
        return or61.C.a <= i2 ? H | i3 : i3;
    }

    public static int c(ByteBufferInputStream byteBufferInputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            int read = byteBufferInputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                if (i2 > 0) {
                    break;
                }
                return read;
            }
            if (SSLLogger.isAllEnabled()) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, i2, read);
                SSLLogger.dump("[Raw read]: length = ", Integer.valueOf(wrap.remaining()), wrap);
            }
            i2 += read;
        }
        return i2;
    }

    public static void h(or61 or61Var, boolean z) {
        int i = or61Var.a;
        if (i < or61.E.a || (or61Var.b & 255) > (or61.F.b & 255)) {
            if (z && i == or61.x.a) {
                return;
            }
            throw new SSLException("Unsupported record version " + or61Var);
        }
    }

    public static void j(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2, boolean z) {
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

    public final void A() {
        if (this.r) {
            return;
        }
        X509Certificate[] x509CertificateArr = this.o;
        if (x509CertificateArr == null) {
            i(new CertificateException("Empty client certificate chain"));
            throw null;
        }
        String str = this.j.d.b;
        X509TrustManager x509TrustManager = this.e.m;
        try {
            if (!(x509TrustManager instanceof X509ExtendedTrustManager)) {
                throw new CertificateException("Improper X509TrustManager implementation");
            }
            ((X509ExtendedTrustManager) x509TrustManager).checkClientTrusted((X509Certificate[]) x509CertificateArr.clone(), str, this);
            this.r = true;
        } catch (CertificateException e) {
            i(e);
            throw null;
        }
    }

    public final void B() {
        String str;
        ArrayList arrayList = new ArrayList();
        u();
        try {
            try {
                Sspi.getIssuers(this.g, arrayList);
                v();
                if (arrayList.isEmpty()) {
                    str = "Issuers list is empty";
                } else {
                    StringBuffer stringBuffer = new StringBuffer("Certificate issuers list: (count: ");
                    stringBuffer.append(arrayList.size());
                    stringBuffer.append(")\n");
                    this.q = new X500Principal[arrayList.size()];
                    for (int i = 0; i < arrayList.size(); i++) {
                        this.q[i] = new X500Principal((byte[]) arrayList.get(i));
                        stringBuffer.append("   \n");
                        stringBuffer.append(this.q[i].toString());
                    }
                    str = stringBuffer.toString();
                }
                SSLLogger.fine(str);
            } catch (MSException e) {
                throw new SSLException(e);
            }
        } catch (Throwable th) {
            v();
            throw th;
        }
    }

    public final void C() {
        SSLSessionImpl sSLSessionImpl;
        SSLSessionImpl sSLSessionImpl2;
        SSLLogger.fine(Thread.currentThread().getName() + " closeInboundInternal()");
        if (this.C) {
            return;
        }
        D();
        this.C = true;
        x();
        if (this.d && (sSLSessionImpl = this.j) != (sSLSessionImpl2 = SSLSessionImpl.r)) {
            sSLSessionImpl.invalidate();
            this.j = sSLSessionImpl2;
        }
        g(6);
        SSLSocketImpl sSLSocketImpl = this.k;
        if (sSLSocketImpl != null) {
            sSLSocketImpl.a(6);
        }
    }

    public final void D() {
        SSLLogger.fine(Thread.currentThread().getName() + " closeOutboundInternal()");
        if (isOutboundDone()) {
            return;
        }
        int E2 = E();
        if (E2 == 0) {
            this.D = true;
            this.C = true;
        } else if (E2 != 4 && E2 != 6) {
            q(true);
            this.D = true;
        }
        g(6);
        SSLSocketImpl sSLSocketImpl = this.k;
        if (sSLSocketImpl != null) {
            sSLSocketImpl.a(6);
        }
    }

    public final synchronized int E() {
        return this.a;
    }

    public final int a(int i, boolean z, byte[] bArr, byte[] bArr2) {
        X509Certificate[] x509CertificateArr;
        int i2 = i;
        ReentrantLock reentrantLock = this.f;
        byte[] bArr3 = this.z;
        byte[] bArr4 = this.y;
        n(z);
        try {
            if (this.k == null) {
                return 0;
            }
            try {
                reentrantLock.lock();
                Array.clear(bArr4);
                if (z && i2 != 0 && this.w == or61.C) {
                    Array.copy(bArr, 0, bArr4, 0, i2);
                } else {
                    i2 = 0;
                }
                boolean z2 = false;
                boolean z3 = false;
                long j = 590610;
                while (true) {
                    if (j != 590610 && j != -2146893032) {
                        if (j != 0) {
                            throw new SSLException("Error due client handshake 0x" + Integer.toHexString((int) j));
                        }
                        SSLLogger.fine("Handshake was successful");
                        t(false);
                        r(false);
                        s(false);
                        if (!this.j.n) {
                            y();
                        }
                        this.j.b(this.o);
                        z();
                        if (i2 != 0 && z) {
                            Array.copy(bArr4, 0, bArr2, 0, i2);
                        }
                        g(2);
                        this.k.a(2);
                        this.k.o();
                        reentrantLock.unlock();
                        return i2;
                    }
                    if (z2) {
                        int read = this.k.getSockInput().read(bArr4, i2, 16921 - i2);
                        if (read < 0) {
                            throw new SSLException("Unexpected end of communication or no connectivity to server");
                        }
                        i2 += read;
                        z2 = false;
                    }
                    int[] iArr = {i2};
                    if (SSLLogger.isAllEnabled() && i2 != 0) {
                        SSLLogger.dump("Server send: length = ", Integer.valueOf(i2), ByteBuffer.wrap(bArr4, 0, i2));
                    }
                    Array.clear(bArr3);
                    int[] iArr2 = {bArr3.length};
                    u();
                    try {
                        long initializeSecurityContext = Sspi.initializeSecurityContext(w(), this.g, p(), false, z3, this.y, iArr, this.z, iArr2);
                        v();
                        if (initializeSecurityContext == 590610 || initializeSecurityContext == 0) {
                            if (iArr2[0] != 0) {
                                if (SSLLogger.isAllEnabled()) {
                                    SSLLogger.dump("Client send: length = ", Integer.valueOf(iArr2[0]), ByteBuffer.wrap(bArr3, 0, iArr2[0]));
                                }
                                this.k.getSockOutput().write(bArr3, 0, iArr2[0]);
                                this.k.getSockOutput().flush();
                            }
                            i2 = iArr[0];
                            if (t(true) && r(true) && !this.j.n) {
                                y();
                            }
                            s(true);
                            SSLSessionImpl sSLSessionImpl = this.j;
                            if (sSLSessionImpl.n && (x509CertificateArr = this.o) != null) {
                                sSLSessionImpl.b(x509CertificateArr);
                                z();
                            }
                        }
                        if (initializeSecurityContext == -2146893032) {
                            j = initializeSecurityContext;
                            z2 = true;
                        } else if (initializeSecurityContext == 590624) {
                            B();
                            l(false);
                            z2 = false;
                            j = 590610;
                            z3 = true;
                        } else {
                            j = initializeSecurityContext;
                        }
                    } catch (Throwable th) {
                        v();
                        throw th;
                    }
                }
            } catch (Exception e) {
                try {
                    i(e);
                    throw null;
                } catch (Throwable th2) {
                    this.j = SSLSessionImpl.r;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public void beginHandshake() throws SSLException {
        if (E() == 0) {
            g(1);
            SSLSocketImpl sSLSocketImpl = this.k;
            if (sSLSocketImpl != null) {
                sSLSocketImpl.a(1);
            }
            boolean z = this.d;
            SSLSocketImpl sSLSocketImpl2 = this.k;
            if (z) {
                if (sSLSocketImpl2 != null) {
                    d(null, false);
                    return;
                } else {
                    x();
                    this.j = new SSLSessionImpl();
                    return;
                }
            }
            if (sSLSocketImpl2 != null) {
                a(0, false, null, null);
            } else {
                n(false);
                doHandshakeStep(null, 0);
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeInbound() throws SSLException {
        SSLLogger.fine(Thread.currentThread().getName() + " called closeInbound()");
        C();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void closeOutbound() {
        SSLLogger.fine(Thread.currentThread().getName() + " called closeOutbound()");
        D();
    }

    public final int d(byte[] bArr, boolean z) {
        long j;
        X509Certificate[] x509CertificateArr;
        byte[] bArr2 = this.z;
        byte[] bArr3 = this.y;
        if (z) {
            try {
                g(3);
                SSLSocketImpl sSLSocketImpl = this.k;
                if (sSLSocketImpl != null) {
                    sSLSocketImpl.a(3);
                }
            } catch (Exception e) {
                try {
                    i(e);
                    throw null;
                } catch (Throwable th) {
                    this.j = SSLSessionImpl.r;
                    throw th;
                }
            }
        }
        Array.clear(bArr3);
        x();
        this.j = new SSLSessionImpl();
        long j2 = 590610;
        long j3 = 590610;
        boolean z2 = true;
        int i = 0;
        while (true) {
            if (j3 != j2 && j3 != -2146893032) {
                if (j3 != 0) {
                    throw new SSLException("Error due server handshake 0x" + Integer.toHexString((int) j3));
                }
                SSLLogger.fine("Handshake was successful");
                t(false);
                r(false);
                s(!getNeedClientAuth());
                if (!this.j.n) {
                    y();
                }
                if (getNeedClientAuth()) {
                    this.j.b(this.o);
                    A();
                }
                if (i != 0) {
                    Array.copy(bArr3, 0, bArr, 0, i);
                }
                g(2);
                this.k.a(2);
                this.k.o();
                return i;
            }
            if (z2) {
                int read = this.k.getSockInput().read(bArr3, i, 16921 - i);
                if (read < 0) {
                    throw new SSLException("Unexpected end of communication or no connectivity to server");
                }
                i += read;
                z2 = false;
            }
            int[] iArr = {i};
            if (!SSLLogger.isAllEnabled() || i == 0) {
                j = j2;
            } else {
                j = j2;
                SSLLogger.dump("Client send: length = ", Integer.valueOf(i), ByteBuffer.wrap(bArr3, 0, i));
            }
            Array.clear(bArr2);
            int[] iArr2 = {bArr2.length};
            u();
            try {
                long acceptSecurityContext = Sspi.acceptSecurityContext(this.e.e(), this.g, getNeedClientAuth(), false, this.y, iArr, this.z, iArr2);
                v();
                if (acceptSecurityContext == j || acceptSecurityContext == 0) {
                    if (iArr2[0] != 0) {
                        if (SSLLogger.isAllEnabled()) {
                            SSLLogger.dump("Server send: length = ", Integer.valueOf(iArr2[0]), ByteBuffer.wrap(bArr2, 0, iArr2[0]));
                        }
                        this.k.getSockOutput().write(bArr2, 0, iArr2[0]);
                        this.k.getSockOutput().flush();
                    }
                    int i2 = iArr[0];
                    if (t(true) && r(true) && !this.j.n) {
                        y();
                    }
                    s(true);
                    SSLSessionImpl sSLSessionImpl = this.j;
                    if (sSLSessionImpl.n && (x509CertificateArr = this.o) != null) {
                        sSLSessionImpl.b(x509CertificateArr);
                        A();
                    }
                    i = i2;
                }
                if (acceptSecurityContext == -2146893032) {
                    j3 = acceptSecurityContext;
                    z2 = true;
                } else if (acceptSecurityContext == 590624) {
                    z2 = false;
                    j2 = j;
                    j3 = j2;
                } else {
                    j3 = acceptSecurityContext;
                }
                j2 = j;
            } catch (Throwable th2) {
                v();
                throw th2;
            }
        }
    }

    public int doHandshakeStep(byte[] bArr, int i) throws SSLException {
        byte[] bArr2;
        long j;
        long j2;
        X509Certificate[] x509CertificateArr;
        long j3;
        X509Certificate[] x509CertificateArr2;
        int i2 = i;
        boolean z = this.d;
        byte[] bArr3 = this.z;
        if (!z) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                loop0: while (true) {
                    j3 = 590610;
                    do {
                        if (j3 != 590610) {
                            break loop0;
                        }
                        int[] iArr = {i2};
                        Array.clear(bArr3);
                        int[] iArr2 = {bArr3.length};
                        u();
                        try {
                            j3 = Sspi.initializeSecurityContext(w(), this.g, p(), false, false, bArr, iArr, this.z, iArr2);
                            v();
                            i2 = iArr[0];
                            if (iArr2[0] != 0) {
                                if (SSLLogger.isAllEnabled()) {
                                    SSLLogger.dump("Server send: length = ", Integer.valueOf(iArr2[0]), ByteBuffer.wrap(bArr3, 0, iArr2[0]));
                                }
                                byteArrayOutputStream.write(bArr3, 0, iArr2[0]);
                            }
                            if (t(true) && r(true) && !this.j.n) {
                                y();
                            }
                            s(true);
                            SSLSessionImpl sSLSessionImpl = this.j;
                            if (sSLSessionImpl.n && (x509CertificateArr2 = this.o) != null) {
                                sSLSessionImpl.b(x509CertificateArr2);
                                z();
                            }
                            if (j3 == -2146893032) {
                                j3 = 590610;
                                break loop0;
                            }
                        } finally {
                        }
                    } while (j3 != 590624);
                    B();
                    l(false);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                if (j3 != 590610 && j3 != 0) {
                    throw new SSLException("Error due client handshake step 0x" + Integer.toHexString((int) j3));
                }
                if (byteArray.length != 0) {
                    this.t.addLast(ByteBuffer.allocate(byteArray.length).put(byteArray).flip());
                }
                if (j3 == 0) {
                    SSLLogger.fine("Handshake was successful");
                    t(false);
                    r(false);
                    s(false);
                    if (!this.j.n) {
                        y();
                    }
                    this.j.b(this.o);
                    z();
                    g(2);
                    this.t.addLast(SSLEngineResult.HandshakeStatus.FINISHED);
                }
                return i2;
            } catch (Exception e) {
                try {
                    i(e);
                    throw null;
                } finally {
                }
            }
        }
        try {
            if (!SSLLogger.isAllEnabled() || i2 == 0) {
                bArr2 = bArr;
                j = 590624;
                j2 = -2146893032;
            } else {
                j = 590624;
                bArr2 = bArr;
                j2 = -2146893032;
                SSLLogger.dump("Client send: length = ", Integer.valueOf(i2), ByteBuffer.wrap(bArr2, 0, i2));
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            long j4 = 590610;
            while (j4 == 590610) {
                int[] iArr3 = {i2};
                Array.clear(bArr3);
                int[] iArr4 = {bArr3.length};
                u();
                try {
                    j4 = Sspi.acceptSecurityContext(this.e.e(), this.g, getNeedClientAuth(), false, bArr2, iArr3, this.z, iArr4);
                    v();
                    i2 = iArr3[0];
                    if (j4 == 590610 || j4 == 0) {
                        if (iArr4[0] != 0) {
                            if (SSLLogger.isAllEnabled()) {
                                SSLLogger.dump("Server send: length = ", Integer.valueOf(iArr4[0]), ByteBuffer.wrap(bArr3, 0, iArr4[0]));
                            }
                            byteArrayOutputStream2.write(bArr3, 0, iArr4[0]);
                        }
                        if (t(true) && r(true) && !this.j.n) {
                            y();
                        }
                        s(true);
                        SSLSessionImpl sSLSessionImpl2 = this.j;
                        if (sSLSessionImpl2.n && (x509CertificateArr = this.o) != null) {
                            sSLSessionImpl2.b(x509CertificateArr);
                            A();
                        }
                    }
                    if (j4 != j2 && j4 != j) {
                        bArr2 = bArr;
                    }
                    j4 = 590610;
                    break;
                } finally {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            byteArrayOutputStream2.close();
            if (j4 != 590610 && j4 != 0) {
                throw new SSLException("Error due server handshake step 0x" + Integer.toHexString((int) j4));
            }
            if (byteArray2.length != 0) {
                this.t.addLast(ByteBuffer.allocate(byteArray2.length).put(byteArray2).flip());
            }
            if (j4 == 0) {
                SSLLogger.fine("Handshake was successful");
                t(false);
                r(false);
                s(!getNeedClientAuth());
                if (!this.j.n) {
                    y();
                }
                if (getNeedClientAuth()) {
                    this.j.b(this.o);
                    A();
                }
                g(2);
                this.t.addLast(SSLEngineResult.HandshakeStatus.FINISHED);
            }
            return i2;
        } catch (Exception e2) {
            try {
                i(e2);
                throw null;
            } finally {
            }
        }
    }

    public final SSLEngineResult.HandshakeStatus e(SSLEngineResult.HandshakeStatus handshakeStatus) {
        boolean z;
        SSLEngineResult.HandshakeStatus handshakeStatus2;
        if (handshakeStatus != null) {
            return handshakeStatus;
        }
        synchronized (this) {
            try {
                synchronized (this) {
                    try {
                        z = this.t.size() != 0;
                    } finally {
                    }
                }
                return handshakeStatus2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            handshakeStatus2 = SSLEngineResult.HandshakeStatus.NEED_WRAP;
        } else {
            if (E() != 1 && E() != 3 && (E() != 6 || isInboundDone())) {
                handshakeStatus2 = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
            }
            handshakeStatus2 = SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
        }
        return handshakeStatus2;
    }

    public final SSLEngineResult f(EngineArgs engineArgs) {
        SSLEngineResult sSLEngineResult;
        SSLEngineResult sSLEngineResult2;
        SSLEngineResult sSLEngineResult3;
        int[] iArr;
        SSLEngineResult.HandshakeStatus e = e(null);
        if (isInboundDone()) {
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, e, 0, 0);
        }
        Array.clear(this.y);
        synchronized (this) {
            try {
                if (E() == 0 && !this.d) {
                    sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.OK, e, 0, 0);
                } else {
                    if ((E() != 0 && E() != 1 && E() != 3) || (e = e(null)) != SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                        int o = o(engineArgs.netData);
                        SSLSessionImpl sSLSessionImpl = this.j;
                        if (sSLSessionImpl != SSLSessionImpl.r && o > sSLSessionImpl.getPacketBufferSize()) {
                            if (o > 33305) {
                                throw new SSLProtocolException("Input SSL/TLS record too big: max = 33305 len = " + o);
                            }
                            SSLSessionImpl sSLSessionImpl2 = this.j;
                            synchronized (sSLSessionImpl2) {
                                sSLSessionImpl2.q = true;
                            }
                        }
                        if (o - 5 > engineArgs.getAppRemaining()) {
                            sSLEngineResult2 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, e, 0, 0);
                        } else {
                            if (o != -1 && engineArgs.netData.remaining() >= o) {
                                if (E() != 0 && E() != 1) {
                                    if (engineArgs.netData.remaining() != 0 && engineArgs.netData.remaining() != engineArgs.netData.capacity()) {
                                        ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream(engineArgs.netData);
                                        int c = c(byteBufferInputStream, this.y, o);
                                        byteBufferInputStream.close();
                                        if (this.y[0] != 21) {
                                            int[] iArr2 = {c};
                                            while (true) {
                                                Array.clear(this.z);
                                                iArr = new int[]{this.z.length};
                                                u();
                                                try {
                                                    int decryptMessage = Sspi.decryptMessage(this.g, this.y, iArr2, this.z, iArr);
                                                    v();
                                                    if (decryptMessage != 590615) {
                                                        if (decryptMessage == 590625) {
                                                            SSLLogger.fine("Server requested renegotiation");
                                                            byte[] bArr = new byte[cl_88.o];
                                                            c = renegotiation(this.y, c, bArr);
                                                            iArr2[0] = c;
                                                            System.arraycopy(bArr, 0, this.y, 0, c);
                                                            if (SSLLogger.isAllEnabled()) {
                                                                ByteBuffer wrap = ByteBuffer.wrap(this.y, 0, c);
                                                                SSLLogger.dump("[Raw read (EXTRA)]: length = ", Integer.valueOf(wrap.remaining()), wrap);
                                                            }
                                                        } else if (decryptMessage != 0) {
                                                            throw new SSLException("Invalid result 0x" + Integer.toHexString(decryptMessage));
                                                        }
                                                        if (iArr[0] != 0 || iArr2[0] == 0) {
                                                            break;
                                                        }
                                                    } else {
                                                        SSLLogger.fine("Context expired. Close connection");
                                                        C();
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    v();
                                                    throw th;
                                                }
                                            }
                                            if (iArr[0] != 0) {
                                                if (SSLLogger.isAllEnabled()) {
                                                    SSLLogger.dump("[Raw write decrypted]: length = ", Integer.valueOf(iArr[0]), ByteBuffer.wrap(this.z, 0, iArr[0]));
                                                }
                                                engineArgs.scatter(this.z, 0, iArr[0]);
                                            }
                                            return new SSLEngineResult(isInboundDone() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK, e(e), engineArgs.deltaNet(), engineArgs.deltaApp());
                                        }
                                        C();
                                    }
                                    sSLEngineResult3 = new SSLEngineResult(SSLEngineResult.Status.OK, e(e), 0, 0);
                                    return sSLEngineResult3;
                                }
                                if (engineArgs.netData.remaining() != 0 && engineArgs.netData.remaining() != engineArgs.netData.capacity()) {
                                    ByteBufferInputStream byteBufferInputStream2 = new ByteBufferInputStream(engineArgs.netData);
                                    int c2 = c(byteBufferInputStream2, this.y, o);
                                    byteBufferInputStream2.close();
                                    initHandshake();
                                    doHandshakeStep(this.y, c2);
                                    e = e(null);
                                    if (e == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                                        sSLEngineResult2 = new SSLEngineResult(SSLEngineResult.Status.OK, e, 0, 0);
                                    }
                                }
                                sSLEngineResult3 = new SSLEngineResult(SSLEngineResult.Status.OK, e(e), 0, 0);
                                return sSLEngineResult3;
                            }
                            sSLEngineResult2 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, e, 0, 0);
                        }
                        return sSLEngineResult2;
                    }
                    sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.OK, e, 0, 0);
                }
                return sSLEngineResult;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void g(int i) {
        this.a = i;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized String getApplicationProtocol() {
        return null;
    }

    @Override // javax.net.ssl.SSLEngine
    public Runnable getDelegatedTask() {
        return null;
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getEnableSessionCreation() {
        return this.m;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized String[] getEnabledCipherSuites() {
        return this.v.v();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getEnabledProtocols() {
        return this.u.p();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized String getHandshakeApplicationProtocol() {
        return null;
    }

    @Override // javax.net.ssl.SSLEngine
    public BiFunction getHandshakeApplicationProtocolSelector() {
        return this.x;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized SSLSession getHandshakeSession() {
        return this.j;
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        return e(null);
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getNeedClientAuth() {
        return this.l == 2;
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLSession getSession() {
        return this.j;
    }

    public SSLSocketImpl getSocketImpl() {
        return this.k;
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedCipherSuites() {
        return this.e.j().v();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedProtocols() {
        return this.e.i().p();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getUseClientMode() {
        return !this.d;
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getWantClientAuth() {
        return this.l == 1;
    }

    public int handshake(byte[] bArr) throws SSLException {
        if (this.k == null || E() != 0) {
            return 0;
        }
        g(1);
        return this.d ? d(bArr, false) : a(0, false, null, bArr);
    }

    public final void i(Exception exc) {
        SSLLogger.fatal(Thread.currentThread().getName() + ", fatal error: " + exc);
        this.C = true;
        x();
        SSLSessionImpl sSLSessionImpl = this.j;
        SSLSessionImpl sSLSessionImpl2 = SSLSessionImpl.r;
        if (sSLSessionImpl != sSLSessionImpl2) {
            sSLSessionImpl.invalidate();
            this.j = sSLSessionImpl2;
        }
        if (exc instanceof SSLException) {
            throw ((SSLException) exc);
        }
        SSLException sSLException = new SSLException(exc.getMessage());
        sSLException.initCause(exc);
        throw sSLException;
    }

    public void initHandshake() throws SSLException {
        if (E() == 0) {
            if (this.d) {
                x();
                this.j = new SSLSessionImpl();
            } else {
                n(false);
            }
            g(1);
            SSLSocketImpl sSLSocketImpl = this.k;
            if (sSLSocketImpl != null) {
                sSLSocketImpl.a(1);
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean isInboundDone() {
        return this.C;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized boolean isOutboundDone() {
        boolean z;
        z = false;
        if (this.D) {
            if (!(this.t.size() != 0)) {
                z = true;
            }
        }
        return z;
    }

    public final void k(SSLContextImpl sSLContextImpl) {
        this.e = sSLContextImpl;
        this.j = SSLSessionImpl.r;
        this.v = sSLContextImpl.d(this.d);
        this.u = this.e.a(this.d);
        g(0);
        this.b = new Object();
        this.c = new Object();
        this.t = new LinkedList();
        this.s = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7 A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:14:0x0042, B:17:0x005d, B:18:0x00e3, B:20:0x00ea, B:23:0x00ef, B:25:0x00f7, B:27:0x0116, B:30:0x0124, B:31:0x0148, B:32:0x0180, B:34:0x015b, B:35:0x0162, B:36:0x0163, B:38:0x016f, B:40:0x0175, B:41:0x0066, B:45:0x006e, B:47:0x0072, B:49:0x008e, B:51:0x0091, B:54:0x00b0, B:56:0x00e0), top: B:13:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015b A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:14:0x0042, B:17:0x005d, B:18:0x00e3, B:20:0x00ea, B:23:0x00ef, B:25:0x00f7, B:27:0x0116, B:30:0x0124, B:31:0x0148, B:32:0x0180, B:34:0x015b, B:35:0x0162, B:36:0x0163, B:38:0x016f, B:40:0x0175, B:41:0x0066, B:45:0x006e, B:47:0x0072, B:49:0x008e, B:51:0x0091, B:54:0x00b0, B:56:0x00e0), top: B:13:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016f A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:14:0x0042, B:17:0x005d, B:18:0x00e3, B:20:0x00ea, B:23:0x00ef, B:25:0x00f7, B:27:0x0116, B:30:0x0124, B:31:0x0148, B:32:0x0180, B:34:0x015b, B:35:0x0162, B:36:0x0163, B:38:0x016f, B:40:0x0175, B:41:0x0066, B:45:0x006e, B:47:0x0072, B:49:0x008e, B:51:0x0091, B:54:0x00b0, B:56:0x00e0), top: B:13:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0175 A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:14:0x0042, B:17:0x005d, B:18:0x00e3, B:20:0x00ea, B:23:0x00ef, B:25:0x00f7, B:27:0x0116, B:30:0x0124, B:31:0x0148, B:32:0x0180, B:34:0x015b, B:35:0x0162, B:36:0x0163, B:38:0x016f, B:40:0x0175, B:41:0x0066, B:45:0x006e, B:47:0x0072, B:49:0x008e, B:51:0x0091, B:54:0x00b0, B:56:0x00e0), top: B:13:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(boolean z) {
        String str;
        PrivateKey privateKey;
        PrivateKeyInterface extractSpec;
        if (!z && this.n != null && this.p != null) {
            SSLLogger.fine("Client credentials were already sent.");
            return;
        }
        SSLLogger.fine("Create new client credentials.");
        this.w = (or61) this.u.x;
        AbstractCollection abstractCollection = (AbstractCollection) this.v.b;
        int[] iArr = new int[abstractCollection.size()];
        Iterator it = abstractCollection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((mu61) it.next()).c;
            i++;
        }
        try {
            X509ExtendedKeyManager x509ExtendedKeyManager = this.e.l;
            SSLLogger.fine("Search for client containers with GOST algorithms...");
            String[] clientAliases = x509ExtendedKeyManager.getClientAliases(new String[]{JCP.GOST_EL_DEGREE_NAME}[0], this.q);
            if (clientAliases == null) {
                str = "Appropriate client aliases not found.";
            } else {
                if (clientAliases.length <= 1 || !z) {
                    for (String str2 : clientAliases) {
                        SSLLogger.fine("Checking private key: " + str2);
                        X509Certificate[] certificateChain = x509ExtendedKeyManager.getCertificateChain(str2);
                        if (certificateChain != null && certificateChain.length != 0) {
                            SSLLogger.fine("Certificate chain " + str2 + " found.");
                            PrivateKey privateKey2 = x509ExtendedKeyManager.getPrivateKey(str2);
                            if (privateKey2 != null) {
                                SSLLogger.fine("Private key " + str2 + " is available.");
                                this.p = privateKey2;
                                this.n = certificateChain;
                                str = "%% Chosen client alias: " + str2;
                            }
                        }
                    }
                    long[] jArr = new long[2];
                    privateKey = this.p;
                    if (privateKey != null && this.n != null) {
                        extractSpec = InternalGostPrivateKey.extractSpec(privateKey);
                        if (extractSpec instanceof AbstractKeySpec) {
                            throw new InvalidKeyException("Invalid key");
                        }
                        long handle = ((AbstractKeySpec) extractSpec).getKey().getProvHandle().getHandle();
                        int keyType = ((AbstractKeySpec) extractSpec).getKeyType();
                        ArrayList arrayList = new ArrayList();
                        for (X509Certificate x509Certificate : this.n) {
                            arrayList.add(x509Certificate.getEncoded());
                        }
                        if (!z) {
                            SSLLogger.fine("Remove old credentials and session " + this.j + " from cache");
                            this.e.a.a(this.B);
                        }
                        Sspi.acquireCredentialsHandle(jArr, true, b(this.w), iArr, arrayList, handle, keyType, this.i, null);
                        SSLLogger.fine("Acquire credentials with client certificate done");
                        this.j = new SSLSessionImpl(jArr);
                        return;
                    }
                    SSLLogger.fine("No appropriate cert was found.");
                    SSLLogger.fine("Acquire credentials done");
                    if (z) {
                        SSLLogger.fine("No new credentials will be created");
                        return;
                    } else {
                        Sspi.acquireCredentialsHandle(jArr, true, b(this.w), iArr, this.i);
                        this.j = new SSLSessionImpl(jArr);
                        return;
                    }
                }
                str = "Client certificate will be sent after certificate request.";
            }
            SSLLogger.fine(str);
            long[] jArr2 = new long[2];
            privateKey = this.p;
            if (privateKey != null) {
                extractSpec = InternalGostPrivateKey.extractSpec(privateKey);
                if (extractSpec instanceof AbstractKeySpec) {
                }
            }
            SSLLogger.fine("No appropriate cert was found.");
            SSLLogger.fine("Acquire credentials done");
            if (z) {
            }
        } catch (Exception e) {
            i(e);
            throw null;
        }
    }

    public final SSLEngineResult m(EngineArgs engineArgs) {
        SSLEngineResult sSLEngineResult;
        SSLEngineResult.HandshakeStatus handshakeStatus = null;
        SSLEngineResult.HandshakeStatus e = e(null);
        if (isOutboundDone()) {
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, e, 0, 0);
        }
        Array.clear(this.y);
        synchronized (this) {
            try {
                if (E() == 0) {
                    if (this.d) {
                        sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.OK, e, 0, 0);
                    } else {
                        initHandshake();
                        doHandshakeStep(null, 0);
                        e = e(null);
                        if (e == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                            sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.OK, e, 0, 0);
                        }
                    }
                    return sSLEngineResult;
                }
                boolean z = true;
                if ((E() == 1 || E() == 3) && engineArgs.netData.remaining() != 0 && engineArgs.netData.remaining() != engineArgs.netData.capacity()) {
                    ByteBufferInputStream byteBufferInputStream = new ByteBufferInputStream(engineArgs.netData);
                    byte[] bArr = this.y;
                    int c = c(byteBufferInputStream, bArr, bArr.length);
                    byteBufferInputStream.close();
                    doHandshakeStep(this.y, c);
                    e = e(null);
                    if (e == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                        sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.OK, e, 0, 0);
                        return sSLEngineResult;
                    }
                }
                if (this.t.size() != 0) {
                    ByteBuffer byteBuffer = engineArgs.netData;
                    Object removeFirst = this.t.removeFirst();
                    SSLEngineResult.HandshakeStatus handshakeStatus2 = SSLEngineResult.HandshakeStatus.FINISHED;
                    if (removeFirst != handshakeStatus2) {
                        if (removeFirst == SSLEngineResult.HandshakeStatus.NEED_TASK) {
                            removeFirst = this.t.removeFirst();
                        } else {
                            z = false;
                        }
                        ByteBuffer byteBuffer2 = (ByteBuffer) removeFirst;
                        if (z || byteBuffer2.get(0) == 21) {
                            C();
                        }
                        byteBuffer.limit(byteBuffer2.remaining() + byteBuffer.position());
                        byteBuffer.put(byteBuffer2);
                        if (this.t.size() != 0) {
                            if (this.t.getFirst() == handshakeStatus2) {
                                this.t.removeFirst();
                            } else {
                                handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_WRAP;
                            }
                        }
                        return new SSLEngineResult(SSLEngineResult.Status.OK, e(handshakeStatus), 0, 0);
                    }
                    handshakeStatus = handshakeStatus2;
                    return new SSLEngineResult(SSLEngineResult.Status.OK, e(handshakeStatus), 0, 0);
                }
                if (E() != 2) {
                    return new SSLEngineResult(SSLEngineResult.Status.OK, e(e), 0, 0);
                }
                if (engineArgs.getAppRemaining() == 0) {
                    return new SSLEngineResult(SSLEngineResult.Status.OK, e, 0, 0);
                }
                int min = Math.min(engineArgs.getAppRemaining(), 16384);
                ByteBuffer byteBuffer3 = engineArgs.netData;
                int position = byteBuffer3.position();
                byteBuffer3.limit();
                engineArgs.gather(min);
                byteBuffer3.limit(byteBuffer3.position());
                byteBuffer3.position(position);
                if (byteBuffer3.remaining() == 0 || byteBuffer3.remaining() == byteBuffer3.capacity()) {
                    return new SSLEngineResult(SSLEngineResult.Status.OK, e(e), 0, 0);
                }
                ByteBufferInputStream byteBufferInputStream2 = new ByteBufferInputStream(byteBuffer3);
                byte[] bArr2 = this.y;
                int c2 = c(byteBufferInputStream2, bArr2, bArr2.length);
                byteBufferInputStream2.close();
                int[] iArr = new int[1];
                int[] iArr2 = {c2};
                Array.clear(this.z);
                int[] iArr3 = {this.z.length};
                u();
                try {
                    int encryptMessage = Sspi.encryptMessage(this.g, this.y, iArr, iArr2, this.z, iArr3);
                    if (encryptMessage != 0) {
                        throw new SSLException(oyr.r(new StringBuilder("Invalid result 0x"), encryptMessage));
                    }
                    if (iArr3[0] != 0 && SSLLogger.isAllEnabled()) {
                        SSLLogger.dump("[Raw write encrypted]: length = ", Integer.valueOf(iArr3[0]), ByteBuffer.wrap(this.z, 0, iArr3[0]));
                    }
                    byteBuffer3.limit(iArr3[0]);
                    byteBuffer3.position(0);
                    byteBuffer3.put(this.z, 0, iArr3[0]);
                    byteBuffer3.limit(iArr3[0]);
                    return new SSLEngineResult(isOutboundDone() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK, e(e), engineArgs.deltaApp(), engineArgs.deltaNet());
                } finally {
                    v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(boolean z) {
        SSLSessionImpl sSLSessionImpl;
        if (z) {
            if (!Sspi.isValidHandle(w()) || Sspi.isNullHandle(w())) {
                throw new SSLException("Renegotiation on non-established connection");
            }
            g(3);
            SSLSocketImpl sSLSocketImpl = this.k;
            if (sSLSocketImpl != null) {
                sSLSocketImpl.a(3);
                return;
            }
            return;
        }
        SSLSessionContextImpl sSLSessionContextImpl = this.e.a;
        String p = p();
        SSLSocketImpl sSLSocketImpl2 = this.k;
        int port = sSLSocketImpl2 != null ? sSLSocketImpl2.getPort() : getPeerPort();
        sSLSessionContextImpl.getClass();
        SSLSessionImpl sSLSessionImpl2 = null;
        if ((p != null || port != -1) && (sSLSessionImpl = (SSLSessionImpl) sSLSessionContextImpl.b.get(SSLSessionContextImpl.b(port, p))) != null && !sSLSessionImpl.c(sSLSessionContextImpl.d)) {
            sSLSessionImpl2 = sSLSessionImpl;
        }
        this.j = sSLSessionImpl2;
        if (sSLSessionImpl2 != null) {
            StringBuilder sb = new StringBuilder("%% Client cached ");
            sb.append(this.j);
            sb.append(" ");
            sb.append(this.j.d() ? "" : " (not rejoinable)");
            SSLLogger.finer(sb.toString());
        } else {
            SSLLogger.finer("%% No cached client session");
            this.j = SSLSessionImpl.r;
        }
        if (!this.j.d()) {
            this.j = SSLSessionImpl.r;
        }
        X509TrustManager x509TrustManager = this.e.m;
        if ((x509TrustManager instanceof au61) && ((au61) x509TrustManager).a.equalsIgnoreCase("LIBSSPI")) {
            this.i = true;
        }
        SSLSessionImpl sSLSessionImpl3 = this.j;
        SSLSessionImpl sSLSessionImpl4 = SSLSessionImpl.r;
        if (sSLSessionImpl3 != sSLSessionImpl4) {
            this.w = sSLSessionImpl3.a;
            this.o = (X509Certificate[]) sSLSessionImpl3.getPeerCertificates();
            this.r = true;
        }
        if (this.j == sSLSessionImpl4) {
            l(true);
        }
    }

    public final int o(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 5) {
            return -1;
        }
        int position = byteBuffer.position();
        byte b = byteBuffer.get(position);
        if (this.s || b == 22 || b == 21) {
            h(or61.a(((byteBuffer.get(position + 1) & 255) << 8) | (byteBuffer.get(position + 2) & 255)), false);
            this.s = true;
            return ((byteBuffer.get(position + 3) & 255) << 8) + (byteBuffer.get(position + 4) & 255) + 5;
        }
        boolean z = (b & DerValue.TAG_CONTEXT) != 0;
        if (z) {
            int i = position + 2;
            if (byteBuffer.get(i) == 1 || byteBuffer.get(i) == 4) {
                h(or61.a(((byteBuffer.get(position + 3) & 255) << 8) | (byteBuffer.get(position + 4) & 255)), true);
                return (((z ? Byte.MAX_VALUE : (byte) 63) & b) << 8) + (byteBuffer.get(position + 1) & 255) + (z ? 2 : 3);
            }
        }
        throw new SSLException("Unrecognized SSL message, plaintext connection?");
    }

    public final String p() {
        String str;
        SSLSocketImpl sSLSocketImpl = this.k;
        if (sSLSocketImpl == null) {
            return getPeerHost();
        }
        synchronized (sSLSocketImpl) {
            try {
                String str2 = sSLSocketImpl.A;
                if (str2 != null) {
                    if (str2.length() == 0) {
                    }
                    str = sSLSocketImpl.A;
                }
                synchronized (sSLSocketImpl) {
                    InetAddress inetAddress = sSLSocketImpl.getInetAddress();
                    if (inetAddress != null) {
                        sSLSocketImpl.A = inetAddress.getHostName();
                    }
                    str = sSLSocketImpl.A;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void q(boolean z) {
        int initializeSecurityContext;
        byte[] bArr = this.z;
        if (E() >= 6) {
            return;
        }
        try {
            Array.clear(bArr);
            int[] iArr = {bArr.length};
            u();
            try {
                if (this.d) {
                    initializeSecurityContext = Sspi.acceptSecurityContext(this.e.e(), this.g, getNeedClientAuth(), true, null, null, this.z, iArr);
                } else {
                    initializeSecurityContext = Sspi.initializeSecurityContext(w(), this.g, p(), true, false, null, null, this.z, iArr);
                    iArr = iArr;
                }
                long j = initializeSecurityContext;
                v();
                if (j != 0) {
                    throw new SSLException("Error due send close notify 0x" + Integer.toHexString((int) j));
                }
                SSLLogger.fine(this.d ? "Server" : "Client  close_notify was successful");
                if (iArr[0] != 0) {
                    if (SSLLogger.isAllEnabled()) {
                        SSLLogger.dump("Send close notify: length = ", Integer.valueOf(iArr[0]), ByteBuffer.wrap(bArr, 0, iArr[0]));
                    }
                    if (z) {
                        this.t.addLast(SSLEngineResult.HandshakeStatus.NEED_TASK);
                        this.t.addLast(ByteBuffer.allocate(iArr[0]).put(bArr, 0, iArr[0]).flip());
                    } else {
                        this.k.getSockOutput().write(bArr, 0, iArr[0]);
                        this.k.getSockOutput().flush();
                    }
                }
            } catch (Throwable th) {
                v();
                throw th;
            }
        } catch (Exception e) {
            SSLLogger.thrown(e);
        }
    }

    public final boolean r(boolean z) {
        if (this.A != null && this.w != null) {
            return true;
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        u();
        try {
            try {
                Sspi.getCipherInfo(this.g, iArr, iArr2);
                v();
                int i = iArr2[0];
                if (i == 0 || iArr[0] == 0) {
                    return false;
                }
                mu61 mu61Var = (mu61) mu61.A.get(Integer.valueOf(i));
                if (mu61Var == null) {
                    mu61Var = new mu61(g8e.o("Unknown 0x", Integer.toString(i, 16)), i);
                }
                this.A = mu61Var;
                this.w = or61.a(iArr[0]);
                SSLLogger.fine("Handshake attributes. Protocol: " + this.w + " CipherSuite: " + this.A);
                return true;
            } catch (MSException e) {
                if (!z) {
                    throw new SSLException(e);
                }
                v();
                return false;
            }
        } catch (Throwable th) {
            v();
            throw th;
        }
    }

    public int renegotiation(byte[] bArr, int i, byte[] bArr2) throws SSLException {
        return this.d ? d(bArr2, true) : a(i, true, bArr, bArr2);
    }

    public final void s(boolean z) {
        if (this.o != null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        u();
        try {
            try {
                Sspi.getRemoteCertificates(this.g, arrayList);
            } catch (MSException e) {
                if (!z) {
                    throw new SSLException(e);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer("Remote certificate chain: (length: ");
            stringBuffer.append(arrayList.size());
            stringBuffer.append(")\n");
            this.o = new X509Certificate[arrayList.size()];
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
            for (int i = 0; i < arrayList.size(); i++) {
                this.o[i] = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream((byte[]) arrayList.get(i)));
                stringBuffer.append(this.o[i].toString());
            }
            SSLLogger.fine(stringBuffer.toString());
        } finally {
            v();
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnableSessionCreation(boolean z) {
        this.m = z;
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledCipherSuites(String[] strArr) {
        this.v = new a441(strArr);
        this.e.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledProtocols(String[] strArr) {
        this.u = new s421(strArr);
        this.e.setEnabledProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setHandshakeApplicationProtocolSelector(BiFunction biFunction) {
        this.x = biFunction;
    }

    @Override // javax.net.ssl.SSLEngine
    public void setNeedClientAuth(boolean z) {
        this.l = z ? (byte) 2 : (byte) 0;
    }

    public void setSocketImpl(SSLSocketImpl sSLSocketImpl) throws IOException {
        this.k = sSLSocketImpl;
    }

    @Override // javax.net.ssl.SSLEngine
    public void setUseClientMode(boolean z) {
        this.d = !z;
    }

    @Override // javax.net.ssl.SSLEngine
    public void setWantClientAuth(boolean z) {
        this.l = z ? (byte) 1 : (byte) 0;
    }

    public final boolean t(boolean z) {
        SSLSessionImpl sSLSessionImpl;
        long[] jArr;
        if (this.B == null) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            byte[] bArr = new byte[32];
            u();
            try {
                try {
                    Sspi.getSessionInfo(this.g, iArr, bArr, iArr2);
                } catch (MSException e) {
                    if (!z) {
                        throw new SSLException(e);
                    }
                }
                int i = iArr2[0];
                if (i == 0 && z) {
                    return false;
                }
                this.B = new vt61(bArr, i);
                SSLLogger.fine("Handshake session info. SessionID: " + Array.toHexString((byte[]) this.B.a.clone()) + " Reconnect: " + iArr[0]);
                if (!this.d && (sSLSessionImpl = this.j) != SSLSessionImpl.r) {
                    if (sSLSessionImpl.b.equals(this.B)) {
                        SSLLogger.fine("Session " + this.j + " is reused");
                    } else {
                        SSLLogger.fine("Client received new SessionID.");
                        SSLLogger.fine("Remove session " + this.j + " with old SessionID " + Array.toHexString((byte[]) this.j.b.a.clone()) + " from cache");
                        SSLSessionImpl sSLSessionImpl2 = this.j;
                        synchronized (sSLSessionImpl2) {
                            jArr = sSLSessionImpl2.o;
                        }
                        long[] copy = Array.copy(jArr);
                        SSLSessionImpl sSLSessionImpl3 = this.j;
                        synchronized (sSLSessionImpl3) {
                            long[] jArr2 = sSLSessionImpl3.o;
                            jArr2[0] = 0;
                            jArr2[1] = 0;
                        }
                        this.e.a.a(this.j.b);
                        this.j = new SSLSessionImpl(copy);
                        this.r = false;
                        this.o = null;
                    }
                }
            } finally {
                v();
            }
        }
        return true;
    }

    public final synchronized void u() {
        this.h++;
        SSLLogger.fine("ctxtHandleCount (lock): " + this.h);
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) throws SSLException {
        SSLEngineResult f;
        j(byteBuffer, byteBufferArr, i, i2, false);
        EngineArgs engineArgs = new EngineArgs(byteBuffer, byteBufferArr, i, i2);
        try {
            try {
                synchronized (this.c) {
                    f = f(engineArgs);
                }
                return f;
            } catch (Exception e) {
                i(e);
                throw null;
            }
        } finally {
            engineArgs.resetLim();
        }
    }

    public final synchronized void v() {
        this.h--;
        SSLLogger.fine("ctxtHandleCount (unlock): " + this.h);
    }

    public final synchronized long[] w() {
        long[] jArr;
        SSLSessionImpl sSLSessionImpl = this.j;
        if (sSLSessionImpl == SSLSessionImpl.r) {
            return new long[]{-1, 1};
        }
        synchronized (sSLSessionImpl) {
            jArr = sSLSessionImpl.o;
        }
        return jArr;
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) throws SSLException {
        SSLEngineResult m;
        j(byteBuffer, byteBufferArr, i, i2, true);
        EngineArgs engineArgs = new EngineArgs(byteBufferArr, i, i2, byteBuffer);
        if (byteBuffer.remaining() < 16921) {
            return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, e(null), 0, 0);
        }
        try {
            try {
                synchronized (this.b) {
                    m = m(engineArgs);
                }
                return m;
            } catch (Exception e) {
                engineArgs.resetPos();
                i(e);
                throw null;
            }
        } finally {
            engineArgs.resetLim();
        }
    }

    public final synchronized void x() {
        try {
            try {
                int i = this.h;
                if (i == 0) {
                    Sspi.deleteSecurityContext(this.g);
                } else {
                    SSLLogger.info("Unable delete security context. Count: ", Integer.valueOf(i));
                }
            } catch (MSException e) {
                throw new SSLException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void y() {
        boolean z = this.d;
        SSLSessionImpl sSLSessionImpl = this.j;
        or61 or61Var = this.w;
        if (z) {
            mu61 mu61Var = this.A;
            vt61 vt61Var = this.B;
            SSLSocketImpl sSLSocketImpl = this.k;
            String hostAddress = sSLSocketImpl != null ? sSLSocketImpl.getInetAddress().getHostAddress() : getPeerHost();
            SSLSocketImpl sSLSocketImpl2 = this.k;
            sSLSessionImpl.a(or61Var, mu61Var, vt61Var, hostAddress, sSLSocketImpl2 != null ? sSLSocketImpl2.getPort() : getPeerPort());
            this.j.m = this.e.getLocalPrivateKey();
            this.j.l = this.e.getLocalCerts();
            this.j.f = System.currentTimeMillis();
            return;
        }
        mu61 mu61Var2 = this.A;
        vt61 vt61Var2 = this.B;
        String p = p();
        SSLSocketImpl sSLSocketImpl3 = this.k;
        sSLSessionImpl.a(or61Var, mu61Var2, vt61Var2, p, sSLSocketImpl3 != null ? sSLSocketImpl3.getPort() : getPeerPort());
        SSLSessionImpl sSLSessionImpl2 = this.j;
        sSLSessionImpl2.m = this.p;
        sSLSessionImpl2.l = this.n;
        sSLSessionImpl2.f = System.currentTimeMillis();
        if (!this.j.d()) {
            SSLLogger.fine("%% Didn't cache non-resumable client session: ", this.j);
            return;
        }
        SSLSessionContextImpl sSLSessionContextImpl = this.e.a;
        SSLSessionImpl sSLSessionImpl3 = this.j;
        sSLSessionContextImpl.a.put(sSLSessionImpl3.b, sSLSessionImpl3);
        if (sSLSessionImpl3.getPeerHost() != null && sSLSessionImpl3.getPeerPort() != -1) {
            sSLSessionContextImpl.b.put(SSLSessionContextImpl.b(sSLSessionImpl3.getPeerPort(), sSLSessionImpl3.getPeerHost()), sSLSessionImpl3);
        }
        if (sSLSessionImpl3.i == null) {
            sSLSessionImpl3.i = sSLSessionContextImpl;
        }
        SSLLogger.fine("%% Cached client session: ", this.j);
    }

    public final void z() {
        if (this.r) {
            return;
        }
        X509Certificate[] x509CertificateArr = this.o;
        if (x509CertificateArr == null) {
            i(new CertificateException("Empty server certificate chain"));
            throw null;
        }
        String str = this.j.d.b;
        X509TrustManager x509TrustManager = this.e.m;
        try {
            if (!(x509TrustManager instanceof X509ExtendedTrustManager)) {
                throw new CertificateException("Improper X509TrustManager implementation");
            }
            ((X509ExtendedTrustManager) x509TrustManager).checkServerTrusted((X509Certificate[]) x509CertificateArr.clone(), str, this);
            this.r = true;
        } catch (CertificateException e) {
            i(e);
            throw null;
        }
    }

    public SSLEngineImpl(SSLContextImpl sSLContextImpl, String str, int i) {
        super(str, i);
        this.f = new ReentrantLock();
        this.g = new long[2];
        this.h = 0;
        this.i = false;
        this.k = null;
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = false;
        this.s = true;
        this.w = or61.D;
        this.y = new byte[cl_88.o];
        this.z = new byte[cl_88.o];
        this.A = null;
        this.B = null;
        this.C = false;
        this.D = false;
        k(sSLContextImpl);
    }

    public SSLEngineImpl(SSLContextImpl sSLContextImpl) {
        this.f = new ReentrantLock();
        this.g = new long[2];
        this.h = 0;
        this.i = false;
        this.k = null;
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = false;
        this.s = true;
        this.w = or61.D;
        this.y = new byte[cl_88.o];
        this.z = new byte[cl_88.o];
        this.A = null;
        this.B = null;
        this.C = false;
        this.D = false;
        k(sSLContextImpl);
    }
}
