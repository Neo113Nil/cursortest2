package p0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: p0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0321C extends h0.f {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f4131g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f4132h = true;
    public static boolean i = true;
    public static boolean j = true;

    @Override // h0.f
    public void B(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.B(view, i2);
        } else if (j) {
            try {
                AbstractC0320B.a(view, i2);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public void E(View view, int i2, int i3, int i4, int i5) {
        if (i) {
            try {
                AbstractC0319A.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void F(View view, Matrix matrix) {
        if (f4131g) {
            try {
                z.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f4131g = false;
            }
        }
    }

    public void G(View view, Matrix matrix) {
        if (f4132h) {
            try {
                z.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f4132h = false;
            }
        }
    }
}
