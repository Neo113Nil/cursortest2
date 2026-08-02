package ru.yandex.taxi.location.dto;

import defpackage.e6m;
import defpackage.i3y;
import defpackage.myi;
import defpackage.nor;
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
import ru.yandex.taxi.location.dto.LbsResponse;

/* loaded from: classes9.dex */
public final /* synthetic */ class d implements uxs {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.location.dto.LbsResponse.LbsResponsePosition", dVar, 6);
        pluginGeneratedSerialDescriptor.j("altitude", true);
        pluginGeneratedSerialDescriptor.j("altitude_precision", true);
        pluginGeneratedSerialDescriptor.j("latitude", true);
        pluginGeneratedSerialDescriptor.j("longitude", true);
        pluginGeneratedSerialDescriptor.j("precision", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n((KSerializer) LbsResponse.b.g[5].getValue());
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, nor.a, e6mVar, e6mVar, e6mVar, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = LbsResponse.b.g;
        b.getClass();
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        float f = 0.0f;
        LbsResponse.Type type = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    d = b.E(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    f = b.y(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d2 = b.E(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    d3 = b.E(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    d4 = b.E(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    type = (LbsResponse.Type) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), type);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new LbsResponse.b(i, d, f, d2, d3, d4, type);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        LbsResponse.b bVar = (LbsResponse.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = LbsResponse.b.g;
        if (b.F() || Double.compare(bVar.a, 0.0d) != 0) {
            b.E(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || Float.compare(bVar.b, 0.0f) != 0) {
            b.z(serialDescriptor, 1, bVar.b);
        }
        if (b.F() || Double.compare(bVar.c, 0.0d) != 0) {
            b.E(serialDescriptor, 2, bVar.c);
        }
        if (b.F() || Double.compare(bVar.d, 0.0d) != 0) {
            b.E(serialDescriptor, 3, bVar.d);
        }
        if (b.F() || Double.compare(bVar.e, 0.0d) != 0) {
            b.E(serialDescriptor, 4, bVar.e);
        }
        if (b.F() || bVar.f != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), bVar.f);
        }
        b.c(serialDescriptor);
    }
}
