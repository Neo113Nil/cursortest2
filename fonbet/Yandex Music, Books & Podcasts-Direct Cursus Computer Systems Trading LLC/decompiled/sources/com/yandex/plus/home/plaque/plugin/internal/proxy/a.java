package com.yandex.plus.home.plaque.plugin.internal.proxy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.q;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.w;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.k;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.l;
import com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity;
import com.yandex.plus.plaquesdk.plaque.api.models.m;
import com.yandex.plus.plaquesdk.plaque.api.models.n;
import com.yandex.plus.plaquesdk.plaque.api.models.p;
import com.yandex.plus.plaquesdk.plaque.api.models.r;
import com.yandex.plus.plaquesdk.plaque.api.models.t;
import com.yandex.plus.plaquesdk.plaque.api.models.u;
import com.yandex.plus.plaquesdk.plaque.api.models.v;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.b6e;
import defpackage.bdk;
import defpackage.bw1;
import defpackage.cck;
import defpackage.cdk;
import defpackage.cg6;
import defpackage.ddk;
import defpackage.dfi;
import defpackage.g8c;
import defpackage.h4b;
import defpackage.hdk;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.kag;
import defpackage.m86;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.pv9;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rar;
import defpackage.s9f;
import defpackage.t7o;
import defpackage.t9f;
import defpackage.x3f;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.z5m;
import defpackage.z7o;
import defpackage.zbk;
import defpackage.zp0;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes5.dex */
public final class a implements com.yandex.plus.core.network.api.interceptors.e, com.yandex.plus.pay.ui.webview.family.ui.b, com.yandex.plus.webview.api.message.a, com.yandex.plus.pay.ui.webview.paymentwidget.ui.b, kag {
    public final /* synthetic */ int a;
    public Object b;

