package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferBodyDto$IconBodyDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferBodyDto$TextBodyDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferBodyDto$TransportRouteBodyDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.d;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class tfh extends xqt {
    public static final tfh e = new tfh();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, d.INSTANCE.serializer(), qoi0.a(d.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("icon_body", DefaultOfferBodyDto$IconBodyDto.Companion.serializer(), qoi0.a(DefaultOfferBodyDto$IconBodyDto.class)), new f9("transport_route_body", DefaultOfferBodyDto$TransportRouteBodyDto.Companion.serializer(), qoi0.a(DefaultOfferBodyDto$TransportRouteBodyDto.class)), new f9("text_body", DefaultOfferBodyDto$TextBodyDto.Companion.serializer(), qoi0.a(DefaultOfferBodyDto$TextBodyDto.class)));
    }
}
