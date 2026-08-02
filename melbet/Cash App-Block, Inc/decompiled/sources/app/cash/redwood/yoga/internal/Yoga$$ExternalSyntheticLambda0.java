package app.cash.redwood.yoga.internal;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.local.viewmodels.LocalBrandProfileViewEvent;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewEvent;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewEvent;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.local.viewmodels.pos.LocalPosLocalCashRedemptionViewModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.redwood.protocol.Change;
import app.cash.redwood.protocol.ModifierTag;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.google.android.gms.maps.model.Marker;
import com.squareup.cash.maps.views.CashCluster;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final /* synthetic */ class Yoga$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Yoga$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                YGStyle yGStyle = (YGStyle) obj;
                yGStyle.getClass();
                return yGStyle.dimensions;
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 3:
                ((Marker) obj).getClass();
                return Boolean.TRUE;
            case 4:
                ((Marker) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                ((Marker) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                ((Marker) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                ((CashCluster) obj).getClass();
                return RoundedCornerShapeKt.CircleShape;
            case 9:
                ((LocalBrandProfileViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                ((MarketingMessagesViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                ((MarketingMessagesViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((MarketingMessagesViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((MarketingMessagesViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                ((MarketingMessageViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 16:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 17:
                LocalPosBrandOnboardingViewModel localPosBrandOnboardingViewModel = (LocalPosBrandOnboardingViewModel) obj;
                localPosBrandOnboardingViewModel.getClass();
                return Reflection.factory.getOrCreateKotlinClass(localPosBrandOnboardingViewModel.getClass());
            case 18:
                LocalPosLocalCashRedemptionViewModel.Coupon coupon = (LocalPosLocalCashRedemptionViewModel.Coupon) obj;
                coupon.getClass();
                return coupon.toString();
            case 19:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(new SvgDecoder$$ExternalSyntheticLambda0(1), 1), EnterExitTransitionKt.slideOutHorizontally$default(new Yoga$$ExternalSyntheticLambda0(21)));
            case 20:
                EducationalSheetModelList educationalSheetModelList = (EducationalSheetModelList) obj;
                educationalSheetModelList.getClass();
                return Integer.valueOf(educationalSheetModelList.sheets.hashCode());
            case 21:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 22:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver3);
                return Unit.INSTANCE;
            case 23:
                ((TabToolbarInternalViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 25:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                EmptyList emptyList = EmptyList.INSTANCE;
                classSerialDescriptorBuilder.element("tag", ModifierTag.Companion.serializer().getDescriptor(), emptyList, false);
                classSerialDescriptorBuilder.element("value", JsonElement.Companion.serializer().getDescriptor(), emptyList, false);
                return Unit.INSTANCE;
            case 26:
                Change change = (Change) obj;
                change.getClass();
                return " - " + change;
            case 27:
                YGStyle yGStyle2 = (YGStyle) obj;
                yGStyle2.getClass();
                return yGStyle2.minDimensions;
            case 28:
                YGStyle yGStyle3 = (YGStyle) obj;
                yGStyle3.getClass();
                return yGStyle3.minDimensions;
            default:
                YGStyle yGStyle4 = (YGStyle) obj;
                yGStyle4.getClass();
                return yGStyle4.maxDimensions;
        }
    }
}
