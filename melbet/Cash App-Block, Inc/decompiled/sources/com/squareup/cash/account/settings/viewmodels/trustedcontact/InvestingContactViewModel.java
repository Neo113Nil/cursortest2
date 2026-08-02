package com.squareup.cash.account.settings.viewmodels.trustedcontact;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InvestingContactViewModel {
    public final String address;
    public final String closeButtonLabel;
    public final List contactInfo;
    public final String editButtonLabel;
    public final String email;
    public final String name;
    public final String phone;
    public final String removeButtonLabel;

    public InvestingContactViewModel(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.contactInfo = list;
        this.editButtonLabel = str;
        this.removeButtonLabel = str2;
        this.closeButtonLabel = str3;
        this.name = str4;
        this.email = str5;
        this.phone = str6;
        this.address = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingContactViewModel)) {
            return false;
        }
        InvestingContactViewModel investingContactViewModel = (InvestingContactViewModel) obj;
        return Intrinsics.areEqual(this.contactInfo, investingContactViewModel.contactInfo) && Intrinsics.areEqual(this.editButtonLabel, investingContactViewModel.editButtonLabel) && Intrinsics.areEqual(this.removeButtonLabel, investingContactViewModel.removeButtonLabel) && Intrinsics.areEqual(this.closeButtonLabel, investingContactViewModel.closeButtonLabel) && Intrinsics.areEqual(this.name, investingContactViewModel.name) && Intrinsics.areEqual(this.email, investingContactViewModel.email) && Intrinsics.areEqual(this.phone, investingContactViewModel.phone) && Intrinsics.areEqual(this.address, investingContactViewModel.address);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.contactInfo.hashCode() * 31, 31, this.editButtonLabel), 31, this.removeButtonLabel), 31, this.closeButtonLabel);
        String str = this.name;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("InvestingContactViewModel(contactInfo=", ", editButtonLabel=", this.editButtonLabel, ", removeButtonLabel=", this.contactInfo);
        Boxes$$ExternalSyntheticOutline1.m(m, this.removeButtonLabel, ", closeButtonLabel=", this.closeButtonLabel, ", name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.name, ", email=", this.email, ", phone=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.phone, ", address=", this.address, ")");
    }
}
