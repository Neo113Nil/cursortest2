package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.a;

/* loaded from: classes3.dex */
public final class ye3 extends se3 {
    public final Boolean a;
    public final kqv b;
    public Window c;
    public boolean d;

    public ye3(View view, kqv kqvVar) {
        this.b = kqvVar;
        a materialShapeDrawable = BottomSheetBehavior.from(view).getMaterialShapeDrawable();
        ColorStateList backgroundTintList = materialShapeDrawable != null ? materialShapeDrawable.b.d : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(qgg.U(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList n = mi.n(view.getBackground());
        Integer valueOf = n != null ? Integer.valueOf(n.getDefaultColor()) : null;
        if (valueOf != null) {
            this.a = Boolean.valueOf(qgg.U(valueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.se3
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.se3
    public final void b(View view, float f) {
        d(view);
    }

    @Override // defpackage.se3
    public final void c(int i, View view) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        kqv kqvVar = this.b;
        if (top < kqvVar.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean booleanValue = bool == null ? this.d : bool.booleanValue();
                knn knnVar = new knn(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new oqv(window, knnVar) : i >= 30 ? new nqv(window, knnVar) : i >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar)).k0(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), kqvVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                knn knnVar2 = new knn(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new oqv(window2, knnVar2) : i2 >= 30 ? new nqv(window2, knnVar2) : i2 >= 26 ? new mqv(window2, knnVar2) : new lqv(window2, knnVar2)).k0(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            knn knnVar = new knn(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            this.d = (i >= 35 ? new oqv(window, knnVar) : i >= 30 ? new nqv(window, knnVar) : i >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar)).c0();
        }
    }
}
