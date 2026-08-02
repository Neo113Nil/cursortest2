package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public final class yxb0 extends xqt {
    public static final yxb0 e = new yxb0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, txb0.INSTANCE.serializer(), qoi0.a(txb0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, sxb0.Companion.serializer(), qoi0.a(sxb0.class)), new f9("vertical", wxb0.Companion.serializer(), qoi0.a(wxb0.class)));
    }
}
