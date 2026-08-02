package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes12.dex */
public final class yus implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final RecyclerView c;
    public final RobotoTextView d;
    public final NestedScrollViewAdvanced e;
    public final GoFrameLayout f;

    public yus(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, RecyclerView recyclerView, RobotoTextView robotoTextView, NestedScrollViewAdvanced nestedScrollViewAdvanced, GoFrameLayout goFrameLayout) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = recyclerView;
        this.d = robotoTextView;
        this.e = nestedScrollViewAdvanced;
        this.f = goFrameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
