package defpackage;

/* loaded from: classes14.dex */
public final class xj7 implements v7p {
    public final /* synthetic */ int a;
    public final zag b;

    public /* synthetic */ xj7(zag zagVar, int i) {
        this.a = i;
        this.b = zagVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        zag zagVar = this.b;
        switch (i) {
            case 0:
                return new pj((pho) zagVar.get());
            default:
                return new o61((pho) zagVar.get());
        }
    }
}
