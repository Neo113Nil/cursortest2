package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class zqt0 implements uxs {
    public static final zqt0 a;
    private static final SerialDescriptor descriptor;

    static {
        zqt0 zqt0Var = new zqt0();
        a = zqt0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.shortcuts.dto.response.superapp.SplashObject.Stickers", zqt0Var, 1);
        pluginGeneratedSerialDescriptor.j("context", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ddu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        fdu0 fdu0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                fdu0Var = (fdu0) b.A(serialDescriptor, 0, ddu0.a, fdu0Var);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new brt0(i, fdu0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.fdu0.c) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        brt0 brt0Var = (brt0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (!b.F()) {
            fdu0 fdu0Var = brt0Var.a;
            fdu0.Companion.getClass();
        }
        b.e(serialDescriptor, 0, ddu0.a, brt0Var.a);
        b.c(serialDescriptor);
    }
}
