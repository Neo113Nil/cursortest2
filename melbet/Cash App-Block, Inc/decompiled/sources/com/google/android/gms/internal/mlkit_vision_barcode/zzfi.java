package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.filament.Box;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzfi implements EncoderConfig {
    public static final zzff zzb = new zzff(1);
    public final /* synthetic */ int $r8$classId;
    public Object zzc;
    public Object zzd;
    public Object zze;

    public zzfi(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 2:
                break;
            default:
                this.zzc = new HashMap();
                this.zzd = new HashMap();
                this.zze = zzb;
                break;
        }
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public /* bridge */ /* synthetic */ EncoderConfig registerEncoder(Class cls, ObjectEncoder objectEncoder) {
        ((HashMap) this.zzc).put(cls, objectEncoder);
        ((HashMap) this.zzd).remove(cls);
        return this;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 1:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.zzc);
                sb.append('{');
                Box box = (Box) ((Box) this.zzd).mHalfExtent;
                String str = "";
                while (box != null) {
                    Object obj = box.mCenter;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
                    }
                    box = (Box) box.mHalfExtent;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public zzfi(String str) {
        this.$r8$classId = 1;
        Box box = new Box(16);
        this.zzd = box;
        this.zze = box;
        this.zzc = str;
    }
}
