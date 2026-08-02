package defpackage;

import defpackage.tzr0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class qzr0 implements uxs {
    public static final qzr0 a;
    private static final SerialDescriptor descriptor;

    static {
        qzr0 qzr0Var = new qzr0();
        a = qzr0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.ShortcutItem", qzr0Var, 5);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("footer", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("modal", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, xzr0.a, qke.n(vzr0.a), rzr0.a, qke.n(pvw0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        tzr0.c cVar = null;
        tzr0.b bVar = null;
        tzr0.a aVar = null;
        tvw0 tvw0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                cVar = (tzr0.c) b.A(serialDescriptor, 1, xzr0.a, cVar);
                i |= 2;
            } else if (v == 2) {
                bVar = (tzr0.b) b.s(serialDescriptor, 2, vzr0.a, bVar);
                i |= 4;
            } else if (v == 3) {
                aVar = (tzr0.a) b.A(serialDescriptor, 3, rzr0.a, aVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                tvw0Var = (tvw0) b.s(serialDescriptor, 4, pvw0.a, tvw0Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new tzr0(i, str, cVar, bVar, aVar, tvw0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tzr0 tzr0Var = (tzr0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(tzr0Var.a, "")) {
            b.o(serialDescriptor, 0, tzr0Var.a);
        }
        if (b.F() || !jl40.l(tzr0Var.b, new tzr0.c(0))) {
            b.e(serialDescriptor, 1, xzr0.a, tzr0Var.b);
        }
        if (b.F() || tzr0Var.c != null) {
            b.g(serialDescriptor, 2, vzr0.a, tzr0Var.c);
        }
        if (b.F() || !jl40.l(tzr0Var.d, new tzr0.a(0))) {
            b.e(serialDescriptor, 3, rzr0.a, tzr0Var.d);
        }
        if (b.F() || tzr0Var.e != null) {
            b.g(serialDescriptor, 4, pvw0.a, tzr0Var.e);
        }
        b.c(serialDescriptor);
    }
}
