package app.cash.local.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public interface LocalBottomModalViewEvent extends LocalMenuItemDetailsViewEvent, LocalMenuComboDetailsViewEvent, LocalBrandLocationMenuViewEvent, LocalBrandProfileViewEvent {

    public final class BottomModalLinkClicked implements LocalBottomModalViewEvent {
        public static final BottomModalLinkClicked INSTANCE = new BottomModalLinkClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BottomModalLinkClicked);
        }

        public final int hashCode() {
            return 78640041;
        }

        public final String toString() {
            return "BottomModalLinkClicked";
        }
    }

    public final class CtaClicked implements LocalBottomModalViewEvent {
        public final int index;

        public CtaClicked(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CtaClicked) && this.index == ((CtaClicked) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "CtaClicked(index=", ")");
        }
    }
}
