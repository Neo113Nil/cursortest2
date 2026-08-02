package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class y42 {
    public final ac0 a;
    public final jyr b;
    public final jyr c;

    public y42(ac0 ac0Var) {
        this.a = ac0Var;
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: x42
            public final /* synthetic */ y42 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (qb0) this.b.a.o.getValue();
                    default:
                        return (yc0) this.b.a.n.getValue();
                }
            }
        });
        final int i2 = 1;
        this.c = btf.b(new Function0(this) { // from class: x42
            public final /* synthetic */ y42 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (qb0) this.b.a.o.getValue();
                    default:
                        return (yc0) this.b.a.n.getValue();
                }
            }
        });
    }

    public final String a() {
        return ((frt) this.a.l.getValue()).c().a;
    }

    public final Object b(Integer num, cg6 cg6Var) {
        String a = a();
        a.getClass();
        qb0 qb0Var = (qb0) this.b.getValue();
        qb0Var.getClass();
        et etVar = (et) qb0Var.a.getValue();
        etVar.getClass();
        List list = dw.MyMusicAlbums.a;
        Object e = et.e(etVar, a, vz1.k(list, list), Boolean.FALSE, num, cg6Var, 32);
        nm6 nm6Var = nm6.a;
        if (e != nm6Var) {
            e = (List) e;
        }
        return e == nm6Var ? e : (List) e;
    }

    public final Object c(Integer num, cg6 cg6Var) {
        String a = a();
        a.getClass();
        qb0 qb0Var = (qb0) this.b.getValue();
        qb0Var.getClass();
        et etVar = (et) qb0Var.a.getValue();
        etVar.getClass();
        List list = dw.MyMusicBooks.a;
        Object e = et.e(etVar, a, vz1.k(list, list), null, num, cg6Var, 40);
        nm6 nm6Var = nm6.a;
        if (e != nm6Var) {
            e = (List) e;
        }
        return e == nm6Var ? e : (List) e;
    }

    public final Object d(Integer num, cg6 cg6Var) {
        String a = a();
        a.getClass();
        rus rusVar = (rus) this.a.j.getValue();
        String a2 = a();
        rusVar.getClass();
        List list = dw.MyMusicBooks.a;
        Serializable b = rusVar.b(a, a2, vz1.k(list, list), Boolean.FALSE, num, cg6Var);
        return b == nm6.a ? b : (List) b;
    }

    public final Object e(Integer num, cg6 cg6Var) {
        String a = a();
        a.getClass();
        rus rusVar = (rus) this.a.j.getValue();
        String a2 = a();
        rusVar.getClass();
        List list = gys.MyMusicPodcastEpisodes.a;
        Serializable b = rusVar.b(a, a2, vz1.k(list, list), Boolean.FALSE, num, cg6Var);
        return b == nm6.a ? b : (List) b;
    }

    public final Object f(Integer num, cg6 cg6Var) {
        String a = a();
        a.getClass();
        qb0 qb0Var = (qb0) this.b.getValue();
        Boolean bool = Boolean.TRUE;
        qb0Var.getClass();
        et etVar = (et) qb0Var.a.getValue();
        etVar.getClass();
        Object e = et.e(etVar, a, null, bool, num, cg6Var, 34);
        nm6 nm6Var = nm6.a;
        if (e != nm6Var) {
            e = (List) e;
        }
        return e == nm6Var ? e : (List) e;
    }

    public final Serializable g(Integer num, cg6 cg6Var) {
        String a = a();
        a.getClass();
        rtl rtlVar = (rtl) this.a.k.getValue();
        rtlVar.getClass();
        Boolean bool = Boolean.TRUE;
        return rtlVar.a(a, bool, bool, num, cg6Var);
    }

    public final Serializable h(Integer num, cg6 cg6Var) {
        String a = a();
        a.getClass();
        return ((rus) this.a.j.getValue()).b(a, a(), null, Boolean.TRUE, num, cg6Var);
    }

    public final Object i(Integer num, cg6 cg6Var) {
        String a = a();
        a.getClass();
        qb0 qb0Var = (qb0) this.b.getValue();
        qb0Var.getClass();
        et etVar = (et) qb0Var.a.getValue();
        etVar.getClass();
        List list = dw.MyMusicPodcasts.a;
        Object e = et.e(etVar, a, vz1.k(list, list), Boolean.FALSE, num, cg6Var, 32);
        nm6 nm6Var = nm6.a;
        if (e != nm6Var) {
            e = (List) e;
        }
        return e == nm6Var ? e : (List) e;
    }
}
