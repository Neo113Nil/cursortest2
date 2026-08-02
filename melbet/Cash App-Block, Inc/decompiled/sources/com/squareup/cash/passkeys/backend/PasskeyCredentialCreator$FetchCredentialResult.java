package com.squareup.cash.passkeys.backend;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PasskeyCredentialCreator$FetchCredentialResult {

    public final class Cancelled implements PasskeyCredentialCreator$FetchCredentialResult {
        public static final Cancelled INSTANCE = new Cancelled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancelled);
        }

        public final int hashCode() {
            return -1574211717;
        }

        public final String toString() {
            return "Cancelled";
        }
    }

    public final class Error implements PasskeyCredentialCreator$FetchCredentialResult {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -1985626830;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class NoCredentials implements PasskeyCredentialCreator$FetchCredentialResult {
        public static final NoCredentials INSTANCE = new NoCredentials();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoCredentials);
        }

        public final int hashCode() {
            return 267807653;
        }

        public final String toString() {
            return "NoCredentials";
        }
    }

    public final class Success implements PasskeyCredentialCreator$FetchCredentialResult {
        public final String credentialJson;

        public /* synthetic */ Success(String str) {
            this.credentialJson = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Success m3686boximpl(String str) {
            return new Success(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static void m3687constructorimpl(String str) {
            str.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Success) {
                return Intrinsics.areEqual(this.credentialJson, ((Success) obj).credentialJson);
            }
            return false;
        }

        public final int hashCode() {
            return this.credentialJson.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(credentialJson=", this.credentialJson, ")");
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m3688unboximpl() {
            return this.credentialJson;
        }
    }
}
