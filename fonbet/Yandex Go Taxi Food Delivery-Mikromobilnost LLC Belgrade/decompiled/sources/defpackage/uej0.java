package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class uej0 implements uxs {
    public static final uej0 a;
    private static final SerialDescriptor descriptor;

    static {
        uej0 uej0Var = new uej0();
        a = uej0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.RequirementCommunicationDto", uej0Var, 3);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("show_count", true);
        pluginGeneratedSerialDescriptor.j("fallback", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(h6w.a), yej0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        afj0 afj0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                afj0Var = (afj0) b.A(serialDescriptor, 2, yej0.a, afj0Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new wej0(i, str, num, afj0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.afj0.d) == false) goto L19;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        wej0 wej0Var = (wej0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(wej0Var.a, "")) {
            b.o(serialDescriptor, 0, wej0Var.a);
        }
        if (b.F() || wej0Var.b != null) {
            b.g(serialDescriptor, 1, h6w.a, wej0Var.b);
        }
        if (!b.F()) {
            afj0 afj0Var = wej0Var.c;
            afj0.Companion.getClass();
        }
        b.e(serialDescriptor, 2, yej0.a, wej0Var.c);
        b.c(serialDescriptor);
    }
}
