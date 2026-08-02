package defpackage;

import defpackage.xuc;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class tuc implements uxs {
    public static final tuc a;
    private static final SerialDescriptor descriptor;

    static {
        tuc tucVar = new tuc();
        a = tucVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.CompanionLottieAnimation", tucVar, 3);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("link", true);
        pluginGeneratedSerialDescriptor.j("animation_settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), vuc.a};
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
        xuc.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                aVar = (xuc.a) b.A(serialDescriptor, 2, vuc.a, aVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new xuc(i, str, str2, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (defpackage.jl40.l(r0, xuc.a.c) == false) goto L19;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        xuc xucVar = (xuc) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(xucVar.a, "")) {
            b.o(serialDescriptor, 0, xucVar.a);
        }
        if (b.F() || xucVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, xucVar.b);
        }
        if (!b.F()) {
            xuc.a aVar = xucVar.c;
            xuc.a.Companion.getClass();
        }
        b.e(serialDescriptor, 2, vuc.a, xucVar.c);
        b.c(serialDescriptor);
    }
}
