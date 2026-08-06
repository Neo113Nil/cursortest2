package P;

/* renamed from: P.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1299a;

    /* renamed from: b, reason: collision with root package name */
    public long f1300b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1301c;

    public C0053b(W1.q source) {
        this.f1299a = 1;
        kotlin.jvm.internal.i.e(source, "source");
        this.f1301c = source;
        this.f1300b = 262144L;
    }

    public int a(int i2) {
        C0053b c0053b = (C0053b) this.f1301c;
        if (c0053b == null) {
            return i2 >= 64 ? Long.bitCount(this.f1300b) : Long.bitCount(this.f1300b & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f1300b & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f1300b) + c0053b.a(i2 - 64);
    }

    public boolean b(int i2) {
        if (i2 < 64) {
            return (this.f1300b & (1 << i2)) != 0;
        }
        if (((C0053b) this.f1301c) == null) {
            this.f1301c = new C0053b();
        }
        return ((C0053b) this.f1301c).b(i2 - 64);
    }

    public J1.m c() {
        J1.l lVar = new J1.l(0);
        while (true) {
            String o2 = ((W1.q) this.f1301c).o(this.f1300b);
            this.f1300b -= o2.length();
            if (o2.length() == 0) {
                return lVar.b();
            }
            int X2 = z1.g.X(o2, ':', 1, false, 4);
            if (X2 != -1) {
                String substring = o2.substring(0, X2);
                kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = o2.substring(X2 + 1);
                kotlin.jvm.internal.i.d(substring2, "this as java.lang.String).substring(startIndex)");
                lVar.a(substring, substring2);
            } else if (o2.charAt(0) == ':') {
                String substring3 = o2.substring(1);
                kotlin.jvm.internal.i.d(substring3, "this as java.lang.String).substring(startIndex)");
                lVar.a("", substring3);
            } else {
                lVar.a("", o2);
            }
        }
    }

    public void d() {
        this.f1300b = 0L;
        C0053b c0053b = (C0053b) this.f1301c;
        if (c0053b != null) {
            c0053b.d();
        }
    }

    public String toString() {
        switch (this.f1299a) {
            case 0:
                if (((C0053b) this.f1301c) == null) {
                    return Long.toBinaryString(this.f1300b);
                }
                return ((C0053b) this.f1301c).toString() + "xx" + Long.toBinaryString(this.f1300b);
            default:
                return super.toString();
        }
    }

    public C0053b() {
        this.f1299a = 0;
        this.f1300b = 0L;
    }
}
