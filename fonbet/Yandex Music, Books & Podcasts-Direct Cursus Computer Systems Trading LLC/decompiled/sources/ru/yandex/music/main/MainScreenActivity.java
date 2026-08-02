package ru.yandex.music.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.a7h;
import defpackage.b6e;
import defpackage.b7h;
import defpackage.b9s;
import defpackage.bbj;
import defpackage.bdt;
import defpackage.bjl;
import defpackage.bsr;
import defpackage.btf;
import defpackage.byb;
import defpackage.c2e;
import defpackage.c5s;
import defpackage.c7h;
import defpackage.cib;
import defpackage.cjl;
import defpackage.cmd;
import defpackage.cxb;
import defpackage.d16;
import defpackage.d7h;
import defpackage.d7r;
import defpackage.d9s;
import defpackage.dfi;
import defpackage.dm6;
import defpackage.drt;
import defpackage.dt0;
import defpackage.duc;
import defpackage.dud;
import defpackage.dvu;
import defpackage.dxl;
import defpackage.e26;
import defpackage.e6l;
import defpackage.e7h;
import defpackage.e7r;
import defpackage.efe;
import defpackage.ern;
import defpackage.evj;
import defpackage.fii;
import defpackage.fkn;
import defpackage.fnb;
import defpackage.frt;
import defpackage.ftu;
import defpackage.g8c;
import defpackage.gef;
import defpackage.gfo;
import defpackage.gs4;
import defpackage.h1e;
import defpackage.h2e;
import defpackage.h7h;
import defpackage.hag;
import defpackage.hem;
import defpackage.hld;
import defpackage.hmr;
import defpackage.hn5;
import defpackage.hyf;
import defpackage.hz4;
import defpackage.i7h;
import defpackage.iem;
import defpackage.imp;
import defpackage.ixf;
import defpackage.j7h;
import defpackage.jb6;
import defpackage.jmd;
import defpackage.jnb;
import defpackage.jyr;
import defpackage.k3j;
import defpackage.k4s;
import defpackage.kbn;
import defpackage.kg5;
import defpackage.kwl;
import defpackage.l18;
import defpackage.l3l;
import defpackage.lbr;
import defpackage.lhs;
import defpackage.lik;
import defpackage.lm4;
import defpackage.lwc;
import defpackage.lxl;
import defpackage.lyf;
import defpackage.mdb;
import defpackage.msa;
import defpackage.mu7;
import defpackage.mxl;
import defpackage.n7b;
import defpackage.ndb;
import defpackage.nfj;
import defpackage.nj5;
import defpackage.nsa;
import defpackage.nu7;
import defpackage.nxl;
import defpackage.o5g;
import defpackage.oh7;
import defpackage.oks;
import defpackage.opg;
import defpackage.oq7;
import defpackage.ou7;
import defpackage.ox6;
import defpackage.p1g;
import defpackage.p6g;
import defpackage.pm6;
import defpackage.ps;
import defpackage.q4s;
import defpackage.q6k;
import defpackage.q6r;
import defpackage.qd;
import defpackage.qdc;
import defpackage.qld;
import defpackage.rf3;
import defpackage.rjq;
import defpackage.saf;
import defpackage.ssa;
import defpackage.ssg;
import defpackage.t4s;
import defpackage.t58;
import defpackage.t5j;
import defpackage.tge;
import defpackage.u75;
import defpackage.um6;
import defpackage.v35;
import defpackage.v3g;
import defpackage.v3w;
import defpackage.vdq;
import defpackage.vge;
import defpackage.vik;
import defpackage.vz1;
import defpackage.w1g;
import defpackage.w6h;
import defpackage.wj3;
import defpackage.wqi;
import defpackage.wqv;
import defpackage.wyf;
import defpackage.x6h;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xj5;
import defpackage.xqi;
import defpackage.xz0;
import defpackage.y18;
import defpackage.y6h;
import defpackage.y7g;
import defpackage.yd5;
import defpackage.yfx;
import defpackage.yg5;
import defpackage.yxc;
import defpackage.z66;
import defpackage.z6h;
import defpackage.zh5;
import defpackage.zig;
import defpackage.zqj;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.entry.EntryScreenActivity;
import ru.yandex.music.gdpr.GdprScreenActivity;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;
import ru.yandex.music.player.a;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes5.dex */
public final class MainScreenActivity extends a implements jb6 {
    public static final lhs Q0 = new lhs("MainActivityCreate", 0, 30);
    public static boolean R0 = true;
    public static final long S0;
    public final rjq A0;
    public final um6 B0;
    public j7h C0;
    public gs4 D0;
    public boolean E0;
    public final jyr F0;
    public ViewGroup G0;
    public final jyr H0;
    public final jyr I0;
    public boolean J0;
    public ps K0;
    public final jyr L0;
    public final efe M0;
    public boolean N0;
    public final jyr O0;
    public final jyr P0;
    public final cib Y = new cib(13, this);
    public final gfo Z;
    public final jyr v0;
    public final jyr w0;
    public final jyr x0;
    public final jyr y0;
    public final jyr z0;

    static {
        msa msaVar = nsa.b;
        S0 = yd5.M(300, ssa.MILLISECONDS);
    }

