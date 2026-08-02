package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.t;
import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.screen.landing.api.header.ui.view.BottomsheetCollapsingTopBar;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh1e;", "Ljnb;", "Lduc;", "Lq1s;", "<init>", "()V", "landing-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class h1e extends jnb implements duc, q1s {
    public u1e j;
    public s2e k;
    public final suc l = new suc(this, new ruc("SmartLandingFragment", true));
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final zh p;
    public final zh q;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public final gfo u;
    public final ybf v;
    public final jyr w;
    public final g1e x;
    public final jyr y;

    public h1e() {
        bdt I = hag.I(z66.class);
        l18 l18Var = l18.b;
        this.m = l18Var.b(I, true);
        this.n = l18Var.b(hag.I(yjf.class), true);
        this.o = btf.b(new sxd(1));
        final int i = 0;
        zh registerForActivityResult = registerForActivityResult(new vh(4), new rh(this) { // from class: d1e
            public final /* synthetic */ h1e b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                int i2 = i;
                final int i3 = 0;
                h1e h1eVar = this.b;
                Continuation continuation = null;
                int i4 = 3;
                qh qhVar = (qh) obj;
                switch (i2) {
                    case 0:
                        qhVar.getClass();
                        int i5 = qhVar.a;
                        if (i5 != -1) {
                            if (i5 != 0) {
                                return;
                            }
                            u1e u1eVar = h1eVar.j;
                            if (u1eVar != null) {
                                ((k1l) u1eVar.r.getValue()).a(new PlayCommand(false), new b3t("core_play"));
                                return;
                            } else {
                                Intrinsics.j("presenter");
                                throw null;
                            }
                        }
                        final u1e u1eVar2 = h1eVar.j;
                        if (u1eVar2 == null) {
                            Intrinsics.j("presenter");
                            throw null;
                        }
                        final int i6 = 1;
                        x97.y(u1eVar2.w, null, null, new ptd(u1eVar2, new Function1() { // from class: l1e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i7 = i6;
                                ((Boolean) obj2).getClass();
                                switch (i7) {
                                    case 0:
                                        u1eVar2.B.a().S();
                                        break;
                                    default:
                                        u1eVar2.B.a().S();
                                        break;
                                }
                                return Unit.a;
                            }
                        }, continuation, i4), 3);
                        tjf tjfVar = u1eVar2.x;
                        tjfVar.getClass();
                        String t = weo.t();
                        s9p y = tyf.y((lwu) tjfVar.b().e.a.getValue());
                        if (y == null) {
                            y = new s9p(t75.c(r9p.a));
                        }
                        s9p s9pVar = y;
                        ekf ekfVar = tjfVar.d;
                        if (ekfVar != null) {
                            t.getClass();
                            nmb nmbVar = dkf.a;
                            fnb fnbVar = ekfVar.a;
                            String X = CollectionsKt.X(o8g.R(s9pVar), null, null, null, null, 63);
                            fnbVar.getClass();
                            nmb nmbVar2 = dkf.a;
                            String G = fnbVar.G();
                            nmbVar2.getClass();
                            G.getClass();
                            LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "main_screen");
                            m.put("hash", G);
                            m.put("entity_id", "my_wave");
                            eta.m(0, "entity_name", "my_wave", "entity_pos", m);
                            k.u(0, "entity_height", "playback_action_id", t, m);
                            eta.m(1, "entity_type", "my_wave", "entity_pos_x", m);
                            k.u(3, "entity_pos_y", "object_type", "wave", m);
                            eta.m(1, "object_id", X, "object_pos_x", m);
                            m.put("object_pos_y", String.valueOf(1));
                            m.put("_meta", nmb.u(3));
                            nmbVar2.C("Home.MyWave.Started", m);
                        }
                        dhn.b.g(s9pVar.a().getTag());
                        mg5.a(tjfVar.b(), s9pVar, tjfVar.a, tjf.f(s9pVar), (chn) tjfVar.p.getValue(), 16);
                        return;
                    default:
                        final u1e u1eVar3 = h1eVar.j;
                        if (u1eVar3 == null) {
                            Intrinsics.j("presenter");
                            throw null;
                        }
                        x97.y(u1eVar3.w, null, null, new ptd(u1eVar3, new Function1() { // from class: l1e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i7 = i3;
                                ((Boolean) obj2).getClass();
                                switch (i7) {
                                    case 0:
                                        u1eVar3.B.a().S();
                                        break;
                                    default:
                                        u1eVar3.B.a().S();
                                        break;
                                }
                                return Unit.a;
                            }
                        }, continuation, i4), 3);
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.p = registerForActivityResult;
        final int i2 = 1;
        zh registerForActivityResult2 = registerForActivityResult(new vh(4), new rh(this) { // from class: d1e
            public final /* synthetic */ h1e b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                int i22 = i2;
                final int i3 = 0;
                h1e h1eVar = this.b;
                Continuation continuation = null;
                int i4 = 3;
                qh qhVar = (qh) obj;
                switch (i22) {
                    case 0:
                        qhVar.getClass();
                        int i5 = qhVar.a;
                        if (i5 != -1) {
                            if (i5 != 0) {
                                return;
                            }
                            u1e u1eVar = h1eVar.j;
                            if (u1eVar != null) {
                                ((k1l) u1eVar.r.getValue()).a(new PlayCommand(false), new b3t("core_play"));
                                return;
                            } else {
                                Intrinsics.j("presenter");
                                throw null;
                            }
                        }
                        final u1e u1eVar2 = h1eVar.j;
                        if (u1eVar2 == null) {
                            Intrinsics.j("presenter");
                            throw null;
                        }
                        final int i6 = 1;
                        x97.y(u1eVar2.w, null, null, new ptd(u1eVar2, new Function1() { // from class: l1e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i7 = i6;
                                ((Boolean) obj2).getClass();
                                switch (i7) {
                                    case 0:
                                        u1eVar2.B.a().S();
                                        break;
                                    default:
                                        u1eVar2.B.a().S();
                                        break;
                                }
                                return Unit.a;
                            }
                        }, continuation, i4), 3);
                        tjf tjfVar = u1eVar2.x;
                        tjfVar.getClass();
                        String t = weo.t();
                        s9p y = tyf.y((lwu) tjfVar.b().e.a.getValue());
                        if (y == null) {
                            y = new s9p(t75.c(r9p.a));
                        }
                        s9p s9pVar = y;
                        ekf ekfVar = tjfVar.d;
                        if (ekfVar != null) {
                            t.getClass();
                            nmb nmbVar = dkf.a;
                            fnb fnbVar = ekfVar.a;
                            String X = CollectionsKt.X(o8g.R(s9pVar), null, null, null, null, 63);
                            fnbVar.getClass();
                            nmb nmbVar2 = dkf.a;
                            String G = fnbVar.G();
                            nmbVar2.getClass();
                            G.getClass();
                            LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "main_screen");
                            m.put("hash", G);
                            m.put("entity_id", "my_wave");
                            eta.m(0, "entity_name", "my_wave", "entity_pos", m);
                            k.u(0, "entity_height", "playback_action_id", t, m);
                            eta.m(1, "entity_type", "my_wave", "entity_pos_x", m);
                            k.u(3, "entity_pos_y", "object_type", "wave", m);
                            eta.m(1, "object_id", X, "object_pos_x", m);
                            m.put("object_pos_y", String.valueOf(1));
                            m.put("_meta", nmb.u(3));
                            nmbVar2.C("Home.MyWave.Started", m);
                        }
                        dhn.b.g(s9pVar.a().getTag());
                        mg5.a(tjfVar.b(), s9pVar, tjfVar.a, tjf.f(s9pVar), (chn) tjfVar.p.getValue(), 16);
                        return;
                    default:
                        final u1e u1eVar3 = h1eVar.j;
                        if (u1eVar3 == null) {
                            Intrinsics.j("presenter");
                            throw null;
                        }
                        x97.y(u1eVar3.w, null, null, new ptd(u1eVar3, new Function1() { // from class: l1e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i7 = i3;
                                ((Boolean) obj2).getClass();
                                switch (i7) {
                                    case 0:
                                        u1eVar3.B.a().S();
                                        break;
                                    default:
                                        u1eVar3.B.a().S();
                                        break;
                                }
                                return Unit.a;
                            }
                        }, continuation, i4), 3);
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.q = registerForActivityResult2;
        this.r = l18Var.b(hag.I(z1e.class), true);
        this.s = l18Var.b(hag.I(zjf.class), true);
        this.t = l18Var.b(hag.I(nmj.class), true);
        this.u = gfo.Tab;
        this.v = new ybf(ern.a(ylf.class), new pva(6, this), new pva(7, new e1e(this, 0)));
        this.w = btf.b(new e1e(this, 1));
        this.x = new g1e(0, this);
        this.y = btf.b(new e1e(this, 2));
    }

    @Override // defpackage.duc
    public final int f() {
        jyr jyrVar = t5j.e;
        boolean M = wyf.M();
        if (M) {
            return 0;
        }
        if (!M) {
            return R.string.nng_header;
        }
        b6e.s();
        return 0;
    }

    @Override // defpackage.duc
    public final boolean h() {
        ((yjf) this.n.getValue()).getClass();
        jyr jyrVar = dvu.e;
        if (kwl.d()) {
            jyr jyrVar2 = t5j.e;
            if (!wyf.M()) {
                return true;
            }
        }
        return ((Boolean) tpq.f.getValue()).booleanValue() && ((z66) this.m.getValue()).f();
    }

    @Override // defpackage.q1s
    public final void j() {
        s2e s2eVar = this.k;
        if (s2eVar == null || s2eVar.p.getState() != 3) {
            return;
        }
        npq npqVar = s2eVar.k().j;
        if (npqVar != null) {
            npqVar.a().U(0);
        }
        s2eVar.l(4);
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bzf.v(this);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("landing.focus.on.tab.id") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("landing.focus.on.block.id") : null;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.putString("landing.focus.on.tab.id", null);
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            arguments4.putString("landing.focus.on.block.id", null);
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        x1e x1eVar = (x1e) this.y.getValue();
        kxi d = d();
        cvo j = getJ();
        jyr jyrVar = o5j.e;
        String str = tyf.v() ? "mobile_foryou" : "main";
        tmb x = x();
        gs4 i0 = wdp.i0(this);
        ylf ylfVar = (ylf) this.v.getValue();
        jfu viewModelStore = requireActivity().getViewModelStore();
        viewModelStore.getClass();
        t l = l();
        l.getClass();
        u1e u1eVar = new u1e(requireContext, x1eVar, d, j, str, x, string, string2, i0, ylfVar, viewModelStore, (hq0) l, this.q, (nmj) this.t.getValue(), new ln6(0, this.l, suc.class, "reportDataLoaded", "reportDataLoaded(Z)V", 0, 1), new v2d(0, this.l, suc.class, "reportFullyDrawn", "reportFullyDrawn()V", 0, 7));
        this.j = u1eVar;
        f1e f1eVar = (f1e) this.w.getValue();
        f1eVar.getClass();
        u1eVar.I = f1eVar;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.view_home_landing, viewGroup, false);
        inflate.getClass();
        return inflate;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        u1e u1eVar = this.j;
        if (u1eVar == null) {
            Intrinsics.j("presenter");
            throw null;
        }
        u1eVar.v.V();
        this.x.remove();
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        u1e u1eVar = this.j;
        if (u1eVar == null) {
            Intrinsics.j("presenter");
            throw null;
        }
        rar rarVar = u1eVar.h;
        if (rarVar != null) {
            rarVar.g(null);
        }
        rar rarVar2 = u1eVar.i;
        if (rarVar2 != null) {
            rarVar2.g(null);
        }
        s2e s2eVar = u1eVar.C;
        if (s2eVar != null) {
            s2eVar.x = null;
        }
        u1eVar.C = null;
        tjf tjfVar = u1eVar.x;
        tjfVar.t.V();
        tjfVar.f.e();
        z5r z5rVar = u1eVar.y;
        e6r e6rVar = z5rVar.h;
        if (e6rVar != null) {
            e6rVar.c = null;
            e6rVar.a.setState(new cvd(zud.k, null, null, null));
            e6rVar.b.setState(null);
        }
        z5rVar.h = null;
        rar rarVar3 = z5rVar.g;
        if (rarVar3 != null) {
            rarVar3.g(null);
        }
        z5rVar.g = null;
        this.k = null;
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        super.onPause();
        u1e u1eVar = this.j;
        if (u1eVar != null) {
            u1eVar.x.f.g();
        } else {
            Intrinsics.j("presenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        u1e u1eVar = this.j;
        if (u1eVar != null) {
            u1eVar.x.f.h();
        } else {
            Intrinsics.j("presenter");
            throw null;
        }
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        s2e s2eVar = this.k;
        if (s2eVar != null) {
            bundle.putInt("BUNDLE_BOTTOM_SHEET_STATE", s2eVar.p.getState());
            bundle.putBoolean("BUNDLE_IS_STICKY_ENABLED", s2eVar.D);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        if (this.j != null) {
            return;
        }
        Intrinsics.j("presenter");
        throw null;
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onStop() {
        if (this.j != null) {
            super.onStop();
        } else {
            Intrinsics.j("presenter");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0208  */
    @Override // androidx.fragment.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        ii7 ii7Var;
        boolean z;
        view.getClass();
        super.onViewCreated(view, bundle);
        u1e u1eVar = this.j;
        Continuation continuation = null;
        if (u1eVar == null) {
            Intrinsics.j("presenter");
            throw null;
        }
        int i = 4;
        ox6.B(u1eVar.L, wyf.F(getLifecycle()), new otd(4, this));
        s2e s2eVar = new s2e(view, bundle);
        u1e u1eVar2 = this.j;
        if (u1eVar2 == null) {
            Intrinsics.j("presenter");
            throw null;
        }
        mm6 mm6Var = u1eVar2.w;
        u1eVar2.C = s2eVar;
        npq npqVar = u1eVar2.B;
        s2eVar.k().setWrapper(npqVar);
        BottomsheetCollapsingTopBar d = s2eVar.d();
        int i2 = 1;
        d.i = true;
        if (d.isAttachedToWindow()) {
            d.l();
        }
        int i3 = 0;
        ox6.B(new u21(10, npqVar.a().N(), npqVar.a().G(), new o1e(3, i3, continuation)), mm6Var, new pm(d, s2eVar, u1eVar2, npqVar, 6));
        ox6.B(npqVar.p, mm6Var, new p1e(d, 0));
        jyr jyrVar = o5j.e;
        if (tyf.v()) {
            ox6.B(npqVar.a().O(), mm6Var, new p1e(d, 1));
        }
        ox6.B(new p6o(npqVar.a().M(), 22), mm6Var, new t58(20, npqVar, s2eVar));
        jyr jyrVar2 = t5j.e;
        mpq mpqVar = new mpq(i3, wyf.M() ? s7g.A(npqVar.a()) : npqVar.a().J(), npqVar);
        msa msaVar = nsa.b;
        ox6.B(zsd.Y(mpqVar, yd5.M(1, ssa.SECONDS)), mm6Var, new q1e(s2eVar, 0));
        ox6.B(npqVar.a().P(), mm6Var, new q1e(s2eVar, 1));
        String str = u1eVar2.c;
        String str2 = u1eVar2.d;
        if (str != null) {
            s2e s2eVar2 = u1eVar2.C;
            if (s2eVar2 != null) {
                s2eVar2.j().post(new sr7(22, s2eVar2));
            }
            npqVar.a().T(str, str2);
            u1eVar2.c = null;
            u1eVar2.d = null;
        }
        int i4 = 3;
        u1eVar2.h = ox6.B(zsd.Y(zsd.b0(zsd.P(u1eVar2.H, zsd.b0(new ifd(s2eVar.q, i)), ((cjl) u1eVar2.n.getValue()).b, (vdr) ((c1e) u1eVar2.s.getValue()).c.getValue(), new r1e(5, u1eVar2, u1e.class, "canShowPlaqueNotification", "canShowPlaqueNotification(ZZLcom/yandex/music/screen/player/api/PlayerBottomSheetState;Z)Z", 4, 0))), yd5.M(500, ssa.MILLISECONDS)), mm6Var, new m1e(u1eVar2, i2));
        int i5 = 2;
        u1eVar2.i = ox6.B(zsd.b0(new ifd((vdr) ((g9m) u1eVar2.A.getValue()).n.getValue(), i5)), mm6Var, new m1e(u1eVar2, i5));
        ox6.B(((p8q) u1eVar2.p.getValue()).d, mm6Var, new m1e(u1eVar2, i4));
        s2eVar.x = new h4b(u1eVar2);
        s2eVar.b(s2eVar.p.getState());
        u1eVar2.b();
        x97.y(mm6Var, null, null, new t1e(u1eVar2, null, i4), 3);
        this.k = s2eVar;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("landing.type.queue")) {
            Object obj = arguments.get("landing.type.queue");
            arguments.remove("landing.type.queue");
            if (obj instanceof ii7) {
                ii7Var = (ii7) obj;
                z = ii7Var instanceof hi7;
                jyr jyrVar3 = this.y;
                if (!z) {
                    hi7 hi7Var = (hi7) ii7Var;
                    List list = hi7Var.a;
                    boolean z2 = hi7Var.b;
                    String t = weo.t();
                    ((x1e) jyrVar3.getValue()).a(list, z2, null, t);
                    u1e u1eVar3 = this.j;
                    if (u1eVar3 == null) {
                        Intrinsics.j("presenter");
                        throw null;
                    }
                    u1eVar3.D.b(t, list);
                } else if (ii7Var instanceof fi7) {
                    fi7 fi7Var = (fi7) ii7Var;
                    String str3 = fi7Var.a;
                    Bundle bundle2 = fi7Var.b;
                    boolean z3 = fi7Var.c;
                    String t2 = weo.t();
                    StationId stationId = StationId.a;
                    List c = t75.c(str3);
                    x1e x1eVar = (x1e) jyrVar3.getValue();
                    c.getClass();
                    x1eVar.a(c, z3, bundle2, t2);
                    u1e u1eVar4 = this.j;
                    if (u1eVar4 == null) {
                        Intrinsics.j("presenter");
                        throw null;
                    }
                    u1eVar4.D.b(t2, c);
                } else {
                    Continuation continuation2 = null;
                    if (Intrinsics.d(ii7Var, gi7.a)) {
                        u1e u1eVar5 = this.j;
                        if (u1eVar5 == null) {
                            Intrinsics.j("presenter");
                            throw null;
                        }
                        rdk rdkVar = u1eVar5.E;
                        x97.y((mm6) rdkVar.b, null, null, new rmf(rdkVar, continuation2, i2), 3);
                    } else if (ii7Var != null) {
                        b6e.s();
                        return;
                    }
                }
                this.l.b();
            }
        }
        ii7Var = null;
        z = ii7Var instanceof hi7;
        jyr jyrVar32 = this.y;
        if (!z) {
        }
        this.l.b();
    }

    @Override // defpackage.jnb
    /* renamed from: y, reason: from getter */
    public final gfo getU() {
        return this.u;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        return (cvo) this.o.getValue();
    }
}
