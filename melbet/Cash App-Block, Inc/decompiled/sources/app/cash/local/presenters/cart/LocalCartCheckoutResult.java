package app.cash.local.presenters.cart;

import app.cash.broadway.screen.Screen;
import app.cash.local.viewmodels.CreateCartErrorViewModel;
import bo.app.re$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public interface LocalCartCheckoutResult {

    public final class Error implements LocalCartCheckoutResult {
        public final CreateCartErrorViewModel error;

        public Error(CreateCartErrorViewModel createCartErrorViewModel) {
            this.error = createCartErrorViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.error.equals(((Error) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    public final class Navigation implements LocalCartCheckoutResult {
        public final Screen screen;

        public Navigation(Screen screen) {
            this.screen = screen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Navigation) && this.screen.equals(((Navigation) obj).screen);
        }

        public final int hashCode() {
            return this.screen.hashCode();
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(this.screen, "Navigation(screen=", ")");
        }
    }
}
