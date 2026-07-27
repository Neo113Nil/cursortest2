package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC4740i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f39353a;

    /* renamed from: b, reason: collision with root package name */
    public int f39354b;

    /* renamed from: c, reason: collision with root package name */
    public final View f39355c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f39356d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f39357e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f39358f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f39359g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f39360h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f39361j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f39362k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f39363l;

    /* renamed from: m, reason: collision with root package name */
    public C4743k f39364m;

    /* renamed from: n, reason: collision with root package name */
    public final int f39365n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f39366o;

    public Y0(Toolbar toolbar, boolean z8) {
        Drawable drawable;
        this.f39365n = 0;
        this.f39353a = toolbar;
        this.f39360h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.f39359g = this.f39360h != null;
        this.f39358f = toolbar.getNavigationIcon();
        Q0 p6 = Q0.p(toolbar.getContext(), null, AbstractC4518a.f37818a, C5284R.attr.actionBarStyle);
        int i = 15;
        this.f39366o = p6.g(15);
        if (z8) {
            TypedArray typedArray = (TypedArray) p6.f39326c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f39359g = true;
                this.f39360h = text;
                if ((this.f39354b & 8) != 0) {
                    Toolbar toolbar2 = this.f39353a;
                    toolbar2.setTitle(text);
                    if (this.f39359g) {
                        O.X.p(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.f39354b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable g9 = p6.g(20);
            if (g9 != null) {
                this.f39357e = g9;
                d();
            }
            Drawable g10 = p6.g(17);
            if (g10 != null) {
                this.f39356d = g10;
                d();
            }
            if (this.f39358f == null && (drawable = this.f39366o) != null) {
                this.f39358f = drawable;
                int i4 = this.f39354b & 4;
                Toolbar toolbar3 = this.f39353a;
                if (i4 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f39355c;
                if (view != null && (this.f39354b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f39355c = inflate;
                if (inflate != null && (this.f39354b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f39354b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f4713M.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f4706E = resourceId2;
                Z z9 = toolbar.f4732u;
                if (z9 != null) {
                    z9.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f4707F = resourceId3;
                Z z10 = toolbar.f4734v;
                if (z10 != null) {
                    z10.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f39366o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f39354b = i;
        }
        p6.q();
        if (C5284R.string.abc_action_bar_up_description != this.f39365n) {
            this.f39365n = C5284R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                b(this.f39365n);
            }
        }
        this.f39361j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new X0(this));
    }

    public final void a(int i) {
        View view;
        int i4 = this.f39354b ^ i;
        this.f39354b = i;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i & 4) != 0) {
                    c();
                }
                int i9 = this.f39354b & 4;
                Toolbar toolbar = this.f39353a;
                if (i9 != 0) {
                    Drawable drawable = this.f39358f;
                    if (drawable == null) {
                        drawable = this.f39366o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                d();
            }
            int i10 = i4 & 8;
            Toolbar toolbar2 = this.f39353a;
            if (i10 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f39360h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f39355c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b(int i) {
        this.f39361j = i == 0 ? null : this.f39353a.getContext().getString(i);
        c();
    }

    public final void c() {
        if ((this.f39354b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f39361j);
            Toolbar toolbar = this.f39353a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f39365n);
            } else {
                toolbar.setNavigationContentDescription(this.f39361j);
            }
        }
    }

    public final void d() {
        Drawable drawable;
        int i = this.f39354b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f39357e;
            if (drawable == null) {
                drawable = this.f39356d;
            }
        } else {
            drawable = this.f39356d;
        }
        this.f39353a.setLogo(drawable);
    }
}
