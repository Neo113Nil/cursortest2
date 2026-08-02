package com.squareup.cash.shopping.autofill.presenters;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.common.location.GlobalAddress;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AutofillCombinedInfo {
    public final GlobalAddress address;
    public final String email;
    public final String firstName;
    public final String lastName;
    public final String phone;

    public AutofillCombinedInfo(String str, String str2, String str3, String str4, GlobalAddress globalAddress) {
        globalAddress.getClass();
        this.firstName = str;
        this.lastName = str2;
        this.phone = str3;
        this.email = str4;
        this.address = globalAddress;
    }

    public static AutofillCombinedInfo copy$default(AutofillCombinedInfo autofillCombinedInfo, String str, String str2, String str3, String str4, GlobalAddress globalAddress, int i) {
        if ((i & 1) != 0) {
            str = autofillCombinedInfo.firstName;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = autofillCombinedInfo.lastName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = autofillCombinedInfo.phone;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = autofillCombinedInfo.email;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            globalAddress = autofillCombinedInfo.address;
        }
        GlobalAddress globalAddress2 = globalAddress;
        autofillCombinedInfo.getClass();
        globalAddress2.getClass();
        return new AutofillCombinedInfo(str5, str6, str7, str8, globalAddress2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillCombinedInfo)) {
            return false;
        }
        AutofillCombinedInfo autofillCombinedInfo = (AutofillCombinedInfo) obj;
        return Intrinsics.areEqual(this.firstName, autofillCombinedInfo.firstName) && Intrinsics.areEqual(this.lastName, autofillCombinedInfo.lastName) && Intrinsics.areEqual(this.phone, autofillCombinedInfo.phone) && Intrinsics.areEqual(this.email, autofillCombinedInfo.email) && Intrinsics.areEqual(this.address, autofillCombinedInfo.address);
    }

    public final int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        return this.address.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AutofillCombinedInfo(firstName=", this.firstName, ", lastName=", this.lastName, ", phone=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.phone, ", email=", this.email, ", address=");
        m.append(this.address);
        m.append(")");
        return m.toString();
    }
}
