package com.squareup.cash.account.components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.core.os.BundleKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.bugsnag.android.TombstoneEventEnhancer$invoke$2;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzade;
import com.google.crypto.tink.KeysetHandle;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.PaymentPadThemeOption;
import com.squareup.cash.account.settings.viewmodels.ThemeData;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleConfiguration;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.graphics.views.AnimationsKt;
import com.squareup.cash.graphics.views.effect.TortoiseCardEffectKt;
import com.squareup.cash.paymentpad.viewmodels.HypeConfig;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.paymentpad.views.HomeViewKt;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewKt;
import com.squareup.cash.payments.presenters.QuickPayPresenter$models$3$1;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda37;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class ThemeSwitcherViewKt {
    public static final long UNSELECTED_ICON_SIZE = BundleKt.m1091DpSizeYgX7TsA(65.0f, 84.0f);
    public static final long SELECTED_ICON_SIZE = BundleKt.m1091DpSizeYgX7TsA(87.0f, 112.0f);

    public static final void CircularRevealAnimation(Modifier modifier, Animatable animatable, Animatable animatable2, Animatable animatable3, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1305383349);
        int i2 = i | (gapComposer.changedInstance(animatable) ? 32 : 16) | (gapComposer.changedInstance(animatable2) ? 256 : 128) | (gapComposer.changedInstance(animatable3) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new MarkerKt$$ExternalSyntheticLambda2(27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SurfaceKt.m554SurfaceT9BRK9s(zzade.circularReveal(fillMaxSize, (Function1) rememberedValue, ((Number) animatable.getValue()).floatValue()), null, ColorKt.Color(255, 255, 255, 64), 0L, RecyclerView.DECELERATION_RATE, AccountToDoKt.lambda$442302124, gapComposer, 12583296, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MarkerKt$$ExternalSyntheticLambda2(28);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SurfaceKt.m554SurfaceT9BRK9s(zzade.circularReveal(fillMaxSize2, (Function1) rememberedValue2, ((Number) animatable2.getValue()).floatValue()), null, ColorKt.Color(128, 128, 128, 64), 0L, RecyclerView.DECELERATION_RATE, AccountToDoKt.lambda$791297763, gapComposer, 12583296, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MarkerKt$$ExternalSyntheticLambda2(29);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier circularReveal = zzade.circularReveal(fillMaxSize3, (Function1) rememberedValue3, ((Number) animatable3.getValue()).floatValue());
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            SurfaceKt.m554SurfaceT9BRK9s(circularReveal, null, Color.m675copywmQWz5c$default(0.5f, colors.surface.keypad.background, 14), 0L, RecyclerView.DECELERATION_RATE, AccountToDoKt.f102lambda$1294545052, gapComposer, 12582912, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(modifier, i, animatable, animatable2, animatable3, 8);
        }
    }

    public static final void ErrorContent(ThemeSwitcherViewModel.Error error, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1285459778);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(error) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            BiasAlignment biasAlignment = Alignment.Companion.TopCenter;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier align = boxScopeInstance.align(companion, biasAlignment);
            int i3 = i2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, align);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new AccountToDoKt$$ExternalSyntheticLambda0(17, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Countries.PageHeader(error.title, (Modifier) null, AccountToDoKt.f106lambda$1978615717, error.body, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            gapComposer.end(true);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier align2 = boxScopeInstance.align(SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2), Alignment.Companion.BottomCenter);
            boolean z2 = i4 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new AccountToDoKt$$ExternalSyntheticLambda0(18, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, align2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(678412279, new BalanceFeedKt$$ExternalSyntheticLambda9(error, 3), gapComposer), gapComposer, 1573248, 56);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(error, function12, i, 2);
        }
    }

    public static final void GlitterWipeAnimation(float f, float f2, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1774607195);
        int i2 = i | (gapComposer.changed(f) ? 4 : 2) | (gapComposer.changed(f2) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp, gapComposer);
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m1524boximpl(LottieCompositionSpec.RawRes.m1525constructorimpl(R.raw.glitter_wipe_sparkles)), null, null, null, null, null, gapComposer, 0, 62);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            LottieComposition lottieComposition = (LottieComposition) rememberLottieComposition.getValue();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            LottieAnimationKt.LottieAnimation(lottieComposition, ClipKt.clip(SizeKt.fillMaxSize(companion, 1.0f), new GenericShape(new PoolDetailsViewKt$$ExternalSyntheticLambda28(f2, i3))), false, false, null, RecyclerView.DECELERATION_RATE, 0, false, false, false, false, null, false, false, null, null, ContentScale.Companion.FillHeight, false, false, null, false, null, gapComposer, 0, 1572864, 0, 4128764);
            gapComposer = gapComposer;
            AndroidImageBitmap imageResource = ImageResources_androidKt.imageResource(gapComposer, R.drawable.glitter_wipe_tint);
            AndroidImageBitmap imageResource2 = ImageResources_androidKt.imageResource(gapComposer, R.drawable.glitter_wipe_shine);
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            boolean changed = gapComposer.changed(m3477toPx8Feqmps) | ((i2 & 14) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new OffsetKt$$ExternalSyntheticLambda0(m3477toPx8Feqmps, f, 2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(fillMaxSize, (Function1) rememberedValue);
            boolean changedInstance = gapComposer.changedInstance(imageResource) | gapComposer.changedInstance(imageResource2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CombinedModifier$$ExternalSyntheticLambda0(17, imageResource, imageResource2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CanvasKt.Canvas(0, gapComposer, graphicsLayer, (Function1) rememberedValue2);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda1(f, f2, modifier, i, 1);
        }
    }

    public static final void ThemeSelection(Modifier modifier, String str, MainPaymentPadViewModel mainPaymentPadViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1671660964);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(mainPaymentPadViewModel) ? 256 : 128);
        if ((i & 3072) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            int i5 = i4;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.component.titleBar.keypad.icon.pressed;
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = RippleKt.LocalRippleConfiguration;
            RippleConfiguration rippleConfiguration = (RippleConfiguration) gapComposer.consume(dynamicProvidableCompositionLocal);
            boolean changed = gapComposer.changed(rippleConfiguration);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                i3 = 2;
                rememberedValue = RippleConfiguration.m3399copyDxMtmZc$default(rippleConfiguration, j, null, 2);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                i3 = 2;
            }
            Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime((RippleConfiguration) rememberedValue), Expect_jvmKt.rememberComposableLambda(-308627608, new PoolCreateViewKt$$ExternalSyntheticLambda6(function1, str, i3), gapComposer), gapComposer, 56);
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MarkerKt$$ExternalSyntheticLambda2(24);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(fillMaxSize, (Function1) rememberedValue2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MarkerKt$$ExternalSyntheticLambda2(25);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier composed = PlatformKt.composed(clearAndSetSemantics, new TombstoneEventEnhancer$invoke$2((Function1) rememberedValue3, 2));
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, composed);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$1);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new MarkerKt$$ExternalSyntheticLambda2(26);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MainPaymentPadViewKt.MainPaymentPad(mainPaymentPadViewModel, (Function1) rememberedValue4, false, null, null, gapComposer, ((i5 >> 6) & 14) | 432, 24);
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(modifier, str, mainPaymentPadViewModel, function1, i, 16);
        }
    }

    public static final void ThemeSwitcher(ThemeSwitcherViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        Applier applier;
        int i2;
        Object Animatable;
        ArrayList<ThemeData> arrayList;
        Animatable animatable;
        Animatable animatable2;
        int i3;
        BiasAlignment biasAlignment;
        MainPaymentPadViewModel mainPaymentPadViewModel;
        PaymentPadTheme paymentPadTheme;
        int i4;
        PaymentPadTheme paymentPadTheme2;
        Animatable animatable3;
        Animatable animatable4;
        Animatable animatable5;
        Animatable animatable6;
        Animatable animatable7;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        boolean z;
        Modifier.Companion companion;
        float f;
        Modifier zIndex;
        Animatable animatable8;
        boolean z2;
        Animatable animatable9;
        GapComposer gapComposer2;
        Modifier zIndex2;
        int i5;
        PaymentPadThemeOption paymentPadThemeOption;
        boolean z3;
        int i6;
        int i7;
        Modifier modifier;
        boolean z4;
        BiasAlignment biasAlignment2 = Alignment.Companion.TopStart;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1065306316);
        Applier applier2 = gapComposer3.applier;
        int i8 = (i & 6) == 0 ? i | (gapComposer3.changedInstance(loaded) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i8 |= gapComposer3.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer3.shouldExecute(i8 & 1, (i8 & 19) != 18)) {
            PaymentPadTheme paymentPadTheme3 = loaded.selectedTheme;
            ArrayList arrayList2 = loaded.themeData;
            boolean z5 = loaded.showBratHype;
            boolean z6 = loaded.animate;
            PaymentPadTheme paymentPadTheme4 = loaded.previousTheme;
            PaymentPadTheme paymentPadTheme5 = loaded.selectedTheme;
            ChromeConfigKt.ChromeConfig(null, HomeViewKt.systemIconColors(paymentPadTheme3), ChromeSystemIconColor.ALWAYS_LIGHT, null, null, null, null, gapComposer3, MLKEMEngine.KyberPolyBytes, 121);
            boolean changed = gapComposer3.changed(paymentPadTheme4 == null ? -1 : paymentPadTheme4.ordinal());
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = paymentPadTheme4 != null ? createPaymentPadTheme(paymentPadTheme4, z5) : null;
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            MainPaymentPadViewModel mainPaymentPadViewModel2 = (MainPaymentPadViewModel) rememberedValue;
            boolean changed2 = gapComposer3.changed(paymentPadTheme5.ordinal()) | gapComposer3.changed(z5);
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = createPaymentPadTheme(paymentPadTheme5, z5);
                gapComposer3.updateRememberedValue(rememberedValue2);
            }
            MainPaymentPadViewModel mainPaymentPadViewModel3 = (MainPaymentPadViewModel) rememberedValue2;
            boolean changed3 = gapComposer3.changed(paymentPadTheme5.ordinal());
            Object rememberedValue3 = gapComposer3.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = AnimatableKt.Animatable(1.0f, 0.01f);
                gapComposer3.updateRememberedValue(rememberedValue3);
            }
            Animatable animatable10 = (Animatable) rememberedValue3;
            boolean changed4 = gapComposer3.changed(paymentPadTheme5.ordinal());
            Object rememberedValue4 = gapComposer3.rememberedValue();
            if (changed4 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = AnimatableKt.Animatable(1.5f, 0.01f);
                gapComposer3.updateRememberedValue(rememberedValue4);
            }
            Animatable animatable11 = (Animatable) rememberedValue4;
            boolean changed5 = gapComposer3.changed(paymentPadTheme5.ordinal());
            Object rememberedValue5 = gapComposer3.rememberedValue();
            if (changed5 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = AnimatableKt.Animatable(1.0f, 0.01f);
                gapComposer3.updateRememberedValue(rememberedValue5);
            }
            Animatable animatable12 = (Animatable) rememberedValue5;
            boolean changed6 = gapComposer3.changed(paymentPadTheme5.ordinal());
            Object rememberedValue6 = gapComposer3.rememberedValue();
            if (changed6 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer3.updateRememberedValue(rememberedValue6);
            }
            Animatable animatable13 = (Animatable) rememberedValue6;
            boolean changed7 = gapComposer3.changed(paymentPadTheme5.ordinal());
            Object rememberedValue7 = gapComposer3.rememberedValue();
            if (changed7 || rememberedValue7 == neverEqualPolicy) {
                applier = applier2;
                Animatable Animatable2 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer3.updateRememberedValue(Animatable2);
                rememberedValue7 = Animatable2;
            } else {
                applier = applier2;
            }
            Animatable animatable14 = (Animatable) rememberedValue7;
            boolean changed8 = gapComposer3.changed(paymentPadTheme5.ordinal());
            Object rememberedValue8 = gapComposer3.rememberedValue();
            if (changed8 || rememberedValue8 == neverEqualPolicy) {
                i2 = i8;
                Animatable Animatable3 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer3.updateRememberedValue(Animatable3);
                rememberedValue8 = Animatable3;
            } else {
                i2 = i8;
            }
            Animatable animatable15 = (Animatable) rememberedValue8;
            boolean changed9 = gapComposer3.changed(paymentPadTheme5.ordinal());
            Object rememberedValue9 = gapComposer3.rememberedValue();
            if (changed9 || rememberedValue9 == neverEqualPolicy) {
                Animatable = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer3.updateRememberedValue(Animatable);
            } else {
                Animatable = rememberedValue9;
            }
            Animatable animatable16 = (Animatable) Animatable;
            boolean changedInstance = gapComposer3.changedInstance(loaded) | gapComposer3.changedInstance(animatable10) | gapComposer3.changedInstance(animatable12) | gapComposer3.changedInstance(animatable13);
            int i9 = i2 & 112;
            boolean changedInstance2 = changedInstance | (i9 == 32) | gapComposer3.changedInstance(animatable14) | gapComposer3.changedInstance(animatable15) | gapComposer3.changedInstance(animatable16) | gapComposer3.changedInstance(animatable11);
            Object rememberedValue10 = gapComposer3.rememberedValue();
            if (changedInstance2 || rememberedValue10 == neverEqualPolicy) {
                arrayList = arrayList2;
                animatable = animatable11;
                animatable2 = animatable14;
                i3 = i9;
                biasAlignment = biasAlignment2;
                mainPaymentPadViewModel = mainPaymentPadViewModel2;
                paymentPadTheme = paymentPadTheme4;
                i4 = 0;
                paymentPadTheme2 = paymentPadTheme5;
                animatable3 = animatable13;
                QuickPayPresenter$models$3$1 quickPayPresenter$models$3$1 = new QuickPayPresenter$models$3$1(loaded, animatable10, animatable12, animatable3, function1, animatable2, animatable15, animatable16, animatable, (Continuation) null);
                animatable4 = animatable15;
                animatable5 = animatable16;
                animatable6 = animatable10;
                animatable7 = animatable12;
                gapComposer3.updateRememberedValue(quickPayPresenter$models$3$1);
                rememberedValue10 = quickPayPresenter$models$3$1;
            } else {
                animatable5 = animatable16;
                animatable4 = animatable15;
                arrayList = arrayList2;
                i3 = i9;
                biasAlignment = biasAlignment2;
                mainPaymentPadViewModel = mainPaymentPadViewModel2;
                paymentPadTheme = paymentPadTheme4;
                i4 = 0;
                animatable3 = animatable13;
                animatable6 = animatable10;
                animatable = animatable11;
                paymentPadTheme2 = paymentPadTheme5;
                animatable2 = animatable14;
                animatable7 = animatable12;
            }
            Updater.LaunchedEffect(gapComposer3, paymentPadTheme, (Function2) rememberedValue10);
            int i10 = Color.$r8$clinit;
            long j = Color.Black;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(companion2, j, rectangleShapeKt$RectangleShape$1)), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, i4);
            Animatable animatable17 = animatable3;
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$15);
            if (paymentPadTheme2 == PaymentPadTheme.GREEN) {
                gapComposer3.startReplaceGroup(1937010547);
                boolean isSystemInDarkTheme = ImageKt.isSystemInDarkTheme(gapComposer3);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                gapComposer3.end(false);
                z = isSystemInDarkTheme;
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                gapComposer3.startReplaceGroup(-82213950);
                gapComposer3.end(false);
                z = false;
            }
            final long j2 = Strings.getColors(gapComposer3).component.ui.divider.border;
            Strings.getSizes(gapComposer3).getClass();
            KeysetHandle keysetHandle = DefaultSizes.border;
            Animatable animatable18 = animatable4;
            Object obj = keysetHandle.entries;
            final float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(24.0f, gapComposer3);
            Strings.getSizes(gapComposer3).getClass();
            Object obj2 = keysetHandle.annotationsMap;
            final float m3477toPx8Feqmps2 = DensityUtilsKt.m3477toPx8Feqmps(2.0f, gapComposer3);
            Animatable animatable19 = animatable2;
            PaymentPadTheme paymentPadTheme6 = paymentPadTheme;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            Animatable animatable20 = animatable6;
            PaymentPadTheme paymentPadTheme7 = paymentPadTheme2;
            final boolean z7 = z;
            Animatable animatable21 = animatable7;
            Animatable animatable22 = animatable;
            final State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? m3477toPx8Feqmps2 : RecyclerView.DECELERATION_RATE, AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, EasingFunctionsKt.EaseOutCirc, 2), "Dark Payment Pad Bottom Border", null, gapComposer3, 3072, 20);
            if (0.8f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(0.8f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.8f, true);
            boolean changed10 = gapComposer3.changed(z7) | gapComposer3.changed(m3477toPx8Feqmps2) | gapComposer3.changed(m3477toPx8Feqmps) | gapComposer3.changed(animateFloatAsState) | gapComposer3.changed(j2);
            Object rememberedValue11 = gapComposer3.rememberedValue();
            if (changed10 || rememberedValue11 == neverEqualPolicy) {
                rememberedValue11 = new Function1() { // from class: com.squareup.cash.account.components.ThemeSwitcherViewKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        DrawScope drawScope = (DrawScope) obj3;
                        drawScope.getClass();
                        if (z7) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) + m3477toPx8Feqmps2;
                            float f2 = m3477toPx8Feqmps;
                            float f3 = 2.0f * f2;
                            long floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(intBitsToFloat - f3) & BodyPartID.bodyIdMax);
                            Stroke stroke = new Stroke(((Number) animateFloatAsState.getValue()).floatValue(), RecyclerView.DECELERATION_RATE, 0, 0, null, 30);
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax);
                            long floatToRawIntBits3 = Float.floatToRawIntBits(f2);
                            DrawScope.m749drawRoundRectuAw5IA$default(drawScope, j2, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (floatToRawIntBits3 << 32), stroke, 224);
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer3.updateRememberedValue(rememberedValue11);
            }
            Modifier drawBehind = ClipKt.drawBehind(layoutWeightElement, (Function1) rememberedValue11);
            Strings.getSizes(gapComposer3).getClass();
            Object obj3 = keysetHandle.entries;
            Strings.getSizes(gapComposer3).getClass();
            Object obj4 = keysetHandle.entries;
            Modifier clip = ClipKt.clip(drawBehind, RoundedCornerShapeKt.m342RoundedCornerShapea9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3));
            BiasAlignment biasAlignment3 = biasAlignment;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment3, false);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, clip);
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$14, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            PaymentPadTheme paymentPadTheme8 = PaymentPadTheme.GLITTER;
            if (paymentPadTheme6 == paymentPadTheme8 || paymentPadTheme7 == paymentPadTheme8) {
                gapComposer3.startReplaceGroup(428477684);
                if (z6 && paymentPadTheme7 == paymentPadTheme8) {
                    companion = companion2;
                    f = 2.0f;
                    zIndex = ClipKt.clip(ZIndexModifierKt.zIndex(companion, 2.0f), new GenericShape(new PoolDetailsViewKt$$ExternalSyntheticLambda28(((Number) animatable22.getValue()).floatValue(), 1)));
                } else {
                    companion = companion2;
                    f = 2.0f;
                    zIndex = ZIndexModifierKt.zIndex(companion, paymentPadTheme7 == paymentPadTheme8 ? 2.0f : 0.0f);
                }
                AnimationsKt.GlitterBackground(0, 0, gapComposer3, zIndex);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(428929354);
                gapComposer3.end(false);
                companion = companion2;
                f = 2.0f;
            }
            PaymentPadTheme paymentPadTheme9 = PaymentPadTheme.TORTOISE;
            boolean z8 = paymentPadTheme7 == paymentPadTheme9;
            if (paymentPadTheme6 == paymentPadTheme9 || z8) {
                gapComposer3.startReplaceGroup(429087857);
                AndroidImageBitmap imageResource = ImageResources_androidKt.imageResource(gapComposer3, R.drawable.tortoise_wipe_tint);
                float m3477toPx8Feqmps3 = DensityUtilsKt.m3477toPx8Feqmps(((Configuration) gapComposer3.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp, gapComposer3);
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(ZIndexModifierKt.zIndex(companion, z8 ? f : 0.0f), 1.0f);
                animatable8 = animatable21;
                boolean changedInstance3 = gapComposer3.changedInstance(imageResource) | gapComposer3.changed(m3477toPx8Feqmps3) | gapComposer3.changedInstance(animatable8);
                Object rememberedValue12 = gapComposer3.rememberedValue();
                if (changedInstance3 || rememberedValue12 == neverEqualPolicy) {
                    rememberedValue12 = new ThumbNode$$ExternalSyntheticLambda0(imageResource, m3477toPx8Feqmps3, animatable8, 5);
                    gapComposer3.updateRememberedValue(rememberedValue12);
                }
                Modifier drawWithContent = ClipKt.drawWithContent(fillMaxSize2, (Function1) rememberedValue12);
                z2 = false;
                TortoiseCardEffectKt.TortoiseBackground(0, 0, gapComposer3, ClipKt.clip(drawWithContent, (z8 && z6) ? new GenericShape(new PoolDetailsViewKt$$ExternalSyntheticLambda28(((Number) animatable22.getValue()).floatValue(), 1)) : rectangleShapeKt$RectangleShape$1));
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(430126698);
                z2 = false;
                gapComposer3.end(false);
                animatable8 = animatable21;
            }
            if (paymentPadTheme6 == null) {
                gapComposer3.startReplaceGroup(430191332);
                gapComposer3.end(z2);
                animatable9 = animatable8;
            } else {
                gapComposer3.startReplaceGroup(430191333);
                boolean z9 = false;
                Object obj5 = null;
                for (Object obj6 : arrayList) {
                    if (((ThemeData) obj6).theme == paymentPadTheme6) {
                        if (z9) {
                            a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                            return;
                        } else {
                            obj5 = obj6;
                            z9 = true;
                        }
                    }
                }
                if (!z9) {
                    OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                    return;
                }
                ThemeData themeData = (ThemeData) obj5;
                animatable9 = animatable8;
                ArcadeThemeKt.ArcadeTheme(HomeViewKt.colors(themeData.theme, gapComposer3), null, null, Expect_jvmKt.rememberComposableLambda(-1591774538, new MenuPickerSheetKt$$ExternalSyntheticLambda4(17, themeData, mainPaymentPadViewModel), gapComposer3), gapComposer3, 3072, 6);
                gapComposer3.end(false);
            }
            if (!z6 || paymentPadTheme7 == PaymentPadTheme.GLITTER || paymentPadTheme7 == PaymentPadTheme.TORTOISE) {
                gapComposer2 = gapComposer3;
                gapComposer2.startReplaceGroup(430933194);
                gapComposer2.end(false);
            } else {
                gapComposer3.startReplaceGroup(430667958);
                ArcadeThemeKt.ArcadeTheme(HomeViewKt.colors(paymentPadTheme7, gapComposer3), null, null, Expect_jvmKt.rememberComposableLambda(-1134506662, new Yoga$$ExternalSyntheticLambda7(25, animatable17, animatable19, animatable18), gapComposer3), gapComposer3, 3072, 6);
                gapComposer2 = gapComposer3;
                gapComposer2.end(false);
            }
            if (z6 && paymentPadTheme7 != PaymentPadTheme.GLITTER && paymentPadTheme7 != PaymentPadTheme.TORTOISE) {
                gapComposer2.startReplaceGroup(431078584);
                Modifier zIndex3 = ZIndexModifierKt.zIndex(companion, f);
                Object rememberedValue13 = gapComposer2.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = new ActivityTabViewKt$$ExternalSyntheticLambda17(2);
                    gapComposer2.updateRememberedValue(rememberedValue13);
                }
                zIndex2 = zzade.circularReveal(zIndex3, (Function1) rememberedValue13, ((Number) animatable5.getValue()).floatValue());
                gapComposer2.end(false);
            } else if (z6) {
                gapComposer2.startReplaceGroup(431309100);
                gapComposer2.end(false);
                zIndex2 = ClipKt.clip(ZIndexModifierKt.zIndex(companion, f), new GenericShape(new PoolDetailsViewKt$$ExternalSyntheticLambda28(((Number) animatable22.getValue()).floatValue(), 1)));
            } else {
                gapComposer2.startReplaceGroup(431437781);
                gapComposer2.end(false);
                zIndex2 = ZIndexModifierKt.zIndex(companion, f);
            }
            Modifier modifier2 = zIndex2;
            boolean z10 = false;
            Object obj7 = null;
            for (Object obj8 : arrayList) {
                if (((ThemeData) obj8).theme == paymentPadTheme7) {
                    if (z10) {
                        a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                        return;
                    } else {
                        obj7 = obj8;
                        z10 = true;
                    }
                }
            }
            if (!z10) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                return;
            }
            ThemeData themeData2 = (ThemeData) obj7;
            gapComposer = gapComposer2;
            function12 = function1;
            ArcadeThemeKt.ArcadeTheme(HomeViewKt.colors(themeData2.theme, gapComposer2), null, null, Expect_jvmKt.rememberComposableLambda(-298541747, new DismissableToastKt$$ExternalSyntheticLambda4(modifier2, themeData2, mainPaymentPadViewModel3, function1, 9), gapComposer2), gapComposer, 3072, 6);
            if (!z6 || paymentPadTheme6 == null) {
                gapComposer.startReplaceGroup(432652330);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(431946956);
                if (paymentPadTheme7 == PaymentPadTheme.PINK) {
                    gapComposer.startReplaceGroup(431972159);
                    z4 = false;
                    AccountToDoKt.PinkThemeSparkles(SizeKt.fillMaxSize(ZIndexModifierKt.zIndex(companion, f), 1.0f).then(modifier2), false, RecyclerView.DECELERATION_RATE, gapComposer, 0);
                    gapComposer.end(false);
                } else if (paymentPadTheme7 == PaymentPadTheme.GLITTER) {
                    gapComposer.startReplaceGroup(432185749);
                    GlitterWipeAnimation(((Number) animatable20.getValue()).floatValue(), ((Number) animatable22.getValue()).floatValue(), SizeKt.fillMaxSize(ZIndexModifierKt.zIndex(companion, f), 1.0f), gapComposer, MLKEMEngine.KyberPolyBytes);
                    z4 = false;
                    gapComposer.end(false);
                } else if (paymentPadTheme7 == PaymentPadTheme.TORTOISE) {
                    gapComposer.startReplaceGroup(432469492);
                    TortoiseWipeAnimation(((Number) animatable9.getValue()).floatValue(), 48, gapComposer, SizeKt.fillMaxSize(ZIndexModifierKt.zIndex(companion, f), 1.0f));
                    z4 = false;
                    gapComposer.end(false);
                } else {
                    z4 = false;
                    gapComposer.startReplaceGroup(432644394);
                    gapComposer.end(false);
                }
                gapComposer.end(z4);
            }
            gapComposer.end(true);
            if (0.2f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier scroll$default = ImageKt.scroll$default(SizeKt.fillMaxWidth(new LayoutWeightElement(0.2f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.2f, true), 1.0f), ImageKt.rememberScrollState(gapComposer), true, false);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, scroll$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            gapComposer.startReplaceGroup(-441446420);
            for (ThemeData themeData3 : arrayList) {
                PaymentPadTheme paymentPadTheme10 = themeData3.theme;
                boolean z11 = themeData3.locked;
                int ordinal = paymentPadTheme10.ordinal();
                if (ordinal == 0) {
                    i5 = 4;
                    paymentPadThemeOption = new PaymentPadThemeOption(R.drawable.green_theme_selected, R.drawable.green_theme);
                } else if (ordinal == 1) {
                    i5 = 4;
                    paymentPadThemeOption = new PaymentPadThemeOption(R.drawable.black_theme_selected, R.drawable.black_theme);
                } else if (ordinal == 2) {
                    i5 = 4;
                    paymentPadThemeOption = new PaymentPadThemeOption(R.drawable.pink_theme_selected, R.drawable.pink_theme);
                } else if (ordinal != 3) {
                    i5 = 4;
                    if (ordinal == 4) {
                        paymentPadThemeOption = new PaymentPadThemeOption(R.drawable.tortoise_theme_selected, R.drawable.tortoise_theme);
                    } else {
                        if (ordinal != 5) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        paymentPadThemeOption = new PaymentPadThemeOption(R.drawable.brat_theme_selected, R.drawable.brat_theme);
                    }
                } else {
                    i5 = 4;
                    paymentPadThemeOption = new PaymentPadThemeOption(R.drawable.glitter_theme_selected, R.drawable.glitter_theme);
                }
                boolean z12 = paymentPadTheme7 == paymentPadTheme10;
                Drawable drawableCompat = z12 ? PlatformKt.getDrawableCompat(context, paymentPadThemeOption.selectedIcon, null) : PlatformKt.getDrawableCompat(context, paymentPadThemeOption.unselectedIcon, null);
                if (z6) {
                    gapComposer.startReplaceGroup(-132419015);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 8.0f);
                    gapComposer.end(false);
                    i7 = 3;
                    modifier = m298padding3ABfNKs;
                    z3 = z12;
                    i6 = i3;
                } else {
                    gapComposer.startReplaceGroup(-132313057);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(companion, 8.0f);
                    Object rememberedValue14 = gapComposer.rememberedValue();
                    if (rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue14;
                    Role role = new Role(0);
                    z3 = z12;
                    i6 = i3;
                    boolean changed11 = (i6 == 32) | gapComposer.changed(paymentPadTheme10.ordinal());
                    Object rememberedValue15 = gapComposer.rememberedValue();
                    if (changed11 || rememberedValue15 == neverEqualPolicy) {
                        rememberedValue15 = new BalanceFeedKt$$ExternalSyntheticLambda5(i5, function12, paymentPadTheme10);
                        gapComposer.updateRememberedValue(rememberedValue15);
                    }
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m298padding3ABfNKs2, mutableInteractionSourceImpl, null, false, "preview theme", role, (Function0) rememberedValue15, 4);
                    boolean changedInstance4 = gapComposer.changedInstance(loaded) | gapComposer.changed(paymentPadTheme10.ordinal()) | gapComposer.changed(z11);
                    Object rememberedValue16 = gapComposer.rememberedValue();
                    if (changedInstance4 || rememberedValue16 == neverEqualPolicy) {
                        i7 = 3;
                        rememberedValue16 = new DialogHostKt$$ExternalSyntheticLambda2(paymentPadTheme10, loaded, z11, i7);
                        gapComposer.updateRememberedValue(rememberedValue16);
                    } else {
                        i7 = 3;
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(m182clickableO2vRcR0$default, false, (Function1) rememberedValue16);
                    gapComposer.end(false);
                    modifier = semantics;
                }
                long j3 = z3 ? SELECTED_ICON_SIZE : UNSELECTED_ICON_SIZE;
                Drawable drawable = drawableCompat;
                int i11 = i6;
                Modifier m286size6HolHcs = SizeKt.m286size6HolHcs(BundleKt.m1091DpSizeYgX7TsA(((Dp) AnimateAsStateKt.m155animateDpAsStateAjpBEmI(DpSize.m1044getWidthD9Ej5fM(j3), null, "iconSize.width", null, gapComposer, 0, 10).getValue()).value, ((Dp) AnimateAsStateKt.m155animateDpAsStateAjpBEmI(DpSize.m1043getHeightD9Ej5fM(j3), null, "iconSize.height", null, gapComposer, 0, 10).getValue()).value), modifier);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment3, false);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m286size6HolHcs);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                GapComposer gapComposer4 = gapComposer;
                ImageKt.Image(DrawablePainterKt.rememberDrawablePainter(drawable, gapComposer), null, SizeKt.fillMaxSize(companion, 1.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, Painter.$stable | 432, 120);
                gapComposer = gapComposer4;
                if (z11) {
                    gapComposer.startReplaceGroup(1153501603);
                    Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center);
                    Icons icons = Icons.LockLockedFill24;
                    int i12 = Color.$r8$clinit;
                    Trace.m1191Iconww6aTOc(icons, (String) null, align, Color.White, gapComposer, 3126, 0);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1153704746);
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                i3 = i11;
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, true);
        } else {
            function12 = function1;
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(loaded, function12, i, 1);
        }
    }

    public static final void TortoiseWipeAnimation(float f, int i, Composer composer, Modifier modifier) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(610994527);
        int i2 = (gapComposer.changed(f) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp, gapComposer);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            AndroidImageBitmap imageResource = ImageResources_androidKt.imageResource(gapComposer, R.drawable.glitter_wipe_shine);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = ((i2 & 14) == 4) | gapComposer.changed(m3477toPx8Feqmps);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new OffsetKt$$ExternalSyntheticLambda0(m3477toPx8Feqmps, f, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(fillMaxSize, (Function1) rememberedValue);
            boolean changedInstance = gapComposer.changedInstance(imageResource);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new xg$$ExternalSyntheticLambda9(imageResource, 25);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CanvasKt.Canvas(0, gapComposer, graphicsLayer, (Function1) rememberedValue2);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda37(f, modifier, i, 1);
        }
    }

    public static final MainPaymentPadViewModel createPaymentPadTheme(PaymentPadTheme paymentPadTheme, boolean z) {
        return new MainPaymentPadViewModel("0", CurrencyCode.USD, null, null, null, false, false, false, false, paymentPadTheme, (paymentPadTheme == PaymentPadTheme.BRAT && z) ? new HypeConfig(true, null) : null, false, null);
    }
}
