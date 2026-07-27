package h;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class q0 implements InterfaceC0179x {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2244a;

    /* renamed from: b, reason: collision with root package name */
    public int f2245b;

    /* renamed from: c, reason: collision with root package name */
    public View f2246c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f2247d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2248e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2249f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2250g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f2251h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f2252i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2253j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2254k;

    /* renamed from: l, reason: collision with root package name */
    public int f2255l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f2256m;

    public final void a(int i2) {
        View view;
        int i3 = this.f2245b ^ i2;
        this.f2245b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i4 = this.f2245b & 4;
                Toolbar toolbar = this.f2244a;
                if (i4 != 0) {
                    Drawable drawable = this.f2249f;
                    if (drawable == null) {
                        drawable = this.f2256m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f2244a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f2251h);
                    toolbar2.setSubtitle(this.f2252i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f2246c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f2245b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f2253j);
            Toolbar toolbar = this.f2244a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f2255l);
            } else {
                toolbar.setNavigationContentDescription(this.f2253j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f2245b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f2248e;
            if (drawable == null) {
                drawable = this.f2247d;
            }
        } else {
            drawable = this.f2247d;
        }
        this.f2244a.setLogo(drawable);
    }
}
