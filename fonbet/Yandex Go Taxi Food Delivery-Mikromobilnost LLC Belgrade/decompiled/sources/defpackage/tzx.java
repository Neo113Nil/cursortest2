package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes14.dex */
public final class tzx implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final ListTitleComponent c;
    public final AnimatedListItemInputComponent d;

    public tzx(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, ListTitleComponent listTitleComponent, AnimatedListItemInputComponent animatedListItemInputComponent) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = listTitleComponent;
        this.d = animatedListItemInputComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
