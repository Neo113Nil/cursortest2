package defpackage;

/* loaded from: classes3.dex */
public final class oan implements ba2 {
    public final /* synthetic */ int a;
    public final oq7 b;
    public final jyr c;

    public oan(oq7 oq7Var, int i) {
        this.a = i;
        oq7Var.getClass();
        switch (i) {
            case 1:
                this.b = oq7Var;
                this.c = btf.b(new b6n(6, this));
                break;
            case 2:
                this.b = oq7Var;
                this.c = btf.b(new b6n(7, this));
                break;
            case 3:
                this.b = oq7Var;
                this.c = btf.b(new b6n(8, this));
                break;
            case 4:
                this.b = oq7Var;
                this.c = btf.b(new b6n(10, this));
                break;
            case 5:
                this.b = oq7Var;
                this.c = btf.b(new b6n(11, this));
                break;
            default:
                this.b = oq7Var;
                this.c = btf.b(new b6n(5, this));
                break;
        }
    }

    @Override // defpackage.ba2
    public final pjc a() {
        switch (this.a) {
        }
        return (pjc) this.c.getValue();
    }
}
