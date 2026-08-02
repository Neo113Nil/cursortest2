package com.squareup.cash.p2pblocking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse;
import com.squareup.protos.cash.blockly.api.BlockSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface P2PSearchData extends Parcelable {

    public final class AllowSearchData implements P2PSearchData {
        public static final Parcelable.Creator<AllowSearchData> CREATOR = new P2PListScreen.Creator(8);
        public final AllowlistSearchResponse response;

        public AllowSearchData(AllowlistSearchResponse allowlistSearchResponse) {
            allowlistSearchResponse.getClass();
            this.response = allowlistSearchResponse;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AllowSearchData) && Intrinsics.areEqual(this.response, ((AllowSearchData) obj).response);
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final String toString() {
            return "AllowSearchData(response=" + this.response + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.response, i);
        }
    }

    public final class BlockSearchData implements P2PSearchData {
        public static final Parcelable.Creator<BlockSearchData> CREATOR = new P2PListScreen.Creator(9);
        public final BlockSearchResponse response;

        public BlockSearchData(BlockSearchResponse blockSearchResponse) {
            blockSearchResponse.getClass();
            this.response = blockSearchResponse;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlockSearchData) && Intrinsics.areEqual(this.response, ((BlockSearchData) obj).response);
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final String toString() {
            return "BlockSearchData(response=" + this.response + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.response, i);
        }
    }
}
