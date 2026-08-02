package com.squareup.cash.passkeys.backend;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PasskeyRepository$LoginIdentifier {

    public final class AccountToken implements PasskeyRepository$LoginIdentifier {
        public final String token;

        public final boolean equals(Object obj) {
            if (obj instanceof AccountToken) {
                return this.token.equals(((AccountToken) obj).token);
            }
            return false;
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountToken(token=", this.token, ")");
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m3689unboximpl() {
            return this.token;
        }
    }

    public final class Discoverable implements PasskeyRepository$LoginIdentifier {
        public static final Discoverable INSTANCE = new Discoverable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Discoverable);
        }

        public final int hashCode() {
            return -299746138;
        }

        public final String toString() {
            return "Discoverable";
        }
    }

    public final class Email implements PasskeyRepository$LoginIdentifier {
        public final String value;

        public /* synthetic */ Email(String str) {
            this.value = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Email m3690boximpl(String str) {
            return new Email(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static void m3691constructorimpl(String str) {
            str.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Email) {
                return Intrinsics.areEqual(this.value, ((Email) obj).value);
            }
            return false;
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Email(value=", this.value, ")");
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m3692unboximpl() {
            return this.value;
        }
    }

    public final class SmsNumber implements PasskeyRepository$LoginIdentifier {
        public final String value;

        public /* synthetic */ SmsNumber(String str) {
            this.value = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SmsNumber m3693boximpl(String str) {
            return new SmsNumber(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static void m3694constructorimpl(String str) {
            str.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SmsNumber) {
                return Intrinsics.areEqual(this.value, ((SmsNumber) obj).value);
            }
            return false;
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SmsNumber(value=", this.value, ")");
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m3695unboximpl() {
            return this.value;
        }
    }
}
