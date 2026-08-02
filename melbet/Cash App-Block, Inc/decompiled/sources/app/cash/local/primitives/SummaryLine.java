package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.MenuItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SummaryLine implements Parcelable {
    public static final Parcelable.Creator<SummaryLine> CREATOR = new MenuItem.Creator(24);
    public final LocalMoney amount;
    public final String description;
    public final boolean isHighlighted;

    public SummaryLine(String str, LocalMoney localMoney, boolean z) {
        str.getClass();
        localMoney.getClass();
        this.description = str;
        this.amount = localMoney;
        this.isHighlighted = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryLine)) {
            return false;
        }
        SummaryLine summaryLine = (SummaryLine) obj;
        return Intrinsics.areEqual(this.description, summaryLine.description) && Intrinsics.areEqual(this.amount, summaryLine.amount) && this.isHighlighted == summaryLine.isHighlighted;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isHighlighted) + ((this.amount.hashCode() + (this.description.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SummaryLine(description=");
        sb.append(this.description);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", isHighlighted=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isHighlighted, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.description);
        this.amount.writeToParcel(parcel, i);
        parcel.writeInt(this.isHighlighted ? 1 : 0);
    }
}
