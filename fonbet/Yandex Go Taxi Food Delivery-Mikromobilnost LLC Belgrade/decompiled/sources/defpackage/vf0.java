package defpackage;

import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;

/* loaded from: classes13.dex */
public final class vf0 implements pf0 {
    public final /* synthetic */ yf0 a;

    public vf0(yf0 yf0Var) {
        this.a = yf0Var;
    }

    @Override // defpackage.pf0
    public final void X0(zf0 zf0Var) {
        rf0 rf0Var = (rf0) zf0Var.c;
        yf0 yf0Var = this.a;
        yf0Var.w.setToolbarTitle(rf0Var);
        ListItemInputComponent listItemInputComponent = yf0Var.x;
        listItemInputComponent.setTitle(rf0Var.c);
        ListItemInputComponent listItemInputComponent2 = yf0Var.y;
        listItemInputComponent2.setTitle(rf0Var.d);
        ListItemComponent listItemComponent = yf0Var.z;
        listItemComponent.setTitle(rf0Var.e);
        ButtonComponent buttonComponent = yf0Var.A;
        buttonComponent.setText(rf0Var.f);
        listItemInputComponent.setTextWithoutNotifying((CharSequence) zf0Var.d);
        listItemInputComponent2.setTextWithoutNotifying((CharSequence) zf0Var.e);
        listItemComponent.setDebounceClickListener((Runnable) zf0Var.f);
        buttonComponent.setDebounceClickListener((Runnable) zf0Var.g);
        boolean z = zf0Var.a;
        buttonComponent.setProgressing(z);
        if (z) {
            yf0Var.Q2();
        }
        buttonComponent.setEnabled(zf0Var.b);
    }
}
