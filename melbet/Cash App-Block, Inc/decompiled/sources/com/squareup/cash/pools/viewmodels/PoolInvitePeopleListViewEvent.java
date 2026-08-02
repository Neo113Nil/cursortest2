package com.squareup.cash.pools.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PoolInvitePeopleListViewEvent {

    /* loaded from: classes9.dex */
    public final class AddCustomerToPool implements PoolInvitePeopleListViewEvent {
        public final String token;

        public AddCustomerToPool(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddCustomerToPool) && Intrinsics.areEqual(this.token, ((AddCustomerToPool) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddCustomerToPool(token=", this.token, ")");
        }
    }

    public final class AvatarTapped implements PoolInvitePeopleListViewEvent {
        public final String token;

        public AvatarTapped(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvatarTapped) && Intrinsics.areEqual(this.token, ((AvatarTapped) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AvatarTapped(token=", this.token, ")");
        }
    }

    public final class CopyLinkTapped implements PoolInvitePeopleListViewEvent {
        public static final CopyLinkTapped INSTANCE = new CopyLinkTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CopyLinkTapped);
        }

        public final int hashCode() {
            return -1738017060;
        }

        public final String toString() {
            return "CopyLinkTapped";
        }
    }

    public final class Exit implements PoolInvitePeopleListViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 80323775;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class GrantContactsPermissionClicked implements PoolInvitePeopleListViewEvent {
        public static final GrantContactsPermissionClicked INSTANCE = new GrantContactsPermissionClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GrantContactsPermissionClicked);
        }

        public final int hashCode() {
            return -1377581590;
        }

        public final String toString() {
            return "GrantContactsPermissionClicked";
        }
    }

    public final class SearchTermChanged implements PoolInvitePeopleListViewEvent {
        public final String searchTerm;

        public SearchTermChanged(String str) {
            str.getClass();
            this.searchTerm = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTermChanged) && Intrinsics.areEqual(this.searchTerm, ((SearchTermChanged) obj).searchTerm);
        }

        public final int hashCode() {
            return this.searchTerm.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchTermChanged(searchTerm=", this.searchTerm, ")");
        }
    }

    public final class ShareTapped implements PoolInvitePeopleListViewEvent {
        public static final ShareTapped INSTANCE = new ShareTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareTapped);
        }

        public final int hashCode() {
            return 1519595658;
        }

        public final String toString() {
            return "ShareTapped";
        }
    }
}
