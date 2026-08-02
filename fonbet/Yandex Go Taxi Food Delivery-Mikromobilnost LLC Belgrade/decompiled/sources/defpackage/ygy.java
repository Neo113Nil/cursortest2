package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class ygy implements uxs {
    public static final ygy a;
    private static final SerialDescriptor descriptor;

    static {
        ygy ygyVar = new ygy();
        a = ygyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.maas.api.LineDto", ygyVar, 5);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("number", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, jk50.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        lk50 lk50Var = null;
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
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str4 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                lk50Var = (lk50) b.A(serialDescriptor, 4, jk50.a, lk50Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ahy(i, str, str2, str3, str4, lk50Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.lk50.b) == false) goto L31;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        ahy ahyVar = (ahy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(ahyVar.a, "")) {
            b.o(serialDescriptor, 0, ahyVar.a);
        }
        if (b.F() || !jl40.l(ahyVar.b, "")) {
            b.o(serialDescriptor, 1, ahyVar.b);
        }
        if (b.F() || !jl40.l(ahyVar.c, "")) {
            b.o(serialDescriptor, 2, ahyVar.c);
        }
        if (b.F() || !jl40.l(ahyVar.d, "")) {
            b.o(serialDescriptor, 3, ahyVar.d);
        }
        if (!b.F()) {
            lk50 lk50Var = ahyVar.e;
            lk50.Companion.getClass();
        }
        b.e(serialDescriptor, 4, jk50.a, ahyVar.e);
        b.c(serialDescriptor);
    }
}
