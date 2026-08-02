package app.cash.local.backend;

import app.cash.local.primitives.BrandSpot;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface CartBuilderKey {

    public final class BuyerIntent implements CartBuilderKey {
        public final BuyerIntentScope scope;

        public BuyerIntent(BuyerIntentScope buyerIntentScope) {
            buyerIntentScope.getClass();
            this.scope = buyerIntentScope;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuyerIntent) && Intrinsics.areEqual(this.scope, ((BuyerIntent) obj).scope);
        }

        public final int hashCode() {
            return this.scope.hashCode();
        }

        public final String toString() {
            return "BuyerIntent(scope=" + this.scope + ")";
        }
    }

    public final class Legacy implements CartBuilderKey {
        public final BrandSpot brandSpot;

        public Legacy(BrandSpot brandSpot) {
            brandSpot.getClass();
            this.brandSpot = brandSpot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Legacy) && Intrinsics.areEqual(this.brandSpot, ((Legacy) obj).brandSpot);
        }

        public final int hashCode() {
            return this.brandSpot.hashCode();
        }

        public final String toString() {
            return "Legacy(brandSpot=" + this.brandSpot + ")";
        }
    }
}
