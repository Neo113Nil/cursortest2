package com.squareup.cash.onboarding.accountpicker.presenters;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AccountPickerPresenter$AccountRemovalStatus {

    public final class Failed extends AccountPickerPresenter$AccountRemovalStatus {
        public final String accountToken;

        public Failed(String str) {
            str.getClass();
            this.accountToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && Intrinsics.areEqual(this.accountToken, ((Failed) obj).accountToken);
        }

        public final int hashCode() {
            return this.accountToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed(accountToken=", this.accountToken, ")");
        }
    }

    public final class InProgress extends AccountPickerPresenter$AccountRemovalStatus {
        public final String accountToken;

        public InProgress(String str) {
            str.getClass();
            this.accountToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InProgress) && Intrinsics.areEqual(this.accountToken, ((InProgress) obj).accountToken);
        }

        public final int hashCode() {
            return this.accountToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InProgress(accountToken=", this.accountToken, ")");
        }
    }

    public final class Requested extends AccountPickerPresenter$AccountRemovalStatus {
        public final String accountToken;

        public Requested(String str) {
            this.accountToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Requested) && this.accountToken.equals(((Requested) obj).accountToken);
        }

        public final int hashCode() {
            return this.accountToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Requested(accountToken=", this.accountToken, ")");
        }
    }

    public final class Success extends AccountPickerPresenter$AccountRemovalStatus {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -2081603272;
        }

        public final String toString() {
            return "Success";
        }
    }
}
