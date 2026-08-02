package defpackage;

import android.view.View;
import android.widget.Space;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.view.GoConstraintLayout;

/* loaded from: classes6.dex */
public final class q6m implements zo31 {
    public final GoConstraintLayout a;
    public final Space b;
    public final View c;

    public q6m(GoConstraintLayout goConstraintLayout, ViewPager2 viewPager2, Space space, GoConstraintLayout goConstraintLayout2, View view) {
        this.a = goConstraintLayout;
        this.b = space;
        this.c = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
