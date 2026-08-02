package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class z8o implements uxs {
    public static final z8o a;
    private static final SerialDescriptor descriptor;

    static {
        z8o z8oVar = new z8o();
        a = z8oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ErrorResponse", z8oVar, 4);
        pluginGeneratedSerialDescriptor.j("error_details", true);
        pluginGeneratedSerialDescriptor.j("nearest_parking", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(c9o.a), qke.n(j9o.a), qke.n(wu90.e), qke.n(oee.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        e9o e9oVar = null;
        l9o l9oVar = null;
        fv90 fv90Var = null;
        tee teeVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                e9oVar = (e9o) b.s(serialDescriptor, 0, c9o.a, e9oVar);
                i |= 1;
            } else if (v == 1) {
                l9oVar = (l9o) b.s(serialDescriptor, 1, j9o.a, l9oVar);
                i |= 2;
            } else if (v == 2) {
                fv90Var = (fv90) b.s(serialDescriptor, 2, wu90.e, fv90Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                teeVar = (tee) b.s(serialDescriptor, 3, oee.a, teeVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new b9o(i, e9oVar, l9oVar, fv90Var, teeVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b9o b9oVar = (b9o) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || b9oVar.a != null) {
            b.g(serialDescriptor, 0, c9o.a, b9oVar.a);
        }
        if (b.F() || b9oVar.b != null) {
            b.g(serialDescriptor, 1, j9o.a, b9oVar.b);
        }
        if (b.F() || b9oVar.c != null) {
            b.g(serialDescriptor, 2, wu90.e, b9oVar.c);
        }
        if (b.F() || b9oVar.d != null) {
            b.g(serialDescriptor, 3, oee.a, b9oVar.d);
        }
        b.c(serialDescriptor);
    }
}
