package y;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f8538a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f8539b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f8540c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8541d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f8538a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f8539b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f8540c = declaredField3;
            declaredField3.setAccessible(true);
            f8541d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
