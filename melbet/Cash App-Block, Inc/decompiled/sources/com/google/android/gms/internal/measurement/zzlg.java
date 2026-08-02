package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class zzlg {
    public static final ArrayMap zzb = new ArrayMap(0);

    public static synchronized Uri zza() {
        synchronized (zzlg.class) {
            ArrayMap arrayMap = zzb;
            Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            arrayMap.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }

    public static String zzb(Context context, String str) {
        if (str.contains("#")) {
            a$$ExternalSyntheticBUOutline0.m$3("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        String packageName = context.getPackageName();
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
    }
}
