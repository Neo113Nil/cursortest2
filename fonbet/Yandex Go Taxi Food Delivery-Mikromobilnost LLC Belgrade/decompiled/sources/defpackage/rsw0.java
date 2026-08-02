package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.widget.ButtonsView;

/* loaded from: classes6.dex */
public final class rsw0 implements zo31 {
    public final LinearLayout a;
    public final ButtonsView b;
    public final RecyclerView c;
    public final LinearLayout d;
    public final AppCompatImageView e;
    public final RecyclerView f;
    public final ConstraintLayout g;
    public final l7n h;
    public final GoFrameLayout i;

    public rsw0(LinearLayout linearLayout, ButtonsView buttonsView, RecyclerView recyclerView, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, RecyclerView recyclerView2, ConstraintLayout constraintLayout, l7n l7nVar, GoFrameLayout goFrameLayout) {
        this.a = linearLayout;
        this.b = buttonsView;
        this.c = recyclerView;
        this.d = linearLayout2;
        this.e = appCompatImageView;
        this.f = recyclerView2;
        this.g = constraintLayout;
        this.h = l7nVar;
        this.i = goFrameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
