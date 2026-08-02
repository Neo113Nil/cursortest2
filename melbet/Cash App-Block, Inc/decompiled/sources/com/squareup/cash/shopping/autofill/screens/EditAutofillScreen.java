package com.squareup.cash.shopping.autofill.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class EditAutofillScreen implements BottomSheetScreen {
    public static final Parcelable.Creator<EditAutofillScreen> CREATOR = new AutofillQuestion.Creator(2);
    public final GlobalAddress address;
    public final AutofillAnalyticsParam analyticsParam;
    public final String customerId;
    public final String email;
    public final FullName fullName;
    public final Screen origin;
    public final Phone phone;
    public final AskedQuestion question;
    public final String shippingAddressId;

    public EditAutofillScreen(AskedQuestion askedQuestion, Screen screen, String str, String str2, AutofillAnalyticsParam autofillAnalyticsParam, FullName fullName, String str3, Phone phone, GlobalAddress globalAddress) {
        askedQuestion.getClass();
        screen.getClass();
        fullName.getClass();
        globalAddress.getClass();
        this.question = askedQuestion;
        this.origin = screen;
        this.shippingAddressId = str;
        this.customerId = str2;
        this.analyticsParam = autofillAnalyticsParam;
        this.fullName = fullName;
        this.email = str3;
        this.phone = phone;
        this.address = globalAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAutofillScreen)) {
            return false;
        }
        EditAutofillScreen editAutofillScreen = (EditAutofillScreen) obj;
        return Intrinsics.areEqual(this.question, editAutofillScreen.question) && Intrinsics.areEqual(this.origin, editAutofillScreen.origin) && Intrinsics.areEqual(this.shippingAddressId, editAutofillScreen.shippingAddressId) && Intrinsics.areEqual(this.customerId, editAutofillScreen.customerId) && Intrinsics.areEqual(this.analyticsParam, editAutofillScreen.analyticsParam) && Intrinsics.areEqual(this.fullName, editAutofillScreen.fullName) && Intrinsics.areEqual(this.email, editAutofillScreen.email) && Intrinsics.areEqual(this.phone, editAutofillScreen.phone) && Intrinsics.areEqual(this.address, editAutofillScreen.address);
    }

    public final int hashCode() {
        int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.origin, this.question.hashCode() * 31, 31);
        String str = this.shippingAddressId;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customerId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AutofillAnalyticsParam autofillAnalyticsParam = this.analyticsParam;
        int hashCode3 = (this.fullName.hashCode() + ((hashCode2 + (autofillAnalyticsParam == null ? 0 : autofillAnalyticsParam.hashCode())) * 31)) * 31;
        String str3 = this.email;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Phone phone = this.phone;
        return this.address.hashCode() + ((hashCode4 + (phone != null ? phone.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditAutofillScreen(question=");
        sb.append(this.question);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", shippingAddressId=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.shippingAddressId, ", customerId=", this.customerId, ", analyticsParam=");
        sb.append(this.analyticsParam);
        sb.append(", fullName=██, email=██, phone=██, address=██)");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.question, i);
        parcel.writeParcelable(this.origin, i);
        parcel.writeString(this.shippingAddressId);
        parcel.writeString(this.customerId);
        AutofillAnalyticsParam autofillAnalyticsParam = this.analyticsParam;
        if (autofillAnalyticsParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autofillAnalyticsParam.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.fullName, i);
        parcel.writeString(this.email);
        parcel.writeParcelable(this.phone, i);
        parcel.writeParcelable(this.address, i);
    }
}
