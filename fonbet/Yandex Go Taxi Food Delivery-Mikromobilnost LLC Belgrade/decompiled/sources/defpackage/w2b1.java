package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public abstract class w2b1 {
    public static au2 a;

    public static final String a(String str) {
        String[] strArr = (String[]) new Regex("\\W+").l(0, str).toArray(new String[0]);
        return strArr.length > 1 ? c(strArr[0]).concat(c(strArr[strArr.length - 1])) : strArr.length == 1 ? c(strArr[0]) : "";
    }

    public static final Set b(o4o0 o4o0Var) {
        if (o4o0Var instanceof l4o0) {
            zgz.a("ParkingPresentationState doesn't have numbers", new IllegalStateException());
            return EmptySet.a;
        }
        if (o4o0Var instanceof k4o0) {
            return ((k4o0) o4o0Var).d;
        }
        if (o4o0Var instanceof m4o0) {
            return Collections.singleton(((m4o0) o4o0Var).d);
        }
        w511.b();
        return null;
    }

    public static final String c(String str) {
        return (TextUtils.isEmpty(str) ? "" : String.valueOf(str.charAt(0))).toUpperCase(Locale.getDefault());
    }

    public static final au2 d() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("HumanWalk", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 e = nnm.e(13.21f, 4.62f);
        e.e(-0.86f, 0.62f, -2.36f, 0.03f, -2.98f, -0.83f);
        e.b(1.92f, 1.92f, true, true, 3.11f, -2.27f);
        e.e(0.63f, 0.86f, 0.73f, 2.47f, -0.13f, 3.1f);
        e.k(-0.98f, 1.33f);
        e.i(-2.49f, -0.3f);
        e.i(-2.4f, 3.24f);
        e.i(-1.6f, 3.39f);
        e.b(1.0f, 1.0f, false, false, 0.48f, 1.33f);
        e.i(0.52f, 0.25f);
        e.i(1.91f, -3.3f);
        e.i(1.06f, -1.04f);
        e.i(-0.05f, 5.16f);
        e.h(8.42f, 18.0f);
        e.i(-2.0f, 3.46f);
        e.b(1.0f, 1.0f, false, false, 0.37f, 1.37f);
        e.i(0.86f, 0.5f);
        e.i(2.5f, -4.33f);
        e.i(1.42f, -2.46f);
        e.i(2.08f, 2.56f);
        e.i(1.7f, 3.63f);
        e.b(1.0f, 1.0f, false, false, 1.32f, 0.48f);
        e.i(0.9f, -0.42f);
        e.i(-2.1f, -4.53f);
        e.i(-2.24f, -3.9f);
        e.i(0.3f, -2.5f);
        e.i(2.4f, 1.85f);
        e.b(1.0f, 1.0f, false, false, 1.34f, -0.1f);
        e.i(0.42f, -0.44f);
        e.i(-2.88f, -2.77f);
        e.i(-0.99f, -0.95f);
        e.i(0.15f, -1.27f);
        e.b(2.0f, 2.0f, false, false, -1.74f, -2.23f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }
}
