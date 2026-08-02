package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.payments.viewmodels.Size;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ListProperty implements Parcelable {
    public static final Parcelable.Creator<ListProperty> CREATOR = new Size.Creator(6);
    public final boolean isOnTopOfDelete;
    public final Position position;
    public final Rotation rotation;
    public final Size size;
    public final Zoom zoom;

    public /* synthetic */ ListProperty(Position position, Rotation rotation, Zoom zoom, Size size, int i) {
        this((i & 1) != 0 ? new Position(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) : position, (i & 2) != 0 ? new Rotation(RecyclerView.DECELERATION_RATE) : rotation, (i & 4) != 0 ? new Zoom(1.0f) : zoom, (i & 8) != 0 ? new Size(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) : size, false);
    }

    public static ListProperty copy$default(ListProperty listProperty, Position position, Rotation rotation, Zoom zoom, Size size, boolean z, int i) {
        if ((i & 2) != 0) {
            rotation = listProperty.rotation;
        }
        Rotation rotation2 = rotation;
        if ((i & 4) != 0) {
            zoom = listProperty.zoom;
        }
        Zoom zoom2 = zoom;
        if ((i & 8) != 0) {
            size = listProperty.size;
        }
        Size size2 = size;
        if ((i & 16) != 0) {
            z = listProperty.isOnTopOfDelete;
        }
        listProperty.getClass();
        position.getClass();
        rotation2.getClass();
        zoom2.getClass();
        size2.getClass();
        return new ListProperty(position, rotation2, zoom2, size2, z);
    }

    public final Position center() {
        Position position = this.position;
        float f = position.x;
        Size size = this.size;
        return new Position((size.width / 2.0f) + f, (size.height / 2.0f) + position.y, position.z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListProperty)) {
            return false;
        }
        ListProperty listProperty = (ListProperty) obj;
        return Intrinsics.areEqual(this.position, listProperty.position) && Intrinsics.areEqual(this.rotation, listProperty.rotation) && Intrinsics.areEqual(this.zoom, listProperty.zoom) && Intrinsics.areEqual(this.size, listProperty.size) && this.isOnTopOfDelete == listProperty.isOnTopOfDelete;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isOnTopOfDelete) + ((this.size.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.zoom.scale, CameraState$Type$EnumUnboxingLocalUtility.m(this.rotation.rotation, this.position.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListProperty(position=");
        sb.append(this.position);
        sb.append(", rotation=");
        sb.append(this.rotation);
        sb.append(", zoom=");
        sb.append(this.zoom);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", isOnTopOfDelete=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isOnTopOfDelete, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.position.writeToParcel(parcel, i);
        Rotation rotation = this.rotation;
        rotation.getClass();
        parcel.writeFloat(rotation.rotation);
        Zoom zoom = this.zoom;
        zoom.getClass();
        parcel.writeFloat(zoom.scale);
        this.size.writeToParcel(parcel, i);
        parcel.writeInt(this.isOnTopOfDelete ? 1 : 0);
    }

    public ListProperty(Position position, Rotation rotation, Zoom zoom, Size size, boolean z) {
        position.getClass();
        rotation.getClass();
        zoom.getClass();
        size.getClass();
        this.position = position;
        this.rotation = rotation;
        this.zoom = zoom;
        this.size = size;
        this.isOnTopOfDelete = z;
    }
}
