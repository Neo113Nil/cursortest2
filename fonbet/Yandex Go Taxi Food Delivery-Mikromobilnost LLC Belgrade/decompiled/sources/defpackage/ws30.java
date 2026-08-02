package defpackage;

import defpackage.qs30;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ws30 implements uxs {
    public static final ws30 a;
    private static final SerialDescriptor descriptor;

    static {
        ws30 ws30Var = new ws30();
        a = ws30Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.experiment.purchase_availability.MtPurchaseAvailabilityConfigDto.PaymentButtonsDto", ws30Var, 2);
        pluginGeneratedSerialDescriptor.j("pay_button", true);
        pluginGeneratedSerialDescriptor.j("ticket_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(us30.a), qke.n(ct30.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        qs30.c cVar = null;
        qs30.g gVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                cVar = (qs30.c) b.s(serialDescriptor, 0, us30.a, cVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                gVar = (qs30.g) b.s(serialDescriptor, 1, ct30.a, gVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new qs30.d(i, cVar, gVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qs30.d dVar = (qs30.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || dVar.a != null) {
            b.g(serialDescriptor, 0, us30.a, dVar.a);
        }
        if (b.F() || dVar.b != null) {
            b.g(serialDescriptor, 1, ct30.a, dVar.b);
        }
        b.c(serialDescriptor);
    }
}
