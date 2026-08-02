package app.cash.local.views.brand.checkout;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.local.viewmodels.AppliedCoupon;
import app.cash.local.viewmodels.CouponSection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class CheckoutCouponSectionKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CouponSection f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ CheckoutCouponSectionKt$$ExternalSyntheticLambda3(CouponSection couponSection, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = couponSection;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    List list = this.f$0.appliedCoupons;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        AppliedCoupon appliedCoupon = (AppliedCoupon) list.get(i2);
                        String str = appliedCoupon.code;
                        boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(appliedCoupon);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new StatusRunnable$$ExternalSyntheticLambda1(16, function1, appliedCoupon);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        CheckoutTipSectionKt.AppliedCouponChip(0, gapComposer, str, (Function0) rememberedValue);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier modifier = LocalBrandLocationCheckoutViewKt.SectionItemModifier;
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GestureNodeKt$$ExternalSyntheticLambda0(6, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function12 = (Function1) rememberedValue2;
                    boolean changed3 = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new GestureNodeKt$$ExternalSyntheticLambda0(7, function1);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    CheckoutTipSectionKt.CheckoutCouponSection(modifier, this.f$0, function12, (Function1) rememberedValue3, gapComposer2, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
