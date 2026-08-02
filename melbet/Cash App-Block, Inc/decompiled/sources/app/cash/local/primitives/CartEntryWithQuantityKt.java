package app.cash.local.primitives;

import app.cash.local.primitives.CartEntryWithQuantity;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class CartEntryWithQuantityKt {
    public static final CartEntryWithQuantity.ClientCartEntryWithQuantity coerceToClientCartEntry(CartEntryWithQuantity cartEntryWithQuantity, int i) {
        cartEntryWithQuantity.getClass();
        if (cartEntryWithQuantity instanceof CartEntryWithQuantity.ClientCartEntryWithQuantity) {
            return CartEntryWithQuantity.ClientCartEntryWithQuantity.copy$default((CartEntryWithQuantity.ClientCartEntryWithQuantity) cartEntryWithQuantity, i);
        }
        if (cartEntryWithQuantity instanceof CartEntryWithQuantity.ServerCartEntryWithQuantity) {
            CartEntryWithQuantity.ServerCartEntryWithQuantity serverCartEntryWithQuantity = (CartEntryWithQuantity.ServerCartEntryWithQuantity) cartEntryWithQuantity;
            return new CartEntryWithQuantity.ClientCartEntryWithQuantity(serverCartEntryWithQuantity.cartEntry, i, serverCartEntryWithQuantity.analyticsContext);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCustomerProfileLoyaltyDetails.deepLinkSpecs;
    }
}
