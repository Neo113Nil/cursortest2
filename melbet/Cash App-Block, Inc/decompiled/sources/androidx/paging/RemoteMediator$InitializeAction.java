package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RemoteMediator$InitializeAction {
    public static final /* synthetic */ RemoteMediator$InitializeAction[] $VALUES;
    public static final RemoteMediator$InitializeAction LAUNCH_INITIAL_REFRESH;

    static {
        RemoteMediator$InitializeAction remoteMediator$InitializeAction = new RemoteMediator$InitializeAction("LAUNCH_INITIAL_REFRESH", 0);
        LAUNCH_INITIAL_REFRESH = remoteMediator$InitializeAction;
        $VALUES = new RemoteMediator$InitializeAction[]{remoteMediator$InitializeAction, new RemoteMediator$InitializeAction("SKIP_INITIAL_REFRESH", 1)};
    }

    public static RemoteMediator$InitializeAction valueOf(String str) {
        return (RemoteMediator$InitializeAction) Enum.valueOf(RemoteMediator$InitializeAction.class, str);
    }

    public static RemoteMediator$InitializeAction[] values() {
        return (RemoteMediator$InitializeAction[]) $VALUES.clone();
    }
}
