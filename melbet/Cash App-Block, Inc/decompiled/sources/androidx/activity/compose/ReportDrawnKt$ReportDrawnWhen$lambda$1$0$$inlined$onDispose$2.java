package androidx.activity.compose;

import android.view.ActionMode;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.platform.DisposableSaveableStateRegistry;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes.dex */
public final class ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2 implements DisposableEffectResult {
    public final /* synthetic */ Object $compositionDrawn$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2(Object obj, int i) {
        this.$r8$classId = i;
        this.$compositionDrawn$inlined = obj;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        StandaloneCoroutine standaloneCoroutine;
        int i = this.$r8$classId;
        Object obj = this.$compositionDrawn$inlined;
        switch (i) {
            case 0:
                ((ReportDrawnComposition) obj).removeReporter();
                break;
            case 1:
                Transition transition = (Transition) obj;
                transition.onTransitionEnd$animation_core();
                transition.transitionState.transitionRemoved$animation_core();
                break;
            case 2:
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) obj;
                TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = textFieldSelectionState.toolbarRequester.toolbarHandlerNode;
                if (textContextMenuToolbarHandlerNode != null && (standaloneCoroutine = textContextMenuToolbarHandlerNode.textToolbarJob) != null) {
                    standaloneCoroutine.cancel(null);
                    textContextMenuToolbarHandlerNode.textToolbarJob = null;
                }
                textFieldSelectionState.hapticFeedBack = null;
                break;
            case 3:
                AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = (AndroidTextContextMenuToolbarProvider) obj;
                SnapshotStateObserver snapshotStateObserver = androidTextContextMenuToolbarProvider.snapshotStateObserver;
                snapshotStateObserver.stop();
                snapshotStateObserver.clear();
                ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
                if (actionMode != null) {
                    actionMode.finish();
                }
                androidTextContextMenuToolbarProvider.actionMode = null;
                break;
            case 4:
                BasicTextContextMenuProvider.SessionImpl sessionImpl = (BasicTextContextMenuProvider.SessionImpl) ((BasicTextContextMenuProvider) obj).session$delegate.getValue();
                if (sessionImpl != null) {
                    sessionImpl.close();
                    break;
                }
                break;
            default:
                ((DisposableSaveableStateRegistry) obj).onDispose.invoke();
                break;
        }
    }
}
