package com.google.android.gms.internal.mlkit_vision_face;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.fidesmo.views.ScanningStarPulseKt;
import com.stripe.android.stripe3ds2.transaction.Logger;
import com.withpersona.sdk2.camera.BitmapUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zzaq implements Map.Entry {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (ScanningStarPulseKt.zza(getKey(), entry.getKey()) && ScanningStarPulseKt.zza(getValue(), entry.getValue())) {
                    }
                }
                break;
            case 1:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (Logger.zza(getKey(), entry2.getKey()) && Logger.zza(getValue(), entry2.getValue())) {
                    }
                }
                break;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    if (BitmapUtils.zza(getKey(), entry3.getKey()) && BitmapUtils.zza(getValue(), entry3.getValue())) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.$r8$classId) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
            case 1:
                Object key2 = getKey();
                Object value2 = getValue();
                return (key2 == null ? 0 : key2.hashCode()) ^ (value2 != null ? value2.hashCode() : 0);
            default:
                Object key3 = getKey();
                Object value3 = getValue();
                return (key3 == null ? 0 : key3.hashCode()) ^ (value3 != null ? value3.hashCode() : 0);
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                break;
        }
        return Recorder$$ExternalSyntheticOutline2.m(String.valueOf(getKey()), "=", String.valueOf(getValue()));
    }
}
