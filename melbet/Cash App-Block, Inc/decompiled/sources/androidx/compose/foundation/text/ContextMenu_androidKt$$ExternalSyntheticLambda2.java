package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5$1$1$1$1$1$1;
import androidx.compose.foundation.text.selection.SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class ContextMenu_androidKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelectionManager f$0;
    public final /* synthetic */ ComposableLambdaImpl f$1;

    public /* synthetic */ ContextMenu_androidKt$$ExternalSyntheticLambda2(ComposableLambdaImpl composableLambdaImpl, SelectionManager selectionManager) {
        this.$r8$classId = 2;
        this.f$1 = composableLambdaImpl;
        this.f$0 = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Selection.AnchorInfo anchorInfo;
        MultiWidgetSelectionDelegate anchorSelectable$foundation;
        Selection.AnchorInfo anchorInfo2;
        MultiWidgetSelectionDelegate anchorSelectable$foundation2;
        int i = this.$r8$classId;
        SelectionManager selectionManager = this.f$0;
        ComposableLambdaImpl composableLambdaImpl = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                BasicTextKt.ContextMenuArea(selectionManager, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                BasicTextKt.CommonContextMenuArea(selectionManager, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(49));
                break;
            default:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 2;
                int i3 = 1;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer, (Object) 0);
                    if (selectionManager.isInTouchMode() && ((Boolean) selectionManager.hasFocus$delegate.getValue()).booleanValue()) {
                        Selection selection = selectionManager.getSelection();
                        if (!(selection == null ? true : Intrinsics.areEqual(selection.start, selection.end))) {
                            gapComposer.startReplaceGroup(-1736224054);
                            Selection selection2 = selectionManager.getSelection();
                            if (selection2 == null) {
                                gapComposer.startReplaceGroup(2011629175);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(2011629176);
                                gapComposer.startReplaceGroup(-1736222526);
                                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.TRUE, Boolean.FALSE});
                                int size = listOf.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    boolean booleanValue = ((Boolean) listOf.get(i4)).booleanValue();
                                    boolean changed = gapComposer.changed(booleanValue);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                    if (changed || rememberedValue == neverEqualPolicy) {
                                        rememberedValue = new SelectionManager$handleDragObserver$1(booleanValue, selectionManager);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                                    boolean changed2 = gapComposer.changed(booleanValue);
                                    Object rememberedValue2 = gapComposer.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = booleanValue ? new SelectionManager$$ExternalSyntheticLambda0(selectionManager, i2) : new SelectionManager$$ExternalSyntheticLambda0(selectionManager, i3);
                                        gapComposer.updateRememberedValue(rememberedValue2);
                                    }
                                    Function0 function0 = (Function0) rememberedValue2;
                                    ResolvedTextDirection resolvedTextDirection = booleanValue ? selection2.start.direction : selection2.end.direction;
                                    float f = RecyclerView.DECELERATION_RATE;
                                    if (booleanValue) {
                                        Selection selection3 = selectionManager.getSelection();
                                        if (selection3 != null && (anchorSelectable$foundation2 = selectionManager.getAnchorSelectable$foundation((anchorInfo2 = selection3.start))) != null) {
                                            int i5 = anchorInfo2.offset;
                                            TextLayoutResult textLayoutResult = (TextLayoutResult) anchorSelectable$foundation2.layoutResultCallback.invoke();
                                            if (textLayoutResult != null) {
                                                f = KeyMappingKt.getLineHeight(textLayoutResult, i5);
                                            }
                                        }
                                    } else {
                                        Selection selection4 = selectionManager.getSelection();
                                        if (selection4 != null && (anchorSelectable$foundation = selectionManager.getAnchorSelectable$foundation((anchorInfo = selection4.end))) != null) {
                                            int i6 = anchorInfo.offset;
                                            TextLayoutResult textLayoutResult2 = (TextLayoutResult) anchorSelectable$foundation.layoutResultCallback.invoke();
                                            if (textLayoutResult2 != null) {
                                                f = KeyMappingKt.getLineHeight(textLayoutResult2, i6);
                                            }
                                        }
                                    }
                                    int i7 = i4;
                                    SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 = new SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(function0);
                                    boolean z = selection2.handlesCrossed;
                                    boolean changedInstance = gapComposer.changedInstance(textDragObserver);
                                    Object rememberedValue3 = gapComposer.rememberedValue();
                                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                                        rememberedValue3 = new SelectionContainerKt$SelectionContainer$5$1$1$1$1$1$1(textDragObserver, 0);
                                        gapComposer.updateRememberedValue(rememberedValue3);
                                    }
                                    SimpleLayoutKt.m447SelectionHandlewLIcFTc(selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0, booleanValue, resolvedTextDirection, z, 0L, f, SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion.$$INSTANCE, textDragObserver, (PointerInputEventHandler) rememberedValue3), gapComposer, 0, 16);
                                    i4 = i7 + 1;
                                    i2 = 2;
                                    i3 = 1;
                                }
                                gapComposer.end(false);
                                gapComposer.end(false);
                            }
                            gapComposer.end(false);
                        }
                    }
                    gapComposer.startReplaceGroup(2013602667);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ContextMenu_androidKt$$ExternalSyntheticLambda2(SelectionManager selectionManager, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = selectionManager;
        this.f$1 = composableLambdaImpl;
    }
}
