package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes14.dex */
public final class u780 extends vfx {
    public static final u780 a = new u780();
    public static final asq0 b = d6z.g("com.yandex.go.taxi.order.models.api.response.OrderStatusInfoWrapper", new SerialDescriptor[0]);

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        b t = ncxVar.t();
        return new v780((OrderStatusInfo) ncxVar.d().a(OrderStatusInfo.Companion.serializer(), t), t);
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        vcxVar.p(((v780) obj).b);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
