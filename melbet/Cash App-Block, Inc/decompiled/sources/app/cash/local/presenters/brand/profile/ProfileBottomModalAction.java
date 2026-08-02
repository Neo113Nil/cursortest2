package app.cash.local.presenters.brand.profile;

import com.squareup.protos.cash.local.client.v1.LocalOrder;

/* loaded from: classes3.dex */
public interface ProfileBottomModalAction {

    public final class StartOrder implements ProfileBottomModalAction {
        public static final StartOrder INSTANCE = new StartOrder();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StartOrder);
        }

        public final int hashCode() {
            return 494844237;
        }

        public final String toString() {
            return "StartOrder";
        }
    }

    public final class ViewCart implements ProfileBottomModalAction {
        public static final ViewCart INSTANCE = new ViewCart();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewCart);
        }

        public final int hashCode() {
            return 826549478;
        }

        public final String toString() {
            return "ViewCart";
        }
    }

    public final class ViewOrder implements ProfileBottomModalAction {
        public final LocalOrder order;

        public ViewOrder(LocalOrder localOrder) {
            this.order = localOrder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewOrder) && this.order.equals(((ViewOrder) obj).order);
        }

        public final int hashCode() {
            return this.order.hashCode();
        }

        public final String toString() {
            return "ViewOrder(order=" + this.order + ")";
        }
    }
}
