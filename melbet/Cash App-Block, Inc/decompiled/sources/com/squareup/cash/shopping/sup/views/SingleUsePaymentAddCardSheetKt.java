package com.squareup.cash.shopping.sup.views;

import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentAddCardViewModel;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCancelPlanDialogViewModel;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentPlanDetailsViewModel;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda14;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okio.internal.ZipFilesKt$$ExternalSyntheticLambda2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public abstract class SingleUsePaymentAddCardSheetKt {
    public static final ComposableLambdaImpl lambda$1296955179 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(3), false, 1296955179);
    public static final ComposableLambdaImpl lambda$927144684 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(4), false, 927144684);

    /* renamed from: lambda$-1703605454, reason: not valid java name */
    public static final ComposableLambdaImpl f664lambda$1703605454 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(5), false, -1703605454);

    /* renamed from: lambda$-1852398181, reason: not valid java name */
    public static final ComposableLambdaImpl f665lambda$1852398181 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(6), false, -1852398181);

    public static final void AddCardContent(SingleUsePaymentAddCardViewModel singleUsePaymentAddCardViewModel, Function1 function1, Composer composer, int i) {
        singleUsePaymentAddCardViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1231610294);
        int i2 = (gapComposer.changedInstance(singleUsePaymentAddCardViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = singleUsePaymentAddCardViewModel.title;
            String str2 = singleUsePaymentAddCardViewModel.message;
            String str3 = singleUsePaymentAddCardViewModel.buttonText;
            boolean z = false;
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SingleUsePaymentHalfSheetContent(str, str2, str3, buttonProminence, false, null, (Function0) rememberedValue, gapComposer, 3072, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1(singleUsePaymentAddCardViewModel, function1, i, i3);
        }
    }

    public static final void CancelPlan(SingleUsePaymentCancelPlanDialogViewModel singleUsePaymentCancelPlanDialogViewModel, Function1 function1, Composer composer, int i) {
        singleUsePaymentCancelPlanDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-653986754);
        int i2 = (gapComposer.changedInstance(singleUsePaymentCancelPlanDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-861345719, new SingleUsePaymentCancelPlanDialogKt$$ExternalSyntheticLambda0(singleUsePaymentCancelPlanDialogViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SingleUsePaymentCancelPlanDialogKt$$ExternalSyntheticLambda0(singleUsePaymentCancelPlanDialogViewModel, function1, i);
        }
    }

    public static final void CardDetails(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-845030641);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1017361060, new ScoreHomeKt$$ExternalSyntheticLambda8(function1, z, 19), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 24, z);
        }
    }

    public static final void PlanDetails(SingleUsePaymentPlanDetailsViewModel singleUsePaymentPlanDetailsViewModel, Function1 function1, Composer composer, int i) {
        singleUsePaymentPlanDetailsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1969638161);
        int i2 = (gapComposer.changedInstance(singleUsePaymentPlanDetailsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        byte b = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(517432954, new SingleUsePaymentPlanDetailsSheetKt$$ExternalSyntheticLambda0(singleUsePaymentPlanDetailsViewModel, function1, b, b), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SingleUsePaymentPlanDetailsSheetKt$$ExternalSyntheticLambda0(singleUsePaymentPlanDetailsViewModel, function1, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SingleUsePaymentHalfSheetContent(String str, String str2, String str3, ButtonProminence buttonProminence, boolean z, CartTotalDiscrepancy cartTotalDiscrepancy, Function0 function0, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        CartTotalDiscrepancy cartTotalDiscrepancy2;
        int i4;
        int i5;
        GapComposer gapComposer;
        boolean z3;
        ButtonProminence buttonProminence2;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        str2.getClass();
        str3.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-103156328);
        int i6 = (gapComposer2.changed(str) ? 4 : 2) | i | (gapComposer2.changed(str2) ? 32 : 16) | (gapComposer2.changed(str3) ? 256 : 128);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i6 |= 3072;
        } else if ((i & 3072) == 0) {
            i6 |= gapComposer2.changed(buttonProminence == null ? -1 : buttonProminence.ordinal()) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i6 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i6 |= gapComposer2.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
            i3 = i2 & 32;
            if (i3 == 0) {
                i4 = i6 | 196608;
                cartTotalDiscrepancy2 = cartTotalDiscrepancy;
            } else {
                cartTotalDiscrepancy2 = cartTotalDiscrepancy;
                i4 = i6 | (gapComposer2.changed(cartTotalDiscrepancy2) ? PKIFailureInfo.unsupportedVersion : 65536);
            }
            i5 = i4 | (!gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
            if (gapComposer2.shouldExecute(i5 & 1, (599187 & i5) == 599186)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                z3 = z2;
                buttonProminence2 = buttonProminence;
            } else {
                ButtonProminence buttonProminence3 = i7 != 0 ? ButtonProminence.PROMINENT : buttonProminence;
                boolean z4 = i8 != 0 ? false : z2;
                if (i3 != 0) {
                    cartTotalDiscrepancy2 = null;
                }
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                gapComposer = gapComposer2;
                SurfaceKt.m554SurfaceT9BRK9s(null, null, colors.semantic.background.f1047app, 0L, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1442089187, new SingleUsePaymentHalfSheetContentKt$$ExternalSyntheticLambda0(str, str2, str3, buttonProminence3, z4, cartTotalDiscrepancy2, function0), gapComposer2), gapComposer, 12582912, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                z3 = z4;
                buttonProminence2 = buttonProminence3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda4(str, str2, str3, buttonProminence2, z3, cartTotalDiscrepancy2, function0, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        i3 = i2 & 32;
        if (i3 == 0) {
        }
        i5 = i4 | (!gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer2.shouldExecute(i5 & 1, (599187 & i5) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SingleUsePaymentHalfSheetContentArcade(String str, String str2, String str3, ButtonProminence buttonProminence, boolean z, CartTotalDiscrepancy cartTotalDiscrepancy, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1196363080);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(str3) ? 256 : 128) | (gapComposer.changed(buttonProminence == null ? -1 : buttonProminence.ordinal()) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(cartTotalDiscrepancy) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(z ? Icons.Alert32 : Icons.LogoUsd32, 0L, 6);
            AvatarOverlay.LocalIcon localIcon2 = new AvatarOverlay.LocalIcon(14, 0L, 0L, Icons.PayInFour16);
            if (z) {
                localIcon2 = null;
            }
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Colors.Semantic.Background background = colors.semantic.background;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(661260829, new ZipFilesKt$$ExternalSyntheticLambda2(z ? background.danger : background.brand, localIcon, localIcon2, str, str2, cartTotalDiscrepancy, function0, buttonProminence, str3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SingleUsePaymentHalfSheetContentKt$$ExternalSyntheticLambda0(str, str2, str3, buttonProminence, z, cartTotalDiscrepancy, function0, i);
        }
    }
}
