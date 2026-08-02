package defpackage;

/* loaded from: classes.dex */
public final class nq5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nq5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                oq5 oq5Var = (oq5) this.b;
                oq5Var.z--;
                break;
            default:
                v2r v2rVar = (v2r) this.b;
                v2rVar.j--;
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((oq5) this.b).z++;
                break;
            default:
                ((v2r) this.b).j++;
                break;
        }
    }
}
