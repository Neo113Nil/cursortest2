package com.squareup.cash.activity.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class ContactHeaderViewEvent {

    public final class ContactClickById extends ContactHeaderViewEvent {
        public final String customerId;

        public ContactClickById(String str) {
            str.getClass();
            this.customerId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactClickById) && Intrinsics.areEqual(this.customerId, ((ContactClickById) obj).customerId);
        }

        public final int hashCode() {
            return this.customerId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContactClickById(customerId=", this.customerId, ")");
        }
    }

    public final class InviteClick extends ContactHeaderViewEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InviteClick)) {
                return false;
            }
            ActivityInviteItemViewEvent$Click activityInviteItemViewEvent$Click = ActivityInviteItemViewEvent$Click.INSTANCE;
            return activityInviteItemViewEvent$Click.equals(activityInviteItemViewEvent$Click);
        }

        public final int hashCode() {
            return 891271122;
        }

        public final String toString() {
            return "InviteClick(event=" + ActivityInviteItemViewEvent$Click.INSTANCE + ")";
        }
    }
}
