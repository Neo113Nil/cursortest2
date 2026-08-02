package com.squareup.cash.bitcoin.views.send;

import androidx.biometric.BiometricPrompt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.SegmentedControlKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.viewmodels.MoveBitcoinModel;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerKt;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerModel;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.sup.OffersNotificationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.offers.views.sup.OffersNotificationKt$OffersNotification$2$1$1;
import com.squareup.cash.offers.views.sup.OffersNotificationKt$OffersNotification$5$1;
import com.squareup.cash.offers.views.sup.SwipeState;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.wire.internal.ReflectionKt;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class MoveBitcoinViewKt {
    public static final void MoveBitcoinContent(MoveBitcoinModel.Content content, boolean z, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-807962269);
        int i2 = i | (gapComposer.changedInstance(content) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = i2 | (gapComposer.changed(companion) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            BitcoinKeypadAmountPickerModel bitcoinKeypadAmountPickerModel = new BitcoinKeypadAmountPickerModel(32, content.keypadModel, Room.stringResource(gapComposer, R.string.transfer_btc_title), Room.stringResource(gapComposer, R.string.blockers_next), null, true, content.buttonEnabled, content.showMaxButton);
            boolean z2 = (i3 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AvatarsKt$$ExternalSyntheticLambda1(19, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            BitcoinKeypadAmountPickerKt.BitcoinKeypadAmountPicker(bitcoinKeypadAmountPickerModel, z, (Function1) rememberedValue, new LayoutWeightElement(1.0f, true), gapComposer, i3 & 112, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(content, z, function1, i, 9);
        }
    }

    public static final void MoveBitcoinView(MoveBitcoinModel moveBitcoinModel, boolean z, Function1 function1, RealCashVibrator realCashVibrator, Modifier modifier, Composer composer, int i) {
        int i2;
        moveBitcoinModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1102363704);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(moveBitcoinModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Updater.CompositionLocalProvider(LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator), Expect_jvmKt.rememberComposableLambda(1565730568, new MoveBitcoinViewKt$$ExternalSyntheticLambda0(moveBitcoinModel, z, function1, i4), gapComposer), gapComposer, 56);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(moveBitcoinModel, z, function1, realCashVibrator, modifier2, i);
        }
    }

    public static final void OffersNotification(String str, Long l, Function0 function0, Composer composer, int i) {
        float f;
        AnchoredDraggableState anchoredDraggableState;
        Modifier wrapContentHeight;
        Function0 function02 = function0;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1935396636);
        int i2 = 2;
        int i3 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(l) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 32.0f, 16.0f, 32.0f);
            PaddingValuesImpl paddingValuesImpl2 = new PaddingValuesImpl(16.0f, 24.0f, 16.0f, 24.0f);
            gapComposer.startReplaceGroup(195338193);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            float mo236toPx0680j_4 = density.mo236toPx0680j_4(32.0f) + density.mo236toPx0680j_4(32.0f);
            float mo236toPx0680j_42 = density.mo236toPx0680j_4(24.0f) + density.mo236toPx0680j_4(24.0f);
            float mo235toPxR2X_6o = density.mo235toPxR2X_6o(MooncakeTheme.getTypography(gapComposer).caption.paragraphStyle.lineHeight);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            float mo236toPx0680j_43 = mo236toPx0680j_4 + mo236toPx0680j_42 + mo235toPxR2X_6o + density.mo236toPx0680j_4(SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).systemBars, gapComposer).mo264calculateBottomPaddingD9Ej5fM());
            gapComposer.end(false);
            SwipeState swipeState = SwipeState.START;
            boolean changed = gapComposer.changed(mo236toPx0680j_43);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PulsingState$$ExternalSyntheticLambda0(mo236toPx0680j_43, 11);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnchoredDraggableState rememberAnchoredDraggableState = ReflectionKt.rememberAnchoredDraggableState(swipeState, Draggable2DKt.DraggableAnchors((Function1) rememberedValue), gapComposer);
            Continuation continuation = null;
            if (l == null) {
                gapComposer.startReplaceGroup(1761458964);
                gapComposer.end(false);
                f = 16.0f;
                anchoredDraggableState = rememberAnchoredDraggableState;
            } else {
                gapComposer.startReplaceGroup(1761458965);
                long longValue = l.longValue();
                Unit unit = Unit.INSTANCE;
                boolean changed2 = gapComposer.changed(longValue) | gapComposer.changed(rememberAnchoredDraggableState);
                f = 16.0f;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new OffersNotificationKt$OffersNotification$2$1$1(longValue, rememberAnchoredDraggableState, continuation, 0);
                    anchoredDraggableState = rememberAnchoredDraggableState;
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    anchoredDraggableState = rememberAnchoredDraggableState;
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
                gapComposer.end(false);
            }
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f);
            wrapContentHeight = SizeKt.wrapContentHeight(SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValuesImpl), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier anchoredDraggable$default = Draggable2DKt.anchoredDraggable$default(wrapContentHeight, anchoredDraggableState, Orientation.Vertical, false, null, 60);
            AnchoredDraggableState anchoredDraggableState2 = anchoredDraggableState;
            boolean changed3 = gapComposer.changed(anchoredDraggableState2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SegmentedControlKt$$ExternalSyntheticLambda4(anchoredDraggableState2, i2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            int i4 = 0;
            KeypadKt.m3641CardIkByU14(OffsetKt.offset(anchoredDraggable$default, (Function1) rememberedValue3), m340RoundedCornerShape0680j_4, MooncakeTheme.getColors(gapComposer).elevatedBackground, true, function0, null, null, Expect_jvmKt.rememberComposableLambda(1492757592, new MoneyTabUIKt$$ExternalSyntheticLambda11(21, paddingValuesImpl2, str), gapComposer), gapComposer, ((i3 << 9) & 458752) | 100687872, 200);
            function02 = function0;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.derivedStateOf(new OffersNotificationKt$$ExternalSyntheticLambda3(anchoredDraggableState2, i4));
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            State state = (State) rememberedValue4;
            Boolean bool = (Boolean) state.getValue();
            bool.booleanValue();
            boolean z = (i3 & 896) == 256;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (z || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new OffersNotificationKt$OffersNotification$5$1(function02, state, null, i4);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(gapComposer, bool, (Function2) rememberedValue5);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(str, l, function02, i, 6);
        }
    }

    public static final void addPointerInputChange(BiometricPrompt biometricPrompt, PointerInputChange pointerInputChange) {
        m3421addPointerInputChange0AR0LA0(biometricPrompt, pointerInputChange, 0L);
    }

    /* renamed from: addPointerInputChange-0AR0LA0, reason: not valid java name */
    public static final void m3421addPointerInputChange0AR0LA0(BiometricPrompt biometricPrompt, PointerInputChange pointerInputChange, long j) {
        RealStrongMemoryCache realStrongMemoryCache = (RealStrongMemoryCache) biometricPrompt.mClientFragmentManager;
        realStrongMemoryCache.getClass();
        VelocityTracker1D velocityTracker1D = (VelocityTracker1D) realStrongMemoryCache.cache;
        VelocityTracker1D velocityTracker1D2 = (VelocityTracker1D) realStrongMemoryCache.weakMemoryCache;
        boolean changedToDownIgnoreConsumed = PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange);
        long j2 = pointerInputChange.uptimeMillis;
        if (changedToDownIgnoreConsumed) {
            ArraysKt___ArraysJvmKt.fill(r6, 0, velocityTracker1D2.samples.length, null);
            velocityTracker1D2.index = 0;
            ArraysKt___ArraysJvmKt.fill(r6, 0, velocityTracker1D.samples.length, null);
            velocityTracker1D.index = 0;
            realStrongMemoryCache.initialMaxSize = 0L;
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List historical = pointerInputChange.getHistorical();
            int i = 0;
            for (int size = historical.size(); i < size; size = size) {
                HistoricalChange historicalChange = (HistoricalChange) historical.get(i);
                realStrongMemoryCache.m1456addPositionUv8p0NA(historicalChange.uptimeMillis, Offset.m626plusMKHz9U(historicalChange.originalEventPosition, j));
                i++;
            }
            realStrongMemoryCache.m1456addPositionUv8p0NA(j2, Offset.m626plusMKHz9U(pointerInputChange.originalEventPosition, j));
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && j2 - realStrongMemoryCache.initialMaxSize > 40) {
            ArraysKt___ArraysJvmKt.fill(r0, 0, velocityTracker1D2.samples.length, null);
            velocityTracker1D2.index = 0;
            ArraysKt___ArraysJvmKt.fill(r2, 0, velocityTracker1D.samples.length, null);
            velocityTracker1D.index = 0;
            realStrongMemoryCache.initialMaxSize = 0L;
        }
        realStrongMemoryCache.initialMaxSize = j2;
    }

    public static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = RecyclerView.DECELERATION_RATE;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void polyFitLeastSquares(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float dot = dot(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * dot);
                }
            }
            float sqrt = (float) Math.sqrt(dot(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? RecyclerView.DECELERATION_RATE : dot(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float dot2 = dot(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    dot2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = dot2 / fArr11[i14];
        }
    }
}
