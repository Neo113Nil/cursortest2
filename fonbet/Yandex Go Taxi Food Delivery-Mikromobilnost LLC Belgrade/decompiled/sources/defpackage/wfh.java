package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$IconBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$NavigatorRouteBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$TextBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.e;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class wfh extends xqt {
    public static final wfh e = new wfh();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e.INSTANCE.serializer(), qoi0.a(e.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("icon_body", DefaultOfferBodyDtoV2$IconBodyDtoV2.Companion.serializer(), qoi0.a(DefaultOfferBodyDtoV2$IconBodyDtoV2.class)), new f9("transport_route_body", DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2.Companion.serializer(), qoi0.a(DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2.class)), new f9("text_body", DefaultOfferBodyDtoV2$TextBodyDtoV2.Companion.serializer(), qoi0.a(DefaultOfferBodyDtoV2$TextBodyDtoV2.class)), new f9("navigator_route_body", DefaultOfferBodyDtoV2$NavigatorRouteBodyDtoV2.Companion.serializer(), qoi0.a(DefaultOfferBodyDtoV2$NavigatorRouteBodyDtoV2.class)));
    }
}
