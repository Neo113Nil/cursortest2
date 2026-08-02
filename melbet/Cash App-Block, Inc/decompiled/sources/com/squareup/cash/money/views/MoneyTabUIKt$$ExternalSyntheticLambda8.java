package com.squareup.cash.money.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda36;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda37;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda1;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda20;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda8 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$4;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda8(MoneyTabModel moneyTabModel, UiScope uiScope, Function1 function1, ElementBoundsRegistry elementBoundsRegistry, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = moneyTabModel;
        this.f$1 = uiScope;
        this.f$2 = function1;
        this.f$3 = elementBoundsRegistry;
        this.f$4 = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$2;
        Object obj4 = this.f$3;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                MoneyTabModel moneyTabModel = (MoneyTabModel) obj6;
                UiScope uiScope = (UiScope) obj5;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj4;
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier testTag = TestTagKt.testTag(companion, "money_tab");
                MoneyTabModel.Loading loading = moneyTabModel instanceof MoneyTabModel.Loading ? (MoneyTabModel.Loading) moneyTabModel : null;
                MoneyTabUIKt.MoneyTabLoading(uiScope, testTag, moneyTabModel.getTabToolbarModel(), moneyTabModel.getTabTitle(), loading != null ? loading.useRedesignedTiles : false, this.f$2, elementBoundsRegistry, this.f$4, composer, 48);
                return Unit.INSTANCE;
            case 1:
                ArrayList arrayList = (ArrayList) obj6;
                Function0 function0 = (Function0) obj5;
                String str = (String) obj4;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                int i3 = 2;
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer2;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    gapComposer.startReplaceGroup(1864055184);
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        LocalFulfillmentType localFulfillmentType = (LocalFulfillmentType) arrayList.get(i4);
                        Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, r3);
                        boolean changed = gapComposer.changed(localFulfillmentType.ordinal()) | gapComposer.changed(function1);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda36(function1, localFulfillmentType, 2);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, null, false, false, null, Expect_jvmKt.rememberComposableLambda(722380512, new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda37(localFulfillmentType, i3), gapComposer), gapComposer, 1572864, 60);
                        i4++;
                        r3 = 1.0f;
                    }
                    gapComposer.end(false);
                    SizeKt.ButtonCta(function0, adaptiveStackScope.horizontalWeight(companion, 1.0f), ButtonProminence.PROMINENT, false, this.f$4, null, Expect_jvmKt.rememberComposableLambda(1181172794, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, 6), gapComposer), gapComposer, 1573248, 40);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                TextFieldState textFieldState = (TextFieldState) obj6;
                FocusRequester focusRequester = (FocusRequester) obj5;
                Function0 function02 = (Function0) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer3;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    boolean z = this.f$4;
                    if (z) {
                        gapComposer2.startReplaceGroup(-463640157);
                        gapComposer2.end(false);
                        f = RecyclerView.DECELERATION_RATE;
                    } else {
                        gapComposer2.startReplaceGroup(-463639065);
                        ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                        gapComposer2.end(false);
                        f = 16.0f;
                    }
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, 10);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
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
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    if (!(((double) 1.0f) > 0.0d)) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    QuickPayViewKt.SheetTextFieldFocusKeyboardWrapper(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, Expect_jvmKt.rememberComposableLambda(2047057430, new PdfPreviewView$$ExternalSyntheticLambda1(13, textFieldState, focusRequester, function1), gapComposer2), gapComposer2, MLKEMEngine.KyberPolyBytes, 2);
                    AnimatedContentKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, Expect_jvmKt.rememberComposableLambda(1084635805, new ActionPillKt$$ExternalSyntheticLambda0(1, function02), gapComposer2), (Composer) gapComposer2, 1600518, 18);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ClockInOverlayViewModel.PickerItem pickerItem = (ClockInOverlayViewModel.PickerItem) obj6;
                MutableState mutableState = (MutableState) obj5;
                String str2 = (String) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer4;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean z2 = this.f$4;
                    boolean z3 = (z2 || pickerItem == null || !pickerItem.isEnabled) ? false : true;
                    boolean changed2 = gapComposer3.changed(mutableState) | gapComposer3.changed(function1);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CashtagViewKt$$ExternalSyntheticLambda13(mutableState, function1, 21);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue2, null, buttonProminence, false, z3, null, Expect_jvmKt.rememberComposableLambda(-368051000, new SelectPaymentPlanViewKt$$ExternalSyntheticLambda20(str2, i2, z2), gapComposer3), gapComposer3, 1573248, 42);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda8(ArrayList arrayList, Function0 function0, boolean z, Function1 function1, String str) {
        this.$r8$classId = 1;
        this.f$0 = arrayList;
        this.f$1 = function0;
        this.f$4 = z;
        this.f$2 = function1;
        this.f$3 = str;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda8(boolean z, Object obj, Object obj2, Function1 function1, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$4 = z;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = function1;
        this.f$3 = obj3;
    }
}
