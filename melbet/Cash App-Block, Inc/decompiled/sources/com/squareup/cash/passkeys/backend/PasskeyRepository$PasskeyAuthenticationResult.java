package com.squareup.cash.passkeys.backend;

import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PasskeyRepository$PasskeyAuthenticationResult {

    public final class Error implements PasskeyRepository$PasskeyAuthenticationResult {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -948479274;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class NoCredentials implements PasskeyRepository$PasskeyAuthenticationResult {
        public static final NoCredentials INSTANCE = new NoCredentials();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoCredentials);
        }

        public final int hashCode() {
            return -525195959;
        }

        public final String toString() {
            return "NoCredentials";
        }
    }

    public final class Success implements PasskeyRepository$PasskeyAuthenticationResult {
        public final ResponseContext responseContext;

        public /* synthetic */ Success(ResponseContext responseContext) {
            this.responseContext = responseContext;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Success m3696boximpl(ResponseContext responseContext) {
            return new Success(responseContext);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Success) {
                return Intrinsics.areEqual(this.responseContext, ((Success) obj).responseContext);
            }
            return false;
        }

        public final int hashCode() {
            return this.responseContext.hashCode();
        }

        public final String toString() {
            return "Success(responseContext=" + this.responseContext + ")";
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ResponseContext m3697unboximpl() {
            return this.responseContext;
        }
    }
}
