package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.music_starter.executor.VideoClipQueueStartCommand;
import com.yandex.music.shared.music_starter.executor.WaveQueueStartCommand;
import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import com.yandex.music.shared.playback.api.commands.VolumeMuteCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.queue.DoNotLaunchQueueStartException;

/* loaded from: classes3.dex */
public final class g0l {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final byk e = new byk(0);

    public g0l(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
        this.d = jyrVar4;
    }

    public static void d(g0l g0lVar) {
        ((k1l) g0lVar.b.getValue()).a(new ToggleCommand(false), new b3t("core_toggle"));
    }

    public static void f(g0l g0lVar, oq oqVar, kcr kcrVar, LinkedList linkedList, kxi kxiVar, x5l x5lVar, String str) {
        evk evkVar = new evk(22);
        g0lVar.getClass();
        oqVar.getClass();
        String str2 = oqVar.a;
        linkedList.getClass();
        kxiVar.getClass();
        a6l a = kxiVar.a(weo.t());
        Boolean bool = a4g.A(oqVar) ? Boolean.FALSE : null;
        g0lVar.k(ybl.h(new b6v(new j3q(new xc5(str2), new n3q(oqVar.b), i3q.a)), linkedList, new v80(str, a.a, a.b), new ezu(kcrVar, bool), false), new xc5(str2), kcrVar, b0l.b, a4g.A(oqVar) ? nyn.a : null, a, x5lVar, str, evkVar);
    }

    public static void g(g0l g0lVar, String str, kcr kcrVar, kxi kxiVar, x5l x5lVar, String str2, v3g v3gVar, nyn nynVar, Boolean bool, String str3, s8i s8iVar, int i) {
        v3g v3gVar2 = (i & 32) != 0 ? b0l.b : v3gVar;
        nyn nynVar2 = (i & 64) != 0 ? null : nynVar;
        Boolean bool2 = (i & 128) != 0 ? null : bool;
        boolean z = (i & 256) != 0;
        String str4 = (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? null : str3;
        Function1 evkVar = (i & 1024) != 0 ? new evk(27) : s8iVar;
        g0lVar.getClass();
        str.getClass();
        kxiVar.getClass();
        str2.getClass();
        xc5 xc5Var = new xc5(str);
        if (str4 == null) {
            str4 = weo.t();
        }
        a6l a = kxiVar.a(str4);
        if (z && g0lVar.b(kcrVar, xc5Var, null)) {
            d(g0lVar);
        } else {
            Boolean bool3 = bool2;
            j(g0lVar, new c5h(xc5Var, str2, a, kcrVar, bool3, null, 1), v3gVar2, nynVar2, bool3, a, x5lVar, str2, evkVar);
        }
    }

    public static void h(g0l g0lVar, String str, kcr kcrVar, kxi kxiVar, w5l w5lVar, String str2, v3g v3gVar, nyn nynVar, Boolean bool, String str3, int i) {
        v3g v3gVar2 = (i & 32) != 0 ? b0l.b : v3gVar;
        nyn nynVar2 = (i & 64) != 0 ? null : nynVar;
        Boolean bool2 = (i & 128) != 0 ? null : bool;
        boolean z = (i & 256) != 0;
        String str4 = (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? str3 : null;
        evk evkVar = new evk(28);
        g0lVar.getClass();
        str.getClass();
        kxiVar.getClass();
        str2.getClass();
        yc5 yc5Var = new yc5(str);
        if (str4 == null) {
            str4 = weo.t();
        }
        a6l a = kxiVar.a(str4);
        if (!(kcrVar instanceof hcr) || !g0lVar.e(yc5Var, false)) {
            Boolean bool3 = bool2;
            j(g0lVar, new c5h(yc5Var, str2, a, kcrVar, bool3, null, 2), v3gVar2, nynVar2, bool3, a, w5lVar, str2, evkVar);
        } else if (z) {
            d(g0lVar);
        }
    }

    public static void j(g0l g0lVar, Function1 function1, v3g v3gVar, nyn nynVar, Boolean bool, a6l a6lVar, x5l x5lVar, String str, Function1 function12) {
        g0lVar.i(function1, v3gVar, nynVar, bool, a6lVar, x5lVar, new jyu(new c5q(new qfn(str), a6lVar.a)), function12);
    }

    public static void l(g0l g0lVar, cvl cvlVar, kcr kcrVar, List list, kxi kxiVar, x5l x5lVar, String str) {
        dd5 cd5Var;
        evk evkVar = new evk(20);
        g0lVar.getClass();
        cvlVar.getClass();
        kcrVar.getClass();
        list.getClass();
        kxiVar.getClass();
        a6l a = kxiVar.a(weo.t());
        ezu ezuVar = new ezu(kcrVar, null);
        wsu h = ybl.h(new b6v(y5g.y0(cvlVar, o3q.b)), list, new v80(str, a.a, a.b), ezuVar, false);
        bd5 A = i9w.A(cvlVar.g().d(), null);
        if (A != null) {
            cd5Var = A;
        } else {
            List list2 = list;
            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((mqs) it.next()).a);
            }
            cd5Var = new cd5(arrayList);
        }
        g0lVar.k(h, cd5Var, kcrVar, b0l.b, null, a, x5lVar, str, evkVar);
    }

