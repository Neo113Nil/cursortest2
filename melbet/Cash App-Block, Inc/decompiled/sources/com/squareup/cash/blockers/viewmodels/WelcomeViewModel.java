package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.account.backend.ManagedAccountFlipDirection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface WelcomeViewModel {

    /* loaded from: classes5.dex */
    public final class ManagedAccount implements WelcomeViewModel {
        public final ManagedAccountFlipDirection flipDirection;
        public final String welcomeMessage;

        public ManagedAccount(String str, ManagedAccountFlipDirection managedAccountFlipDirection) {
            this.welcomeMessage = str;
            this.flipDirection = managedAccountFlipDirection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManagedAccount)) {
                return false;
            }
            ManagedAccount managedAccount = (ManagedAccount) obj;
            return this.welcomeMessage.equals(managedAccount.welcomeMessage) && this.flipDirection == managedAccount.flipDirection;
        }

        public final int hashCode() {
            return this.flipDirection.hashCode() + (this.welcomeMessage.hashCode() * 31);
        }

        public final String toString() {
            return "ManagedAccount(welcomeMessage=" + this.welcomeMessage + ", flipDirection=" + this.flipDirection + ")";
        }
    }

    public final class Standard implements WelcomeViewModel {
        public final String title;

        public Standard(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Standard) && Intrinsics.areEqual(this.title, ((Standard) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Standard(title=", this.title, ")");
        }
    }
}
