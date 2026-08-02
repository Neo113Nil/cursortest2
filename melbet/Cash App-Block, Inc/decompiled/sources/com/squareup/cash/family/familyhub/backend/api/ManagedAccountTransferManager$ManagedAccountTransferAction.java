package com.squareup.cash.family.familyhub.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class ManagedAccountTransferManager$ManagedAccountTransferAction {

    public final class Error extends ManagedAccountTransferManager$ManagedAccountTransferAction {
        public final Throwable error;

        public Error(Throwable th) {
            this.error = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.error.equals(((Error) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Error(error=", ")", this.error);
        }
    }

    public final class Success extends ManagedAccountTransferManager$ManagedAccountTransferAction {
        public final ResponseContext responseContext;

        public Success(ResponseContext responseContext) {
            responseContext.getClass();
            this.responseContext = responseContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.responseContext, ((Success) obj).responseContext);
        }

        public final int hashCode() {
            return this.responseContext.hashCode();
        }

        public final String toString() {
            return "Success(responseContext=" + this.responseContext + ")";
        }
    }
}
