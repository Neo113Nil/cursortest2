package d0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126a {

    /* renamed from: a, reason: collision with root package name */
    public final C0127b f2831a = new C0127b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2832b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2833c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f2834d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
