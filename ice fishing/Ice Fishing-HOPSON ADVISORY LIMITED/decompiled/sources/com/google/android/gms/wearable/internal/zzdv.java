package com.google.android.gms.wearable.internal;

import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzdv extends DataBufferRef implements DataEvent {
    private final int zza;

    public zzdv(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.zza = i2;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ DataEvent freeze() {
        return new zzdu(this);
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final DataItem getDataItem() {
        return new zzec(this.mDataHolder, this.mDataRow, this.zza);
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final int getType() {
        return getInteger("event_type");
    }

    public final String toString() {
        String str = getInteger("event_type") == 1 ? "changed" : getInteger("event_type") == 2 ? "deleted" : EnvironmentCompat.MEDIA_UNKNOWN;
        String obj = getDataItem().toString();
        StringBuilder sb = new StringBuilder(obj.length() + 39);
        sb.append("DataEventRef{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(obj);
        sb.append(" }");
        return sb.toString();
    }
}
