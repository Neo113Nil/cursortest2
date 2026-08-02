package com.squareup.cash.paymentpad.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import app.cash.trifle.Trifle;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda3;
import com.squareup.cash.paymentpad.viewmodels.ExchangeRatePreview;
import com.squareup.cash.paymentpad.viewmodels.HomeViewModel;
import com.squareup.cash.paymentpad.viewmodels.LitePaymentPadViewModel;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class HomeViewKt {

    /* renamed from: lambda$-847551014, reason: not valid java name */
    public static final ComposableLambdaImpl f544lambda$847551014 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(12), false, -847551014);
    public static final ComposableLambdaImpl lambda$845028921 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(13), false, 845028921);

    /* renamed from: ExchangeRatePreviewText-iJQMabo, reason: not valid java name */
    public static final void m3700ExchangeRatePreviewTextiJQMabo(ExchangeRatePreview exchangeRatePreview, long j, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1958130092);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(exchangeRatePreview) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(companion, 48.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean changedInstance = gapComposer.changedInstance(exchangeRatePreview);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(exchangeRatePreview, 9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(SemanticsModifierKt.semantics(m279heightInVpY3zN4$default, true, (Function1) rememberedValue), exchangeRatePreview.enabled, null, new Role(0), function0, 10);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 3, (i2 << 6) & 7168, 0, 3826, j, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, exchangeRatePreview.text, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayPaymentKt$$ExternalSyntheticLambda3(i, 10, j, exchangeRatePreview, function0);
        }
    }

    public static final void HomeView(HomeViewModel homeViewModel, Function1 function1, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, ElementBoundsRegistry elementBoundsRegistry, SplashScreenAnimationObserver splashScreenAnimationObserver, boolean z, Composer composer, int i) {
        int i2;
        homeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(21135740);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(homeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(elementBoundsRegistry) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(splashScreenAnimationObserver) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(404762105, new HomeViewKt$$ExternalSyntheticLambda0(homeViewModel.getMainPaymentPad().paymentPadTheme, realImageLoader, realCashVibrator, function1, homeViewModel, z, splashScreenAnimationObserver, elementBoundsRegistry), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(homeViewModel, function1, realImageLoader, realCashVibrator, elementBoundsRegistry, splashScreenAnimationObserver, z, i, 5);
        }
    }

    public static final void LitePaymentPad(LitePaymentPadViewModel litePaymentPadViewModel, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        litePaymentPadViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(763716005);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(litePaymentPadViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(colors(PaymentPadTheme.GREEN, gapComposer), null, null, Expect_jvmKt.rememberComposableLambda(-2019504784, new TabContentViewKt$$ExternalSyntheticLambda26(litePaymentPadViewModel, z, function1, 28), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(litePaymentPadViewModel, z, function1, i, 18);
        }
    }

    /* renamed from: addLuminance-DxMtmZc, reason: not valid java name */
    public static final long m3701addLuminanceDxMtmZc(long j, float f) {
        if (j == 16) {
            return j;
        }
        float[] fArr = {0.0f, 0.0f, r2};
        ColorUtils.colorToHSL(ColorKt.m694toArgb8_81llA(j), fArr);
        float f2 = fArr[2] + f;
        RangesKt___RangesKt.coerceIn(f2, RecyclerView.DECELERATION_RATE, 1.0f);
        int i = Color.$r8$clinit;
        return Trifle.m1424hslJlNiLsg$default(fArr[0], fArr[1], fArr[2], Color.m677getAlphaimpl(j));
    }

    public static final Colors colors(PaymentPadTheme paymentPadTheme, Composer composer) {
        paymentPadTheme.getClass();
        int ordinal = paymentPadTheme.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                        if (ordinal != 5) {
                            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -478974874, false);
                        }
                    }
                }
            }
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-478967314);
            Colors themed = themed(ColorsDarkKt.colorsDark, paymentPadTheme, ImageKt.isSystemInDarkTheme(gapComposer));
            gapComposer.end(false);
            return themed;
        }
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-478971666);
        Colors themed2 = themed(ColorsLightKt.colorsLight, paymentPadTheme, ImageKt.isSystemInDarkTheme(gapComposer2));
        gapComposer2.end(false);
        return themed2;
    }

    public static final ChromeSystemIconColor systemIconColors(PaymentPadTheme paymentPadTheme) {
        paymentPadTheme.getClass();
        int ordinal = paymentPadTheme.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                        if (ordinal != 5) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                }
            }
            return ChromeSystemIconColor.ALWAYS_LIGHT;
        }
        return ChromeSystemIconColor.ALWAYS_DARK;
    }

    public static final Colors themed(Colors colors, PaymentPadTheme paymentPadTheme, boolean z) {
        int ordinal = paymentPadTheme.ordinal();
        if (ordinal == 0) {
            Colors.Component component = colors.component;
            Colors.Base base = colors.base;
            long j = base.constantBlack;
            Colors.Component.BottomNavigation bottomNavigation = component.bottomNavigation;
            Colors.Component.BottomNavigation.Keypad keypad = bottomNavigation.keypad;
            Colors.Component.BottomNavigation m3097copy3JVO9M$default = Colors.Component.BottomNavigation.m3097copy3JVO9M$default(bottomNavigation, new Colors.Component.BottomNavigation.Keypad(keypad.background, new Colors.Component.BottomNavigation.Keypad.Icon(Color.m675copywmQWz5c$default(0.45f, j, 14), j), keypad.text));
            Colors.Component.Button button = component.button;
            Colors.Component.Button.Standard standard = button.standard;
            Colors.Component.Button copy$default = Colors.Component.Button.copy$default(button, null, new Colors.Component.Button.Standard(Colors.Component.Button.Standard.Background.m3117copyysEtTa8$default(standard.background, Color.m675copywmQWz5c$default(0.1f, j, 14), Color.m675copywmQWz5c$default(0.15f, j, 14), 2), standard.icon, standard.text), 11);
            Colors.Component.TitleBar titleBar = component.titleBar;
            Colors.Component copy$default2 = Colors.Component.copy$default(component, m3097copy3JVO9M$default, copy$default, null, null, null, null, Colors.Component.TitleBar.m3279copy0Hk2hKA$default(titleBar, new Colors.Component.TitleBar.Keypad(titleBar.keypad.background, new Colors.Component.TitleBar.Keypad.Icon(j, Color.m675copywmQWz5c$default(0.7f, j, 14)))), 130023411);
            Colors.Surface surface = colors.surface;
            return Colors.copy$default(colors, copy$default2, new Colors.Surface(Colors.Surface.Keypad.m3359copynb2GgbA$default(surface.keypad, z ? ColorKt.Color(-16732657) : base.brandCashGreen, 0L, colors.semantic.text.standard, 6), surface.money), 39);
        }
        if (ordinal == 1) {
            return colors;
        }
        if (ordinal == 2) {
            Colors.Component component2 = colors.component;
            long j2 = colors.base.constantBlack;
            Colors.Component.BottomNavigation bottomNavigation2 = component2.bottomNavigation;
            Colors.Component.BottomNavigation.Keypad keypad2 = bottomNavigation2.keypad;
            Colors.Component.BottomNavigation m3097copy3JVO9M$default2 = Colors.Component.BottomNavigation.m3097copy3JVO9M$default(bottomNavigation2, new Colors.Component.BottomNavigation.Keypad(keypad2.background, new Colors.Component.BottomNavigation.Keypad.Icon(Color.m675copywmQWz5c$default(0.45f, j2, 14), j2), keypad2.text));
            Colors.Component.Button button2 = component2.button;
            Colors.Component.Button.Standard standard2 = button2.standard;
            Colors.Component.Button copy$default3 = Colors.Component.Button.copy$default(button2, null, new Colors.Component.Button.Standard(Colors.Component.Button.Standard.Background.m3117copyysEtTa8$default(standard2.background, Color.m675copywmQWz5c$default(0.1f, j2, 14), Color.m675copywmQWz5c$default(0.15f, j2, 14), 2), standard2.icon, standard2.text), 11);
            Colors.Component.TitleBar titleBar2 = component2.titleBar;
            Colors.Component copy$default4 = Colors.Component.copy$default(component2, m3097copy3JVO9M$default2, copy$default3, null, null, null, null, Colors.Component.TitleBar.m3279copy0Hk2hKA$default(titleBar2, new Colors.Component.TitleBar.Keypad(titleBar2.keypad.background, new Colors.Component.TitleBar.Keypad.Icon(j2, Color.m675copywmQWz5c$default(0.7f, j2, 14)))), 130023411);
            Colors.Surface surface2 = colors.surface;
            Colors.Surface.Keypad keypad3 = surface2.keypad;
            long Color = z ? ColorKt.Color(4293001338L) : ColorKt.Color(4294312069L);
            Colors.Semantic semantic = colors.semantic;
            return Colors.copy$default(colors, copy$default4, new Colors.Surface(Colors.Surface.Keypad.m3359copynb2GgbA$default(keypad3, Color, semantic.icon.standard, semantic.text.standard, 2), surface2.money), 39);
        }
        if (ordinal == 3) {
            Colors.Component component3 = colors.component;
            Colors.Component.Button button3 = component3.button;
            Colors.Base base2 = colors.base;
            long j3 = base2.constantBlack;
            long j4 = base2.constantWhite;
            Colors.Component.BottomNavigation bottomNavigation3 = component3.bottomNavigation;
            Colors.Component.BottomNavigation.Keypad keypad4 = bottomNavigation3.keypad;
            Colors.Component.BottomNavigation m3097copy3JVO9M$default3 = Colors.Component.BottomNavigation.m3097copy3JVO9M$default(bottomNavigation3, new Colors.Component.BottomNavigation.Keypad(keypad4.background, new Colors.Component.BottomNavigation.Keypad.Icon(Color.m675copywmQWz5c$default(0.45f, j4, 14), j4), keypad4.text));
            Colors.Component.Button.Prominent prominent = new Colors.Component.Button.Prominent(Colors.Component.Button.Prominent.Background.m3113copyjRlVdoo$default(button3.prominent.background, ColorKt.Color(4278255581L), 0L, m3701addLuminanceDxMtmZc(ColorKt.Color(4278255581L), -0.2f), 10), new Colors.Component.Button.Prominent.Icon(j3, button3.prominent.icon.disabled), Colors.Component.Button.Prominent.Text.m3115copyysEtTa8$default(button3.prominent.text, j3));
            Colors.Component.Button.Standard.Background m3117copyysEtTa8$default = Colors.Component.Button.Standard.Background.m3117copyysEtTa8$default(button3.standard.background, ColorKt.Color(2133222232), m3701addLuminanceDxMtmZc(ColorKt.Color(2133222232), -0.2f), 2);
            Colors.Component.Button.Standard standard3 = button3.standard;
            Colors.Component copy$default5 = Colors.Component.copy$default(component3, m3097copy3JVO9M$default3, Colors.Component.Button.copy$default(button3, prominent, new Colors.Component.Button.Standard(m3117copyysEtTa8$default, new Colors.Component.Button.Standard.Icon(j4, standard3.icon.disabled), new Colors.Component.Button.Standard.Text(j4, standard3.text.disabled)), 9), null, null, null, null, null, 134217715);
            Colors.Surface surface3 = colors.surface;
            Colors.Surface.Keypad keypad5 = surface3.keypad;
            long j5 = Color.Transparent;
            long j6 = base2.constantWhite;
            return Colors.copy$default(colors, copy$default5, new Colors.Surface(Colors.Surface.Keypad.m3359copynb2GgbA$default(keypad5, j5, j6, j6, 2), surface3.money), 39);
        }
        if (ordinal == 4) {
            Colors.Component component4 = colors.component;
            long j7 = colors.base.constantBlack;
            Colors.Component.Button button4 = component4.button;
            Colors.Component.BottomNavigation bottomNavigation4 = component4.bottomNavigation;
            Colors.Component.BottomNavigation.Keypad keypad6 = bottomNavigation4.keypad;
            Colors.Component.BottomNavigation m3097copy3JVO9M$default4 = Colors.Component.BottomNavigation.m3097copy3JVO9M$default(bottomNavigation4, new Colors.Component.BottomNavigation.Keypad(keypad6.background, new Colors.Component.BottomNavigation.Keypad.Icon(Color.m675copywmQWz5c$default(0.75f, ColorKt.Color(4293052549L), 14), ColorKt.Color(4293052549L)), keypad6.text));
            Colors.Component.Button copy$default6 = Colors.Component.Button.copy$default(button4, new Colors.Component.Button.Prominent(Colors.Component.Button.Prominent.Background.m3113copyjRlVdoo$default(button4.prominent.background, ColorKt.Color(4293052549L), 0L, m3701addLuminanceDxMtmZc(ColorKt.Color(4293052549L), -0.2f), 10), new Colors.Component.Button.Prominent.Icon(j7, button4.prominent.icon.disabled), Colors.Component.Button.Prominent.Text.m3115copyysEtTa8$default(button4.prominent.text, j7)), new Colors.Component.Button.Standard(Colors.Component.Button.Standard.Background.m3117copyysEtTa8$default(button4.standard.background, ColorKt.Color(3425573392L), m3701addLuminanceDxMtmZc(ColorKt.Color(3425573392L), 0.18f), 2), new Colors.Component.Button.Standard.Icon(ColorKt.Color(4293052549L), button4.standard.icon.disabled), new Colors.Component.Button.Standard.Text(ColorKt.Color(4293052549L), button4.standard.text.disabled)), 9);
            Colors.Component.TitleBar titleBar3 = component4.titleBar;
            Colors.Component copy$default7 = Colors.Component.copy$default(component4, m3097copy3JVO9M$default4, copy$default6, null, null, null, null, Colors.Component.TitleBar.m3279copy0Hk2hKA$default(titleBar3, new Colors.Component.TitleBar.Keypad(titleBar3.keypad.background, new Colors.Component.TitleBar.Keypad.Icon(ColorKt.Color(4293052549L), ColorKt.Color(4293052549L)))), 130023411);
            Colors.Surface surface4 = colors.surface;
            return Colors.copy$default(colors, copy$default7, new Colors.Surface(Colors.Surface.Keypad.m3359copynb2GgbA$default(surface4.keypad, Color.Transparent, 0L, ColorKt.Color(4293052549L), 6), surface4.money), 39);
        }
        if (ordinal != 5) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        Colors.Component component5 = colors.component;
        long j8 = colors.base.constantBlack;
        Colors.Component.BottomNavigation bottomNavigation5 = component5.bottomNavigation;
        Colors.Component.BottomNavigation.Keypad keypad7 = bottomNavigation5.keypad;
        Colors.Component.BottomNavigation m3097copy3JVO9M$default5 = Colors.Component.BottomNavigation.m3097copy3JVO9M$default(bottomNavigation5, new Colors.Component.BottomNavigation.Keypad(keypad7.background, new Colors.Component.BottomNavigation.Keypad.Icon(Color.m675copywmQWz5c$default(0.45f, j8, 14), j8), keypad7.text));
        Colors.Component.Button button5 = component5.button;
        Colors.Component.Button.Standard standard4 = button5.standard;
        Colors.Component.Button copy$default8 = Colors.Component.Button.copy$default(button5, null, new Colors.Component.Button.Standard(Colors.Component.Button.Standard.Background.m3117copyysEtTa8$default(standard4.background, Color.m675copywmQWz5c$default(0.1f, j8, 14), Color.m675copywmQWz5c$default(0.15f, j8, 14), 2), standard4.icon, standard4.text), 11);
        Colors.Component.TitleBar titleBar4 = component5.titleBar;
        Colors.Component copy$default9 = Colors.Component.copy$default(component5, m3097copy3JVO9M$default5, copy$default8, null, null, null, null, Colors.Component.TitleBar.m3279copy0Hk2hKA$default(titleBar4, new Colors.Component.TitleBar.Keypad(titleBar4.keypad.background, new Colors.Component.TitleBar.Keypad.Icon(j8, Color.m675copywmQWz5c$default(0.7f, j8, 14)))), 130023411);
        Colors.Surface surface5 = colors.surface;
        Colors.Surface.Keypad keypad8 = surface5.keypad;
        long Color2 = ColorKt.Color(4287286784L);
        Colors.Semantic semantic2 = colors.semantic;
        return Colors.copy$default(colors, copy$default9, new Colors.Surface(Colors.Surface.Keypad.m3359copynb2GgbA$default(keypad8, Color2, semantic2.icon.standard, semantic2.text.standard, 2), surface5.money), 39);
    }
}
