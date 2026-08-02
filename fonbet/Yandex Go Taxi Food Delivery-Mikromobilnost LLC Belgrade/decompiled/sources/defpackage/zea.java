package defpackage;

import com.yandex.go.chargers.passes.data.ChargersPassButtonActionDto$Buy;
import com.yandex.go.chargers.passes.data.ChargersPassButtonActionDto$Cancel;
import com.yandex.go.chargers.passes.data.ChargersPassButtonActionDto$Close;
import com.yandex.go.chargers.passes.data.ChargersPassButtonActionDto$OpenCancelConfirmation;
import com.yandex.go.chargers.passes.data.ChargersPassButtonActionDto$OpenOffer;
import com.yandex.go.chargers.passes.data.ChargersPassButtonActionDto$OpenPaymentSettings;
import com.yandex.go.chargers.passes.data.ChargersPassButtonActionDto$Resume;
import com.yandex.go.chargers.passes.data.h;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class zea extends xqt {
    public static final zea e = new zea();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, h.INSTANCE.serializer(), qoi0.a(h.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_offer", ChargersPassButtonActionDto$OpenOffer.Companion.serializer(), qoi0.a(ChargersPassButtonActionDto$OpenOffer.class)), new f9("buy", ChargersPassButtonActionDto$Buy.Companion.serializer(), qoi0.a(ChargersPassButtonActionDto$Buy.class)), new f9("cancel", ChargersPassButtonActionDto$Cancel.Companion.serializer(), qoi0.a(ChargersPassButtonActionDto$Cancel.class)), new f9("resume", ChargersPassButtonActionDto$Resume.Companion.serializer(), qoi0.a(ChargersPassButtonActionDto$Resume.class)), new f9("close", ChargersPassButtonActionDto$Close.Companion.serializer(), qoi0.a(ChargersPassButtonActionDto$Close.class)), new f9("open_payment_settings", ChargersPassButtonActionDto$OpenPaymentSettings.Companion.serializer(), qoi0.a(ChargersPassButtonActionDto$OpenPaymentSettings.class)), new f9("open_cancel_confirmation", ChargersPassButtonActionDto$OpenCancelConfirmation.Companion.serializer(), qoi0.a(ChargersPassButtonActionDto$OpenCancelConfirmation.class)));
    }
}
