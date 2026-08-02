package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.e6m;
import defpackage.h6w;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class i implements uxs {
    public static final i a;
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.CounterItem.Data", iVar, 3);
        pluginGeneratedSerialDescriptor.j("max_amount", true);
        pluginGeneratedSerialDescriptor.j("current_amount", true);
        pluginGeneratedSerialDescriptor.j("debounce", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, qke.n(h6wVar), qke.n(e6m.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        Integer num = null;
        Double d = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                d = (Double) b.s(serialDescriptor, 2, e6m.a, d);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new CheckoutResponse.b.a(i, i2, num, d);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutResponse.b.a aVar = (CheckoutResponse.b.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || aVar.a != 1) {
            b.A(0, aVar.a, serialDescriptor);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, h6w.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, e6m.a, aVar.c);
        }
        b.c(serialDescriptor);
    }
}
