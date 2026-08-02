package defpackage;

import android.view.View;
import kotlin.text.Regex;

/* loaded from: classes11.dex */
public abstract class ri91 {
    public static final int[] a = {-218348, -367039, -4308800, 5266141};
    public static final int[] b = {-41907, -1358177, -8175121, -12621575};
    public static final int[] c = {-11511075, -12416021, -12006176};
    public static final float[] d = {0.0f, 0.2656f, 0.75f, 1.0f};
    public static final float[] e = {0.0f, 0.18f, 0.402f, 0.8f};
    public static final float[] f = {0.402f, 0.8f, 1.0f};

    public static final boolean a(String str) {
        boolean z = false;
        if (evu0.y(str, "://", false) || evu0.y(str, "//", false) || new Regex(".*[a-zA-Z0-9.-]+:[0-9]+.*").h(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            if (evu0.z(" <>\"{|}\\^`", str.charAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    public static final ldb0 b(odb0 odb0Var) {
        if (odb0Var instanceof ldb0) {
            return (ldb0) odb0Var;
        }
        return null;
    }

    public static final long c(View view) {
        return view.getUniqueDrawingId();
    }
}
