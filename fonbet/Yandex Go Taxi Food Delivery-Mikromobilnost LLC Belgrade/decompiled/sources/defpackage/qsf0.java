package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class qsf0 implements uxs {
    public static final qsf0 a;
    private static final SerialDescriptor descriptor;

    static {
        qsf0 qsf0Var = new qsf0();
        a = qsf0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.PromotionsParam", qsf0Var, 13);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("promotion_id", true);
        pluginGeneratedSerialDescriptor.j("size_hint", true);
        pluginGeneratedSerialDescriptor.j("supported_types", true);
        pluginGeneratedSerialDescriptor.j("supported_widgets", true);
        pluginGeneratedSerialDescriptor.j("supported_background_types", true);
        pluginGeneratedSerialDescriptor.j("supported_features", true);
        pluginGeneratedSerialDescriptor.j("ultima_mode", true);
        pluginGeneratedSerialDescriptor.j("choose_appearance_mode", true);
        pluginGeneratedSerialDescriptor.j("point_a", true);
        pluginGeneratedSerialDescriptor.j("user_power_prc", true);
        pluginGeneratedSerialDescriptor.j("user_plugged_state", true);
        pluginGeneratedSerialDescriptor.j("communications_seen_events", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ssf0.n;
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), h6wVar, i3yVarArr[3].getValue(), i3yVarArr[4].getValue(), i3yVarArr[5].getValue(), i3yVarArr[6].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(guc.a), qke.n(h6wVar), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[12].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String str;
        int i;
        String str2;
        int i2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ssf0.n;
        b.getClass();
        String str3 = null;
        Integer num = null;
        iuc iucVar = null;
        String str4 = null;
        List list = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        String str7 = null;
        int i4 = 0;
        List list2 = null;
        List list3 = null;
        jsq0 jsq0Var = null;
        List list4 = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str2 = str3;
                    i2 = i4;
                    z = false;
                    i4 = i2;
                    str3 = str2;
                case 0:
                    i2 = i4;
                    str2 = str3;
                    str6 = (String) b.s(serialDescriptor, 0, auu0.a, str6);
                    i3 |= 1;
                    i4 = i2;
                    str3 = str2;
                case 1:
                    str = str6;
                    i = i4;
                    str7 = (String) b.s(serialDescriptor, 1, auu0.a, str7);
                    i3 |= 2;
                    i4 = i;
                    str6 = str;
                case 2:
                    str = str6;
                    i4 = b.h(serialDescriptor, 2);
                    i3 |= 4;
                    str6 = str;
                case 3:
                    str = str6;
                    i = i4;
                    list2 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list2);
                    i3 |= 8;
                    i4 = i;
                    str6 = str;
                case 4:
                    str = str6;
                    i = i4;
                    list3 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list3);
                    i3 |= 16;
                    i4 = i;
                    str6 = str;
                case 5:
                    str = str6;
                    i = i4;
                    jsq0Var = (jsq0) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), jsq0Var);
                    i3 |= 32;
                    i4 = i;
                    str6 = str;
                case 6:
                    str = str6;
                    i = i4;
                    list4 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list4);
                    i3 |= 64;
                    i4 = i;
                    str6 = str;
                case 7:
                    str = str6;
                    i = i4;
                    str5 = (String) b.s(serialDescriptor, 7, auu0.a, str5);
                    i3 |= 128;
                    i4 = i;
                    str6 = str;
                case 8:
                    str = str6;
                    i = i4;
                    str4 = (String) b.s(serialDescriptor, 8, auu0.a, str4);
                    i3 |= 256;
                    i4 = i;
                    str6 = str;
                case 9:
                    str = str6;
                    i = i4;
                    iucVar = (iuc) b.s(serialDescriptor, 9, guc.a, iucVar);
                    i3 |= 512;
                    i4 = i;
                    str6 = str;
                case 10:
                    str = str6;
                    i = i4;
                    num = (Integer) b.s(serialDescriptor, 10, h6w.a, num);
                    i3 |= 1024;
                    i4 = i;
                    str6 = str;
                case 11:
                    str = str6;
                    i = i4;
                    str3 = (String) b.s(serialDescriptor, 11, auu0.a, str3);
                    i3 |= 2048;
                    i4 = i;
                    str6 = str;
                case 12:
                    i = i4;
                    str = str6;
                    list = (List) b.s(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), list);
                    i3 |= 4096;
                    i4 = i;
                    str6 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        int i5 = i4;
        b.c(serialDescriptor);
        return new ssf0(i3, str6, str7, i5, list2, list3, jsq0Var, list4, str5, str4, iucVar, num, str3, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ssf0 ssf0Var = (ssf0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ssf0.n;
        if (b.F() || ssf0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, ssf0Var.a);
        }
        if (b.F() || ssf0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, ssf0Var.b);
        }
        if (b.F() || ssf0Var.c != 0) {
            b.A(2, ssf0Var.c, serialDescriptor);
        }
        if (b.F() || !jl40.l(ssf0Var.d, scc.g("fullscreen_banners", kju0.b, "notifications", "missed_seen"))) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), ssf0Var.d);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(ssf0Var.e, emptyList)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), ssf0Var.e);
        }
        if (b.F() || !jl40.l(ssf0Var.f, ksq0.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), ssf0Var.f);
        }
        if (b.F() || !jl40.l(ssf0Var.g, emptyList)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), ssf0Var.g);
        }
        if (b.F() || ssf0Var.h != null) {
            b.g(serialDescriptor, 7, auu0.a, ssf0Var.h);
        }
        if (b.F() || ssf0Var.i != null) {
            b.g(serialDescriptor, 8, auu0.a, ssf0Var.i);
        }
        if (b.F() || ssf0Var.j != null) {
            b.g(serialDescriptor, 9, guc.a, ssf0Var.j);
        }
        if (b.F() || ssf0Var.k != null) {
            b.g(serialDescriptor, 10, h6w.a, ssf0Var.k);
        }
        if (b.F() || ssf0Var.l != null) {
            b.g(serialDescriptor, 11, auu0.a, ssf0Var.l);
        }
        if (b.F() || ssf0Var.m != null) {
            b.g(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), ssf0Var.m);
        }
        b.c(serialDescriptor);
    }
}
