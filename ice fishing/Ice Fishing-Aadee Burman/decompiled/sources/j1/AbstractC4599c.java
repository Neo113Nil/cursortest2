package j1;

import android.util.Log;
import java.util.HashSet;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4599c {

    /* renamed from: a, reason: collision with root package name */
    public static final C4598b f38302a = new C4598b();

    public static void a() {
        f38302a.getClass();
    }

    public static void b(String str) {
        f38302a.getClass();
        HashSet hashSet = C4598b.f38301a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        f38302a.getClass();
        HashSet hashSet = C4598b.f38301a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
