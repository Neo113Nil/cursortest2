package com.squareup.cash.formview.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.platform.AbstractComposeView;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import coil3.RealImageLoader;
import com.squareup.cash.formview.components.arcade.AccessoryCheckedState;
import com.squareup.cash.formview.components.arcade.ArcadeFormCellDefaultElementKt;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes6.dex */
public final class FormElementViewBuilder$toView$46 extends AbstractComposeView implements FormRequirementProvider {
    public final /* synthetic */ SnapshotStateMap $cellDefaultGroupedCheckSelection;
    public final /* synthetic */ FormBlocker.Element.CellDefaultElement $element;
    public final /* synthetic */ String $formElementId;
    public final ParcelableSnapshotMutableState checked;
    public final /* synthetic */ FormElementViewBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FormElementViewBuilder$toView$46(FormBlocker.Element.CellDefaultElement cellDefaultElement, String str, SnapshotStateMap snapshotStateMap, FormElementViewBuilder formElementViewBuilder, Context context) {
        super(context, null, 6, 0);
        CellDefault.CellDefaultAccessory cellDefaultAccessory;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        this.$element = cellDefaultElement;
        this.$formElementId = str;
        this.$cellDefaultGroupedCheckSelection = snapshotStateMap;
        this.this$0 = formElementViewBuilder;
        Object obj = null;
        CellDefault cellDefault = cellDefaultElement.cell;
        if (cellDefault != null && (cellDefaultAccessory = cellDefault.accessory) != null) {
            Boolean bool4 = cellDefaultElement.initial_selection;
            boolean booleanValue = bool4 != null ? bool4.booleanValue() : false;
            CellDefault.CellDefaultAccessory.Type type2 = cellDefaultAccessory.type;
            if (type2 != null) {
                CellDefault.CellDefaultAccessory.Type.Checkbox checkbox = type2 instanceof CellDefault.CellDefaultAccessory.Type.Checkbox ? (CellDefault.CellDefaultAccessory.Type.Checkbox) type2 : null;
                if (checkbox != null) {
                    bool = Boolean.valueOf(checkbox.getValue());
                    if (bool == null) {
                        obj = new AccessoryCheckedState.Checkbox(booleanValue);
                    } else {
                        CellDefault.CellDefaultAccessory.Type type3 = cellDefaultAccessory.type;
                        if (type3 != null) {
                            CellDefault.CellDefaultAccessory.Type.Radio radio = type3 instanceof CellDefault.CellDefaultAccessory.Type.Radio ? (CellDefault.CellDefaultAccessory.Type.Radio) type3 : null;
                            if (radio != null) {
                                bool2 = Boolean.valueOf(radio.getValue());
                                if (bool2 == null) {
                                    obj = new AccessoryCheckedState.Radio(booleanValue);
                                } else {
                                    CellDefault.CellDefaultAccessory.Type type4 = cellDefaultAccessory.type;
                                    if (type4 != null) {
                                        CellDefault.CellDefaultAccessory.Type.Toggle toggle = type4 instanceof CellDefault.CellDefaultAccessory.Type.Toggle ? (CellDefault.CellDefaultAccessory.Type.Toggle) type4 : null;
                                        if (toggle != null) {
                                            bool3 = Boolean.valueOf(toggle.getValue());
                                            if (bool3 != null) {
                                                obj = new AccessoryCheckedState.Toggle(booleanValue);
                                            }
                                        }
                                    }
                                    bool3 = null;
                                    if (bool3 != null) {
                                    }
                                }
                            }
                        }
                        bool2 = null;
                        if (bool2 == null) {
                        }
                    }
                }
            }
            bool = null;
            if (bool == null) {
            }
        }
        this.checked = Updater.mutableStateOf$default(obj);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        FormElementViewBuilder$toView$46 formElementViewBuilder$toView$46;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1470133463);
        updateSingleSelectionCheckedState();
        FormBlocker.Element.CellDefaultElement cellDefaultElement = this.$element;
        boolean changedInstance = gapComposer.changedInstance(cellDefaultElement);
        SnapshotStateMap snapshotStateMap = this.$cellDefaultGroupedCheckSelection;
        boolean changed = changedInstance | gapComposer.changed(snapshotStateMap);
        String str = this.$formElementId;
        boolean changed2 = changed | gapComposer.changed(str) | gapComposer.changedInstance(this);
        FormElementViewBuilder formElementViewBuilder = this.this$0;
        boolean changedInstance2 = changed2 | gapComposer.changedInstance(formElementViewBuilder);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue == Composer.Companion.Empty) {
            formElementViewBuilder$toView$46 = this;
            OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(cellDefaultElement, snapshotStateMap, str, formElementViewBuilder$toView$46, formElementViewBuilder, 21);
            gapComposer.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
            rememberedValue = overlayKt$$ExternalSyntheticLambda3;
        } else {
            formElementViewBuilder$toView$46 = this;
        }
        RealImageLoader realImageLoader = formElementViewBuilder.imageLoader;
        ArcadeFormCellDefaultElementKt.ArcadeFormCellDefaultElement(str, cellDefaultElement, formElementViewBuilder$toView$46.checked, (Function1) rememberedValue, realImageLoader, gapComposer, 0);
        gapComposer.end(false);
    }

    @Override // com.squareup.cash.formview.components.FormRequirementProvider
    public final Flow requirements() {
        FormBlocker.Element.CellDefaultElement cellDefaultElement = this.$element;
        return (cellDefaultElement.selection_group_id == null || !(this.checked.getValue() instanceof AccessoryCheckedState.Radio)) ? new AppLockMonitor$special$$inlined$map$2(EmptyList.INSTANCE, 19) : Updater.snapshotFlow(new GLSceneScope$$ExternalSyntheticLambda2(11, this.$cellDefaultGroupedCheckSelection, cellDefaultElement, this.$formElementId));
    }

    public final void updateSingleSelectionCheckedState() {
        String str;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.checked;
        if ((parcelableSnapshotMutableState.getValue() instanceof AccessoryCheckedState.Radio) && (str = this.$element.selection_group_id) != null) {
            boolean areEqual = Intrinsics.areEqual(this.$cellDefaultGroupedCheckSelection.get(str), this.$formElementId);
            AccessoryCheckedState accessoryCheckedState = (AccessoryCheckedState) parcelableSnapshotMutableState.getValue();
            parcelableSnapshotMutableState.setValue(accessoryCheckedState != null ? accessoryCheckedState.withChecked(areEqual) : null);
        }
    }
}
