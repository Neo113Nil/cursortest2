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
import com.IceFishing.LiveIceFishing.C5248R;
import g.AbstractC4528a;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC4705i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f39151a;

    /* renamed from: b, reason: collision with root package name */
    public int f39152b;

    /* renamed from: c, reason: collision with root package name */
    public final View f39153c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f39154d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f39155e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f39156f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f39157g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f39158h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f39159j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f39160k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f39161l;

    /* renamed from: m, reason: collision with root package name */
    public C4708k f39162m;

    /* renamed from: n, reason: collision with root package name */
    public final int f39163n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f39164o;

    public Y0(Toolbar toolbar, boolean z6) {
        Drawable drawable;
        this.f39163n = 0;
        this.f39151a = toolbar;
        this.f39158h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.f39157g = this.f39158h != null;
        this.f39156f = toolbar.getNavigationIcon();
        l4.g s9 = l4.g.s(toolbar.getContext(), null, AbstractC4528a.f37550a, C5248R.attr.actionBarStyle);
        int i = 15;
        this.f39164o = s9.i(15);
        if (z6) {
            TypedArray typedArray = (TypedArray) s9.f38917v;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f39157g = true;
                this.f39158h = text;
                if ((this.f39152b & 8) != 0) {
                    Toolbar toolbar2 = this.f39151a;
                    toolbar2.setTitle(text);
                    if (this.f39157g) {
                        O.X.p(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.f39152b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable i4 = s9.i(20);
            if (i4 != null) {
                this.f39155e = i4;
                d();
            }
            Drawable i6 = s9.i(17);
            if (i6 != null) {
                this.f39154d = i6;
                d();
            }
            if (this.f39156f == null && (drawable = this.f39164o) != null) {
                this.f39156f = drawable;
                int i9 = this.f39152b & 4;
                Toolbar toolbar3 = this.f39151a;
                if (i9 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f39153c;
                if (view != null && (this.f39152b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f39153c = inflate;
                if (inflate != null && (this.f39152b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f39152b | 16);
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
                toolbar.f4564M.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f4557E = resourceId2;
                Z z9 = toolbar.f4587u;
                if (z9 != null) {
                    z9.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f4558F = resourceId3;
                Z z10 = toolbar.f4589v;
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
                this.f39164o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f39152b = i;
        }
        s9.t();
        if (C5248R.string.abc_action_bar_up_description != this.f39163n) {
            this.f39163n = C5248R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                b(this.f39163n);
            }
        }
        this.f39159j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new X0(this));
    }

    public final void a(int i) {
        View view;
        int i4 = this.f39152b ^ i;
        this.f39152b = i;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i & 4) != 0) {
                    c();
                }
                int i6 = this.f39152b & 4;
                Toolbar toolbar = this.f39151a;
                if (i6 != 0) {
                    Drawable drawable = this.f39156f;
                    if (drawable == null) {
                        drawable = this.f39164o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                d();
            }
            int i9 = i4 & 8;
            Toolbar toolbar2 = this.f39151a;
            if (i9 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f39158h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f39153c) == null) {
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
        this.f39159j = i == 0 ? null : this.f39151a.getContext().getString(i);
        c();
    }

    public final void c() {
        if ((this.f39152b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f39159j);
            Toolbar toolbar = this.f39151a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f39163n);
            } else {
                toolbar.setNavigationContentDescription(this.f39159j);
            }
        }
    }

    public final void d() {
        Drawable drawable;
        int i = this.f39152b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f39155e;
            if (drawable == null) {
                drawable = this.f39154d;
            }
        } else {
            drawable = this.f39154d;
        }
        this.f39151a.setLogo(drawable);
    }
}
