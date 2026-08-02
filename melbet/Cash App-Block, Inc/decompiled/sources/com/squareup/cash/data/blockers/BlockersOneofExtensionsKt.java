package com.squareup.cash.data.blockers;

import com.squareup.protos.franklin.api.BlockerAction;

/* loaded from: classes8.dex */
public abstract class BlockersOneofExtensionsKt {
    public static BlockerAction BlockerAction$default(BlockerAction.EndFlowAction endFlowAction, BlockerAction.SubmitAction submitAction, int i) {
        String str = null;
        if ((i & 1) != 0) {
            endFlowAction = null;
        }
        if ((i & 2) != 0) {
            submitAction = null;
        }
        return new BlockerAction(str, endFlowAction != null ? new BlockerAction.Action.EndFlowAction(endFlowAction) : submitAction != null ? new BlockerAction.Action.SubmitAction(submitAction) : null, 23);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BlockerAction copy$default(int i, BlockerAction blockerAction) {
        BlockerAction.ConfirmationDialog confirmationDialog;
        BlockerAction.ConfirmationSheet confirmationSheet;
        BlockerAction.ConfirmationElement confirmationElement;
        BlockerAction.ConfirmationElement.ConfirmationSheet confirmationSheet2;
        BlockerAction.ConfirmationElement confirmationElement2;
        if ((i & 1) != 0 && (confirmationElement2 = blockerAction.confirmation_element) != null) {
            BlockerAction.ConfirmationElement.ConfirmationDialog confirmationDialog2 = confirmationElement2 instanceof BlockerAction.ConfirmationElement.ConfirmationDialog ? (BlockerAction.ConfirmationElement.ConfirmationDialog) confirmationElement2 : null;
            if (confirmationDialog2 != null) {
                confirmationDialog = confirmationDialog2.getValue();
                if ((i & 2) != 0 && (confirmationElement = blockerAction.confirmation_element) != null) {
                    confirmationSheet2 = !(confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationSheet) ? (BlockerAction.ConfirmationElement.ConfirmationSheet) confirmationElement : null;
                    if (confirmationSheet2 != null) {
                        confirmationSheet = confirmationSheet2.getValue();
                        blockerAction.getClass();
                        return BlockerAction.copy$default(blockerAction, confirmationDialog != null ? new BlockerAction.ConfirmationElement.ConfirmationDialog(confirmationDialog) : confirmationSheet != null ? new BlockerAction.ConfirmationElement.ConfirmationSheet(confirmationSheet) : null, null, 27);
                    }
                }
                confirmationSheet = null;
                blockerAction.getClass();
                return BlockerAction.copy$default(blockerAction, confirmationDialog != null ? new BlockerAction.ConfirmationElement.ConfirmationDialog(confirmationDialog) : confirmationSheet != null ? new BlockerAction.ConfirmationElement.ConfirmationSheet(confirmationSheet) : null, null, 27);
            }
        }
        confirmationDialog = null;
        if ((i & 2) != 0) {
            if (!(confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationSheet)) {
            }
            if (confirmationSheet2 != null) {
            }
        }
        confirmationSheet = null;
        blockerAction.getClass();
        return BlockerAction.copy$default(blockerAction, confirmationDialog != null ? new BlockerAction.ConfirmationElement.ConfirmationDialog(confirmationDialog) : confirmationSheet != null ? new BlockerAction.ConfirmationElement.ConfirmationSheet(confirmationSheet) : null, null, 27);
    }
}
