package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.MenuItemModifierListToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalMenuItemDetailsViewEvent {

    public final class BackClicked implements LocalMenuItemDetailsViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 71274292;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class DecrementModifier implements LocalMenuItemDetailsViewEvent {
        public final String listToken;
        public final String token;

        public DecrementModifier(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.listToken = str;
            this.token = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DecrementModifier)) {
                return false;
            }
            DecrementModifier decrementModifier = (DecrementModifier) obj;
            return Intrinsics.areEqual(this.listToken, decrementModifier.listToken) && Intrinsics.areEqual(this.token, decrementModifier.token);
        }

        public final int hashCode() {
            return this.token.hashCode() + (this.listToken.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("DecrementModifier(listToken=", MenuItemModifierListToken.m1260toStringimpl(this.listToken), ", token=", this.token, ")");
        }
    }

    public final class FreeTextEntryChanged implements LocalMenuItemDetailsViewEvent {
        public final String input;
        public final String token;

        public FreeTextEntryChanged(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.token = str;
            this.input = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FreeTextEntryChanged)) {
                return false;
            }
            FreeTextEntryChanged freeTextEntryChanged = (FreeTextEntryChanged) obj;
            return Intrinsics.areEqual(this.token, freeTextEntryChanged.token) && Intrinsics.areEqual(this.input, freeTextEntryChanged.input);
        }

        public final int hashCode() {
            return this.input.hashCode() + (this.token.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("FreeTextEntryChanged(token=", MenuItemModifierListToken.m1260toStringimpl(this.token), ", input=", this.input, ")");
        }
    }

    public final class IncrementModifier implements LocalMenuItemDetailsViewEvent {
        public final String listToken;
        public final String token;

        public IncrementModifier(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.listToken = str;
            this.token = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IncrementModifier)) {
                return false;
            }
            IncrementModifier incrementModifier = (IncrementModifier) obj;
            return Intrinsics.areEqual(this.listToken, incrementModifier.listToken) && Intrinsics.areEqual(this.token, incrementModifier.token);
        }

        public final int hashCode() {
            return this.token.hashCode() + (this.listToken.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("IncrementModifier(listToken=", MenuItemModifierListToken.m1260toStringimpl(this.listToken), ", token=", this.token, ")");
        }
    }

    public final class MissingSelections implements LocalMenuItemDetailsViewEvent {
        public static final MissingSelections INSTANCE = new MissingSelections();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MissingSelections);
        }

        public final int hashCode() {
            return 1841970529;
        }

        public final String toString() {
            return "MissingSelections";
        }
    }

    public final class SelectModifier implements LocalMenuItemDetailsViewEvent {
        public final String token;

        public SelectModifier(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectModifier) && Intrinsics.areEqual(this.token, ((SelectModifier) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectModifier(token=", this.token, ")");
        }
    }
}
