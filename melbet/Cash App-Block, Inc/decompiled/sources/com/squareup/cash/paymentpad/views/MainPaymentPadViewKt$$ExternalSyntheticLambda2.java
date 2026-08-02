package com.squareup.cash.paymentpad.views;

import android.icu.text.MessageFormat;
import android.os.VibrationEffect;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.RelationUtil;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$3;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarKt$Avatar$5$1$1;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.paymentpad.viewmodels.FiatResetAmount;
import com.squareup.cash.paymentpad.viewmodels.HypeConfig;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$4$1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.ScaledSizeKt;
import com.squareup.util.compose.SharedViewEventsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentPadViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ MainPaymentPadViewModel f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ MainPaymentPadViewKt$$ExternalSyntheticLambda2(Modifier modifier, MainPaymentPadViewModel mainPaymentPadViewModel, Function1 function1, boolean z) {
        this.f$0 = modifier;
        this.f$1 = mainPaymentPadViewModel;
        this.f$2 = function1;
        this.f$3 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CurrencyCode currencyCode;
        Object realKeyStoreProvider$setEntry$2;
        final Function1 function1;
        AmountDisplayState amountDisplayState;
        Object obj3;
        boolean z;
        ConstraintSetForInlineDsl constraintSetForInlineDsl;
        MutableState mutableState;
        final MutableState mutableState2;
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        switch (this.$r8$classId) {
            case 0:
                boolean z2 = false;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, z2)) {
                    MainPaymentPadViewKt.MainPaymentPadView(this.f$0, this.f$1, this.f$2, this.f$3, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer2.consume(providableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    final long j = colors.surface.keypad.text;
                    final MainPaymentPadViewModel mainPaymentPadViewModel = this.f$1;
                    Object[] objArr = {mainPaymentPadViewModel};
                    boolean changedInstance = gapComposer2.changedInstance(mainPaymentPadViewModel);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj4 = Composer.Companion.Empty;
                    if (changedInstance || rememberedValue == obj4) {
                        rememberedValue = new Function0() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z3;
                                int i4 = i2;
                                MainPaymentPadViewModel mainPaymentPadViewModel2 = mainPaymentPadViewModel;
                                switch (i4) {
                                    case 0:
                                        return mainPaymentPadViewModel2.rawAmount;
                                    case 1:
                                        z3 = mainPaymentPadViewModel2.showTapToPay;
                                        break;
                                    default:
                                        z3 = mainPaymentPadViewModel2.showPoolsButton;
                                        break;
                                }
                                return Boolean.valueOf(z3);
                            }
                        };
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    String str = (String) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer2, 0);
                    Object[] objArr2 = {mainPaymentPadViewModel};
                    boolean changedInstance2 = gapComposer2.changedInstance(mainPaymentPadViewModel);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z3;
                                int i4 = i3;
                                MainPaymentPadViewModel mainPaymentPadViewModel2 = mainPaymentPadViewModel;
                                switch (i4) {
                                    case 0:
                                        return mainPaymentPadViewModel2.rawAmount;
                                    case 1:
                                        z3 = mainPaymentPadViewModel2.showTapToPay;
                                        break;
                                    default:
                                        z3 = mainPaymentPadViewModel2.showPoolsButton;
                                        break;
                                }
                                return Boolean.valueOf(z3);
                            }
                        };
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    final boolean booleanValue = ((Boolean) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer2, 0)).booleanValue();
                    Object[] objArr3 = {mainPaymentPadViewModel};
                    boolean changedInstance3 = gapComposer2.changedInstance(mainPaymentPadViewModel);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == obj4) {
                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean z3;
                                int i4 = i;
                                MainPaymentPadViewModel mainPaymentPadViewModel2 = mainPaymentPadViewModel;
                                switch (i4) {
                                    case 0:
                                        return mainPaymentPadViewModel2.rawAmount;
                                    case 1:
                                        z3 = mainPaymentPadViewModel2.showTapToPay;
                                        break;
                                    default:
                                        z3 = mainPaymentPadViewModel2.showPoolsButton;
                                        break;
                                }
                                return Boolean.valueOf(z3);
                            }
                        };
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    boolean booleanValue2 = ((Boolean) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue3, gapComposer2, 0)).booleanValue();
                    boolean changed = gapComposer2.changed(mainPaymentPadViewModel.showHypeAnimation);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue4 == obj4) {
                        rememberedValue4 = Recorder$$ExternalSyntheticOutline1.m(true ^ mainPaymentPadViewModel.showHypeAnimation, gapComposer2);
                    }
                    final MutableState mutableState3 = (MutableState) rememberedValue4;
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (rememberedValue5 == obj4) {
                        rememberedValue5 = Updater.mutableStateOf$default(null);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    MutableState mutableState4 = (MutableState) rememberedValue5;
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (rememberedValue6 == obj4) {
                        rememberedValue6 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
                    }
                    final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue6;
                    gapComposer2.startReplaceGroup(-312521107);
                    AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(mainPaymentPadViewModel.currencyCode, null, false, 0, 14);
                    Function1 function12 = this.f$2;
                    boolean changed2 = gapComposer2.changed(function12);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue7 == obj4) {
                        rememberedValue7 = new LocalShortlinkSheetKt$$ExternalSyntheticLambda0(function12, parcelableSnapshotMutableIntState, 3);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, str, (Function1) rememberedValue7, gapComposer2, 0);
                    boolean changed3 = gapComposer2.changed(rememberAmountDisplayState);
                    Object rememberedValue8 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue8 == obj4) {
                        rememberedValue8 = new AmountDisplayKeypadListener(rememberAmountDisplayState);
                        gapComposer2.updateRememberedValue(rememberedValue8);
                    }
                    mutableState4.setValue((AmountDisplayKeypadListener) rememberedValue8);
                    gapComposer2.end(false);
                    FiatResetAmount fiatResetAmount = mainPaymentPadViewModel.resetAmount;
                    CurrencyCode currencyCode2 = mainPaymentPadViewModel.currencyCode;
                    boolean changedInstance4 = gapComposer2.changedInstance(mainPaymentPadViewModel) | gapComposer2.changed(rememberAmountDisplayState) | gapComposer2.changed(str);
                    Object rememberedValue9 = gapComposer2.rememberedValue();
                    if (changedInstance4 || rememberedValue9 == obj4) {
                        currencyCode = currencyCode2;
                        function1 = function12;
                        amountDisplayState = rememberAmountDisplayState;
                        obj3 = obj4;
                        realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(24, mainPaymentPadViewModel, amountDisplayState, str, (Continuation) null);
                        gapComposer2.updateRememberedValue(realKeyStoreProvider$setEntry$2);
                    } else {
                        realKeyStoreProvider$setEntry$2 = rememberedValue9;
                        currencyCode = currencyCode2;
                        amountDisplayState = rememberAmountDisplayState;
                        obj3 = obj4;
                        function1 = function12;
                    }
                    Updater.LaunchedEffect(fiatResetAmount, currencyCode, str, (Function2) realKeyStoreProvider$setEntry$2, gapComposer2);
                    final String stringResource = Room.stringResource(gapComposer2, R.string.payment_request);
                    final String stringResource2 = Room.stringResource(gapComposer2, R.string.payment_send);
                    final String stringResource3 = Room.stringResource(gapComposer2, R.string.payment_pool);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(this.f$0, 1.0f);
                    Colors colors2 = (Colors) gapComposer2.consume(providableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors2.surface.keypad.background, ColorKt.RectangleShape);
                    gapComposer2.startReplaceGroup(-1003410150);
                    gapComposer2.startReplaceGroup(212064437);
                    gapComposer2.end(false);
                    Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                    Object rememberedValue10 = gapComposer2.rememberedValue();
                    if (rememberedValue10 == obj3) {
                        rememberedValue10 = new Measurer2(density);
                        gapComposer2.updateRememberedValue(rememberedValue10);
                    }
                    Measurer2 measurer2 = (Measurer2) rememberedValue10;
                    Object rememberedValue11 = gapComposer2.rememberedValue();
                    if (rememberedValue11 == obj3) {
                        rememberedValue11 = new ConstraintLayoutScope();
                        gapComposer2.updateRememberedValue(rememberedValue11);
                    }
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue11;
                    Object rememberedValue12 = gapComposer2.rememberedValue();
                    if (rememberedValue12 == obj3) {
                        rememberedValue12 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer2.updateRememberedValue(rememberedValue12);
                    }
                    MutableState mutableState5 = (MutableState) rememberedValue12;
                    Object rememberedValue13 = gapComposer2.rememberedValue();
                    if (rememberedValue13 == obj3) {
                        rememberedValue13 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        gapComposer2.updateRememberedValue(rememberedValue13);
                    }
                    ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue13;
                    Object rememberedValue14 = gapComposer2.rememberedValue();
                    if (rememberedValue14 == obj3) {
                        z = booleanValue2;
                        Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
                        gapComposer2.updateRememberedValue(parcelableSnapshotMutableState);
                        rememberedValue14 = parcelableSnapshotMutableState;
                    } else {
                        z = booleanValue2;
                    }
                    final MutableState mutableState6 = (MutableState) rememberedValue14;
                    boolean changedInstance5 = gapComposer2.changedInstance(measurer2) | gapComposer2.changed(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    Object rememberedValue15 = gapComposer2.rememberedValue();
                    if (changedInstance5 || rememberedValue15 == obj3) {
                        rememberedValue15 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2(mutableState6, measurer2, constraintSetForInlineDsl2, mutableState5, 3);
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        mutableState = mutableState5;
                        gapComposer2.updateRememberedValue(rememberedValue15);
                    } else {
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        mutableState = mutableState5;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue15;
                    Object rememberedValue16 = gapComposer2.rememberedValue();
                    if (rememberedValue16 == obj3) {
                        mutableState2 = mutableState4;
                        rememberedValue16 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3(mutableState, constraintSetForInlineDsl, 3);
                        gapComposer2.updateRememberedValue(rememberedValue16);
                    } else {
                        mutableState2 = mutableState4;
                    }
                    final Function0 function0 = (Function0) rememberedValue16;
                    boolean changedInstance6 = gapComposer2.changedInstance(measurer2);
                    Object rememberedValue17 = gapComposer2.rememberedValue();
                    if (changedInstance6 || rememberedValue17 == obj3) {
                        rememberedValue17 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4(measurer2, 3);
                        gapComposer2.updateRememberedValue(rememberedValue17);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(m177backgroundbw27NRU, false, (Function1) rememberedValue17);
                    final AmountDisplayState amountDisplayState2 = amountDisplayState;
                    final boolean z3 = this.f$3;
                    final boolean z4 = z;
                    RulerKt.MultiMeasureLayout(semantics, Expect_jvmKt.rememberComposableLambda(1200550679, new Function2() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$MainPaymentPadView$lambda$0$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.animation.core.FiniteAnimationSpec, java.lang.Object, java.lang.Throwable, kotlin.jvm.functions.Function1] */
                        /* JADX WARN: Type inference failed for: r7v1 */
                        /* JADX WARN: Type inference failed for: r7v16 */
                        /* JADX WARN: Type inference failed for: r7v2, types: [androidx.compose.animation.core.FiniteAnimationSpec, kotlin.coroutines.Continuation, kotlin.jvm.functions.Function1] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            Object obj7;
                            Shaker shaker;
                            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2;
                            ?? r7;
                            boolean z5;
                            boolean z6;
                            String format2;
                            boolean z7;
                            boolean z8;
                            Composer composer3 = (Composer) obj5;
                            if ((((Number) obj6).intValue() & 3) == 2) {
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.getSkipping()) {
                                    gapComposer3.skipToGroupEnd();
                                    return Unit.INSTANCE;
                                }
                            }
                            MutableState.this.setValue(Unit.INSTANCE);
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            constraintLayoutScope2.getClass();
                            constraintLayoutScope2.reset();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            gapComposer4.startReplaceGroup(1070692604);
                            ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) constraintLayoutScope2.createRefs().mClientFragmentManager;
                            ConstrainedLayoutReference createRef = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef2 = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef3 = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef4 = constraintLayoutScope3.createRef();
                            boolean z9 = z3;
                            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(z9, gapComposer4, 0);
                            gapComposer4.startReplaceGroup(-546987607);
                            Object obj8 = Composer.Companion.Empty;
                            if (z9) {
                                gapComposer4.startReplaceGroup(-201754460);
                                Object rememberedValue18 = gapComposer4.rememberedValue();
                                if (rememberedValue18 == obj8) {
                                    int[] iArr = {0, 192, 0, 144, 0, 96, 0, 60, 0, 36, 0, 23, 0, 14, 0, 8, 0, 3};
                                    long[] jArr = new long[18];
                                    for (int i4 = 0; i4 < 18; i4++) {
                                        jArr[i4] = 50;
                                    }
                                    final VibrationEffect createWaveform = VibrationEffect.createWaveform(jArr, iArr, -1);
                                    Object obj9 = new Haptics.VibrationEffectFactory() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$$ExternalSyntheticLambda21
                                        @Override // com.squareup.cash.arcade.Haptics.VibrationEffectFactory
                                        public final VibrationEffect create() {
                                            VibrationEffect vibrationEffect = createWaveform;
                                            vibrationEffect.getClass();
                                            return vibrationEffect;
                                        }
                                    };
                                    gapComposer4.updateRememberedValue(obj9);
                                    rememberedValue18 = obj9;
                                }
                                final Haptics.VibrationEffectFactory vibrationEffectFactory = (Haptics.VibrationEffectFactory) rememberedValue18;
                                final RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer4.consume(HapticVibratorKt.LocalHapticVibrator);
                                final Haptics haptics = (Haptics) gapComposer4.consume(HapticsKt.LocalHaptics);
                                boolean changedInstance7 = gapComposer4.changedInstance(realHapticVibrator) | gapComposer4.changedInstance(vibrationEffectFactory) | gapComposer4.changed(haptics);
                                Object rememberedValue19 = gapComposer4.rememberedValue();
                                if (changedInstance7 || rememberedValue19 == obj8) {
                                    rememberedValue19 = new Vibrator() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$$ExternalSyntheticLambda22
                                        @Override // com.squareup.cash.paymentpad.views.Vibrator
                                        public final void vibrate() {
                                            RealHapticVibrator realHapticVibrator2 = RealHapticVibrator.this;
                                            if (realHapticVibrator2.vibrator.hasAmplitudeControl()) {
                                                realHapticVibrator2.vibrate(vibrationEffectFactory);
                                            } else {
                                                realHapticVibrator2.vibrate(haptics.failure);
                                            }
                                        }
                                    };
                                    gapComposer4.updateRememberedValue(rememberedValue19);
                                }
                                obj7 = (Vibrator) rememberedValue19;
                                gapComposer4.end(false);
                            } else {
                                gapComposer4.startReplaceGroup(-201079435);
                                final RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer4.consume(LocalCashVibratorKt.LocalCashVibrator);
                                boolean changedInstance8 = gapComposer4.changedInstance(realCashVibrator);
                                Object rememberedValue20 = gapComposer4.rememberedValue();
                                if (changedInstance8 || rememberedValue20 == obj8) {
                                    rememberedValue20 = new Vibrator() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$$ExternalSyntheticLambda23
                                        @Override // com.squareup.cash.paymentpad.views.Vibrator
                                        public final void vibrate() {
                                            RealCashVibrator realCashVibrator2 = RealCashVibrator.this;
                                            if (realCashVibrator2 != null) {
                                                realCashVibrator2.error();
                                            }
                                        }
                                    };
                                    gapComposer4.updateRememberedValue(rememberedValue20);
                                }
                                obj7 = (Vibrator) rememberedValue20;
                                gapComposer4.end(false);
                            }
                            gapComposer4.end(false);
                            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = parcelableSnapshotMutableIntState;
                            Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState3.getIntValue());
                            boolean changedInstance9 = gapComposer4.changedInstance(rememberShaker) | gapComposer4.changedInstance(obj7);
                            Object rememberedValue21 = gapComposer4.rememberedValue();
                            if (changedInstance9 || rememberedValue21 == obj8) {
                                shaker = rememberShaker;
                                rememberedValue21 = new RealKeyStoreProvider$setEntry$2(shaker, obj7, parcelableSnapshotMutableIntState3, (Continuation) null, 25);
                                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState3;
                                r7 = 0;
                                gapComposer4.updateRememberedValue(rememberedValue21);
                            } else {
                                shaker = rememberShaker;
                                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState3;
                                r7 = 0;
                            }
                            Updater.LaunchedEffect(gapComposer4, valueOf, (Function2) rememberedValue21);
                            final MainPaymentPadViewModel mainPaymentPadViewModel2 = mainPaymentPadViewModel;
                            String str2 = mainPaymentPadViewModel2.errorMessage;
                            PaymentPadTheme paymentPadTheme = mainPaymentPadViewModel2.paymentPadTheme;
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (str2.length() > 0) {
                                z5 = z9;
                                z6 = true;
                            } else {
                                z5 = z9;
                                z6 = false;
                            }
                            Boolean valueOf2 = Boolean.valueOf(z6);
                            boolean changed4 = gapComposer4.changed(z6);
                            Object rememberedValue22 = gapComposer4.rememberedValue();
                            if (changed4 || rememberedValue22 == obj8) {
                                rememberedValue22 = new RealBadger2$scheduleBadgeClearingWork$3(z6, parcelableSnapshotMutableIntState2, (Continuation) r7, 7);
                                gapComposer4.updateRememberedValue(rememberedValue22);
                            }
                            Updater.LaunchedEffect(gapComposer4, valueOf2, (Function2) rememberedValue22);
                            Object rememberedValue23 = gapComposer4.rememberedValue();
                            if (rememberedValue23 == obj8) {
                                rememberedValue23 = MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1.INSTANCE;
                                gapComposer4.updateRememberedValue(rememberedValue23);
                            }
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ConstraintLayoutScope.constrainAs(companion, createRef, (Function1) rememberedValue23), 1.0f);
                            EnterTransitionImpl plus = EnterExitTransitionKt.fadeIn$default(r7, 3).plus(EnterExitTransitionKt.slideInVertically$default(3, r7));
                            ExitTransitionImpl plus2 = EnterExitTransitionKt.fadeOut$default(r7, 3).plus(EnterExitTransitionKt.slideOutVertically$default(3, r7));
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1939738859, new DatePickerKt$IconButtonWithTooltip$1(str2, 2), gapComposer4);
                            final boolean z10 = z5;
                            ?? r15 = r7;
                            AnimatedContentKt.AnimatedVisibility(z6, fillMaxWidth, plus, plus2, (String) null, (Function3) rememberComposableLambda, (Composer) gapComposer4, 200064, 16);
                            String str3 = mainPaymentPadViewModel2.limitHelperText;
                            if (str3 == null) {
                                str3 = "";
                            }
                            boolean z11 = str3.length() > 0 && !z6;
                            Object rememberedValue24 = gapComposer4.rememberedValue();
                            if (rememberedValue24 == obj8) {
                                rememberedValue24 = MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1.INSTANCE$3;
                                gapComposer4.updateRememberedValue(rememberedValue24);
                            }
                            AnimatedContentKt.AnimatedVisibility(z11, SizeKt.fillMaxWidth(ConstraintLayoutScope.constrainAs(companion, createRef2, (Function1) rememberedValue24), 1.0f), EnterExitTransitionKt.fadeIn$default(r15, 3).plus(EnterExitTransitionKt.slideInVertically$default(3, r15)), EnterExitTransitionKt.fadeOut$default(r15, 3).plus(EnterExitTransitionKt.slideOutVertically$default(3, r15)), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1809868066, new DatePickerKt$IconButtonWithTooltip$1(str3, 3), gapComposer4), (Composer) gapComposer4, 200064, 16);
                            String str4 = stringResource;
                            String str5 = stringResource2;
                            boolean z12 = z4;
                            if (z12) {
                                gapComposer4.startReplaceGroup(1072678711);
                                String str6 = stringResource3;
                                re$$ExternalSyntheticOutline0.m1432m(str6, str5, str4);
                                format2 = new MessageFormat(Room.stringResource(gapComposer4, R.string.amount_view_label_content_description_triple)).format(new Object[]{str6, str5, str4});
                                format2.getClass();
                                gapComposer4.end(false);
                            } else {
                                gapComposer4.startReplaceGroup(1072961400);
                                str4.getClass();
                                str5.getClass();
                                format2 = new MessageFormat(Room.stringResource(gapComposer4, R.string.amount_view_label_content_description_plural)).format(new Object[]{str4, str5});
                                format2.getClass();
                                gapComposer4.end(false);
                            }
                            HypeConfig hypeConfig = mainPaymentPadViewModel2.hypeConfig;
                            final boolean z13 = hypeConfig != null && hypeConfig.showBratAmount;
                            final MutableState mutableState7 = mutableState3;
                            final Function1 function13 = function1;
                            final AmountDisplayState amountDisplayState3 = amountDisplayState2;
                            final long j2 = j;
                            final Shaker shaker2 = shaker;
                            final String str7 = format2;
                            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1316171822, new Function2() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$MainPaymentPadView$1$2$amountComposable$1
                                /* JADX WARN: Removed duplicated region for block: B:24:0x0151  */
                                /* JADX WARN: Removed duplicated region for block: B:27:0x01a3  */
                                /* JADX WARN: Removed duplicated region for block: B:29:0x01a9  */
                                /* JADX WARN: Removed duplicated region for block: B:34:0x01ab  */
                                /* JADX WARN: Removed duplicated region for block: B:35:0x01a6  */
                                /* JADX WARN: Removed duplicated region for block: B:36:0x0195  */
                                @Override // kotlin.jvm.functions.Function2
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke(Object obj10, Object obj11) {
                                    Modifier wrapContentHeight;
                                    float f;
                                    GapComposer gapComposer5;
                                    MainPaymentPadViewModel mainPaymentPadViewModel3;
                                    boolean changed5;
                                    Object rememberedValue25;
                                    final MainPaymentPadViewModel mainPaymentPadViewModel4;
                                    Composer composer4 = (Composer) obj10;
                                    int intValue3 = ((Number) obj11).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer4;
                                    if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                                        ((DefaultSizes) gapComposer6.consume(staticProvidableCompositionLocal)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        ((DefaultSizes) gapComposer6.consume(staticProvidableCompositionLocal)).getClass();
                                        ((DefaultSizes) gapComposer6.consume(staticProvidableCompositionLocal)).getClass();
                                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m301paddingqDBjuR0(companion2, 16.0f, 12.0f, 16.0f, 16.0f), 1.0f);
                                        String str8 = str7;
                                        boolean changed6 = gapComposer6.changed(str8);
                                        Object rememberedValue26 = gapComposer6.rememberedValue();
                                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                        if (changed6 || rememberedValue26 == neverEqualPolicy) {
                                            rememberedValue26 = new AvatarKt$Avatar$5$1$1(str8, 1);
                                            gapComposer6.updateRememberedValue(rememberedValue26);
                                        }
                                        Modifier semantics2 = SemanticsModifierKt.semantics(fillMaxWidth2, true, (Function1) rememberedValue26);
                                        BiasAlignment biasAlignment = Alignment.Companion.Center;
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                        int hashCode = Long.hashCode(gapComposer6.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer6.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer6, semantics2);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer6.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer6.startReusableNode();
                                        if (gapComposer6.inserting) {
                                            gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer6.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer6, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer6, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer6, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        gapComposer6.startReplaceGroup(-284700893);
                                        long mo238toSp0xMU5do = ((Density) gapComposer6.consume(CompositionLocalsKt.LocalDensity)).mo238toSp0xMU5do(PrimitiveResources_androidKt.dimensionResource(gapComposer6, R.dimen.payment_pad_amount_text_size));
                                        gapComposer6.end(false);
                                        wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                                        Shaker shaker3 = shaker2;
                                        Modifier shakeWith = SharedViewEventsKt.shakeWith(wrapContentHeight, shaker3);
                                        boolean z14 = z13;
                                        MutableState mutableState8 = mutableState7;
                                        if (!z14) {
                                            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = MainPaymentPadViewKt.LocalElementBoundsRegistry;
                                            if (((Boolean) mutableState8.getValue()).booleanValue()) {
                                                f = 1.0f;
                                                Modifier alpha = AlphaKt.alpha(shakeWith, f);
                                                AmountDisplayState amountDisplayState4 = amountDisplayState3;
                                                final long j3 = j2;
                                                gapComposer5 = gapComposer6;
                                                ConnectionPoolKt.m1177AmountDisplaykNX22eY(amountDisplayState4, alpha, j3, mo238toSp0xMU5do, 0, 0, gapComposer5, 0, 48);
                                                mainPaymentPadViewModel3 = mainPaymentPadViewModel2;
                                                boolean z15 = mainPaymentPadViewModel3.showHypeAnimation;
                                                boolean changed7 = gapComposer5.changed(mutableState8) | gapComposer5.changedInstance(mainPaymentPadViewModel3);
                                                Function1 function14 = function13;
                                                changed5 = changed7 | gapComposer5.changed(function14);
                                                rememberedValue25 = gapComposer5.rememberedValue();
                                                if (!changed5 || rememberedValue25 == neverEqualPolicy) {
                                                    rememberedValue25 = new KClassImpl$Data$$Lambda$23(9, mainPaymentPadViewModel3, function14, mutableState8);
                                                    gapComposer5.updateRememberedValue(rememberedValue25);
                                                }
                                                ScaledSizeKt.m3993HypeIntroAnimationcf5BqRc(z15, null, j3, (Function0) rememberedValue25, gapComposer5, 0);
                                                if (z14) {
                                                    mainPaymentPadViewModel4 = mainPaymentPadViewModel3;
                                                    gapComposer5.startReplaceGroup(-234581578);
                                                    gapComposer5.end(false);
                                                } else {
                                                    gapComposer5.startReplaceGroup(-234898119);
                                                    mainPaymentPadViewModel4 = mainPaymentPadViewModel3;
                                                    ImageKt.Image(Countries.painterResource(R.drawable.brat_text, 0, gapComposer5), Room.stringResource(gapComposer5, R.string.paymentpad_brat_label), SizeKt.fillMaxWidth(SharedViewEventsKt.shakeWith(companion2, shaker3), 0.3f), null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer5, Painter.$stable, 56);
                                                    gapComposer5 = gapComposer5;
                                                    gapComposer5.end(false);
                                                }
                                                HypeConfig hypeConfig2 = mainPaymentPadViewModel4.hypeConfig;
                                                GapComposer gapComposer7 = gapComposer5;
                                                AnimatedContentKt.AnimatedVisibility((hypeConfig2 == null ? hypeConfig2.amountSubLabel : null) == null, OffsetKt.m273offsetVpY3zN4$default(BoxScopeInstance.INSTANCE.align(companion2, biasAlignment), RecyclerView.DECELERATION_RATE, 96.0f, 1), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1535444532, new Function3() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$MainPaymentPadView$1$2$amountComposable$1$2$2
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                        Composer composer5 = (Composer) obj13;
                                                        ((Number) obj14).intValue();
                                                        ((AnimatedVisibilityScope) obj12).getClass();
                                                        HypeConfig hypeConfig3 = MainPaymentPadViewModel.this.hypeConfig;
                                                        String str9 = hypeConfig3 != null ? hypeConfig3.amountSubLabel : null;
                                                        if (str9 == null) {
                                                            str9 = "";
                                                        }
                                                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, j3, composer5, (Modifier) null, ((Typography) ((GapComposer) composer5).consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                                                        return Unit.INSTANCE;
                                                    }
                                                }, gapComposer5), (Composer) gapComposer7, 200064, 16);
                                                gapComposer7.end(true);
                                            }
                                        }
                                        f = 0.0f;
                                        Modifier alpha2 = AlphaKt.alpha(shakeWith, f);
                                        AmountDisplayState amountDisplayState42 = amountDisplayState3;
                                        final long j32 = j2;
                                        gapComposer5 = gapComposer6;
                                        ConnectionPoolKt.m1177AmountDisplaykNX22eY(amountDisplayState42, alpha2, j32, mo238toSp0xMU5do, 0, 0, gapComposer5, 0, 48);
                                        mainPaymentPadViewModel3 = mainPaymentPadViewModel2;
                                        boolean z152 = mainPaymentPadViewModel3.showHypeAnimation;
                                        boolean changed72 = gapComposer5.changed(mutableState8) | gapComposer5.changedInstance(mainPaymentPadViewModel3);
                                        Function1 function142 = function13;
                                        changed5 = changed72 | gapComposer5.changed(function142);
                                        rememberedValue25 = gapComposer5.rememberedValue();
                                        if (!changed5) {
                                        }
                                        rememberedValue25 = new KClassImpl$Data$$Lambda$23(9, mainPaymentPadViewModel3, function142, mutableState8);
                                        gapComposer5.updateRememberedValue(rememberedValue25);
                                        ScaledSizeKt.m3993HypeIntroAnimationcf5BqRc(z152, null, j32, (Function0) rememberedValue25, gapComposer5, 0);
                                        if (z14) {
                                        }
                                        HypeConfig hypeConfig22 = mainPaymentPadViewModel4.hypeConfig;
                                        GapComposer gapComposer72 = gapComposer5;
                                        AnimatedContentKt.AnimatedVisibility((hypeConfig22 == null ? hypeConfig22.amountSubLabel : null) == null, OffsetKt.m273offsetVpY3zN4$default(BoxScopeInstance.INSTANCE.align(companion2, biasAlignment), RecyclerView.DECELERATION_RATE, 96.0f, 1), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1535444532, new Function3() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$MainPaymentPadView$1$2$amountComposable$1$2$2
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                Composer composer5 = (Composer) obj13;
                                                ((Number) obj14).intValue();
                                                ((AnimatedVisibilityScope) obj12).getClass();
                                                HypeConfig hypeConfig3 = MainPaymentPadViewModel.this.hypeConfig;
                                                String str9 = hypeConfig3 != null ? hypeConfig3.amountSubLabel : null;
                                                if (str9 == null) {
                                                    str9 = "";
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, j32, composer5, (Modifier) null, ((Typography) ((GapComposer) composer5).consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer5), (Composer) gapComposer72, 200064, 16);
                                        gapComposer72.end(true);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer4);
                            final MutableState mutableState8 = mutableState2;
                            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(63899982, new Function2() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$MainPaymentPadView$1$2$keypadComposable$1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj10, Object obj11) {
                                    Composer composer4 = (Composer) obj10;
                                    int intValue3 = ((Number) obj11).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer4;
                                    if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                                        Object rememberedValue25 = gapComposer5.rememberedValue();
                                        MutableState mutableState9 = mutableState8;
                                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                        if (rememberedValue25 == neverEqualPolicy) {
                                            rememberedValue25 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(6, mutableState9);
                                            gapComposer5.updateRememberedValue(rememberedValue25);
                                        }
                                        Function0 function02 = (Function0) rememberedValue25;
                                        Object rememberedValue26 = gapComposer5.rememberedValue();
                                        if (rememberedValue26 == neverEqualPolicy) {
                                            rememberedValue26 = new RealBrandFollowPresenter$models$2$1$1(28, mutableState9);
                                            gapComposer5.updateRememberedValue(rememberedValue26);
                                        }
                                        RelationUtil.m1189KeypadViewww6aTOc(fillMaxWidth2, new KeypadViewModel(null, z10, function02, (Function1) rememberedValue26, 1), null, 0L, gapComposer5, 0, 12);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer4);
                            Object rememberedValue25 = gapComposer4.rememberedValue();
                            if (rememberedValue25 == obj8) {
                                rememberedValue25 = Updater.mutableStateOf$default(r15);
                                gapComposer4.updateRememberedValue(rememberedValue25);
                            }
                            final MutableState mutableState9 = (MutableState) rememberedValue25;
                            boolean changed5 = gapComposer4.changed(createRef4);
                            Object rememberedValue26 = gapComposer4.rememberedValue();
                            if (changed5 || rememberedValue26 == obj8) {
                                rememberedValue26 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef4, 3);
                                gapComposer4.updateRememberedValue(rememberedValue26);
                            }
                            Modifier constrainAs = ConstraintLayoutScope.constrainAs(companion, createRef3, (Function1) rememberedValue26);
                            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Function2[]{rememberComposableLambda2, rememberComposableLambda3});
                            Object rememberedValue27 = gapComposer4.rememberedValue();
                            if (rememberedValue27 == obj8) {
                                rememberedValue27 = new MultiContentMeasurePolicy() { // from class: com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$MainPaymentPadView$1$2$8$1
                                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                                    /* renamed from: measure-3p2s80s */
                                    public final MeasureResult mo263measure3p2s80s(MeasureScope measureScope, List list, long j3) {
                                        measureScope.getClass();
                                        ArrayList arrayList = (ArrayList) list;
                                        List list2 = (List) arrayList.get(0);
                                        List list3 = (List) arrayList.get(1);
                                        Measurable measurable = (Measurable) CollectionsKt.single(list2);
                                        int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j3) - measurable.minIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j3));
                                        if (m1024getMaxHeightimpl < 0) {
                                            m1024getMaxHeightimpl = 0;
                                        }
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = MainPaymentPadViewKt.LocalElementBoundsRegistry;
                                        MutableState mutableState10 = MutableState.this;
                                        Integer num = (Integer) mutableState10.getValue();
                                        mutableState10.setValue(num != null ? Integer.valueOf(Math.min(num.intValue(), m1024getMaxHeightimpl)) : Integer.valueOf(m1024getMaxHeightimpl));
                                        Measurable measurable2 = (Measurable) CollectionsKt.single(list3);
                                        Integer num2 = (Integer) mutableState10.getValue();
                                        num2.getClass();
                                        Placeable mo833measureBRTryo0 = measurable2.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j3, 0, 0, 0, num2.intValue(), 2));
                                        int m1024getMaxHeightimpl2 = Constraints.m1024getMaxHeightimpl(j3) - mo833measureBRTryo0.height;
                                        int i5 = m1024getMaxHeightimpl2 < 0 ? 0 : m1024getMaxHeightimpl2;
                                        return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j3), Constraints.m1024getMaxHeightimpl(j3), new VerifyCheckDepositPresenter$models$3$2(22, measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j3, 0, 0, i5, i5, 3)), mo833measureBRTryo0));
                                    }
                                };
                                gapComposer4.updateRememberedValue(rememberedValue27);
                            }
                            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue27;
                            ComposableLambdaImpl combineAsVirtualLayouts = RulerKt.combineAsVirtualLayouts(listOf);
                            Object rememberedValue28 = gapComposer4.rememberedValue();
                            if (rememberedValue28 == obj8) {
                                rememberedValue28 = new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
                                gapComposer4.updateRememberedValue(rememberedValue28);
                            }
                            MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue28;
                            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, constrainAs);
                            ComposeUiNode.Companion.getClass();
                            Function0 function02 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer4.applier == null) {
                                Updater.invalidApplier();
                                throw r15;
                            }
                            gapComposer4.startReusableNode();
                            if (gapComposer4.inserting) {
                                gapComposer4.createNode(function02);
                            } else {
                                gapComposer4.useNode();
                            }
                            Updater.m576setimpl(gapComposer4, measurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            Recorder$$ExternalSyntheticOutline2.m(0, combineAsVirtualLayouts, gapComposer4, true);
                            Function1 function14 = function1;
                            if (z12) {
                                gapComposer4.startReplaceGroup(1078258246);
                                Object rememberedValue29 = gapComposer4.rememberedValue();
                                if (rememberedValue29 == obj8) {
                                    rememberedValue29 = MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1.INSTANCE$4;
                                    gapComposer4.updateRememberedValue(rememberedValue29);
                                }
                                Modifier constrainAs2 = ConstraintLayoutScope.constrainAs(companion, createRef4, (Function1) rememberedValue29);
                                boolean changed6 = gapComposer4.changed(function14);
                                Object rememberedValue30 = gapComposer4.rememberedValue();
                                if (changed6 || rememberedValue30 == obj8) {
                                    z8 = false;
                                    rememberedValue30 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$10$1(0, function14);
                                    gapComposer4.updateRememberedValue(rememberedValue30);
                                } else {
                                    z8 = false;
                                }
                                MainPaymentPadViewKt.PoolRequestPayButtons(stringResource2, stringResource, stringResource3, (Function2) rememberedValue30, constrainAs2, gapComposer4, 0);
                                gapComposer4.end(z8);
                                z7 = z8;
                            } else if (booleanValue) {
                                gapComposer4.startReplaceGroup(1078627642);
                                Object rememberedValue31 = gapComposer4.rememberedValue();
                                if (rememberedValue31 == obj8) {
                                    rememberedValue31 = MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1.INSTANCE$1;
                                    gapComposer4.updateRememberedValue(rememberedValue31);
                                }
                                Modifier constrainAs3 = ConstraintLayoutScope.constrainAs(companion, createRef4, (Function1) rememberedValue31);
                                ButtonProminence buttonProminence = paymentPadTheme == PaymentPadTheme.TORTOISE ? ButtonProminence.PROMINENT : ButtonProminence.STANDARD;
                                boolean changed7 = gapComposer4.changed(function14);
                                Object rememberedValue32 = gapComposer4.rememberedValue();
                                if (changed7 || rememberedValue32 == obj8) {
                                    rememberedValue32 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$10$1(2, function14);
                                    gapComposer4.updateRememberedValue(rememberedValue32);
                                }
                                MainPaymentPadViewKt.PayTapToPayRequestButtons(buttonProminence, stringResource2, stringResource, (Function2) rememberedValue32, constrainAs3, gapComposer4, 0);
                                z7 = false;
                                gapComposer4.end(false);
                            } else {
                                gapComposer4.startReplaceGroup(1079055938);
                                Object rememberedValue33 = gapComposer4.rememberedValue();
                                if (rememberedValue33 == obj8) {
                                    rememberedValue33 = MainPaymentPadViewKt$MainPaymentPadView$1$2$3$1.INSTANCE$2;
                                    gapComposer4.updateRememberedValue(rememberedValue33);
                                }
                                Modifier constrainAs4 = ConstraintLayoutScope.constrainAs(companion, createRef4, (Function1) rememberedValue33);
                                ButtonProminence buttonProminence2 = paymentPadTheme == PaymentPadTheme.TORTOISE ? ButtonProminence.PROMINENT : ButtonProminence.STANDARD;
                                boolean changed8 = gapComposer4.changed(function14);
                                Object rememberedValue34 = gapComposer4.rememberedValue();
                                if (changed8 || rememberedValue34 == obj8) {
                                    rememberedValue34 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$10$1(3, function14);
                                    gapComposer4.updateRememberedValue(rememberedValue34);
                                }
                                MainPaymentPadViewKt.PayRequestButtons(buttonProminence2, stringResource2, stringResource, (Function2) rememberedValue34, constrainAs4, gapComposer4, 0);
                                z7 = false;
                                gapComposer4.end(false);
                            }
                            gapComposer4.end(z7);
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), measurePolicy, gapComposer2, 48);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                MainPaymentPadViewKt.MainPaymentPadView(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MainPaymentPadViewKt$$ExternalSyntheticLambda2(Modifier modifier, MainPaymentPadViewModel mainPaymentPadViewModel, Function1 function1, boolean z, int i) {
        this.f$0 = modifier;
        this.f$1 = mainPaymentPadViewModel;
        this.f$2 = function1;
        this.f$3 = z;
    }

    public /* synthetic */ MainPaymentPadViewKt$$ExternalSyntheticLambda2(MainPaymentPadViewModel mainPaymentPadViewModel, Function1 function1, Modifier modifier, boolean z) {
        this.f$1 = mainPaymentPadViewModel;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$3 = z;
    }
}
