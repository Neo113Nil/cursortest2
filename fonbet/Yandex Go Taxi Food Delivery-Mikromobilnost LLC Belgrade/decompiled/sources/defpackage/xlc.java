package defpackage;

import com.yandex.go.masstransit.sdk.client_api.data.dto.PaymentMethodDto;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes12.dex */
public final class xlc extends vfx {
    public static final xlc a = new xlc();
    public static final asq0 b = d6z.g("CommandValue", new SerialDescriptor[0]);

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        b t = ncxVar.t();
        if (t instanceof c) {
            c cVar = (c) t;
            b bVar = (b) cVar.get("binding_id");
            String g = bVar != null ? qcx.g(qcx.n(bVar)) : null;
            b bVar2 = (b) cVar.get("type");
            String g2 = bVar2 != null ? qcx.g(qcx.n(bVar2)) : null;
            if (g != null && g2 != null) {
                return new ulc(new PaymentMethodDto(g, g2));
            }
        }
        d n = qcx.n(t);
        Object f = qcx.f(n);
        if (f == null) {
            Integer k = qcx.k(n);
            if (k != null) {
                f = Integer.valueOf(k.intValue());
            } else {
                if (!n.b()) {
                    yci0.v(t, "Unsupported primitive command value: ");
                    return null;
                }
                f = n.a();
            }
        }
        return new vlc(f);
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        b J;
        wlc wlcVar = (wlc) obj;
        if (wlcVar instanceof vlc) {
            Object obj2 = ((vlc) wlcVar).a;
            if (obj2 instanceof Boolean) {
                J = qcx.a((Boolean) obj2);
            } else if (obj2 instanceof Integer) {
                J = qcx.b((Number) obj2);
            } else {
                if (!(obj2 instanceof String)) {
                    yci0.m(g8e.o("Unsupported command value type: ", qoi0.a(obj2.getClass()).d()));
                    return;
                }
                J = qcx.c((String) obj2);
            }
        } else {
            if (!(wlcVar instanceof ulc)) {
                w511.b();
                return;
            }
            sbx d = vcxVar.d();
            KSerializer serializer = PaymentMethodDto.Companion.serializer();
            PaymentMethodDto paymentMethodDto = ((ulc) wlcVar).a;
            d.getClass();
            J = gwk0.J(d, paymentMethodDto, serializer);
        }
        vcxVar.p(J);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
