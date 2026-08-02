package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzbov {
    public static final zzbov zza;
    public final zzbpy zzb;
    public final Executor zzc;
    public final Object[][] zzd;
    public final List zze;
    public final Boolean zzf;
    public final Integer zzg;
    public final Integer zzh;

    static {
        zzbot zzbotVar = new zzbot();
        zzbotVar.zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        zzbotVar.zzd = Collections.EMPTY_LIST;
        zza = new zzbov(zzbotVar);
    }

    public /* synthetic */ zzbov(zzbot zzbotVar) {
        this.zzb = zzbotVar.zza;
        this.zzc = zzbotVar.zzb;
        this.zzd = zzbotVar.zzc;
        this.zze = zzbotVar.zzd;
        this.zzf = zzbotVar.zze;
        this.zzg = zzbotVar.zzf;
        this.zzh = zzbotVar.zzg;
    }

    public static zzbot zzp(zzbov zzbovVar) {
        zzbot zzbotVar = new zzbot();
        zzbotVar.zza = zzbovVar.zzb;
        zzbotVar.zzb = zzbovVar.zzc;
        zzbotVar.zzc = zzbovVar.zzd;
        zzbotVar.zzd = zzbovVar.zze;
        zzbotVar.zze = zzbovVar.zzf;
        zzbotVar.zzf = zzbovVar.zzg;
        zzbotVar.zzg = zzbovVar.zzh;
        return zzbotVar;
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zzb, "deadline");
        stringHelper.add((Object) null, "authority");
        stringHelper.add((Object) null, "callCredentials");
        Executor executor = this.zzc;
        stringHelper.add(executor != null ? executor.getClass() : null, "executor");
        stringHelper.add((Object) null, "compressorName");
        stringHelper.add(Arrays.deepToString(this.zzd), "customOptions");
        stringHelper.add("waitForReady", zzk());
        stringHelper.add(this.zzg, "maxInboundMessageSize");
        stringHelper.add(this.zzh, "maxOutboundMessageSize");
        stringHelper.add((Object) null, "onReadyThreshold");
        stringHelper.add(this.zze, "streamTracerFactories");
        return stringHelper.toString();
    }

    public final zzbov zzh(zzboq zzboqVar, Object obj) {
        Object[][] objArr;
        int length;
        Trace.checkNotNull(zzboqVar, "key");
        zzbot zzp = zzp(this);
        int i = 0;
        while (true) {
            objArr = this.zzd;
            length = objArr.length;
            if (i >= length) {
                i = -1;
                break;
            }
            if (zzboqVar == objArr[i][0]) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, (i == -1 ? 1 : 0) + length, 2);
        zzp.zzc = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, length);
        Object[][] objArr3 = zzp.zzc;
        if (i == -1) {
            objArr3[length] = new Object[]{zzboqVar, obj};
        } else {
            objArr3[i] = new Object[]{zzboqVar, obj};
        }
        return new zzbov(zzp);
    }

    public final Object zzi(zzboq zzboqVar) {
        Trace.checkNotNull(zzboqVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.zzd;
            if (i >= objArr.length) {
                return null;
            }
            Object[] objArr2 = objArr[i];
            if (zzboqVar == objArr2[0]) {
                return objArr2[1];
            }
            i++;
        }
    }

    public final boolean zzk() {
        return Boolean.TRUE.equals(this.zzf);
    }
}
