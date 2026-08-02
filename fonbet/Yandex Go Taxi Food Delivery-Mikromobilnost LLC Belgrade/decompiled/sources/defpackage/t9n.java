package defpackage;

/* loaded from: classes5.dex */
public final class t9n implements v7p {
    public final /* synthetic */ int a;
    public final ibg b;

    public /* synthetic */ t9n(ibg ibgVar, int i) {
        this.a = i;
        this.b = ibgVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        ibg ibgVar = this.b;
        switch (i) {
            case 0:
                return new s9n((l7x0) ibgVar.get());
            case 1:
                return new itq((l7x0) ibgVar.get());
            case 2:
                return new vau((l7x0) ibgVar.get());
            default:
                return new itq((l7x0) ibgVar.get());
        }
    }
}
