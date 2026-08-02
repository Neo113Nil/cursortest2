package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class o implements uxs {
    public static final o a;
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.StopsSelector", oVar, 3);
        pluginGeneratedSerialDescriptor.j("starting_stop_is_selectable", true);
        pluginGeneratedSerialDescriptor.j("items", true);
        pluginGeneratedSerialDescriptor.j("stops", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, s.a, CheckoutResponse.StopsSelector.d[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CheckoutResponse.StopsSelector.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        CheckoutResponse.StopsSelector.b bVar = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                bVar = (CheckoutResponse.StopsSelector.b) b.A(serialDescriptor, 1, s.a, bVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new CheckoutResponse.StopsSelector(i, z2, bVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutResponse.StopsSelector stopsSelector = (CheckoutResponse.StopsSelector) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CheckoutResponse.StopsSelector.d;
        if (b.F() || stopsSelector.a) {
            b.n(serialDescriptor, 0, stopsSelector.a);
        }
        if (b.F() || !jl40.l(stopsSelector.b, new CheckoutResponse.StopsSelector.b(0))) {
            b.e(serialDescriptor, 1, s.a, stopsSelector.b);
        }
        if (b.F() || !jl40.l(stopsSelector.c, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), stopsSelector.c);
        }
        b.c(serialDescriptor);
    }
}
