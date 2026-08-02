package com.squareup.cash.p2pblocking.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface P2PListViewEvent {

    public final class DismissDialog implements P2PListViewEvent {
        public static final DismissDialog INSTANCE = new DismissDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissDialog);
        }

        public final int hashCode() {
            return 1397538127;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    /* loaded from: classes4.dex */
    public final class TapAllowlist implements P2PListViewEvent {
        public final boolean isAtLimit;
        public final Integer limit;

        public TapAllowlist(Integer num, boolean z) {
            this.limit = num;
            this.isAtLimit = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapAllowlist)) {
                return false;
            }
            TapAllowlist tapAllowlist = (TapAllowlist) obj;
            return Intrinsics.areEqual(this.limit, tapAllowlist.limit) && this.isAtLimit == tapAllowlist.isAtLimit;
        }

        public final int hashCode() {
            Integer num = this.limit;
            return Boolean.hashCode(this.isAtLimit) + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public final String toString() {
            return "TapAllowlist(limit=" + this.limit + ", isAtLimit=" + this.isAtLimit + ")";
        }
    }

    public final class TapAvatar implements P2PListViewEvent {
        public final P2PListRowTapAvatarEvent tapAvatarEvent;

        public TapAvatar(P2PListRowTapAvatarEvent p2PListRowTapAvatarEvent) {
            p2PListRowTapAvatarEvent.getClass();
            this.tapAvatarEvent = p2PListRowTapAvatarEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapAvatar) && Intrinsics.areEqual(this.tapAvatarEvent, ((TapAvatar) obj).tapAvatarEvent);
        }

        public final int hashCode() {
            return this.tapAvatarEvent.customerToken.hashCode();
        }

        public final String toString() {
            return "TapAvatar(tapAvatarEvent=" + this.tapAvatarEvent + ")";
        }
    }

    public final class TapBack implements P2PListViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return -837318201;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    /* loaded from: classes8.dex */
    public final class TapBlocklist implements P2PListViewEvent {
        public static final TapBlocklist INSTANCE = new TapBlocklist();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBlocklist);
        }

        public final int hashCode() {
            return 1840377291;
        }

        public final String toString() {
            return "TapBlocklist";
        }
    }

    public final class TapHelp implements P2PListViewEvent {
        public final String clientRouteUrl;

        public TapHelp(String str) {
            str.getClass();
            this.clientRouteUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapHelp) && Intrinsics.areEqual(this.clientRouteUrl, ((TapHelp) obj).clientRouteUrl);
        }

        public final int hashCode() {
            return this.clientRouteUrl.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapHelp(clientRouteUrl=", this.clientRouteUrl, ")");
        }
    }

    public final class TapRowButton implements P2PListViewEvent {
        public final P2PListRowTapButtonEvent tapButtonEvent;

        public TapRowButton(P2PListRowTapButtonEvent p2PListRowTapButtonEvent) {
            p2PListRowTapButtonEvent.getClass();
            this.tapButtonEvent = p2PListRowTapButtonEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapRowButton) && Intrinsics.areEqual(this.tapButtonEvent, ((TapRowButton) obj).tapButtonEvent);
        }

        public final int hashCode() {
            return this.tapButtonEvent.hashCode();
        }

        public final String toString() {
            return "TapRowButton(tapButtonEvent=" + this.tapButtonEvent + ")";
        }
    }
}
