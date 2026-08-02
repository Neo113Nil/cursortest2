package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.a;

/* loaded from: classes3.dex */
public final class o2b extends a {
    public final /* synthetic */ int a;

    public /* synthetic */ o2b(int i) {
        this.a = i;
    }

    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float sin;
        float cos;
        switch (this.a) {
            case 0:
                RectF a = a.a(tabLayout, view);
                RectF a2 = a.a(tabLayout, view2);
                if (a.left < a2.left) {
                    double d = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) (1.0d - Math.cos(d));
                    cos = (float) Math.sin(d);
                } else {
                    double d2 = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) Math.sin(d2);
                    cos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(wm0.c((int) a.left, sin, (int) a2.left), drawable.getBounds().top, wm0.c((int) a.right, cos, (int) a2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF a3 = a.a(tabLayout, view);
                float b = f < 0.5f ? wm0.b(1.0f, 0.0f, 0.0f, 0.5f, f) : wm0.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) a3.left, drawable.getBounds().top, (int) a3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b * 255.0f));
                break;
        }
    }
}