    public static void m(g0l g0lVar, String str, kcr kcrVar, kxi kxiVar, x5l x5lVar, String str2, v3g v3gVar, nyn nynVar, Boolean bool, String str3, int i) {
        v3g v3gVar2 = (i & 32) != 0 ? b0l.b : v3gVar;
        nyn nynVar2 = (i & 64) != 0 ? null : nynVar;
        Boolean bool2 = (i & 128) != 0 ? null : bool;
        boolean z = (i & 256) != 0;
        String str4 = (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? null : str3;
        evk evkVar = new evk(18);
        g0lVar.getClass();
        str.getClass();
        kxiVar.getClass();
        str2.getClass();
        bd5 A = i9w.A(str, null);
        if (A == null) {
            return;
        }
        if (str4 == null) {
            str4 = weo.t();
        }
        a6l a = kxiVar.a(str4);
        if (z && g0lVar.b(kcrVar, A, null)) {
            d(g0lVar);
        } else {
            Boolean bool3 = bool2;
            j(g0lVar, new c5h(A, str2, a, kcrVar, bool3, null, 3), v3gVar2, nynVar2, bool3, a, x5lVar, str2, evkVar);
        }
    }

    public static void o(g0l g0lVar, kcr kcrVar, List list, kxi kxiVar, x5l x5lVar, String str, r3q r3qVar, int i) {
        boolean z = (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0;
        evk evkVar = new evk(19);
        g0lVar.getClass();
        list.getClass();
        kxiVar.getClass();
        if (z && (kcrVar instanceof hcr) && g0lVar.e(r3qVar.getId(), false)) {
            d(g0lVar);
        } else {
            g0lVar.n(kcrVar, new e50(list, null, 9), kxiVar, x5lVar, str, new s8i(14, r3qVar), b0l.b, z, evkVar);
        }
    }

    public static void p(g0l g0lVar, kcr kcrVar, ArrayList arrayList, r3q r3qVar, kxi kxiVar, x5l x5lVar, String str, w1g w1gVar, Function1 function1, int i) {
        boolean d;
        mwk b;
        boolean z;
        nyn nynVar = nyn.c;
        if ((i & 64) != 0) {
            nynVar = nyn.a;
        }
        nyn nynVar2 = nynVar;
        int i2 = i & 128;
        r5t r5tVar = r5t.a;
        w1g w1gVar2 = i2 != 0 ? r5tVar : w1gVar;
        Function1 evkVar = (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? new evk(16) : function1;
        kxiVar.getClass();
        n7q c = g0lVar.c(true);
        Continuation continuation = null;
        if (kcrVar.equals(hcr.a)) {
            d = g0lVar.e(r3qVar.getId(), true);
        } else if (kcrVar instanceof icr) {
            d = false;
        } else {
            if (!(kcrVar instanceof jcr)) {
                b6e.s();
                return;
            }
            d = Intrinsics.d((c == null || (b = c.b()) == null) ? null : b.a(), ((jcr) kcrVar).a);
        }
        if (d) {
            d(g0lVar);
            return;
        }
        a6l a = kxiVar.a(weo.t());
        gxc gxcVar = a.a;
        if (g0lVar.a(a, evkVar)) {
            Boolean bool = Boolean.FALSE;
            WaveQueueStartCommand waveQueueStartCommand = new WaveQueueStartCommand(new gnf(ybl.h(new b6v(r3qVar), arrayList, new v80(str, gxcVar, a.b), new ezu(kcrVar, bool), true), continuation, 2), new jyu(new c5q(new qfn(str), gxcVar)), nynVar2, bool, true, a, q0q.a, true, evkVar);
            g0lVar.e.c(x5lVar, gxcVar);
            if (w1gVar2.equals(r5tVar)) {
                z = false;
            } else {
                if (!w1gVar2.equals(s5t.a)) {
                    b6e.s();
                    return;
                }
                z = true;
            }
            g0lVar.t(waveQueueStartCommand, true, true, z);
        }
    }

    public static void r(g0l g0lVar, String str, List list, wmn wmnVar, kxi kxiVar, u5l u5lVar, kcr kcrVar, Function0 function0, int i) {
        q9u o9uVar;
        q9u q9uVar;
        Function0 aokVar = (i & 256) != 0 ? new aok(10) : function0;
        evk evkVar = new evk(29);
        g0lVar.getClass();
        wmnVar.getClass();
        kxiVar.getClass();
        if (kcrVar instanceof hcr) {
            q9uVar = null;
        } else {
            if (kcrVar instanceof icr) {
                o9uVar = new p9u(((icr) kcrVar).a);
            } else {
                if (!(kcrVar instanceof jcr)) {
                    b6e.s();
                    return;
                }
                o9uVar = new o9u(((jcr) kcrVar).a.a);
            }
            q9uVar = o9uVar;
        }
        g0lVar.q(str, list != null ? new r6u(list, wmnVar) : q6u.a, q9uVar, kxiVar, u5lVar, b0l.b, aokVar, evkVar);
    }

    public static void s(g0l g0lVar, s9p s9pVar, kxi kxiVar, x5l x5lVar, pfn pfnVar, v3g v3gVar, t0q t0qVar, String str, Function1 function1, int i) {
        v3g v3gVar2 = (i & 32) != 0 ? b0l.b : v3gVar;
        t0q t0qVar2 = (i & 64) != 0 ? q0q.a : t0qVar;
        Continuation continuation = null;
        String str2 = (i & 128) != 0 ? null : str;
        Function1 evkVar = (i & 256) != 0 ? new evk(17) : function1;
        g0lVar.getClass();
        s9pVar.getClass();
        kxiVar.getClass();
        x5lVar.getClass();
        pfnVar.getClass();
        if (str2 == null) {
            str2 = weo.t();
        }
        a6l a = kxiVar.a(str2);
        gxc gxcVar = a.a;
        if (g0lVar.a(a, evkVar)) {
            WaveQueueStartCommand waveQueueStartCommand = new WaveQueueStartCommand(new ikc(1, 7, continuation), new iyu(s9pVar, new c5q(pfnVar, gxcVar), true), nyn.a, Boolean.FALSE, g0lVar.u(v3gVar2), a, t0qVar2, false, evkVar);
            g0lVar.e.c(x5lVar, gxcVar);
            g0lVar.t(waveQueueStartCommand, g0lVar.u(v3gVar2), false, false);
        }
    }

    public final boolean a(a6l a6lVar, Function1 function1) {
        Object vcrVar;
        for (fxc fxcVar : (List) this.d.getValue()) {
            int i = fxcVar.a;
            Continuation continuation = null;
            wcr wcrVar = wcr.a;
            switch (i) {
                case 0:
                    lwc lwcVar = (lwc) fxcVar.b;
                    if (lwcVar.a()) {
                        ssg.a(4, null, "Playback is disabled by Freemium, increase attempt count", null);
                        lwcVar.b(nwc.a);
                        j2a j2aVar = j2a.NO_SUBSCRIPTION;
                        vcrVar = new vcr(new DoNotLaunchQueueStartException("User has no subscription to start queue"));
                        break;
                    }
                    vcrVar = wcrVar;
                    break;
                default:
                    d6m d6mVar = (d6m) fxcVar.b;
                    jyr jyrVar = p6m.f;
                    if (o6m.e()) {
                        j6m j6mVar = (j6m) d6mVar;
                        if (Intrinsics.d(j6mVar.j.getValue(), r6m.a)) {
                            ssg.a(4, "PlusDevicesLimiterValidatorBefore", "Can't play because device not registered", null);
                            x97.y(j6mVar.d, null, null, new g2l(j6mVar, continuation, 13), 3);
                            j2a j2aVar2 = j2a.NO_SUBSCRIPTION;
                            vcrVar = new vcr(new DoNotLaunchQueueStartException("Device is not registered"));
                            break;
                        }
                    }
                    vcrVar = wcrVar;
                    break;
            }
            if (vcrVar instanceof vcr) {
                function1.invoke(((vcr) vcrVar).a);
                return false;
            }
            if (!vcrVar.equals(wcrVar)) {
                b6e.s();
                return false;
            }
        }
        return true;
    }

    public final boolean b(kcr kcrVar, a0q a0qVar, List list) {
        mwk b;
        n7q c = c(false);
        mqs a = (c == null || (b = c.b()) == null) ? null : b.a();
        if (kcrVar.equals(hcr.a)) {
            return e(a0qVar, false);
        }
        if (kcrVar instanceof icr) {
            return Intrinsics.d(a != null ? a.a : null, list != null ? (String) list.get(((icr) kcrVar).a) : null);
        }
        if (kcrVar instanceof jcr) {
            return Intrinsics.d(a, ((jcr) kcrVar).a);
        }
        b6e.s();
        return false;
    }

    public final n7q c(boolean z) {
        jyr jyrVar = this.a;
        if (z) {
            d6l x = p6g.x((e6l) ((oq7) jyrVar.getValue()).a.d.getValue());
            if (x != null) {
                return x.a;
            }
            return null;
        }
        d6l x2 = p6g.x((e6l) ((oq7) jyrVar.getValue()).a.c.getValue());
        if (x2 != null) {
            return x2.a;
        }
        return null;
    }

    public final boolean e(a0q a0qVar, boolean z) {
        HashSet hashSet;
        n7q c = c(z);
        dd5 dd5Var = null;
        szu szuVar = c instanceof szu ? (szu) c : null;
        if (szuVar == null || (hashSet = szuVar.o) == null) {
            return false;
        }
        if (hashSet.size() == 1) {
            Object P = CollectionsKt.P(hashSet);
            if (P instanceof dd5) {
                dd5Var = (dd5) P;
            }
        }
        return Intrinsics.d(dd5Var, a0qVar);
    }

    public final void i(Function1 function1, v3g v3gVar, nyn nynVar, Boolean bool, a6l a6lVar, x5l x5lVar, nyu nyuVar, Function1 function12) {
        if (a(a6lVar, function12)) {
            WaveQueueStartCommand waveQueueStartCommand = new WaveQueueStartCommand(function1, nyuVar, nynVar, bool, u(v3gVar), a6lVar, q0q.a, false, function12);
            this.e.c(x5lVar, a6lVar.a);
            t(waveQueueStartCommand, u(v3gVar), false, false);
        }
    }

    public final void k(wsu wsuVar, dd5 dd5Var, kcr kcrVar, v3g v3gVar, nyn nynVar, a6l a6lVar, x5l x5lVar, String str, Function1 function1) {
        mwk b;
        u3q J;
        mwk b2;
        Continuation continuation = null;
        boolean z = false;
        if (kcrVar instanceof icr) {
            List list = wsuVar.a;
            int i = ((icr) kcrVar).a;
            n7q c = c(false);
            jzs jzsVar = (jzs) CollectionsKt.S(list, i);
            if (jzsVar != null && (J = swf.J(jzsVar.g)) != null) {
                mqs mqsVar = jzsVar.a;
                r3q r3qVar = J instanceof r3q ? (r3q) J : null;
                q3q g = r3qVar != null ? r3qVar.g() : null;
                izs D = (c == null || (b2 = c.b()) == null) ? null : rvf.D(b2);
                if (D instanceof e6v) {
                    e6v e6vVar = (e6v) D;
                    if (e6vVar instanceof b6v) {
                        r3q r3qVar2 = ((b6v) e6vVar).a;
                        boolean z2 = (r3qVar2.getId() instanceof cd5) && (J.getId() instanceof cd5);
                        boolean z3 = (r3qVar2.g() instanceof qyt) && (g instanceof qyt);
                        if ((z2 || Intrinsics.d(r3qVar2.getId(), J.getId())) && ((z3 || Intrinsics.d(r3qVar2.g(), g)) && Intrinsics.d(mqsVar, c.b().a()))) {
                            z = true;
                        }
                    } else if (!(e6vVar instanceof d6v)) {
                        b6e.s();
                        return;
                    }
                } else if (!Intrinsics.d(D, hzs.a) && D != null) {
                    b6e.s();
                    return;
                }
            }
        } else if (kcrVar instanceof hcr) {
            z = e(dd5Var, false);
        } else if (!(kcrVar instanceof jcr)) {
            b6e.s();
            return;
        } else {
            n7q c2 = c(false);
            z = Intrinsics.d((c2 == null || (b = c2.b()) == null) ? null : b.a(), ((jcr) kcrVar).a);
        }
        if (z) {
            d(this);
        } else {
            j(this, new gnf(wsuVar, continuation, 1), v3gVar, nynVar, null, a6lVar, x5lVar, str, function1);
        }
    }

    public final void n(kcr kcrVar, Function1 function1, kxi kxiVar, x5l x5lVar, String str, Function1 function12, v3g v3gVar, boolean z, Function1 function13) {
        mwk b;
        kxiVar.getClass();
        if (z && (kcrVar instanceof jcr)) {
            n7q c = c(false);
            if (Intrinsics.d((c == null || (b = c.b()) == null) ? null : b.a(), ((jcr) kcrVar).a)) {
                d(this);
                return;
            }
        }
        a6l a = kxiVar.a(weo.t());
        j(this, new jjf(function1, function12, this, kcrVar, str, a, (Continuation) null), v3gVar, null, null, a, x5lVar, str, function13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r1.i == ((defpackage.p9u) r13).a) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(String str, t6u t6uVar, q9u q9uVar, kxi kxiVar, u5l u5lVar, v3g v3gVar, Function0 function0, Function1 function1) {
        boolean z;
        a6l a = kxiVar.a(weo.t());
        if (!a(a, function1)) {
            return;
        }
        n7q c = c(false);
        u7u u7uVar = c instanceof u7u ? (u7u) c : null;
        if (u7uVar != null && Intrinsics.d(u7uVar.a.a.a, str)) {
            if (q9uVar instanceof o9u) {
                z = Intrinsics.d(u7uVar.c.a.a, ((o9u) q9uVar).a);
            } else {
                if (!(q9uVar instanceof p9u)) {
                    if (q9uVar != null) {
                        b6e.s();
                        return;
                    }
                }
                z = true;
            }
            if (!z) {
                ((k1l) this.b.getValue()).a(new PlayCommand(false), new b3t("core_play"));
                function0.invoke();
                return;
            } else {
                VideoClipQueueStartCommand videoClipQueueStartCommand = new VideoClipQueueStartCommand(str, t6uVar, q9uVar, a, u(v3gVar), function0, function1);
                this.e.c(u5lVar, a.a);
                t(videoClipQueueStartCommand, u(v3gVar), false, false);
                return;
            }
        }
        z = false;
        if (!z) {
        }
    }

    public final void t(PlaybackCommand$QueueLaunch.Substituting substituting, boolean z, boolean z2, boolean z3) {
        n8g b = t75.b();
        if (z) {
            b.add(new AwaitPlayerConvergedCommand(false));
            b.add(new PlayCommand(z2));
        }
        if (z3) {
            b.add(VolumeMuteCommand.INSTANCE);
        }
        if (b.isEmpty()) {
            b.add(new NoopCallbackCommand());
        }
        ((k1l) this.c.getValue()).b(new fyk(substituting, t75.a(b)), new b3t("start_queue"));
    }

    public final boolean u(v3g v3gVar) {
        if (v3gVar.equals(a0l.b)) {
            return p6g.C((e6l) ((oq7) this.a.getValue()).a.c.getValue());
        }
        if (v3gVar.equals(b0l.b)) {
            return true;
        }
        if (v3gVar.equals(c0l.b)) {
            return false;
        }
        b6e.s();
        return false;
    }
}
