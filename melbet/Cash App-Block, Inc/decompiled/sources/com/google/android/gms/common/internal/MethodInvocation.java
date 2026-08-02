package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes.dex */
public final class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new com.google.android.gms.common.zza(6);
    public final int zaa;
    public final int zab;
    public final int zac;
    public final long zad;
    public final long zae;
    public final String zaf;
    public final String zag;
    public final int zah;
    public final int zai;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = j;
        this.zae = j2;
        this.zaf = str;
        this.zag = str2;
        this.zah = i4;
        this.zai = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = MooncakeHeaderViewKt.beginObjectHeader(parcel);
        MooncakeHeaderViewKt.writeInt(parcel, 1, this.zaa);
        MooncakeHeaderViewKt.writeInt(parcel, 2, this.zab);
        MooncakeHeaderViewKt.writeInt(parcel, 3, this.zac);
        MooncakeHeaderViewKt.writeLong(parcel, 4, this.zad);
        MooncakeHeaderViewKt.writeLong(parcel, 5, this.zae);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zaf);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zag);
        MooncakeHeaderViewKt.writeInt(parcel, 8, this.zah);
        MooncakeHeaderViewKt.writeInt(parcel, 9, this.zai);
        MooncakeHeaderViewKt.finishObjectHeader(parcel, beginObjectHeader);
    }
}
