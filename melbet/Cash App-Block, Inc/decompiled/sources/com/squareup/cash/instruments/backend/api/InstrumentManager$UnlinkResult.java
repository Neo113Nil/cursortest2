package com.squareup.cash.instruments.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class InstrumentManager$UnlinkResult {

    public final class Failure extends InstrumentManager$UnlinkResult {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return -1063169642;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Ineligible extends InstrumentManager$UnlinkResult {
        public final String message;

        public Ineligible(String str) {
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ineligible) && Intrinsics.areEqual(this.message, ((Ineligible) obj).message);
        }

        public final int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Ineligible(message=", this.message, ")");
        }
    }

    public final class Success extends InstrumentManager$UnlinkResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -1843765233;
        }

        public final String toString() {
            return "Success";
        }
    }
}
