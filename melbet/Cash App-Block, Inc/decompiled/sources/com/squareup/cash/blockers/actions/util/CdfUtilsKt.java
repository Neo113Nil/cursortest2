package com.squareup.cash.blockers.actions.util;

import com.squareup.cash.cdf.BlockerAction;
import com.squareup.protos.franklin.api.BlockerAction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class CdfUtilsKt {
    public static final BlockerAction toCdfBlockerAction(com.squareup.protos.franklin.api.BlockerAction blockerAction) {
        blockerAction.getClass();
        BlockerAction.ConfirmationElement confirmationElement = blockerAction.confirmation_element;
        if (confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationDialog) {
            return com.squareup.cash.cdf.BlockerAction.CONFIRMATION_DIALOG_FIRST;
        }
        if (confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationSheet) {
            return com.squareup.cash.cdf.BlockerAction.CONFIRMATION_SHEET_FIRST;
        }
        if (!(confirmationElement instanceof BlockerAction.ConfirmationElement.ConditionalConfirmation) && confirmationElement != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        BlockerAction.Action action = blockerAction.action;
        if (action instanceof BlockerAction.Action.BackNavigationAction) {
            return com.squareup.cash.cdf.BlockerAction.BACK_NAVIGATION_ACTION;
        }
        if (action instanceof BlockerAction.Action.CopyAction) {
            return com.squareup.cash.cdf.BlockerAction.COPY_ACTION;
        }
        if (action instanceof BlockerAction.Action.DialogAction) {
            return com.squareup.cash.cdf.BlockerAction.DIALOG_ACTION;
        }
        if (action instanceof BlockerAction.Action.EndActivityAction) {
            return com.squareup.cash.cdf.BlockerAction.END_ACTIVITY_WITH_RESULT_ACTION;
        }
        if (action instanceof BlockerAction.Action.EndFlowAction) {
            return com.squareup.cash.cdf.BlockerAction.END_FLOW_ACTION;
        }
        if (action instanceof BlockerAction.Action.InternalNavigationAction) {
            return com.squareup.cash.cdf.BlockerAction.INTERNAL_NAVIGATION_ACTION;
        }
        if (action instanceof BlockerAction.Action.MenuAction) {
            return com.squareup.cash.cdf.BlockerAction.MENU_ACTION;
        }
        if (action instanceof BlockerAction.Action.OpenUrlAction) {
            return com.squareup.cash.cdf.BlockerAction.OPEN_URL_ACTION;
        }
        if (action instanceof BlockerAction.Action.ShareAction) {
            return com.squareup.cash.cdf.BlockerAction.SHARE_FILE_ACTION;
        }
        if (action instanceof BlockerAction.Action.ShareTextAction) {
            return com.squareup.cash.cdf.BlockerAction.SHARE_TEXT_ACTION;
        }
        if (action instanceof BlockerAction.Action.SignOutAction) {
            return com.squareup.cash.cdf.BlockerAction.SIGN_OUT_ACTION;
        }
        if (action instanceof BlockerAction.Action.SkipBlockerAction) {
            return com.squareup.cash.cdf.BlockerAction.SKIP_BLOCKER_ACTION;
        }
        if (action instanceof BlockerAction.Action.SubmitAction) {
            return com.squareup.cash.cdf.BlockerAction.SUBMIT_ACTION;
        }
        if (action instanceof BlockerAction.Action.ViewAction) {
            return com.squareup.cash.cdf.BlockerAction.VIEW_ACTION;
        }
        if (action instanceof BlockerAction.Action.DelayedAction) {
            return com.squareup.cash.cdf.BlockerAction.DELAYED_ACTION;
        }
        if (action instanceof BlockerAction.Action.HapticFeedbackAction) {
            return com.squareup.cash.cdf.BlockerAction.HAPTIC_FEEDBACK;
        }
        if (action instanceof BlockerAction.Action.ShowOverlayScreenAction) {
            return com.squareup.cash.cdf.BlockerAction.SHOW_OVERLAY_SCREEN;
        }
        if (action instanceof BlockerAction.Action.OpenExternalUrlAndSubmitAction) {
            return null;
        }
        if ((action instanceof BlockerAction.Action.AdvanceAction) || (action instanceof BlockerAction.Action.ChangeElementTextAction) || (action instanceof BlockerAction.Action.RetreatAction) || action == null) {
            Path$$ExternalSyntheticBUOutline0.m$1(blockerAction, "Unknown BlockerAction: ");
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
