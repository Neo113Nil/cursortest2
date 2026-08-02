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
import com.icefishingapp.icefishing.C5275R;
import g.AbstractC4518a;

/* loaded from: classes.dex */
public final class X0 implements InterfaceC4692i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f39081a;

    /* renamed from: b, reason: collision with root package name */
    public int f39082b;

    /* renamed from: c, reason: collision with root package name */
    public final View f39083c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f39084d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f39085e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f39086f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f39087g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f39088h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f39089j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f39090k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f39091l;

    /* renamed from: m, reason: collision with root package name */
    public C4695k f39092m;

    /* renamed from: n, reason: collision with root package name */
    public final int f39093n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f39094o;

    public X0(Toolbar toolbar, boolean z3) {
        Drawable drawable;
        this.f39093n = 0;
        this.f39081a = toolbar;
        this.f39088h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.f39087g = this.f39088h != null;
        this.f39086f = toolbar.getNavigationIcon();
        j4.g s9 = j4.g.s(toolbar.getContext(), null, AbstractC4518a.f37588a, C5275R.attr.actionBarStyle);
        int i = 15;
        this.f39094o = s9.i(15);
        if (z3) {
            TypedArray typedArray = (TypedArray) s9.f38405v;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f39087g = true;
                this.f39088h = text;
                if ((this.f39082b & 8) != 0) {
                    Toolbar toolbar2 = this.f39081a;
                    toolbar2.setTitle(text);
                    if (this.f39087g) {
                        O.X.p(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.f39082b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable i6 = s9.i(20);
            if (i6 != null) {
                this.f39085e = i6;
                d();
            }
            Drawable i9 = s9.i(17);
            if (i9 != null) {
                this.f39084d = i9;
                d();
            }
            if (this.f39086f == null && (drawable = this.f39094o) != null) {
                this.f39086f = drawable;
                int i10 = this.f39082b & 4;
                Toolbar toolbar3 = this.f39081a;
                if (i10 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f39083c;
                if (view != null && (this.f39082b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f39083c = inflate;
                if (inflate != null && (this.f39082b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f39082b | 16);
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
                toolbar.f4598M.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f4591E = resourceId2;
                Z z6 = toolbar.f4617u;
                if (z6 != null) {
                    z6.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f4592F = resourceId3;
                Z z9 = toolbar.f4619v;
                if (z9 != null) {
                    z9.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f39094o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f39082b = i;
        }
        s9.t();
        if (C5275R.string.abc_action_bar_up_description != this.f39093n) {
            this.f39093n = C5275R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                b(this.f39093n);
            }
        }
        this.f39089j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new W0(this));
    }

    public final void a(int i) {
        View view;
        int i6 = this.f39082b ^ i;
        this.f39082b = i;
        if (i6 != 0) {
            if ((i6 & 4) != 0) {
                if ((i & 4) != 0) {
                    c();
                }
                int i9 = this.f39082b & 4;
                Toolbar toolbar = this.f39081a;
                if (i9 != 0) {
                    Drawable drawable = this.f39086f;
                    if (drawable == null) {
                        drawable = this.f39094o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i6 & 3) != 0) {
                d();
            }
            int i10 = i6 & 8;
            Toolbar toolbar2 = this.f39081a;
            if (i10 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f39088h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i6 & 16) == 0 || (view = this.f39083c) == null) {
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
        this.f39089j = i == 0 ? null : this.f39081a.getContext().getString(i);
        c();
    }

    public final void c() {
        if ((this.f39082b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f39089j);
            Toolbar toolbar = this.f39081a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f39093n);
            } else {
                toolbar.setNavigationContentDescription(this.f39089j);
            }
        }
    }

    public final void d() {
        Drawable drawable;
        int i = this.f39082b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f39085e;
            if (drawable == null) {
                drawable = this.f39084d;
            }
        } else {
            drawable = this.f39084d;
        }
        this.f39081a.setLogo(drawable);
    }
}
