package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.widget.ButtonsView;

/* loaded from: classes14.dex */
public final class uzx implements zo31 {
    public final GoFrameLayout a;
    public final ButtonsView b;
    public final y2j c;
    public final y2j d;
    public final RecyclerView e;
    public final GoFrameLayout f;

    public uzx(GoFrameLayout goFrameLayout, ButtonsView buttonsView, y2j y2jVar, y2j y2jVar2, RecyclerView recyclerView, GoFrameLayout goFrameLayout2) {
        this.a = goFrameLayout;
        this.b = buttonsView;
        this.c = y2jVar;
        this.d = y2jVar2;
        this.e = recyclerView;
        this.f = goFrameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
