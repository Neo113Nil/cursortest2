package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class kh0 extends m50 {
    public static boolean eVhOlqcC = true;
    public static boolean jb9XjC4I = true;
    public static boolean k3x7lurq = true;
    public static boolean ow5vqvCr = true;

    public void OnDfzHZD(ViewGroup viewGroup, Matrix matrix) {
        if (eVhOlqcC) {
            try {
                hh0.MdtA4re8(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                eVhOlqcC = false;
            }
        }
    }

    public void eVhOlqcC(View view, int i, int i2, int i3, int i4) {
        if (k3x7lurq) {
            try {
                ih0.qoPGr6Ce(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                k3x7lurq = false;
            }
        }
    }

    public void k3x7lurq(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (ow5vqvCr) {
                try {
                    jh0.qoPGr6Ce(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    ow5vqvCr = false;
                    return;
                }
            }
            return;
        }
        if (!m50.Qr9iLBAD) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                m50.b2ZJblxo = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            m50.Qr9iLBAD = true;
        }
        Field field = m50.b2ZJblxo;
        if (field != null) {
            try {
                m50.b2ZJblxo.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void ow5vqvCr(View view, Matrix matrix) {
        if (jb9XjC4I) {
            try {
                hh0.NCTxEWno(view, matrix);
            } catch (NoSuchMethodError unused) {
                jb9XjC4I = false;
            }
        }
    }
}
