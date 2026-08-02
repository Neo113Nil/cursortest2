package app.cash.local.viewmodels;

import app.cash.local.viewmodels.CreateCartErrorViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public interface LocalBrandLocationOpenTabViewEvent {

    public final class AddItemsClicked implements LocalBrandLocationOpenTabViewEvent {
        public static final AddItemsClicked INSTANCE = new AddItemsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddItemsClicked);
        }

        public final int hashCode() {
            return -1913250205;
        }

        public final String toString() {
            return "AddItemsClicked";
        }
    }

    public final class BackClicked implements LocalBrandLocationOpenTabViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 1267923355;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class ErrorDismissed implements LocalBrandLocationOpenTabViewEvent {
        public final String id;

        public ErrorDismissed(String str) {
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorDismissed) && this.id.equals(((ErrorDismissed) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorDismissed(id=", CreateCartErrorViewModel.ErrorId.m1293toStringimpl(this.id), ")");
        }
    }

    public final class FinishAndPayClicked implements LocalBrandLocationOpenTabViewEvent {
        public static final FinishAndPayClicked INSTANCE = new FinishAndPayClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FinishAndPayClicked);
        }

        public final int hashCode() {
            return 923621150;
        }

        public final String toString() {
            return "FinishAndPayClicked";
        }
    }
}
