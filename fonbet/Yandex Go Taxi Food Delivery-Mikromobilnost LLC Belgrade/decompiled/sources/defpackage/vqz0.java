package defpackage;

import android.view.View;
import android.widget.ImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes6.dex */
public final class vqz0 implements zo31 {
    public final NestedScrollViewAdvanced a;
    public final ButtonComponent b;
    public final ListTextComponent c;
    public final ListTitleComponent d;
    public final ImageView e;

    public vqz0(NestedScrollViewAdvanced nestedScrollViewAdvanced, ButtonComponent buttonComponent, ListTextComponent listTextComponent, ListTitleComponent listTitleComponent, ImageView imageView) {
        this.a = nestedScrollViewAdvanced;
        this.b = buttonComponent;
        this.c = listTextComponent;
        this.d = listTitleComponent;
        this.e = imageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
