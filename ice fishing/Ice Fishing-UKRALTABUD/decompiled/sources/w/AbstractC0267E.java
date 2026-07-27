package w;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: w.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0267E {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f3011a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f3012b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f3013c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3014d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f3011a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f3012b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f3013c = declaredField3;
            declaredField3.setAccessible(true);
            f3014d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
