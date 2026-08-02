package com.squareup.cash.passkeys.backend;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PasskeyCredentialCreator$CredentialCreationResult {

    public final class Cancelled implements PasskeyCredentialCreator$CredentialCreationResult {
        public static final Cancelled INSTANCE = new Cancelled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancelled);
        }

        public final int hashCode() {
            return 542891724;
        }

        public final String toString() {
            return "Cancelled";
        }
    }

    public final class DeviceNotSupported implements PasskeyCredentialCreator$CredentialCreationResult {
        public final String errorMessage;

        public DeviceNotSupported(String str) {
            this.errorMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceNotSupported) && this.errorMessage.equals(((DeviceNotSupported) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceNotSupported(errorMessage=", this.errorMessage, ")");
        }
    }

    public final class DuplicateCredentialOnDevice implements PasskeyCredentialCreator$CredentialCreationResult {
        public final String errorMessage;

        public DuplicateCredentialOnDevice(String str) {
            this.errorMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DuplicateCredentialOnDevice) && this.errorMessage.equals(((DuplicateCredentialOnDevice) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DuplicateCredentialOnDevice(errorMessage=", this.errorMessage, ")");
        }
    }

    public final class Error implements PasskeyCredentialCreator$CredentialCreationResult {
        public final String errorMessage;

        public Error(String str) {
            this.errorMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.errorMessage.equals(((Error) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(errorMessage=", this.errorMessage, ")");
        }
    }

    public final class Success implements PasskeyCredentialCreator$CredentialCreationResult {
        public final String credentialJson;

        public /* synthetic */ Success(String str) {
            this.credentialJson = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Success m3683boximpl(String str) {
            return new Success(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static void m3684constructorimpl(String str) {
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
        public final /* synthetic */ String m3685unboximpl() {
            return this.credentialJson;
        }
    }
}
