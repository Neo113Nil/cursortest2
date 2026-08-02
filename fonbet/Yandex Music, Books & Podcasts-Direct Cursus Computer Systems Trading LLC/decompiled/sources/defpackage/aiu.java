package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class aiu extends ixf {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;

    public void O(View view, int i, int i2, int i3, int i4) {
        if (f) {
            try {
                mi.G(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    public void P(int i, View view) {
        if (Build.VERSION.SDK_INT != 28) {
            if (g) {
                try {
                    z5w.b(i, view);
                    return;
                } catch (NoSuchMethodError unused) {
                    g = false;
                    return;
                }
            }
            return;
        }
        if (!ixf.c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                ixf.b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            ixf.c = true;
        }
        Field field = ixf.b;
        if (field != null) {
            try {
                ixf.b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void Q(View view, Matrix matrix) {
        if (d) {
            try {
                mi.Q(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void R(ViewGroup viewGroup, Matrix matrix) {
        if (e) {
            try {
                mi.R(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}
