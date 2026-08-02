package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class fmu {
    public static final cmu b = new cmu(new s9p(t75.c(r9p.a)));
    public final vtm a;

    public fmu(wul wulVar, vtm vtmVar) {
        this.a = vtmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(eu7 eu7Var, cg6 cg6Var) {
        emu emuVar;
        int i;
        Continuation continuation;
        Object obj;
        u3q m3qVar;
        boolean z;
        rr5 d;
        jzs jzsVar;
        rr5 rr5Var;
        s9p c;
        fuu fuuVar;
        if (cg6Var instanceof emu) {
            emuVar = (emu) cg6Var;
            int i2 = emuVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                emuVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = emuVar.l;
                nm6 nm6Var = nm6.a;
                i = emuVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    List f = eu7Var.a.a.f();
                    ListIterator listIterator = f.listIterator(f.size());
                    while (true) {
                        continuation = null;
                        if (!listIterator.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        obj = listIterator.previous();
                        if (((jzs) obj).a.p()) {
                            break;
                        }
                    }
                    jzs jzsVar2 = (jzs) obj;
                    cmu cmuVar = b;
                    if (jzsVar2 == null) {
                        return cmuVar;
                    }
                    mqs mqsVar = jzsVar2.a;
                    izs izsVar = jzsVar2.g;
                    boolean z2 = izsVar instanceof e6v;
                    ryt rytVar = ryt.a;
                    if (z2) {
                        e6v e6vVar = (e6v) izsVar;
                        if (!(e6vVar instanceof b6v)) {
                            if (e6vVar instanceof d6v) {
                                dfi.r("Developer Error. Shouldn't try to start autoflow when rotor session is already started", "WaveAutoflowHelper");
                                return cmuVar;
                            }
                            b6e.s();
                            return null;
                        }
                        m3qVar = ((b6v) e6vVar).a;
                    } else {
                        if (!Intrinsics.d(izsVar, hzs.a)) {
                            b6e.s();
                            return null;
                        }
                        m3qVar = new m3q(new cd5(t75.c(mqsVar.a)), rytVar);
                    }
                    Iterator it = f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        u3q J = swf.J(((jzs) it.next()).g);
                        if (!Intrinsics.d(J != null ? J.getId() : null, m3qVar.getId())) {
                            z = true;
                            break;
                        }
                    }
                    d = mqsVar.d();
                    if (z) {
                        return new cmu(wul.c(d));
                    }
                    if (m3qVar instanceof j3q) {
                        StationId a = StationId.a(((j3q) m3qVar).a.a);
                        a.getClass();
                        return new cmu(o8g.E(c9g.E(a)));
                    }
                    if (m3qVar instanceof l3q) {
                        StationId b2 = StationId.b(((l3q) m3qVar).a.a);
                        b2.getClass();
                        return new cmu(o8g.E(c9g.E(b2)));
                    }
                    if (m3qVar instanceof p3q) {
                        bd5 bd5Var = ((p3q) m3qVar).a;
                        if (bd5Var instanceof zc5) {
                            String q = hag.q((zc5) bd5Var);
                            if (q.equals("414787002:1076")) {
                                c = new s9p(t75.c(r9p.a));
                            } else {
                                StationId l = StationId.l(q);
                                l.getClass();
                                c = o8g.E(c9g.E(l));
                            }
                        } else {
                            if (!(bd5Var instanceof ad5)) {
                                b6e.s();
                                return null;
                            }
                            c = wul.c(d);
                        }
                        return new cmu(c);
                    }
                    if (!(m3qVar instanceof m3q)) {
                        b6e.s();
                        return null;
                    }
                    tyt tytVar = ((m3q) m3qVar).b;
                    if (!(tytVar instanceof qyt)) {
                        if (Intrinsics.d(tytVar, cyt.a) || Intrinsics.d(tytVar, dyt.a) || Intrinsics.d(tytVar, eyt.a) || Intrinsics.d(tytVar, rytVar) || Intrinsics.d(tytVar, syt.a)) {
                            return new cmu(wul.c(d));
                        }
                        b6e.s();
                        return null;
                    }
                    pyt pytVar = ((qyt) tytVar).b;
                    if (pytVar != null) {
                        emuVar.j = jzsVar2;
                        emuVar.k = d;
                        emuVar.n = 1;
                        obj2 = x97.V(dm6.b, new ocu(pytVar, this.a, f, continuation, 1), emuVar);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                        jzsVar = jzsVar2;
                        rr5Var = d;
                    }
                    return new cmu(wul.c(d));
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rr5Var = emuVar.k;
                jzsVar = emuVar.j;
                qgg.h0(obj2);
                fuuVar = (fuu) obj2;
                if (fuuVar != null) {
                    d = rr5Var;
                    return new cmu(wul.c(d));
                }
                List list = fuuVar.b;
                return list.isEmpty() ? new cmu(wul.c(rr5Var)) : new bmu(list, fuuVar.a, jzsVar.b);
            }
        }
        emuVar = new emu(this, cg6Var);
        Object obj22 = emuVar.l;
        nm6 nm6Var2 = nm6.a;
        i = emuVar.n;
        if (i != 0) {
        }
        fuuVar = (fuu) obj22;
        if (fuuVar != null) {
        }
    }
}
