package com.google.android.gms.internal.time;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class zzdq {
    public final String zza;
    public final Class zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final long zze;

    public zzdq(String str, Class cls, boolean z, boolean z2) {
        if (str.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("identifier must not be empty");
            throw null;
        }
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
            a$$ExternalSyntheticBUOutline0.m$3("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_'))) {
                a$$ExternalSyntheticBUOutline0.m$3("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        this.zzd = z2;
        int identityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.zze = j;
    }

    public final String toString() {
        String name = getClass().getName();
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m108m(name, "/"), this.zza, "[", this.zzb.getName(), "]");
    }

    public void zza(Iterator it, zzem zzemVar) {
        while (it.hasNext()) {
            zzb(it.next(), zzemVar);
        }
    }

    public void zzb(Object obj, zzem zzemVar) {
        zzemVar.zza(obj, this.zza);
    }
}
