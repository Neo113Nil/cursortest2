package com.squareup.cash.moneybot.views.amountinput;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.viewmodels.amountinput.MoneybotAmountInputViewModel;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import string.ReplaceModeKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotAmountInputViewKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MoneybotAmountInputViewModel f$0;
    public final /* synthetic */ AmountKeypadState f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ MoneybotAmountInputViewKt$$ExternalSyntheticLambda2(MoneybotAmountInputViewModel moneybotAmountInputViewModel, AmountKeypadState amountKeypadState, Function1 function1) {
        this.f$0 = moneybotAmountInputViewModel;
        this.f$1 = amountKeypadState;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        float f;
        float f2;
        GapComposer gapComposer;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$2;
        MoneybotAmountInputViewModel moneybotAmountInputViewModel = this.f$0;
        switch (i) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    float mo267calculateTopPaddingD9Ej5fM = paddingValues.mo267calculateTopPaddingD9Ej5fM();
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, mo267calculateTopPaddingD9Ej5fM, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String str2 = moneybotAmountInputViewModel.title;
                    String str3 = moneybotAmountInputViewModel.subtitle;
                    if (str2 == null && str3 == null) {
                        gapComposer2.startReplaceGroup(204433324);
                        gapComposer2.end(false);
                        f = 16.0f;
                        gapComposer = gapComposer2;
                        f2 = 0.0f;
                    } else {
                        gapComposer2.startReplaceGroup(203491544);
                        if (str2 == null) {
                            gapComposer2.startReplaceGroup(203495046);
                            gapComposer2.end(false);
                            str = str2;
                            f = 16.0f;
                            gapComposer = gapComposer2;
                            f2 = 0.0f;
                        } else {
                            gapComposer2.startReplaceGroup(203495047);
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                            Strings.getSizes(gapComposer2).getClass();
                            DefaultSizes.spacing.getClass();
                            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                            TextStyle textStyle = Strings.getTypography(gapComposer2).sectionTitle;
                            long j = Strings.getColors(gapComposer2).semantic.text.standard;
                            str = str2;
                            f = 16.0f;
                            f2 = RecyclerView.DECELERATION_RATE;
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer2, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            gapComposer = gapComposer2;
                            gapComposer.end(false);
                        }
                        if (str == null || str3 == null) {
                            gapComposer.startReplaceGroup(203987916);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(203901426);
                            Strings.getSizes(gapComposer).getClass();
                            DefaultSizes.spacing.getClass();
                            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
                            gapComposer.end(false);
                        }
                        if (str3 == null) {
                            gapComposer.startReplaceGroup(204024991);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(204024992);
                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                            Strings.getSizes(gapComposer).getClass();
                            DefaultSizes.spacing.getClass();
                            GapComposer gapComposer3 = gapComposer;
                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, Strings.getColors(gapComposer).semantic.text.placeholder, (Composer) gapComposer3, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, f, f2, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                            gapComposer = gapComposer3;
                            gapComposer.end(false);
                        }
                        re$$ExternalSyntheticOutline0.m(companion, 38.0f, gapComposer, false);
                    }
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth3, f, f2, 2);
                    long j2 = Strings.getColors(gapComposer).surface.keypad.text;
                    long j3 = Strings.getColors(gapComposer).surface.keypad.text;
                    long j4 = Strings.getTypography(gapComposer).numeralLarge.spanStyle.fontSize;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(14, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    AmountKeypadState amountKeypadState = this.f$1;
                    GapComposer gapComposer4 = gapComposer;
                    ReplaceModeKt.m4397AmountKeypadVjY4oTo(amountKeypadState, (Function1) rememberedValue, m300paddingVpY3zN4$default2, j2, j3, null, MoneybotAmountInputViewKt.f478lambda$318614778, 3, j4, gapComposer4, 12582912, 96);
                    Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer4), companion, 8.0f, gapComposer4);
                    DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(-1738685068, new MoneybotAmountInputViewKt$$ExternalSyntheticLambda2(moneybotAmountInputViewModel, function1, amountKeypadState), gapComposer4), gapComposer4, 24582, 14);
                    gapComposer4.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer2;
                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changedInstance = gapComposer5.changedInstance(moneybotAmountInputViewModel) | gapComposer5.changed(function1);
                    AmountKeypadState amountKeypadState2 = this.f$1;
                    boolean changed2 = changedInstance | gapComposer5.changed(amountKeypadState2);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda2(29, moneybotAmountInputViewModel, function1, amountKeypadState2);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth4, buttonProminence, false, true, null, Expect_jvmKt.rememberComposableLambda(1325901529, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(moneybotAmountInputViewModel, 22), gapComposer5), gapComposer5, 1597872, 40);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneybotAmountInputViewKt$$ExternalSyntheticLambda2(MoneybotAmountInputViewModel moneybotAmountInputViewModel, Function1 function1, AmountKeypadState amountKeypadState) {
        this.f$0 = moneybotAmountInputViewModel;
        this.f$2 = function1;
        this.f$1 = amountKeypadState;
    }
}
