package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzdz implements DataItem {
    private final Uri zza;
    private final byte[] zzb;
    private final Map zzc;

    public zzdz(DataItem dataItem) {
        this.zza = dataItem.getUri();
        this.zzb = dataItem.getData();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, DataItemAsset> entry : dataItem.getAssets().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put(entry.getKey(), entry.getValue().freeze());
            }
        }
        this.zzc = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ DataItem freeze() {
        return this;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Map<String, DataItemAsset> getAssets() {
        return this.zzc;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final byte[] getData() {
        return this.zzb;
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
    public final DataItem setData(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        String valueOf = String.valueOf(this.zza);
        String.valueOf(valueOf);
        sb.append("uri=".concat(String.valueOf(valueOf)));
        byte[] bArr = this.zzb;
        sb.append(", dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Map map = this.zzc;
        int size = map.size();
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 12);
        sb2.append(", numAssets=");
        sb2.append(size);
        sb.append(sb2.toString());
        if (isLoggable && !map.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String id = ((DataItemAsset) entry.getValue()).getId();
                StringBuilder sb3 = new StringBuilder(str.length() + String.valueOf(str2).length() + 2 + String.valueOf(id).length());
                sb3.append(str);
                sb3.append(str2);
                sb3.append(": ");
                sb3.append(id);
                sb.append(sb3.toString());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
