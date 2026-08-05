package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzef extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzef> CREATOR = new zzeg();
    private final byte[] zza;

    public zzef(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, (byte[]) bArr.clone(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
