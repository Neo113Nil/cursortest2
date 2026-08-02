package com.squareup.cash.moneybot.genie;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.common.MediaItem;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSizeImpl;
import com.squareup.cash.common.composeui.ClusteredAvatarValues;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.HypeCountdownAnimationKt;
import com.squareup.cash.common.viewmodels.NextAvailableCashTag;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.retro.views.PaymentPlanSummaryViewKt;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentViewModel;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.views.HeroCardViewKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final /* synthetic */ class TextViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ TextViewKt$$ExternalSyntheticLambda0(RealImageLoader realImageLoader, TapToPayPaymentViewModel tapToPayPaymentViewModel, long j, Function1 function1) {
        this.$r8$classId = 9;
        this.f$0 = realImageLoader;
        this.f$1 = tapToPayPaymentViewModel;
        this.f$2 = j;
        this.f$3 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$3;
        Object obj4 = this.f$0;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                String str = (String) obj4;
                Modifier modifier = (Modifier) obj5;
                TextStyle textStyle = (TextStyle) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    TextKt.m561TextNvy7gAk(str, modifier, this.f$2, 0L, null, 0L, null, 0L, 0, false, 0, 0, textStyle, gapComposer, 0, 0, 131064);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                TextViewKt.m3618ImageWithSubcomposeBx497Mc((AvatarImage.Remote) obj5, (AvatarSizeImpl) obj3, (String) obj4, this.f$2, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                VisibleKt.m3486ClusteredAvatarsww6aTOc((ImmutableList) obj4, (ClusteredAvatarValues) obj3, (Modifier) obj5, this.f$2, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                VisibleKt.m3500TooltipBubblesW7UJKQ((Modifier) obj5, this.f$2, (PaddingValuesImpl) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(3073));
                break;
            case 4:
                ((Integer) obj2).getClass();
                HypeCountdownAnimationKt.m3503HypeCountdownAnimationuDo3WH8((NextAvailableCashTag) obj4, (Modifier) obj5, this.f$2, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(65));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AlphaKt.m3714PersonalizePaymentBackgroundcf5BqRc((Modifier) obj5, (String) obj4, this.f$2, (List) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 6:
                ((Integer) obj2).getClass();
                PaymentPlanSummaryViewKt.m3737PurchasesSectionsW7UJKQ((PaymentPlanSummaryViewModel.PurchasesSection) obj4, this.f$2, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                PaymentPlanSummaryViewKt.m3738TimelineSectionsW7UJKQ((PaymentPlanSummaryViewModel.TimelineSection) obj4, this.f$2, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                MediaItem.DrmConfiguration.m1139SimpleChatButtoncf5BqRc((Function0) obj4, (Modifier) obj5, this.f$2, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(3073));
                break;
            case 9:
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                TapToPayPaymentViewModel tapToPayPaymentViewModel = (TapToPayPaymentViewModel) obj5;
                Function1 function1 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-909642631, new TapToPayPaymentKt$$ExternalSyntheticLambda3(tapToPayPaymentViewModel, this.f$2, function1), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                HeroCardViewKt.m3792JustifiedTextcf5BqRc((Modifier) obj5, (List) obj4, this.f$2, (TextStyle) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextViewKt$$ExternalSyntheticLambda0(Modifier modifier, Object obj, long j, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = modifier;
        this.f$0 = obj;
        this.f$2 = j;
        this.f$3 = obj2;
    }

    public /* synthetic */ TextViewKt$$ExternalSyntheticLambda0(Modifier modifier, long j, PaddingValuesImpl paddingValuesImpl, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 3;
        this.f$1 = modifier;
        this.f$2 = j;
        this.f$0 = paddingValuesImpl;
        this.f$3 = composableLambdaImpl;
    }

    public /* synthetic */ TextViewKt$$ExternalSyntheticLambda0(AvatarImage.Remote remote, AvatarSizeImpl avatarSizeImpl, String str, long j, int i) {
        this.$r8$classId = 1;
        this.f$1 = remote;
        this.f$3 = avatarSizeImpl;
        this.f$0 = str;
        this.f$2 = j;
    }

    public /* synthetic */ TextViewKt$$ExternalSyntheticLambda0(Object obj, long j, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = j;
        this.f$3 = function1;
        this.f$1 = modifier;
    }

    public /* synthetic */ TextViewKt$$ExternalSyntheticLambda0(Object obj, Modifier modifier, long j, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = modifier;
        this.f$2 = j;
        this.f$3 = function;
    }

    public /* synthetic */ TextViewKt$$ExternalSyntheticLambda0(String str, Modifier modifier, long j, TextStyle textStyle) {
        this.$r8$classId = 0;
        this.f$0 = str;
        this.f$1 = modifier;
        this.f$2 = j;
        this.f$3 = textStyle;
    }

    public /* synthetic */ TextViewKt$$ExternalSyntheticLambda0(ImmutableList immutableList, ClusteredAvatarValues clusteredAvatarValues, Modifier modifier, long j, int i) {
        this.$r8$classId = 2;
        this.f$0 = immutableList;
        this.f$3 = clusteredAvatarValues;
        this.f$1 = modifier;
        this.f$2 = j;
    }
}
