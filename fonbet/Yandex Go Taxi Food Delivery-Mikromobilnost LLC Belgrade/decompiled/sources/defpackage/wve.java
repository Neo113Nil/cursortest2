package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes13.dex */
public final class wve implements zo31 {
    public final NestedScrollView a;
    public final ButtonComponent b;
    public final ListItemComponent c;
    public final ListTitleComponent d;
    public final AppCompatImageView e;

    public wve(NestedScrollView nestedScrollView, ButtonComponent buttonComponent, ListItemComponent listItemComponent, ListTitleComponent listTitleComponent, AppCompatImageView appCompatImageView) {
        this.a = nestedScrollView;
        this.b = buttonComponent;
        this.c = listItemComponent;
        this.d = listTitleComponent;
        this.e = appCompatImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
