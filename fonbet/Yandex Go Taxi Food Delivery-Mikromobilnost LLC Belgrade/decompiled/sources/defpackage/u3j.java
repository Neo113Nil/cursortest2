package defpackage;

import android.view.View;
import android.widget.Space;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes12.dex */
public final class u3j implements zo31 {
    public final GoFrameLayout a;
    public final ListItemComponent b;
    public final ListItemComponent c;
    public final Space d;

    public u3j(GoFrameLayout goFrameLayout, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, Space space) {
        this.a = goFrameLayout;
        this.b = listItemComponent;
        this.c = listItemComponent2;
        this.d = space;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
