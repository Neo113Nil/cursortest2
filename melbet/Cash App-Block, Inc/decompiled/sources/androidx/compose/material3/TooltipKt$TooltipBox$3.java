package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.google.firebase.messaging.RemoteMessage;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentEntrypointButtonViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$2$1$1;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.ui.gcm.PushMessagingService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class TooltipKt$TooltipBox$3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $scope;
    public final /* synthetic */ Object $tooltip;
    public final /* synthetic */ Object $transition;

    public TooltipKt$TooltipBox$3(ComposableLambdaImpl composableLambdaImpl, Function2 function2, ComposableLambdaImpl composableLambdaImpl2) {
        this.$r8$classId = 1;
        this.$tooltip = composableLambdaImpl;
        this.$transition = function2;
        this.$scope = composableLambdaImpl2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.$scope;
        Object obj4 = this.$tooltip;
        Object obj5 = this.$transition;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier composed = PlatformKt.composed(companion, new TooltipKt$animateTooltip$2((Transition) obj5, 0));
                    ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                    TooltipScopeImpl tooltipScopeImpl = (TooltipScopeImpl) obj3;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, composed);
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
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke((Object) tooltipScopeImpl, (Object) gapComposer, (Object) 6);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj4;
                    Function2 function2 = (Function2) obj5;
                    ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj3;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Start, gapComposer2, 6);
                    int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer2);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer2, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$14);
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                    Modifier weight = columnScopeInstance.weight(1.0f, companion, false);
                    BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int currentCompositeKeyHash3 = Updater.getCurrentCompositeKeyHash(gapComposer2);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, weight);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
                    if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash3, gapComposer2, currentCompositeKeyHash3, composeUiNode$Companion$SetModifier$14);
                    }
                    Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$15);
                    Recorder$$ExternalSyntheticOutline1.m(6, composableLambdaImpl2, columnScopeInstance, gapComposer2, true);
                    Modifier padding = SpacerKt.padding(columnScopeInstance.align(companion, Alignment.Companion.End), DatePickerDialog_androidKt.DialogButtonsPadding);
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int currentCompositeKeyHash4 = Updater.getCurrentCompositeKeyHash(gapComposer2);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, padding);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$13);
                    if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash4, gapComposer2, currentCompositeKeyHash4, composeUiNode$Companion$SetModifier$14);
                    }
                    Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$15);
                    Icons$Filled.m567ProvideContentColorTextStyle3JVO9M(ColorSchemeKt.getValue(DialogTokens.ActionLabelTextColor, gapComposer2), TypographyKt.getValue(DialogTokens.ActionLabelTextFont, gapComposer2), Expect_jvmKt.rememberComposableLambda(-1103927529, new DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1(function2, composableLambdaImpl3, 0), gapComposer2), gapComposer2, MLKEMEngine.KyberPolyBytes);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Number) obj2).intValue();
                DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) obj5;
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    DatePickerDefaults.INSTANCE.m522DatePickerHeadlineISIPfiY(datePickerStateImpl.getSelectedDateMillis(), datePickerStateImpl.m529getDisplayModejFl4v0(), (DatePickerFormatterImpl) obj4, SpacerKt.padding(companion, DatePickerKt.DatePickerHeadlinePadding), ((DatePickerColors) obj3).headlineContentColor, gapComposer3, 199680);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Number) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default((Modifier) obj5, RecyclerView.DECELERATION_RATE, 8.0f, 1);
                    IntrinsicSize intrinsicSize = IntrinsicSize.Min;
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(OffsetKt.width(m300paddingVpY3zN4$default), (ScrollState) obj3, false, 14);
                    ComposableLambdaImpl composableLambdaImpl4 = (ComposableLambdaImpl) obj4;
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int currentCompositeKeyHash5 = Updater.getCurrentCompositeKeyHash(gapComposer4);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer4, verticalScroll$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer4.inserting || !Intrinsics.areEqual(gapComposer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash5, gapComposer4, currentCompositeKeyHash5, composeUiNode$Companion$SetModifier$16);
                    }
                    Updater.m576setimpl(gapComposer4, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline1.m(6, composableLambdaImpl4, columnScopeInstance, gapComposer4, true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Number) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (!(((double) 1.0f) > 0.0d)) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ((Function2) obj5) != null ? 12.0f : 0.0f, RecyclerView.DECELERATION_RATE, ((Function2) obj3) != null ? 12.0f : 0.0f, RecyclerView.DECELERATION_RATE, 10);
                    ComposableLambdaImpl composableLambdaImpl5 = (ComposableLambdaImpl) obj4;
                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int currentCompositeKeyHash6 = Updater.getCurrentCompositeKeyHash(gapComposer5);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer5, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer5.inserting || !Intrinsics.areEqual(gapComposer5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash6, gapComposer5, currentCompositeKeyHash6, composeUiNode$Companion$SetModifier$17);
                    }
                    Updater.m576setimpl(gapComposer5, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl5, gapComposer5, true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Number) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    JsonElementBuildersKt.m4211MarkdownBasicTextJAgEBs0((String) obj5, (TextStyle) obj4, SpacerKt.padding(ImageKt.scroll$default(companion, ImageKt.rememberScrollState(gapComposer6), true, false), (PaddingValuesImpl) obj3), 0L, 0L, 0L, 0L, 0, false, 0, 0, gapComposer6, 0, 131064);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Number) obj2).intValue();
                Function1 function1 = (Function1) obj4;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean changed = gapComposer7.changed(delegatingSoftwareKeyboardController) | gapComposer7.changed(function1);
                    Object rememberedValue = gapComposer7.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new QuickPayViewKt$QuickPay$1$1$1$2$1$2$1$1(delegatingSoftwareKeyboardController, function1, 0);
                        gapComposer7.updateRememberedValue(rememberedValue);
                    }
                    PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel = ((QuickPayViewModel.Ready) obj3).personalizePaymentButtonState;
                    AlphaKt.PersonalizePaymentButton(null, (Function0) rememberedValue, personalizePaymentEntrypointButtonViewModel.enabled, personalizePaymentEntrypointButtonViewModel.animate, personalizePaymentEntrypointButtonViewModel.animation, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) obj2;
                coroutineScope.getClass();
                variantSandboxedComponent.getClass();
                JobKt.launch$default(coroutineScope, null, null, new TaxWebAppPresenter$models$1$1(variantSandboxedComponent, (CoroutineScope) obj5, (Continuation) null, (RemoteMessage) obj4, (PushMessagingService) obj3), 3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TooltipKt$TooltipBox$3(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.$transition = obj;
        this.$tooltip = obj2;
        this.$scope = obj3;
    }

    public /* synthetic */ TooltipKt$TooltipBox$3(Object obj, Object obj2, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = i;
        this.$transition = obj;
        this.$scope = obj2;
        this.$tooltip = composableLambdaImpl;
    }
}
