package app.cash.local.presenters.internal;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class LoyaltyKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewContactSupport.deepLinkSpecs;
    }

    public static final String pointsText(LocalLoyaltyProgram localLoyaltyProgram, int i) {
        localLoyaltyProgram.getClass();
        if (i == 1) {
            return i + " " + localLoyaltyProgram.loyalty_terminology_singular;
        }
        return i + " " + localLoyaltyProgram.loyalty_terminology_plural;
    }
}