    public MainScreenActivity() {
        if (R0) {
            Q0.d();
            R0 = false;
        }
        this.Z = gfo.Tab;
        l18 l18Var = l18.b;
        this.v0 = l18Var.b(hag.I(bsr.class), true);
        this.w0 = l18Var.b(hag.I(z66.class), true);
        this.x0 = l18Var.b(hag.I(lwc.class), true);
        this.y0 = l18Var.b(hag.I(y18.class), true);
        this.z0 = l18Var.b(hag.I(nfj.class), true);
        rjq b = hyf.b();
        this.A0 = b;
        this.B0 = hld.s(b, dm6.b());
        final int i = 0;
        this.F0 = btf.b(new Function0(this) { // from class: v6h
            public final /* synthetic */ MainScreenActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MainScreenActivity mainScreenActivity = this.b;
                        lhs lhsVar = MainScreenActivity.Q0;
                        jfu viewModelStore = mainScreenActivity.getViewModelStore();
                        xiu xiuVar = new xiu(viewModelStore);
                        lm4 a = ern.a(zqj.class);
                        a6p a6pVar = (a6p) xiuVar.c;
                        gs6 gs6Var = gs6.b;
                        a6pVar.getClass();
                        gs6Var.getClass();
                        bjt bjtVar = new bjt(viewModelStore, a6pVar, gs6Var);
                        Class b2 = a.b();
                        b2.getClass();
                        lm4 a2 = ern.a(b2);
                        String f = a2.f();
                        if (f != null) {
                            return (zqj) bjtVar.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
                        }
                        xq0.x("Local and anonymous classes can not be ViewModels");
                        return null;
                    case 1:
                        MainScreenActivity mainScreenActivity2 = this.b;
                        lhs lhsVar2 = MainScreenActivity.Q0;
                        l18 l18Var2 = l18.b;
                        bdt I = hag.I(y7r.class);
                        qdc qdcVar = l18Var2.a;
                        qdcVar.getClass();
                        y7r y7rVar = (y7r) qdcVar.C(I);
                        pv9 pv9Var = new pv9(17, mainScreenActivity2);
                        pzl pzlVar = y7rVar.a;
                        return new e7r(mainScreenActivity2, pv9Var, new eyq(7, pzlVar), new nrq(pzlVar, 19));
                    default:
                        MainScreenActivity mainScreenActivity3 = this.b;
                        lhs lhsVar3 = MainScreenActivity.Q0;
                        ((e26) mainScreenActivity3.O0.getValue()).getClass();
                        return d16.class;
                }
            }
        });
        this.H0 = l18Var.b(hag.I(h7h.class), true);
        this.I0 = l18Var.b(hag.I(oh7.class), true);
        final int i2 = 1;
        this.L0 = btf.b(new Function0(this) { // from class: v6h
            public final /* synthetic */ MainScreenActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MainScreenActivity mainScreenActivity = this.b;
                        lhs lhsVar = MainScreenActivity.Q0;
                        jfu viewModelStore = mainScreenActivity.getViewModelStore();
                        xiu xiuVar = new xiu(viewModelStore);
                        lm4 a = ern.a(zqj.class);
                        a6p a6pVar = (a6p) xiuVar.c;
                        gs6 gs6Var = gs6.b;
                        a6pVar.getClass();
                        gs6Var.getClass();
                        bjt bjtVar = new bjt(viewModelStore, a6pVar, gs6Var);
                        Class b2 = a.b();
                        b2.getClass();
                        lm4 a2 = ern.a(b2);
                        String f = a2.f();
                        if (f != null) {
                            return (zqj) bjtVar.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
                        }
                        xq0.x("Local and anonymous classes can not be ViewModels");
                        return null;
                    case 1:
                        MainScreenActivity mainScreenActivity2 = this.b;
                        lhs lhsVar2 = MainScreenActivity.Q0;
                        l18 l18Var2 = l18.b;
                        bdt I = hag.I(y7r.class);
                        qdc qdcVar = l18Var2.a;
                        qdcVar.getClass();
                        y7r y7rVar = (y7r) qdcVar.C(I);
                        pv9 pv9Var = new pv9(17, mainScreenActivity2);
                        pzl pzlVar = y7rVar.a;
                        return new e7r(mainScreenActivity2, pv9Var, new eyq(7, pzlVar), new nrq(pzlVar, 19));
                    default:
                        MainScreenActivity mainScreenActivity3 = this.b;
                        lhs lhsVar3 = MainScreenActivity.Q0;
                        ((e26) mainScreenActivity3.O0.getValue()).getClass();
                        return d16.class;
                }
            }
        });
        bdt I = hag.I(efe.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.M0 = (efe) qdcVar.C(I);
        this.O0 = l18Var.b(hag.I(e26.class), true);
        final int i3 = 2;
        this.P0 = btf.b(new Function0(this) { // from class: v6h
            public final /* synthetic */ MainScreenActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MainScreenActivity mainScreenActivity = this.b;
                        lhs lhsVar = MainScreenActivity.Q0;
                        jfu viewModelStore = mainScreenActivity.getViewModelStore();
                        xiu xiuVar = new xiu(viewModelStore);
                        lm4 a = ern.a(zqj.class);
                        a6p a6pVar = (a6p) xiuVar.c;
                        gs6 gs6Var = gs6.b;
                        a6pVar.getClass();
                        gs6Var.getClass();
                        bjt bjtVar = new bjt(viewModelStore, a6pVar, gs6Var);
                        Class b2 = a.b();
                        b2.getClass();
                        lm4 a2 = ern.a(b2);
                        String f = a2.f();
                        if (f != null) {
                            return (zqj) bjtVar.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
                        }
                        xq0.x("Local and anonymous classes can not be ViewModels");
                        return null;
                    case 1:
                        MainScreenActivity mainScreenActivity2 = this.b;
                        lhs lhsVar2 = MainScreenActivity.Q0;
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(y7r.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        y7r y7rVar = (y7r) qdcVar2.C(I2);
                        pv9 pv9Var = new pv9(17, mainScreenActivity2);
                        pzl pzlVar = y7rVar.a;
                        return new e7r(mainScreenActivity2, pv9Var, new eyq(7, pzlVar), new nrq(pzlVar, 19));
                    default:
                        MainScreenActivity mainScreenActivity3 = this.b;
                        lhs lhsVar3 = MainScreenActivity.Q0;
                        ((e26) mainScreenActivity3.O0.getValue()).getClass();
                        return d16.class;
                }
            }
        });
    }

    public static final void F(MainScreenActivity mainScreenActivity) {
        l18 l18Var = l18.b;
        jyr jyrVar = k3j.e;
        int i = 3;
        Continuation continuation = null;
        if (ixf.x()) {
            x97.y(wyf.F(mainScreenActivity.getLifecycle()), null, null, new d7h(mainScreenActivity, continuation, i), 3);
            return;
        }
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((nj5) ((byb) qdcVar.C(I)).b(nj5.class)).h()) {
            x97.y(wyf.F(mainScreenActivity.getLifecycle()), null, null, new d7h(mainScreenActivity, continuation, 2), 3);
            return;
        }
        if (mainScreenActivity.isFinishing() || mainScreenActivity.isDestroyed()) {
            return;
        }
        h7h H = mainScreenActivity.H();
        H.getClass();
        Parcelable.Creator<zh5> creator = zh5.CREATOR;
        zh5 zh5Var = (zh5) zh5.d.get("music-launch");
        if (zh5Var == null) {
            return;
        }
        ssg.a(3, "MainScreenCommunicationTriggerProcessor", "try to open trigger on launch", null);
        xj5 a = H.a();
        bdt I2 = hag.I(byb.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        a.f(zh5Var, mainScreenActivity, ((yg5) ((byb) qdcVar2.C(I2)).c(ern.a(yg5.class))).h(), null);
    }

    public static final Intent J(Context context, rf3 rf3Var) {
        context.getClass();
        return imp.J(context, rf3Var, null, null, 12);
    }

    public static boolean L(lm4 lm4Var, String str, MainScreenActivity mainScreenActivity) {
        Boolean bool = Boolean.TRUE;
        try {
            Class b = lm4Var.b();
            b.getClass();
            Field declaredField = b.getDeclaredField(str);
            declaredField.getClass();
            declaredField.setAccessible(true);
            declaredField.set(mainScreenActivity, bool);
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            return false;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final void G(Intent intent, boolean z) {
        MainScreenActivity mainScreenActivity;
        dud dudVar;
        o5g.H(intent);
        rf3 rf3Var = (rf3) intent.getSerializableExtra("extra.tab");
        int i = 0;
        r4 = null;
        Intent intent2 = null;
        if (rf3Var != null) {
            if (z && !"action.startPlayback".equals(intent.getAction())) {
                cjl cjlVar = this.v;
                x97.y(cjlVar.f, null, null, new bjl(cjlVar, r4, i), 3);
            }
            K(rf3Var, intent.getBundleExtra("extra.args"));
        }
        String action = intent.getAction();
        if (action != null) {
            int i2 = 8;
            switch (action.hashCode()) {
                case -2023208660:
                    if (action.equals("action.startVideoPlayback")) {
                        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("extra.video.clips");
                        List X = parcelableArrayExtra != null ? xz0.X(parcelableArrayExtra) : null;
                        r4 = X instanceof List ? X : 0;
                        jyr jyrVar = VideoClipActivity.y;
                        startActivity(l3l.e(this, r4, 4));
                        return;
                    }
                    return;
                case -1194014638:
                    if (action.equals("action.reportShortcut")) {
                        String stringExtra = intent.getStringExtra("extra.shortcutId");
                        if (stringExtra == null) {
                            dfi.r("analyseIncomingIntent(): shortcutId is null", "MainScreenActivity");
                            return;
                        }
                        j7h j7hVar = this.C0;
                        if (j7hVar != null) {
                            vdq.b(j7hVar.a, stringExtra);
                            return;
                        } else {
                            dfi.r("presenter is null", "MainScreenActivity");
                            return;
                        }
                    }
                    return;
                case -1090200798:
                    if (action.equals("action.open.destination")) {
                        b7h b7hVar = (b7h) intent.getParcelableExtra("extra.destination");
                        intent.removeExtra("extra.destination");
                        if (b7hVar == null || b7hVar.equals(y6h.a)) {
                            mainScreenActivity = this;
                        } else {
                            boolean z2 = b7hVar instanceof x6h;
                            jyr jyrVar2 = this.w0;
                            if (z2) {
                                lxl lxlVar = (lxl) intent.getParcelableExtra("extra.playlist.header.id");
                                if (lxlVar != null && (dudVar = (dud) intent.getParcelableExtra("extra.playlist.cover")) != null) {
                                    intent2 = dxl.j(this, lxlVar, dudVar, null, ((z66) jyrVar2.getValue()).h() ? mxl.a : nxl.a, 48);
                                    mainScreenActivity = this;
                                }
                            } else {
                                mainScreenActivity = this;
                                if (b7hVar instanceof w6h) {
                                    if (!((z66) jyrVar2.getValue()).h()) {
                                        intent2 = new Intent(this, (Class<?>) CollectionMainActivity.class).putExtra("extra.item", v35.m);
                                        intent2.getClass();
                                    }
                                } else if (b7hVar instanceof a7h) {
                                    intent2 = new Intent(this, (Class<?>) CollectionMainActivity.class).putExtra("extra.item", v35.u);
                                    intent2.getClass();
                                } else {
                                    if (!(b7hVar instanceof z6h)) {
                                        b6e.s();
                                        return;
                                    }
                                    intent2 = ((z6h) b7hVar).a;
                                }
                            }
                        }
                        if (intent2 != null) {
                            ViewGroup viewGroup = mainScreenActivity.G0;
                            if (viewGroup != null) {
                                viewGroup.setVisibility(8);
                            }
                            startActivity(intent2);
                            return;
                        }
                        return;
                    }
                    break;
                case -319611163:
                    if (action.equals("action.startPlayback")) {
                        j7h j7hVar2 = this.C0;
                        if (j7hVar2 == null) {
                            dfi.r("presenter is null", "MainScreenActivity");
                            return;
                        } else {
                            ((kbn) j7hVar2.g.getValue()).d("MainScreen.playback()", false);
                            j7hVar2.b.d(j7h.i[0], x97.y(j7hVar2.c, null, null, new jmd(j7hVar2, r4, 25), 3));
                            return;
                        }
                    }
                    break;
                case 862578209:
                    if (action.equals("action.showCommunication")) {
                        x97.y(wyf.F(getLifecycle()), null, null, new zig(this, intent, r4, i2), 3);
                        return;
                    }
                    break;
            }
        }
    }

    public final h7h H() {
        return (h7h) this.H0.getValue();
    }

    public final o I() {
        return getSupportFragmentManager().D("tag.CurrentFragment");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(rf3 rf3Var, Bundle bundle) {
        boolean z;
        boolean f;
        zh5 zh5Var;
        int ordinal;
        jnb h1eVar;
        o v;
        int ordinal2;
        o I;
        Continuation continuation = null;
        if (!v3g.E(this.c).d) {
            ssg.a(4, "MainScreenActivity", "selectTab(): " + rf3Var + ", service is unavailable", null);
            return false;
        }
        jyr jyrVar = k3j.e;
        if (ixf.x()) {
            x97.y(wyf.F(getLifecycle()), null, null, new zig(this, rf3Var, continuation, 9), 3);
        } else {
            h7h H = H();
            H.getClass();
            l18 l18Var = l18.b;
            rf3Var.getClass();
            ssg.a(3, "MainScreenCommunicationTriggerProcessor", "onSelectedTab: " + rf3Var, null);
            if (!isFinishing()) {
                if (rf3Var == rf3.i) {
                    Parcelable.Creator<zh5> creator = zh5.CREATOR;
                    ConcurrentHashMap concurrentHashMap = zh5.d;
                    zh5 zh5Var2 = (zh5) concurrentHashMap.get("music-book-tab");
                    if (zh5Var2 != null) {
                        xj5 a = H.a();
                        z = false;
                        bdt I2 = hag.I(byb.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        f = a.f(zh5Var2, this, ((yg5) ((byb) qdcVar.C(I2)).c(ern.a(yg5.class))).h(), null);
                        if (!f && (zh5Var = (zh5) concurrentHashMap.get("music-podcast-tab")) != null) {
                            xj5 a2 = H.a();
                            bdt I3 = hag.I(byb.class);
                            qdc qdcVar2 = l18Var.a;
                            qdcVar2.getClass();
                            a2.f(zh5Var, this, ((yg5) ((byb) qdcVar2.C(I3)).c(ern.a(yg5.class))).h(), null);
                        }
                    }
                } else {
                    z = false;
                    zh5 b = h7h.b(rf3Var);
                    if (b != null) {
                        xj5 a3 = H.a();
                        bdt I4 = hag.I(byb.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        a3.f(b, this, ((yg5) ((byb) qdcVar3.C(I4)).c(ern.a(yg5.class))).h(), null);
                    }
                }
                ordinal = rf3Var.ordinal();
                if (ordinal != 0) {
                    jyr jyrVar2 = c2e.e;
                    if (kg5.B()) {
                        h1eVar = new h2e();
                        h1eVar.setArguments(cxb.K(new Pair("landing.skeleton.focus.on.tab.id", null), new Pair("landing.skeleton.focus.on.block.id", null)));
                    } else {
                        h1eVar = new h1e();
                    }
                } else if (ordinal == 1) {
                    h1eVar = new bbj();
                } else if (ordinal == 2) {
                    h1eVar = new d16(((e26) this.O0.getValue()).a);
                } else if (ordinal == 3) {
                    h1eVar = new gef();
                    h1eVar.setArguments(null);
                } else if (ordinal == 4) {
                    h1eVar = new hz4();
                } else {
                    if (ordinal != 5) {
                        b6e.s();
                        return z;
                    }
                    h1eVar = new ftu();
                    h1eVar.setArguments(null);
                }
                if (rf3Var == l().J() && I() != null) {
                    I = I();
                    if (p1g.z(I == null ? I.getArguments() : null, bundle) && (bundle == null || !bundle.getBoolean("extra.ignore.same.tab", z))) {
                        ssg.a(5, "MainScreenActivity", "selectTab(): " + rf3Var + ", same tab with same args -> don't update", null);
                        return true;
                    }
                }
                ssg.a(2, "MainScreenActivity", "selectTab(): " + rf3Var, null);
                if (l().J() != rf3Var) {
                    l().b(rf3Var);
                }
                if (bundle != null) {
                    Bundle arguments = h1eVar.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                        h1eVar.setArguments(arguments);
                    }
                    arguments.putAll(bundle);
                }
                v = !(h1eVar instanceof duc) ? q6k.v(this, h1eVar, false) : h1eVar;
                if (v == h1eVar && (ordinal2 = rf3Var.ordinal()) != 0) {
                    if (ordinal2 != 1) {
                        iem iemVar = iem.b;
                        iemVar.G(hem.TotalDuration);
                        iemVar.G(hem.InitialRendering);
                    } else if (ordinal2 != 2 && ordinal2 != 3) {
                        if (ordinal2 == 4) {
                            xqi xqiVar = xqi.b;
                            xqiVar.G(wqi.TotalDuration);
                            xqiVar.G(wqi.InitialRendering);
                        } else if (ordinal2 != 5) {
                            b6e.s();
                            return false;
                        }
                    }
                }
                if (getSupportFragmentManager().H() > 0) {
                    androidx.fragment.app.a G = getSupportFragmentManager().G(0);
                    G.getClass();
                    getSupportFragmentManager().U(G.v, false);
                }
                y supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.e(R.id.content_frame, v, "tag.CurrentFragment");
                aVar.k(true, true);
                return true;
            }
        }
        z = false;
        ordinal = rf3Var.ordinal();
        if (ordinal != 0) {
        }
        if (rf3Var == l().J()) {
            I = I();
            if (p1g.z(I == null ? I.getArguments() : null, bundle)) {
                ssg.a(5, "MainScreenActivity", "selectTab(): " + rf3Var + ", same tab with same args -> don't update", null);
                return true;
            }
        }
        ssg.a(2, "MainScreenActivity", "selectTab(): " + rf3Var, null);
        if (l().J() != rf3Var) {
        }
        if (bundle != null) {
        }
        if (!(h1eVar instanceof duc)) {
        }
        if (v == h1eVar) {
            if (ordinal2 != 1) {
            }
        }
        if (getSupportFragmentManager().H() > 0) {
        }
        y supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
        aVar2.e(R.id.content_frame, v, "tag.CurrentFragment");
        aVar2.k(true, true);
        return true;
    }

    public final void M(boolean z) {
        if (isFinishing()) {
            return;
        }
        Parcelable ndbVar = z ? mdb.a : new ndb(true);
        Intent intent = new Intent(this, (Class<?>) EntryScreenActivity.class);
        intent.putExtra("entry_type", ndbVar);
        if (!(ndbVar instanceof ndb)) {
            if (!(ndbVar instanceof mdb)) {
                b6e.s();
                return;
            }
            intent.setFlags(268468224);
        }
        jyr jyrVar = i7h.e;
        boolean A = y7g.A();
        lhs lhsVar = Q0;
        if (A) {
            intent.addFlags(268468224);
            startActivity(intent);
            lhsVar.g = -1L;
            overridePendingTransition(0, 0);
            return;
        }
        startActivity(intent);
        lhsVar.g = -1L;
        finish();
        overridePendingTransition(0, 0);
    }

    public final void N() {
        if (isFinishing()) {
            return;
        }
        lik likVar = new lik(vik.d, null, null);
        Intent intent = new Intent(this, (Class<?>) TariffPaywallActivity.class);
        intent.putExtra("navigation_source_info", likVar);
        intent.putExtra("promo_code", (String) null);
        jyr jyrVar = i7h.e;
        boolean A = y7g.A();
        lhs lhsVar = Q0;
        if (A) {
            intent.addFlags(268468224);
            startActivity(intent);
            lhsVar.g = -1L;
            overridePendingTransition(0, 0);
            return;
        }
        startActivity(intent);
        lhsVar.g = -1L;
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // ru.yandex.music.player.a, defpackage.gnb, defpackage.lnb
    public final fnb g() {
        fnb B = B();
        if (B == null) {
            B = super.g();
            fnb fnbVar = null;
            if (!(I() instanceof hmr)) {
                B = null;
            }
            if (B == null) {
                o I = I();
                jnb jnbVar = I instanceof jnb ? (jnb) I : null;
                if (jnbVar != null) {
                    if (jnbVar.getLifecycle().b().compareTo(lyf.c) < 0) {
                        jnbVar = null;
                    }
                    if (jnbVar != null) {
                        fnbVar = jnbVar.g.m();
                    }
                }
                return fnbVar == null ? super.g() : fnbVar;
            }
        }
        return B;
    }

    @Override // defpackage.gnb
    public final gfo j() {
        return this.Z;
    }

    @Override // defpackage.np2
    public final fii k() {
        return this.Y;
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        o I = I();
        if (I != null) {
            I.onActivityResult(i, i2, intent);
        }
        gs4 gs4Var = this.D0;
        if (gs4Var == null || i != 24 || i2 == -1) {
            return;
        }
        v3w.k("Update flow failed. Result code = ", i2, 6, null, null);
        ((tge) ((jyr) gs4Var.a).getValue()).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0177, code lost:
    
        if (r6.f.get() == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bc  */
    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        c7h c7hVar;
        int ordinal;
        rf3 rf3Var;
        boolean z4;
        int i;
        l18 l18Var = l18.b;
        lhs lhsVar = Q0;
        boolean z5 = true;
        if (bundle == null && Intrinsics.d(getIntent().getAction(), "android.intent.action.MAIN") && (getIntent().getFlags() & 2097152) != 0) {
            e7r e7rVar = (e7r) this.L0.getValue();
            if (((Boolean) e7rVar.d.invoke()).booleanValue() && (i = Build.VERSION.SDK_INT) >= 31) {
                e7rVar.a().K();
                hn5 hn5Var = e7rVar.a;
                evj q6rVar = i >= 31 ? new q6r(hn5Var) : new evj(hn5Var);
                q6rVar.d();
                q6rVar.k(new d7r(e7rVar));
                ((MainScreenActivity) e7rVar.b.b).J0 = true;
            }
        }
        if (!CollectionsKt.I(u75.h("android.intent.action.MAIN", "ACTION_OPEN_PLAYER"), getIntent().getAction())) {
            lhsVar.g = -1L;
        }
        ((bsr) this.v0.getValue()).d().f();
        p();
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.B = new wj3(7, this);
        super.onCreate(bundle);
        AtomicReference atomicReference = nu7.a;
        mu7 mu7Var = (mu7) atomicReference.get();
        int i2 = 3;
        int i3 = 2;
        Continuation continuation = null;
        if (mu7Var == null || mu7Var.isCancelled()) {
            ou7 p = x97.p(cmd.a, null, pm6.b, new dt0(i3, i2, continuation), 1);
            while (true) {
                if (atomicReference.compareAndSet(mu7Var, p)) {
                    p.start();
                    break;
                } else {
                    if (atomicReference.get() != mu7Var) {
                        break;
                    }
                    continuation = continuation;
                    z5 = z5;
                    i3 = i3;
                }
            }
        }
        if (!isTaskRoot() && (getIntent().getFlags() & RemoteCameraConfig.Camera.BITRATE) != 0) {
            finish();
            return;
        }
        frt frtVar = this.c;
        yxc E = v3g.E(frtVar);
        ((y18) this.y0.getValue()).getClass();
        b9s[] b9sVarArr = d9s.a;
        boolean booleanValue = !d9s.a(b9s.c) ? false : ((Boolean) x97.D(g.a, new dt0(i3, 6, continuation))).booleanValue();
        boolean z6 = ((!getSharedPreferences("Yandex_Music", 0).getBoolean("onboarding", z5) || v3g.E(this.c).a.d) && !"com.yandex.passport.ACTION_LOGIN_RESULT".equals(getIntent().getAction())) ? false : z5;
        if (!v3g.E(frtVar).h) {
            if (n()) {
                lwc lwcVar = (lwc) this.x0.getValue();
                if (lwcVar.a()) {
                }
            }
            if (v3g.E(this.c).a.d) {
                z = z5;
                if (bundle == null) {
                    h7h H = H();
                    H.getClass();
                    if (!isFinishing() && !isInMultiWindowMode()) {
                        Intent intent = getIntent();
                        intent.getClass();
                        int flags = intent.getFlags();
                        boolean z7 = (flags & 268435456) != 0;
                        boolean z8 = (flags & 1048576) != 0;
                        boolean d = Intrinsics.d(intent.getAction(), "android.intent.action.MAIN");
                        boolean hasCategory = intent.hasCategory("android.intent.category.LAUNCHER");
                        if (z7 && !z8 && d && hasCategory && !p6g.C((e6l) ((oq7) H.c.getValue()).a.c.getValue())) {
                            Parcelable.Creator<zh5> creator = zh5.CREATOR;
                            if (((zh5) zh5.d.get("music-launch")) != null) {
                                z2 = true;
                                if (!isFinishing() && !isInMultiWindowMode()) {
                                    Intent intent2 = getIntent();
                                    intent2.getClass();
                                    int flags2 = intent2.getFlags();
                                    z4 = (flags2 & 268435456) == 0;
                                    boolean z9 = (flags2 & 1048576) == 0;
                                    boolean d2 = Intrinsics.d(intent2.getAction(), "android.intent.action.MAIN");
                                    boolean hasCategory2 = intent2.hasCategory("android.intent.category.LAUNCHER");
                                    if (z4 && !z9 && d2 && hasCategory2 && bundle == null) {
                                        z3 = true;
                                        boolean z10 = !z2 || z3;
                                        if (booleanValue) {
                                            Intent intent3 = new Intent(this, (Class<?>) GdprScreenActivity.class);
                                            jyr jyrVar = i7h.e;
                                            if (y7g.A()) {
                                                intent3.addFlags(268468224);
                                                startActivity(intent3);
                                                lhsVar.g = -1L;
                                                overridePendingTransition(0, 0);
                                            } else {
                                                startActivity(intent3);
                                                lhsVar.g = -1L;
                                                finish();
                                                overridePendingTransition(0, 0);
                                            }
                                            c7hVar = c7h.b;
                                        } else if (z6) {
                                            M(false);
                                            c7hVar = c7h.b;
                                        } else if (z) {
                                            N();
                                            c7hVar = c7h.b;
                                        } else if (z10) {
                                            ps psVar = new ps(this, z3, 5);
                                            if (this.J0) {
                                                this.K0 = psVar;
                                            } else {
                                                psVar.invoke();
                                            }
                                            c7hVar = c7h.a;
                                        } else {
                                            H().e();
                                            x97.y(wyf.F(getLifecycle()), null, null, new e7h(this, E, (Continuation) null), 3);
                                            c7hVar = c7h.a;
                                        }
                                        ordinal = c7hVar.ordinal();
                                        if (ordinal != 0) {
                                            if (ordinal == 1) {
                                                return;
                                            }
                                            b6e.s();
                                            return;
                                        }
                                        if (this.p) {
                                            dfi.r("View already set", "BaseActivity");
                                        }
                                        this.p = true;
                                        s(bundle);
                                        this.G0 = (ViewGroup) findViewById(R.id.content_frame);
                                        if (bundle == null || getSupportFragmentManager().C(R.id.support_chat_spy_log_frame) == null) {
                                            x97.y(wyf.F(getLifecycle()), null, null, new d7h(this, null, 1), 3);
                                        }
                                        j7h j7hVar = new j7h(this);
                                        this.C0 = j7hVar;
                                        j7hVar.h = new g8c((Object) this);
                                        gs4 gs4Var = new gs4(18);
                                        this.D0 = gs4Var;
                                        View findViewById = findViewById(android.R.id.content);
                                        findViewById.getClass();
                                        yfx yfxVar = new yfx(findViewById);
                                        n7b n7bVar = (n7b) gs4Var.e;
                                        n7bVar.getClass();
                                        yfxVar.c = n7bVar;
                                        gs4Var.d = yfxVar;
                                        if (bundle != null) {
                                            this.E0 = bundle.getBoolean("key.any.dialog.shown", false);
                                            return;
                                        }
                                        if (getIntent().getSerializableExtra("extra.tab") == null) {
                                            jyr jyrVar2 = t5j.e;
                                            if (wyf.M()) {
                                                rf3Var = rf3.m;
                                            } else {
                                                jyr jyrVar3 = dvu.e;
                                                rf3Var = kwl.d() ? rf3.h : ((z66) j7hVar.d.getValue()).h() ? rf3.l : rf3.h;
                                            }
                                            K(rf3Var, getIntent().getBundleExtra("extra.args"));
                                        }
                                        Intent intent4 = getIntent();
                                        intent4.getClass();
                                        G(intent4, this.N0);
                                        nfj nfjVar = (nfj) this.z0.getValue();
                                        nfjVar.getClass();
                                        if (!nfjVar.a) {
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                oks.a.a(this);
                                            }
                                            nfjVar.a = true;
                                        }
                                        lhsVar.c();
                                        List h = u75.h("default", "off", "control");
                                        bdt I = hag.I(byb.class);
                                        qdc qdcVar = l18Var.a;
                                        qdcVar.getClass();
                                        if (h.contains(((q4s) ((byb) qdcVar.C(I)).b(q4s.class)).b())) {
                                            return;
                                        }
                                        bdt I2 = hag.I(k4s.class);
                                        qdc qdcVar2 = l18Var.a;
                                        qdcVar2.getClass();
                                        c5s c5sVar = (c5s) ((k4s) qdcVar2.C(I2)).a.getValue();
                                        x97.y(c5sVar.m, dm6.b, null, new t4s(c5sVar, null, 1), 2);
                                        return;
                                    }
                                }
                                z3 = false;
                                if (z2) {
                                }
                                if (booleanValue) {
                                }
                                ordinal = c7hVar.ordinal();
                                if (ordinal != 0) {
                                }
                            }
                        }
                    }
                }
                z2 = false;
                if (!isFinishing()) {
                    Intent intent22 = getIntent();
                    intent22.getClass();
                    int flags22 = intent22.getFlags();
                    if ((flags22 & 268435456) == 0) {
                    }
                    if ((flags22 & 1048576) == 0) {
                    }
                    boolean d22 = Intrinsics.d(intent22.getAction(), "android.intent.action.MAIN");
                    boolean hasCategory22 = intent22.hasCategory("android.intent.category.LAUNCHER");
                    if (z4) {
                        z3 = true;
                        if (z2) {
                        }
                        if (booleanValue) {
                        }
                        ordinal = c7hVar.ordinal();
                        if (ordinal != 0) {
                        }
                    }
                }
                z3 = false;
                if (z2) {
                }
                if (booleanValue) {
                }
                ordinal = c7hVar.ordinal();
                if (ordinal != 0) {
                }
            }
        }
        z = false;
        if (bundle == null) {
        }
        z2 = false;
        if (!isFinishing()) {
        }
        z3 = false;
        if (z2) {
        }
        if (booleanValue) {
        }
        ordinal = c7hVar.ordinal();
        if (ordinal != 0) {
        }
    }

    @Override // ru.yandex.music.player.a, defpackage.np2, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        j7h j7hVar = this.C0;
        if (j7hVar != null) {
            j7hVar.b.d(j7h.i[0], null);
            saf.D(j7hVar.c.a, null);
            j7hVar.h = null;
        }
        gs4 gs4Var = this.D0;
        if (gs4Var != null) {
            gs4Var.d = null;
        }
    }

    @Override // ru.yandex.music.player.a, defpackage.hn5, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (isFinishing()) {
            return;
        }
        setIntent(intent);
        jyr jyrVar = i7h.e;
        if (!y7g.A()) {
            G(intent, true);
        } else if (this.p) {
            G(intent, true);
        } else {
            ssg.a(4, "MainScreenActivity", "onNewIntent was called before onCreate, analyzing intent is being deferred", null);
            this.N0 = true;
        }
    }

    @Override // ru.yandex.music.player.a, androidx.fragment.app.t, android.app.Activity
    public final void onPause() {
        super.onPause();
        gs4 gs4Var = this.D0;
        if (gs4Var != null) {
            ((rjq) gs4Var.b).V();
        }
    }

    @Override // ru.yandex.music.player.a, androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        try {
            super.onResume();
        } catch (IllegalArgumentException e) {
            boolean z = L(ern.a(Activity.class), "mCalled", this) && L(ern.a(t.class), "mResumed", this);
            Intent intent = getIntent();
            ssg.a(7, "MainScreenActivity", "Error onResume isFlagsSet=" + z + "\nintent=" + (intent != null ? intent.toURI() : null), e);
        }
        lbr.a();
        qld.I(1000L, new opg(20));
        wqv.a();
        gs4 gs4Var = this.D0;
        if (gs4Var != null) {
            l18 l18Var = l18.b;
            bdt I = hag.I(byb.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            if (((vge) ((byb) qdcVar.C(I)).c(ern.a(vge.class))).h()) {
                ((rjq) gs4Var.b).g();
                ox6.B(new fkn(((tge) ((jyr) gs4Var.a).getValue()).c), (um6) gs4Var.c, new t58(24, gs4Var, this));
            }
        }
        ViewGroup viewGroup = this.G0;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        String stringExtra = getIntent().getStringExtra("extra.fragment.on.current.activity");
        if (stringExtra != null) {
            getIntent().removeExtra("extra.fragment.on.current.activity");
            w1g.y(this, stringExtra, true);
        }
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key.any.dialog.shown", this.E0);
    }

    @Override // ru.yandex.music.player.a, defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.A0.g();
        x97.y(this.B0, null, null, new d7h(this, null, 0), 3);
    }

    @Override // ru.yandex.music.player.a, defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.A0.V();
    }

    @Override // android.app.Activity
    public final void onTopResumedActivityChanged(boolean z) {
        super.onTopResumedActivityChanged(z);
        ssg.a(4, "MainScreenActivity", vz1.q("onTopResumedActivityChanged(isTopResumedActivity=", ")", z), null);
        zqj zqjVar = (zqj) this.F0.getValue();
        zqjVar.k = z;
        xdr xdrVar = zqjVar.l;
        xdrVar.m(null, Boolean.valueOf(((Boolean) xdrVar.getValue()).booleanValue() && z));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ssg.a(4, "MainScreenActivity", vz1.q("onWindowFocusChanged(hasFocus=", ")", z), null);
        zqj zqjVar = (zqj) this.F0.getValue();
        v3w.n(z && zqjVar.k, zqjVar.l, null);
    }

    @Override // ru.yandex.music.player.a, defpackage.np2
    public final int q() {
        return R.layout.activity_main_layout;
    }

    @Override // defpackage.hq0
    public final void setSupportActionBar(Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
        qd supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.n(false);
        }
    }

    @Override // defpackage.np2
    public final void w(yxc yxcVar) {
        drt drtVar;
        boolean z;
        if (yxcVar == null || (drtVar = yxcVar.a) == null || !(z = drtVar.d)) {
            M(true);
        } else {
            if (!z || yxcVar.h || n()) {
                return;
            }
            N();
        }
    }
}
