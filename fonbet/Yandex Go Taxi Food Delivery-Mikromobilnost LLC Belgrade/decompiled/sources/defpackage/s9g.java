package defpackage;

/* loaded from: classes14.dex */
public final class s9g implements xvf0 {
    public final /* synthetic */ int a;
    public final v2g b;

    public /* synthetic */ s9g(v2g v2gVar, int i) {
        this.a = i;
        this.b = v2gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        v2g v2gVar = this.b;
        switch (i) {
            case 0:
                return v2gVar.M0();
            case 1:
                return v2gVar.a.Y0();
            case 2:
                return v2gVar.a.t0();
            case 3:
                return v2gVar.K();
            case 4:
                return v2gVar.x0();
            case 5:
                return v2gVar.q();
            case 6:
                return v2gVar.g0();
            case 7:
                return v2gVar.a.w();
            default:
                return v2gVar.d1();
        }
    }
}
