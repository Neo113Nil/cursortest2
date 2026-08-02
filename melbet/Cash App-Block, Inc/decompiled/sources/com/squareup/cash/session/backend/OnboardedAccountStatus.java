package com.squareup.cash.session.backend;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class OnboardedAccountStatus {

    public final class NotOnboarded extends OnboardedAccountStatus {
        public static final NotOnboarded INSTANCE = new NotOnboarded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotOnboarded);
        }

        public final int hashCode() {
            return 1852745028;
        }

        public final String toString() {
            return "NotOnboarded";
        }
    }

    public final class Onboarded extends OnboardedAccountStatus {
        public final String accountToken;

        public Onboarded(String str) {
            str.getClass();
            this.accountToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Onboarded) && Intrinsics.areEqual(this.accountToken, ((Onboarded) obj).accountToken);
        }

        public final int hashCode() {
            return this.accountToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Onboarded(accountToken=", this.accountToken, ")");
        }
    }
}
