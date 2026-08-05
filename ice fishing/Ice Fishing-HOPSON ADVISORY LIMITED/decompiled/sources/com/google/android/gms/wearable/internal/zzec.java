package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzec extends DataBufferRef implements DataItem {
    private final int zza;

    public zzec(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.zza = i2;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ DataItem freeze() {
        return new zzdz(this);
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Map<String, DataItemAsset> getAssets() {
        int i = this.zza;
        HashMap hashMap = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            zzdy zzdyVar = new zzdy(this.mDataHolder, this.mDataRow + i2);
            if (zzdyVar.getString("asset_key") != null) {
                hashMap.put(zzdyVar.getString("asset_key"), zzdyVar);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final byte[] getData() {
        return getByteArray("data");
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final Uri getUri() {
        return Uri.parse(getString("path"));
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final DataItem setData(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] byteArray = getByteArray("data");
        Map<String, DataItemAsset> assets = getAssets();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        String valueOf = String.valueOf(getUri());
        String.valueOf(valueOf);
        sb.append("uri=".concat(String.valueOf(valueOf)));
        sb.append(", dataSz=".concat((byteArray == null ? "null" : Integer.valueOf(byteArray.length)).toString()));
        int size = assets.size();
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 12);
        sb2.append(", numAssets=");
        sb2.append(size);
        sb.append(sb2.toString());
        if (isLoggable && !assets.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry<String, DataItemAsset> entry : assets.entrySet()) {
                String key = entry.getKey();
                String id = entry.getValue().getId();
                StringBuilder sb3 = new StringBuilder(str.length() + String.valueOf(key).length() + 2 + String.valueOf(id).length());
                sb3.append(str);
                sb3.append(key);
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
