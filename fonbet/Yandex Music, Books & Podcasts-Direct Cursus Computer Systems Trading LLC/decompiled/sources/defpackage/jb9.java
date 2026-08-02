package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes3.dex */
public final class jb9 implements ja8, View.OnLayoutChangeListener {
    public int a;
    public final /* synthetic */ ViewPager2 b;
    public final /* synthetic */ ii c;
    public final /* synthetic */ eb9 d;

    public jb9(ViewPager2 viewPager2, ii iiVar, eb9 eb9Var) {
        this.b = viewPager2;
        this.c = iiVar;
        this.d = eb9Var;
        viewPager2.addOnLayoutChangeListener(this);
        srj.c(viewPager2, new nud(viewPager2, this, iiVar, 6));
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.b.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewPager2 viewPager2 = this.b;
        int width = viewPager2.getOrientation() == 0 ? viewPager2.getWidth() : viewPager2.getHeight();
        if (this.a != width) {
            this.a = width;
            this.c.invoke(Integer.valueOf(width));
        } else if (this.d.u instanceof sb9) {
            viewPager2.c();
        }
    }
}
