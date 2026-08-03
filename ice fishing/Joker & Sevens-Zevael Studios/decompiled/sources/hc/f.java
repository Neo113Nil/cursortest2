package hc;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Method f2872a;

    /* renamed from: b, reason: collision with root package name */
    public Method f2873b;

    /* renamed from: c, reason: collision with root package name */
    public Method f2874c;

    public f(Method method, Method method2, Method method3) {
        this.f2872a = method;
        this.f2873b = method2;
        this.f2874c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
