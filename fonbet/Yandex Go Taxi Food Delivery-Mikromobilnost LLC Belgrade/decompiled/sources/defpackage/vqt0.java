package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class vqt0 implements uxs {
    public static final vqt0 a;
    private static final SerialDescriptor descriptor;

    static {
        vqt0 vqt0Var = new vqt0();
        a = vqt0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.shortcuts.dto.response.superapp.SplashObject.Shimmering", vqt0Var, 1);
        pluginGeneratedSerialDescriptor.j("context", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bvr0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        dvr0 dvr0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                dvr0Var = (dvr0) b.A(serialDescriptor, 0, bvr0.a, dvr0Var);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new xqt0(i, dvr0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.dvr0.c) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        xqt0 xqt0Var = (xqt0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (!b.F()) {
            dvr0 dvr0Var = xqt0Var.a;
            dvr0.Companion.getClass();
        }
        b.e(serialDescriptor, 0, bvr0.a, xqt0Var.a);
        b.c(serialDescriptor);
    }
}
