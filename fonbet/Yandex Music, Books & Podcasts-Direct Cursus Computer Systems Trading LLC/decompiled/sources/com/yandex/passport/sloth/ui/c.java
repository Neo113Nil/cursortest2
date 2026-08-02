package com.yandex.passport.sloth.ui;

import android.app.usage.UsageStatsManager;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import defpackage.b6e;
import defpackage.jc4;
import defpackage.jpj;
import defpackage.js6;
import defpackage.kqv;
import defpackage.l8t;
import defpackage.m8t;
import defpackage.msa;
import defpackage.n8t;
import defpackage.nsa;
import defpackage.otc;
import defpackage.qvc;
import defpackage.r7o;
import defpackage.s9f;
import defpackage.ssa;
import defpackage.t7o;
import defpackage.tqj;
import defpackage.un4;
import defpackage.w3c;
import defpackage.yd5;
import defpackage.z7o;
import defpackage.zne;
import defpackage.zp0;
import defpackage.zqr;
import io.appmetrica.analytics.MviConfig;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.C0335i3;
import io.appmetrica.analytics.impl.C0722vf;
import io.appmetrica.analytics.impl.EnumC0392k3;
import io.appmetrica.analytics.impl.O2;
import io.appmetrica.analytics.locationinternal.impl.C0875g2;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.kinopoisk.sdk.easylogin.internal.C1109k8;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1122l7;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements tqj, jpj, com.yandex.plus.core.reflect.g, com.yandex.plus.core.network.hosts.a, com.yandex.plus.core.network.api.interceptors.e, com.yandex.plus.plaquesdk.plaque.api.dependencies.a, com.yandex.plus.plaquesdk.plaque.api.dependencies.b, com.yandex.plus.core.featureflags.w, com.yandex.plus.core.imageloader.a, js6, ActivationBarrierCallback, FunctionWithThrowable, jc4, InterfaceC1122l7.a, zqr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        qvc qvcVar = (qvc) this.b;
        view.getClass();
        zne g = kqvVar.a.g(655);
        g.getClass();
        qvcVar.setPadding(g.a, g.b, g.c, g.d);
        return kqv.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    @Override // com.yandex.plus.plaquesdk.plaque.api.dependencies.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(ViewGroup viewGroup, long j, com.yandex.plus.plaquesdk.plaque.api.models.i0 i0Var, m8t m8tVar) {
        com.yandex.plus.home.plaque.feature.api.anim.a aVar;
        int ordinal;
        com.yandex.plus.home.plaque.plugin.api.animator.a aVar2;
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar3 = (com.yandex.plus.home.plaque.plugin.internal.proxy.a) this.b;
        viewGroup.getClass();
        i0Var.getClass();
        msa msaVar = nsa.b;
        yd5.N(j, ssa.MILLISECONDS);
        int ordinal2 = i0Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                aVar = com.yandex.plus.home.plaque.feature.api.anim.a.b;
                ordinal = aVar.ordinal();
                if (ordinal != 0) {
                    aVar2 = com.yandex.plus.home.plaque.plugin.api.animator.a.a;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return;
                    }
                    aVar2 = com.yandex.plus.home.plaque.plugin.api.animator.a.b;
                }
                com.yandex.plus.home.plaque.plugin.api.animator.a aVar4 = aVar2;
                zp0 zp0Var = (zp0) aVar3.b;
                zp0Var.getClass();
                long j2 = zp0Var.d;
                n8t n8tVar = new n8t();
                n8t n8tVar2 = new n8t();
                w3c w3cVar = new w3c(2);
                w3cVar.c("plaque_notification_icon_transition_name");
                w3cVar.c("plaque_notification_count_transition_name");
                w3cVar.c = nsa.f(j2);
                n8tVar2.W(w3cVar);
                com.yandex.plus.home.plaque.animator.internal.a aVar5 = new com.yandex.plus.home.plaque.animator.internal.a(zp0Var.a, zp0Var.b, zp0Var.c, aVar4);
                aVar5.c("plaque_container_transition_name");
                aVar5.d = new AccelerateDecelerateInterpolator();
                n8tVar2.W(aVar5);
                n8tVar2.Z(0);
                n8tVar.W(n8tVar2);
                w3c w3cVar2 = new w3c(1);
                w3cVar2.c("plaque_notification_icon_transition_name");
                w3cVar2.c("plaque_notification_count_transition_name");
                w3cVar2.c = nsa.f(j2);
                n8tVar.W(w3cVar2);
                n8tVar.Z(1);
                n8tVar.U(m8tVar);
                l8t.b(viewGroup);
                l8t.a(viewGroup, n8tVar);
            }
            if (ordinal2 != 2 && ordinal2 != 3) {
                b6e.s();
                return;
            }
        }
        aVar = com.yandex.plus.home.plaque.feature.api.anim.a.a;
        ordinal = aVar.ordinal();
        if (ordinal != 0) {
        }
        com.yandex.plus.home.plaque.plugin.api.animator.a aVar42 = aVar2;
        zp0 zp0Var2 = (zp0) aVar3.b;
        zp0Var2.getClass();
        long j22 = zp0Var2.d;
        n8t n8tVar3 = new n8t();
        n8t n8tVar22 = new n8t();
        w3c w3cVar3 = new w3c(2);
        w3cVar3.c("plaque_notification_icon_transition_name");
        w3cVar3.c("plaque_notification_count_transition_name");
        w3cVar3.c = nsa.f(j22);
        n8tVar22.W(w3cVar3);
        com.yandex.plus.home.plaque.animator.internal.a aVar52 = new com.yandex.plus.home.plaque.animator.internal.a(zp0Var2.a, zp0Var2.b, zp0Var2.c, aVar42);
        aVar52.c("plaque_container_transition_name");
        aVar52.d = new AccelerateDecelerateInterpolator();
        n8tVar22.W(aVar52);
        n8tVar22.Z(0);
        n8tVar3.W(n8tVar22);
        w3c w3cVar22 = new w3c(1);
        w3cVar22.c("plaque_notification_icon_transition_name");
        w3cVar22.c("plaque_notification_count_transition_name");
        w3cVar22.c = nsa.f(j22);
        n8tVar3.W(w3cVar22);
        n8tVar3.Z(1);
        n8tVar3.U(m8tVar);
        l8t.b(viewGroup);
        l8t.a(viewGroup, n8tVar3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        EnumC0392k3 a;
        switch (this.a) {
            case 20:
                a = C0335i3.a((O2) this.b, (UsageStatsManager) obj);
                return a;
            default:
                return io.appmetrica.analytics.location.impl.u.a((io.appmetrica.analytics.location.impl.u) this.b, (LocationManager) obj);
        }
    }

    @Override // com.yandex.plus.core.imageloader.a
    public void b(Drawable drawable) {
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c cVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c) this.b;
        if (drawable != null) {
            com.yandex.plus.bdui.plus.content.controller.f fVar = cVar.h;
            s9f[] s9fVarArr = com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c.w;
            ((ImageView) fVar.g(s9fVarArr[4])).setImageDrawable(drawable);
            ((MaterialCardView) cVar.g.g(s9fVarArr[3])).setVisibility(0);
        }
    }

    public void c(String str) {
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) ((com.yandex.plus.home.plaque.feature.internal.presentation.b) this.b).b;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlaqueViewControllerImpl", str);
        }
    }

    @Override // com.yandex.plus.core.network.hosts.a
    public String e() {
        String host = ((com.yandex.plus.core.network.urls.b) this.b).getUrl().getHost();
        return host == null ? "" : host;
    }

    @Override // com.yandex.plus.core.network.api.interceptors.e
    public boolean f() {
        switch (this.a) {
            case 10:
                return ((Boolean) ((com.yandex.plus.home.internal.di.p) this.b).a.m.getValue()).booleanValue();
            default:
                return ((Boolean) ((com.yandex.plus.home.internal.di.z) this.b).a.m.getValue()).booleanValue();
        }
    }

    @Override // defpackage.jc4
    public void g(un4 un4Var) {
        C1109k8.a((C1109k8) this.b, un4Var);
    }

    @Override // com.yandex.plus.core.featureflags.w, defpackage.zqr
    public com.yandex.plus.core.featureflags.v get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 14:
                Object f = ((com.yandex.plus.experiments.impl.providers.h) ((com.yandex.plus.pay.internal.g) obj).a.getValue()).f();
                r7o r7oVar = z7o.b;
                if (f instanceof t7o) {
                    f = null;
                }
                com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) f;
                return new com.yandex.plus.core.featureflags.v(aVar != null ? aVar.d : null);
            default:
                Object f2 = ((com.yandex.plus.pay.ui.core.internal.tarifficator.a) obj).m.f();
                r7o r7oVar2 = z7o.b;
                if (f2 instanceof t7o) {
                    f2 = null;
                }
                com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) f2;
                return new com.yandex.plus.core.featureflags.v(aVar2 != null ? aVar2.d : null);
        }
    }

    @Override // defpackage.js6
    public Object h(otc otcVar) {
        androidx.fragment.app.o oVar = (androidx.fragment.app.o) this.b;
        otcVar.getClass();
        return oVar;
    }

    @Override // com.yandex.plus.core.reflect.g
    public com.yandex.plus.core.reflect.d invoke(Object obj, Method method, Object[] objArr) {
        return (objArr.length == 0 && Intrinsics.d(method.getReturnType(), com.yandex.plus.bdui.shared.a.class)) ? new com.yandex.plus.core.reflect.f((com.yandex.plus.bdui.shared.a) this.b) : com.yandex.plus.core.reflect.e.a;
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ((com.yandex.passport.internal.ui.bouncer.roundabout.k) this.b).invoke(obj);
                break;
            default:
                ((com.yandex.passport.internal.ui.bouncer.roundabout.k) this.b).invoke(obj);
                break;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        C0875g2.a((C0875g2) this.b);
    }

    @Override // defpackage.zqr
    public Object get() {
        return C0722vf.a((MviConfig.OptionalMetricsProvider) this.b);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1122l7.a
    public void a(JSONObject jSONObject) {
        ru.kinopoisk.sdk.easylogin.internal.r.a((ru.kinopoisk.sdk.easylogin.internal.r) this.b, jSONObject);
    }
}
