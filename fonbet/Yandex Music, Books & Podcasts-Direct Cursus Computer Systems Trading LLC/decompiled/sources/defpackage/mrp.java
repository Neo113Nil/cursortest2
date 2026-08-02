package defpackage;

import androidx.fragment.app.y;
import com.yandex.music.shared.playback.api.commands.SetPlaybackSpeedCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetRepeatModeCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetShuffleCommand;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class mrp implements lrp {
    public final ts2 a;
    public final iwe b;
    public final hjl c;
    public final vnb d;
    public final by7 e;

    public mrp(ts2 ts2Var, iwe iweVar, hjl hjlVar, vnb vnbVar) {
        hjlVar.getClass();
        this.a = ts2Var;
        this.b = iweVar;
        this.c = hjlVar;
        this.d = vnbVar;
        this.e = sj2.q(ts2Var.l(), hjlVar.c, new j1p(6));
    }

    @Override // defpackage.lrp
    public final void a(boolean z, String str, gjl gjlVar) {
        str.getClass();
        if (gjlVar == null) {
            return;
        }
        thj thjVar = (thj) gjlVar.d.getValue();
        pkl pklVar = gjlVar.a;
        this.c.e(z, str, thjVar, gjlVar.b, pklVar, null);
    }

    @Override // defpackage.lrp
    public final void b() {
        i(sjb.ChangeSpeed);
        jrp jrpVar = (jrp) this.a.a;
        float f = ((h4q) ((oq7) jrpVar.c.getValue()).c.j.a.getValue()).a;
        wgl wglVar = wgl.b;
        if (f != 1.0f) {
            wgl wglVar2 = wgl.c;
            if (f != 1.25f) {
                wglVar2 = wgl.d;
                if (f != 1.5f) {
                    wglVar2 = wgl.e;
                    if (f != 2.0f) {
                        dfi.r("Unknown playback speed " + f, "PlayerScreen");
                    }
                }
            }
            wglVar = wglVar2;
        }
        ((k1l) jrpVar.b.getValue()).a(new SetPlaybackSpeedCommand(new h4q(wglVar.a().a)), new b3t("core_speed"));
        float f2 = wglVar.a;
        float f3 = wglVar.a().a;
        vnb vnbVar = this.d;
        vnbVar.c().a(vnbVar.a.G(), wjb.PlayerScreen, xjb.PlayingSpeed, String.valueOf(f3), String.valueOf(f2));
    }

    @Override // defpackage.lrp
    public final void c() {
        i(sjb.ChangeView);
        jrp jrpVar = (jrp) this.a.a;
        drp drpVar = (drp) ((vdr) ((hrp) jrpVar.f.getValue()).a.getValue()).getValue();
        tll tllVar = ((hrp) jrpVar.f.getValue()).b.a;
        if (!((Boolean) tllVar.d.getValue()).booleanValue()) {
            dfi.r("Unexpected behaviour, toggle lyrics when it is not available", "PlayerScreen:Lyrics");
        }
        tllVar.b.b();
        boolean z = drpVar != drp.b;
        vnb vnbVar = this.d;
        vnbVar.c().a(vnbVar.a.G(), wjb.PlayerScreen, xjb.ShowLyrics, z ? "on" : "off", z ? "off" : "on");
    }

    @Override // defpackage.lrp
    public final void d() {
        n7q n7qVar;
        mwk b;
        List list;
        sjb sjbVar;
        Object invoke = this.e.b.invoke();
        vrp vrpVar = invoke instanceof vrp ? (vrp) invoke : null;
        if (vrpVar != null && (list = vrpVar.a) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof rqp) {
                    arrayList.add(obj);
                }
            }
            rqp rqpVar = (rqp) CollectionsKt.firstOrNull(arrayList);
            if (rqpVar != null) {
                int ordinal = rqpVar.ordinal();
                if (ordinal == 0) {
                    sjbVar = sjb.Download;
                } else if (ordinal == 1) {
                    sjbVar = sjb.Cancel;
                } else if (ordinal == 2) {
                    sjbVar = sjb.DeleteDownload;
                } else {
                    if (ordinal != 3) {
                        b6e.s();
                        return;
                    }
                    sjbVar = null;
                }
                if (sjbVar != null) {
                    i(sjbVar);
                }
            }
        }
        jrp jrpVar = (jrp) this.a.a;
        d6l x = p6g.x((e6l) ((oq7) jrpVar.c.getValue()).a.c.getValue());
        mqs a = (x == null || (n7qVar = x.a) == null || (b = n7qVar.b()) == null) ? null : b.a();
        if (a != null) {
            grp grpVar = (grp) jrpVar.g.getValue();
            grpVar.getClass();
            jyr jyrVar = grpVar.c;
            eca ecaVar = eca.d;
            eca i = d51.i(a, null);
            boolean contains = ((lja) ((e6q) ((uaa) grpVar.a.getValue())).e.getValue()).a.contains(a.a);
            boolean containsKey = ((fba) ((kij) grpVar.b.getValue()).c.a.getValue()).a.containsKey(a);
            if (contains || containsKey) {
                ((taa) ((raa) jyrVar.getValue())).c(i);
            } else {
                ((taa) ((raa) jyrVar.getValue())).e(i);
            }
        }
    }

    @Override // defpackage.lrp
    public final void e() {
        k(wjb.SoundSettingsScreen);
        iwe iweVar = this.b;
        hn5 hn5Var = (hn5) iweVar.c;
        y yVar = ((qnq) iweVar.b).a;
        l18 l18Var = l18.b;
        bdt I = hag.I(a6n.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        new x3n(hn5Var, yVar, (a6n) qdcVar.C(I)).M0(new frp(hn5Var));
    }

    @Override // defpackage.lrp
    public final void f() {
        n7q n7qVar;
        i(sjb.ChangeRepeatSettings);
        jrp jrpVar = (jrp) this.a.a;
        d6l x = p6g.x((e6l) ((oq7) jrpVar.c.getValue()).a.c.getValue());
        if (x == null || (n7qVar = x.a) == null) {
            return;
        }
        nyn x2 = v7g.x(n7qVar);
        nyn G = bzf.G(x2, n7qVar);
        ((k1l) jrpVar.b.getValue()).a(new SetRepeatModeCommand(G), new b3t("queue_repeat"));
        unb Z = f8g.Z(x2);
        unb Z2 = f8g.Z(G);
        vnb vnbVar = this.d;
        vnbVar.c().a(vnbVar.a.G(), wjb.PlayerScreen, xjb.Repeat, Z2.a, Z.a);
    }

    @Override // defpackage.lrp
    public final void g() {
        n7q n7qVar;
        i(sjb.ChangeShuffle);
        jrp jrpVar = (jrp) this.a.a;
        d6l x = p6g.x((e6l) ((oq7) jrpVar.c.getValue()).a.c.getValue());
        if (x == null || (n7qVar = x.a) == null) {
            return;
        }
        boolean booleanValue = ((Boolean) wdg.A(n7qVar, fs7.i)).booleanValue();
        ((k1l) jrpVar.b.getValue()).a(new SetShuffleCommand(!booleanValue), new b3t("queue_shuffle"));
        vnb vnbVar = this.d;
        vnbVar.c().a(vnbVar.a.G(), wjb.PlayerScreen, xjb.Shuffle, booleanValue ? "off" : "on", !booleanValue ? "off" : "on");
    }

    @Override // defpackage.lrp
    public final vdr getState() {
        return this.e;
    }

    @Override // defpackage.lrp
    public final void h() {
        k(wjb.SleepTimerScreen);
        jyr jyrVar = ohs.a;
        ohs.a(((qnq) this.b.b).a);
    }

    public final void i(sjb sjbVar) {
        gjl j = j();
        if (j == null) {
            return;
        }
        pkl pklVar = j.a;
        this.c.a(sjbVar, bkp.X(pklVar.c()), pklVar, j.b);
    }

    public final gjl j() {
        Object invoke = this.e.b.invoke();
        vrp vrpVar = invoke instanceof vrp ? (vrp) invoke : null;
        gjl gjlVar = vrpVar != null ? vrpVar.b : null;
        if (gjlVar == null) {
            dfi.r("Can not get analyticsPayload", "PlayerScreenSettings");
        }
        return gjlVar;
    }

    public final void k(wjb wjbVar) {
        gjl j = j();
        if (j == null) {
            return;
        }
        thj X = bkp.X(j.a.c());
        hjl.b(this.c, wjbVar, j.a, X, ((wrp) this.e.b.invoke()).a(), 16);
    }
}
