package com.squareup.cash.instruments.backend.api;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class BankAccountLinker$Result {

    public final class Loading extends BankAccountLinker$Result {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1249500797;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class NetworkFailure extends BankAccountLinker$Result {
        public final ApiResult.Failure failure;

        public NetworkFailure(ApiResult.Failure failure) {
            this.failure = failure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkFailure) && this.failure.equals(((NetworkFailure) obj).failure);
        }

        public final int hashCode() {
            return this.failure.hashCode();
        }

        public final String toString() {
            return "NetworkFailure(failure=" + this.failure + ")";
        }
    }

    public final class NotSuccessful extends BankAccountLinker$Result {
        public final String failureMessage;

        public NotSuccessful(String str) {
            this.failureMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotSuccessful) && this.failureMessage.equals(((NotSuccessful) obj).failureMessage);
        }

        public final int hashCode() {
            return this.failureMessage.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NotSuccessful(failureMessage=", this.failureMessage, ")");
        }
    }

    public final class Successful extends BankAccountLinker$Result {
        public final Instrument instrument;
        public final ResponseContext responseContext;

        public Successful(Instrument instrument, ResponseContext responseContext) {
            this.instrument = instrument;
            this.responseContext = responseContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Successful)) {
                return false;
            }
            Successful successful = (Successful) obj;
            return Intrinsics.areEqual(this.instrument, successful.instrument) && Intrinsics.areEqual(this.responseContext, successful.responseContext);
        }

        public final int hashCode() {
            Instrument instrument = this.instrument;
            int hashCode = (instrument == null ? 0 : instrument.hashCode()) * 31;
            ResponseContext responseContext = this.responseContext;
            return hashCode + (responseContext != null ? responseContext.hashCode() : 0);
        }

        public final String toString() {
            return "Successful(instrument=" + this.instrument + ", responseContext=" + this.responseContext + ")";
        }
    }
}
