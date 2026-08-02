package app.cash.local.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalCashBalanceViewEvent {

    public final class ButtonClicked implements LocalCashBalanceViewEvent {
        public static final ButtonClicked INSTANCE = new ButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ButtonClicked);
        }

        public final int hashCode() {
            return -981249904;
        }

        public final String toString() {
            return "ButtonClicked";
        }
    }

    public final class CheckInClicked implements LocalCashBalanceViewEvent {
        public static final CheckInClicked INSTANCE = new CheckInClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckInClicked);
        }

        public final int hashCode() {
            return 433942143;
        }

        public final String toString() {
            return "CheckInClicked";
        }
    }

    public final class Dismiss implements LocalCashBalanceViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -1350011195;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class ManageCardsClicked implements LocalCashBalanceViewEvent {
        public static final ManageCardsClicked INSTANCE = new ManageCardsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManageCardsClicked);
        }

        public final int hashCode() {
            return 2107807278;
        }

        public final String toString() {
            return "ManageCardsClicked";
        }
    }

    public final class SheetDismissed implements LocalCashBalanceViewEvent {
        public static final SheetDismissed INSTANCE = new SheetDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetDismissed);
        }

        public final int hashCode() {
            return -129780369;
        }

        public final String toString() {
            return "SheetDismissed";
        }
    }

    public final class UpdateCardState implements LocalCashBalanceViewEvent {
        public final boolean currentlyLinked;
        public final String id;

        public UpdateCardState(String str, boolean z) {
            str.getClass();
            this.id = str;
            this.currentlyLinked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateCardState)) {
                return false;
            }
            UpdateCardState updateCardState = (UpdateCardState) obj;
            return Intrinsics.areEqual(this.id, updateCardState.id) && this.currentlyLinked == updateCardState.currentlyLinked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.currentlyLinked) + (this.id.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("UpdateCardState(id=", this.id, ", currentlyLinked=", ")", this.currentlyLinked);
        }
    }

    public final class UrlClicked implements LocalCashBalanceViewEvent {
        public final String url;

        public UrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlClicked) && Intrinsics.areEqual(this.url, ((UrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlClicked(url=", this.url, ")");
        }
    }

    public final class ViewAllClicked implements LocalCashBalanceViewEvent {
        public static final ViewAllClicked INSTANCE = new ViewAllClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewAllClicked);
        }

        public final int hashCode() {
            return -817846480;
        }

        public final String toString() {
            return "ViewAllClicked";
        }
    }
}
