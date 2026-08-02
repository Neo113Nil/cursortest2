package com.squareup.address.typeahead.backend.api;

import com.squareup.address.typeahead.views.AddressTypeaheadState$select$1;
import defpackage.JsonLogicResult;

/* loaded from: classes5.dex */
public interface AddressSearchResult {

    public abstract class ComputedAddressResult {

        public final class Failure extends ComputedAddressResult {
            public static final Failure INSTANCE = new Failure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Failure);
            }

            public final int hashCode() {
                return -1294302733;
            }

            public final String toString() {
                return "Failure";
            }
        }

        public final class Success extends ComputedAddressResult {
            public final JsonLogicResult address;

            public Success(JsonLogicResult jsonLogicResult) {
                this.address = jsonLogicResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && this.address.equals(((Success) obj).address);
            }

            public final int hashCode() {
                return this.address.hashCode();
            }

            public final String toString() {
                return "Success(address=" + this.address + ")";
            }
        }
    }

    Object computeAddress(AddressTypeaheadState$select$1 addressTypeaheadState$select$1);

    CharSequence getPrimaryText();

    CharSequence getSecondaryText();
}
