package com.squareup.cash.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AsyncResult {

    /* loaded from: classes7.dex */
    public final class Failure extends AsyncResult {
        public final Throwable error;

        public Failure(Throwable th) {
            this.error = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.error.equals(((Failure) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Failure(error=", ")", this.error);
        }
    }

    /* loaded from: classes7.dex */
    public final class Loading extends AsyncResult {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1533884095;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* loaded from: classes7.dex */
    public final class Success extends AsyncResult {
        public final Object response;

        public Success(Object obj) {
            obj.getClass();
            this.response = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.response, ((Success) obj).response);
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(response=", ")", this.response);
        }
    }
}
