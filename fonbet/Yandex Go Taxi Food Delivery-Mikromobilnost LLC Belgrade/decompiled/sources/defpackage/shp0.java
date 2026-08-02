package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes10.dex */
public final class shp0 {
    public final rhp0 a;

    public shp0(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new qhp0(nestedScrollView);
        } else {
            this.a = new ity();
        }
    }

    public static shp0 a(NestedScrollView nestedScrollView) {
        return new shp0(nestedScrollView);
    }

    public final void b(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
