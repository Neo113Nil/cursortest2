package defpackage;

import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.c;

/* loaded from: classes5.dex */
public final class z5l {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;

    public z5l() {
        bdt I = hag.I(vyk.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(w2h.class), true);
        this.c = l18Var.b(hag.I(oq7.class), true);
        this.d = l18Var.b(hag.I(uaa.class), true);
        this.e = l18Var.b(hag.I(yx4.class), true);
        this.f = l18Var.b(hag.I(q7l.class), true);
    }

    public static yk3 e(z5l z5lVar, Function1 function1) {
        z5lVar.getClass();
        return ((e3q) z5lVar.a()).d(new tx4(function1, null, 1), uyk.a, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yk3 g(z5l z5lVar, c cVar, a6l a6lVar, t0q t0qVar, mqs mqsVar, int i, int i2, hyn hynVar, oq oqVar, uyk uykVar, Function1 function1, int i3) {
        t0q r0qVar = (i3 & 4) != 0 ? new r0q(0) : t0qVar;
        int i4 = (i3 & 16) != 0 ? -1 : i;
        int i5 = (i3 & 32) != 0 ? 0 : i2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        hyn hynVar2 = (i3 & 128) != 0 ? null : hynVar;
        oq oqVar2 = (i3 & 256) != 0 ? null : oqVar;
        uyk uykVar2 = (i3 & 1024) != 0 ? uyk.a : uykVar;
        boolean z = (i3 & 4096) == 0;
        z5lVar.getClass();
        cVar.getClass();
        function1.getClass();
        uyk uykVar3 = uykVar2;
        sfm sfmVar = new sfm(new hv0(function1, objArr2 == true ? 1 : 0, 27));
        pe5 pe5Var = new pe5(new v80(cVar.a(), a6lVar.a, a6lVar.b), null);
        tb tbVar = new tb(objArr == true ? 1 : 0);
        int i6 = i5 != 0 ? i5 : 0;
        hyn hynVar3 = hynVar2 != null ? hynVar2 : null;
        if (oqVar2 != null) {
            tbVar = new tb(oqVar2);
        }
        se5 se5Var = new se5(new ubn(), cVar, sfmVar, hynVar3, i6, null, mqsVar, i4, -1L, pe5Var, tbVar, z, null, r0qVar);
        return z ? z5lVar.f(se5Var, uykVar3) : z5lVar.d(se5Var, true, uykVar3);
    }

    public static yk3 h(z5l z5lVar, c cVar, xpt xptVar, oq oqVar, List list, a6l a6lVar, int i) {
        mqs mqsVar;
        String str;
        Object obj;
        Continuation continuation = null;
        oq oqVar2 = (i & 4) != 0 ? null : oqVar;
        z5lVar.getClass();
        jyr jyrVar = z5lVar.b;
        cVar.getClass();
        list.getClass();
        t0q s0qVar = xptVar != null ? new s0q() : new r0q(0);
        if (xptVar == null || (str = xptVar.c) == null) {
            mqsVar = null;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((mqs) obj).a, str)) {
                    break;
                }
            }
            mqsVar = (mqs) obj;
        }
        Integer num = xptVar != null ? xptVar.b : null;
        int i2 = xptVar != null ? xptVar.h : 0;
        int i3 = i2 == 0 ? -1 : y5l.a[ouj.D(i2)];
        if (i3 != -1) {
            if (i3 == 1) {
                ((w2h) jyrVar.getValue()).a(true);
            } else if (i3 == 2) {
                ((w2h) jyrVar.getValue()).a(false);
            } else if (i3 != 3) {
                b6e.s();
                return null;
            }
        }
        return g(z5lVar, cVar, a6lVar, s0qVar, mqsVar, num != null ? num.intValue() : -1, xptVar != null ? xptVar.d : 0, xptVar != null ? xptVar.e : null, oqVar2, uyk.a, new e50(list, continuation, 10), 22592);
    }

    public final vyk a() {
        return (vyk) this.a.getValue();
    }

    public final boolean b(String str) {
        str.getClass();
        d6l x = p6g.x((e6l) ((oq7) this.c.getValue()).a.c.getValue());
        n7q n7qVar = x != null ? x.a : null;
        return n7qVar != null && up6.B(n7qVar, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(c cVar, mqs mqsVar, boolean z) {
        n7q n7qVar;
        mwk b;
        mwk b2;
        izs D;
        cVar.getClass();
        nyk nykVar = cVar.b;
        mqsVar.getClass();
        izs izsVar = null;
        jyr jyrVar = this.c;
        if (z) {
            d6l x = p6g.x((e6l) ((oq7) jyrVar.getValue()).a.d.getValue());
            if (x != null) {
                n7qVar = x.a;
            }
            n7qVar = null;
        } else {
            d6l x2 = p6g.x((e6l) ((oq7) jyrVar.getValue()).a.c.getValue());
            if (x2 != null) {
                n7qVar = x2.a;
            }
            n7qVar = null;
        }
        u3q g = n7qVar != null ? n7qVar.g() : null;
        if (g instanceof z3q) {
            return nykVar.b == null ? mqsVar.equals(n7qVar.b().a()) : mqsVar.equals(n7qVar.b().a()) && Intrinsics.d(((z3q) g).getId().getId(), nykVar.b);
        }
        r3q a = t3q.a(cVar, (n7qVar == null || (b2 = n7qVar.b()) == null || (D = rvf.D(b2)) == null) ? null : swf.K(D), null, new d1j(24, n7qVar));
        if (n7qVar != null && (b = n7qVar.b()) != null) {
            izsVar = rvf.D(b);
        }
        if (izsVar instanceof e6v) {
            e6v e6vVar = (e6v) izsVar;
            if (e6vVar instanceof b6v) {
                r3q r3qVar = ((b6v) e6vVar).a;
                boolean z2 = (r3qVar.getId() instanceof cd5) && (a.getId() instanceof cd5);
                boolean z3 = (r3qVar.g() instanceof qyt) && (a.g() instanceof qyt);
                if ((z2 || Intrinsics.d(r3qVar.getId(), a.getId())) && ((z3 || Intrinsics.d(r3qVar.g(), a.g())) && mqsVar.equals(n7qVar.b().a()))) {
                }
            } else if (!(e6vVar instanceof d6v)) {
                b6e.s();
                return false;
            }
        } else if (!Intrinsics.d(izsVar, hzs.a) && izsVar != null) {
            b6e.s();
            return false;
        }
    }

    public final yk3 d(v8n v8nVar, boolean z, uyk uykVar) {
        v8nVar.getClass();
        e3q e3qVar = (e3q) a();
        e3qVar.getClass();
        return e3qVar.d(new ad0(v8nVar, null, 2), uykVar, z);
    }

    public final yk3 f(se5 se5Var, uyk uykVar) {
        e3q e3qVar = (e3q) a();
        e3qVar.getClass();
        yk3 yk3Var = new yk3(11);
        fyk c = e3qVar.c(uykVar, yk3Var, new qs(se5Var, null, 10), true, null);
        ssg.a(3, e3q.k, "startSecondary(mode=" + uykVar + ") with " + c, null);
        ((k1l) e3qVar.j.getValue()).b(c, new b3t("start_queue"));
        return yk3Var;
    }

    public final boolean i(boolean z) {
        e3q e3qVar = (e3q) a();
        boolean C = z ? p6g.C((e6l) ((oq7) e3qVar.a.getValue()).a.d.getValue()) : p6g.C((e6l) ((oq7) e3qVar.a.getValue()).a.c.getValue());
        ((k1l) e3qVar.i.getValue()).a(new ToggleCommand(z), new b3t("core_toggle"));
        return !C;
    }
}
