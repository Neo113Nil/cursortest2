package com.squareup.cash.arcade.treehouse;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class RadioSelectionGroupBinding$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ RadioSelectionGroupBinding f$0;

    public /* synthetic */ RadioSelectionGroupBinding$$ExternalSyntheticLambda0(RadioSelectionGroupBinding radioSelectionGroupBinding) {
        this.f$0 = radioSelectionGroupBinding;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        RadioSelectionGroupBinding radioSelectionGroupBinding = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = RadioSelectionGroupBinding.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
                    gapComposer.startReplaceGroup(-155030642);
                    int i3 = 0;
                    for (Object obj3 : (List) radioSelectionGroupBinding.options$delegate.getValue()) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        FormBlocker.Element.OptionPickerElement.Option option = (FormBlocker.Element.OptionPickerElement.Option) obj3;
                        boolean changedInstance = gapComposer.changedInstance(radioSelectionGroupBinding) | gapComposer.changedInstance(option);
                        Object rememberedValue = gapComposer.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new BadgeQueries$$ExternalSyntheticLambda0(12, radioSelectionGroupBinding, option);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Function1 function1 = (Function1) rememberedValue;
                        boolean changedInstance2 = gapComposer.changedInstance(radioSelectionGroupBinding) | gapComposer.changed(i3) | gapComposer.changedInstance(option);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new PoolGoalMetKt$$ExternalSyntheticLambda6(radioSelectionGroupBinding, i3, option, 6);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        AndroidView_androidKt.AndroidView(function1, null, (Function1) rememberedValue2, gapComposer, 0, 2);
                        i3 = i4;
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                int i5 = RadioSelectionGroupBinding.$r8$clinit;
                radioSelectionGroupBinding.Content(composer, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RadioSelectionGroupBinding$$ExternalSyntheticLambda0(RadioSelectionGroupBinding radioSelectionGroupBinding, int i) {
        this.f$0 = radioSelectionGroupBinding;
    }
}
