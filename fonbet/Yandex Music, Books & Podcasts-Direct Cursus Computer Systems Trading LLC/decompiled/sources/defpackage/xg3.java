package defpackage;

/* loaded from: classes.dex */
public final class xg3 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final d7k f;
    public final d7k g;
    public int h;
    public int i;

    public xg3(d7k d7kVar, d7k d7kVar2, boolean z) {
        this.g = d7kVar;
        this.f = d7kVar2;
        this.e = z;
        d7kVar2.H(12);
        this.a = d7kVar2.z();
        d7kVar.H(12);
        this.i = d7kVar.z();
        x97.q("first_chunk must be 1", d7kVar.h() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        d7k d7kVar = this.f;
        this.d = z ? d7kVar.A() : d7kVar.x();
        if (this.b == this.h) {
            d7k d7kVar2 = this.g;
            this.c = d7kVar2.z();
            d7kVar2.I(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? d7kVar2.z() - 1 : -1;
        }
        return true;
    }
}
