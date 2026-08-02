package com.squareup.cash.p2pblocking.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface P2PScreenMode extends Parcelable {

    public final class AllowList implements P2PScreenMode {
        public static final Parcelable.Creator<AllowList> CREATOR = new P2PListScreen.Creator(6);
        public final Integer limit;

        public AllowList(Integer num) {
            this.limit = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AllowList) && Intrinsics.areEqual(this.limit, ((AllowList) obj).limit);
        }

        public final int hashCode() {
            Integer num = this.limit;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "AllowList(limit=" + this.limit + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.limit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
        }
    }

    public final class BlockList implements P2PScreenMode {
        public static final BlockList INSTANCE = new BlockList();
        public static final Parcelable.Creator<BlockList> CREATOR = new P2PListScreen.Creator(7);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BlockList);
        }

        public final int hashCode() {
            return 40926614;
        }

        public final String toString() {
            return "BlockList";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
