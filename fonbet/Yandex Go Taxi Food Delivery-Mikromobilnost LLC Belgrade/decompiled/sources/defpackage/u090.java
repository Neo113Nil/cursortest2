package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class u090 implements uxs {
    public static final u090 a;
    private static final SerialDescriptor descriptor;

    static {
        u090 u090Var = new u090();
        a = u090Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.navigation.action.OverlayAction", u090Var, 5);
        pluginGeneratedSerialDescriptor.j("query", false);
        pluginGeneratedSerialDescriptor.j("document", false);
        pluginGeneratedSerialDescriptor.j("animated", false);
        pluginGeneratedSerialDescriptor.j("fullscreen", false);
        pluginGeneratedSerialDescriptor.j("customProps", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = w090.f;
        KSerializer n = qke.n((KSerializer) i3yVarArr[0].getValue());
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[1].getValue());
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, qke.n(z96Var), qke.n(z96Var), r9i0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = w090.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        u1m u1mVar = null;
        ywl ywlVar = null;
        Boolean bool = null;
        Boolean bool2 = null;
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
            } else if (v == 3) {
                bool2 = (Boolean) b.s(serialDescriptor, 3, z96.a, bool2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                s9i0Var = (s9i0) b.A(serialDescriptor, 4, r9i0.a, s9i0Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new w090(i, u1mVar, ywlVar, bool, bool2, s9i0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0048, code lost:
    
        if (defpackage.jl40.l(r4, defpackage.s9i0.b) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        w090 w090Var = (w090) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = w090.f;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        u1m u1mVar = w090Var.a;
        s9i0 s9i0Var = w090Var.e;
        b.g(serialDescriptor, 0, kSerializer, u1mVar);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), w090Var.b);
        z96 z96Var = z96.a;
        b.g(serialDescriptor, 2, z96Var, w090Var.c);
        b.g(serialDescriptor, 3, z96Var, w090Var.d);
        if (!b.F()) {
            s9i0.Companion.getClass();
        }
        b.e(serialDescriptor, 4, r9i0.a, s9i0Var);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
