package androidx.camera.camera2.pipe.compat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SessionSequencer$State {
    public static final /* synthetic */ SessionSequencer$State[] $VALUES;
    public static final SessionSequencer$State CREATED;
    public static final SessionSequencer$State CREATING;
    public static final SessionSequencer$State PENDING;

    static {
        SessionSequencer$State sessionSequencer$State = new SessionSequencer$State("PENDING", 0);
        PENDING = sessionSequencer$State;
        SessionSequencer$State sessionSequencer$State2 = new SessionSequencer$State("CREATING", 1);
        CREATING = sessionSequencer$State2;
        SessionSequencer$State sessionSequencer$State3 = new SessionSequencer$State("CREATED", 2);
        CREATED = sessionSequencer$State3;
        $VALUES = new SessionSequencer$State[]{sessionSequencer$State, sessionSequencer$State2, sessionSequencer$State3};
    }

    public static SessionSequencer$State valueOf(String str) {
        return (SessionSequencer$State) Enum.valueOf(SessionSequencer$State.class, str);
    }

    public static SessionSequencer$State[] values() {
        return (SessionSequencer$State[]) $VALUES.clone();
    }
}
