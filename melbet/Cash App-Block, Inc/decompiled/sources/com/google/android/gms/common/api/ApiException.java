package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class ApiException extends Exception {
    public final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiException(Status status) {
        super(r4.toString());
        int i = status.zza;
        String str = status.zzb;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        this.mStatus = status;
    }
}
