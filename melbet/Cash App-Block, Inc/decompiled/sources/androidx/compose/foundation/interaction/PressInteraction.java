package androidx.compose.foundation.interaction;

/* loaded from: classes.dex */
public interface PressInteraction extends Interaction {

    public final class Cancel implements PressInteraction {
        public final Press press;

        public Cancel(Press press) {
            this.press = press;
        }
    }

    public final class Press implements PressInteraction {
        public final long pressPosition;

        public Press(long j) {
            this.pressPosition = j;
        }
    }

    public final class Release implements PressInteraction {
        public final Press press;

        public Release(Press press) {
            this.press = press;
        }
    }
}
