package O;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f2203a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f2204b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f2205c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2206d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f2203a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f2204b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f2205c = declaredField3;
            declaredField3.setAccessible(true);
            f2206d = true;
        } catch (ReflectiveOperationException e9) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e9.getMessage(), e9);
        }
    }
}
