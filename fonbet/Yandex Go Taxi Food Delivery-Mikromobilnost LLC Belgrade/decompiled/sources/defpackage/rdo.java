package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class rdo implements uxs {
    public static final rdo a;
    private static final SerialDescriptor descriptor;

    static {
        rdo rdoVar = new rdo();
        a = rdoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.quark.js.event.Event.HandlePlatformDirectiveEvent.Payload", rdoVar, 3);
        pluginGeneratedSerialDescriptor.j("capabilityId", false);
        pluginGeneratedSerialDescriptor.j("directiveName", false);
        pluginGeneratedSerialDescriptor.j("directiveData", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = tdo.d;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = tdo.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        png pngVar = null;
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
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                pngVar = (png) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), pngVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new tdo(i, str, str2, pngVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tdo tdoVar = (tdo) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = tdo.d;
        b.o(serialDescriptor, 0, tdoVar.a);
        b.o(serialDescriptor, 1, tdoVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), tdoVar.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
