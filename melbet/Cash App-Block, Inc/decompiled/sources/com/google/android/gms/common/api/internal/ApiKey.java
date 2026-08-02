package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ApiKey {
    public final int zaa;
    public final Api zab;
    public final Api.ApiOptions zac;
    public final String zad;

    public ApiKey(Api api, Api.ApiOptions apiOptions, String str) {
        this.zab = api;
        this.zac = apiOptions;
        this.zad = str;
        this.zaa = Arrays.hashCode(new Object[]{api, apiOptions, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return zzae.equal(this.zab, apiKey.zab) && zzae.equal(this.zac, apiKey.zac) && zzae.equal(this.zad, apiKey.zad);
    }

    public final int hashCode() {
        return this.zaa;
    }
}
