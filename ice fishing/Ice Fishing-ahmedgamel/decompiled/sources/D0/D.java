package D0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class D extends com.bumptech.glide.d {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f415d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f416e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f417f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f418g = true;

    @Override // com.bumptech.glide.d
    public void I(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.I(view, i);
        } else if (f418g) {
            try {
                C.a(view, i);
            } catch (NoSuchMethodError unused) {
                f418g = false;
            }
        }
    }

    public void Q(View view, int i, int i4, int i6, int i9) {
        if (f417f) {
            try {
                B.a(view, i, i4, i6, i9);
            } catch (NoSuchMethodError unused) {
                f417f = false;
            }
        }
    }

    public void R(View view, Matrix matrix) {
        if (f415d) {
            try {
                A.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f415d = false;
            }
        }
    }

    public void S(View view, Matrix matrix) {
        if (f416e) {
            try {
                A.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f416e = false;
            }
        }
    }
}
