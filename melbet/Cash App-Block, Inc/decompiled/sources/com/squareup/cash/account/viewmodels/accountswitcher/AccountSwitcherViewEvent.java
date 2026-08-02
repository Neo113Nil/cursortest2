package com.squareup.cash.account.viewmodels.accountswitcher;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AccountSwitcherViewEvent {

    public final class AccountClicked implements AccountSwitcherViewEvent {
        public final String targetAccountToken;

        public AccountClicked(String str) {
            str.getClass();
            this.targetAccountToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AccountClicked) && Intrinsics.areEqual(this.targetAccountToken, ((AccountClicked) obj).targetAccountToken);
        }

        public final int hashCode() {
            return this.targetAccountToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountClicked(targetAccountToken=", this.targetAccountToken, ")");
        }
    }

    public final class AddAccountClick implements AccountSwitcherViewEvent {
        public static final AddAccountClick INSTANCE = new AddAccountClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddAccountClick);
        }

        public final int hashCode() {
            return 1475356097;
        }

        public final String toString() {
            return "AddAccountClick";
        }
    }

    public final class Close implements AccountSwitcherViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -559137955;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class CreateBusinessAccountClick implements AccountSwitcherViewEvent {
        public static final CreateBusinessAccountClick INSTANCE = new CreateBusinessAccountClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CreateBusinessAccountClick);
        }

        public final int hashCode() {
            return 939718162;
        }

        public final String toString() {
            return "CreateBusinessAccountClick";
        }
    }

    public final class CreatePersonalAccountClick implements AccountSwitcherViewEvent {
        public static final CreatePersonalAccountClick INSTANCE = new CreatePersonalAccountClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CreatePersonalAccountClick);
        }

        public final int hashCode() {
            return 224566418;
        }

        public final String toString() {
            return "CreatePersonalAccountClick";
        }
    }
}
