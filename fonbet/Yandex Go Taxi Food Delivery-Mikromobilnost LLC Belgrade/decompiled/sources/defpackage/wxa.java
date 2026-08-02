package defpackage;

import android.view.View;
import com.yandex.go.chargers.tariff_item_info.api.ChargersTariffsView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class wxa implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final ChargersTariffsView c;

    public wxa(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, ChargersTariffsView chargersTariffsView) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = chargersTariffsView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
