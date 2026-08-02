package defpackage;

/* loaded from: classes5.dex */
public final class s5c {
    public final jyr a;
    public final jyr b;

    public s5c() {
        bdt I = hag.I(e15.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(frt.class), true);
    }

    public final Object a(cg6 cg6Var) {
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str = ((frt) qdcVar.C(I)).c().a;
        str.getClass();
        Object d = ((e15) this.a.getValue()).d(str, ((frt) this.b.getValue()).c().a, cg6Var);
        return d == nm6.a ? d : (cvl) d;
    }

    public final pjc b(Integer num) {
        e15 e15Var = (e15) this.a.getValue();
        String str = ((frt) this.b.getValue()).c().a;
        e15Var.getClass();
        str.getClass();
        return zsd.b0(new qm(e15Var.h("playlist_mview", "track_mview"), e15Var, str, num, 1));
    }
}
