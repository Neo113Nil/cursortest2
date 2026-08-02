package com.squareup.address.typeahead.backend.api;

import com.squareup.protos.common.location.GlobalAddress;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AddressState {

    public final class Empty implements AddressState {
        public static final Empty INSTANCE = new Empty();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 946031444;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public final class Error implements AddressState {
        public final String message;

        public Error(String str) {
            str.getClass();
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(message=", this.message, ")");
        }
    }

    public final class Searching implements AddressState {
        public static final Searching INSTANCE = new Searching();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Searching);
        }

        public final int hashCode() {
            return 858643393;
        }

        public final String toString() {
            return "Searching";
        }
    }

    public final class Valid implements AddressState {
        public final GlobalAddress address;
        public final boolean manuallyEdited;
        public final String placeId;

        public Valid(GlobalAddress globalAddress, boolean z, String str) {
            this.address = globalAddress;
            this.manuallyEdited = z;
            this.placeId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Valid)) {
                return false;
            }
            Valid valid = (Valid) obj;
            return Intrinsics.areEqual(this.address, valid.address) && this.manuallyEdited == valid.manuallyEdited && Intrinsics.areEqual(this.placeId, valid.placeId);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.manuallyEdited);
            String str = this.placeId;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Valid(address=");
            sb.append(this.address);
            sb.append(", manuallyEdited=");
            sb.append(this.manuallyEdited);
            sb.append(", placeId=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.placeId, ")");
        }
    }
}
