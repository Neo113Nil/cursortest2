package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import app.cash.local.primitives.ShortlinkKey;
import app.cash.local.screens.app.LocalLoyaltySheet;
import com.squareup.protos.cash.local.client.v1.EducationalSheet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalEducationalSheet implements LocalScreen, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<LocalEducationalSheet> CREATOR = new LocalLoyaltySheet.Creator(13);
    public final EducationalSheet educationalSheet;
    public final String flowToken;
    public final String nextShortlinkFlowState;
    public final String shortlinkKey;

    public LocalEducationalSheet(EducationalSheet educationalSheet, String str, String str2, String str3) {
        educationalSheet.getClass();
        this.educationalSheet = educationalSheet;
        this.shortlinkKey = str;
        this.nextShortlinkFlowState = str2;
        this.flowToken = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalEducationalSheet)) {
            return false;
        }
        LocalEducationalSheet localEducationalSheet = (LocalEducationalSheet) obj;
        if (!Intrinsics.areEqual(this.educationalSheet, localEducationalSheet.educationalSheet)) {
            return false;
        }
        String str = localEducationalSheet.shortlinkKey;
        String str2 = this.shortlinkKey;
        if (str2 == null) {
            if (str == null) {
                areEqual = true;
            }
            areEqual = false;
        } else {
            if (str != null) {
                areEqual = Intrinsics.areEqual(str2, str);
            }
            areEqual = false;
        }
        return areEqual && Intrinsics.areEqual(this.nextShortlinkFlowState, localEducationalSheet.nextShortlinkFlowState) && Intrinsics.areEqual(this.flowToken, localEducationalSheet.flowToken);
    }

    public final int hashCode() {
        int hashCode = this.educationalSheet.hashCode() * 31;
        String str = this.shortlinkKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextShortlinkFlowState;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flowToken;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.shortlinkKey;
        String m1285toStringimpl = str == null ? "null" : ShortlinkKey.m1285toStringimpl(str);
        StringBuilder sb = new StringBuilder("LocalEducationalSheet(educationalSheet=");
        sb.append(this.educationalSheet);
        sb.append(", shortlinkKey=");
        sb.append(m1285toStringimpl);
        sb.append(", nextShortlinkFlowState=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.nextShortlinkFlowState, ", flowToken=", this.flowToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.educationalSheet, i);
        String str = this.shortlinkKey;
        parcel.writeParcelable(str != null ? new ShortlinkKey(str) : null, i);
        parcel.writeString(this.nextShortlinkFlowState);
        parcel.writeString(this.flowToken);
    }
}
