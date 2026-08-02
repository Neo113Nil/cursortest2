package defpackage;

import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionView;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionPaymentAnalytics$Params;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.resources.core.a;

/* loaded from: classes2.dex */
public final class wkd extends cb5 {
    public final m501 i;
    public final vkd j;
    public final a k;

    public wkd(ButtonSectionView buttonSectionView, v17 v17Var, c0d0 c0d0Var, PlusSdkBrandType plusSdkBrandType, m501 m501Var, vkd vkdVar, a aVar) {
        super(buttonSectionView, v17Var, c0d0Var, plusSdkBrandType);
        this.i = m501Var;
        this.j = vkdVar;
        this.k = aVar;
    }

    @Override // defpackage.cb5
    public final void f(PlusAcquisitionPaymentAnalytics$Params plusAcquisitionPaymentAnalytics$Params, com.yandex.plus.acquisition.adapter.internal.controller.a aVar) {
        nx4 nx4Var = this.f;
        if (nx4Var == null || !nx4Var.b) {
            super.f(plusAcquisitionPaymentAnalytics$Params, aVar);
        } else {
            d();
        }
    }
}
