package app.cash.local.viewmodels;

import app.cash.local.viewmodels.CreateCartErrorViewModel;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public interface LocalBrandLocationCartViewEvent {

    public final class AddItemsClicked implements LocalBrandLocationCartViewEvent {
        public static final AddItemsClicked INSTANCE = new AddItemsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddItemsClicked);
        }

        public final int hashCode() {
            return 2015726832;
        }

        public final String toString() {
            return "AddItemsClicked";
        }
    }

    public final class BackClicked implements LocalBrandLocationCartViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -1934510424;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CartErrorBannerDismissed implements LocalBrandLocationCartViewEvent {
        public final String id;

        public CartErrorBannerDismissed(String str) {
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CartErrorBannerDismissed) && this.id.equals(((CartErrorBannerDismissed) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CartErrorBannerDismissed(id=", CreateCartErrorViewModel.ErrorId.m1293toStringimpl(this.id), ")");
        }
    }

    public final class CheckoutClicked implements LocalBrandLocationCartViewEvent {
        public static final CheckoutClicked INSTANCE = new CheckoutClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckoutClicked);
        }

        public final int hashCode() {
            return -1027989143;
        }

        public final String toString() {
            return "CheckoutClicked";
        }
    }

    public final class FinishAndPayClicked implements LocalBrandLocationCartViewEvent {
        public static final FinishAndPayClicked INSTANCE = new FinishAndPayClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FinishAndPayClicked);
        }

        public final int hashCode() {
            return -2020034773;
        }

        public final String toString() {
            return "FinishAndPayClicked";
        }
    }

    public final class FulfillmentRowAsapClicked implements LocalBrandLocationCartViewEvent {
        public static final FulfillmentRowAsapClicked INSTANCE = new FulfillmentRowAsapClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FulfillmentRowAsapClicked);
        }

        public final int hashCode() {
            return 1798309810;
        }

        public final String toString() {
            return "FulfillmentRowAsapClicked";
        }
    }

    public final class FulfillmentRowChangeLocationClicked implements LocalBrandLocationCartViewEvent {
        public static final FulfillmentRowChangeLocationClicked INSTANCE = new FulfillmentRowChangeLocationClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FulfillmentRowChangeLocationClicked);
        }

        public final int hashCode() {
            return -1726059378;
        }

        public final String toString() {
            return "FulfillmentRowChangeLocationClicked";
        }
    }

    public final class FulfillmentRowClicked implements LocalBrandLocationCartViewEvent {
        public static final FulfillmentRowClicked INSTANCE = new FulfillmentRowClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FulfillmentRowClicked);
        }

        public final int hashCode() {
            return 1595173075;
        }

        public final String toString() {
            return "FulfillmentRowClicked";
        }
    }

    public final class FulfillmentRowLaterClicked implements LocalBrandLocationCartViewEvent {
        public static final FulfillmentRowLaterClicked INSTANCE = new FulfillmentRowLaterClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FulfillmentRowLaterClicked);
        }

        public final int hashCode() {
            return 952656591;
        }

        public final String toString() {
            return "FulfillmentRowLaterClicked";
        }
    }

    public final class FulfillmentRowSwitchType implements LocalBrandLocationCartViewEvent {

        /* renamed from: type, reason: collision with root package name */
        public final LocalFulfillmentType f918type;

        public FulfillmentRowSwitchType(LocalFulfillmentType localFulfillmentType) {
            localFulfillmentType.getClass();
            this.f918type = localFulfillmentType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FulfillmentRowSwitchType) && this.f918type == ((FulfillmentRowSwitchType) obj).f918type;
        }

        public final int hashCode() {
            return this.f918type.hashCode();
        }

        public final String toString() {
            return "FulfillmentRowSwitchType(type=" + this.f918type + ")";
        }
    }

    public final class ItemDecrement implements LocalBrandLocationCartViewEvent {
        public final int index;

        public ItemDecrement(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemDecrement) && this.index == ((ItemDecrement) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "ItemDecrement(index=", ")");
        }
    }

    public final class ItemEditClicked implements LocalBrandLocationCartViewEvent {
        public final int index;

        public ItemEditClicked(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemEditClicked) && this.index == ((ItemEditClicked) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "ItemEditClicked(index=", ")");
        }
    }

    public final class ItemIncrement implements LocalBrandLocationCartViewEvent {
        public final int index;

        public ItemIncrement(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemIncrement) && this.index == ((ItemIncrement) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "ItemIncrement(index=", ")");
        }
    }

    public final class OpenTabClicked implements LocalBrandLocationCartViewEvent {
        public static final OpenTabClicked INSTANCE = new OpenTabClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenTabClicked);
        }

        public final int hashCode() {
            return 1688692308;
        }

        public final String toString() {
            return "OpenTabClicked";
        }
    }

    public final class TermsClicked implements LocalBrandLocationCartViewEvent {
        public static final TermsClicked INSTANCE = new TermsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TermsClicked);
        }

        public final int hashCode() {
            return 1731493944;
        }

        public final String toString() {
            return "TermsClicked";
        }
    }
}
