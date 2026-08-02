package l1;

import android.util.Log;
import java.util.HashSet;

/* renamed from: l1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4668c {

    /* renamed from: a, reason: collision with root package name */
    public static final C4667b f38814a = new C4667b();

    public static void a() {
        f38814a.getClass();
    }

    public static void b(String str) {
        f38814a.getClass();
        HashSet hashSet = C4667b.f38813a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        f38814a.getClass();
        HashSet hashSet = C4667b.f38813a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
