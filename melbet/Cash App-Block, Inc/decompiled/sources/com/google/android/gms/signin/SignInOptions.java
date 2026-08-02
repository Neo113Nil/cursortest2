package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class SignInOptions implements Api.ApiOptions, Api.ApiOptions.NotRequiredOptions {
    public static final SignInOptions zaa = new SignInOptions();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SignInOptions) && zzae.equal(null, null) && zzae.equal(null, null) && zzae.equal(null, null) && zzae.equal(null, null) && zzae.equal(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool, null, bool, bool, null, null, null, null});
    }
}
