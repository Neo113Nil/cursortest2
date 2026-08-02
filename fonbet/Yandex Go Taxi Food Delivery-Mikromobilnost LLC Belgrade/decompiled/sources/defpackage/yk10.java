package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class yk10 implements zo31 {
    public final FrameLayout a;
    public final ListItemComponent b;
    public final ListItemComponent c;
    public final ListItemComponent d;
    public final FloatingTitleToolbarComponent e;

    public yk10(FrameLayout frameLayout, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, ListItemComponent listItemComponent3, FloatingTitleToolbarComponent floatingTitleToolbarComponent) {
        this.a = frameLayout;
        this.b = listItemComponent;
        this.c = listItemComponent2;
        this.d = listItemComponent3;
        this.e = floatingTitleToolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
