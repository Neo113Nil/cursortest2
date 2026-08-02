package app.cash.local.viewmodels;

/* loaded from: classes3.dex */
public interface MoreOptionsMenuEvent extends LocalBrandProfileViewEvent {

    public final class AddBrandClicked implements MoreOptionsMenuEvent {
        public static final AddBrandClicked INSTANCE = new AddBrandClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddBrandClicked);
        }

        public final int hashCode() {
            return -1946979053;
        }

        public final String toString() {
            return "AddBrandClicked";
        }
    }

    public final class ShareProfile implements MoreOptionsMenuEvent {
        public static final ShareProfile INSTANCE = new ShareProfile();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareProfile);
        }

        public final int hashCode() {
            return -794051880;
        }

        public final String toString() {
            return "ShareProfile";
        }
    }
}
