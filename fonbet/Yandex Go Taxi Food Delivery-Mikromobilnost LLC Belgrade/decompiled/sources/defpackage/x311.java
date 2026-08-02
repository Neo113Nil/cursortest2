package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.orders.TransportPassDto$CppkSuburbanActivationDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.TransportPassDto$DefaultPassDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.TransportPassDto$QrCodePassDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.w;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class x311 extends xqt {
    public static final x311 e = new x311();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, w.INSTANCE.serializer(), qoi0.a(w.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("cppk_suburban_activation", TransportPassDto$CppkSuburbanActivationDto.Companion.serializer(), qoi0.a(TransportPassDto$CppkSuburbanActivationDto.class)), new f9("qr_code_pass", TransportPassDto$QrCodePassDto.Companion.serializer(), qoi0.a(TransportPassDto$QrCodePassDto.class)), new f9("default_pass", TransportPassDto$DefaultPassDto.Companion.serializer(), qoi0.a(TransportPassDto$DefaultPassDto.class)));
    }
}
