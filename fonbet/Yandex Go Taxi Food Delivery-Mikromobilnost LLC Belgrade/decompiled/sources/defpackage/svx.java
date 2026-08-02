package defpackage;

import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes9.dex */
public final /* synthetic */ class svx implements uxs {
    public static final svx a;
    private static final SerialDescriptor descriptor;

    static {
        svx svxVar = new svx();
        a = svxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.client.dto.LaunchParam", svxVar, 14);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("gcm_token", false);
        pluginGeneratedSerialDescriptor.j("hms_token", false);
        pluginGeneratedSerialDescriptor.j("mcc", false);
        pluginGeneratedSerialDescriptor.j(MetaDataField.DEVICE_ID_FIELD, false);
        pluginGeneratedSerialDescriptor.j("antifraud", false);
        pluginGeneratedSerialDescriptor.j("accepted", false);
        pluginGeneratedSerialDescriptor.j("allow_full_account", true);
        pluginGeneratedSerialDescriptor.j("supported_features", false);
        pluginGeneratedSerialDescriptor.j("push_settings", false);
        pluginGeneratedSerialDescriptor.j("known_orders", false);
        pluginGeneratedSerialDescriptor.j("supported_services", false);
        pluginGeneratedSerialDescriptor.j("ads-prefetch-args", true);
        pluginGeneratedSerialDescriptor.j("typed_experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ewx.o;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(wvx.a), i3yVarArr[6].getValue(), z96.a, i3yVarArr[8].getValue(), qke.n(iwx.a), i3yVarArr[10].getValue(), i3yVarArr[11].getValue(), qke.n(mdx.a), qke.n(id7.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        c cVar;
        Set set;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ewx.o;
        b.getClass();
        c cVar2 = null;
        Set set2 = null;
        List list = null;
        kwx kwxVar = null;
        kd7 kd7Var = null;
        jsq0 jsq0Var = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        bwx bwxVar = null;
        List list2 = null;
        boolean z = false;
        boolean z2 = true;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    cVar = cVar2;
                    set = set2;
                    z2 = false;
                    set2 = set;
                    cVar2 = cVar;
                case 0:
                    cVar = cVar2;
                    set = set2;
                    str3 = (String) b.s(serialDescriptor, 0, auu0.a, str3);
                    i |= 1;
                    set2 = set;
                    cVar2 = cVar;
                case 1:
                    cVar = cVar2;
                    str4 = (String) b.s(serialDescriptor, 1, auu0.a, str4);
                    i |= 2;
                    str3 = str3;
                    cVar2 = cVar;
                case 2:
                    str = str3;
                    str2 = str4;
                    str5 = (String) b.s(serialDescriptor, 2, auu0.a, str5);
                    i |= 4;
                    str3 = str;
                    str4 = str2;
                case 3:
                    str = str3;
                    str2 = str4;
                    str6 = (String) b.s(serialDescriptor, 3, auu0.a, str6);
                    i |= 8;
                    str3 = str;
                    str4 = str2;
                case 4:
                    str = str3;
                    str2 = str4;
                    str7 = (String) b.s(serialDescriptor, 4, auu0.a, str7);
                    i |= 16;
                    str3 = str;
                    str4 = str2;
                case 5:
                    str = str3;
                    str2 = str4;
                    bwxVar = (bwx) b.s(serialDescriptor, 5, wvx.a, bwxVar);
                    i |= 32;
                    str3 = str;
                    str4 = str2;
                case 6:
                    str = str3;
                    str2 = str4;
                    list2 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list2);
                    i |= 64;
                    str3 = str;
                    str4 = str2;
                case 7:
                    z = b.C(serialDescriptor, 7);
                    i |= 128;
                    str3 = str3;
                case 8:
                    str = str3;
                    str2 = str4;
                    jsq0Var = (jsq0) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), jsq0Var);
                    i |= 256;
                    str3 = str;
                    str4 = str2;
                case 9:
                    str = str3;
                    str2 = str4;
                    kwxVar = (kwx) b.s(serialDescriptor, 9, iwx.a, kwxVar);
                    i |= 512;
                    str3 = str;
                    str4 = str2;
                case 10:
                    str = str3;
                    str2 = str4;
                    list = (List) b.A(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), list);
                    i |= 1024;
                    str3 = str;
                    str4 = str2;
                case 11:
                    str = str3;
                    str2 = str4;
                    set2 = (Set) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), set2);
                    i |= 2048;
                    str3 = str;
                    str4 = str2;
                case 12:
                    str = str3;
                    str2 = str4;
                    cVar2 = (c) b.s(serialDescriptor, 12, mdx.a, cVar2);
                    i |= 4096;
                    str3 = str;
                    str4 = str2;
                case 13:
                    str = str3;
                    str2 = str4;
                    kd7Var = (kd7) b.s(serialDescriptor, 13, id7.a, kd7Var);
                    i |= 8192;
                    str3 = str;
                    str4 = str2;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        Set set3 = set2;
        b.c(serialDescriptor);
        return new ewx(i, str3, str4, str5, str6, str7, bwxVar, list2, z, jsq0Var, kwxVar, list, set3, cVar2, kd7Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ewx ewxVar = (ewx) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ewx.o;
        auu0 auu0Var = auu0.a;
        String str = ewxVar.a;
        kd7 kd7Var = ewxVar.n;
        c cVar = ewxVar.m;
        boolean z = ewxVar.h;
        b.g(serialDescriptor, 0, auu0Var, str);
        b.g(serialDescriptor, 1, auu0Var, ewxVar.b);
        b.g(serialDescriptor, 2, auu0Var, ewxVar.c);
        b.g(serialDescriptor, 3, auu0Var, ewxVar.d);
        b.g(serialDescriptor, 4, auu0Var, ewxVar.e);
        b.g(serialDescriptor, 5, wvx.a, ewxVar.f);
        b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), ewxVar.g);
        if (b.F() || z) {
            b.n(serialDescriptor, 7, z);
        }
        b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), ewxVar.i);
        b.g(serialDescriptor, 9, iwx.a, ewxVar.j);
        b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), ewxVar.k);
        b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), ewxVar.l);
        if (b.F() || cVar != null) {
            b.g(serialDescriptor, 12, mdx.a, cVar);
        }
        if (b.F() || kd7Var != null) {
            b.g(serialDescriptor, 13, id7.a, kd7Var);
        }
        b.c(serialDescriptor);
    }
}
