package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.components.CopyCodeKt;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeFormCopyableElementGroup$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ArcadeFormCopyableElementGroup f$0;

    public /* synthetic */ ArcadeFormCopyableElementGroup$$ExternalSyntheticLambda0(ArcadeFormCopyableElementGroup arcadeFormCopyableElementGroup) {
        this.f$0 = arcadeFormCopyableElementGroup;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ArcadeFormCopyableElementGroup arcadeFormCopyableElementGroup = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(function0);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer.startReplaceGroup(-583928495);
                    List<FormBlocker.Element.CopyableElementGroup.CopyableElement> list = arcadeFormCopyableElementGroup.elementGroup.elements;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        FormBlocker.Element.CopyableElementGroup.CopyableElement copyableElement = list.get(i2);
                        String str = copyableElement.formatted_value;
                        if (str == null) {
                            str = copyableElement.value;
                            str.getClass();
                        }
                        String str2 = str;
                        String str3 = copyableElement.label;
                        str3.getClass();
                        String str4 = copyableElement.accessibility_text;
                        boolean changedInstance = gapComposer.changedInstance(copyableElement);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda2(copyableElement, 5);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        CopyCodeKt.CopyCode(str2, str3, str4, null, null, (Function1) rememberedValue, gapComposer, 0, 120);
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                arcadeFormCopyableElementGroup.Content(composer, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ArcadeFormCopyableElementGroup$$ExternalSyntheticLambda0(ArcadeFormCopyableElementGroup arcadeFormCopyableElementGroup, int i) {
        this.f$0 = arcadeFormCopyableElementGroup;
    }
}
