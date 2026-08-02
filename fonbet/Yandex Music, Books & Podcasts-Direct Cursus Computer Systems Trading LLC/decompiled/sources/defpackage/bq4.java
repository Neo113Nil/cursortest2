package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class bq4 {
    public Method a;
    public Method b;
    public Method c;

    public /* synthetic */ bq4(Method method, Method method2, Method method3) {
        this.a = method;
        this.b = method2;
        this.c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
