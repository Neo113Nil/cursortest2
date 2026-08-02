package androidx.compose.foundation.gestures;

/* loaded from: classes3.dex */
public abstract class DragEvent {

    public final class DragCancelled extends DragEvent {
        public static final DragCancelled INSTANCE = new DragCancelled();
    }

    public final class DragDelta extends DragEvent {
        public final long delta;
        public final boolean isIndirectPointerEvent;

        public DragDelta(long j, boolean z) {
            this.delta = j;
            this.isIndirectPointerEvent = z;
        }
    }

    public final class DragStarted extends DragEvent {
        public final long startPoint;

        public DragStarted(long j) {
            this.startPoint = j;
        }

        /* renamed from: getStartPoint-F1C5BW0, reason: not valid java name */
        public final long m205getStartPointF1C5BW0() {
            return this.startPoint;
        }
    }

    public final class DragStopped extends DragEvent {
        public final boolean isIndirectPointerEvent;
        public final long velocity;

        public DragStopped(long j, boolean z) {
            this.velocity = j;
            this.isIndirectPointerEvent = z;
        }
    }
}
