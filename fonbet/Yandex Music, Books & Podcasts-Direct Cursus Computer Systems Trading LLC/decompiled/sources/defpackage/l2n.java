package defpackage;

/* loaded from: classes4.dex */
public final class l2n implements n2n {
    public static final l2n a = new l2n();
    public static final jyr b = l18.b.b(hag.I(oq7.class), true);

    @Override // defpackage.n2n
    public final Cnew a() {
        return lew.b;
    }

    @Override // defpackage.n2n
    public final vgd b() {
        n7q n7qVar;
        d6l x = p6g.x((e6l) ((oq7) b.getValue()).a.c.getValue());
        if (x == null || (n7qVar = x.a) == null) {
            return null;
        }
        u8n u8nVar = (u8n) wdg.A(n7qVar, new b3i(26));
        a0q id = n7qVar.g().getId();
        mwk b2 = n7qVar.b();
        int D = c9g.D(n7qVar);
        id.getClass();
        b2.getClass();
        vgd vgdVar = (vgd) dag.p(b2, new cib(4, Integer.valueOf(D)));
        if (vgdVar == null) {
            vgdVar = (vgd) o8g.i(id, new xgd(u8nVar, false, b2.c().a, true, b2.a(), Integer.valueOf(D)));
        }
        ssg.a(3, "PultPickerTargetProvider:CurrentPlaybackProvider", "glagolCastTarget: " + vgdVar, null);
        return vgdVar;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l2n);
    }

    public final int hashCode() {
        return -1425644710;
    }

    public final String toString() {
        return "CurrentPlaybackProvider";
    }
}
