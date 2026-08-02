package com.yandex.passport.internal.ui.bouncer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lightside.slab.SlotView;
import com.yandex.passport.R;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.s2;
import com.yandex.passport.api.z1;
import com.yandex.passport.data.network.h9;
import com.yandex.passport.data.network.s7;
import com.yandex.passport.data.network.z0;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.reporters.l1;
import com.yandex.passport.internal.report.w7;
import com.yandex.passport.internal.ui.bouncer.model.b2;
import com.yandex.passport.internal.ui.bouncer.model.m1;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.roundabout.a0;
import com.yandex.passport.internal.ui.bouncer.roundabout.x;
import com.yandex.passport.internal.ui.challenge.changecurrent.SetCurrentComposeActivity;
import com.yandex.passport.internal.ui.challenge.logout.LogoutComposeActivity;
import com.yandex.passport.internal.ui.router.d0;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.sloth.r0;
import com.yandex.passport.sloth.u0;
import com.yandex.passport.sloth.ui.j2;
import com.yandex.passport.sloth.ui.n0;
import com.yandex.passport.sloth.ui.s1;
import com.yandex.passport.sloth.ui.y1;
import defpackage.b6e;
import defpackage.c7g;
import defpackage.ceg;
import defpackage.ceu;
import defpackage.g4f;
import defpackage.g4i;
import defpackage.g96;
import defpackage.h96;
import defpackage.i96;
import defpackage.ild;
import defpackage.jfp;
import defpackage.mip;
import defpackage.ndu;
import defpackage.o30;
import defpackage.p30;
import defpackage.q96;
import defpackage.qh;
import defpackage.qvc;
import defpackage.r7o;
import defpackage.rzm;
import defpackage.s4f;
import defpackage.t8a;
import defpackage.tqn;
import defpackage.uah;
import defpackage.uhp;
import defpackage.v75;
import defpackage.wdu;
import defpackage.wfp;
import defpackage.x97;
import defpackage.z7o;
import defpackage.zt3;
import defpackage.zyw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        int i = this.a;
        int i2 = 3;
        int i3 = 4;
        int i4 = 2;
        int i5 = 1;
        int i6 = 0;
        Bundle bundle = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                m1 m1Var = (m1) obj2;
                ((s) obj3).a(new b2(m1Var.b, ((Boolean) obj).booleanValue(), m1Var.c));
                return Unit.a;
            case 1:
                ceu ceuVar = (ceu) obj;
                ceuVar.getClass();
                ceuVar.c(0);
                ceuVar.b(-2);
                i96 i96Var = i96.a;
                g96 g = com.appsflyer.internal.k.g(i96Var, i96Var, ceuVar, 0);
                Pair pair = new Pair(i96.b, i96Var);
                ConstraintLayout constraintLayout = ((com.yandex.passport.internal.ui.bouncer.error.q) obj2).g;
                constraintLayout.getClass();
                g96 a = ceuVar.a(pair, constraintLayout.getId());
                i96 i96Var2 = i96.c;
                g96 g2 = com.appsflyer.internal.k.g(i96Var2, i96Var2, ceuVar, 0);
                i96 i96Var3 = i96.d;
                ((q96) obj3).v(g, a, g2, com.appsflyer.internal.k.g(i96Var3, i96Var3, ceuVar, 0));
                return Unit.a;
            case 2:
                com.yandex.passport.internal.ui.bouncer.loading.e eVar = (com.yandex.passport.internal.ui.bouncer.loading.e) obj2;
                View view = (View) obj;
                view.getClass();
                ViewGroup.LayoutParams a2 = ((c7g) obj3).a(-2, -2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a2;
                com.yandex.passport.internal.properties.v vVar = eVar.d;
                s2 s2Var = eVar.f;
                layoutParams.width = vVar.a instanceof k2 ? s2Var.a : -2;
                layoutParams.height = s2Var.b;
                view.setLayoutParams(a2);
                return Unit.a;
            case 3:
                com.yandex.passport.internal.ui.bouncer.loading.l lVar = (com.yandex.passport.internal.ui.bouncer.loading.l) obj2;
                View view2 = (View) obj;
                view2.getClass();
                ViewGroup.LayoutParams a3 = ((c7g) obj3).a(-2, -2);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a3;
                com.yandex.passport.internal.properties.v vVar2 = lVar.d;
                s2 s2Var2 = lVar.f;
                layoutParams2.width = vVar2.a instanceof k2 ? s2Var2.a : -2;
                layoutParams2.height = s2Var2.b;
                view2.setLayoutParams(a3);
                return Unit.a;
            case 4:
                u uVar = (u) obj3;
                Context context = (Context) obj;
                context.getClass();
                uVar.getClass();
                com.yandex.passport.internal.ui.bouncer.roundabout.g gVar = new com.yandex.passport.internal.ui.bouncer.roundabout.g(uVar, i4);
                com.yandex.passport.internal.ui.bouncer.roundabout.g gVar2 = new com.yandex.passport.internal.ui.bouncer.roundabout.g(uVar, i6);
                com.yandex.passport.internal.ui.bouncer.roundabout.g gVar3 = new com.yandex.passport.internal.ui.bouncer.roundabout.g(uVar, 9);
                int i7 = 26;
                s7 s7Var = new s7(gVar2, gVar3, new com.yandex.passport.internal.ui.bouncer.roundabout.g(uVar, i3), i7);
                com.yandex.passport.internal.ui.bouncer.roundabout.d dVar = new com.yandex.passport.internal.ui.bouncer.roundabout.d(gVar2, gVar3, i2);
                rzm b = t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(gVar2, gVar3, i6));
                rzm b2 = t8a.b(new com.yandex.passport.data.network.n(s7Var, dVar, new s7(gVar2, gVar3, b, 27), new s7(gVar2, gVar3, b, 25), new com.yandex.passport.internal.ui.bouncer.roundabout.d(gVar2, gVar3, i3), 22));
                rzm b3 = t8a.b(new h9(t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(gVar2, b2, i5)), gVar3, t8a.b(new l1(gVar2, 29)), t8a.b(new com.yandex.passport.internal.ui.bouncer.roundabout.d(gVar2, new com.yandex.passport.internal.ui.bouncer.roundabout.g(uVar, 8), i4)), t8a.b(new l1(gVar2, i7)), new com.yandex.passport.internal.ui.bouncer.roundabout.g(uVar, 6), 5));
                rzm b4 = t8a.b(new l1(gVar2, 28));
                rzm b5 = t8a.b(new l1(gVar2, 27));
                com.yandex.passport.internal.ui.bouncer.roundabout.g gVar4 = new com.yandex.passport.internal.ui.bouncer.roundabout.g(uVar, 3);
                com.yandex.passport.internal.ui.bouncer.roundabout.g gVar5 = new com.yandex.passport.internal.ui.bouncer.roundabout.g(uVar, 7);
                rzm b6 = t8a.b(new com.yandex.passport.internal.core.accounts.b(gVar, b3, b4, b5, t8a.b(new z0(gVar4, b2, gVar5, new com.yandex.passport.internal.ui.bouncer.roundabout.g(uVar, 5), 19)), gVar3, gVar5, new com.yandex.passport.internal.ui.bouncer.roundabout.g(uVar, i5), 4));
                SlotView slotView = new SlotView(context, null, 0, 0, 14, null);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(slotView, new FrameLayout.LayoutParams(-1, -1));
                a0 a0Var = (a0) b6.get();
                a0Var.e((r1) obj2);
                slotView.a(a0Var);
                return frameLayout;
            case 5:
                q96 q96Var = (q96) obj3;
                ceu ceuVar2 = (ceu) obj;
                ceuVar2.getClass();
                ceuVar2.c(0);
                ceuVar2.b(-2);
                i96 i96Var4 = i96.a;
                i96 i96Var5 = i96.b;
                Pair pair2 = new Pair(i96Var4, i96Var5);
                TextView textView = ((x) obj2).g;
                textView.getClass();
                g96 a4 = ceuVar2.a(pair2, textView.getId());
                int i8 = (int) (16 * g4i.a.density);
                q96Var.getClass();
                h96 h96Var = new h96((ceg) a4.b, (ceg) a4.c, i8);
                i96 i96Var6 = i96.c;
                g96 g3 = com.appsflyer.internal.k.g(i96Var6, i96Var6, ceuVar2, 0);
                i96 i96Var7 = i96.d;
                q96Var.v(h96Var, g3, com.appsflyer.internal.k.g(i96Var7, i96Var7, ceuVar2, 0), com.appsflyer.internal.k.g(i96Var5, i96Var5, ceuVar2, 0));
                return Unit.a;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.yandex.passport.internal.report.reporters.n nVar = ((com.yandex.passport.internal.ui.challenge.s) obj3).f;
                nVar.getClass();
                nVar.n(w7.d, new ff((com.yandex.passport.common.core.f) obj2), new com.yandex.passport.internal.report.c("success", String.valueOf(booleanValue)));
                return Unit.a;
            case 7:
                SetCurrentComposeActivity setCurrentComposeActivity = (SetCurrentComposeActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i9 = SetCurrentComposeActivity.a;
                com.yandex.passport.common.core.f fVar = ((com.yandex.passport.internal.ui.challenge.changecurrent.i) obj3).a;
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.d(bool, bool2)) {
                    fVar = null;
                }
                int i10 = Intrinsics.d(bool, bool2) ? -1 : 6;
                if (fVar != null) {
                    z1 J = com.yandex.plus.pay.ui.core.b.J(fVar);
                    bundle = new Bundle();
                    bundle.putParcelable("passport-uid", J);
                }
                Intent intent = new Intent();
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                setCurrentComposeActivity.setResult(i10, intent);
                setCurrentComposeActivity.finish();
                return Unit.a;
            case 8:
                LogoutComposeActivity logoutComposeActivity = (LogoutComposeActivity) obj2;
                int i11 = LogoutComposeActivity.a;
                com.yandex.passport.common.core.f fVar2 = ((com.yandex.passport.internal.ui.challenge.logout.t) obj3).a;
                if (!Intrinsics.d((Boolean) obj, Boolean.TRUE)) {
                    fVar2 = null;
                }
                int i12 = fVar2 != null ? -1 : 6;
                if (fVar2 != null) {
                    z1 J2 = com.yandex.plus.pay.ui.core.b.J(fVar2);
                    bundle = new Bundle();
                    bundle.putParcelable("passport-uid", J2);
                }
                Intent intent2 = new Intent();
                if (bundle != null) {
                    intent2.putExtras(bundle);
                }
                logoutComposeActivity.setResult(i12, intent2);
                logoutComposeActivity.finish();
                return Unit.a;
            case 9:
                Context context2 = (Context) obj3;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                int i13 = R.string.passport_logout_profiles_item_description;
                List<com.yandex.passport.internal.entities.n> list = (List) obj2;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    String str = "";
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            String lowerCase = ((String) it2.next()).toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            arrayList2.add(lowerCase);
                        }
                        if (arrayList2.size() != CollectionsKt.w0(CollectionsKt.z0(arrayList2)).size()) {
                            arrayList = new ArrayList(v75.o(list, 10));
                            for (com.yandex.passport.internal.entities.n nVar2 : list) {
                                StringBuilder sb = new StringBuilder();
                                String str2 = nVar2.d;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                sb.append(str2);
                                sb.append(' ');
                                String str3 = nVar2.e;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                sb.append(str3);
                                arrayList.add(sb.toString());
                            }
                        }
                        String string = context2.getString(i13, CollectionsKt.X(arrayList, ", ", null, null, null, 62));
                        string.getClass();
                        wfp.k(jfpVar, string);
                        return Unit.a;
                    }
                    String str4 = ((com.yandex.passport.internal.entities.n) it.next()).e;
                    if (str4 != null) {
                        str = str4;
                    }
                    arrayList.add(str);
                }
            case 10:
                ((FrameLayout) obj).getClass();
                ((WebView) obj3).saveState((Bundle) obj2);
                return Unit.a;
            case 11:
                com.yandex.passport.internal.ui.common.b bVar = (com.yandex.passport.internal.ui.common.b) obj2;
                View view3 = (View) obj;
                view3.getClass();
                ViewGroup.LayoutParams a5 = ((c7g) obj3).a(-2, -2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) a5;
                com.yandex.passport.internal.properties.v vVar3 = bVar.d;
                s2 s2Var3 = bVar.f;
                layoutParams3.width = vVar3.a instanceof k2 ? s2Var3.a : -2;
                layoutParams3.height = s2Var3.b;
                view3.setLayoutParams(a5);
                return Unit.a;
            case 12:
                d0 d0Var = (d0) obj2;
                View view4 = (View) obj;
                view4.getClass();
                ViewGroup.LayoutParams a6 = ((qvc) obj3).a(-2, -2);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) a6;
                com.yandex.passport.internal.properties.v vVar4 = d0Var.d;
                s2 s2Var4 = d0Var.f;
                layoutParams4.width = vVar4.a instanceof k2 ? s2Var4.a : -2;
                layoutParams4.height = s2Var4.b;
                layoutParams4.gravity = 17;
                view4.setLayoutParams(a6);
                return Unit.a;
            case 13:
                WebViewActivity webViewActivity = (WebViewActivity) obj2;
                String str5 = (String) obj;
                int i14 = WebViewActivity.h;
                str5.getClass();
                int ordinal = ((com.yandex.passport.internal.ui.webview.webcases.a0) obj3).ordinal();
                if (ordinal != 3) {
                    WebView webView = webViewActivity.e;
                    if (ordinal != 7) {
                        if (webView == null) {
                            Intrinsics.j("webView");
                            throw null;
                        }
                        webView.loadUrl(str5);
                    } else {
                        if (webView == null) {
                            Intrinsics.j("webView");
                            throw null;
                        }
                        com.yandex.passport.internal.ui.webview.webcases.l lVar2 = webViewActivity.g;
                        if (lVar2 == null) {
                            Intrinsics.j("webCase");
                            throw null;
                        }
                        webView.postUrl(str5, lVar2.d());
                    }
                } else {
                    WebView webView2 = webViewActivity.e;
                    if (webView2 == null) {
                        Intrinsics.j("webView");
                        throw null;
                    }
                    com.yandex.passport.internal.ui.webview.webcases.l lVar3 = webViewActivity.g;
                    if (lVar3 == null) {
                        Intrinsics.j("webCase");
                        throw null;
                    }
                    webView2.postUrl(str5, lVar3.d());
                }
                return Unit.a;
            case 14:
                com.yandex.passport.sloth.ui.d dVar2 = (com.yandex.passport.sloth.ui.d) obj3;
                y1 y1Var = (y1) obj2;
                qh qhVar = (qh) obj;
                qhVar.getClass();
                Intent intent3 = qhVar.b;
                com.yandex.passport.sloth.ui.g gVar6 = dVar2.a;
                try {
                    ild.z(dVar2.d);
                    y1Var.a(new s1(zyw.d(intent3)));
                    u0 u0Var = u0.STARTED;
                    r0 r0Var = r0.PHONE_NUMBER_HINT;
                    Map e = uah.e(new Pair("state", "success"), new Pair("throwable_message", "null"));
                    com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar6).a;
                    oVar.getClass();
                    if (oVar.a()) {
                        oVar.a.a("sloth.reportWebAmEvent.".concat(r0Var.a), e);
                    }
                } catch (Exception e2) {
                    com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Phone Number Hint launcher failed", e2);
                    }
                    u0 u0Var2 = u0.STARTED;
                    String message = e2.getMessage();
                    r0 r0Var2 = r0.PHONE_NUMBER_HINT;
                    Map e3 = uah.e(new Pair("state", "failed"), new Pair("throwable_message", String.valueOf(message)));
                    com.yandex.passport.internal.sloth.o oVar2 = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar6).a;
                    oVar2.getClass();
                    if (oVar2.a()) {
                        oVar2.a.a("sloth.reportWebAmEvent.".concat(r0Var2.a), e3);
                    }
                    y1Var.a(new s1(null));
                }
                return Unit.a;
            case 15:
                com.yandex.passport.sloth.ui.d dVar4 = (com.yandex.passport.sloth.ui.d) obj3;
                String str6 = (String) obj;
                com.yandex.passport.sloth.ui.n nVar3 = new com.yandex.passport.sloth.ui.n((com.yandex.passport.sloth.ui.k) obj2, 1);
                dVar4.getClass();
                o30 o30Var = new o30(dVar4.d);
                com.yandex.passport.internal.ui.sloth.g gVar7 = (com.yandex.passport.internal.ui.sloth.g) dVar4.b;
                o30Var.b(gVar7.a(com.yandex.passport.sloth.ui.string.a.e));
                com.yandex.passport.internal.ui.e eVar2 = gVar7.a;
                if (str6 == null) {
                    str6 = "unknown error";
                }
                o30Var.a(eVar2.b(str6));
                o30Var.a.m = false;
                o30Var.setPositiveButton(gVar7.a(com.yandex.passport.sloth.ui.string.a.f), new com.yandex.passport.internal.ui.sloth.o(i3, nVar3));
                p30 create = o30Var.create();
                create.getClass();
                create.show();
                return Unit.a;
            case 16:
                qvc qvcVar = (qvc) obj3;
                n0 n0Var = (n0) obj2;
                WebView webView3 = (WebView) obj;
                webView3.getClass();
                ViewGroup.LayoutParams a7 = qvcVar.a(-2, -2);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) a7;
                layoutParams5.width = -1;
                layoutParams5.height = -1;
                Integer num = n0Var.e.b().c;
                if (num != null) {
                    qvcVar.setBackgroundColor(n0Var.d.getColor(num.intValue()));
                    com.yandex.passport.sloth.ui.c cVar = new com.yandex.passport.sloth.ui.c(i4, qvcVar);
                    WeakHashMap weakHashMap = wdu.a;
                    ndu.n(webView3, cVar);
                }
                webView3.setLayoutParams(a7);
                return Unit.a;
            case 17:
                j2 j2Var = (j2) obj2;
                View view5 = (View) obj;
                view5.getClass();
                ViewGroup.LayoutParams a8 = ((c7g) obj3).a(-2, -2);
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) a8;
                com.yandex.passport.sloth.ui.dependencies.o oVar3 = j2Var.d;
                com.yandex.passport.sloth.ui.dependencies.k kVar = j2Var.f;
                layoutParams6.width = oVar3.f() instanceof com.yandex.passport.sloth.ui.dependencies.f ? kVar.a : -2;
                layoutParams6.height = kVar.b;
                view5.setLayoutParams(a8);
                return Unit.a;
            case 18:
                ((WebView) obj).getClass();
                ((com.yandex.passport.sloth.ui.webview.i) obj3).a.a.f.addJavascriptInterface(obj2, "nativeAMAndroid");
                return Unit.a;
            case 19:
                com.yandex.plus.adapter.auth.api.e eVar3 = (com.yandex.plus.adapter.auth.api.e) obj2;
                com.yandex.passport.internal.properties.d dVar5 = (com.yandex.passport.internal.properties.d) obj;
                dVar5.getClass();
                dVar5.a = (z1) obj3;
                String str7 = eVar3.b;
                str7.getClass();
                dVar5.b = str7;
                String str8 = eVar3.c;
                str8.getClass();
                dVar5.c = str8;
                return Unit.a;
            case 20:
                com.yandex.plus.bdui.m mVar = (com.yandex.plus.bdui.m) obj;
                mVar.getClass();
                return (com.yandex.plus.bdui.plus.scaffold.controller.e) ((com.yandex.plus.bdui.plus.c) obj3).invoke((com.yandex.plus.bdui.s) obj2, mVar);
            case 21:
                com.yandex.plus.bdui.m mVar2 = (com.yandex.plus.bdui.m) obj2;
                com.yandex.plus.bdui.content.a aVar = (com.yandex.plus.bdui.content.a) obj;
                aVar.getClass();
                Pair a9 = ((com.yandex.plus.core.reflect.c) obj3).a(aVar);
                if (a9 == null || (function1 = (Function1) a9.b) == null) {
                    return null;
                }
                return (com.yandex.plus.bdui.ui.a) function1.invoke(mVar2);
            case 22:
                com.yandex.plus.bdui.flex.ui.n nVar4 = (com.yandex.plus.bdui.flex.ui.n) obj3;
                x97.y(nVar4.h, nVar4.f, null, new com.yandex.passport.sloth.ui.q(nVar4, (com.yandex.passport.internal.ui.challenge.vpn.c) obj2, false, null, 4), 2);
                return Unit.a;
            case 23:
                com.yandex.plus.bdui.flex.ui.n nVar5 = (com.yandex.plus.bdui.flex.ui.n) obj3;
                Function1 function12 = (Function1) obj2;
                com.yandex.plus.log.api.b bVar2 = nVar5.i;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar2)) {
                    bVar2.c(aVar2, "PlusUiControllerUpdateCoordinatorImpl", "Job.scheduleAfterUpdate(); execute action");
                }
                nVar5.e(function12);
                return Unit.a;
            case 24:
                com.yandex.plus.bdui.plus.content.controller.h hVar = (com.yandex.plus.bdui.plus.content.controller.h) obj3;
                com.yandex.plus.log.api.b bVar3 = hVar.d;
                com.yandex.plus.bdui.content.d dVar6 = (com.yandex.plus.bdui.content.d) obj2;
                com.yandex.plus.bdui.plus.auth.f fVar3 = (com.yandex.plus.bdui.plus.auth.f) obj;
                fVar3.getClass();
                if (fVar3 instanceof com.yandex.plus.bdui.plus.auth.e) {
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                    if (bVar3.b(aVar3)) {
                        bVar3.c(aVar3, "PlusAuthorizeContentController", "onAuthClick(); authorize succeeded for user with userId = " + ((com.yandex.plus.bdui.plus.auth.e) fVar3).a);
                    }
                } else if (fVar3.equals(com.yandex.plus.bdui.plus.auth.c.a)) {
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                    if (bVar3.b(aVar4)) {
                        bVar3.c(aVar4, "PlusAuthorizeContentController", "onAuthClick(); authorize cancelled");
                    }
                } else {
                    if (!(fVar3 instanceof com.yandex.plus.bdui.plus.auth.d)) {
                        b6e.s();
                        return null;
                    }
                    Throwable th = ((com.yandex.plus.bdui.plus.auth.d) fVar3).a;
                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
                    if (bVar3.b(aVar5)) {
                        bVar3.a(aVar5, "PlusAuthorizeContentController", "onAuthClick(); authorize failed!", th);
                    }
                }
                com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.c;
                if (bVar3.b(aVar6)) {
                    com.appsflyer.internal.k.x(new StringBuilder("onAuthClick(); dispatch auth action = "), ((com.yandex.plus.bdui.plus.content.serializer.d0) ((com.yandex.plus.bdui.plus.content.a) dVar6.b)).b.a, bVar3, aVar6, "PlusAuthorizeContentController");
                }
                hVar.a.a.a(((com.yandex.plus.bdui.plus.content.serializer.d0) ((com.yandex.plus.bdui.plus.content.a) dVar6.b)).b.a, new com.yandex.plus.bdui.action.h(dVar6.c), null);
                return Unit.a;
            case 25:
                com.yandex.plus.bdui.m mVar3 = (com.yandex.plus.bdui.m) obj;
                mVar3.getClass();
                return (com.yandex.plus.bdui.ui.a) ((com.yandex.plus.bdui.plus.scenario.m) obj3).F.invoke((com.yandex.plus.bdui.s) obj2, mVar3);
            case 26:
                ((com.yandex.plus.bdui.query.e) obj).getClass();
                return ((com.yandex.plus.bdui.plus.scenario.m) obj3).a(((Boolean) ((com.yandex.plus.bdui.plus.scenario.e) obj2).invoke()).booleanValue());
            case 27:
                uhp uhpVar = (uhp) obj2;
                g4f g4fVar = (g4f) obj;
                g4fVar.getClass();
                uhp uhpVar2 = ((s4f) obj3).d().b;
                uhpVar2.getClass();
                uhpVar.getClass();
                mip mipVar = new mip();
                uhpVar2.a(mipVar);
                uhpVar.a(mipVar);
                g4fVar.i = mipVar.c();
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                com.yandex.plus.bdui.action.a aVar7 = (com.yandex.plus.bdui.action.a) obj;
                aVar7.getClass();
                ((com.yandex.plus.bdui.m) obj3).a.a(aVar7, (com.yandex.plus.bdui.action.h) obj2, null);
                return Unit.a;
            default:
                tqn tqnVar = (tqn) obj3;
                zt3 zt3Var = (zt3) obj2;
                com.yandex.plus.bdui.plus.webview.g gVar8 = (com.yandex.plus.bdui.plus.webview.g) obj;
                gVar8.getClass();
                if (!tqnVar.a) {
                    tqnVar.a = true;
                    r7o r7oVar = z7o.b;
                    zt3Var.resumeWith(gVar8);
                }
                return Unit.a;
        }
    }
}
