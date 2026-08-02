package com.squareup.cash.buynowpaylater.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AfterPayOrderHubLoadingStatus {

    public abstract class InitialLoadStatus extends AfterPayOrderHubLoadingStatus {

        public final class Failure extends InitialLoadStatus {
            public final String message;

            public Failure(String str) {
                str.getClass();
                this.message = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failure) && Intrinsics.areEqual(this.message, ((Failure) obj).message);
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(message=", this.message, ")");
            }
        }

        public final class Loading extends InitialLoadStatus {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -2097914496;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public final class Success extends InitialLoadStatus {
            public static final Success INSTANCE = new Success();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public final int hashCode() {
                return -6767545;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    public abstract class PaginatedLoadStatus extends AfterPayOrderHubLoadingStatus {

        public final class Failure extends PaginatedLoadStatus {
            public final String message;

            public Failure(String str) {
                str.getClass();
                this.message = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failure) && Intrinsics.areEqual(this.message, ((Failure) obj).message);
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(message=", this.message, ")");
            }
        }

        public final class Idle extends PaginatedLoadStatus {
            public static final Idle INSTANCE = new Idle();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public final int hashCode() {
                return -1152851737;
            }

            public final String toString() {
                return "Idle";
            }
        }

        public final class Loading extends PaginatedLoadStatus {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 919749449;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }
}
