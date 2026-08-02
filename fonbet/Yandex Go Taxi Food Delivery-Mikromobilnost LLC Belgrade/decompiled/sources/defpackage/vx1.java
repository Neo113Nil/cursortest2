package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ListHeaderComponent;

/* loaded from: classes5.dex */
public final class vx1 implements zo31 {
    public final GoLinearLayout a;
    public final RecyclerView b;
    public final ListHeaderComponent c;
    public final ViewStub d;
    public final ViewStub e;

    public vx1(GoLinearLayout goLinearLayout, RecyclerView recyclerView, ListHeaderComponent listHeaderComponent, ViewStub viewStub, ViewStub viewStub2) {
        this.a = goLinearLayout;
        this.b = recyclerView;
        this.c = listHeaderComponent;
        this.d = viewStub;
        this.e = viewStub2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
