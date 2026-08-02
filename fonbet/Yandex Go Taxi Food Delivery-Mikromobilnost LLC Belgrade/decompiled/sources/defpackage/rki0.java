package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class rki0 implements uxs {
    public static final rki0 a;
    private static final SerialDescriptor descriptor;

    static {
        rki0 rki0Var = new rki0();
        a = rki0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.document.action.RedirectAction", rki0Var, 2);
        pluginGeneratedSerialDescriptor.j("query", false);
        pluginGeneratedSerialDescriptor.j("document", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = yki0.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = yki0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        u1m u1mVar = null;
        ywl ywlVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                u1mVar = (u1m) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), u1mVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                ywlVar = (ywl) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), ywlVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new yki0(i, u1mVar, ywlVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        yki0 yki0Var = (yki0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = yki0.c;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        u1m u1mVar = yki0Var.a;
        ywl ywlVar = yki0Var.b;
        b.e(serialDescriptor, 0, kSerializer, u1mVar);
        if (b.F() || ywlVar != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ywlVar);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
