package app.cash.local.presenters.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Cart;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class RefreshState implements Parcelable {
    public static final Parcelable.Creator<RefreshState> CREATOR = new Cart.Creator(12);
    public final boolean activeOrdersLoaded;
    public final boolean addedCardsLoaded;
    public final int key;
    public final boolean marketingMessagesLoaded;
    public final boolean pastOrdersLoaded;

    public /* synthetic */ RefreshState(int i, int i2) {
        this((i2 & 1) != 0 ? 0 : i, false, false, false, false);
    }

    public static RefreshState copy$default(RefreshState refreshState, int i) {
        int i2 = refreshState.key;
        boolean z = (i & 2) != 0 ? refreshState.activeOrdersLoaded : true;
        boolean z2 = (i & 4) != 0 ? refreshState.pastOrdersLoaded : true;
        boolean z3 = (i & 8) != 0 ? refreshState.addedCardsLoaded : true;
        boolean z4 = (i & 16) != 0 ? refreshState.marketingMessagesLoaded : true;
        refreshState.getClass();
        return new RefreshState(i2, z, z2, z3, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshState)) {
            return false;
        }
        RefreshState refreshState = (RefreshState) obj;
        return this.key == refreshState.key && this.activeOrdersLoaded == refreshState.activeOrdersLoaded && this.pastOrdersLoaded == refreshState.pastOrdersLoaded && this.addedCardsLoaded == refreshState.addedCardsLoaded && this.marketingMessagesLoaded == refreshState.marketingMessagesLoaded;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.marketingMessagesLoaded) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.key) * 31, 31, this.activeOrdersLoaded), 31, this.pastOrdersLoaded), 31, this.addedCardsLoaded);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefreshState(key=");
        sb.append(this.key);
        sb.append(", activeOrdersLoaded=");
        sb.append(this.activeOrdersLoaded);
        sb.append(", pastOrdersLoaded=");
        re$$ExternalSyntheticOutline0.m(sb, this.pastOrdersLoaded, ", addedCardsLoaded=", this.addedCardsLoaded, ", marketingMessagesLoaded=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.marketingMessagesLoaded, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.key);
        parcel.writeInt(this.activeOrdersLoaded ? 1 : 0);
        parcel.writeInt(this.pastOrdersLoaded ? 1 : 0);
        parcel.writeInt(this.addedCardsLoaded ? 1 : 0);
        parcel.writeInt(this.marketingMessagesLoaded ? 1 : 0);
    }

    public RefreshState(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.key = i;
        this.activeOrdersLoaded = z;
        this.pastOrdersLoaded = z2;
        this.addedCardsLoaded = z3;
        this.marketingMessagesLoaded = z4;
    }
}
