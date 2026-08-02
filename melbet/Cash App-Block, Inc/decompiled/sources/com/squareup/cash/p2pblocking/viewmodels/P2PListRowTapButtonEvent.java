package com.squareup.cash.p2pblocking.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.blockly.api.AllowlistCustomer;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface P2PListRowTapButtonEvent {

    public final class TapAddOrRemove implements P2PListRowTapButtonEvent {
        public final AllowlistCustomer allowlistCustomer;
        public final String customerName;
        public final String customerToken;
        public final boolean isAtLimit;
        public final boolean toAdd;

        public TapAddOrRemove(String str, boolean z, String str2, boolean z2, AllowlistCustomer allowlistCustomer) {
            str.getClass();
            str2.getClass();
            allowlistCustomer.getClass();
            this.customerName = str;
            this.toAdd = z;
            this.customerToken = str2;
            this.isAtLimit = z2;
            this.allowlistCustomer = allowlistCustomer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapAddOrRemove)) {
                return false;
            }
            TapAddOrRemove tapAddOrRemove = (TapAddOrRemove) obj;
            return Intrinsics.areEqual(this.customerName, tapAddOrRemove.customerName) && this.toAdd == tapAddOrRemove.toAdd && Intrinsics.areEqual(this.customerToken, tapAddOrRemove.customerToken) && this.isAtLimit == tapAddOrRemove.isAtLimit && Intrinsics.areEqual(this.allowlistCustomer, tapAddOrRemove.allowlistCustomer);
        }

        public final int hashCode() {
            return this.allowlistCustomer.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.customerName.hashCode() * 31, 31, this.toAdd), 31, this.customerToken), 31, this.isAtLimit);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("TapAddOrRemove(customerName=", this.customerName, ", toAdd=", ", customerToken=", this.toAdd);
            NavAction$$ExternalSyntheticOutline0.m(m1540m, this.customerToken, ", isAtLimit=", this.isAtLimit, ", allowlistCustomer=");
            m1540m.append(this.allowlistCustomer);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    /* loaded from: classes8.dex */
    public final class TapBlockOrUnblock implements P2PListRowTapButtonEvent {
        public final String customerName;
        public final String customerToken;
        public final boolean toBlock;
        public final String url;

        public TapBlockOrUnblock(boolean z, String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.toBlock = z;
            this.url = str;
            this.customerToken = str2;
            this.customerName = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapBlockOrUnblock)) {
                return false;
            }
            TapBlockOrUnblock tapBlockOrUnblock = (TapBlockOrUnblock) obj;
            return this.toBlock == tapBlockOrUnblock.toBlock && Intrinsics.areEqual(this.url, tapBlockOrUnblock.url) && Intrinsics.areEqual(this.customerToken, tapBlockOrUnblock.customerToken) && Intrinsics.areEqual(this.customerName, tapBlockOrUnblock.customerName);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.toBlock) * 31, 31, this.url), 31, this.customerToken);
            String str = this.customerName;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("TapBlockOrUnblock(toBlock=", ", url=", this.url, ", customerToken=", this.toBlock), this.customerToken, ", customerName=", this.customerName, ")");
        }
    }

    /* loaded from: classes8.dex */
    public final class TapDisabledUnblock implements P2PListRowTapButtonEvent {
        public final String blockedCustomerFullName;
        public final String blockerNameInDialogMessageStart;

        public TapDisabledUnblock(String str, String str2) {
            str.getClass();
            this.blockedCustomerFullName = str;
            this.blockerNameInDialogMessageStart = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapDisabledUnblock)) {
                return false;
            }
            TapDisabledUnblock tapDisabledUnblock = (TapDisabledUnblock) obj;
            return Intrinsics.areEqual(this.blockedCustomerFullName, tapDisabledUnblock.blockedCustomerFullName) && Intrinsics.areEqual(this.blockerNameInDialogMessageStart, tapDisabledUnblock.blockerNameInDialogMessageStart);
        }

        public final int hashCode() {
            int hashCode = this.blockedCustomerFullName.hashCode() * 31;
            String str = this.blockerNameInDialogMessageStart;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("TapDisabledUnblock(blockedCustomerFullName=", this.blockedCustomerFullName, ", blockerNameInDialogMessageStart=", this.blockerNameInDialogMessageStart, ")");
        }
    }
}
