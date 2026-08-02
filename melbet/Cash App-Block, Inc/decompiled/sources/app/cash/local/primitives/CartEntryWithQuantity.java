package app.cash.local.primitives;

import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface CartEntryWithQuantity {

    public final class ClientCartEntryWithQuantity implements CartEntryWithQuantity {
        public final LocalClientCartMenuItemAddedContext analyticsContext;
        public final CartEntry cartEntry;
        public final int quantity;

        public ClientCartEntryWithQuantity(CartEntry cartEntry, int i, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext) {
            cartEntry.getClass();
            this.cartEntry = cartEntry;
            this.quantity = i;
            this.analyticsContext = localClientCartMenuItemAddedContext;
        }

        public static ClientCartEntryWithQuantity copy$default(ClientCartEntryWithQuantity clientCartEntryWithQuantity, int i) {
            CartEntry cartEntry = clientCartEntryWithQuantity.cartEntry;
            LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = clientCartEntryWithQuantity.analyticsContext;
            clientCartEntryWithQuantity.getClass();
            cartEntry.getClass();
            return new ClientCartEntryWithQuantity(cartEntry, i, localClientCartMenuItemAddedContext);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientCartEntryWithQuantity)) {
                return false;
            }
            ClientCartEntryWithQuantity clientCartEntryWithQuantity = (ClientCartEntryWithQuantity) obj;
            return Intrinsics.areEqual(this.cartEntry, clientCartEntryWithQuantity.cartEntry) && this.quantity == clientCartEntryWithQuantity.quantity && Intrinsics.areEqual(this.analyticsContext, clientCartEntryWithQuantity.analyticsContext);
        }

        @Override // app.cash.local.primitives.CartEntryWithQuantity
        public final LocalClientCartMenuItemAddedContext getAnalyticsContext() {
            return this.analyticsContext;
        }

        @Override // app.cash.local.primitives.CartEntryWithQuantity
        public final CartEntry getCartEntry() {
            return this.cartEntry;
        }

        @Override // app.cash.local.primitives.CartEntryWithQuantity
        public final int getQuantity() {
            return this.quantity;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.quantity, this.cartEntry.hashCode() * 31, 31);
            LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = this.analyticsContext;
            return m + (localClientCartMenuItemAddedContext == null ? 0 : localClientCartMenuItemAddedContext.hashCode());
        }

        public final String toString() {
            return "ClientCartEntryWithQuantity(cartEntry=" + this.cartEntry + ", quantity=" + this.quantity + ", analyticsContext=" + this.analyticsContext + ")";
        }
    }

    public final class ServerCartEntryWithQuantity implements CartEntryWithQuantity {
        public final LocalClientCartMenuItemAddedContext analyticsContext;
        public final CartEntry cartEntry;
        public final int quantity;
        public final LocalMoney totalPrice;
        public final LocalMoney totalPriceBeforeDiscount;

        public ServerCartEntryWithQuantity(CartEntry cartEntry, int i, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext, LocalMoney localMoney, LocalMoney localMoney2) {
            localMoney.getClass();
            this.cartEntry = cartEntry;
            this.quantity = i;
            this.analyticsContext = localClientCartMenuItemAddedContext;
            this.totalPrice = localMoney;
            this.totalPriceBeforeDiscount = localMoney2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServerCartEntryWithQuantity)) {
                return false;
            }
            ServerCartEntryWithQuantity serverCartEntryWithQuantity = (ServerCartEntryWithQuantity) obj;
            return this.cartEntry.equals(serverCartEntryWithQuantity.cartEntry) && this.quantity == serverCartEntryWithQuantity.quantity && Intrinsics.areEqual(this.analyticsContext, serverCartEntryWithQuantity.analyticsContext) && Intrinsics.areEqual(this.totalPrice, serverCartEntryWithQuantity.totalPrice) && Intrinsics.areEqual(this.totalPriceBeforeDiscount, serverCartEntryWithQuantity.totalPriceBeforeDiscount);
        }

        @Override // app.cash.local.primitives.CartEntryWithQuantity
        public final LocalClientCartMenuItemAddedContext getAnalyticsContext() {
            return this.analyticsContext;
        }

        @Override // app.cash.local.primitives.CartEntryWithQuantity
        public final CartEntry getCartEntry() {
            return this.cartEntry;
        }

        @Override // app.cash.local.primitives.CartEntryWithQuantity
        public final int getQuantity() {
            return this.quantity;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.quantity, this.cartEntry.hashCode() * 31, 31);
            LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = this.analyticsContext;
            int hashCode = (this.totalPrice.hashCode() + ((m + (localClientCartMenuItemAddedContext == null ? 0 : localClientCartMenuItemAddedContext.hashCode())) * 31)) * 31;
            LocalMoney localMoney = this.totalPriceBeforeDiscount;
            return hashCode + (localMoney != null ? localMoney.hashCode() : 0);
        }

        public final String toString() {
            return "ServerCartEntryWithQuantity(cartEntry=" + this.cartEntry + ", quantity=" + this.quantity + ", analyticsContext=" + this.analyticsContext + ", totalPrice=" + this.totalPrice + ", totalPriceBeforeDiscount=" + this.totalPriceBeforeDiscount + ")";
        }
    }

    LocalClientCartMenuItemAddedContext getAnalyticsContext();

    CartEntry getCartEntry();

    int getQuantity();
}
