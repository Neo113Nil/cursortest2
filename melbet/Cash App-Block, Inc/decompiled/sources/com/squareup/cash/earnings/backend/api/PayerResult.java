package com.squareup.cash.earnings.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PayerResult {

    public final class Failure implements PayerResult {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Failure(error=null)";
        }
    }

    public final class Success implements PayerResult {
        public final Object data;

        public Success(Object obj) {
            this.data = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.data, ((Success) obj).data);
        }

        public final int hashCode() {
            Object obj = this.data;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(data=", ")", this.data);
        }
    }
}
