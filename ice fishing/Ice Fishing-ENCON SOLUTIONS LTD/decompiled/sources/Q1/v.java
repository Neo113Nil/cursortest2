package Q1;

/* loaded from: classes.dex */
public final class v implements W1.u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1668a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.g f1669b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1670c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f1671d;

    public v(y this$0, boolean z2) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1671d = this$0;
        this.f1668a = z2;
        this.f1669b = new W1.g();
    }

    public final void a(boolean z2) {
        long min;
        boolean z3;
        y yVar = this.f1671d;
        synchronized (yVar) {
            yVar.f1690l.h();
            while (yVar.f1683e >= yVar.f1684f && !this.f1668a && !this.f1670c && yVar.f() == null) {
                try {
                    yVar.l();
                } finally {
                    yVar.f1690l.k();
                }
            }
            yVar.f1690l.k();
            yVar.b();
            min = Math.min(yVar.f1684f - yVar.f1683e, this.f1669b.f1875b);
            yVar.f1683e += min;
            z3 = z2 && min == this.f1669b.f1875b;
        }
        this.f1671d.f1690l.h();
        try {
            y yVar2 = this.f1671d;
            yVar2.f1680b.m(yVar2.f1679a, z3, this.f1669b, min);
        } finally {
            yVar = this.f1671d;
        }
    }

    @Override // W1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y yVar = this.f1671d;
        byte[] bArr = K1.b.f1051a;
        synchronized (yVar) {
            if (this.f1670c) {
                return;
            }
            boolean z2 = yVar.f() == null;
            y yVar2 = this.f1671d;
            if (!yVar2.f1688j.f1668a) {
                if (this.f1669b.f1875b > 0) {
                    while (this.f1669b.f1875b > 0) {
                        a(true);
                    }
                } else if (z2) {
                    yVar2.f1680b.m(yVar2.f1679a, true, null, 0L);
                }
            }
            synchronized (this.f1671d) {
                this.f1670c = true;
            }
            this.f1671d.f1680b.flush();
            this.f1671d.a();
        }
    }

    @Override // W1.u
    public final W1.y d() {
        return this.f1671d.f1690l;
    }

    @Override // W1.u, java.io.Flushable
    public final void flush() {
        y yVar = this.f1671d;
        byte[] bArr = K1.b.f1051a;
        synchronized (yVar) {
            yVar.b();
        }
        while (this.f1669b.f1875b > 0) {
            a(false);
            this.f1671d.f1680b.flush();
        }
    }

    @Override // W1.u
    public final void h(W1.g gVar, long j2) {
        byte[] bArr = K1.b.f1051a;
        W1.g gVar2 = this.f1669b;
        gVar2.h(gVar, j2);
        while (gVar2.f1875b >= 16384) {
            a(false);
        }
    }
}
