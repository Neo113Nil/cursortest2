package com.google.android.gms.internal.measurement;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaax implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzaax(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                int _zza = FillrEnv$EnumUnboxingLocalUtility._zza(obj);
                int _zza2 = FillrEnv$EnumUnboxingLocalUtility._zza(obj2);
                if (_zza != _zza2) {
                    return CameraSelector$$ExternalSyntheticOutline0.compareTo(_zza, _zza2);
                }
                int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(_zza);
                if (ordinal == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (ordinal == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (ordinal == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (ordinal == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
