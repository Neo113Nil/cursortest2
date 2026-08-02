package defpackage;

import ru.yandex.taxi.altpins.confirmation_screen.modal.AlternativeDestinationModalView;
import ru.yandex.taxi.altpins.models.OptionType;
import ru.yandex.taxi.altpins.models.b;

/* loaded from: classes5.dex */
public final class ww1 implements dx1 {
    public final /* synthetic */ AlternativeDestinationModalView a;

    public ww1(AlternativeDestinationModalView alternativeDestinationModalView) {
        this.a = alternativeDestinationModalView;
    }

    @Override // defpackage.dx1
    public final void dismiss() {
        sls slsVar;
        slsVar = this.a.onDismiss;
        slsVar.invoke();
    }

    @Override // defpackage.dx1
    public final void l4(OptionType optionType) {
        tls tlsVar;
        tlsVar = this.a.onConfirm;
        tlsVar.invoke(optionType);
    }

    @Override // defpackage.dx1
    public final void render(b.a aVar) {
        this.a.render(aVar);
    }
}
