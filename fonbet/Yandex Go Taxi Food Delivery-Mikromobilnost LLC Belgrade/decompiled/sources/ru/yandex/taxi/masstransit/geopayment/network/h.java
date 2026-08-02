package ru.yandex.taxi.masstransit.geopayment.network;

import defpackage.auu0;
import defpackage.cm2;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
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
import ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse;
import ru.yandex.taxi.masstransit.geopayment.network.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class h implements uxs {
    public static final h a;
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse.BLEItem", hVar, 6);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("card_item", true);
        pluginGeneratedSerialDescriptor.j("transport_type", true);
        pluginGeneratedSerialDescriptor.j("vehicle_key", true);
        pluginGeneratedSerialDescriptor.j("ble", true);
        pluginGeneratedSerialDescriptor.j("meta_checkout_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MtVehiclesResponse.BLEItem.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, a.a, i3yVarArr[2].getValue(), auu0Var, qke.n(e.a), qke.n(cm2.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtVehiclesResponse.BLEItem.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        d dVar = null;
        MtVehiclesResponse.BLEItem.TransportType transportType = null;
        String str2 = null;
        g.a aVar = null;
        Object obj = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    dVar = (d) b.A(serialDescriptor, 1, a.a, dVar);
                    i |= 2;
                    break;
                case 2:
                    transportType = (MtVehiclesResponse.BLEItem.TransportType) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), transportType);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    aVar = (g.a) b.s(serialDescriptor, 4, e.a, aVar);
                    i |= 16;
                    break;
                case 5:
                    obj = b.s(serialDescriptor, 5, cm2.a, obj);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new MtVehiclesResponse.BLEItem(i, str, dVar, transportType, str2, aVar, obj);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MtVehiclesResponse.BLEItem bLEItem = (MtVehiclesResponse.BLEItem) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtVehiclesResponse.BLEItem.g;
        if (b.F() || !jl40.l(bLEItem.a, "")) {
            b.o(serialDescriptor, 0, bLEItem.a);
        }
        if (b.F() || !jl40.l(bLEItem.b, new d(0))) {
            b.e(serialDescriptor, 1, a.a, bLEItem.b);
        }
        if (b.F() || bLEItem.c != MtVehiclesResponse.BLEItem.TransportType.Bus) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), bLEItem.c);
        }
        if (b.F() || !jl40.l(bLEItem.d, "")) {
            b.o(serialDescriptor, 3, bLEItem.d);
        }
        if (b.F() || bLEItem.e != null) {
            b.g(serialDescriptor, 4, e.a, bLEItem.e);
        }
        if (b.F() || bLEItem.f != null) {
            b.g(serialDescriptor, 5, cm2.a, bLEItem.f);
        }
        b.c(serialDescriptor);
    }
}
