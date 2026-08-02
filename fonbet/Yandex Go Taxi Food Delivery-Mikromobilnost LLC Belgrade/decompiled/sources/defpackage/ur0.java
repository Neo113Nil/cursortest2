package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes12.dex */
public final class ur0 implements zo31 {
    public final GoLinearLayout a;
    public final ListItemComponent b;
    public final ListItemComponent c;
    public final ListHeaderComponent d;
    public final GoLinearLayout e;
    public final ButtonComponent f;
    public final ButtonComponent g;
    public final ButtonComponent h;
    public final GoLinearLayout i;
    public final GoImageButton j;

    public ur0(GoLinearLayout goLinearLayout, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, ListHeaderComponent listHeaderComponent, GoLinearLayout goLinearLayout2, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ButtonComponent buttonComponent3, GoLinearLayout goLinearLayout3, GoImageButton goImageButton) {
        this.a = goLinearLayout;
        this.b = listItemComponent;
        this.c = listItemComponent2;
        this.d = listHeaderComponent;
        this.e = goLinearLayout2;
        this.f = buttonComponent;
        this.g = buttonComponent2;
        this.h = buttonComponent3;
        this.i = goLinearLayout3;
        this.j = goImageButton;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
