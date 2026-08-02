package com.yandex.payment.sdk.transportcards.ui;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.connectsdk.service.DeviceService;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import defpackage.a6p;
import defpackage.axi;
import defpackage.bhg;
import defpackage.bhp;
import defpackage.btf;
import defpackage.bxi;
import defpackage.dag;
import defpackage.ern;
import defpackage.g0c;
import defpackage.gut;
import defpackage.h5n;
import defpackage.hdq;
import defpackage.hq0;
import defpackage.jj4;
import defpackage.jsg;
import defpackage.jyr;
import defpackage.knn;
import defpackage.ksw;
import defpackage.l9t;
import defpackage.lqv;
import defpackage.mqv;
import defpackage.n9t;
import defpackage.ncs;
import defpackage.ndu;
import defpackage.nqv;
import defpackage.ocg;
import defpackage.oqv;
import defpackage.p77;
import defpackage.qne;
import defpackage.qzc;
import defpackage.r77;
import defpackage.rh;
import defpackage.rhc;
import defpackage.rk7;
import defpackage.rsd;
import defpackage.shc;
import defpackage.u8b;
import defpackage.uf6;
import defpackage.vh;
import defpackage.wct;
import defpackage.wdu;
import defpackage.x60;
import defpackage.xal;
import defpackage.ybf;
import defpackage.ywi;
import defpackage.z3i;
import defpackage.zwi;
import io.appmetrica.analytics.IReporter;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class TransportCardsActivity extends hq0 implements rsd {
    public static final /* synthetic */ int i = 0;
    public a6p a;
    public bxi c;
    public bhg d;
    public g0c e;
    public qzc f;
    public final ybf b = new ybf(ern.a(n9t.class), new l9t(this, 1), new l9t(this, 4), new l9t(this, 2));
    public final jyr g = btf.b(new l9t(this, 0));
    public final jyr h = btf.b(new l9t(this, 3));

    public TransportCardsActivity() {
        final int i2 = 0;
        registerForActivityResult(new vh(6), new rh(this) { // from class: k9t
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                int i3 = i2;
                TransportCardsActivity transportCardsActivity = this.b;
                pdk pdkVar = (pdk) obj;
                switch (i3) {
                    case 0:
                        int i4 = TransportCardsActivity.i;
                        pdkVar.getClass();
                        g0c g0cVar = transportCardsActivity.e;
                        if (g0cVar == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        r1f r1fVar = r1f.a;
                        vtm k = su4.k("Транспортные карты: Шторка привязки опустилась", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                        ci0 ci0Var = qjb.a;
                        ci0Var.a = su4.g(1, ci0Var.a);
                        k.u(qee.n() + ci0Var.a, "eventus_id");
                        ((x60) g0cVar).a(su4.j(k, "event_name", "transport_bind_finish", "transport_bind_finish", k));
                        return;
                    default:
                        int i5 = TransportCardsActivity.i;
                        pdkVar.getClass();
                        g0c g0cVar2 = transportCardsActivity.e;
                        if (g0cVar2 == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        r1f r1fVar2 = r1f.a;
                        vtm k2 = su4.k("Транспортные карты: Шторка оплаты опустилась", linkedHashMap2, DeviceService.KEY_DESC, linkedHashMap2);
                        ci0 ci0Var2 = qjb.a;
                        ci0Var2.a = su4.g(1, ci0Var2.a);
                        k2.u(qee.n() + ci0Var2.a, "eventus_id");
                        ((x60) g0cVar2).a(su4.j(k2, "event_name", "transport_payment_finish", "transport_payment_finish", k2));
                        return;
                }
            }
        });
        final int i3 = 1;
        registerForActivityResult(new vh(8), new rh(this) { // from class: k9t
            public final /* synthetic */ TransportCardsActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                int i32 = i3;
                TransportCardsActivity transportCardsActivity = this.b;
                pdk pdkVar = (pdk) obj;
                switch (i32) {
                    case 0:
                        int i4 = TransportCardsActivity.i;
                        pdkVar.getClass();
                        g0c g0cVar = transportCardsActivity.e;
                        if (g0cVar == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        r1f r1fVar = r1f.a;
                        vtm k = su4.k("Транспортные карты: Шторка привязки опустилась", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                        ci0 ci0Var = qjb.a;
                        ci0Var.a = su4.g(1, ci0Var.a);
                        k.u(qee.n() + ci0Var.a, "eventus_id");
                        ((x60) g0cVar).a(su4.j(k, "event_name", "transport_bind_finish", "transport_bind_finish", k));
                        return;
                    default:
                        int i5 = TransportCardsActivity.i;
                        pdkVar.getClass();
                        g0c g0cVar2 = transportCardsActivity.e;
                        if (g0cVar2 == null) {
                            Intrinsics.j("eventReporter");
                            throw null;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        r1f r1fVar2 = r1f.a;
                        vtm k2 = su4.k("Транспортные карты: Шторка оплаты опустилась", linkedHashMap2, DeviceService.KEY_DESC, linkedHashMap2);
                        ci0 ci0Var2 = qjb.a;
                        ci0Var2.a = su4.g(1, ci0Var2.a);
                        k2.u(qee.n() + ci0Var2.a, "eventus_id");
                        ((x60) g0cVar2).a(su4.j(k2, "event_name", "transport_payment_finish", "transport_payment_finish", k2));
                        return;
                }
            }
        });
    }

    @Override // defpackage.rsd
    public final rk7 a() {
        rk7 rk7Var = new rk7();
        rk7Var.a(p77.class, j());
        rk7Var.a(r77.class, (r77) this.h.getValue());
        return rk7Var;
    }

    public final p77 j() {
        return (p77) this.g.getValue();
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Resources.Theme theme = new uf6(this, shc.a.a(this).x()).getTheme();
        theme.getClass();
        int x = (ocg.z(R.attr.paymentsdk_is_light_theme, theme) != null ? ocg.A(theme, R.attr.paymentsdk_is_light_theme, true) ? rhc.a : rhc.b : ksw.N(ksw.G(this))).a(this).x();
        setTheme(x);
        getApplicationContext().setTheme(x);
        super.onCreate(bundle);
        setContentView(R.layout.paymentsdk_activity_transport_card);
        r77 r77Var = (r77) this.h.getValue();
        r77Var.getClass();
        this.a = new a6p(Collections.singletonMap(n9t.class, r77Var.k));
        this.c = (bxi) r77Var.c.get();
        this.d = (bhg) r77Var.j.get();
        this.e = (g0c) r77Var.a.k.get();
        boolean H = ksw.H(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayoutLoading);
        ImageView imageView = (ImageView) findViewById(R.id.imageViewBack);
        bhg bhgVar = this.d;
        if (bhgVar == null) {
            Intrinsics.j("loadingHider");
            throw null;
        }
        ncs ncsVar = new ncs(6, frameLayout);
        bhgVar.b = false;
        bhgVar.a = ncsVar;
        hdq hdqVar = new hdq(this);
        jsg a = H ? hdq.a("#FFB6B8BF") : hdq.a("#FF777A85");
        if (a == null) {
            a = hdq.j;
        }
        hdqVar.f = a;
        hdqVar.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        hdqVar.c();
        hdqVar.d();
        hdqVar.invalidateSelf();
        hdqVar.b();
        frameLayout.setBackground(hdqVar);
        imageView.setImageResource(H ? R.drawable.paymentsdk_ic_back_light : R.drawable.paymentsdk_ic_back_dark);
        imageView.setOnClickListener(new xal(12, this));
        View inflate = getLayoutInflater().inflate(R.layout.paymentsdk_layout_transport_error, (ViewGroup) null, false);
        int i2 = R.id.errorDescription;
        if (((TextView) dag.v(R.id.errorDescription, inflate)) != null) {
            i2 = R.id.errorImageView;
            if (((ImageView) dag.v(R.id.errorImageView, inflate)) != null) {
                i2 = R.id.errorTitle;
                if (((TextView) dag.v(R.id.errorTitle, inflate)) != null) {
                    i2 = R.id.feedsdkErrorActionButton;
                    TextView textView = (TextView) dag.v(R.id.feedsdkErrorActionButton, inflate);
                    if (textView != null) {
                        this.f = new qzc(textView, (ConstraintLayout) inflate);
                        bxi bxiVar = this.c;
                        if (bxiVar == null) {
                            Intrinsics.j("nativeRoutesExecutor");
                            throw null;
                        }
                        HashMap hashMap = bxiVar.a;
                        u8b u8bVar = new u8b(1, 18);
                        wct.o(1, u8bVar);
                        hashMap.put(String.valueOf(ern.a(axi.class).h()), u8bVar);
                        u8b u8bVar2 = new u8b(1, 19);
                        wct.o(1, u8bVar2);
                        hashMap.put(String.valueOf(ern.a(ywi.class).h()), u8bVar2);
                        u8b u8bVar3 = new u8b(1, 20);
                        wct.o(1, u8bVar3);
                        hashMap.put(String.valueOf(ern.a(zwi.class).h()), u8bVar3);
                        new Handler(Looper.getMainLooper()).post(new bhp(16, this));
                        Window window = getWindow();
                        knn knnVar = new knn(findViewById(R.id.frameLayoutRoot));
                        int i3 = Build.VERSION.SDK_INT;
                        (i3 >= 35 ? new oqv(window, knnVar) : i3 >= 30 ? new nqv(window, knnVar) : i3 >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar)).k0(ksw.H(this));
                        Window window2 = getWindow();
                        knn knnVar2 = new knn(findViewById(R.id.frameLayoutRoot));
                        int i4 = Build.VERSION.SDK_INT;
                        (i4 >= 35 ? new oqv(window2, knnVar2) : i4 >= 30 ? new nqv(window2, knnVar2) : i4 >= 26 ? new mqv(window2, knnVar2) : new lqv(window2, knnVar2)).j0(ksw.H(this));
                        View decorView = getWindow().getDecorView();
                        h5n h5nVar = new h5n(28, this);
                        WeakHashMap weakHashMap = wdu.a;
                        ndu.n(decorView, h5nVar);
                        return;
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f = null;
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onPause() {
        IReporter a;
        z3i z3iVar = z3i.c;
        if (z3iVar != null && (a = z3iVar.a()) != null) {
            a.pauseSession();
        }
        g0c c = j().c();
        qne m = gut.m();
        x60 x60Var = (x60) c;
        x60Var.getClass();
        x60Var.a(m);
        super.onPause();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        IReporter a;
        super.onResume();
        z3i z3iVar = z3i.c;
        if (z3iVar != null && (a = z3iVar.a()) != null) {
            a.resumeSession();
        }
        g0c c = j().c();
        qne n = gut.n();
        x60 x60Var = (x60) c;
        x60Var.getClass();
        x60Var.a(n);
    }
}
