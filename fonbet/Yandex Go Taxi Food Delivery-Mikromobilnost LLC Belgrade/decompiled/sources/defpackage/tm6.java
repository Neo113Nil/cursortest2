package defpackage;

import com.yandex.go.navigator.ui.a;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class tm6 extends kr31 implements xv5 {
    public final ButtonComponent d;
    public final int e;
    public final int f;
    public final /* synthetic */ a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm6(a aVar, ButtonComponent buttonComponent, int i, int i2) {
        super(buttonComponent);
        this.g = aVar;
        this.d = buttonComponent;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.xv5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(um6 um6Var) {
        String str = um6Var.a;
        boolean z = um6Var.d;
        ButtonComponent buttonComponent = this.d;
        buttonComponent.setTag(str);
        buttonComponent.setVisibility(um6Var.e ? 0 : 8);
        buttonComponent.setText(um6Var.c);
        buttonComponent.setButtonSize(1);
        buttonComponent.setRoundedCornersRadius(tje.u(25, buttonComponent.getContext()));
        buttonComponent.setSelected(z);
        if (z) {
            buttonComponent.setButtonBackground(qje.t(this.e, buttonComponent.getContext()));
            buttonComponent.setButtonTitleColor(qje.t(this.f, buttonComponent.getContext()));
        } else {
            buttonComponent.setButtonBackground(qje.t(xng0.controlMinor, buttonComponent.getContext()));
            buttonComponent.setButtonTitleColor(qje.t(xng0.textMain, buttonComponent.getContext()));
        }
        int[] iArr = up11.a;
        buttonComponent.setTypeface(eja1.w(3, 0));
        buttonComponent.setDebounceClickListener(new mh3(19, this.g, um6Var));
    }
}
