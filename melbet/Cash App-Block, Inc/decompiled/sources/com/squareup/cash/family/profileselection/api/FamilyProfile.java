package com.squareup.cash.family.profileselection.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class FamilyProfile {

    public final class ManagedAccount extends FamilyProfile {
        public final String firstName;
        public final String sponsorAccountToken;
        public final String sponsorFirstName;

        public ManagedAccount(String str, String str2, String str3) {
            str3.getClass();
            this.firstName = str;
            this.sponsorFirstName = str2;
            this.sponsorAccountToken = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManagedAccount)) {
                return false;
            }
            ManagedAccount managedAccount = (ManagedAccount) obj;
            return Intrinsics.areEqual(this.firstName, managedAccount.firstName) && Intrinsics.areEqual(this.sponsorFirstName, managedAccount.sponsorFirstName) && Intrinsics.areEqual(this.sponsorAccountToken, managedAccount.sponsorAccountToken);
        }

        public final int hashCode() {
            String str = this.firstName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sponsorFirstName;
            return this.sponsorAccountToken.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ManagedAccount(firstName=", this.firstName, ", sponsorFirstName=", this.sponsorFirstName, ", sponsorAccountToken="), this.sponsorAccountToken, ")");
        }
    }

    public final class Standard extends FamilyProfile {
        public static final Standard INSTANCE = new Standard();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Standard);
        }

        public final int hashCode() {
            return -900944723;
        }

        public final String toString() {
            return "Standard";
        }
    }
}
