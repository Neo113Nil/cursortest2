package com.squareup.cash.shopping.autofill.presenters;

import app.cash.api.ApiResult;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface AutofillState {

    public final class Error implements AutofillState {
        public final ApiResult.Failure result;

        public Error(ApiResult.Failure failure) {
            failure.getClass();
            this.result = failure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.result, ((Error) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "Error(result=" + this.result + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class Loaded implements AutofillState {
        public static final Loaded INSTANCE = new Loaded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loaded);
        }

        public final int hashCode() {
            return 334329775;
        }

        public final String toString() {
            return "Loaded";
        }
    }

    /* loaded from: classes6.dex */
    public final class Loading implements AutofillState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1774292690;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* loaded from: classes6.dex */
    public final class Success implements AutofillState {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -429527655;
        }

        public final String toString() {
            return "Success";
        }
    }
}
