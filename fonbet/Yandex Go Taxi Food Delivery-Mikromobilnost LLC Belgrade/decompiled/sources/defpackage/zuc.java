package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.material.navigation.NavigationBarView;
import ru.yandex.taxi.design.CompanionTextStyle;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes9.dex */
public final class zuc {
    public final LinearLayout a;
    public ShimmeringRobotoTextView b;
    public RobotoTextView c;
    public CompanionTextStyle d;
    public CompanionTextStyle e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public zuc(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        this.a = linearLayout;
        CompanionTextStyle companionTextStyle = CompanionTextStyle.REGULAR;
        this.d = companionTextStyle;
        this.e = companionTextStyle;
        this.i = c.d(mrg0.component_text_size_body, linearLayout);
        this.j = c.d(mrg0.component_text_size_caption, linearLayout);
    }

    public static void a(int i, RobotoTextView robotoTextView) {
        if (i != 0) {
            if (i == 1) {
                xw31.C(17, robotoTextView);
                return;
            } else if (i == 2) {
                xw31.C(8388629, robotoTextView);
                return;
            } else if (i != 3) {
                xw31.C(NavigationBarView.ITEM_GRAVITY_START_CENTER, robotoTextView);
                return;
            }
        }
        xw31.C(NavigationBarView.ITEM_GRAVITY_START_CENTER, robotoTextView);
    }

    public final RobotoTextView b() {
        RobotoTextView robotoTextView = this.c;
        if (robotoTextView != null) {
            return robotoTextView;
        }
        int i = this.j;
        RobotoTextView robotoTextView2 = new RobotoTextView(this.a.getContext(), null, 0, 6, null);
        d(i, robotoTextView2);
        this.c = robotoTextView2;
        f(robotoTextView2, CompanionTextStyle.REGULAR);
        return robotoTextView2;
    }

    public final ShimmeringRobotoTextView c() {
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.b;
        if (shimmeringRobotoTextView != null) {
            return shimmeringRobotoTextView;
        }
        int i = this.i;
        ShimmeringRobotoTextView shimmeringRobotoTextView2 = new ShimmeringRobotoTextView(this.a.getContext(), null, 0, 6, null);
        d(i, shimmeringRobotoTextView2);
        this.b = shimmeringRobotoTextView2;
        CompanionTextStyle companionTextStyle = this.d;
        this.d = companionTextStyle;
        f(shimmeringRobotoTextView2, companionTextStyle);
        return shimmeringRobotoTextView2;
    }

    public final void d(int i, RobotoTextView robotoTextView) {
        robotoTextView.setTag("COMPANION_TEXT_TAG");
        robotoTextView.setTextSize(0, i);
        robotoTextView.setGravity(16);
        robotoTextView.setTextColorAttr(xng0.textMinor);
        robotoTextView.setVisibility(8);
        robotoTextView.setMaxLines(2);
        this.a.addView(robotoTextView, new LinearLayout.LayoutParams(-2, -2));
    }

    public final void e(RobotoTextView robotoTextView, CompanionTextStyle companionTextStyle) {
        if (robotoTextView == null) {
            return;
        }
        int i = yuc.a[companionTextStyle.ordinal()];
        if (i == 1) {
            robotoTextView.setTextColor(this.h);
            int[] iArr = up11.a;
            robotoTextView.setTypeface(eja1.w(0, 0));
        } else {
            if (i != 4) {
                return;
            }
            robotoTextView.setTextColor(this.h);
            int[] iArr2 = up11.a;
            robotoTextView.setTypeface(eja1.w(5, 0));
        }
    }

    public final void f(RobotoTextView robotoTextView, CompanionTextStyle companionTextStyle) {
        if (robotoTextView == null) {
            return;
        }
        int i = yuc.a[companionTextStyle.ordinal()];
        if (i == 1) {
            robotoTextView.setTextColor(this.f);
            int[] iArr = up11.a;
            robotoTextView.setTypeface(eja1.w(0, 0));
            return;
        }
        if (i == 2) {
            robotoTextView.setTextColor(this.g);
            int[] iArr2 = up11.a;
            robotoTextView.setTypeface(eja1.w(0, 0));
            return;
        }
        if (i == 3) {
            robotoTextView.setTextColorAttr(xng0.textMain);
            int[] iArr3 = up11.a;
            robotoTextView.setTypeface(eja1.w(0, 0));
        } else if (i == 4) {
            robotoTextView.setTextColor(this.g);
            int[] iArr4 = up11.a;
            robotoTextView.setTypeface(eja1.w(5, 0));
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            robotoTextView.setTextColorAttr(xng0.textMain);
            int[] iArr5 = up11.a;
            robotoTextView.setTypeface(eja1.w(3, 0));
        }
    }
}
