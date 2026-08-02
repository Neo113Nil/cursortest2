package com.squareup.cash.family.familyhub.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class TagLockResult {

    public final class Failure extends TagLockResult {
        public final String message;

        public Failure(String str) {
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.message, ((Failure) obj).message);
        }

        public final int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(message=", this.message, ")");
        }
    }

    public final class Success extends TagLockResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -2114518700;
        }

        public final String toString() {
            return "Success";
        }
    }
}
