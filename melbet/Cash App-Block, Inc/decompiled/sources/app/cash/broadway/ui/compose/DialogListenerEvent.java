package app.cash.broadway.ui.compose;

import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class DialogListenerEvent {

    public final class OnDialogCanceled extends DialogListenerEvent {
        public final Screen screen;

        public OnDialogCanceled(Screen screen) {
            screen.getClass();
            this.screen = screen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDialogCanceled) && Intrinsics.areEqual(this.screen, ((OnDialogCanceled) obj).screen);
        }

        @Override // app.cash.broadway.ui.compose.DialogListenerEvent
        public final Screen getScreen() {
            return this.screen;
        }

        public final int hashCode() {
            return this.screen.hashCode();
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(this.screen, "OnDialogCanceled(screen=", ")");
        }
    }

    public final class OnDialogResult extends DialogListenerEvent {
        public final Object result;
        public final Screen screen;

        public OnDialogResult(Screen screen, Object obj) {
            screen.getClass();
            this.screen = screen;
            this.result = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDialogResult)) {
                return false;
            }
            OnDialogResult onDialogResult = (OnDialogResult) obj;
            return Intrinsics.areEqual(this.screen, onDialogResult.screen) && Intrinsics.areEqual(this.result, onDialogResult.result);
        }

        public final Object getResult() {
            return this.result;
        }

        @Override // app.cash.broadway.ui.compose.DialogListenerEvent
        public final Screen getScreen() {
            return this.screen;
        }

        public final int hashCode() {
            int hashCode = this.screen.hashCode() * 31;
            Object obj = this.result;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "OnDialogResult(screen=" + this.screen + ", result=" + this.result + ")";
        }
    }

    public abstract Screen getScreen();
}
