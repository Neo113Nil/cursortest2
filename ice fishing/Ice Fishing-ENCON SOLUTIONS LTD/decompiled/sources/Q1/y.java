package Q1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f1679a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1680b;

    /* renamed from: c, reason: collision with root package name */
    public long f1681c;

    /* renamed from: d, reason: collision with root package name */
    public long f1682d;

    /* renamed from: e, reason: collision with root package name */
    public long f1683e;

    /* renamed from: f, reason: collision with root package name */
    public long f1684f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1685g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1686h;

    /* renamed from: i, reason: collision with root package name */
    public final w f1687i;

    /* renamed from: j, reason: collision with root package name */
    public final v f1688j;

    /* renamed from: k, reason: collision with root package name */
    public final x f1689k;

    /* renamed from: l, reason: collision with root package name */
    public final x f1690l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC0079b f1691m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f1692n;

    public y(int i2, q connection, boolean z2, boolean z3, J1.m mVar) {
        kotlin.jvm.internal.i.e(connection, "connection");
        this.f1679a = i2;
        this.f1680b = connection;
        this.f1684f = connection.f1642q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1685g = arrayDeque;
        this.f1687i = new w(this, connection.f1641p.a(), z3);
        this.f1688j = new v(this, z2);
        this.f1689k = new x(this);
        this.f1690l = new x(this);
        if (mVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(mVar);
        }
    }

    public final void a() {
        boolean z2;
        boolean i2;
        byte[] bArr = K1.b.f1051a;
        synchronized (this) {
            w wVar = this.f1687i;
            if (!wVar.f1673b && wVar.f1676e) {
                v vVar = this.f1688j;
                if (vVar.f1668a || vVar.f1670c) {
                    z2 = true;
                    i2 = i();
                }
            }
            z2 = false;
            i2 = i();
        }
        if (z2) {
            c(EnumC0079b.CANCEL, null);
        } else {
            if (i2) {
                return;
            }
            this.f1680b.j(this.f1679a);
        }
    }

    public final void b() {
        v vVar = this.f1688j;
        if (vVar.f1670c) {
            throw new IOException("stream closed");
        }
        if (vVar.f1668a) {
            throw new IOException("stream finished");
        }
        if (this.f1691m != null) {
            IOException iOException = this.f1692n;
            if (iOException != null) {
                throw iOException;
            }
            EnumC0079b enumC0079b = this.f1691m;
            kotlin.jvm.internal.i.b(enumC0079b);
            throw new E(enumC0079b);
        }
    }

    public final void c(EnumC0079b enumC0079b, IOException iOException) {
        if (d(enumC0079b, iOException)) {
            this.f1680b.f1647w.m(this.f1679a, enumC0079b);
        }
    }

    public final boolean d(EnumC0079b enumC0079b, IOException iOException) {
        byte[] bArr = K1.b.f1051a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.f1687i.f1673b && this.f1688j.f1668a) {
                return false;
            }
            this.f1691m = enumC0079b;
            this.f1692n = iOException;
            notifyAll();
            this.f1680b.j(this.f1679a);
            return true;
        }
    }

    public final void e(EnumC0079b enumC0079b) {
        if (d(enumC0079b, null)) {
            this.f1680b.n(this.f1679a, enumC0079b);
        }
    }

    public final synchronized EnumC0079b f() {
        return this.f1691m;
    }

    public final v g() {
        synchronized (this) {
            if (!this.f1686h && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f1688j;
    }

    public final boolean h() {
        boolean z2 = (this.f1679a & 1) == 1;
        this.f1680b.getClass();
        return true == z2;
    }

    public final synchronized boolean i() {
        if (this.f1691m != null) {
            return false;
        }
        w wVar = this.f1687i;
        if (wVar.f1673b || wVar.f1676e) {
            v vVar = this.f1688j;
            if (vVar.f1668a || vVar.f1670c) {
                if (this.f1686h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(J1.m headers, boolean z2) {
        boolean i2;
        kotlin.jvm.internal.i.e(headers, "headers");
        byte[] bArr = K1.b.f1051a;
        synchronized (this) {
            try {
                if (this.f1686h && z2) {
                    this.f1687i.getClass();
                    if (z2) {
                        this.f1687i.f1673b = true;
                    }
                    i2 = i();
                    notifyAll();
                }
                this.f1686h = true;
                this.f1685g.add(headers);
                if (z2) {
                }
                i2 = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2) {
            return;
        }
        this.f1680b.j(this.f1679a);
    }

    public final synchronized void k(EnumC0079b enumC0079b) {
        if (this.f1691m == null) {
            this.f1691m = enumC0079b;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
