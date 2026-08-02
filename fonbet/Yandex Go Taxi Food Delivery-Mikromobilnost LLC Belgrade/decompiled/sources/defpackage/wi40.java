package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes6.dex */
public final class wi40 implements zo31 {
    public final GoLinearLayout a;
    public final GoView b;
    public final ButtonComponent c;
    public final ButtonComponent d;

    public wi40(GoLinearLayout goLinearLayout, GoView goView, ButtonComponent buttonComponent, ButtonComponent buttonComponent2) {
        this.a = goLinearLayout;
        this.b = goView;
        this.c = buttonComponent;
        this.d = buttonComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
