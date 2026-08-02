package com.google.android.libraries.places.internal;

import com.google.android.gms.auth.api.zbc;
import java.lang.reflect.Array;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbrh {
    public static final Object[][] zza = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
    public List zzb;
    public final zzbor zzc = zzbor.zza;
    public Object[][] zzd = zza;

    public final void zza(zbc zbcVar, Object obj) {
        Object[][] objArr;
        int i = 0;
        while (true) {
            objArr = this.zzd;
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (zbcVar == objArr[i][0]) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            int length = objArr.length;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, length + 1, 2);
            System.arraycopy(objArr, 0, objArr2, 0, length);
            this.zzd = objArr2;
            i = objArr2.length - 1;
        }
        this.zzd[i] = new Object[]{zbcVar, obj};
    }
}
