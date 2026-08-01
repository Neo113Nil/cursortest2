package D0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class D extends com.bumptech.glide.h {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f520d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f521e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f522f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f523g = true;

    @Override // com.bumptech.glide.h
    public void m(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.m(view, i);
        } else if (f523g) {
            try {
                C.a(view, i);
            } catch (NoSuchMethodError unused) {
                f523g = false;
            }
        }
    }

    public void q(View view, int i, int i6, int i9, int i10) {
        if (f522f) {
            try {
                B.a(view, i, i6, i9, i10);
            } catch (NoSuchMethodError unused) {
                f522f = false;
            }
        }
    }

    public void r(View view, Matrix matrix) {
        if (f520d) {
            try {
                A.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f520d = false;
            }
        }
    }

    public void s(View view, Matrix matrix) {
        if (f521e) {
            try {
                A.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f521e = false;
            }
        }
    }
}
