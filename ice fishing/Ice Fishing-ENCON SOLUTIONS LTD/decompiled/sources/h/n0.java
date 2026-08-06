package h;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class n0 implements InterfaceC0226w {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f3297a;

    /* renamed from: b, reason: collision with root package name */
    public int f3298b;

    /* renamed from: c, reason: collision with root package name */
    public View f3299c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f3300d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f3301e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3302f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3303g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f3304h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f3305i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3306j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f3307k;

    /* renamed from: l, reason: collision with root package name */
    public int f3308l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f3309m;

    public final void a(int i2) {
        View view;
        int i3 = this.f3298b ^ i2;
        this.f3298b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i4 = this.f3298b & 4;
                Toolbar toolbar = this.f3297a;
                if (i4 != 0) {
                    Drawable drawable = this.f3302f;
                    if (drawable == null) {
                        drawable = this.f3309m;
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
            Toolbar toolbar2 = this.f3297a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f3304h);
                    toolbar2.setSubtitle(this.f3305i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f3299c) == null) {
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
        if ((this.f3298b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f3306j);
            Toolbar toolbar = this.f3297a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f3308l);
            } else {
                toolbar.setNavigationContentDescription(this.f3306j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f3298b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f3301e;
            if (drawable == null) {
                drawable = this.f3300d;
            }
        } else {
            drawable = this.f3300d;
        }
        this.f3297a.setLogo(drawable);
    }
}
