package ru.yandex.taxi.logistics.experiments;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class c implements uxs {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment.CourierFlowSegment", cVar, 5);
        pluginGeneratedSerialDescriptor.j("courier_button_title_key", true);
        pluginGeneratedSerialDescriptor.j("pickup_point_button_title_key", true);
        pluginGeneratedSerialDescriptor.j("default_address_flow", true);
        pluginGeneratedSerialDescriptor.j("pickup_point_uri_substring", true);
        pluginGeneratedSerialDescriptor.j("courier_persuggest_current_mode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DeliveryPvzExperiment.a.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue(), auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryPvzExperiment.a.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        DeliveryPvzExperiment.AddressFlow addressFlow = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                addressFlow = (DeliveryPvzExperiment.AddressFlow) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), addressFlow);
                i |= 4;
            } else if (v == 3) {
                str3 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str4 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new DeliveryPvzExperiment.a(i, str, str2, addressFlow, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        DeliveryPvzExperiment.a aVar = (DeliveryPvzExperiment.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DeliveryPvzExperiment.a.f;
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, "")) {
            b.o(serialDescriptor, 1, aVar.b);
        }
        if (b.F() || aVar.c != DeliveryPvzExperiment.AddressFlow.PICKUP_POINT) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, "")) {
            b.o(serialDescriptor, 3, aVar.d);
        }
        if (b.F() || !jl40.l(aVar.e, "")) {
            b.o(serialDescriptor, 4, aVar.e);
        }
        b.c(serialDescriptor);
    }
}
