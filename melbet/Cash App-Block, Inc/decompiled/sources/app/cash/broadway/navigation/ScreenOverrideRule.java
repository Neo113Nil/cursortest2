package app.cash.broadway.navigation;

import app.cash.broadway.screen.Screen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface ScreenOverrideRule {

    public final class State {
        public final Screen currentFullScreen;
        public final Screen currentOverlay;

        public State(Screen screen, Screen screen2) {
            this.currentFullScreen = screen;
            this.currentOverlay = screen2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.currentFullScreen, state.currentFullScreen) && Intrinsics.areEqual(this.currentOverlay, state.currentOverlay);
        }

        public final int hashCode() {
            Screen screen = this.currentFullScreen;
            int hashCode = (screen == null ? 0 : screen.hashCode()) * 31;
            Screen screen2 = this.currentOverlay;
            return hashCode + (screen2 != null ? screen2.hashCode() : 0);
        }

        public final String toString() {
            return "State(currentFullScreen=" + this.currentFullScreen + ", currentOverlay=" + this.currentOverlay + ")";
        }
    }

    Screen maybeOverride(State state, Screen screen);
}
