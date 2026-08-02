package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;

/* loaded from: classes13.dex */
public final class w7n0 implements zo31 {
    public final GoLinearLayout a;
    public final ImageView b;
    public final ListTextComponent c;
    public final ButtonComponent d;

    public w7n0(GoLinearLayout goLinearLayout, ImageView imageView, ListTextComponent listTextComponent, ButtonComponent buttonComponent) {
        this.a = goLinearLayout;
        this.b = imageView;
        this.c = listTextComponent;
        this.d = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
