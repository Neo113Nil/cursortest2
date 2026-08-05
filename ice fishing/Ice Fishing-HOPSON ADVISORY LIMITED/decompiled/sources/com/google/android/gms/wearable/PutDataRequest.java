package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public class PutDataRequest extends AbstractSafeParcelable {
    public static final String WEAR_URI_SCHEME = "wear";
    private final Uri zzc;
    private final Bundle zzd;
    private byte[] zze;
    private long zzf;
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new zzq();
    private static final long zza = TimeUnit.MINUTES.toMillis(30);
    private static final Random zzb = new SecureRandom();

    private PutDataRequest(Uri uri) {
        this(uri, new Bundle(), null, zza);
    }

    public static PutDataRequest create(String str) {
        com.google.android.gms.internal.wearable.zzai.zzd(str, "path must not be null");
        return zza(zzb(str));
    }

    public static PutDataRequest createFromDataItem(DataItem dataItem) {
        com.google.android.gms.internal.wearable.zzai.zzd(dataItem, "source must not be null");
        PutDataRequest zza2 = zza(dataItem.getUri());
        for (Map.Entry<String, DataItemAsset> entry : dataItem.getAssets().entrySet()) {
            if (entry.getValue().getId() == null) {
                String key = entry.getKey();
                String.valueOf(key);
                throw new IllegalStateException("Cannot create an asset for a put request without a digest: ".concat(String.valueOf(key)));
            }
            zza2.putAsset(entry.getKey(), Asset.createFromRef(entry.getValue().getId()));
        }
        zza2.setData(dataItem.getData());
        return zza2;
    }

    public static PutDataRequest createWithAutoAppendedId(String str) {
        com.google.android.gms.internal.wearable.zzai.zzd(str, "pathPrefix must not be null");
        StringBuilder sb = new StringBuilder(str);
        if (!str.endsWith("/")) {
            sb.append("/");
        }
        sb.append("PN");
        sb.append(zzb.nextLong());
        return new PutDataRequest(zzb(sb.toString()));
    }

    public static PutDataRequest zza(Uri uri) {
        com.google.android.gms.internal.wearable.zzai.zzd(uri, "uri must not be null");
        return new PutDataRequest(uri);
    }

    private static Uri zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        }
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        if (str.startsWith("//")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        return new Uri.Builder().scheme(WEAR_URI_SCHEME).path(str).build();
    }

    public Asset getAsset(String str) {
        com.google.android.gms.internal.wearable.zzai.zzd(str, "key must not be null");
        return (Asset) this.zzd.getParcelable(str);
    }

    public Map<String, Asset> getAssets() {
        HashMap hashMap = new HashMap();
        Bundle bundle = this.zzd;
        for (String str : bundle.keySet()) {
            hashMap.put(str, (Asset) bundle.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @Pure
    public byte[] getData() {
        return this.zze;
    }

    public Uri getUri() {
        return this.zzc;
    }

    public boolean hasAsset(String str) {
        com.google.android.gms.internal.wearable.zzai.zzd(str, "key must not be null");
        return this.zzd.containsKey(str);
    }

    public boolean isUrgent() {
        return this.zzf == 0;
    }

    public PutDataRequest removeAsset(String str) {
        com.google.android.gms.internal.wearable.zzai.zzd(str, "key must not be null");
        this.zzd.remove(str);
        return this;
    }

    public PutDataRequest setData(byte[] bArr) {
        this.zze = bArr;
        return this;
    }

    public PutDataRequest setUrgent() {
        this.zzf = 0L;
        return this;
    }

    public String toString() {
        return toString(Log.isLoggable(DataMap.TAG, 3));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        com.google.android.gms.internal.wearable.zzai.zzd(parcel, "dest must not be null");
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getUri(), i, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeByteArray(parcel, 5, getData(), false);
        SafeParcelWriter.writeLong(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    PutDataRequest(Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.zzc = uri;
        this.zzd = bundle;
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        this.zze = bArr;
        this.zzf = j;
    }

    public String toString(boolean z) {
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.zze;
        sb.append("dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Bundle bundle = this.zzd;
        int size = bundle.size();
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 12);
        sb2.append(", numAssets=");
        sb2.append(size);
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.zzc);
        String.valueOf(valueOf);
        sb.append(", uri=".concat(String.valueOf(valueOf)));
        long j = this.zzf;
        StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 15);
        sb3.append(", syncDeadline=");
        sb3.append(j);
        sb.append(sb3.toString());
        if (!z) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : bundle.keySet()) {
            String valueOf2 = String.valueOf(bundle.getParcelable(str));
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(valueOf2).length());
            sb4.append("\n    ");
            sb4.append(str);
            sb4.append(": ");
            sb4.append(valueOf2);
            sb.append(sb4.toString());
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    public PutDataRequest putAsset(String str, Asset asset) {
        str.getClass();
        asset.getClass();
        this.zzd.putParcelable(str, asset);
        return this;
    }
}
