package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class g8m {
    public static void a(int i, String str, String str2, Throwable th) {
        String g = f1d.g("PaySdk/", str);
        if (i < 6) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(i, g, String.valueOf(str2), th);
        }
    }
}
