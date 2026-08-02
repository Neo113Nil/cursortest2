package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

/* loaded from: classes9.dex */
public final /* synthetic */ class s6r implements uxs {
    public static final s6r a;
    private static final SerialDescriptor descriptor;

    static {
        s6r s6rVar = new s6r();
        a = s6rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.FinalSuggestResponse", s6rVar, 13);
        pluginGeneratedSerialDescriptor.j(CRLDistributionPointsExtension.POINTS, true);
        pluginGeneratedSerialDescriptor.j("points_icon_image_tag", true);
        pluginGeneratedSerialDescriptor.j("results", true);
        pluginGeneratedSerialDescriptor.j("services", true);
        pluginGeneratedSerialDescriptor.j("zones", true);
        pluginGeneratedSerialDescriptor.j("alert", true);
        pluginGeneratedSerialDescriptor.j("pin_alert", true);
        pluginGeneratedSerialDescriptor.j("position_choices", true);
        pluginGeneratedSerialDescriptor.j("immediate_actions", true);
        pluginGeneratedSerialDescriptor.j("condition_actions", true);
        pluginGeneratedSerialDescriptor.j("conditional_actions_v2", true);
        pluginGeneratedSerialDescriptor.j("request_position_info", true);
        pluginGeneratedSerialDescriptor.j("typed_experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = u6r.o;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n(auu0.a), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(qxq0.a), qke.n(i56.a), qke.n(nq1.a), qke.n(aub0.a), qke.n(bde0.a), qke.n((KSerializer) i3yVarArr[8].getValue()), qke.n((KSerializer) i3yVarArr[9].getValue()), qke.n((KSerializer) i3yVarArr[10].getValue()), qke.n(f8j0.a), qke.n(wa7.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        List list;
        String str;
        h8j0 h8j0Var;
        List list2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = u6r.o;
        b.getClass();
        h8j0 h8j0Var2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        xa7 xa7Var = null;
        dde0 dde0Var = null;
        int i = 0;
        List list6 = null;
        String str2 = null;
        List list7 = null;
        sxq0 sxq0Var = null;
        k56 k56Var = null;
        pq1 pq1Var = null;
        cub0 cub0Var = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    h8j0Var = h8j0Var2;
                    list2 = list3;
                    z = false;
                    list3 = list2;
                    h8j0Var2 = h8j0Var;
                case 0:
                    h8j0Var = h8j0Var2;
                    list2 = list3;
                    list6 = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list6);
                    i |= 1;
                    list3 = list2;
                    h8j0Var2 = h8j0Var;
                case 1:
                    h8j0Var = h8j0Var2;
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    list6 = list6;
                    h8j0Var2 = h8j0Var;
                case 2:
                    list = list6;
                    str = str2;
                    list7 = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list7);
                    i |= 4;
                    list6 = list;
                    str2 = str;
                case 3:
                    list = list6;
                    str = str2;
                    sxq0Var = (sxq0) b.s(serialDescriptor, 3, qxq0.a, sxq0Var);
                    i |= 8;
                    list6 = list;
                    str2 = str;
                case 4:
                    list = list6;
                    str = str2;
                    k56Var = (k56) b.s(serialDescriptor, 4, i56.a, k56Var);
                    i |= 16;
                    list6 = list;
                    str2 = str;
                case 5:
                    list = list6;
                    str = str2;
                    pq1Var = (pq1) b.s(serialDescriptor, 5, nq1.a, pq1Var);
                    i |= 32;
                    list6 = list;
                    str2 = str;
                case 6:
                    list = list6;
                    str = str2;
                    cub0Var = (cub0) b.s(serialDescriptor, 6, aub0.a, cub0Var);
                    i |= 64;
                    list6 = list;
                    str2 = str;
                case 7:
                    list = list6;
                    str = str2;
                    dde0Var = (dde0) b.s(serialDescriptor, 7, bde0.a, dde0Var);
                    i |= 128;
                    list6 = list;
                    str2 = str;
                case 8:
                    list = list6;
                    str = str2;
                    list5 = (List) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list5);
                    i |= 256;
                    list6 = list;
                    str2 = str;
                case 9:
                    list = list6;
                    str = str2;
                    list4 = (List) b.s(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), list4);
                    i |= 512;
                    list6 = list;
                    str2 = str;
                case 10:
                    list = list6;
                    str = str2;
                    list3 = (List) b.s(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), list3);
                    i |= 1024;
                    list6 = list;
                    str2 = str;
                case 11:
                    list = list6;
                    str = str2;
                    h8j0Var2 = (h8j0) b.s(serialDescriptor, 11, f8j0.a, h8j0Var2);
                    i |= 2048;
                    list6 = list;
                    str2 = str;
                case 12:
                    list = list6;
                    str = str2;
                    xa7Var = (xa7) b.s(serialDescriptor, 12, wa7.a, xa7Var);
                    i |= 4096;
                    list6 = list;
                    str2 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        List list8 = list3;
        b.c(serialDescriptor);
        return new u6r(i, list6, str2, list7, sxq0Var, k56Var, pq1Var, cub0Var, dde0Var, list5, list4, list8, h8j0Var2, xa7Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u6r u6rVar = (u6r) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = u6r.o;
        if (b.F() || u6rVar.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), u6rVar.a);
        }
        if (b.F() || u6rVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, u6rVar.b);
        }
        if (b.F() || u6rVar.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), u6rVar.c);
        }
        if (b.F() || u6rVar.d != null) {
            b.g(serialDescriptor, 3, qxq0.a, u6rVar.d);
        }
        if (b.F() || u6rVar.e != null) {
            b.g(serialDescriptor, 4, i56.a, u6rVar.e);
        }
        if (b.F() || u6rVar.f != null) {
            b.g(serialDescriptor, 5, nq1.a, u6rVar.f);
        }
        if (b.F() || u6rVar.g != null) {
            b.g(serialDescriptor, 6, aub0.a, u6rVar.g);
        }
        if (b.F() || u6rVar.h != null) {
            b.g(serialDescriptor, 7, bde0.a, u6rVar.h);
        }
        if (b.F() || u6rVar.i != null) {
            b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), u6rVar.i);
        }
        if (b.F() || u6rVar.j != null) {
            b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), u6rVar.j);
        }
        if (b.F() || u6rVar.k != null) {
            b.g(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), u6rVar.k);
        }
        if (b.F() || u6rVar.l != null) {
            b.g(serialDescriptor, 11, f8j0.a, u6rVar.l);
        }
        if (b.F() || u6rVar.m != null) {
            b.g(serialDescriptor, 12, wa7.a, u6rVar.m);
        }
        b.c(serialDescriptor);
    }
}
