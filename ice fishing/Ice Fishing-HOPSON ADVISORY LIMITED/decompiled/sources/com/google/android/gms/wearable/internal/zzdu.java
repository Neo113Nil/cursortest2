package com.google.android.gms.wearable.internal;

import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzdu implements DataEvent {
    private final int zza;
    private final DataItem zzb;

    public zzdu(DataEvent dataEvent) {
        this.zza = dataEvent.getType();
        this.zzb = new zzdz(dataEvent.getDataItem());
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ DataEvent freeze() {
        return this;
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final DataItem getDataItem() {
        return this.zzb;
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final int getType() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        int i = this.zza;
        String str = i == 1 ? "changed" : i == 2 ? "deleted" : EnvironmentCompat.MEDIA_UNKNOWN;
        String obj = this.zzb.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 42);
        sb.append("DataEventEntity{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(obj);
        sb.append(" }");
        return sb.toString();
    }
}
