package com.google.android.gms.auth.api;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zbd implements Api.ApiOptions, Api.ApiOptions.NotRequiredOptions {
    public static final zbd zba;
    public final boolean zbc;
    public final String zbd;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        zbc zbcVar = new zbc(0, (boolean) (0 == true ? 1 : 0));
        zbcVar.zba = Boolean.FALSE;
        zba = new zbd(zbcVar);
    }

    public zbd(zbc zbcVar) {
        this.zbc = ((Boolean) zbcVar.zba).booleanValue();
        this.zbd = (String) zbcVar.zbb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zbd)) {
            return false;
        }
        zbd zbdVar = (zbd) obj;
        return zzae.equal(null, null) && this.zbc == zbdVar.zbc && zzae.equal(this.zbd, zbdVar.zbd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.zbc), this.zbd});
    }
}
