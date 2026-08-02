package app.cash.local.presenters.cart;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface OpenTabAddRoundResult {

    public final class Success implements OpenTabAddRoundResult {
        public final LocalCart updatedCart;

        public Success(LocalCart localCart) {
            localCart.getClass();
            this.updatedCart = localCart;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.updatedCart, ((Success) obj).updatedCart);
        }

        public final int hashCode() {
            return this.updatedCart.hashCode();
        }

        public final String toString() {
            return "Success(updatedCart=" + this.updatedCart + ")";
        }
    }

    public final class Failure implements OpenTabAddRoundResult {
        public final Map errors;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Failure() {
            this(r0);
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.errors, ((Failure) obj).errors);
        }

        public final int hashCode() {
            return this.errors.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Failure(errors=", ")", this.errors);
        }

        public Failure(Map map) {
            map.getClass();
            this.errors = map;
        }
    }
}
