package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.SeekToPositionCommand;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class rf2 implements of2 {
    public final nf2 a;
    public final rp7 b;
    public final boi c;
    public final bnd d;
    public final jzi e;
    public final k1l f;
    public final kf2 g;
    public final oq7 h;
    public final ve2 i;
    public final ef2 j;
    public final we2 k;

    public rf2(nf2 nf2Var, o6c o6cVar, rp7 rp7Var, b2c b2cVar, boi boiVar, bnd bndVar, jzi jziVar, k1l k1lVar, kf2 kf2Var, oq7 oq7Var, ve2 ve2Var, ef2 ef2Var, we2 we2Var) {
        this.a = nf2Var;
        this.b = rp7Var;
        this.c = boiVar;
        this.d = bndVar;
        this.e = jziVar;
        this.f = k1lVar;
        this.g = kf2Var;
        this.h = oq7Var;
        this.i = ve2Var;
        this.j = ef2Var;
        this.k = we2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        pf2 pf2Var;
        int i;
        if (cg6Var instanceof pf2) {
            pf2Var = (pf2) cg6Var;
            int i2 = pf2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pf2Var.l = i2 - Integer.MIN_VALUE;
                Object obj = pf2Var.j;
                nm6 nm6Var = nm6.a;
                i = pf2Var.l;
                int i3 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (((xe2) ((byb) qdcVar.C(I)).b(xe2.class)).h()) {
                        jyr jyrVar = k3j.e;
                        if (ixf.x()) {
                            ssg.a(3, "AutoplayLauncherImpl", "waiting for music-launch anchor processing to finish", null);
                            long y = ixf.y();
                            hl hlVar = new hl(this, continuation, 19);
                            pf2Var.l = 2;
                            obj = tyf.L(y, hlVar, pf2Var);
                        }
                    }
                    ssg.a(3, "AutoplayLauncherImpl", "waiting for screens to close", null);
                    nf2 nf2Var = this.a;
                    pf2Var.l = 1;
                    Object h0 = zsd.h0(nf2Var.a, new lf2(i3, 0, continuation), pf2Var);
                    if (h0 != nm6Var) {
                        h0 = Unit.a;
                    }
                } else {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Boolean.TRUE;
                    }
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Boolean.valueOf(!(((df2) obj) instanceof af2));
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    int i4 = 5;
                    if (obj == null) {
                        ssg.a(5, "AutoplayLauncherImpl", "timed out waiting for launch gate to unblock, proceeding anyway", null);
                    }
                    ssg.a(3, "AutoplayLauncherImpl", "waiting for communication status to resolve", null);
                    fkn fknVar = ((ze2) this.j).c;
                    xc xcVar = new xc(i3, i4, continuation);
                    pf2Var.l = 3;
                    obj = zsd.h0(fknVar, xcVar, pf2Var);
                }
            }
        }
        pf2Var = new pf2(this, cg6Var);
        Object obj2 = pf2Var.j;
        nm6 nm6Var2 = nm6.a;
        i = pf2Var.l;
        int i32 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        qf2 qf2Var;
        Object obj;
        int i;
        Throwable th;
        int i2;
        String H;
        n7q n7qVar;
        mwk b;
        v80 c;
        gxc gxcVar;
        a3t a3tVar = a3t.a;
        k1l k1lVar = this.f;
        ve2 ve2Var = this.i;
        l18 l18Var = l18.b;
        if (continuation instanceof qf2) {
            qf2Var = (qf2) continuation;
            int i3 = qf2Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qf2Var.l = i3 - Integer.MIN_VALUE;
                obj = qf2Var.j;
                Object obj2 = nm6.a;
                i = qf2Var.l;
                Throwable th2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "AutoplayLauncherImpl", "launch() called", null);
                    if (!((Boolean) ((gf2) this.d.b).f.e.getValue()).booleanValue()) {
                        ssg.a(3, "AutoplayLauncherImpl", "autoplay disabled by user setting, skipping autoplay", null);
                        return Unit.a;
                    }
                    List h = u75.h("default", "off", "control");
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (h.contains(((if2) ((byb) qdcVar.C(I)).b(if2.class)).b())) {
                        ssg.a(3, "AutoplayLauncherImpl", "experiment disabled, skipping autoplay", null);
                        return Unit.a;
                    }
                    ypt yptVar = cnf.c;
                    if (yptVar != null) {
                        euo type = yptVar.getType();
                        if (cnf.b.contains(type)) {
                            for (String str : cnf.a) {
                                if (yptVar.Q(str) != null) {
                                    String q = hrg.q("isLaunchDeeplinkAllowed: forbidden param '", str, "' present, blocked");
                                    th = null;
                                    i2 = 3;
                                    ssg.a(3, "LaunchDeeplinkTracker", q, null);
                                } else {
                                    th2 = null;
                                }
                            }
                            ssg.a(3, "LaunchDeeplinkTracker", "isLaunchDeeplinkAllowed: scheme type " + type + " allowed", th2);
                        } else {
                            ssg.a(3, "LaunchDeeplinkTracker", "isLaunchDeeplinkAllowed: scheme type " + type + " not in whitelist, blocked", null);
                            i2 = 3;
                            th = null;
                        }
                        ssg.a(i2, "AutoplayLauncherImpl", "deeplink not allowed, skipping autoplay", th);
                        return Unit.a;
                    }
                    ssg.a(3, "LaunchDeeplinkTracker", "isLaunchDeeplinkAllowed: no deeplink (launcher start), allowed", null);
                    d6l x = p6g.x((e6l) this.c.a.a.c.getValue());
                    if (!(x == null ? false : ((Boolean) dag.p(x.a.b(), i9w.c)).booleanValue())) {
                        ssg.a(3, "AutoplayLauncherImpl", "music queue not enabled, skipping autoplay", null);
                        return Unit.a;
                    }
                    qf2Var.l = 1;
                    obj = a(qf2Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ssg.a(3, "AutoplayLauncherImpl", "deeplink communication is active, autoplay will not start", null);
                    return Unit.a;
                }
                if (((gf2) this.b.a).e.h.getValue() != h74.d) {
                    ssg.a(3, "AutoplayLauncherImpl", "casting became active while waiting, skipping autoplay", null);
                    return Unit.a;
                }
                if (((Collection) ((gf2) this.e.a).g.a.a.getValue()).isEmpty()) {
                    ssg.a(3, "AutoplayLauncherImpl", "no headset connected, skipping autoplay", null);
                    return Unit.a;
                }
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                Long e = ((if2) ((byb) qdcVar2.C(I2)).b(if2.class)).a().e("fadeInDuration");
                long longValue = e != null ? e.longValue() : 0L;
                if (longValue > 0) {
                    this.g.a.set(longValue);
                }
                d6l x2 = p6g.x((e6l) this.h.a.c.getValue());
                if (x2 == null || (n7qVar = x2.a) == null || (b = n7qVar.b()) == null || (c = b.c()) == null || (gxcVar = c.b) == null || (H = gxcVar.a) == null) {
                    H = avf.H();
                }
                String str2 = H;
                nmb nmbVar = ve2Var.c;
                kmb kmbVar = kmb.Tap;
                nmb.i(nmbVar, str2, wjb.MainScreen, null, null, pkb.NonApplicable, "", 0, "", "", null, "", "", "autoplay_started", 83787000);
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var.a;
                qdcVar3.getClass();
                Boolean a = ((if2) ((byb) qdcVar3.C(I3)).b(if2.class)).a().a("resetToStart");
                if (a != null ? a.booleanValue() : false) {
                    ssg.a(3, "AutoplayLauncherImpl", "resetToStart=true, seeking to position 0 and play", null);
                    k1lVar.b(new eyk(u75.h(new SeekToPositionCommand(0L), new PlayCommand(false))), a3tVar);
                } else {
                    ssg.a(3, "AutoplayLauncherImpl", "sending PlayCommand", null);
                    k1lVar.b(new eyk(t75.c(new PlayCommand(false))), a3tVar);
                }
                Context context = ve2Var.a;
                AudioManager c2 = l1b.c(context);
                uqn uqnVar = new uqn();
                int streamMaxVolume = c2.getStreamMaxVolume(3);
                uqnVar.a = streamMaxVolume > 0 ? c2.getStreamVolume(3) / streamMaxVolume : 0.0f;
                ue2 ue2Var = new ue2(c2, uqnVar, ve2Var, str2, (Handler) tj2.a.getValue());
                context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, ue2Var);
                x97.y(ve2Var.b, null, null, new cs1(ve2Var, ue2Var, null, 4), 3);
                return Unit.a;
            }
        }
        qf2Var = new qf2(this, continuation);
        obj = qf2Var.j;
        Object obj22 = nm6.a;
        i = qf2Var.l;
        Throwable th22 = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
