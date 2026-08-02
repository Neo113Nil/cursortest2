package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.wr0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/i;", "Lru/yandex/taxi/common_models/net/map_object/l;", "Companion", "vr0", "wr0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends l {
    public static final wr0 Companion = new wr0();
    public final FormattedText a;
    public final FormattedText b;
    public final AddressConfirmationContent c;
    public final AddressConfirmationButton d;
    public final AddressConfirmationButton e;

    public i(int i, FormattedText formattedText, FormattedText formattedText2, AddressConfirmationContent addressConfirmationContent, AddressConfirmationButton addressConfirmationButton, AddressConfirmationButton addressConfirmationButton2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = new AddressConfirmationContent(0);
        } else {
            this.c = addressConfirmationContent;
        }
        if ((i & 8) == 0) {
            this.d = new AddressConfirmationButton(0);
        } else {
            this.d = addressConfirmationButton;
        }
        if ((i & 16) == 0) {
            this.e = new AddressConfirmationButton(0);
        } else {
            this.e = addressConfirmationButton2;
        }
    }

    @Override // ru.yandex.taxi.common_models.net.map_object.l
    public final AdjustmentScreenType a() {
        return AdjustmentScreenType.ADDRESS_CONFIRMATION;
    }

    public i() {
        FormattedText formattedText = FormattedText.c;
        AddressConfirmationContent addressConfirmationContent = new AddressConfirmationContent(0);
        AddressConfirmationButton addressConfirmationButton = new AddressConfirmationButton(0);
        AddressConfirmationButton addressConfirmationButton2 = new AddressConfirmationButton(0);
        this.a = formattedText;
        this.b = formattedText;
        this.c = addressConfirmationContent;
        this.d = addressConfirmationButton;
        this.e = addressConfirmationButton2;
    }
}
