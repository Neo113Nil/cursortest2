package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BlockerAction {
    public static final /* synthetic */ BlockerAction[] $VALUES;
    public static final BlockerAction BACK_NAVIGATION_ACTION;
    public static final BlockerAction CANCEL_DIALOG;
    public static final BlockerAction CONFIRMATION_DIALOG_FIRST;
    public static final BlockerAction CONFIRMATION_SHEET_FIRST;
    public static final BlockerAction COPY_ACTION;
    public static final BlockerAction DELAYED_ACTION;
    public static final BlockerAction DIALOG_ACTION;
    public static final BlockerAction END_ACTIVITY_WITH_RESULT_ACTION;
    public static final BlockerAction END_FLOW_ACTION;
    public static final BlockerAction HAPTIC_FEEDBACK;
    public static final BlockerAction INTERNAL_NAVIGATION_ACTION;
    public static final BlockerAction MENU_ACTION;
    public static final BlockerAction OPEN_URL_ACTION;
    public static final BlockerAction SHARE_FILE_ACTION;
    public static final BlockerAction SHARE_TEXT_ACTION;
    public static final BlockerAction SHOW_OVERLAY_SCREEN;
    public static final BlockerAction SIGN_OUT_ACTION;
    public static final BlockerAction SKIP_BLOCKER_ACTION;
    public static final BlockerAction SUBMIT_ACTION;
    public static final BlockerAction VIEW_ACTION;

    static {
        BlockerAction blockerAction = new BlockerAction("END_FLOW_ACTION", 0);
        END_FLOW_ACTION = blockerAction;
        BlockerAction blockerAction2 = new BlockerAction("MENU_ACTION", 1);
        MENU_ACTION = blockerAction2;
        BlockerAction blockerAction3 = new BlockerAction("OPEN_URL_ACTION", 2);
        OPEN_URL_ACTION = blockerAction3;
        BlockerAction blockerAction4 = new BlockerAction("SKIP_BLOCKER_ACTION", 3);
        SKIP_BLOCKER_ACTION = blockerAction4;
        BlockerAction blockerAction5 = new BlockerAction("SUBMIT_ACTION", 4);
        SUBMIT_ACTION = blockerAction5;
        BlockerAction blockerAction6 = new BlockerAction("INTERNAL_NAVIGATION_ACTION", 5);
        INTERNAL_NAVIGATION_ACTION = blockerAction6;
        BlockerAction blockerAction7 = new BlockerAction("SIGN_OUT_ACTION", 6);
        SIGN_OUT_ACTION = blockerAction7;
        BlockerAction blockerAction8 = new BlockerAction("SHARE_FILE_ACTION", 7);
        SHARE_FILE_ACTION = blockerAction8;
        BlockerAction blockerAction9 = new BlockerAction("SHARE_TEXT_ACTION", 8);
        SHARE_TEXT_ACTION = blockerAction9;
        BlockerAction blockerAction10 = new BlockerAction("CONFIRMATION_DIALOG_FIRST", 9);
        CONFIRMATION_DIALOG_FIRST = blockerAction10;
        BlockerAction blockerAction11 = new BlockerAction("CONFIRMATION_SHEET_FIRST", 10);
        CONFIRMATION_SHEET_FIRST = blockerAction11;
        BlockerAction blockerAction12 = new BlockerAction("VIEW_ACTION", 11);
        VIEW_ACTION = blockerAction12;
        BlockerAction blockerAction13 = new BlockerAction("DIALOG_ACTION", 12);
        DIALOG_ACTION = blockerAction13;
        BlockerAction blockerAction14 = new BlockerAction("CANCEL_DIALOG", 13);
        CANCEL_DIALOG = blockerAction14;
        BlockerAction blockerAction15 = new BlockerAction("COPY_ACTION", 14);
        COPY_ACTION = blockerAction15;
        BlockerAction blockerAction16 = new BlockerAction("BACK_NAVIGATION_ACTION", 15);
        BACK_NAVIGATION_ACTION = blockerAction16;
        BlockerAction blockerAction17 = new BlockerAction("END_ACTIVITY_WITH_RESULT_ACTION", 16);
        END_ACTIVITY_WITH_RESULT_ACTION = blockerAction17;
        BlockerAction blockerAction18 = new BlockerAction("DELAYED_ACTION", 17);
        DELAYED_ACTION = blockerAction18;
        BlockerAction blockerAction19 = new BlockerAction("SHOW_OVERLAY_SCREEN", 18);
        SHOW_OVERLAY_SCREEN = blockerAction19;
        BlockerAction blockerAction20 = new BlockerAction("HAPTIC_FEEDBACK", 19);
        HAPTIC_FEEDBACK = blockerAction20;
        $VALUES = new BlockerAction[]{blockerAction, blockerAction2, blockerAction3, blockerAction4, blockerAction5, blockerAction6, blockerAction7, blockerAction8, blockerAction9, blockerAction10, blockerAction11, blockerAction12, blockerAction13, blockerAction14, blockerAction15, blockerAction16, blockerAction17, blockerAction18, blockerAction19, blockerAction20, new BlockerAction("RETREAT_ACTION", 20), new BlockerAction("ADVANCE_ACTION", 21)};
    }

    public static BlockerAction valueOf(String str) {
        return (BlockerAction) Enum.valueOf(BlockerAction.class, str);
    }

    public static BlockerAction[] values() {
        return (BlockerAction[]) $VALUES.clone();
    }
}
