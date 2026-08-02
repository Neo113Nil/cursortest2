package defpackage;

/* loaded from: classes6.dex */
public final class yj30 implements v7p {
    public final /* synthetic */ int a;
    public final v3g b;

    public /* synthetic */ yj30(v3g v3gVar, int i) {
        this.a = i;
        this.b = v3gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        v3g v3gVar = this.b;
        switch (i) {
            case 0:
                return new xj30((zuj0) v3gVar.get());
            default:
                return new nw8((zuj0) v3gVar.get());
        }
    }
}
