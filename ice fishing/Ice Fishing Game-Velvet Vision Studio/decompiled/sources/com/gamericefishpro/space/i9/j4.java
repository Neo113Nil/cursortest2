package com.gamericefishpro.space.i9;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j4 {
    public static final com.gamericefishpro.space.t.e a = new com.gamericefishpro.space.t.e(0);

    public static synchronized Uri a() {
        com.gamericefishpro.space.t.e eVar = a;
        Uri uri = (Uri) eVar.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        eVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
