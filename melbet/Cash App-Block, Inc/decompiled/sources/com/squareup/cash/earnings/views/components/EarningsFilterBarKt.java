package com.squareup.cash.earnings.views.components;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class EarningsFilterBarKt {
    public static final DateTimeFormatter abbreviatedMonthFormatter = DateTimeFormatter.ofPattern("MMM", Locale.US);

    public static final void EarningsFilterBar(List list, DateFilter dateFilter, Function1 function1, Modifier modifier, Function0 function0, boolean z, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer;
        Function0 function02;
        Modifier modifier3;
        Function0 function03;
        list.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-189242945);
        int i4 = i | (gapComposer2.changedInstance(list) ? 4 : 2) | (gapComposer2.changedInstance(dateFilter) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer2.changed(modifier2) ? 2048 : 1024);
        }
        int i6 = i3 | 24576;
        if (gapComposer2.shouldExecute(i6 & 1, (74899 & i6) != 74898)) {
            modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new Recipient$$ExternalSyntheticLambda2(14);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function0 function04 = (Function0) rememberedValue;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier3, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.Top, gapComposer2, 6);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
            boolean changedInstance = gapComposer2.changedInstance(list) | ((i6 & 896) == 256) | gapComposer2.changedInstance(dateFilter);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(list, z, function04, dateFilter, function1, 5);
                function03 = function04;
                gapComposer2.updateRememberedValue(menuKt$$ExternalSyntheticLambda0);
                rememberedValue2 = menuKt$$ExternalSyntheticLambda0;
            } else {
                function03 = function04;
            }
            gapComposer = gapComposer2;
            FilterBarKt.FilterBar(null, null, null, (Function1) rememberedValue2, gapComposer, 0, 7);
            gapComposer.end(true);
            function02 = function03;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            function02 = function0;
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(list, dateFilter, function1, modifier3, function02, z, i, i2);
        }
    }
}
