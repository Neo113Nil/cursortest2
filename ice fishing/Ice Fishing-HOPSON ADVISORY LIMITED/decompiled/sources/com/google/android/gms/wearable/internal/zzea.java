package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzea extends AbstractSafeParcelable implements DataItem {
    public static final Parcelable.Creator<zzea> CREATOR = new zzeb();
    private final Uri zza;
    private final Map zzb;
    private byte[] zzc;

    zzea(Uri uri, Bundle bundle, byte[] bArr) {
        this.zza = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            parcelable.getClass();
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.zzb = hashMap;
        this.zzc = bArr;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ DataItem freeze() {
        return this;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Map<String, DataItemAsset> getAssets() {
        return this.zzb;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final byte[] getData() {
        return this.zzc;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Uri getUri() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final /* synthetic */ DataItem setData(byte[] bArr) {
        this.zzc = bArr;
        return this;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.zzc;
        sb.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Map map = this.zzb;
        int size = map.size();
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 12);
        sb2.append(", numAssets=");
        sb2.append(size);
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.zza);
        String.valueOf(valueOf);
        sb.append(", uri=".concat(String.valueOf(valueOf)));
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : map.keySet()) {
            String valueOf2 = String.valueOf(map.get(str));
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(valueOf2).length());
            sb3.append("\n    ");
            sb3.append(str);
            sb3.append(": ");
            sb3.append(valueOf2);
            sb.append(sb3.toString());
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.zzb.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((DataItemAsset) entry.getValue()));
        }
        SafeParcelWriter.writeBundle(parcel, 4, bundle, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
