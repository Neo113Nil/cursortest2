package androidx.compose.foundation.text.contextmenu.modifier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ToolbarHandlerState {
    public static final /* synthetic */ ToolbarHandlerState[] $VALUES;
    public static final ToolbarHandlerState Attached;
    public static final ToolbarHandlerState Detached;
    public static final ToolbarHandlerState Uninitialized;

    static {
        ToolbarHandlerState toolbarHandlerState = new ToolbarHandlerState("Uninitialized", 0);
        Uninitialized = toolbarHandlerState;
        ToolbarHandlerState toolbarHandlerState2 = new ToolbarHandlerState("Detached", 1);
        Detached = toolbarHandlerState2;
        ToolbarHandlerState toolbarHandlerState3 = new ToolbarHandlerState("Attached", 2);
        Attached = toolbarHandlerState3;
        $VALUES = new ToolbarHandlerState[]{toolbarHandlerState, toolbarHandlerState2, toolbarHandlerState3};
    }

    public static ToolbarHandlerState valueOf(String str) {
        return (ToolbarHandlerState) Enum.valueOf(ToolbarHandlerState.class, str);
    }

    public static ToolbarHandlerState[] values() {
        return (ToolbarHandlerState[]) $VALUES.clone();
    }
}
