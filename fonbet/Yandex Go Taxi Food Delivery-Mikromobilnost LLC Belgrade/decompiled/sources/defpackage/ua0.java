package defpackage;

import com.yandex.go.payments.cards.pci_dss.ui.b;
import java.util.Arrays;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;

/* loaded from: classes13.dex */
public final class ua0 implements pa0 {
    public final /* synthetic */ b a;

    public ua0(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.pa0
    public final void a(String str, Integer num, Integer num2) {
        b bVar = this.a;
        bVar.e.setValue(str);
        if (num == null || num2 == null) {
            bVar.f.setValue("");
        } else {
            bVar.f.setValue(bVar.d.getString(dyh0.card_expiry_format, Arrays.copyOf(new Object[]{num, Integer.valueOf(num2.intValue() % 100)}, 2)));
        }
    }

    @Override // defpackage.pa0
    public final void b(boolean z) {
        b bVar = this.a;
        if (z) {
            cma1.J(bVar.g);
            cma1.J(bVar.h);
        } else {
            cma1.M(bVar.g);
            cma1.M(bVar.h);
        }
    }

    @Override // defpackage.pa0
    public final void c(boolean z) {
        int i;
        b bVar = this.a;
        if (z) {
            i = qje.t(bVar.c, bVar.d);
        } else {
            i = bVar.b;
        }
        bVar.k.setTextColor(i);
    }

    @Override // defpackage.pa0
    public final void d(boolean z) {
        b bVar = this.a;
        if (z) {
            bVar.i.setTextColor(qje.t(bVar.c, bVar.d));
            bVar.e.setInputHint("");
            return;
        }
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = bVar.i;
        AnimatedListItemInputComponent animatedListItemInputComponent = bVar.e;
        keyboardAwareRobotoEditText.setTextColor(bVar.b);
        String string = bVar.d.getString(kyh0.invalid_card_number_accessibility_text);
        animatedListItemInputComponent.setInputHint(string);
        animatedListItemInputComponent.announceForAccessibility(string);
    }
}
