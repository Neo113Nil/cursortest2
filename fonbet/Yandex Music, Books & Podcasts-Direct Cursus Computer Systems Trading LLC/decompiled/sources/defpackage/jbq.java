package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jbq extends maq {
    public final bbq b;
    public final gxc c;
    public final eu7 d;
    public final nyn e;
    public final b3l f;
    public final long g;
    public final eu7 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final Object m;
    public final Object n;
    public final jyr o;

    public jbq(bbq bbqVar, gxc gxcVar, eu7 eu7Var, nyn nynVar, b3l b3lVar, long j) {
        bbqVar.getClass();
        gxcVar.getClass();
        eu7Var.getClass();
        this.b = bbqVar;
        this.c = gxcVar;
        this.d = eu7Var;
        this.e = nynVar;
        this.f = b3lVar;
        this.g = j;
        this.h = eu7Var;
        du7 du7Var = eu7Var.b;
        int i = du7Var.a;
        this.i = i;
        int c = eu7Var.a.c(i);
        this.j = c;
        this.k = du7Var.b;
        this.l = c;
        bwf bwfVar = bwf.b;
        final int i2 = 0;
        this.m = btf.a(bwfVar, new Function0(this) { // from class: ibq
            public final /* synthetic */ jbq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                a0q a0qVar;
                switch (i2) {
                    case 0:
                        jbq jbqVar = this.b;
                        gxj t = jbqVar.t(1);
                        if (t != null) {
                            return jbqVar.p(t.a);
                        }
                        return null;
                    case 1:
                        jbq jbqVar2 = this.b;
                        gxj t2 = jbqVar2.t(-1);
                        if (t2 != null) {
                            return jbqVar2.p(t2.a);
                        }
                        return null;
                    default:
                        List n = this.b.n();
                        HashSet hashSet = new HashSet();
                        Iterator it = n.iterator();
                        while (it.hasNext()) {
                            izs I = q7g.I(((naq) it.next()).d);
                            if (I instanceof e6v) {
                                a0qVar = ((e6v) I).getEntity().getId();
                            } else {
                                if (!I.equals(hzs.a)) {
                                    b6e.s();
                                    return null;
                                }
                                a0qVar = null;
                            }
                            if (a0qVar != null) {
                                hashSet.add(a0qVar);
                            }
                        }
                        return hashSet;
                }
            }
        });
        final int i3 = 1;
        this.n = btf.a(bwfVar, new Function0(this) { // from class: ibq
            public final /* synthetic */ jbq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                a0q a0qVar;
                switch (i3) {
                    case 0:
                        jbq jbqVar = this.b;
                        gxj t = jbqVar.t(1);
                        if (t != null) {
                            return jbqVar.p(t.a);
                        }
                        return null;
                    case 1:
                        jbq jbqVar2 = this.b;
                        gxj t2 = jbqVar2.t(-1);
                        if (t2 != null) {
                            return jbqVar2.p(t2.a);
                        }
                        return null;
                    default:
                        List n = this.b.n();
                        HashSet hashSet = new HashSet();
                        Iterator it = n.iterator();
                        while (it.hasNext()) {
                            izs I = q7g.I(((naq) it.next()).d);
                            if (I instanceof e6v) {
                                a0qVar = ((e6v) I).getEntity().getId();
                            } else {
                                if (!I.equals(hzs.a)) {
                                    b6e.s();
                                    return null;
                                }
                                a0qVar = null;
                            }
                            if (a0qVar != null) {
                                hashSet.add(a0qVar);
                            }
                        }
                        return hashSet;
                }
            }
        });
        final int i4 = 2;
        this.o = btf.b(new Function0(this) { // from class: ibq
            public final /* synthetic */ jbq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                a0q a0qVar;
                switch (i4) {
                    case 0:
                        jbq jbqVar = this.b;
                        gxj t = jbqVar.t(1);
                        if (t != null) {
                            return jbqVar.p(t.a);
                        }
                        return null;
                    case 1:
                        jbq jbqVar2 = this.b;
                        gxj t2 = jbqVar2.t(-1);
                        if (t2 != null) {
                            return jbqVar2.p(t2.a);
                        }
                        return null;
                    default:
                        List n = this.b.n();
                        HashSet hashSet = new HashSet();
                        Iterator it = n.iterator();
                        while (it.hasNext()) {
                            izs I = q7g.I(((naq) it.next()).d);
                            if (I instanceof e6v) {
                                a0qVar = ((e6v) I).getEntity().getId();
                            } else {
                                if (!I.equals(hzs.a)) {
                                    b6e.s();
                                    return null;
                                }
                                a0qVar = null;
                            }
                            if (a0qVar != null) {
                                hashSet.add(a0qVar);
                            }
                        }
                        return hashSet;
                }
            }
        });
    }

    public static jbq m(jbq jbqVar, eu7 eu7Var, nyn nynVar, int i) {
        bbq bbqVar = jbqVar.b;
        gxc gxcVar = jbqVar.c;
        if ((i & 4) != 0) {
            eu7Var = jbqVar.d;
        }
        eu7 eu7Var2 = eu7Var;
        if ((i & 8) != 0) {
            nynVar = jbqVar.e;
        }
        b3l b3lVar = jbqVar.f;
        long j = jbqVar.g;
        jbqVar.getClass();
        bbqVar.getClass();
        gxcVar.getClass();
        eu7Var2.getClass();
        return new jbq(bbqVar, gxcVar, eu7Var2, nynVar, b3lVar, j);
    }

    @Override // defpackage.n7q
    public final b3l c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbq)) {
            return false;
        }
        jbq jbqVar = (jbq) obj;
        return Intrinsics.d(this.b, jbqVar.b) && Intrinsics.d(this.c, jbqVar.c) && Intrinsics.d(this.d, jbqVar.d) && this.e == jbqVar.e && this.f.equals(jbqVar.f) && this.g == jbqVar.g;
    }

    @Override // defpackage.n7q
    public final u3q g() {
        return this.b;
    }

    @Override // defpackage.n7q
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final faq b() {
        naq naqVar = (naq) CollectionsKt.S(n(), this.l);
        return naqVar != null ? naqVar : new qaq(uow.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.maq
    public final int i() {
        return this.l;
    }

    @Override // defpackage.maq
    public final List j() {
        return n();
    }

    @Override // defpackage.maq
    public final f5q k() {
        return this.b;
    }

    public final List n() {
        return this.h.a.a.getElements();
    }

    public final Set o() {
        return (Set) this.o.getValue();
    }

    public final naq p(int i) {
        naq naqVar = (naq) CollectionsKt.S(n(), i);
        if (naqVar != null) {
            return naqVar;
        }
        naq naqVar2 = (naq) CollectionsKt.S(q(), i - n().size());
        if (naqVar2 != null) {
            return naqVar2;
        }
        return null;
    }

    public final List q() {
        return this.h.a.b;
    }

    public final List r() {
        fyu s = s();
        if (s instanceof eyu) {
            return ((eyu) s).a;
        }
        if (Intrinsics.d(s, dyu.a)) {
            return null;
        }
        b6e.s();
        return null;
    }

    public final fyu s() {
        return (fyu) this.h.a.e.getValue();
    }

    public final gxj t(int i) {
        int i2;
        int ordinal = this.e.ordinal();
        int i3 = this.i;
        if (ordinal == 0 || ordinal == 1) {
            i2 = i + i3;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return null;
            }
            if (n().size() == 0) {
                i2 = 0;
            } else {
                i2 = (n().size() + (i3 + i)) % n().size();
            }
        }
        eu7 eu7Var = this.d;
        if (eu7Var.a.f(i2)) {
            return new gxj(eu7Var.a.c(i2));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [arf, java.lang.Object] */
    public final String toString() {
        naq naqVar = (naq) this.n.getValue();
        naq naqVar2 = (naq) CollectionsKt.S(n(), this.l);
        naq naqVar3 = (naq) this.m.getValue();
        String a = gxj.a(this.j);
        String a2 = ran.a(this.i);
        String J = w1g.J(n());
        String J2 = w1g.J(this.h.a.a.f());
        String J3 = w1g.J(q());
        fyu s = s();
        StringBuilder sb = new StringBuilder("SharedYnisonWaveState(playbackEntity=");
        sb.append(this.b);
        sb.append(", previous=");
        sb.append(naqVar);
        sb.append(", current=");
        sb.append(naqVar2);
        sb.append(", pending=");
        sb.append(naqVar3);
        sb.append(", originalPosition=");
        su4.v(sb, a, ", queuePosition=", a2, ", fixedPlayablesInOriginalOrder=");
        su4.v(sb, J, ", fixedPlayablesInQueueOrder=", J2, ", recommendedPlayables=");
        sb.append(J3);
        sb.append(", shuffleState=");
        sb.append(s);
        sb.append(", repeatModeType=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
