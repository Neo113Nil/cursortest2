package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public class PutDataMapRequest {
    private final PutDataRequest zza;
    private final DataMap zzb;

    private PutDataMapRequest(PutDataRequest putDataRequest, DataMap dataMap) {
        this.zza = putDataRequest;
        DataMap dataMap2 = new DataMap();
        this.zzb = dataMap2;
        if (dataMap != null) {
            dataMap2.putAll(dataMap);
        }
    }

    public static PutDataMapRequest create(String str) {
        Asserts.checkNotNull(str, "path must not be null");
        return new PutDataMapRequest(PutDataRequest.create(str), null);
    }

    public static PutDataMapRequest createFromDataMapItem(DataMapItem dataMapItem) {
        Asserts.checkNotNull(dataMapItem, "source must not be null");
        return new PutDataMapRequest(PutDataRequest.zza(dataMapItem.getUri()), dataMapItem.getDataMap());
    }

    public static PutDataMapRequest createWithAutoAppendedId(String str) {
        Asserts.checkNotNull(str, "pathPrefix must not be null");
        return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(str), null);
    }

    public PutDataRequest asPutDataRequest() {
        com.google.android.gms.internal.wearable.zzs zza = com.google.android.gms.internal.wearable.zzt.zza(this.zzb);
        com.google.android.gms.internal.wearable.zzad zzadVar = zza.zza;
        PutDataRequest putDataRequest = this.zza;
        putDataRequest.setData(zzadVar.zzI());
        List list = zza.zzb;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String num = Integer.toString(i);
            Asset asset = (Asset) list.get(i);
            if (num == null) {
                String valueOf = String.valueOf(asset);
                String.valueOf(valueOf);
                throw new IllegalStateException("asset key cannot be null: ".concat(String.valueOf(valueOf)));
            }
            if (asset == null) {
                throw new IllegalStateException("asset cannot be null: key=".concat(num));
            }
            if (Log.isLoggable(DataMap.TAG, 3)) {
                String obj = asset.toString();
                StringBuilder sb = new StringBuilder(num.length() + 33 + obj.length());
                sb.append("asPutDataRequest: adding asset: ");
                sb.append(num);
                sb.append(" ");
                sb.append(obj);
                Log.d(DataMap.TAG, sb.toString());
            }
            putDataRequest.putAsset(num, asset);
        }
        return putDataRequest;
    }

    public DataMap getDataMap() {
        return this.zzb;
    }

    public Uri getUri() {
        return this.zza.getUri();
    }

    public boolean isUrgent() {
        return this.zza.isUrgent();
    }

    public PutDataMapRequest setUrgent() {
        this.zza.setUrgent();
        return this;
    }
}
