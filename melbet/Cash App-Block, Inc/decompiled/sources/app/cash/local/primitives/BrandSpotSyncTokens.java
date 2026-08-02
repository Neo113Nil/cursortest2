package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Cart;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class BrandSpotSyncTokens implements Parcelable {
    public static final Parcelable.Creator<BrandSpotSyncTokens> CREATOR = new Cart.Creator(16);
    public final String inStoreOrderingSessionId;
    public final String inStoreOrderingToken;
    public final String schedulingToken;

    public /* synthetic */ BrandSpotSyncTokens(String str, String str2, int i) {
        this((String) null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public static BrandSpotSyncTokens copy$default(BrandSpotSyncTokens brandSpotSyncTokens, String str, int i) {
        if ((i & 1) != 0) {
            str = brandSpotSyncTokens.schedulingToken;
        }
        String str2 = (i & 2) != 0 ? brandSpotSyncTokens.inStoreOrderingToken : null;
        String str3 = (i & 4) != 0 ? brandSpotSyncTokens.inStoreOrderingSessionId : null;
        brandSpotSyncTokens.getClass();
        return new BrandSpotSyncTokens(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandSpotSyncTokens)) {
            return false;
        }
        BrandSpotSyncTokens brandSpotSyncTokens = (BrandSpotSyncTokens) obj;
        return Intrinsics.areEqual(this.schedulingToken, brandSpotSyncTokens.schedulingToken) && Intrinsics.areEqual(this.inStoreOrderingToken, brandSpotSyncTokens.inStoreOrderingToken) && Intrinsics.areEqual(this.inStoreOrderingSessionId, brandSpotSyncTokens.inStoreOrderingSessionId);
    }

    public final String getInStoreOrderingSessionId() {
        return this.inStoreOrderingSessionId;
    }

    public final String getInStoreOrderingToken() {
        return this.inStoreOrderingToken;
    }

    public final int hashCode() {
        String str = this.schedulingToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inStoreOrderingToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inStoreOrderingSessionId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BrandSpotSyncTokens(schedulingToken=", this.schedulingToken, ", inStoreOrderingToken=", this.inStoreOrderingToken, ", inStoreOrderingSessionId="), this.inStoreOrderingSessionId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.schedulingToken);
        parcel.writeString(this.inStoreOrderingToken);
        parcel.writeString(this.inStoreOrderingSessionId);
    }

    public BrandSpotSyncTokens(String str, String str2, String str3) {
        this.schedulingToken = str;
        this.inStoreOrderingToken = str2;
        this.inStoreOrderingSessionId = str3;
    }
}
