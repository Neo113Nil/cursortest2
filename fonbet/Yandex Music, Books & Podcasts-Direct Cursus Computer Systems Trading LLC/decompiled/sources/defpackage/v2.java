package defpackage;

/* loaded from: classes4.dex */
public final class v2 implements mnq {
    public final /* synthetic */ int a;
    public final f3 b;
    public final jyr c;
    public final jyr d;

    public v2(f3 f3Var, int i) {
        this.a = i;
        f3Var.getClass();
        switch (i) {
            case 1:
                this.b = f3Var;
                this.c = btf.b(new s2(5));
                this.d = btf.b(new q4(this, 0));
                break;
            default:
                this.b = f3Var;
                this.c = btf.b(new s2(0));
                this.d = btf.b(new t2(this, 0));
                break;
        }
    }

    @Override // defpackage.prf
    public final knq a() {
        switch (this.a) {
        }
        return (knq) this.d.getValue();
    }

    @Override // defpackage.mnq
    public final fnq b() {
        switch (this.a) {
        }
        return (fnq) this.c.getValue();
    }
}
