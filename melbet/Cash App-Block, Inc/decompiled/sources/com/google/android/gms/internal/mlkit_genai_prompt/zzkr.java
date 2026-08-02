package com.google.android.gms.internal.mlkit_genai_prompt;

import com.google.android.gms.internal.mlkit_vision_barcode.zzbc;
import java.io.Serializable;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzkr {
    public final /* synthetic */ int $r8$classId;
    public final Serializable zza;
    public final String zzb;
    public volatile Logger zzc;

    public zzkr(Class cls, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = new zzbc();
                this.zzb = cls.getName();
                break;
            default:
                this.zza = new zzia();
                this.zzb = cls.getName();
                break;
        }
    }

    public final Logger zza() {
        Logger logger;
        Logger logger2;
        switch (this.$r8$classId) {
            case 0:
                Logger logger3 = this.zzc;
                if (logger3 != null) {
                    return logger3;
                }
                synchronized (((zzia) this.zza)) {
                    try {
                        logger = this.zzc;
                        if (logger == null) {
                            logger = Logger.getLogger(this.zzb);
                            this.zzc = logger;
                        }
                    } finally {
                    }
                }
                return logger;
            default:
                Logger logger4 = this.zzc;
                if (logger4 != null) {
                    return logger4;
                }
                synchronized (((zzbc) this.zza)) {
                    try {
                        logger2 = this.zzc;
                        if (logger2 == null) {
                            logger2 = Logger.getLogger(this.zzb);
                            this.zzc = logger2;
                        }
                    } finally {
                    }
                }
                return logger2;
        }
    }
}
