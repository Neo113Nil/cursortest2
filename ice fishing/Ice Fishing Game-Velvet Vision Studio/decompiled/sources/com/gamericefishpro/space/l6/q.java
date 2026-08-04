package com.gamericefishpro.space.l6;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final Object b = new Object();
    public static volatile q c;
    public final int a;

    public q(int i) {
        this.a = i;
    }

    public static q c() {
        q qVar;
        synchronized (b) {
            try {
                if (c == null) {
                    c = new q(3);
                }
                qVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public static String d(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void a(String str, String str2) {
        if (this.a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void b(String str, String str2, Throwable th) {
        if (this.a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void e(String str, String str2) {
        if (this.a <= 5) {
            Log.w(str, str2);
        }
    }
}
