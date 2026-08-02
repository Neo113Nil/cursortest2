package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class t8s0 implements uxs {
    public static final t8s0 a;
    private static final SerialDescriptor descriptor;

    static {
        t8s0 t8s0Var = new t8s0();
        a = t8s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.navigation.action.ShowPopupAction", t8s0Var, 10);
        pluginGeneratedSerialDescriptor.j("query", false);
        pluginGeneratedSerialDescriptor.j("document", false);
        pluginGeneratedSerialDescriptor.j("fullscreen", false);
        pluginGeneratedSerialDescriptor.j("closeOnSlideDown", false);
        pluginGeneratedSerialDescriptor.j("closeOnTapOutside", false);
        pluginGeneratedSerialDescriptor.j("dimBackground", false);
        pluginGeneratedSerialDescriptor.j("defaultHeight", false);
        pluginGeneratedSerialDescriptor.j("shouldLoadByQuery", false);
        pluginGeneratedSerialDescriptor.j("customProps", true);
        pluginGeneratedSerialDescriptor.j("completionAction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = w8s0.k;
        KSerializer n = qke.n((KSerializer) i3yVarArr[0].getValue());
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[1].getValue());
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, qke.n(z96Var), qke.n(z96Var), qke.n(z96Var), qke.n(z96Var), qke.n(nor.a), qke.n(z96Var), r9i0.a, qke.n((KSerializer) i3yVarArr[9].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = w8s0.k;
        b.getClass();
        kr krVar = null;
        s9i0 s9i0Var = null;
        boolean z = true;
        Boolean bool = null;
        int i = 0;
        u1m u1mVar = null;
        ywl ywlVar = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Float f = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    u1mVar = (u1m) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), u1mVar);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    ywlVar = (ywl) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), ywlVar);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    bool2 = (Boolean) b.s(serialDescriptor, 2, z96.a, bool2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    bool3 = (Boolean) b.s(serialDescriptor, 3, z96.a, bool3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    bool4 = (Boolean) b.s(serialDescriptor, 4, z96.a, bool4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    bool5 = (Boolean) b.s(serialDescriptor, 5, z96.a, bool5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    f = (Float) b.s(serialDescriptor, 6, nor.a, f);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    bool = (Boolean) b.s(serialDescriptor, 7, z96.a, bool);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    s9i0Var = (s9i0) b.A(serialDescriptor, 8, r9i0.a, s9i0Var);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    krVar = (kr) b.s(serialDescriptor, 9, (myi) i3yVarArr2[9].getValue(), krVar);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new w8s0(i, u1mVar, ywlVar, bool2, bool3, bool4, bool5, f, bool, s9i0Var, krVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0062, code lost:
    
        if (defpackage.jl40.l(r4, defpackage.s9i0.b) == false) goto L7;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        w8s0 w8s0Var = (w8s0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = w8s0.k;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        u1m u1mVar = w8s0Var.a;
        s9i0 s9i0Var = w8s0Var.i;
        b.g(serialDescriptor, 0, kSerializer, u1mVar);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), w8s0Var.b);
        z96 z96Var = z96.a;
        b.g(serialDescriptor, 2, z96Var, w8s0Var.c);
        b.g(serialDescriptor, 3, z96Var, w8s0Var.d);
        b.g(serialDescriptor, 4, z96Var, w8s0Var.e);
        b.g(serialDescriptor, 5, z96Var, w8s0Var.f);
        b.g(serialDescriptor, 6, nor.a, w8s0Var.g);
        b.g(serialDescriptor, 7, z96Var, w8s0Var.h);
        if (!b.F()) {
            s9i0.Companion.getClass();
        }
        b.e(serialDescriptor, 8, r9i0.a, s9i0Var);
        b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), w8s0Var.j);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
