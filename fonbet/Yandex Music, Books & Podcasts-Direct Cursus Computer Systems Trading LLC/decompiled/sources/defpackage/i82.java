package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public final class i82 {
    public final ac0 a;

    public i82(ac0 ac0Var) {
        this.a = ac0Var;
    }

    public final String a() {
        return ((frt) this.a.l.getValue()).c().a;
    }

    public final Object b(Integer num, cg6 cg6Var) {
        String a = a();
        a.getClass();
        sca scaVar = (sca) this.a.i.getValue();
        List list = dw.MyMusicAlbums.a;
        Serializable e = scaVar.e(a, vz1.k(list, list), Boolean.FALSE, num, cg6Var);
        return e == nm6.a ? e : (List) e;
    }

    public final Serializable c(Integer num, aur aurVar) {
        String a = a();
        a.getClass();
        sca scaVar = (sca) this.a.i.getValue();
        List list = dw.MyMusicBooks.a;
        return scaVar.e(a, vz1.k(list, list), Boolean.FALSE, num, aurVar);
    }

    public final Serializable d(Integer num, Boolean bool, cg6 cg6Var) {
        String a = a();
        a.getClass();
        eka ekaVar = (eka) this.a.g.getValue();
        List list = dw.MyMusicBooks.a;
        return ekaVar.a(a, vz1.k(list, list), Boolean.FALSE, num, bool, cg6Var);
    }

    public final Serializable e(Integer num, Boolean bool, cg6 cg6Var) {
        String a = a();
        a.getClass();
        return ((eka) this.a.g.getValue()).a(a, null, Boolean.TRUE, num, bool, cg6Var);
    }

    public final Object f(Integer num, aur aurVar) {
        String a = a();
        a.getClass();
        sca scaVar = (sca) this.a.i.getValue();
        List list = dw.MyMusicPodcasts.a;
        Serializable e = scaVar.e(a, vz1.k(list, list), Boolean.FALSE, num, aurVar);
        return e == nm6.a ? e : (List) e;
    }

    public final Serializable g(Integer num, Boolean bool, cg6 cg6Var) {
        String a = a();
        a.getClass();
        eka ekaVar = (eka) this.a.g.getValue();
        List list = gys.MyMusicPodcastEpisodes.a;
        return ekaVar.a(a, vz1.k(list, list), Boolean.FALSE, num, bool, cg6Var);
    }

    public final Object h(Integer num, cg6 cg6Var) {
        String a = a();
        a.getClass();
        eka ekaVar = (eka) this.a.g.getValue();
        List list = gys.MyMusicWithKids.a;
        list.getClass();
        Serializable a2 = ekaVar.a(a, new thn(list), Boolean.FALSE, num, null, cg6Var);
        return a2 == nm6.a ? a2 : (List) a2;
    }
}
