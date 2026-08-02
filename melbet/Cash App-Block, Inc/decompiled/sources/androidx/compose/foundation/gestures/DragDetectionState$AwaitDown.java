package androidx.compose.foundation.gestures;

/* loaded from: classes3.dex */
public final class DragDetectionState$AwaitDown extends Draggable2DKt {
    public AwaitTouchSlop awaitTouchSlop = AwaitTouchSlop.NotInitialized;
    public boolean consumedOnInitial = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AwaitTouchSlop {
        public static final /* synthetic */ AwaitTouchSlop[] $VALUES;
        public static final AwaitTouchSlop No;
        public static final AwaitTouchSlop NotInitialized;
        public static final AwaitTouchSlop Yes;

        static {
            AwaitTouchSlop awaitTouchSlop = new AwaitTouchSlop("Yes", 0);
            Yes = awaitTouchSlop;
            AwaitTouchSlop awaitTouchSlop2 = new AwaitTouchSlop("No", 1);
            No = awaitTouchSlop2;
            AwaitTouchSlop awaitTouchSlop3 = new AwaitTouchSlop("NotInitialized", 2);
            NotInitialized = awaitTouchSlop3;
            $VALUES = new AwaitTouchSlop[]{awaitTouchSlop, awaitTouchSlop2, awaitTouchSlop3};
        }

        public static AwaitTouchSlop valueOf(String str) {
            return (AwaitTouchSlop) Enum.valueOf(AwaitTouchSlop.class, str);
        }

        public static AwaitTouchSlop[] values() {
            return (AwaitTouchSlop[]) $VALUES.clone();
        }
    }

    public final AwaitTouchSlop getAwaitTouchSlop() {
        return this.awaitTouchSlop;
    }

    public final boolean getConsumedOnInitial() {
        return this.consumedOnInitial;
    }

    public final void setAwaitTouchSlop(AwaitTouchSlop awaitTouchSlop) {
        this.awaitTouchSlop = awaitTouchSlop;
    }

    public final void setConsumedOnInitial(boolean z) {
        this.consumedOnInitial = z;
    }
}
