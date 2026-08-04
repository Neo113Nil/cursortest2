package com.gamericefishpro.space.t8;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class d extends Exception {
    public final Status d;

    public d(Status status) {
        int i = status.d;
        String str = status.e;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.d = status;
    }
}
