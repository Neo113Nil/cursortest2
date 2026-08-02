package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class r1t0 implements uxs {
    public static final r1t0 a;
    private static final SerialDescriptor descriptor;

    static {
        r1t0 r1t0Var = new r1t0();
        a = r1t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("just.adapter.snapping.SnappingCallbacks", r1t0Var, 4);
        pluginGeneratedSerialDescriptor.j("onStarted", true);
        pluginGeneratedSerialDescriptor.j("onCancelled", true);
        pluginGeneratedSerialDescriptor.j("onCompleted", true);
        pluginGeneratedSerialDescriptor.j("onMovedAway", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = t1t0.e;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = t1t0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        kr krVar = null;
        kr krVar2 = null;
        kr krVar3 = null;
        kr krVar4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                krVar = (kr) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), krVar);
                i |= 1;
            } else if (v == 1) {
                krVar2 = (kr) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), krVar2);
                i |= 2;
            } else if (v == 2) {
                krVar3 = (kr) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), krVar3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                krVar4 = (kr) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), krVar4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new t1t0(i, krVar, krVar2, krVar3, krVar4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t1t0 t1t0Var = (t1t0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = t1t0.e;
        if (b.F() || t1t0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), t1t0Var.a);
        }
        if (b.F() || t1t0Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), t1t0Var.b);
        }
        if (b.F() || t1t0Var.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), t1t0Var.c);
        }
        if (b.F() || t1t0Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), t1t0Var.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
