package ru.yandex.taxi.panorama;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.panorama.d;

/* loaded from: classes9.dex */
public final /* synthetic */ class i implements uxs {
    public static final i a;
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.panorama.TaxiPanoramaExperiment.SelectPickupPointFlow", iVar, 7);
        pluginGeneratedSerialDescriptor.j("accept_pickup_point_key", true);
        pluginGeneratedSerialDescriptor.j("accept_pickup_point_desc_pin_a_key", true);
        pluginGeneratedSerialDescriptor.j("accept_pickup_point_desc_pin_b_key", true);
        pluginGeneratedSerialDescriptor.j("accept_pickup_point_desc_pin_a_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("accept_pickup_point_desc_pin_b_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("showing_pickup_point_distance_m", true);
        pluginGeneratedSerialDescriptor.j("is_request_fs_when_jump", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, h6w.a, z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i2 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new d.C0109d(i, str, str2, str3, str4, str5, i2, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d.C0109d c0109d = (d.C0109d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(c0109d.a, "")) {
            b.o(serialDescriptor, 0, c0109d.a);
        }
        if (b.F() || !jl40.l(c0109d.b, "")) {
            b.o(serialDescriptor, 1, c0109d.b);
        }
        if (b.F() || !jl40.l(c0109d.c, "")) {
            b.o(serialDescriptor, 2, c0109d.c);
        }
        if (b.F() || !jl40.l(c0109d.d, "")) {
            b.o(serialDescriptor, 3, c0109d.d);
        }
        if (b.F() || !jl40.l(c0109d.e, "")) {
            b.o(serialDescriptor, 4, c0109d.e);
        }
        if (b.F() || c0109d.f != 0) {
            b.A(5, c0109d.f, serialDescriptor);
        }
        if (b.F() || c0109d.g) {
            b.n(serialDescriptor, 6, c0109d.g);
        }
        b.c(serialDescriptor);
    }
}
