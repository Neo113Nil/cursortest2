package defpackage;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class uvl implements uxs {
    public static final uvl a;
    private static final SerialDescriptor descriptor;

    static {
        uvl uvlVar = new uvl();
        a = uvlVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.section.divkit.DivkitSnippetSurrogate", uvlVar, 13);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("divDataSharedId", false);
        pluginGeneratedSerialDescriptor.j("actions", false);
        pluginGeneratedSerialDescriptor.j("layout", true);
        pluginGeneratedSerialDescriptor.j("behaviour", true);
        pluginGeneratedSerialDescriptor.j("divDataTag", true);
        pluginGeneratedSerialDescriptor.j("snippetRevision", true);
        pluginGeneratedSerialDescriptor.j("tag", true);
        pluginGeneratedSerialDescriptor.j("showOnActivate", true);
        pluginGeneratedSerialDescriptor.j("patch", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("differ", true);
        pluginGeneratedSerialDescriptor.j("bindingMethod", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = wvl.n;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[2].getValue()), y4t0.a, jvl.a, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), z96.a, qke.n(zp90.a), qke.n(auu0Var), qke.n(djj.a), qke.n((KSerializer) i3yVarArr[12].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        boolean z2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wvl.n;
        b.getClass();
        mw5 mw5Var = null;
        fjj fjjVar = null;
        String str2 = null;
        bq90 bq90Var = null;
        boolean z3 = true;
        String str3 = null;
        int i = 0;
        String str4 = null;
        String str5 = null;
        Map map = null;
        a5t0 a5t0Var = null;
        List list = null;
        String str6 = null;
        String str7 = null;
        boolean z4 = false;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z3 = false;
                case 0:
                    z2 = z3;
                    i |= 1;
                    str4 = b.k(serialDescriptor, 0);
                    z3 = z2;
                case 1:
                    z = z3;
                    str = str4;
                    str5 = (String) b.s(serialDescriptor, 1, auu0.a, str5);
                    i |= 2;
                    z3 = z;
                    str4 = str;
                case 2:
                    z = z3;
                    str = str4;
                    map = (Map) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map);
                    i |= 4;
                    z3 = z;
                    str4 = str;
                case 3:
                    z = z3;
                    str = str4;
                    a5t0Var = (a5t0) b.A(serialDescriptor, 3, y4t0.a, a5t0Var);
                    i |= 8;
                    z3 = z;
                    str4 = str;
                case 4:
                    z = z3;
                    str = str4;
                    list = (List) b.A(serialDescriptor, 4, jvl.a, list);
                    i |= 16;
                    z3 = z;
                    str4 = str;
                case 5:
                    z = z3;
                    str = str4;
                    str6 = (String) b.s(serialDescriptor, 5, auu0.a, str6);
                    i |= 32;
                    z3 = z;
                    str4 = str;
                case 6:
                    z = z3;
                    str = str4;
                    str7 = (String) b.s(serialDescriptor, 6, auu0.a, str7);
                    i |= 64;
                    z3 = z;
                    str4 = str;
                case 7:
                    z = z3;
                    str = str4;
                    str3 = (String) b.s(serialDescriptor, 7, auu0.a, str3);
                    i |= 128;
                    z3 = z;
                    str4 = str;
                case 8:
                    z2 = z3;
                    z4 = b.C(serialDescriptor, 8);
                    i |= 256;
                    z3 = z2;
                case 9:
                    z = z3;
                    str = str4;
                    bq90Var = (bq90) b.s(serialDescriptor, 9, zp90.a, bq90Var);
                    i |= 512;
                    z3 = z;
                    str4 = str;
                case 10:
                    z = z3;
                    str = str4;
                    str2 = (String) b.s(serialDescriptor, 10, auu0.a, str2);
                    i |= 1024;
                    z3 = z;
                    str4 = str;
                case 11:
                    z = z3;
                    str = str4;
                    fjjVar = (fjj) b.s(serialDescriptor, 11, djj.a, fjjVar);
                    i |= 2048;
                    z3 = z;
                    str4 = str;
                case 12:
                    z = z3;
                    str = str4;
                    mw5Var = (mw5) b.s(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), mw5Var);
                    i |= 4096;
                    z3 = z;
                    str4 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new wvl(i, str4, str5, map, a5t0Var, list, str6, str7, str3, z4, bq90Var, str2, fjjVar, mw5Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wvl wvlVar = (wvl) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wvl.n;
        String str = wvlVar.a;
        mw5 mw5Var = wvlVar.m;
        fjj fjjVar = wvlVar.l;
        String str2 = wvlVar.k;
        bq90 bq90Var = wvlVar.j;
        boolean z = wvlVar.i;
        String str3 = wvlVar.h;
        String str4 = wvlVar.g;
        String str5 = wvlVar.f;
        List list = wvlVar.e;
        a5t0 a5t0Var = wvlVar.d;
        b.o(serialDescriptor, 0, str);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 1, auu0Var, wvlVar.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), wvlVar.c);
        if (b.F() || !jl40.l(a5t0Var, qvl.a)) {
            b.e(serialDescriptor, 3, y4t0.a, a5t0Var);
        }
        if (b.F() || !jl40.l(list, qvl.b)) {
            b.e(serialDescriptor, 4, jvl.a, list);
        }
        if (b.F() || str5 != null) {
            b.g(serialDescriptor, 5, auu0Var, str5);
        }
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 6, auu0Var, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 7, auu0Var, str3);
        }
        if (b.F() || !z) {
            b.n(serialDescriptor, 8, z);
        }
        if (b.F() || bq90Var != null) {
            b.g(serialDescriptor, 9, zp90.a, bq90Var);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 10, auu0Var, str2);
        }
        if (b.F() || fjjVar != null) {
            b.g(serialDescriptor, 11, djj.a, fjjVar);
        }
        if (b.F() || mw5Var != null) {
            b.g(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), mw5Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
