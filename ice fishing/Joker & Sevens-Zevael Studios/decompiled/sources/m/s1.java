package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s1 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f4439a;

    /* renamed from: b, reason: collision with root package name */
    public int f4440b;

    /* renamed from: c, reason: collision with root package name */
    public View f4441c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f4442d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4443e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4444f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4445g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f4446h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f4447i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f4448j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f4449k;

    /* renamed from: l, reason: collision with root package name */
    public int f4450l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4451m;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f4439a;
        int i11 = this.f4440b ^ i10;
        this.f4440b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f4440b & 4) != 0) {
                    Drawable drawable = this.f4444f;
                    if (drawable == null) {
                        drawable = this.f4451m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                c();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f4446h);
                    toolbar.setSubtitle(this.f4447i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f4441c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f4439a;
        if ((this.f4440b & 4) != 0) {
            if (TextUtils.isEmpty(this.f4448j)) {
                toolbar.setNavigationContentDescription(this.f4450l);
            } else {
                toolbar.setNavigationContentDescription(this.f4448j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f4440b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f4443e;
            if (drawable == null) {
                drawable = this.f4442d;
            }
        } else {
            drawable = this.f4442d;
        }
        this.f4439a.setLogo(drawable);
    }
}
