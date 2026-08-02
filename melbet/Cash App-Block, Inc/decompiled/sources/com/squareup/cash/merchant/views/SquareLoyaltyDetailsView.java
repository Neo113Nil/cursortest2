package com.squareup.cash.merchant.views;

import android.content.Context;
import android.view.WindowInsets;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda23;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.SpecialEffectsController$Companion;
import androidx.glance.ImageKt;
import androidx.glance.action.ActionParametersKt;
import androidx.glance.appwidget.AppWidgetUtilsKt;
import androidx.glance.appwidget.ApplyModifiersKt;
import androidx.glance.appwidget.CoroutineBroadcastReceiverKt;
import androidx.glance.appwidget.GlanceAppWidgetKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda38;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.squareup.cash.R;
import com.squareup.cash.account.components.accountswitcher.AccountSwitcherView$$ExternalSyntheticLambda0;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountSwitcherViewModel;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda80;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.genericelements.views.GenericTreeElementsSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltyDetailsViewModel;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.CenterLineAlignmentModifier;
import com.squareup.cash.mooncake.compose_ui.components.CenterLineAlignmentRowScopeInstance;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.Line$First;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCheckoutViewModel;
import com.squareup.cash.shopping.viewmodels.BulletImage;
import com.squareup.cash.shopping.viewmodels.BulletModel;
import com.squareup.cash.shopping.viewmodels.ButtonModel;
import com.squareup.cash.shopping.viewmodels.LogoImage;
import com.squareup.cash.shopping.viewmodels.ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.views.BulletedListShoppingInfoSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.protos.cash.discover.api.app.v1.model.HorizontalAlignment;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v1.model.TextStyle;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.StableHolder;
import com.withpersona.sdk2.camera.ContextUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class SquareLoyaltyDetailsView extends ComposeUiView implements OutsideTapCloses {
    public final /* synthetic */ int $r8$classId;
    public final Object imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareLoyaltyDetailsView(Context context, RealImageLoader realImageLoader, int i) {
        super(context);
        this.$r8$classId = i;
        context.getClass();
        switch (i) {
            case 1:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 2:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 3:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            default:
                this.imageLoader = realImageLoader;
                break;
        }
    }

    public void AvatarBadge(StableHolder stableHolder, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1586907478);
        int i2 = (gapComposer.changed(stableHolder) ? 4 : 2) | i | 48 | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AsyncImageKt.m1442AsyncImagex1rPTaM(ThemablesKt.urlForTheme((Image) stableHolder.model, ThemeHelpersKt.themeInfo(this)), SpacerKt.m298padding3ABfNKs(SizeKt.m285size3ABfNKs(companion, 22.0f), 2.0f), null, null, null, null, null, gapComposer, (Painter.$stable << 12) | 48, 0, 32744);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(this, stableHolder, modifier2, i, 21);
        }
    }

    /* renamed from: Bullet-ziNgDLE, reason: not valid java name */
    public void m3601BulletziNgDLE(BulletModel bulletModel, float f, Composer composer, int i) {
        float f2;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1189531953);
        int i2 = (gapComposer.changedInstance(bulletModel) ? 4 : 2) | i | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = bulletModel.body.text;
            f2 = f;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, f2, (str == null || StringsKt.isBlank(str)) ? 16.0f : 24.0f, f, RecyclerView.DECELERATION_RATE, 8);
            BulletImage bulletImage = bulletModel.icon;
            if (bulletImage == null) {
                gapComposer.startReplaceGroup(429066650);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(429066651);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1432669395, new TabToolbarsKt$$ExternalSyntheticLambda3(1, bulletImage, this), gapComposer);
                gapComposer.end(false);
            }
            KeypadKt.CenterLineAlignmentRow(m302paddingqDBjuR0$default, rememberComposableLambda, null, Expect_jvmKt.rememberComposableLambda(-816193739, new PoolDetailsViewKt$$ExternalSyntheticLambda41(8, bulletModel, this), gapComposer), gapComposer, 3072);
        } else {
            f2 = f;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda38(this, bulletModel, f2, i, 8);
        }
    }

    public void BulletedSheetAvatar(Modifier modifier, LogoImage.AvatarModel avatarModel, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        GapComposer gapComposer;
        Color forThemeComposable;
        long j;
        BlendModeColorFilter blendModeColorFilter;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1497298048);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(avatarModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(this) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
            String urlForTheme = ThemablesKt.urlForTheme(avatarModel.image, themeInfo);
            ColorModel colorModel = avatarModel.backgroundColor;
            if (colorModel == null) {
                gapComposer2.startReplaceGroup(1524413380);
                gapComposer2.end(false);
                forThemeComposable = null;
            } else {
                gapComposer2.startReplaceGroup(-89372707);
                forThemeComposable = PagerMeasureKt.forThemeComposable(colorModel, themeInfo, gapComposer2);
                gapComposer2.end(false);
            }
            if (forThemeComposable == null) {
                gapComposer2.startReplaceGroup(-89370731);
                j = MooncakeTheme.getColors(gapComposer2).placeholderBackground;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-89373552);
                gapComposer2.end(false);
                j = forThemeComposable.value;
            }
            if (avatarModel.colorizeAvatar) {
                long j2 = Color.White;
                blendModeColorFilter = new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5)));
            } else {
                blendModeColorFilter = null;
            }
            float intValue = avatarModel.height != null ? r4.intValue() : 40.0f;
            Image image = avatarModel.badge;
            if (image == null) {
                gapComposer2.startReplaceGroup(1524822456);
                gapComposer2.end(false);
                composableLambdaImpl = null;
            } else {
                gapComposer2.startReplaceGroup(1524822457);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-131062233, new ActionPillKt$$ExternalSyntheticLambda1(4, this, image), gapComposer2);
                gapComposer2.end(false);
                composableLambdaImpl = rememberComposableLambda;
            }
            gapComposer = gapComposer2;
            BadgedAvatarKt.m3409BadgedAvatarRYf9XWw(modifier2, urlForTheme, null, blendModeColorFilter, null, j, null, null, 0L, null, intValue, RecyclerView.DECELERATION_RATE, null, 0L, null, null, composableLambdaImpl, null, gapComposer, i2 & 14, 0, 0, 1568724);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(this, modifier, avatarModel, false, i, 7);
        }
    }

    /* renamed from: BulletedSheetLogo--jt2gSs, reason: not valid java name */
    public void m3602BulletedSheetLogojt2gSs(LogoImage logoImage, float f, Composer composer, int i) {
        int i2;
        BiasAlignment.Horizontal horizontal;
        float f2 = f;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-872494106);
        int i3 = i & 6;
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(columnScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i4 == 0) {
            i2 |= gapComposer.changed(companion) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(logoImage) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            int ordinal = logoImage.getHorizontalAlignment().ordinal();
            if (ordinal == 0) {
                horizontal = Alignment.Companion.Start;
            } else if (ordinal == 1) {
                horizontal = Alignment.Companion.CenterHorizontally;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                horizontal = Alignment.Companion.End;
            }
            StableHolder stableHolder = new StableHolder(logoImage.getImage());
            Modifier m280requiredHeight3ABfNKs = logoImage.getHeight() != null ? SizeKt.m280requiredHeight3ABfNKs(companion, r9.intValue()) : null;
            if (logoImage instanceof LogoImage.AvatarModel) {
                gapComposer.startReplaceGroup(-948197270);
                BulletedSheetAvatar(SpacerKt.m302paddingqDBjuR0$default(columnScopeInstance.align(companion, horizontal), f2, 10.0f, f, RecyclerView.DECELERATION_RATE, 8), (LogoImage.AvatarModel) logoImage, gapComposer, ((i2 >> 6) & 896) | ((i2 >> 3) & 112));
                gapComposer.end(false);
                f2 = f;
            } else {
                if (!(logoImage instanceof LogoImage.ImageModel)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -948198500, false);
                }
                gapComposer.startReplaceGroup(-948188865);
                Modifier align = columnScopeInstance.align(companion, horizontal);
                if (m280requiredHeight3ABfNKs == null) {
                    m280requiredHeight3ABfNKs = SizeKt.fillMaxWidth(companion, 1.0f);
                }
                f2 = f;
                BulletedSheetLogoImage(SpacerKt.m302paddingqDBjuR0$default(align.then(m280requiredHeight3ABfNKs), f2, 10.0f, f, RecyclerView.DECELERATION_RATE, 8), stableHolder, ((LogoImage.ImageModel) logoImage).height, gapComposer, (i2 >> 3) & 7168);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardStudioViewKt$$ExternalSyntheticLambda80(this, logoImage, f2, i);
        }
    }

    public void BulletedSheetLogoImage(Modifier modifier, StableHolder stableHolder, Integer num, Composer composer, int i) {
        int i2;
        SquareLoyaltyDetailsView squareLoyaltyDetailsView;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1187921027);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(stableHolder) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            squareLoyaltyDetailsView = this;
            i2 |= gapComposer.changedInstance(squareLoyaltyDetailsView) ? 2048 : 1024;
        } else {
            squareLoyaltyDetailsView = this;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            AsyncImageKt.m1442AsyncImagex1rPTaM(ThemablesKt.urlForTheme((Image) stableHolder.model, ThemeHelpersKt.themeInfo(squareLoyaltyDetailsView)), modifier, null, null, null, null, num != null ? ContentScale.Companion.FillHeight : ContentScale.Companion.FillWidth, gapComposer, ((i2 << 6) & 896) | 48 | (Painter.$stable << 12), 0, 31720);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(modifier, squareLoyaltyDetailsView, stableHolder, num, i, 20);
        }
    }

    public void Content(SingleUsePaymentCheckoutViewModel singleUsePaymentCheckoutViewModel, Function1 function1, Composer composer, int i) {
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) this.imageLoader;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-203563291);
        int i2 = (gapComposer.changedInstance(singleUsePaymentCheckoutViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            CheckoutScreenType checkoutScreenType = singleUsePaymentCheckoutViewModel != null ? singleUsePaymentCheckoutViewModel.sheetType : null;
            if (checkoutScreenType instanceof CheckoutScreenType.ReviewPlan) {
                gapComposer.startReplaceGroup(140012903);
                AppWidgetUtilsKt.ReviewPlanContent(function1, gapComposer, (i2 >> 3) & 14);
                gapComposer.end(false);
            } else if (Intrinsics.areEqual(checkoutScreenType, CheckoutScreenType.NonEmptyCartWarning.INSTANCE)) {
                gapComposer.startReplaceGroup(140097502);
                ActionParametersKt.NonEmptyCartWarningContent(i2 & 112, gapComposer, null, function1);
                gapComposer.end(false);
            } else if (checkoutScreenType instanceof CheckoutScreenType.CreditLimitExceededWarning) {
                gapComposer.startReplaceGroup(140201011);
                FragmentContainerView.Api20Impl.CreditLimitExceededContent((CheckoutScreenType.CreditLimitExceededWarning) checkoutScreenType, function1, gapComposer, i2 & 112);
                gapComposer.end(false);
            } else if (checkoutScreenType instanceof CheckoutScreenType.MinimumSpendRestrictedWarning) {
                gapComposer.startReplaceGroup(140318191);
                ImageKt.MinimumSpendRestrictionContent((CheckoutScreenType.MinimumSpendRestrictedWarning) checkoutScreenType, function1, gapComposer, i2 & 112);
                gapComposer.end(false);
            } else if (checkoutScreenType instanceof CheckoutScreenType.ConnectionFailedWarning) {
                gapComposer.startReplaceGroup(140432395);
                FragmentAnim.ConnectionFailedContent(function1, gapComposer, (i2 >> 3) & 14);
                gapComposer.end(false);
            } else if (checkoutScreenType instanceof CheckoutScreenType.SpendingLimitReached) {
                gapComposer.startReplaceGroup(140517149);
                CoroutineBroadcastReceiverKt.SpendingLimitReachedContent(function1, gapComposer, (i2 >> 3) & 14);
                gapComposer.end(false);
            } else if (checkoutScreenType instanceof CheckoutScreenType.LoanLimitReached) {
                gapComposer.startReplaceGroup(140612319);
                FragmentKt.LoanLimitReachedContent(factory, (CheckoutScreenType.LoanLimitReached) checkoutScreenType, function1, gapComposer, (i2 << 3) & 896);
                gapComposer.end(false);
            } else if (checkoutScreenType instanceof CheckoutScreenType.LoanLimitReachedError) {
                gapComposer.startReplaceGroup(140741434);
                SpecialEffectsController$Companion.LoanLimitReachedErrorContent(factory, (CheckoutScreenType.LoanLimitReachedError) checkoutScreenType, function1, gapComposer, (i2 << 3) & 896);
                gapComposer.end(false);
            } else if (Intrinsics.areEqual(checkoutScreenType, CheckoutScreenType.SpendingLimitReachedError.INSTANCE)) {
                gapComposer.startReplaceGroup(140875416);
                GlanceAppWidgetKt.SpendingLimitReachedErrorContent(function1, gapComposer, (i2 >> 3) & 14);
                gapComposer.end(false);
            } else if (checkoutScreenType instanceof CheckoutScreenType.OneTimeCardContext) {
                gapComposer.startReplaceGroup(140980196);
                CheckoutScreenType.OneTimeCardContext oneTimeCardContext = (CheckoutScreenType.OneTimeCardContext) checkoutScreenType;
                ApplyModifiersKt.ContextualExplainerSheet(oneTimeCardContext.availableLimit, oneTimeCardContext.merchantName, function1, gapComposer, (i2 << 3) & 896);
                gapComposer.end(false);
            } else {
                if (checkoutScreenType != null) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1944178306, false);
                }
                gapComposer.startReplaceGroup(141173915);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(this, singleUsePaymentCheckoutViewModel, function1, i, 17);
        }
    }

    /* renamed from: GenericTreeElementsSection-V-9fs2A, reason: not valid java name */
    public void m3603GenericTreeElementsSectionV9fs2A(Modifier modifier, GenericTreeElementsViewModel genericTreeElementsViewModel, RealImageLoader realImageLoader, ScrollState scrollState, Function1 function1, long j, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1724753332);
        int i2 = i | 6 | (gapComposer.changedInstance(genericTreeElementsViewModel) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128) | (gapComposer.changed(scrollState) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(j) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = androidx.compose.foundation.ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), j, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier verticalScroll$default = androidx.compose.foundation.ImageKt.verticalScroll$default(OffsetKt.height(companion, IntrinsicSize.Max), scrollState, false, 14);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1890020279, new MusicViewKt$$ExternalSyntheticLambda7(11, function1), gapComposer);
            boolean z = (57344 & i2) == 16384;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(10, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ContextUtilsKt.GenericTreeElements(genericTreeElementsViewModel, verticalScroll$default, realImageLoader, true, rememberComposableLambda, (Function1) rememberedValue, gapComposer, ((i2 >> 3) & 14) | 27648 | (i2 & 896), 0);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda23(this, modifier2, genericTreeElementsViewModel, realImageLoader, scrollState, function1, j, i);
        }
    }

    public void InfoSheetButton(ButtonModel buttonModel, com.squareup.protos.cash.ui.Color color, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        MooncakePillButton.Style style;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1413856895);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(buttonModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1155) != 1154)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            String str = buttonModel.text;
            str.getClass();
            ButtonModel.Style style2 = buttonModel.style;
            if (style2 != null) {
                int ordinal = style2.ordinal();
                if (ordinal == 0) {
                    style = MooncakePillButton.Style.PRIMARY;
                } else if (ordinal == 1) {
                    style = MooncakePillButton.Style.SECONDARY;
                } else if (ordinal == 2) {
                    style = MooncakePillButton.Style.TERTIARY;
                } else {
                    if (ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    style = MooncakePillButton.Style.OUTLINE;
                }
            } else {
                style = MooncakePillButton.Style.SECONDARY;
            }
            MooncakePillButton.Style style3 = style;
            boolean changedInstance = gapComposer2.changedInstance(buttonModel) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(22, (Object) buttonModel, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            KeypadKt.m3640ButtonGFipHI0(str, (Function0) rememberedValue, fillMaxWidth, null, null, style3, null, false, 0, null, null, gapComposer, 0, 0, 4056);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17((Object) this, (Object) buttonModel, (Object) color, function1, (Object) modifier, i, 9);
        }
    }

    public void InfoSheetFooter(Text text, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Unit unit;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1559133445);
        int i2 = (gapComposer2.changedInstance(text) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(this) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            if (text == null) {
                gapComposer2.startReplaceGroup(-1926678627);
                gapComposer2.end(false);
                unit = null;
                gapComposer = gapComposer2;
            } else {
                gapComposer2.startReplaceGroup(-1926678626);
                TextStyle textStyle = text.text_style;
                textStyle.getClass();
                TextThemeInfo textThemeInfo = MooncakeTypographyKt.toTextThemeInfo(ComposeUtilsKt.toComposeTextStyle(textStyle, gapComposer2));
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                boolean changedInstance = gapComposer2.changedInstance(this);
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new RealSandboxer$$ExternalSyntheticLambda0(this, 18);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Function1 function12 = (Function1) rememberedValue;
                boolean changedInstance2 = gapComposer2.changedInstance(text) | gapComposer2.changedInstance(this) | ((i2 & 112) == 32) | gapComposer2.changedInstance(textThemeInfo);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    OpenSourceKt$$ExternalSyntheticLambda9 openSourceKt$$ExternalSyntheticLambda9 = new OpenSourceKt$$ExternalSyntheticLambda9(text, this, textThemeInfo, function1, 5);
                    gapComposer2.updateRememberedValue(openSourceKt$$ExternalSyntheticLambda9);
                    rememberedValue2 = openSourceKt$$ExternalSyntheticLambda9;
                }
                gapComposer = gapComposer2;
                AndroidView_androidKt.AndroidView(function12, fillMaxWidth, (Function1) rememberedValue2, gapComposer, 0, 0);
                gapComposer.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                gapComposer.startReplaceGroup(-1925843796);
                re$$ExternalSyntheticOutline0.m(Modifier.Companion.$$INSTANCE, 16.0f, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-616340416);
                gapComposer.end(false);
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(this, i, text, function1, modifier, 19);
        }
    }

    public void LoadingContent(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-97166269);
        int i2 = i & 1;
        if (gapComposer.shouldExecute(i2, i2 != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxWidth(companion, 1.0f));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 164.0f));
            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 50.0f));
            re$$ExternalSyntheticOutline0.m(companion, 164.0f, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda6(this, i, 12);
        }
    }

    public void LocalBulletImage(CenterLineAlignmentRowScopeInstance centerLineAlignmentRowScopeInstance, BulletImage.LocalImage localImage, Composer composer, int i) {
        int i2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1210944014);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(centerLineAlignmentRowScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(localImage) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(Line$First.INSTANCE) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 4.0f, 16.0f, RecyclerView.DECELERATION_RATE, 9), 20.0f);
            centerLineAlignmentRowScopeInstance.getClass();
            m285size3ABfNKs.getClass();
            Modifier then = m285size3ABfNKs.then(new CenterLineAlignmentModifier());
            int ordinal = localImage.icon.ordinal();
            if (ordinal == 0) {
                i3 = R.drawable.cash_logo_checkout;
            } else if (ordinal == 1) {
                i3 = R.drawable.shopping_tag;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i3 = R.drawable.shopping_shield;
            }
            Painter painterResource = Countries.painterResource(i3, 0, gapComposer);
            long j = MooncakeTheme.getColors(gapComposer).icon;
            androidx.compose.foundation.ImageKt.Image(painterResource, null, then, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(this, centerLineAlignmentRowScopeInstance, localImage, i, 5);
        }
    }

    public void RemoteBulletImage(CenterLineAlignmentRowScopeInstance centerLineAlignmentRowScopeInstance, BulletImage.RemoteImage remoteImage, Composer composer, int i) {
        int i2;
        SquareLoyaltyDetailsView squareLoyaltyDetailsView;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1183794484);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(centerLineAlignmentRowScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(remoteImage) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(Line$First.INSTANCE) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            squareLoyaltyDetailsView = this;
            i2 |= gapComposer.changedInstance(squareLoyaltyDetailsView) ? 2048 : 1024;
        } else {
            squareLoyaltyDetailsView = this;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            String urlForTheme = ThemablesKt.urlForTheme(remoteImage.image, ThemeHelpersKt.themeInfo(squareLoyaltyDetailsView));
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), 24.0f);
            centerLineAlignmentRowScopeInstance.getClass();
            m285size3ABfNKs.getClass();
            AsyncImageKt.m1438AsyncImage10Xjiaw(urlForTheme, null, m285size3ABfNKs.then(new CenterLineAlignmentModifier()), null, null, null, gapComposer, 48, 2040);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(squareLoyaltyDetailsView, centerLineAlignmentRowScopeInstance, remoteImage, i, 6);
        }
    }

    public void SheetContent(ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z;
        float f;
        long j;
        int i2;
        float f2;
        boolean z2;
        long j2;
        int i3;
        boolean z3;
        GapComposer gapComposer2;
        boolean z4;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-783682600);
        int i4 = i | (gapComposer3.changedInstance(loaded) ? 4 : 2) | (gapComposer3.changedInstance(function1) ? 32 : 16) | (gapComposer3.changedInstance(this) ? 256 : 128);
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            HorizontalAlignment horizontalAlignment = loaded.titleAlignment;
            Text text = loaded.title;
            float f3 = horizontalAlignment == HorizontalAlignment.LEFT ? 40.0f : 24.0f;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = androidx.compose.foundation.ImageKt.verticalScroll$default(NestedScrollModifierKt.nestedScroll(SpacerKt.navigationBarsPadding(SizeKt.fillMaxWidth(companion, 1.0f)), zzagn.rememberNestedScrollInteropConnection(gapComposer3), null), androidx.compose.foundation.ImageKt.rememberScrollState(gapComposer3), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, verticalScroll$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            LogoImage logoImage = loaded.logo;
            if (logoImage == null) {
                gapComposer3.startReplaceGroup(-399711356);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(-399711355);
                m3602BulletedSheetLogojt2gSs(logoImage, f3, gapComposer3, ((i4 << 6) & 57344) | 54);
                re$$ExternalSyntheticOutline0.m(companion, 16.0f, gapComposer3, false);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), f3, RecyclerView.DECELERATION_RATE, 2);
            String str = text.text;
            str.getClass();
            TextStyle textStyle = text.text_style;
            textStyle.getClass();
            androidx.compose.ui.text.TextStyle composeTextStyle = ComposeUtilsKt.toComposeTextStyle(textStyle, gapComposer3);
            com.squareup.protos.cash.ui.Color color = text.text_color;
            color.getClass();
            Color forThemeComposable = PagerMeasureKt.forThemeComposable(new ColorModel.Accented(color), ThemeHelpersKt.themeInfo(this), gapComposer3);
            forThemeComposable.getClass();
            long j3 = forThemeComposable.value;
            int ordinal = horizontalAlignment.ordinal();
            if (ordinal != 0) {
                z = true;
                if (ordinal == 1) {
                    f = f3;
                    j = j3;
                    i2 = 3;
                } else if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                } else {
                    f = f3;
                    j = j3;
                    i2 = 2;
                }
            } else {
                z = true;
                f = f3;
                j = j3;
                i2 = 1;
            }
            KeypadKt.m3651TextPdH14aY(0, 0, i2, 0, 0, 0, 3824, j, (Composer) gapComposer3, m300paddingVpY3zN4$default, composeTextStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Text text2 = loaded.subtitle;
            if (text2 == null) {
                gapComposer3.startReplaceGroup(-399133888);
                gapComposer3.end(false);
                f2 = f;
                gapComposer2 = gapComposer3;
                z3 = true;
            } else {
                gapComposer3.startReplaceGroup(-399133887);
                float f4 = f;
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), f4, 4.0f, f, RecyclerView.DECELERATION_RATE, 8);
                f2 = f4;
                String str2 = text2.text;
                str2.getClass();
                TextStyle textStyle2 = text2.text_style;
                textStyle2.getClass();
                androidx.compose.ui.text.TextStyle composeTextStyle2 = ComposeUtilsKt.toComposeTextStyle(textStyle2, gapComposer3);
                com.squareup.protos.cash.ui.Color color2 = text2.text_color;
                color2.getClass();
                Color forThemeComposable2 = PagerMeasureKt.forThemeComposable(new ColorModel.Accented(color2), ThemeHelpersKt.themeInfo(this), gapComposer3);
                forThemeComposable2.getClass();
                long j4 = forThemeComposable2.value;
                int ordinal2 = horizontalAlignment.ordinal();
                if (ordinal2 != 0) {
                    z2 = true;
                    if (ordinal2 == 1) {
                        j2 = j4;
                        i3 = 3;
                    } else if (ordinal2 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    } else {
                        j2 = j4;
                        i3 = 2;
                    }
                } else {
                    z2 = true;
                    j2 = j4;
                    i3 = 1;
                }
                z3 = z2;
                KeypadKt.m3651TextPdH14aY(0, 0, i3, 0, 0, 0, 3824, j2, (Composer) gapComposer3, m302paddingqDBjuR0$default, composeTextStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer2 = gapComposer3;
                gapComposer2.end(false);
            }
            gapComposer2.startReplaceGroup(-289956689);
            Iterator it = loaded.bullets.iterator();
            while (it.hasNext()) {
                m3601BulletziNgDLE((BulletModel) it.next(), f2, gapComposer2, i4 & 896);
            }
            gapComposer2.end(false);
            if (loaded.buttonBelowFooter) {
                gapComposer2.startReplaceGroup(-398605616);
                int i5 = i4 << 3;
                float f5 = f2;
                GapComposer gapComposer4 = gapComposer2;
                z4 = z3;
                InfoSheetFooter(loaded.footer, function1, SpacerKt.m301paddingqDBjuR0(companion, f2, 32.0f, f2, 16.0f), gapComposer4, (i4 & 112) | (i5 & 7168));
                gapComposer = gapComposer4;
                InfoSheetButton(loaded.button, loaded.buttonBackgroundColor, function1, SpacerKt.m302paddingqDBjuR0$default(companion, f5, RecyclerView.DECELERATION_RATE, f5, 24.0f, 2), gapComposer, (i5 & 896) | ((i4 << 6) & 57344));
                gapComposer.end(false);
            } else {
                float f6 = f2;
                z4 = z3;
                gapComposer2.startReplaceGroup(-398027931);
                int i6 = i4 << 3;
                InfoSheetButton(loaded.button, loaded.buttonBackgroundColor, function1, SpacerKt.m302paddingqDBjuR0$default(companion, f6, 24.0f, f6, RecyclerView.DECELERATION_RATE, 8), gapComposer2, (i6 & 896) | ((i4 << 6) & 57344));
                GapComposer gapComposer5 = gapComposer2;
                InfoSheetFooter(loaded.footer, function1, SpacerKt.m299paddingVpY3zN4(companion, f6, 24.0f), gapComposer5, (i4 & 112) | (i6 & 7168));
                gapComposer = gapComposer5;
                gapComposer.end(false);
            }
            gapComposer.end(z4);
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(this, loaded, function1, i, 22);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.$r8$classId) {
            case 3:
                windowInsets.getClass();
                super.dispatchApplyWindowInsets(windowInsets);
                WindowInsets windowInsets2 = WindowInsetsCompat.CONSUMED.toWindowInsets();
                windowInsets2.getClass();
                return windowInsets2;
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareLoyaltyDetailsView(Context context, LocalizedMoneyFormatter.Factory factory) {
        super(context);
        this.$r8$classId = 4;
        context.getClass();
        this.imageLoader = factory;
    }

    public void Content(GenericTreeElementsViewModel genericTreeElementsViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1150776512);
        int i3 = (gapComposer.changedInstance(genericTreeElementsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (genericTreeElementsViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new GenericTreeElementsSheetView$$ExternalSyntheticLambda0(this, genericTreeElementsViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            i2 = i;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1741271691, new GenericTreeElementsSheetView$$ExternalSyntheticLambda0(genericTreeElementsViewModel, this, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new GenericTreeElementsSheetView$$ExternalSyntheticLambda0(this, genericTreeElementsViewModel, function1, i2, 2);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        switch (this.$r8$classId) {
            case 0:
                Content((SquareLoyaltyDetailsViewModel) obj, function1, gapComposer, 0);
                break;
            case 1:
                Content((AccountSwitcherViewModel) obj, function1, gapComposer, 0);
                break;
            case 2:
                Content((GenericTreeElementsViewModel) obj, function1, gapComposer, 0);
                break;
            case 3:
                Content((ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel) obj, function1, gapComposer, 0);
                break;
            default:
                Content((SingleUsePaymentCheckoutViewModel) obj, function1, gapComposer, 0);
                break;
        }
    }

    public void Content(final SquareLoyaltyDetailsViewModel squareLoyaltyDetailsViewModel, final Function1 function1, Composer composer, final int i) {
        SquareLoyaltyDetailsView squareLoyaltyDetailsView;
        SquareLoyaltyDetailsViewModel squareLoyaltyDetailsViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-502990755);
        int i3 = (gapComposer.changedInstance(squareLoyaltyDetailsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            squareLoyaltyDetailsView = this;
            squareLoyaltyDetailsViewModel2 = squareLoyaltyDetailsViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (squareLoyaltyDetailsViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, squareLoyaltyDetailsViewModel, function1, i, i4) { // from class: com.squareup.cash.merchant.views.SquareLoyaltyDetailsView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ SquareLoyaltyDetailsView f$0;
                        public final /* synthetic */ SquareLoyaltyDetailsViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            SquareLoyaltyDetailsViewModel squareLoyaltyDetailsViewModel3 = this.f$1;
                            SquareLoyaltyDetailsView squareLoyaltyDetailsView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    squareLoyaltyDetailsView2.Content(squareLoyaltyDetailsViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    squareLoyaltyDetailsView2.Content(squareLoyaltyDetailsViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i2 = i;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default("");
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ScrollState rememberScrollState = androidx.compose.foundation.ImageKt.rememberScrollState(gapComposer);
            String str = squareLoyaltyDetailsViewModel.toolbarTitle;
            if (str != null) {
                mutableState.setValue((rememberScrollState.value$delegate.getIntValue() > 0 || squareLoyaltyDetailsViewModel.alwaysShowToolbarTitle) ? str : "");
            }
            squareLoyaltyDetailsView = this;
            squareLoyaltyDetailsViewModel2 = squareLoyaltyDetailsViewModel;
            function12 = function1;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1154879768, new CashMapViewKt$$ExternalSyntheticLambda15(function1, squareLoyaltyDetailsView, squareLoyaltyDetailsViewModel2, rememberScrollState, mutableState), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = 1;
            final int i6 = i2;
            final Function1 function13 = function12;
            final SquareLoyaltyDetailsView squareLoyaltyDetailsView2 = squareLoyaltyDetailsView;
            final SquareLoyaltyDetailsViewModel squareLoyaltyDetailsViewModel3 = squareLoyaltyDetailsViewModel2;
            endRestartGroup2.block = new Function2(squareLoyaltyDetailsView2, squareLoyaltyDetailsViewModel3, function13, i6, i5) { // from class: com.squareup.cash.merchant.views.SquareLoyaltyDetailsView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ SquareLoyaltyDetailsView f$0;
                public final /* synthetic */ SquareLoyaltyDetailsViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = squareLoyaltyDetailsView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    SquareLoyaltyDetailsViewModel squareLoyaltyDetailsViewModel32 = this.f$1;
                    SquareLoyaltyDetailsView squareLoyaltyDetailsView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            squareLoyaltyDetailsView22.Content(squareLoyaltyDetailsViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            squareLoyaltyDetailsView22.Content(squareLoyaltyDetailsViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public void Content(AccountSwitcherViewModel accountSwitcherViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1223504899);
        int i2 = (gapComposer.changedInstance(accountSwitcherViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (accountSwitcherViewModel != null) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime((RealImageLoader) this.imageLoader), Expect_jvmKt.rememberComposableLambda(-1002006717, new AccountSwitcherView$$ExternalSyntheticLambda0(accountSwitcherViewModel, function1), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) this, (Object) accountSwitcherViewModel, function1, i, 26);
        }
    }

    public void Content(ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1563294882);
        int i2 = (gapComposer.changedInstance(shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel != null) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1810752547, new BulletedListShoppingInfoSheet$$ExternalSyntheticLambda0(this, shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel, function1), gapComposer), gapComposer, 6);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletedListShoppingInfoSheet$$ExternalSyntheticLambda0(this, shoppingInfoSheetViewModel$BulletedListInfoSheetViewModel, function1, i);
        }
    }
}
