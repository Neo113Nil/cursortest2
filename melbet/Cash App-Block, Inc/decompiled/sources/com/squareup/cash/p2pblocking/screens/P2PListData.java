package com.squareup.cash.p2pblocking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface P2PListData extends Parcelable {

    public final class AllowListData implements P2PListData {
        public static final Parcelable.Creator<AllowListData> CREATOR = new P2PListScreen.Creator(4);
        public final ArrayList customers;

        public AllowListData(ArrayList arrayList) {
            this.customers = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AllowListData) && this.customers.equals(((AllowListData) obj).customers);
        }

        public final int hashCode() {
            return this.customers.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("AllowListData(customers=", ")", this.customers);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.customers, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
    }

    public final class BlockListData implements P2PListData {
        public static final Parcelable.Creator<BlockListData> CREATOR = new P2PListScreen.Creator(5);
        public final List customers;
        public final String supportPageUrl;

        public BlockListData(List list, String str) {
            list.getClass();
            this.customers = list;
            this.supportPageUrl = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlockListData)) {
                return false;
            }
            BlockListData blockListData = (BlockListData) obj;
            return Intrinsics.areEqual(this.customers, blockListData.customers) && Intrinsics.areEqual(this.supportPageUrl, blockListData.supportPageUrl);
        }

        public final int hashCode() {
            int hashCode = this.customers.hashCode() * 31;
            String str = this.supportPageUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "BlockListData(customers=" + this.customers + ", supportPageUrl=" + this.supportPageUrl + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.customers, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeString(this.supportPageUrl);
        }
    }
}
