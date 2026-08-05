package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.wearable.zzcs;
import com.google.android.gms.internal.wearable.zzdv;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public class DataMapItem {
    private final Uri zza;
    private final DataMap zzb;

    private DataMapItem(DataItem dataItem) {
        DataMap zzb;
        this.zza = dataItem.getUri();
        DataItem freeze = dataItem.freeze();
        byte[] data = freeze.getData();
        if (data == null && !freeze.getAssets().isEmpty()) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (data == null) {
            zzb = new DataMap();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                int size = freeze.getAssets().size();
                for (int i = 0; i < size; i++) {
                    DataItemAsset dataItemAsset = freeze.getAssets().get(Integer.toString(i));
                    if (dataItemAsset == null) {
                        String obj = freeze.toString();
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 53 + obj.length());
                        sb.append("Cannot find DataItemAsset referenced in data at ");
                        sb.append(i);
                        sb.append(" for ");
                        sb.append(obj);
                        throw new IllegalStateException(sb.toString());
                    }
                    arrayList.add(Asset.createFromRef(dataItemAsset.getId()));
                }
                zzb = com.google.android.gms.internal.wearable.zzt.zzb(new com.google.android.gms.internal.wearable.zzs(com.google.android.gms.internal.wearable.zzad.zzc(data, zzcs.zzb()), arrayList));
            } catch (zzdv | NullPointerException e) {
                String valueOf = String.valueOf(freeze.getUri());
                String encodeToString = Base64.encodeToString(data, 0);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 50 + String.valueOf(encodeToString).length());
                sb2.append("Unable to parse datamap from dataItem. uri=");
                sb2.append(valueOf);
                sb2.append(", data=");
                sb2.append(encodeToString);
                Log.w("DataItem", sb2.toString());
                String valueOf2 = String.valueOf(freeze.getUri());
                String.valueOf(valueOf2);
                throw new IllegalStateException("Unable to parse datamap from dataItem.  uri=".concat(String.valueOf(valueOf2)), e);
            }
        }
        this.zzb = zzb;
    }

    public static DataMapItem fromDataItem(DataItem dataItem) {
        Asserts.checkNotNull(dataItem, "dataItem must not be null");
        return new DataMapItem(dataItem);
    }

    public DataMap getDataMap() {
        return this.zzb;
    }

    public Uri getUri() {
        return this.zza;
    }
}
