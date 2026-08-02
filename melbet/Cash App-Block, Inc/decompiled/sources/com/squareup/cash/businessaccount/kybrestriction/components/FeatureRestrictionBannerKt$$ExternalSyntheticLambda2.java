package com.squareup.cash.businessaccount.kybrestriction.components;

import com.squareup.cash.businessaccount.kybrestriction.viewmodels.KybRestrictionBannerViewEvent;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class FeatureRestrictionBannerKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ KybEligibilityWarning.BannerDetail f$1;

    public /* synthetic */ FeatureRestrictionBannerKt$$ExternalSyntheticLambda2(Function1 function1, KybEligibilityWarning.BannerDetail bannerDetail, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = bannerDetail;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        KybEligibilityWarning.BannerDetail bannerDetail = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new KybRestrictionBannerViewEvent.ImpressionEvent(bannerDetail));
                break;
            default:
                KybEligibilityWarning.Action action = bannerDetail.action;
                String str = action != null ? action.route_url : null;
                str.getClass();
                function1.invoke(str);
                break;
        }
        return Unit.INSTANCE;
    }
}
