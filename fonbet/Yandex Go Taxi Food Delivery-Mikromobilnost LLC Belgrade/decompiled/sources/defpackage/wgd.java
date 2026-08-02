package defpackage;

/* loaded from: classes.dex */
public final class wgd implements i1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wgd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((lb7) obj).c = null;
                break;
            case 1:
                ltr0 ltr0Var = (ltr0) obj;
                ltr0Var.f.setValue(ltr0Var.e);
                break;
            default:
                zx01 zx01Var = (zx01) obj;
                zx01Var.i();
                zx01Var.a.getClass();
                break;
        }
    }
}
