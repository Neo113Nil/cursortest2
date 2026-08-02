package com.squareup.cash.profile.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.viewmodels.Accessory;
import com.squareup.cash.profile.viewmodels.Alias;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Channel implements Parcelable {
    public static final Parcelable.Creator<Channel> CREATOR = new Alias.Creator(19);
    public final Accessory accessory;
    public final ChannelType channelType;

    public Channel(ChannelType channelType, Accessory accessory) {
        channelType.getClass();
        accessory.getClass();
        this.channelType = channelType;
        this.accessory = accessory;
    }

    public static Channel copy$default(Channel channel, Accessory.Toggle toggle) {
        ChannelType channelType = channel.channelType;
        channelType.getClass();
        return new Channel(channelType, toggle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        return this.channelType == channel.channelType && Intrinsics.areEqual(this.accessory, channel.accessory);
    }

    public final int hashCode() {
        return this.accessory.hashCode() + (this.channelType.hashCode() * 31);
    }

    public final String toString() {
        return "Channel(channelType=" + this.channelType + ", accessory=" + this.accessory + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.channelType.name());
        parcel.writeParcelable(this.accessory, i);
    }
}
