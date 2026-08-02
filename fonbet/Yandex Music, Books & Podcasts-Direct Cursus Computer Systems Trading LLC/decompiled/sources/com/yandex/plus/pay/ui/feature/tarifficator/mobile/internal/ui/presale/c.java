package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.bdui.plus.checkout.content.controller.d0;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleContentView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.n;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfu;
import defpackage.ern;
import defpackage.fkn;
import defpackage.hyi;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/presale/c;", "Landroidx/fragment/app/o;", "<init>", "()V", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class c extends o {
    public static final /* synthetic */ s9f[] l;
    public final jyr g;
    public final ybf h;
    public final ybf i;
    public final com.yandex.passport.internal.core.accounts.h j;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a k;

    static {
        yxm yxmVar = new yxm(c.class, "presaleContentView", "getPresaleContentView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/presale/PresaleContentView;", 0);
        ern.a.getClass();
        l = new s9f[]{yxmVar};
    }

    public c() {
        super(R.layout.pay_sdk_fragment_tarifficator_presale);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                c cVar = this.b;
                switch (i2) {
                    case 0:
                        s9f[] s9fVarArr = c.l;
                        ArrayList l2 = com.yandex.plus.bdui.plus.analytics.b.l(cVar);
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
                        s9f[] s9fVarArr2 = c.l;
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) cVar.g.getValue()).f();
                    default:
                        s9f[] s9fVarArr3 = c.l;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(j.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) cVar.g.getValue()).b, 7))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = c.l;
                        ArrayList l2 = com.yandex.plus.bdui.plus.analytics.b.l(cVar);
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
                        s9f[] s9fVarArr2 = c.l;
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) cVar.g.getValue()).f();
                    default:
                        s9f[] s9fVarArr3 = c.l;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(j.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) cVar.g.getValue()).b, 7))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        b bVar = new b(this, 0);
        bwf bwfVar = bwf.c;
        arf a = btf.a(bwfVar, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(3, bVar));
        this.h = new ybf(ern.a(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a.class), new n(a, 24), function0, new n(a, 25));
        final int i3 = 2;
        Function0 function02 = new Function0(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        s9f[] s9fVarArr = c.l;
                        ArrayList l2 = com.yandex.plus.bdui.plus.analytics.b.l(cVar);
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
                        s9f[] s9fVarArr2 = c.l;
                        return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) cVar.g.getValue()).f();
                    default:
                        s9f[] s9fVarArr3 = c.l;
                        dfu[] dfuVarArr = (dfu[]) Arrays.copyOf(new dfu[]{new dfu(ern.a(j.class), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.j(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) cVar.g.getValue()).b, 7))}, 1);
                        return new nme((dfu[]) Arrays.copyOf(dfuVarArr, dfuVarArr.length));
                }
            }
        };
        arf a2 = btf.a(bwfVar, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.c(4, new b(this, 1)));
        this.i = new ybf(ern.a(j.class), new n(a2, 26), function02, new n(a2, 27));
        this.j = new com.yandex.passport.internal.core.accounts.h(new com.yandex.passport.internal.ui.sloth.menu.c(2, this), new com.yandex.passport.common.util.e(10, this));
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar = this.k;
        if (aVar != null) {
            aVar.d().setOnScrollChangeListener((hyi) null);
            aVar.j = null;
        }
        this.k = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        qpj onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        wxf.k(onBackPressedDispatcher, getViewLifecycleOwner(), new m(17, this));
        PresaleContentView presaleContentView = (PresaleContentView) this.j.x(l[0]);
        jyr jyrVar = this.g;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a aVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.a(presaleContentView, ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) jyrVar.getValue()).a.j, ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.d) jyrVar.getValue()).a.q, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, x(), j.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0, 5), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, x(), j.class, "onSuggestedOfferButtonClick", "onSuggestedOfferButtonClick()V", 0, 6), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, x(), j.class, "onOriginalOfferButtonClick", "onOriginalOfferButtonClick()V", 0, 7), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, x(), j.class, "onLegalTextShown", "onLegalTextShown()V", 0, 8));
        this.k = aVar;
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        d0 d0Var = new d0(aVar, 1);
        com.yandex.plus.core.insets.a aVar2 = new com.yandex.plus.core.insets.a();
        aVar2.b = new LinkedHashSet(2);
        aVar2.d();
        aVar2.c();
        dVar.b.put(d0Var, aVar2);
        dVar.b(view);
        fkn fknVar = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.common.a) this.h.getValue()).k;
        nyf lifecycle = getViewLifecycleOwner().getLifecycle();
        lyf lyfVar = lyf.d;
        Continuation continuation = null;
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(fknVar, lifecycle, lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new laq(aVar, continuation, 23));
        com.yandex.plus.bdui.flex.ui.a.i(kg5.t(x().t, getViewLifecycleOwner().getLifecycle(), lyfVar), com.yandex.plus.bdui.plus.analytics.b.n(this), new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.b(this, aVar, continuation, 4));
    }

    public final j x() {
        return (j) this.i.getValue();
    }
}
