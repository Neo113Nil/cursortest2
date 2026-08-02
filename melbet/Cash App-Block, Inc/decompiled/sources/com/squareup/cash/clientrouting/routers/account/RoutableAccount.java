package com.squareup.cash.clientrouting.routers.account;

import com.squareup.cash.account.types.PrincipalAccountToken;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface RoutableAccount {

    public final class Account implements RoutableAccount {
        public final FullAccount fullAccount;

        public /* synthetic */ Account(FullAccount fullAccount) {
            this.fullAccount = fullAccount;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Account m3468boximpl(FullAccount fullAccount) {
            return new Account(fullAccount);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static void m3469constructorimpl(FullAccount fullAccount) {
            fullAccount.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Account) {
                return Intrinsics.areEqual(this.fullAccount, ((Account) obj).fullAccount);
            }
            return false;
        }

        public final int hashCode() {
            return this.fullAccount.hashCode();
        }

        public final String toString() {
            return "Account(fullAccount=" + this.fullAccount + ")";
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ FullAccount m3470unboximpl() {
            return this.fullAccount;
        }
    }

    public final class Dependent implements RoutableAccount {
        public final com.squareup.protos.cash.aegis.sync_values.Dependent dependent;

        public /* synthetic */ Dependent(com.squareup.protos.cash.aegis.sync_values.Dependent dependent) {
            this.dependent = dependent;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Dependent m3471boximpl(com.squareup.protos.cash.aegis.sync_values.Dependent dependent) {
            return new Dependent(dependent);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static void m3472constructorimpl(com.squareup.protos.cash.aegis.sync_values.Dependent dependent) {
            dependent.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Dependent) {
                return Intrinsics.areEqual(this.dependent, ((Dependent) obj).dependent);
            }
            return false;
        }

        public final int hashCode() {
            return this.dependent.hashCode();
        }

        public final String toString() {
            return "Dependent(dependent=" + this.dependent + ")";
        }
    }

    public final class Sponsor implements RoutableAccount {
        public final PrincipalAccountToken.Some principal;

        public /* synthetic */ Sponsor(PrincipalAccountToken.Some some) {
            this.principal = some;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Sponsor m3473boximpl(PrincipalAccountToken.Some some) {
            return new Sponsor(some);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Sponsor) {
                return this.principal.equals(((Sponsor) obj).principal);
            }
            return false;
        }

        public final int hashCode() {
            return this.principal.hashCode();
        }

        public final String toString() {
            return "Sponsor(principal=" + this.principal + ")";
        }
    }

    default String getCustomerToken() {
        if (this instanceof Account) {
            return ((Account) this).fullAccount.account_id;
        }
        if (this instanceof Dependent) {
            return ((Dependent) this).dependent.customer_token;
        }
        if (this instanceof Sponsor) {
            return ((Sponsor) this).principal.accountToken;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    default String getSwitchingIdentifier() {
        if (this instanceof Account) {
            return ((Account) this).fullAccount.switching_identifier;
        }
        if (this instanceof Dependent) {
            return ((Dependent) this).dependent.switching_identifier;
        }
        if (this instanceof Sponsor) {
            return ((Sponsor) this).principal.switchingIdentifier;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
