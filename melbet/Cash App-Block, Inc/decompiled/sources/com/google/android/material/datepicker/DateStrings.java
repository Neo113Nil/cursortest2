package com.google.android.material.datepicker;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.withpersona.sdk2.inquiry.selfie.CaptureState;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes9.dex */
public abstract class DateStrings {
    public static final void BaseCardWidget(final GenericComponentViewModel.BaseCardViewModel baseCardViewModel, Modifier modifier, boolean z, final Function1 function1, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        long backgroundColor;
        baseCardViewModel.getClass();
        ColorModel.Accented accented = baseCardViewModel.backgroundColor;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1846042581);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(baseCardViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        final int i4 = 1;
        final int i5 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            int i6 = i3 & 7168;
            boolean changedInstance = gapComposer.changedInstance(baseCardViewModel) | (i6 == 2048);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function0() { // from class: com.squareup.cash.genericelements.components.components.BaseCardWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = i5;
                        Function1 function12 = function1;
                        GenericComponentViewModel.BaseCardViewModel baseCardViewModel2 = baseCardViewModel;
                        switch (i7) {
                            case 0:
                                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = baseCardViewModel2.viewAnalyticsEvent;
                                if (viewAnalyticsEvent != null) {
                                    function12.invoke(viewAnalyticsEvent);
                                }
                                break;
                            default:
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent = baseCardViewModel2.event;
                                if (genericTreeElementsViewEvent != null) {
                                    function12.invoke(genericTreeElementsViewEvent);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(fillMaxWidth, (Function0) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda1(16);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(onVisible$default, true, (Function1) rememberedValue2);
            if (z) {
                gapComposer.startReplaceGroup(-1601301286);
                Color forTheme = ThemablesKt.forTheme(accented, gapComposer);
                if (forTheme == null) {
                    gapComposer.startReplaceGroup(225442109);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    backgroundColor = colors.semantic.background.standard;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(225439784);
                    gapComposer.end(false);
                    backgroundColor = forTheme.value;
                }
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(225443465);
                backgroundColor = zzai.getBackgroundColor(accented, gapComposer);
                gapComposer.end(false);
            }
            boolean z2 = false;
            boolean z3 = baseCardViewModel.showDropShadow;
            boolean changedInstance2 = gapComposer.changedInstance(baseCardViewModel);
            if (i6 == 2048) {
                z2 = true;
            }
            boolean z4 = z2 | changedInstance2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z4 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new Function0() { // from class: com.squareup.cash.genericelements.components.components.BaseCardWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = i4;
                        Function1 function12 = function1;
                        GenericComponentViewModel.BaseCardViewModel baseCardViewModel2 = baseCardViewModel;
                        switch (i7) {
                            case 0:
                                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = baseCardViewModel2.viewAnalyticsEvent;
                                if (viewAnalyticsEvent != null) {
                                    function12.invoke(viewAnalyticsEvent);
                                }
                                break;
                            default:
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent = baseCardViewModel2.event;
                                if (genericTreeElementsViewEvent != null) {
                                    function12.invoke(genericTreeElementsViewEvent);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            KeypadKt.m3641CardIkByU14(semantics, null, backgroundColor, z3, (Function0) rememberedValue3, null, null, Expect_jvmKt.rememberComposableLambda(101797649, new MoneyTabBookletKt$$ExternalSyntheticLambda4(i4, (Object) baseCardViewModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(baseCardViewModel, modifier2, z, function1, i, 16);
        }
    }

    public static boolean getManualCaptureEnabled(CaptureState captureState) {
        PoseConfig currentPoseConfig = captureState.getCurrentPoseConfig();
        if (!captureState.getAutoCaptureSupported() || currentPoseConfig.manualCaptureEnabled) {
            return (captureState.getAutoCaptureSupported() && currentPoseConfig.autoCaptureEnabled && System.currentTimeMillis() - captureState.getStartCaptureTimestamp() <= currentPoseConfig.manualCaptureDelayMs) ? false : true;
        }
        return false;
    }

    public static String getYearMonthDay(long j) {
        return UtcDates.getAndroidFormat("yMMMd", Locale.getDefault()).format(new Date(j));
    }
}
