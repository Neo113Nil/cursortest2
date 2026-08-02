package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public abstract class wma1 {
    public static final w53 a = new w53();

    public static synchronized Uri a() {
        synchronized (wma1.class) {
            w53 w53Var = a;
            Uri uri = (Uri) w53Var.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            w53Var.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
