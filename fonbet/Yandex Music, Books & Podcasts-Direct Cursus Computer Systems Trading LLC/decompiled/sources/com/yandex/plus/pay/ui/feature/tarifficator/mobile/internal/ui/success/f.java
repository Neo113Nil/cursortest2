package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.SuccessNativeContentView;
import com.yandex.plus.pay.ui.core.mobile.view.confetti.PlusPayConfettiView;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfu;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fkn;
import defpackage.jyr;
import defpackage.kg5;
import defpackage.laq;
import defpackage.lyf;
import defpackage.nme;
import defpackage.nyf;
import defpackage.qpj;
import defpackage.s9f;
import defpackage.wxf;
import defpackage.ybf;
import defpackage.yxm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/success/f;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class f extends o {
    public static final /* synthetic */ s9f[] q = {new yxm(f.class, "root", "getRoot()Landroid/view/View;", 0), f1d.c(ern.a, f.class, "progressView", "getProgressView()Landroid/view/View;", 0), new yxm(f.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0), new yxm(f.class, "successContentView", "getSuccessContentView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/success/native/SuccessNativeContentView;", 0)};
    public final jyr g;
    public final ybf h;
    public final ybf i;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c j;
    public com.yandex.plus.webview.internal.f k;
    public final com.yandex.passport.internal.core.accounts.h l;
    public final com.yandex.passport.internal.core.accounts.h m;
    public final com.yandex.passport.internal.core.accounts.h n;
    public final com.yandex.passport.internal.core.accounts.h o;
    public String p;

    public f() {
        super(R.layout.pay_sdk_fragment_tarifficator_success);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.a
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                f fVar = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr = f.q;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(fVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) {
                                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d.class, l);
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = f.q;
                        return fVar.x().f();
                    default:
                        s9f[] s9fVarArr3 = f.q;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(k.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(fVar.x().b, 2))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.a
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = f.q;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(fVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) {
                                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d.class, l);
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = f.q;
                        return fVar.x().f();
                    default:
                        s9f[] s9fVarArr3 = f.q;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(k.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(fVar.x().b, 2))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        b bVar = new b(this, 0);
        bwf bwfVar = bwf.c;
        arf a = btf.a(bwfVar, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(7, bVar));
        this.h = new ybf(ern.a(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a.class), new c(a, 0), function0, new c(a, 1));
        final int i3 = 2;
        Function0 function02 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.a
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = f.q;
                        ArrayList l = com.yandex.plus.bdui.plus.analytics.b.l(fVar);
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) {
                                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d.class, l);
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = f.q;
                        return fVar.x().f();
                    default:
                        s9f[] s9fVarArr3 = f.q;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(k.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(fVar.x().b, 2))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a2 = btf.a(bwfVar, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(8, new b(this, 1)));
        this.i = new ybf(ern.a(k.class), new c(a2, 2), function02, new c(a2, 3));
        this.l = new com.yandex.passport.internal.core.accounts.h(new d(this, 0), new e(this, 0));
        this.m = new com.yandex.passport.internal.core.accounts.h(new d(this, 1), new e(this, 1));
        this.n = new com.yandex.passport.internal.core.accounts.h(new d(this, 2), new e(this, 2));
        this.o = new com.yandex.passport.internal.core.accounts.h(new d(this, 3), new e(this, 3));
    }

    public final WebViewContainer A() {
        return (WebViewContainer) this.n.x(q[2]);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c cVar = this.j;
        if (cVar != null) {
            com.yandex.passport.internal.entities.j jVar = cVar.h;
            jVar.o();
            jVar.a = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        com.yandex.plus.webview.internal.f fVar = this.k;
        if (fVar != null) {
            fVar.a();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        com.yandex.plus.webview.internal.f fVar = this.k;
        if (fVar != null) {
            fVar.onResume();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        qpj onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        wxf.k(onBackPressedDispatcher, getViewLifecycleOwner(), new m(19, this));
        s9f[] s9fVarArr = q;
        SuccessNativeContentView successNativeContentView = (SuccessNativeContentView) this.o.x(s9fVarArr[3]);
        com.yandex.plus.pay.ui.design.api.api.a aVar = x().a.q;
        com.yandex.plus.core.imageloader.b bVar = x().a.j;
        Drawable background = ((View) this.l.x(s9fVarArr[0])).getBackground();
        Continuation continuation = null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c cVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c(successNativeContentView, aVar, bVar, colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, z(), k.class, "onFinishButtonClick", "onFinishButtonClick()V", 0, 9), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, z(), k.class, "onFinishButtonClick", "onFinishButtonClick()V", 0, 10));
        this.j = cVar;
        PlusPayConfettiView plusPayConfettiView = (PlusPayConfettiView) cVar.f.g(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c.n[6]);
        com.yandex.passport.internal.entities.j jVar = cVar.h;
        jVar.getClass();
        plusPayConfettiView.getClass();
        jVar.a = plusPayConfettiView;
        ViewGroup.LayoutParams layoutParams = A().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = A().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = A().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i3 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = A().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i4 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.b bVar2 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.b(this, i, i2, i3, i4, cVar, 1);
        com.yandex.plus.core.insets.a aVar2 = new com.yandex.plus.core.insets.a();
        aVar2.b = new LinkedHashSet(2);
        aVar2.d();
        aVar2.c();
        dVar.b.put(bVar2, aVar2);
        dVar.b(view);
        fkn fknVar = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a) this.h.getValue()).k;
        nyf lifecycle = getViewLifecycleOwner().getLifecycle();
        lyf lyfVar = lyf.d;
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(fknVar, lifecycle, lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new laq(cVar, continuation, 24));
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(z().t, getViewLifecycleOwner().getLifecycle(), lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.b(this, cVar, continuation, 5));
        if (bundle == null) {
            r1.O(view, com.yandex.plus.pay.ui.core.mobile.haptic.a.a);
        }
    }

    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d x() {
        return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) this.g.getValue();
    }

    public final View y() {
        return (View) this.m.x(q[1]);
    }

    public final k z() {
        return (k) this.i.getValue();
    }
}
