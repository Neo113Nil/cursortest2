package defpackage;

import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.TabView;

/* loaded from: classes11.dex */
public final class r25 {
    public CharSequence a;
    public int b = -1;
    public BaseIndicatorTabLayout c;
    public TabView d;

    public static void e(r25 r25Var) {
        r25Var.c = null;
        r25Var.d = null;
        r25Var.a = null;
        r25Var.b = -1;
    }

    public final int f() {
        return this.b;
    }

    public final TabView g() {
        return this.d;
    }

    public final CharSequence h() {
        return this.a;
    }

    public final void i() {
        BaseIndicatorTabLayout baseIndicatorTabLayout = this.c;
        if (baseIndicatorTabLayout != null) {
            baseIndicatorTabLayout.selectTab(this);
        } else {
            ny61.g("Tab not attached to a TabLayout");
        }
    }

    public final void j(int i) {
        this.b = i;
    }

    public final void k(CharSequence charSequence) {
        this.a = charSequence;
        TabView tabView = this.d;
        if (tabView != null) {
            tabView.update();
        }
    }
}
