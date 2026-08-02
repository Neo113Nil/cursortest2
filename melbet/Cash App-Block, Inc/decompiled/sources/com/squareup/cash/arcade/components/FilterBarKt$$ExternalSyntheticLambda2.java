package com.squareup.cash.arcade.components;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class FilterBarKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ Function0 f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ FilterBarKt$$ExternalSyntheticLambda2(Modifier modifier, long j, RoundedCornerShape roundedCornerShape, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, Function0 function0, Object obj, ComposableLambdaImpl composableLambdaImpl, FilterBarChipType filterBarChipType) {
        this.f$0 = modifier;
        this.f$1 = j;
        this.f$2 = roundedCornerShape;
        this.f$3 = mutableInteractionSourceImpl;
        this.f$4 = z;
        this.f$5 = function0;
        this.f$6 = obj;
        this.f$7 = composableLambdaImpl;
        this.f$8 = filterBarChipType;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$8;
        Object obj4 = this.f$7;
        Object obj5 = this.f$6;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        switch (i) {
            case 0:
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj7;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj6;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                FilterBarChipType filterBarChipType = (FilterBarChipType) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m275defaultMinSizeVpY3zN4 = SizeKt.m275defaultMinSizeVpY3zN4(this.f$0, 48.0f, 32.0f);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CopyCodeKt$$ExternalSyntheticLambda5(25);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m182clickableO2vRcR0$default(ClipKt.clip(ImageKt.m177backgroundbw27NRU(SemanticsModifierKt.semantics(m275defaultMinSizeVpY3zN4, true, (Function1) rememberedValue), this.f$1, roundedCornerShape), roundedCornerShape), mutableInteractionSourceImpl, (IndicationNodeFactory) gapComposer.consume(IndicationKt.LocalIndication), this.f$4, null, null, this.f$5, 24), 16.0f, 4.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, 1)), Alignment.Companion.CenterVertically, gapComposer, 54);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    FilterBarKt.FilterBarChipContent(obj5, composableLambdaImpl, gapComposer, 6);
                    if (filterBarChipType == FilterBarChipType.Dropdown) {
                        gapComposer.startReplaceGroup(158288543);
                        Icons icons = Icons.SubtleExpand16;
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new CopyCodeKt$$ExternalSyntheticLambda5(26);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        Trace.m1191Iconww6aTOc(icons, (String) null, SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue2), 0L, gapComposer, 54, 8);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(158454796);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                KeypadKt.m3644MooncakeSearchTextFieldj30j4ZQ((String) obj7, (Function1) obj6, this.f$0, (Function1) obj5, this.f$5, (TextStyle) obj4, this.f$1, this.f$4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FilterBarKt$$ExternalSyntheticLambda2(String str, Function1 function1, Modifier modifier, Function1 function12, Function0 function0, TextStyle textStyle, long j, boolean z, String str2, int i) {
        this.f$2 = str;
        this.f$3 = function1;
        this.f$0 = modifier;
        this.f$6 = function12;
        this.f$5 = function0;
        this.f$7 = textStyle;
        this.f$1 = j;
        this.f$4 = z;
        this.f$8 = str2;
    }
}
