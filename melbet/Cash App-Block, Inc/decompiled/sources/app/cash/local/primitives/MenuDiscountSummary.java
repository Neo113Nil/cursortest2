package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MenuDiscountSummary implements Parcelable {
    public static final Parcelable.Creator<MenuDiscountSummary> CREATOR = new Line.Creator(28);
    public final String details;
    public final String name;
    public final String token;

    public MenuDiscountSummary(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.token = str;
        this.name = str2;
        this.details = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuDiscountSummary)) {
            return false;
        }
        MenuDiscountSummary menuDiscountSummary = (MenuDiscountSummary) obj;
        return Intrinsics.areEqual(this.token, menuDiscountSummary.token) && Intrinsics.areEqual(this.name, menuDiscountSummary.name) && Intrinsics.areEqual(this.details, menuDiscountSummary.details);
    }

    public final int hashCode() {
        return this.details.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MenuDiscountSummary(token=", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DiscountToken(value=", this.token, ")"), ", name=", this.name, ", details="), this.details, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.name);
        parcel.writeString(this.details);
    }
}
