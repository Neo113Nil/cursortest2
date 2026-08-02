package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class r9s implements uxs {
    public static final r9s a;
    private static final SerialDescriptor descriptor;

    static {
        r9s r9sVar = new r9s();
        a = r9sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.navigation.action.ForwardAction", r9sVar, 4);
        pluginGeneratedSerialDescriptor.j("query", false);
        pluginGeneratedSerialDescriptor.j("document", false);
        pluginGeneratedSerialDescriptor.j("animated", false);
        pluginGeneratedSerialDescriptor.j("customProps", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = t9s.e;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(z96.a), r9i0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = t9s.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        u1m u1mVar = null;
        ywl ywlVar = null;
        Boolean bool = null;
        s9i0 s9i0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                u1mVar = (u1m) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), u1mVar);
                i |= 1;
            } else if (v == 1) {
                ywlVar = (ywl) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), ywlVar);
                i |= 2;
            } else if (v == 2) {
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                s9i0Var = (s9i0) b.A(serialDescriptor, 3, r9i0.a, s9i0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new t9s(i, u1mVar, ywlVar, bool, s9i0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0042, code lost:
    
        if (defpackage.jl40.l(r4, defpackage.s9i0.b) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        t9s t9sVar = (t9s) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = t9s.e;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        u1m u1mVar = t9sVar.a;
        s9i0 s9i0Var = t9sVar.d;
        b.g(serialDescriptor, 0, kSerializer, u1mVar);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), t9sVar.b);
        b.g(serialDescriptor, 2, z96.a, t9sVar.c);
        if (!b.F()) {
            s9i0.Companion.getClass();
        }
        b.e(serialDescriptor, 3, r9i0.a, s9i0Var);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
