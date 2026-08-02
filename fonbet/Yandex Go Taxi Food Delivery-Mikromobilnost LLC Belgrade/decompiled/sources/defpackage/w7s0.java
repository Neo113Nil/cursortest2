package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class w7s0 implements uxs {
    public static final w7s0 a;
    private static final SerialDescriptor descriptor;

    static {
        w7s0 w7s0Var = new w7s0();
        a = w7s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.navigation.action.ShowOverlayAction", w7s0Var, 3);
        pluginGeneratedSerialDescriptor.j("document", false);
        pluginGeneratedSerialDescriptor.j("tag", false);
        pluginGeneratedSerialDescriptor.j("customProps", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) y7s0.d[0].getValue()), auu0.a, r9i0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = y7s0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        ywl ywlVar = null;
        String str = null;
        s9i0 s9i0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                ywlVar = (ywl) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), ywlVar);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                s9i0Var = (s9i0) b.A(serialDescriptor, 2, r9i0.a, s9i0Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new y7s0(i, ywlVar, str, s9i0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (defpackage.jl40.l(r3, defpackage.s9i0.b) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        y7s0 y7s0Var = (y7s0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) y7s0.d[0].getValue();
        ywl ywlVar = y7s0Var.a;
        s9i0 s9i0Var = y7s0Var.c;
        b.g(serialDescriptor, 0, kSerializer, ywlVar);
        b.o(serialDescriptor, 1, y7s0Var.b);
        if (!b.F()) {
            s9i0.Companion.getClass();
        }
        b.e(serialDescriptor, 2, r9i0.a, s9i0Var);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
