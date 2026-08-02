package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import java.io.IOException;
import ru.yandex.taxi.altpins.confirmation_screen.fragment.ConfirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.altpins.confirmation_screen.fragment.ConfirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$3;
import ru.yandex.taxi.altpins.models.OptionType;

/* loaded from: classes5.dex */
public final class u2e extends uhs0 {
    public final /* synthetic */ ConfirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$2 a;
    public final /* synthetic */ v2e b;
    public final /* synthetic */ OptionType c;
    public final /* synthetic */ ConfirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$3 w;

    public u2e(ConfirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$2 confirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$2, v2e v2eVar, OptionType optionType, ConfirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$3 confirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$3) {
        this.a = confirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$2;
        this.b = v2eVar;
        this.c = optionType;
        this.w = confirmAlternativeDestinationPresenter$queryRoute$$inlined$suspendCallbackApi$3;
    }

    @Override // defpackage.nlm
    public final void a() {
        jst.e.n("Receiving driving route cancelled");
    }

    @Override // defpackage.uhs0
    public final void b(DrivingRoute drivingRoute) {
        this.a.invoke(drivingRoute);
        this.b.E.put(this.c, drivingRoute);
    }

    @Override // defpackage.nlm
    public final void d(IOException iOException) {
        this.w.invoke(iOException);
    }
}
