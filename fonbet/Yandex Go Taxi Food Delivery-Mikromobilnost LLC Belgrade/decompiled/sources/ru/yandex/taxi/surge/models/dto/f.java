package ru.yandex.taxi.surge.models.dto;

import com.adjust.sdk.Constants;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import io.appmetrica.analytics.impl.C0553n3;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.i;

/* loaded from: classes6.dex */
public final /* synthetic */ class f implements uxs {
    public static final f a;
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.GradientComponentContent", fVar, 6);
        pluginGeneratedSerialDescriptor.j("lead_body", true);
        pluginGeneratedSerialDescriptor.j("trail_body", true);
        pluginGeneratedSerialDescriptor.j(C0553n3.g, true);
        pluginGeneratedSerialDescriptor.j("accessibility", true);
        pluginGeneratedSerialDescriptor.j("analytics", true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(j.a);
        n nVar = n.a;
        return new KSerializer[]{nVar, nVar, l.a, g.a, n, auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        i.d dVar = null;
        i.d dVar2 = null;
        i.c cVar = null;
        i.a aVar = null;
        i.b bVar = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    dVar = (i.d) b.A(serialDescriptor, 0, n.a, dVar);
                    i |= 1;
                    break;
                case 1:
                    dVar2 = (i.d) b.A(serialDescriptor, 1, n.a, dVar2);
                    i |= 2;
                    break;
                case 2:
                    cVar = (i.c) b.A(serialDescriptor, 2, l.a, cVar);
                    i |= 4;
                    break;
                case 3:
                    aVar = (i.a) b.A(serialDescriptor, 3, g.a, aVar);
                    i |= 8;
                    break;
                case 4:
                    bVar = (i.b) b.s(serialDescriptor, 4, j.a, bVar);
                    i |= 16;
                    break;
                case 5:
                    str = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new i(i, dVar, dVar2, cVar, aVar, bVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(iVar.a, new i.d(0))) {
            b.e(serialDescriptor, 0, n.a, iVar.a);
        }
        if (b.F() || !jl40.l(iVar.b, new i.d(0))) {
            b.e(serialDescriptor, 1, n.a, iVar.b);
        }
        if (b.F() || !jl40.l(iVar.c, new i.c(0))) {
            b.e(serialDescriptor, 2, l.a, iVar.c);
        }
        if (b.F() || !jl40.l(iVar.d, new i.a(0))) {
            b.e(serialDescriptor, 3, g.a, iVar.d);
        }
        if (b.F() || iVar.e != null) {
            b.g(serialDescriptor, 4, j.a, iVar.e);
        }
        if (b.F() || !jl40.l(iVar.f, "")) {
            b.o(serialDescriptor, 5, iVar.f);
        }
        b.c(serialDescriptor);
    }
}