    public a(com.yandex.plus.pay.ui.core.internal.common.d dVar) {
        hdk hdkVar;
        this.a = 13;
        int ordinal = dVar.b.ordinal();
        if (ordinal == 0) {
            hdkVar = hdk.Android;
        } else {
            if (ordinal != 1) {
                b6e.s();
                throw null;
            }
            hdkVar = hdk.AndroidTv;
        }
        g8c g8cVar = new g8c();
        g8cVar.a = dfi.n("platform", hdkVar.a);
        this.b = g8cVar;
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void a() {
        Object value;
        w wVar;
        switch (this.a) {
            case 16:
                q qVar = (q) this.b;
                s9f[] s9fVarArr = q.s;
                h0 A = qVar.A();
                rar rarVar = A.J.f;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                xdr xdrVar = A.B;
                do {
                    value = xdrVar.getValue();
                    wVar = (w) value;
                } while (!xdrVar.k(value, wVar != null ? new w(wVar.a, true) : null));
            case 17:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) this.b;
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e.p;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j z = eVar.z();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.a aVar = z.p;
                if (aVar != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = z.k.a.a();
                    com.yandex.plus.pay.ui.webview.family.domain.a aVar2 = z.n;
                    String uuid = a.a.toString();
                    uuid.getClass();
                    aVar2.c(uuid, aVar.a, aVar.c);
                    break;
                }
                break;
            case 18:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.e eVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.e) this.b;
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.e.m;
                l lVar = (l) eVar2.h.getValue();
                Object value2 = lVar.v.getValue();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.f fVar = value2 instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.f ? (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.f) value2 : null;
                if (fVar != null) {
                    rar rarVar2 = lVar.t.f;
                    if (rarVar2 != null) {
                        rarVar2.g(null);
                    }
                    xdr xdrVar2 = lVar.u;
                    String str = fVar.a;
                    com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.a aVar3 = fVar.c;
                    str.getClass();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.f fVar2 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.f(str, true, aVar3);
                    xdrVar2.getClass();
                    xdrVar2.m(null, fVar2);
                    break;
                }
                break;
            case 19:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d) this.b;
                s9f[] s9fVarArr4 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d.o;
                rar rarVar3 = dVar.z().x.f;
                if (rarVar3 != null) {
                    rarVar3.g(null);
                    break;
                }
                break;
            default:
                PlusPayYbWebActivity plusPayYbWebActivity = (PlusPayYbWebActivity) this.b;
                s9f[] s9fVarArr5 = PlusPayYbWebActivity.i;
                com.yandex.plus.pay.ui.yb.web.internal.ui.g j = plusPayYbWebActivity.j();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b bVar = j.l;
                String str2 = j.k;
                com.yandex.plus.pay.ui.yb.api.e eVar3 = j.m;
                bVar.getClass();
                str2.getClass();
                eVar3.getClass();
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = bVar.a.a.a();
                cdk cdkVar = bVar.b;
                String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a2.a);
                bdk a3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b.a(eVar3);
                cdkVar.getClass();
                d.getClass();
                LinkedHashMap m = dfi.m("purchase_session_id", d, "url", str2);
                m.put("action_scenario", a3.a);
                m.put("_meta", cdk.c(new HashMap()));
                cdkVar.f("OpeningYbCard.WebView.Loaded", m);
                break;
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void b(String str) {
        switch (this.a) {
            case 17:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) this.b;
                s9f[] s9fVarArr = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e.p;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j z = eVar.z();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.a aVar = z.p;
                if (aVar != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = z.k.a.a();
                    com.yandex.plus.pay.ui.webview.family.domain.a aVar2 = z.n;
                    String uuid = a.a.toString();
                    uuid.getClass();
                    aVar2.b(uuid, aVar.a, aVar.c, str);
                }
                z.G();
                break;
            default:
                PlusPayYbWebActivity plusPayYbWebActivity = (PlusPayYbWebActivity) this.b;
                s9f[] s9fVarArr2 = PlusPayYbWebActivity.i;
                com.yandex.plus.pay.ui.yb.web.internal.ui.g j = plusPayYbWebActivity.j();
                j.n = com.yandex.plus.pay.ui.yb.web.internal.b.a;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b bVar = j.l;
                String str2 = j.k;
                com.yandex.plus.pay.ui.yb.api.e eVar2 = j.m;
                bVar.getClass();
                str2.getClass();
                eVar2.getClass();
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = bVar.a.a.a();
                cdk cdkVar = bVar.b;
                String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a2.a);
                bdk a3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.b.a(eVar2);
                cdkVar.getClass();
                d.getClass();
                LinkedHashMap m = dfi.m("purchase_session_id", d, "url", str2);
                m.put("action_scenario", a3.a);
                m.put("fail_reason", str);
                m.put("_meta", cdk.c(new HashMap()));
                cdkVar.f("OpeningYbCard.WebView.Fail", m);
                j.G();
                break;
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void c() {
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) this.b;
        s9f[] s9fVarArr = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e.p;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j z = eVar.z();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.a aVar = z.p;
        if (aVar != null) {
            z.o.a(15000L, aVar.a, UgcLiveVideoData$UgcLiveStatus.READY);
        }
        z.G();
    }

    @Override // defpackage.kag
    public void d(int i, int i2) {
        com.yandex.plus.plaquesdk.plaque.adapter.j bVar;
        com.yandex.plus.plaquesdk.plaque.adapter.j jVar;
        bw1 bw1Var = (bw1) this.b;
        ViewGroup viewGroup = (ViewGroup) bw1Var.c;
        int i3 = i2 + i;
        while (i < i3) {
            com.yandex.plus.plaquesdk.plaque.api.dependencies.b bVar2 = (com.yandex.plus.plaquesdk.plaque.api.dependencies.b) bw1Var.j;
            Function1 function1 = (Function1) bw1Var.k;
            x xVar = (x) ((List) bw1Var.g).get(i);
            if (xVar instanceof n) {
                Context context = viewGroup.getContext();
                context.getClass();
                jVar = new com.yandex.plus.plaquesdk.plaque.adapter.c(context, function1);
            } else if (xVar instanceof p) {
                Context context2 = viewGroup.getContext();
                context2.getClass();
                jVar = new com.yandex.plus.plaquesdk.plaque.adapter.d(context2, function1);
            } else if (xVar instanceof t) {
                Context context3 = viewGroup.getContext();
                context3.getClass();
                jVar = new com.yandex.plus.plaquesdk.plaque.adapter.f(context3, function1);
            } else if (xVar instanceof u) {
                Context context4 = viewGroup.getContext();
                context4.getClass();
                jVar = new com.yandex.plus.plaquesdk.plaque.adapter.g(context4, function1);
            } else if (xVar instanceof v) {
                Context context5 = viewGroup.getContext();
                context5.getClass();
                jVar = new com.yandex.plus.plaquesdk.plaque.adapter.h(context5, function1);
            } else {
                if (xVar instanceof r) {
                    Context context6 = viewGroup.getContext();
                    context6.getClass();
                    bVar = new com.yandex.plus.plaquesdk.plaque.adapter.e(context6, bVar2, function1);
                } else if (!(xVar instanceof m)) {
                    b6e.s();
                    return;
                } else {
                    Context context7 = viewGroup.getContext();
                    context7.getClass();
                    bVar = new com.yandex.plus.plaquesdk.plaque.adapter.b(context7, bVar2, function1);
                }
                jVar = bVar;
            }
            if (bw1Var.b) {
                jVar.d().setTransitionName("plaque_container_transition_name");
            }
            jVar.d().setTag(R.id.plaque_sdk_micro_widget_view_holder_tag, jVar);
            jVar.d().setLayoutDirection(viewGroup.getLayoutDirection());
            ((ArrayList) bw1Var.i).add(i, jVar);
            jVar.a = true;
            viewGroup.addView(jVar.d(), i, new ViewGroup.LayoutParams(-2, -2));
            i++;
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void e() {
        PlusPayYbWebActivity plusPayYbWebActivity = (PlusPayYbWebActivity) this.b;
        s9f[] s9fVarArr = PlusPayYbWebActivity.i;
        plusPayYbWebActivity.j().H();
    }

    @Override // com.yandex.plus.core.network.api.interceptors.e
    public boolean f() {
        Object t7oVar;
        z5m z5mVar = (z5m) this.b;
        if (z5mVar == null) {
            return false;
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Boolean.valueOf(z5mVar.b.b.h());
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Object obj = Boolean.FALSE;
        if (t7oVar instanceof t7o) {
            t7oVar = obj;
        }
        return ((Boolean) t7oVar).booleanValue();
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void g(String str) {
        str.getClass();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) this.b;
        s9f[] s9fVarArr = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e.p;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j z = eVar.z();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.a aVar = z.p;
        if (aVar != null) {
            z.o.b(aVar.a, str);
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void h() {
        PlusPayYbWebActivity plusPayYbWebActivity = (PlusPayYbWebActivity) this.b;
        s9f[] s9fVarArr = PlusPayYbWebActivity.i;
        plusPayYbWebActivity.j().J("auth_required");
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void i(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) this.b;
        s9f[] s9fVarArr = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e.p;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j z = eVar.z();
        x97.y(ot0.F(z), null, null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b(z, str, str2, str3, (Continuation) null, 12), 3);
    }

    @Override // defpackage.kag
    public void j(int i, int i2) {
        bw1 bw1Var = (bw1) this.b;
        for (int i3 = 0; i3 < i2; i3++) {
            ((ViewGroup) bw1Var.c).removeViewAt(i);
            ((ArrayList) bw1Var.i).remove(i);
        }
    }

    @Override // defpackage.kag
    public void k(int i, int i2, Object obj) {
        int i3 = i2 + i;
        while (i < i3) {
            bw1 bw1Var = (bw1) this.b;
            View childAt = ((ViewGroup) bw1Var.c).getChildAt(i);
            if (childAt == null) {
                ((com.yandex.passport.sloth.ui.c) ((com.yandex.plus.plaquesdk.plaque.api.dependencies.b) bw1Var.d)).c(k5r.i(i, "Has not child at position "));
            } else {
                bw1Var.q(childAt);
            }
            i++;
        }
    }

    @Override // defpackage.kag
    public void l(int i, int i2) {
        bw1 bw1Var = (bw1) this.b;
        ViewGroup viewGroup = (ViewGroup) bw1Var.c;
        View childAt = viewGroup.getChildAt(i);
        childAt.getClass();
        bw1Var.q(childAt);
        viewGroup.removeViewAt(i);
        viewGroup.addView(childAt, i2, new ViewGroup.LayoutParams(-2, -2));
        ArrayList arrayList = (ArrayList) bw1Var.i;
        arrayList.add(i2, arrayList.remove(i));
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void n(String str, String str2) {
        str.getClass();
        str2.getClass();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e) this.b;
        s9f[] s9fVarArr = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.e.p;
        com.yandex.plus.pay.ui.webview.family.domain.a aVar = eVar.z().n;
        aVar.getClass();
        aVar.a.a(str, str2);
    }

    @Override // com.yandex.plus.webview.api.message.a
    public Object o(String str) {
        Object t7oVar;
        Object t7oVar2;
        Object t7oVar3;
        switch (this.a) {
            case 20:
                y yVar = ((com.yandex.plus.pay.ui.webview.family.ui.c) this.b).a;
                str.getClass();
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = (com.yandex.plus.pay.ui.webview.family.domain.g) ((x3f) yVar.a).b((t9f) ((jyr) yVar.b).getValue(), str);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                com.yandex.plus.pay.ui.webview.family.domain.g gVar = (com.yandex.plus.pay.ui.webview.family.domain.g) (t7oVar instanceof t7o ? null : t7oVar);
                return gVar == null ? new com.yandex.plus.pay.ui.webview.family.domain.f(str) : gVar;
            default:
                x3f x3fVar = ((com.yandex.plus.pay.ui.webview.paymentwidget.ui.c) this.b).b.a;
                str.getClass();
                try {
                    r7o r7oVar3 = z7o.b;
                    t7oVar2 = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.j) x3fVar.b(com.yandex.plus.pay.ui.webview.paymentwidget.domain.m.a, str);
                } catch (Throwable th2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar2 = new t7o(th2);
                }
                if (t7oVar2 instanceof t7o) {
                    t7oVar2 = null;
                }
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.j jVar = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.j) t7oVar2;
                if (jVar != null) {
                    return jVar;
                }
                try {
                    t7oVar3 = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.j) x3fVar.b(com.yandex.plus.pay.ui.webview.paymentwidget.domain.l.a, str);
                } catch (Throwable th3) {
                    r7o r7oVar5 = z7o.b;
                    t7oVar3 = new t7o(th3);
                }
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.j jVar2 = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.j) (t7oVar3 instanceof t7o ? null : t7oVar3);
                return jVar2 == null ? new com.yandex.plus.pay.ui.webview.paymentwidget.domain.h(str) : jVar2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer p(String str) {
        Integer num;
        com.yandex.plus.plaquesdk.theme.palette.a aVar = (com.yandex.plus.plaquesdk.theme.palette.a) ((a) this.b).b;
        int i = aVar.c;
        int i2 = aVar.j;
        int i3 = aVar.o;
        int i4 = aVar.w;
        if (str != null) {
            switch (str.hashCode()) {
                case -2051498519:
                    if (str.equals("cardDivider")) {
                        s9f s9fVar = com.yandex.plus.plaquesdk.theme.palette.a.x[20];
                        num = Integer.valueOf(aVar.a(i4));
                        break;
                    }
                    break;
                case -1884548997:
                    if (str.equals("bgInvert")) {
                        int i5 = aVar.f;
                        s9f s9fVar2 = com.yandex.plus.plaquesdk.theme.palette.a.x[3];
                        num = Integer.valueOf(aVar.a(i5));
                        break;
                    }
                    break;
                case -1732262959:
                    if (str.equals("textOnControl")) {
                        int i6 = aVar.m;
                        s9f s9fVar3 = com.yandex.plus.plaquesdk.theme.palette.a.x[10];
                        num = Integer.valueOf(aVar.a(i6));
                        break;
                    }
                    break;
                case -1715476298:
                    if (str.equals("controlMain")) {
                        s9f s9fVar4 = com.yandex.plus.plaquesdk.theme.palette.a.x[12];
                        num = Integer.valueOf(aVar.a(i3));
                        break;
                    }
                    break;
                case -1639914408:
                    if (str.equals("controlMinor")) {
                        int i7 = aVar.p;
                        s9f s9fVar5 = com.yandex.plus.plaquesdk.theme.palette.a.x[13];
                        num = Integer.valueOf(aVar.a(i7));
                        break;
                    }
                    break;
                case -1631672619:
                    if (str.equals("bgRipple")) {
                        int i8 = aVar.h;
                        s9f s9fVar6 = com.yandex.plus.plaquesdk.theme.palette.a.x[5];
                        num = Integer.valueOf(aVar.a(i8));
                        break;
                    }
                    break;
                case -1487903893:
                    if (str.equals("bgFloating")) {
                        int i9 = aVar.e;
                        s9f s9fVar7 = com.yandex.plus.plaquesdk.theme.palette.a.x[2];
                        num = Integer.valueOf(aVar.a(i9));
                        break;
                    }
                    break;
                case -1391797346:
                    if (str.equals("bgMain")) {
                        s9f s9fVar8 = com.yandex.plus.plaquesdk.theme.palette.a.x[0];
                        num = Integer.valueOf(aVar.a(i));
                        break;
                    }
                    break;
                case -1332194002:
                    if (str.equals(C0479n3.g)) {
                        s9f s9fVar9 = com.yandex.plus.plaquesdk.theme.palette.a.x[0];
                        num = Integer.valueOf(aVar.a(i));
                        break;
                    }
                    break;
                case -1087730683:
                    if (str.equals("controlPressed")) {
                        int i10 = aVar.q;
                        s9f s9fVar10 = com.yandex.plus.plaquesdk.theme.palette.a.x[14];
                        num = Integer.valueOf(aVar.a(i10));
                        break;
                    }
                    break;
                case -1054513528:
                    if (str.equals("textMinor")) {
                        int i11 = aVar.k;
                        s9f s9fVar11 = com.yandex.plus.plaquesdk.theme.palette.a.x[8];
                        num = Integer.valueOf(aVar.a(i11));
                        break;
                    }
                    break;
                case -1003855738:
                    if (str.equals("textMain")) {
                        s9f s9fVar12 = com.yandex.plus.plaquesdk.theme.palette.a.x[7];
                        num = Integer.valueOf(aVar.a(i2));
                        break;
                    }
                    break;
                case -688823980:
                    if (str.equals("fogDark")) {
                        int i12 = aVar.t;
                        s9f s9fVar13 = com.yandex.plus.plaquesdk.theme.palette.a.x[17];
                        num = Integer.valueOf(aVar.a(i12));
                        break;
                    }
                    break;
                case -638421183:
                    if (str.equals("shimmering")) {
                        int i13 = aVar.i;
                        s9f s9fVar14 = com.yandex.plus.plaquesdk.theme.palette.a.x[6];
                        num = Integer.valueOf(aVar.a(i13));
                        break;
                    }
                    break;
                case -195801488:
                    if (str.equals("bgMinor")) {
                        int i14 = aVar.d;
                        s9f s9fVar15 = com.yandex.plus.plaquesdk.theme.palette.a.x[1];
                        num = Integer.valueOf(aVar.a(i14));
                        break;
                    }
                    break;
                case 110997:
                    if (str.equals("pin")) {
                        int i15 = aVar.s;
                        s9f s9fVar16 = com.yandex.plus.plaquesdk.theme.palette.a.x[16];
                        num = Integer.valueOf(aVar.a(i15));
                        break;
                    }
                    break;
                case 3321844:
                    if (str.equals("line")) {
                        int i16 = aVar.r;
                        s9f s9fVar17 = com.yandex.plus.plaquesdk.theme.palette.a.x[15];
                        num = Integer.valueOf(aVar.a(i16));
                        break;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        s9f s9fVar18 = com.yandex.plus.plaquesdk.theme.palette.a.x[7];
                        num = Integer.valueOf(aVar.a(i2));
                        break;
                    }
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        int i17 = aVar.u;
                        s9f s9fVar19 = com.yandex.plus.plaquesdk.theme.palette.a.x[18];
                        num = Integer.valueOf(aVar.a(i17));
                        break;
                    }
                    break;
                case 104349611:
                    if (str.equals("everFront")) {
                        s9f s9fVar20 = com.yandex.plus.plaquesdk.theme.palette.a.x[21];
                        num = Integer.valueOf(aVar.a(i4));
                        break;
                    }
                    break;
                case 280324901:
                    if (str.equals("everBack")) {
                        s9f s9fVar21 = com.yandex.plus.plaquesdk.theme.palette.a.x[22];
                        num = Integer.valueOf(aVar.a(i4));
                        break;
                    }
                    break;
                case 817196644:
                    if (str.equals("textOnControlMinor")) {
                        int i18 = aVar.n;
                        s9f s9fVar22 = com.yandex.plus.plaquesdk.theme.palette.a.x[11];
                        num = Integer.valueOf(aVar.a(i18));
                        break;
                    }
                    break;
                case 951543133:
                    if (str.equals("control")) {
                        s9f s9fVar23 = com.yandex.plus.plaquesdk.theme.palette.a.x[12];
                        num = Integer.valueOf(aVar.a(i3));
                        break;
                    }
                    break;
                case 1560148835:
                    if (str.equals("textInvert")) {
                        int i19 = aVar.l;
                        s9f s9fVar24 = com.yandex.plus.plaquesdk.theme.palette.a.x[9];
                        num = Integer.valueOf(aVar.a(i19));
                        break;
                    }
                    break;
                case 1663568845:
                    if (str.equals("bgTransparent")) {
                        int i20 = aVar.g;
                        s9f s9fVar25 = com.yandex.plus.plaquesdk.theme.palette.a.x[4];
                        num = Integer.valueOf(aVar.a(i20));
                        break;
                    }
                    break;
                case 2105163132:
                    if (str.equals("textOnError")) {
                        int i21 = aVar.v;
                        s9f s9fVar26 = com.yandex.plus.plaquesdk.theme.palette.a.x[19];
                        num = Integer.valueOf(aVar.a(i21));
                        break;
                    }
                    break;
            }
            if (num == null) {
                num = r1.y(str);
            }
            if (num == null) {
                return num;
            }
            Integer y = r1.y(str);
            if (y != null && y.intValue() == 0) {
                return null;
            }
            return y;
        }
        num = null;
        if (num == null) {
        }
        if (num == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(String str, cg6 cg6Var) {
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.r rVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.r) {
            rVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.r) cg6Var;
            int i2 = rVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rVar.j;
                nm6 nm6Var = nm6.a;
                i = rVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.domain.auth.impl.i iVar = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.u) this.b).G;
                rVar.l = 1;
                Object h = iVar.h(str, rVar);
                return h == nm6Var ? nm6Var : h;
            }
        }
        rVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.r(this, cg6Var);
        Object obj2 = rVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rVar.l;
        if (i == 0) {
        }
    }

    public void r(String str) {
        StringBuilder sb = (StringBuilder) this.b;
        sb.append(str);
        sb.append('\n');
    }

    public void s() {
        Continuation continuation = null;
        switch (this.a) {
            case 16:
                q qVar = (q) this.b;
                s9f[] s9fVarArr = q.s;
                h0 A = qVar.A();
                x97.y(ot0.F(A), null, null, new com.yandex.plus.pay.ui.core.debug.internal.ui.form.b(A, continuation, 4), 3);
                break;
            case 17:
            default:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d dVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d) this.b;
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d.o;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.m z = dVar.z();
                x97.y(ot0.F(z), null, null, new com.yandex.plus.pay.ui.core.debug.internal.ui.form.b(z, continuation, 8), 3);
                break;
            case 18:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.e) this.b;
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.e.m;
                l lVar = (l) eVar.h.getValue();
                x97.y(ot0.F(lVar), null, null, new k(lVar, continuation, 0), 3);
                break;
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void t(String str) {
        PlusPayYbWebActivity plusPayYbWebActivity = (PlusPayYbWebActivity) this.b;
        s9f[] s9fVarArr = PlusPayYbWebActivity.i;
        com.yandex.plus.pay.ui.yb.web.internal.ui.g j = plusPayYbWebActivity.j();
        j.n = new com.yandex.plus.pay.ui.yb.web.internal.c(str);
        j.l.b(j.k, j.m, str);
        j.G();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r0.e(r1) != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r0.b() == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(cg6 cg6Var) {
        com.yandex.plus.home.plusstate.a aVar;
        int i;
        com.yandex.plus.home.graphql.plusstate.f fVar = (com.yandex.plus.home.graphql.plusstate.f) this.b;
        if (cg6Var instanceof com.yandex.plus.home.plusstate.a) {
            aVar = (com.yandex.plus.home.plusstate.a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    aVar.l = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                aVar.l = 2;
            }
        }
        aVar = new com.yandex.plus.home.plusstate.a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        aVar.l = 2;
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void v() {
        PlusPayYbWebActivity plusPayYbWebActivity = (PlusPayYbWebActivity) this.b;
        s9f[] s9fVarArr = PlusPayYbWebActivity.i;
        com.yandex.plus.pay.ui.yb.web.internal.ui.g j = plusPayYbWebActivity.j();
        j.n = com.yandex.plus.pay.ui.yb.web.internal.d.a;
        j.l.b(j.k, j.m, null);
        j.G();
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void y(String str) {
        PlusPayYbWebActivity plusPayYbWebActivity = (PlusPayYbWebActivity) this.b;
        s9f[] s9fVarArr = PlusPayYbWebActivity.i;
        plusPayYbWebActivity.j().J(str);
    }

    public a(com.yandex.plus.pay.ui.core.debug.api.a aVar) {
        this.a = 11;
        aVar.getClass();
        this.b = aVar;
    }

    public a(com.yandex.plus.home.graphql.plusstate.f fVar) {
        this.a = 2;
        fVar.getClass();
        this.b = fVar;
    }

    public a(zp0 zp0Var) {
        this.a = 0;
        zp0Var.getClass();
        this.b = zp0Var;
    }

    public a(com.yandex.plus.pay.ui.core.internal.di.d dVar, com.yandex.plus.pay.ui.core.internal.di.b bVar, com.yandex.passport.internal.entities.j jVar) {
        this.a = 14;
        this.b = jVar;
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public void m(String str, boolean z) {
    }

    public a(com.yandex.plus.pay.internal.analytics.evgen.a aVar) {
        zbk zbkVar;
        this.a = 4;
        int ordinal = aVar.a.ordinal();
        if (ordinal == 0) {
            zbkVar = zbk.Android;
        } else if (ordinal == 1) {
            zbkVar = zbk.AndroidTv;
        } else {
            b6e.s();
            throw null;
        }
        h4b h4bVar = new h4b();
        h4bVar.a = dfi.n("platform", zbkVar.a);
        this.b = h4bVar;
    }

    public a(com.yandex.plus.pay.internal.analytics.evgen.a aVar, byte b) {
        cck cckVar;
        this.a = 6;
        int ordinal = aVar.a.ordinal();
        if (ordinal == 0) {
            cckVar = cck.Android;
        } else if (ordinal == 1) {
            cckVar = cck.AndroidTv;
        } else {
            b6e.s();
            throw null;
        }
        this.b = new m86(cckVar);
    }

    public a(com.yandex.plus.pay.ui.core.internal.common.b bVar) {
        ddk ddkVar;
        this.a = 12;
        int ordinal = bVar.b.ordinal();
        if (ordinal == 0) {
            ddkVar = ddk.Android;
        } else if (ordinal == 1) {
            ddkVar = ddk.AndroidTv;
        } else {
            b6e.s();
            throw null;
        }
        this.b = new pv9(ddkVar);
    }

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public a(int i) {
        this.a = i;
        switch (i) {
            case 26:
                break;
            default:
                this.b = new StringBuilder(100);
                break;
        }
    }
}
