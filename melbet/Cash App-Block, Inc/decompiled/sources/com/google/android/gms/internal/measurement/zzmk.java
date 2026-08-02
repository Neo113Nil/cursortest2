package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;

/* loaded from: classes4.dex */
public final class zzmk extends RuntimeException {
    public final int zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzmk(int i, String str, ApiException apiException) {
        super(r5, apiException);
        String valueOf;
        if (str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + str.length());
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(i);
        }
        this.zza = i;
    }
}
