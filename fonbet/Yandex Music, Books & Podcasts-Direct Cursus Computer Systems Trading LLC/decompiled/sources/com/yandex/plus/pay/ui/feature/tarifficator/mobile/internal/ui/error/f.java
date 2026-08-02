package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.bdui.plus.checkout.content.controller.v;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.n;
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
import defpackage.ncs;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/error/f;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class f extends o {
    public static final /* synthetic */ s9f[] l = {new yxm(f.class, "errorContentView", "getErrorContentView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/error/ErrorContentView;", 0), f1d.c(ern.a, f.class, "progressView", "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", 0)};
    public final jyr g;
    public final ybf h;
    public final ybf i;
    public final com.yandex.passport.internal.core.accounts.h j;
    public final com.yandex.passport.internal.core.accounts.h k;

    public f() {
        super(R.layout.pay_sdk_fragment_tarifficator_error);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.a
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
                        s9f[] s9fVarArr = f.l;
                        ArrayList l2 = com.yandex.plus.bdui.plus.analytics.b.l(fVar);
                        Iterator it = l2.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) {
                                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d.class, l2);
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = f.l;
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) fVar.g.getValue()).f();
                    default:
                        s9f[] s9fVarArr3 = f.l;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(k.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) fVar.g.getValue()).b, 10))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.a
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
                        s9f[] s9fVarArr = f.l;
                        ArrayList l2 = com.yandex.plus.bdui.plus.analytics.b.l(fVar);
                        Iterator it = l2.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) {
                                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d.class, l2);
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = f.l;
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) fVar.g.getValue()).f();
                    default:
                        s9f[] s9fVarArr3 = f.l;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(k.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) fVar.g.getValue()).b, 10))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        b bVar = new b(this, 0);
        bwf bwfVar = bwf.c;
        arf a = btf.a(bwfVar, new ncs(29, bVar));
        this.h = new ybf(ern.a(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a.class), new n(a, 16), function0, new n(a, 17));
        final int i3 = 2;
        Function0 function02 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.a
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
                        s9f[] s9fVarArr = f.l;
                        ArrayList l2 = com.yandex.plus.bdui.plus.analytics.b.l(fVar);
                        Iterator it = l2.iterator();
                        while (it.hasNext()) {
                            com.yandex.plus.di.c o = ((com.yandex.plus.di.d) it.next()).o();
                            if (o instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) {
                                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) o;
                            }
                        }
                        com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.d(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d.class, l2);
                        return null;
                    case 1:
                        s9f[] s9fVarArr2 = f.l;
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) fVar.g.getValue()).f();
                    default:
                        s9f[] s9fVarArr3 = f.l;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(k.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) fVar.g.getValue()).b, 10))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a2 = btf.a(bwfVar, new c(0, new b(this, 1)));
        this.i = new ybf(ern.a(k.class), new n(a2, 18), function02, new n(a2, 19));
        this.j = new com.yandex.passport.internal.core.accounts.h(new d(this, 0), new e(this, 0));
        this.k = new com.yandex.passport.internal.core.accounts.h(new d(this, 1), new e(this, 1));
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        qpj onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        wxf.k(onBackPressedDispatcher, getViewLifecycleOwner(), new m(15, this));
        ErrorContentView errorContentView = (ErrorContentView) this.j.x(l[0]);
        jyr jyrVar = this.g;
        com.yandex.plus.pay.ui.design.api.api.a aVar = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) jyrVar.getValue()).a.q;
        com.yandex.plus.core.imageloader.b bVar = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) jyrVar.getValue()).a.j;
        y yVar = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) jyrVar.getValue()).a.s;
        ybf ybfVar = this.i;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar2 = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b(errorContentView, aVar, bVar, yVar, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, (k) ybfVar.getValue(), k.class, "onCloseButtonClick", "onCloseButtonClick()V", 0, 1), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, (k) ybfVar.getValue(), k.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", 0, 2), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, (k) ybfVar.getValue(), k.class, "onSecondaryButtonClick", "onSecondaryButtonClick()V", 0, 3));
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        v vVar = new v(bVar2, 2);
        com.yandex.plus.core.insets.a aVar2 = new com.yandex.plus.core.insets.a();
        aVar2.b = new LinkedHashSet(2);
        aVar2.d();
        aVar2.c();
        dVar.b.put(vVar, aVar2);
        dVar.b(view);
        fkn fknVar = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a) this.h.getValue()).k;
        nyf lifecycle = getViewLifecycleOwner().getLifecycle();
        lyf lyfVar = lyf.d;
        Continuation continuation = null;
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(fknVar, lifecycle, lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new laq(bVar2, continuation, 21));
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(((k) ybfVar.getValue()).v, getViewLifecycleOwner().getLifecycle(), lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.b(this, bVar2, continuation, 2));
        if (bundle == null) {
            r1.O(view, com.yandex.plus.pay.ui.core.mobile.haptic.a.b);
        }
    }
}
