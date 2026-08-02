package yads;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.b281;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes6.dex */
public final class lo1 extends FrameLayout {
    public final b281 a;
    public final FrameLayout b;
    public final ImageView c;
    public final TextView d;
    public final ImageView e;
    public final Button f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    public lo1(Context context) {
        super(context);
        this.a = new b281();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(View.generateViewId());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        gradientDrawable.setCornerRadius(b281.a(getContext(), 4.0f));
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setClipToOutline(true);
        this.b = frameLayout;
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setBackgroundColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.c = imageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setTextSize(2, 11.0f);
        textView.setTextColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        textView.setPadding(b281.a(getContext(), 4.0f), b281.a(getContext(), 0.0f), b281.a(getContext(), 4.0f), b281.a(getContext(), 0.0f));
        textView.setGravity(17);
        textView.setMaxLines(1);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.argb(216, 211, 211, 211));
        gradientDrawable2.setCornerRadius(b281.a(getContext(), 5.0f));
        textView.setBackground(gradientDrawable2);
        textView.setElevation(999.0f);
        textView.setVisibility(8);
        this.d = textView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(View.generateViewId());
        imageView2.setVisibility(8);
        this.e = imageView2;
        Button button = new Button(context, null, R.attr.borderlessButtonStyle);
        button.setId(View.generateViewId());
        button.setTextSize(2, 12.0f);
        button.setTextColor(-16745729);
        button.setTypeface(null, 1);
        button.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        button.setGravity(17);
        button.setAllCaps(false);
        button.setPadding(0, 0, 0, 0);
        button.setMinWidth(0);
        button.setMinimumWidth(0);
        button.setMinHeight(0);
        button.setMinimumHeight(0);
        button.setIncludeFontPadding(false);
        this.f = button;
        TextView textView2 = new TextView(context);
        textView2.setId(View.generateViewId());
        textView2.setTextSize(2, 10.0f);
        textView2.setTextColor(-7434605);
        textView2.setVisibility(8);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        this.g = textView2;
        ImageView imageView3 = new ImageView(context);
        imageView3.setId(View.generateViewId());
        imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView3.setVisibility(8);
        this.h = imageView3;
        TextView textView3 = new TextView(context);
        textView3.setId(View.generateViewId());
        textView3.setTextSize(2, 11.0f);
        textView3.setTextColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        textView3.setMaxLines(2);
        textView3.setVisibility(8);
        this.i = textView3;
        TextView textView4 = new TextView(context);
        textView4.setId(View.generateViewId());
        textView4.setTextSize(2, 12.0f);
        textView4.setTypeface(null, 1);
        textView4.setTextColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        textView4.setMaxLines(2);
        textView4.setEllipsize(truncateAt);
        textView4.setIncludeFontPadding(false);
        textView4.setGravity(8388659);
        this.j = textView4;
        TextView textView5 = new TextView(context);
        textView5.setId(View.generateViewId());
        textView5.setTextSize(2, 12.0f);
        textView5.setTextColor(-7434605);
        textView5.setMaxLines(1);
        textView5.setEllipsize(truncateAt);
        textView5.setVisibility(8);
        textView5.setIncludeFontPadding(false);
        textView5.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        this.k = textView5;
        setBackgroundColor(-1);
        setMinimumHeight(b281.a(getContext(), 50.0f));
        addView(frameLayout);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(textView);
        addView(imageView2);
        addView(button);
        addView(textView2);
        addView(imageView3);
        addView(textView3);
        addView(textView4);
        addView(textView5);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        FrameLayout frameLayout = this.b;
        int c = uw51.c(this, this.a, 1.0f);
        int c2 = uw51.c(this, this.a, 1.0f);
        int c3 = uw51.c(this, this.a, 1.0f) + this.l;
        b281 b281Var = this.a;
        Context context = getContext();
        b281Var.getClass();
        frameLayout.layout(c, c2, c3, i8 - b281.a(context, 1.0f));
        if (this.u) {
            ImageView imageView = this.e;
            b281 b281Var2 = this.a;
            Context context2 = getContext();
            b281Var2.getClass();
            int a = (i7 - b281.a(context2, 4.0f)) - this.e.getMeasuredWidth();
            int c4 = uw51.c(this, this.a, 4.0f);
            b281 b281Var3 = this.a;
            Context context3 = getContext();
            b281Var3.getClass();
            imageView.layout(a, c4, i7 - b281.a(context3, 4.0f), this.e.getMeasuredHeight() + uw51.c(this, this.a, 4.0f));
        }
        b281 b281Var4 = this.a;
        Context context4 = getContext();
        b281Var4.getClass();
        int a2 = (b281.a(context4, 4.0f) + (i8 / 2)) - (this.f.getMeasuredHeight() / 2);
        int c5 = uw51.c(this, this.a, 1.0f);
        Button button = this.f;
        int i9 = i7 - c5;
        button.layout(i9 - button.getMeasuredWidth(), a2, i9, this.f.getMeasuredHeight() + a2);
        if (this.v) {
            TextView textView = this.g;
            int i10 = this.m;
            b281 b281Var5 = this.a;
            Context context5 = getContext();
            b281Var5.getClass();
            int a3 = b281.a(context5, 3.0f) + i10;
            int measuredHeight = i8 - this.g.getMeasuredHeight();
            b281 b281Var6 = this.a;
            Context context6 = getContext();
            b281Var6.getClass();
            int a4 = measuredHeight - b281.a(context6, 1.0f);
            b281 b281Var7 = this.a;
            Context context7 = getContext();
            b281Var7.getClass();
            textView.layout(a3, a4, i7, i8 - b281.a(context7, 1.0f));
        }
        if (this.w) {
            if (this.x) {
                int measuredWidth = this.h.getMeasuredWidth();
                b281 b281Var8 = this.a;
                Context context8 = getContext();
                b281Var8.getClass();
                i6 = b281.a(context8, 3.0f) + measuredWidth;
            } else {
                i6 = 0;
            }
            if (this.x) {
                ImageView imageView2 = this.h;
                int i11 = this.m;
                b281 b281Var9 = this.a;
                Context context9 = getContext();
                b281Var9.getClass();
                int a5 = b281.a(context9, 4.0f) + i11;
                int i12 = this.p;
                int i13 = this.m;
                b281 b281Var10 = this.a;
                Context context10 = getContext();
                b281Var10.getClass();
                imageView2.layout(a5, i12, this.h.getMeasuredWidth() + b281.a(context10, 4.0f) + i13, this.h.getMeasuredHeight() + this.p);
            }
            TextView textView2 = this.i;
            int i14 = this.m;
            b281 b281Var11 = this.a;
            Context context11 = getContext();
            b281Var11.getClass();
            int a6 = b281.a(context11, 4.0f) + i14 + i6;
            int i15 = this.p;
            int i16 = this.m;
            b281 b281Var12 = this.a;
            Context context12 = getContext();
            b281Var12.getClass();
            textView2.layout(a6, i15, this.i.getMeasuredWidth() + b281.a(context12, 4.0f) + i16 + i6, this.i.getMeasuredHeight() + this.p);
        }
        int i17 = this.p + (this.w ? this.t : 0);
        TextView textView3 = this.j;
        int i18 = this.m;
        b281 b281Var13 = this.a;
        Context context13 = getContext();
        b281Var13.getClass();
        int a7 = b281.a(context13, 4.0f) + i18;
        int i19 = this.m;
        b281 b281Var14 = this.a;
        Context context14 = getContext();
        b281Var14.getClass();
        textView3.layout(a7, i17, this.j.getMeasuredWidth() + b281.a(context14, 4.0f) + i19, this.j.getMeasuredHeight() + i17);
        int measuredHeight2 = this.j.getMeasuredHeight() + i17;
        if (this.y && this.k.getVisibility() == 0) {
            int i20 = measuredHeight2 + this.r;
            if (this.v) {
                i8 -= this.g.getMeasuredHeight();
                i5 = this.s;
            } else {
                i5 = this.s;
            }
            int i21 = i8 - i5;
            int measuredHeight3 = this.k.getMeasuredHeight();
            int i22 = (int) ((((i21 - i20 >= 0 ? r11 : 0) - measuredHeight3) / 2.0f) + i20);
            if (i22 >= i20) {
                i20 = i22;
            }
            int i23 = this.m;
            b281 b281Var15 = this.a;
            Context context15 = getContext();
            b281Var15.getClass();
            int a8 = b281.a(context15, 4.0f) + i23;
            TextView textView4 = this.k;
            textView4.layout(a8, i20, textView4.getMeasuredWidth() + a8, measuredHeight3 + i20);
        }
        if (jl40.l(this.d.getParent(), this.b)) {
            int measuredWidth2 = this.d.getMeasuredWidth();
            int i24 = this.l;
            b281 b281Var16 = this.a;
            Context context16 = getContext();
            b281Var16.getClass();
            int a9 = i24 - b281.a(context16, 6.0f);
            if (measuredWidth2 > a9) {
                measuredWidth2 = a9;
            }
            TextView textView5 = this.d;
            int c6 = uw51.c(this, this.a, 3.0f);
            int c7 = uw51.c(this, this.a, 3.0f);
            b281 b281Var17 = this.a;
            Context context17 = getContext();
            b281Var17.getClass();
            textView5.layout(c6, c7, b281.a(context17, 3.0f) + measuredWidth2, this.d.getMeasuredHeight() + uw51.c(this, this.a, 3.0f));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int a;
        int i3;
        int c;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (size <= 0) {
            size = uw51.c(this, this.a, 320.0f);
        }
        if (size2 <= 0) {
            size2 = (size < uw51.c(this, this.a, 320.0f) || mode == 1073741824) ? uw51.c(this, this.a, 50.0f) : uw51.c(this, this.a, 250.0f);
        }
        float f = size2;
        float f2 = f / getContext().getResources().getDisplayMetrics().density;
        float f3 = size;
        float f4 = f3 / getContext().getResources().getDisplayMetrics().density;
        boolean z = f2 > 180.0f;
        boolean z2 = f4 < 320.0f;
        if (z) {
            a = (int) (f3 * (z2 ? 0.42f : 0.48f));
        } else {
            b281 b281Var = this.a;
            Context context = getContext();
            b281Var.getClass();
            a = size2 - b281.a(context, 2.0f);
            if (a < 0) {
                a = 0;
            }
        }
        this.l = a;
        b281 b281Var2 = this.a;
        Context context2 = getContext();
        b281Var2.getClass();
        this.m = b281.a(context2, 1.0f) + a;
        this.n = size;
        this.o = size2;
        b281 b281Var3 = this.a;
        Context context3 = getContext();
        b281Var3.getClass();
        int a2 = size2 - b281.a(context3, 2.0f);
        if (a2 < 0) {
            a2 = 0;
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(this.l, 1073741824), View.MeasureSpec.makeMeasureSpec(a2, 1073741824));
        int c2 = uw51.c(this, this.a, 15.0f);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(c2, 1073741824), View.MeasureSpec.makeMeasureSpec(c2, 1073741824));
        int c3 = uw51.c(this, this.a, 84.0f);
        int i5 = size - this.m;
        b281 b281Var4 = this.a;
        Context context4 = getContext();
        b281Var4.getClass();
        int a3 = i5 - b281.a(context4, 2.0f);
        if (a3 < 0) {
            a3 = 0;
        }
        this.f.measure(View.MeasureSpec.makeMeasureSpec(Math.min(a3, c3), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        float f5 = f / getContext().getResources().getDisplayMetrics().density;
        int c4 = uw51.c(this, this.a, f5 >= 80.0f ? 24.0f : 12.0f);
        int i6 = f5 >= 80.0f ? 2 : 1;
        if (this.g.getMaxLines() != i6) {
            this.g.setMaxLines(i6);
        }
        int i7 = size - this.m;
        b281 b281Var5 = this.a;
        Context context5 = getContext();
        b281Var5.getClass();
        int a4 = i7 - b281.a(context5, 3.0f);
        if (a4 < 0) {
            a4 = 0;
        }
        this.g.measure(View.MeasureSpec.makeMeasureSpec(a4, 1073741824), View.MeasureSpec.makeMeasureSpec(c4, Integer.MIN_VALUE));
        int measuredWidth = this.f.getMeasuredWidth();
        int i8 = this.n;
        float f6 = this.o / getContext().getResources().getDisplayMetrics().density;
        int c5 = uw51.c(this, this.a, 12.0f);
        this.h.measure(View.MeasureSpec.makeMeasureSpec(c5, 1073741824), View.MeasureSpec.makeMeasureSpec(c5, 1073741824));
        int c6 = uw51.c(this, this.a, 15.0f);
        if (this.x) {
            b281 b281Var6 = this.a;
            Context context6 = getContext();
            b281Var6.getClass();
            i3 = b281.a(context6, 3.0f) + c5;
        } else {
            i3 = 0;
        }
        if (this.u) {
            b281 b281Var7 = this.a;
            Context context7 = getContext();
            b281Var7.getClass();
            i8 = (i8 - b281.a(context7, 4.0f)) - c6;
        }
        int i9 = f6 < 60.0f ? 1 : 2;
        if (this.i.getMaxLines() != i9) {
            this.i.setMaxLines(i9);
        }
        TextView textView = this.i;
        int i10 = i8 - this.m;
        b281 b281Var8 = this.a;
        Context context8 = getContext();
        b281Var8.getClass();
        int a5 = (i10 - b281.a(context8, 4.0f)) - i3;
        if (a5 < 0) {
            a5 = 0;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(a5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        boolean z3 = ((float) this.o) / getContext().getResources().getDisplayMetrics().density < 60.0f;
        if (z3) {
            c = uw51.c(this, this.a, 1.0f);
        } else {
            boolean z4 = this.w;
            b281 b281Var9 = this.a;
            c = z4 ? uw51.c(this, b281Var9, 4.0f) : uw51.c(this, b281Var9, 2.0f);
        }
        this.p = c;
        this.q = uw51.c(this, this.a, z3 ? 1.0f : 2.0f);
        this.r = uw51.c(this, this.a, z3 ? 1.0f : 2.0f);
        this.s = uw51.c(this, this.a, z3 ? 1.0f : 3.0f);
        if (this.w) {
            i4 = (z3 ? this.i.getMeasuredHeight() : Math.max(this.h.getMeasuredHeight(), this.i.getMeasuredHeight())) + this.q;
        } else {
            i4 = 0;
        }
        this.t = i4;
        int i11 = this.n;
        int i12 = this.o;
        float f7 = i12 / getContext().getResources().getDisplayMetrics().density;
        int c7 = uw51.c(this, this.a, 1.0f);
        int i13 = i11 - this.m;
        b281 b281Var10 = this.a;
        Context context9 = getContext();
        b281Var10.getClass();
        int a6 = ((i13 - b281.a(context9, 4.0f)) - measuredWidth) - c7;
        if (a6 < 0) {
            a6 = 0;
        }
        int measuredHeight = this.v ? this.g.getMeasuredHeight() : 0;
        int i14 = this.p + this.t;
        boolean z5 = this.v;
        int i15 = this.s;
        if (z5) {
            i12 -= measuredHeight;
        }
        int i16 = (i12 - i15) - i14;
        if (i16 < 0) {
            i16 = 0;
        }
        this.k.setSingleLine(false);
        if (this.k.getMaxLines() != 1) {
            this.k.setMaxLines(1);
        }
        this.k.measure(View.MeasureSpec.makeMeasureSpec(a6 < 0 ? 0 : a6, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight2 = this.k.getMeasuredHeight();
        if (this.j.getMaxLines() != 1) {
            this.j.setMaxLines(1);
        }
        this.j.measure(View.MeasureSpec.makeMeasureSpec(a6, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight3 = this.j.getMeasuredHeight();
        int i17 = i16 - (this.y ? this.r + measuredHeight2 : 0);
        if (i17 >= measuredHeight3) {
            measuredHeight3 = i17;
        }
        int i18 = f7 >= 80.0f ? 3 : f7 >= 60.0f ? 2 : 1;
        if (this.j.getMaxLines() != i18) {
            this.j.setMaxLines(i18);
        }
        this.j.measure(View.MeasureSpec.makeMeasureSpec(a6, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight3, Integer.MIN_VALUE));
        int measuredHeight4 = (i16 - this.j.getMeasuredHeight()) - this.r;
        if (measuredHeight4 < 0) {
            measuredHeight4 = 0;
        }
        boolean z6 = measuredHeight4 >= measuredHeight2;
        boolean z7 = this.y;
        this.k.setVisibility((z7 && z7 && z6) ? 0 : 8);
        boolean z8 = this.y;
        if (z8 && z6 && measuredHeight2 > 0) {
            int i19 = measuredHeight4 / measuredHeight2;
            int i20 = i19 >= 1 ? i19 : 1;
            this.k.setSingleLine(false);
            if (this.k.getMaxLines() != i20) {
                this.k.setMaxLines(i20);
            }
            TextView textView2 = this.k;
            if (a6 < 0) {
                a6 = 0;
            }
            textView2.measure(View.MeasureSpec.makeMeasureSpec(a6, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight4, Integer.MIN_VALUE));
        } else {
            if (z8) {
                this.k.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            }
            if (this.y && !z6) {
                this.j.measure(View.MeasureSpec.makeMeasureSpec(a6, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE));
            }
        }
        TextView textView3 = this.d;
        int i21 = this.l;
        b281 b281Var11 = this.a;
        Context context10 = getContext();
        b281Var11.getClass();
        textView3.measure(View.MeasureSpec.makeMeasureSpec(i21 - b281.a(context10, 6.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int resolveSize = View.resolveSize(this.n, i);
        int resolveSize2 = View.resolveSize(this.o, i2);
        int c8 = uw51.c(this, this.a, 50.0f);
        if (resolveSize2 < c8) {
            resolveSize2 = c8;
        }
        setMeasuredDimension(resolveSize, resolveSize2);
    }
}
