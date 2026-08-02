package defpackage;

import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.PauseOnQueueEndCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hmw implements fmw {
    public final f7l a;
    public final q7l b;
    public final y3l c;
    public final k1l d;
    public final k1l e;
    public final pfn f;
    public final wnd g;
    public final ntw h;
    public final dtw i;
    public final khw j;

    public hmw(f7l f7lVar, q7l q7lVar, y3l y3lVar, k1l k1lVar, k1l k1lVar2, pfn pfnVar, q9w q9wVar, wnd wndVar) {
        q7lVar.getClass();
        y3lVar.getClass();
        k1lVar.getClass();
        k1lVar2.getClass();
        pfnVar.getClass();
        q9wVar.getClass();
        this.a = f7lVar;
        this.b = q7lVar;
        this.c = y3lVar;
        this.d = k1lVar;
        this.e = k1lVar2;
        this.f = pfnVar;
        this.g = wndVar;
        this.h = new ntw(f7lVar, y3lVar, pfnVar, q9wVar);
        this.i = new dtw(f7lVar, y3lVar);
        this.j = new khw(f7lVar, y3lVar);
    }

    public static n8g a(p6g p6gVar) {
        Object obj;
        n8g b = t75.b();
        b.add(new AwaitPlayerConvergedCommand(false));
        if (p6gVar instanceof cmw) {
            obj = new NoopCallbackCommand();
        } else if (p6gVar instanceof dmw) {
            obj = new PlayCommand(false);
        } else {
            if (!(p6gVar instanceof emw)) {
                b6e.s();
                return null;
            }
            obj = PauseOnQueueEndCommand.INSTANCE;
        }
        b.add(obj);
        return t75.a(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(defpackage.y5g.a0(r2.l), r11.b().d()) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0111, code lost:
    
        r11 = defpackage.p6g.C(r0);
        r0 = r12 instanceof defpackage.emw;
        r2 = defpackage.a3t.a;
        r3 = r10.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x011e, code lost:
    
        if (r0 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0120, code lost:
    
        if (r11 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0122, code lost:
    
        defpackage.ssg.a(4, "YnisonPlaybackLauncherBridgeImpl", "Queue matches, pausing instead of relaunching", null);
        r3.a(com.yandex.music.shared.playback.api.commands.PauseCommand.INSTANCE, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x012c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0140, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x012f, code lost:
    
        if ((r12 instanceof defpackage.dmw) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0131, code lost:
    
        if (r11 != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0133, code lost:
    
        defpackage.ssg.a(4, "YnisonPlaybackLauncherBridgeImpl", "Queue matches, playing instead of relaunching", null);
        r3.a(new com.yandex.music.shared.playback.api.commands.PlayCommand(false), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0143, code lost:
    
        if ((r12 instanceof defpackage.cmw) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0145, code lost:
    
        defpackage.ssg.a(4, "YnisonPlaybackLauncherBridgeImpl", "Queue matches, keeping as is", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014b, code lost:
    
        defpackage.b6e.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00de, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(defpackage.y5g.a0(r2.c), r11.b().c) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(defpackage.y5g.a0(r2.b), r11.d.c) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(maq maqVar, p6g p6gVar) {
        s9p s9pVar;
        String str;
        boolean z;
        d6l x = p6g.x((e6l) this.a.c.getValue());
        if (x != null) {
            n7q n7qVar = x.a;
            if (maqVar instanceof jbq) {
                if (n7qVar instanceof szu) {
                    szu szuVar = (szu) n7qVar;
                    aou id = szuVar.a.getId();
                    jbq jbqVar = (jbq) maqVar;
                    hbq id2 = jbqVar.b.getId();
                    boolean z2 = id instanceof tnu;
                    if (z2) {
                        s9pVar = ((tnu) id).a;
                    } else if (id instanceof unu) {
                        s9pVar = ((unu) id).a;
                    } else if (id instanceof wnu) {
                        s9pVar = ((wnu) id).e();
                    } else {
                        if (!(id instanceof ynu)) {
                            b6e.s();
                            return false;
                        }
                        s9pVar = null;
                    }
                    if (z2) {
                        str = ((tnu) id).b;
                    } else if (id instanceof unu) {
                        str = ((unu) id).b;
                    } else {
                        if (!(id instanceof znu)) {
                            b6e.s();
                            return false;
                        }
                        str = null;
                    }
                    if (id instanceof ynu) {
                        z = true;
                    } else {
                        if (!(id instanceof wnu) && !(id instanceof xnu)) {
                            b6e.s();
                            return false;
                        }
                        z = false;
                    }
                    if (qgg.Z(id2, s9pVar, str, z)) {
                    }
                }
            } else if (maqVar instanceof vaq) {
                if (n7qVar instanceof u7u) {
                    u7u u7uVar = (u7u) n7qVar;
                    vaq vaqVar = (vaq) maqVar;
                    if (Intrinsics.d(u7uVar.a.a.a, vaqVar.b.a)) {
                        if (u7uVar.g.size() == vaqVar.c.size()) {
                        }
                    }
                }
            } else if (maqVar instanceof eaq) {
                if (n7qVar instanceof y4d) {
                    y4d y4dVar = (y4d) n7qVar;
                    eaq eaqVar = (eaq) maqVar;
                    if (Intrinsics.d(y4dVar.a.a.a, ox6.N(eaqVar.b.a))) {
                    }
                }
            } else if (!(maqVar instanceof raq)) {
                b6e.s();
                return false;
            }
        }
        return false;
    }

    public final boolean c(p6g p6gVar) {
        if (p6gVar instanceof cmw) {
            return p6g.C((e6l) this.a.c.getValue());
        }
        if (p6gVar instanceof dmw) {
            return true;
        }
        if (p6gVar instanceof emw) {
            return false;
        }
        b6e.s();
        return false;
    }

    public final void d(p6g p6gVar) {
        Continuation continuation = null;
        wnd wndVar = this.g;
        if (wndVar == null) {
            wndVar = null;
        }
        this.e.b(new fyk(new StartWaveQueueCommand(new ikc(1, 15, continuation), new mzu(rsu.a, nyn.a, new iyu(new s9p(t75.c(r9p.a)), new c5q(this.f, new gxc(avf.G("restored"), weo.t())), false), false, vys.a, null, q0q.a, p6gVar.v()), c(p6gVar), this.c, new law(7), new gmw(wndVar, 0)), a(p6gVar)), a3t.a);
    }

    public final void e(eaq eaqVar, fpw fpwVar, p6g p6gVar, bmw bmwVar) {
        if (b(eaqVar, p6gVar)) {
            return;
        }
        wnd wndVar = this.g;
        if (wndVar == null) {
            wndVar = null;
        }
        law lawVar = new law(9);
        if (wndVar != null) {
            bmwVar = new dxr(wndVar, bmwVar);
        }
        khw khwVar = this.j;
        khwVar.getClass();
        c5d c5dVar = new c5d(new w3d(ox6.N(eaqVar.b.a)), eaqVar.d.c());
        boolean z = true;
        jhw jhwVar = new jhw(1, null);
        if (p6gVar instanceof cmw) {
            z = p6g.C((e6l) khwVar.a.c.getValue());
        } else if (!(p6gVar instanceof dmw)) {
            if (!(p6gVar instanceof emw)) {
                b6e.s();
                return;
            }
            z = false;
        }
        this.e.b(new fyk(new StartGenerativeQueueCommand(jhwVar, c5dVar, z, khwVar.b, lawVar, new ihw(bmwVar, 0)), a(p6gVar)), a3t.a);
    }

    public final void f(vdr vdrVar, cmw cmwVar) {
        vdrVar.getClass();
        wnd wndVar = this.g;
        if (wndVar != null) {
            maq maqVar = ((pqw) vdrVar.getValue()).b;
        } else {
            wndVar = null;
        }
        this.d.a(new StartYnisonQueueCommand(new qnw(vdrVar), c(cmwVar), this.c, new law(11), new gmw(wndVar, 1)), a3t.a);
    }

    public final void g(vaq vaqVar, fpw fpwVar, p6g p6gVar, bmw bmwVar) {
        wmn wmnVar;
        if (b(vaqVar, p6gVar)) {
            return;
        }
        wnd wndVar = this.g;
        if (wndVar == null) {
            wndVar = null;
        }
        law lawVar = new law(10);
        bmw dxrVar = wndVar == null ? bmwVar : new dxr(wndVar, bmwVar);
        dtw dtwVar = this.i;
        dtwVar.getClass();
        List list = vaqVar.c;
        List<saq> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (saq saqVar : list2) {
            tfn tfnVar = new tfn(saqVar.e.a);
            x1u x1uVar = saqVar.e;
            uow uowVar = saqVar.d;
            uowVar.getClass();
            row rowVar = uowVar.g;
            qow qowVar = rowVar instanceof qow ? (qow) rowVar : null;
            sow sowVar = qowVar != null ? qowVar.a : null;
            if (sowVar != null) {
                switch (sowVar.ordinal()) {
                    case 0:
                        wmnVar = wmn.b;
                        break;
                    case 1:
                        wmnVar = wmn.a;
                        break;
                    case 2:
                        wmnVar = wmn.c;
                        break;
                    case 3:
                        wmnVar = wmn.d;
                        break;
                    case 4:
                        wmnVar = wmn.e;
                        break;
                    case 5:
                        wmnVar = wmn.f;
                        break;
                    case 6:
                        break;
                    default:
                        b6e.s();
                        return;
                }
                arrayList.add(new y1u(tfnVar, x1uVar, wmnVar));
            }
            wmnVar = null;
            arrayList.add(new y1u(tfnVar, x1uVar, wmnVar));
        }
        boolean z = true;
        o9u o9uVar = list.size() > 1 ? new o9u(vaqVar.b().e.a) : null;
        y7u y7uVar = new y7u(new w6u(vaqVar.b.a), vaqVar.b().c().a, vaqVar.b().c().b, arrayList, o9uVar, o9uVar != null ? Long.valueOf(fpwVar.b) : null);
        ctw ctwVar = new ctw(1, null);
        if (p6gVar instanceof cmw) {
            z = p6g.C((e6l) dtwVar.a.c.getValue());
        } else if (!(p6gVar instanceof dmw)) {
            if (!(p6gVar instanceof emw)) {
                b6e.s();
                return;
            }
            z = false;
        }
        this.e.b(new fyk(new StartVideoClipRadioQueueCommand(ctwVar, y7uVar, z, dtwVar.b, lawVar, new ihw(dxrVar, 1)), a(p6gVar)), a3t.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(jbq jbqVar, fpw fpwVar, p6g p6gVar, bmw bmwVar) {
        r9p r9pVar;
        q9w q9wVar;
        teq teqVar;
        Object wsuVar;
        law lawVar;
        Pair pair;
        boolean z;
        mqs mqsVar;
        uow uowVar;
        p4q p4qVar;
        t0q r0qVar;
        boolean z2;
        boolean z3;
        if (b(jbqVar, p6gVar)) {
            return;
        }
        wnd wndVar = this.g;
        if (wndVar == null) {
            wndVar = null;
        }
        ntw ntwVar = this.h;
        law lawVar2 = new law(8);
        bmw dxrVar = wndVar == null ? bmwVar : new dxr(wndVar, bmwVar);
        pfn pfnVar = ntwVar.c;
        r9p r9pVar2 = r9p.a;
        q9w q9wVar2 = ntwVar.d;
        rsu rsuVar = rsu.a;
        List n = jbqVar.n();
        bbq bbqVar = jbqVar.b;
        if (n.isEmpty()) {
            r9pVar = r9pVar2;
            q9wVar = q9wVar2;
            wsuVar = rsuVar;
        } else {
            List n2 = jbqVar.n();
            ArrayList arrayList = new ArrayList(v75.o(n2, 10));
            Iterator it = n2.iterator();
            while (it.hasNext()) {
                arrayList.add(o2g.o0((naq) it.next()));
            }
            c5b c5bVar = c5b.a;
            r9pVar = r9pVar2;
            q9wVar = q9wVar2;
            ssu ssuVar = new ssu(jbqVar.j, jbqVar.k, Long.valueOf(fpwVar.b));
            fyu s = jbqVar.s();
            if (s instanceof eyu) {
                teqVar = new seq(((eyu) s).a, true);
            } else {
                if (!Intrinsics.d(s, dyu.a)) {
                    b6e.s();
                    return;
                }
                teqVar = req.a;
            }
            wsuVar = new wsu(arrayList, c5bVar, ssuVar, teqVar, false);
        }
        long currentTimeMillis = System.currentTimeMillis() - jbqVar.g;
        if (bbqVar instanceof abq) {
            abq abqVar = (abq) bbqVar;
            String str = abqVar.g;
            yaq yaqVar = abqVar.d;
            gbq gbqVar = abqVar.a;
            if (gbqVar instanceof ebq) {
                ebq ebqVar = (ebq) gbqVar;
                lawVar = lawVar2;
                pair = new Pair(new kyu(new tnu(ebqVar.a, ebqVar.b), new t4q(yaqVar.a, yaqVar.b, abqVar.h, false), new s4v(str, null), abqVar.e), wsuVar);
            } else {
                lawVar = lawVar2;
                if (!(gbqVar instanceof fbq)) {
                    b6e.s();
                    return;
                }
                fbq fbqVar = (fbq) gbqVar;
                unu unuVar = new unu(fbqVar.a, fbqVar.b);
                v4q v4qVar = new v4q(yaqVar.a, yaqVar.b, abqVar.h);
                s4v s4vVar = new s4v(str, null);
                p4q p4qVar2 = abqVar.e;
                q9wVar.getClass();
                pair = new Pair(new hyu(unuVar, v4qVar, s4vVar, p4qVar2, currentTimeMillis > q9w.a().longValue() ? new s9p(t75.c(r9pVar)) : null), wsuVar);
            }
        } else {
            lawVar = lawVar2;
            if (!(bbqVar instanceof xaq)) {
                b6e.s();
                return;
            }
            naq naqVar = (naq) CollectionsKt.S(jbqVar.n(), jbqVar.l);
            izs I = (naqVar == null || (uowVar = naqVar.d) == null) ? null : q7g.I(uowVar);
            b6v b6vVar = I instanceof b6v ? (b6v) I : null;
            r3q r3qVar = b6vVar != null ? b6vVar.a : null;
            p1o p1oVar = (naqVar == null || (mqsVar = naqVar.e) == null || !a4g.D(gys.NonMusicHolder, mqsVar)) ? r3qVar instanceof j3q ? p1o.a : r3qVar instanceof l3q ? p1o.b : r3qVar instanceof p3q ? p1o.c : r3qVar instanceof m3q ? p1o.e : null : p1o.d;
            if (p1oVar != null) {
                q9wVar.getClass();
                l18 l18Var = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                jxb a = ((q1o) ((byb) qdcVar.C(I2)).c(ern.a(q1o.class))).a();
                msa msaVar = nsa.b;
                Integer b = a.b("awaitTimeMinutes");
                if (nsa.s(yd5.M(b != null ? b.intValue() : 540, ssa.MINUTES), ssa.MILLISECONDS) <= currentTimeMillis) {
                    int ordinal = p1oVar.ordinal();
                    if (ordinal == 0) {
                        Boolean a2 = a.a("albums");
                        if (a2 != null) {
                            z = a2.booleanValue();
                            if (z) {
                            }
                        }
                    } else if (ordinal == 1) {
                        Boolean a3 = a.a("artists");
                        if (a3 != null) {
                            z = a3.booleanValue();
                            if (z) {
                            }
                        }
                    } else if (ordinal == 2) {
                        Boolean a4 = a.a("playlists");
                        if (a4 != null) {
                            z = a4.booleanValue();
                            if (z) {
                            }
                        }
                    } else if (ordinal == 3) {
                        Boolean a5 = a.a("nonMusic");
                        if (a5 != null) {
                            z = a5.booleanValue();
                            if (z) {
                            }
                        }
                    } else {
                        if (ordinal != 4) {
                            b6e.s();
                            return;
                        }
                        Boolean a6 = a.a("various");
                        if (a6 != null) {
                            z = a6.booleanValue();
                            if (z) {
                                pair = new Pair(new iyu(new s9p(t75.c(r9pVar)), new c5q(pfnVar, ((xaq) bbqVar).c), false), rsuVar);
                            }
                        }
                    }
                }
                z = false;
                if (z) {
                }
            }
            pair = new Pair(new jyu(new c5q(pfnVar, ((xaq) bbqVar).c)), wsuVar);
        }
        oyu oyuVar = (oyu) pair.a;
        xsu xsuVar = (xsu) pair.b;
        nyn nynVar = jbqVar.e;
        vys vysVar = vys.a;
        bbqVar.getClass();
        if (bbqVar instanceof abq) {
            p4qVar = ((abq) bbqVar).e;
        } else {
            if (!(bbqVar instanceof xaq)) {
                b6e.s();
                return;
            }
            p4qVar = p4q.b;
        }
        int ordinal2 = p4qVar.ordinal();
        if (ordinal2 == 0) {
            z2 = false;
            r0qVar = new r0q(0);
        } else if (ordinal2 != 1 && ordinal2 != 2) {
            b6e.s();
            return;
        } else {
            r0qVar = q0q.a;
            z2 = false;
        }
        mzu mzuVar = new mzu(xsuVar, nynVar, oyuVar, false, vysVar, bbqVar.getDescription(), r0qVar, p6gVar.v());
        mtw mtwVar = new mtw(1, null);
        if (p6gVar instanceof cmw) {
            z3 = p6g.C((e6l) ntwVar.a.c.getValue());
        } else if (p6gVar instanceof dmw) {
            z3 = true;
        } else {
            if (!(p6gVar instanceof emw)) {
                b6e.s();
                return;
            }
            z3 = z2;
        }
        this.e.b(new fyk(new StartWaveQueueCommand(mtwVar, mzuVar, z3, ntwVar.b, lawVar, new ihw(dxrVar, 2)), a(p6gVar)), a3t.a);
    }
}
