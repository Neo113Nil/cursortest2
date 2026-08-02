package com.squareup.cash.cashapppay.views;

import android.content.Context;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.list.ListOrderedKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda2;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.GrpcStatus;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class CashAppPayStackedAvatarKt {

    /* renamed from: lambda$-1769166732, reason: not valid java name */
    public static final ComposableLambdaImpl f351lambda$1769166732 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda2(7), false, -1769166732);
    public static final ComposableLambdaImpl lambda$1043669436 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(6), false, 1043669436);

    public static final void CashAppPayStackedAvatar(AvatarViewModel avatarViewModel, Composer composer, int i) {
        GapComposer gapComposer;
        Color forThemeComposable;
        BlendModeColorFilter blendModeColorFilter;
        long j;
        avatarViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1610408003);
        int i2 = (gapComposer2.changedInstance(avatarViewModel) ? 4 : 2) | i;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ThemeInfo themeInfo = ThemeHelpersKt.themeInfo((Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext));
            ColorModel colorModel = avatarViewModel.accentColor;
            ComposableLambdaImpl composableLambdaImpl = null;
            if (colorModel == null) {
                gapComposer2.startReplaceGroup(-879953249);
                gapComposer2.end(false);
                forThemeComposable = null;
            } else {
                gapComposer2.startReplaceGroup(-1413858910);
                forThemeComposable = PagerMeasureKt.forThemeComposable(colorModel, themeInfo, gapComposer2);
                gapComposer2.end(false);
            }
            if (avatarViewModel.colorizeAvatar) {
                long j2 = Color.White;
                blendModeColorFilter = new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5)));
            } else {
                blendModeColorFilter = null;
            }
            Image image = GrpcStatus.Companion.getImage(avatarViewModel);
            String urlForTheme = image != null ? ThemablesKt.urlForTheme(image, themeInfo) : null;
            String str = avatarViewModel.displayName;
            Character monogram = str != null ? GrpcStatus.Companion.monogram(str) : null;
            TextStyle textStyle = MooncakeTheme.getTypography(gapComposer2).header2;
            if (forThemeComposable == null) {
                gapComposer2.startReplaceGroup(-1413844633);
                j = MooncakeTheme.getColors(gapComposer2).background;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1413845873);
                gapComposer2.end(false);
                j = forThemeComposable.value;
            }
            long j3 = j;
            String str2 = avatarViewModel.displayName;
            AvatarBadgeViewModel avatarBadgeViewModel = avatarViewModel.badge;
            if (avatarBadgeViewModel instanceof AvatarBadgeViewModel.IconRes) {
                gapComposer2.startReplaceGroup(-879336720);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-98801282, new CaptureCheckFaceKt$$ExternalSyntheticLambda6(18, avatarBadgeViewModel, themeInfo), gapComposer2);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-878899776);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            BadgedAvatarKt.m3409BadgedAvatarRYf9XWw(null, urlForTheme, str2, blendModeColorFilter, null, 0L, monogram, textStyle, 0L, null, 64.0f, RecyclerView.DECELERATION_RATE, null, j3, null, null, composableLambdaImpl, Alignment.Companion.BottomEnd, gapComposer, 0, 100663680, 6, 225073);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(avatarViewModel, i, 26);
        }
    }

    /* renamed from: InTransactionTopUpInfoSheet-OWMNXiA, reason: not valid java name */
    public static final void m3445InTransactionTopUpInfoSheetOWMNXiA(Modifier modifier, int i, int i2, TextStyle textStyle, Function1 function1, Composer composer, int i3) {
        int i4;
        int i5;
        TextStyle textStyle2;
        TextStyle textStyle3;
        int i6;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1497299082);
        int i7 = i3 | 13315248 | (gapComposer.changedInstance(function1) ? 67108864 : 33554432);
        if (gapComposer.shouldExecute(i7 & 1, (38347923 & i7) != 38347922)) {
            gapComposer.startDefaults();
            if ((i3 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography == null) {
                    mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                textStyle3 = mooncakeTypography.smallTitle;
                i4 = 3;
                i6 = 3;
            } else {
                gapComposer.skipToGroupEnd();
                i4 = i;
                i6 = i2;
                textStyle3 = textStyle;
            }
            gapComposer.endDefaults();
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-257934543, new ListOrderedKt$$ExternalSyntheticLambda3(modifier, i4, function1, i6, textStyle3), gapComposer), gapComposer, 6);
            i5 = i6;
            textStyle2 = textStyle3;
        } else {
            gapComposer.skipToGroupEnd();
            i4 = i;
            i5 = i2;
            textStyle2 = textStyle;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(modifier, i4, i5, textStyle2, function1, i3, 25);
        }
    }
}
