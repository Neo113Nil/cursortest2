package defpackage;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

/* loaded from: classes9.dex */
public final /* synthetic */ class upb0 implements uxs {
    public static final upb0 a;
    private static final SerialDescriptor descriptor;

    static {
        upb0 upb0Var = new upb0();
        a = upb0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.PickupPoint", upb0Var, 19);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("geometry", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("azimuth", true);
        pluginGeneratedSerialDescriptor.j("bubble", true);
        pluginGeneratedSerialDescriptor.j("hide_before_tap", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("image_url", true);
        pluginGeneratedSerialDescriptor.j("is_last", true);
        pluginGeneratedSerialDescriptor.j("is_personal", true);
        pluginGeneratedSerialDescriptor.j("is_stop", true);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("method", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        pluginGeneratedSerialDescriptor.j("cache", true);
        pluginGeneratedSerialDescriptor.j("stop_name", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("choice_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = xpb0.t;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(b0t.a);
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[2].getValue());
        KSerializer n4 = qke.n(h6w.a);
        KSerializer n5 = qke.n(pl6.a);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, n3, n4, n5, qke.n(z96Var), qke.n(auu0Var), qke.n(zfv.a), qke.n(z96Var), qke.n(z96Var), qke.n(z96Var), qke.n(aqx.a), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[14].getValue()), qke.n(ka7.a), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        dgv dgvVar;
        String str;
        int i;
        hqx hqxVar;
        String str2;
        dgv dgvVar2;
        String str3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = xpb0.t;
        b.getClass();
        hqx hqxVar2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str4 = null;
        dgv dgvVar3 = null;
        int i2 = 0;
        String str5 = null;
        List list = null;
        ta7 ta7Var = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        boolean z = true;
        String str10 = null;
        zzs zzsVar = null;
        MapObjectType mapObjectType = null;
        Integer num = null;
        rl6 rl6Var = null;
        Boolean bool4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    hqxVar = hqxVar2;
                    str2 = str10;
                    z = false;
                    bool = bool;
                    str9 = str9;
                    str10 = str2;
                    hqxVar2 = hqxVar;
                case 0:
                    hqxVar = hqxVar2;
                    str2 = (String) b.s(serialDescriptor, 0, auu0.a, str10);
                    i2 |= 1;
                    bool = bool;
                    str9 = str9;
                    dgvVar3 = dgvVar3;
                    str10 = str2;
                    hqxVar2 = hqxVar;
                case 1:
                    hqxVar = hqxVar2;
                    dgvVar2 = dgvVar3;
                    str3 = str9;
                    zzsVar = (zzs) b.s(serialDescriptor, 1, b0t.a, zzsVar);
                    i2 |= 2;
                    mapObjectType = mapObjectType;
                    str9 = str3;
                    dgvVar3 = dgvVar2;
                    hqxVar2 = hqxVar;
                case 2:
                    hqxVar = hqxVar2;
                    dgvVar2 = dgvVar3;
                    str3 = str9;
                    mapObjectType = (MapObjectType) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), mapObjectType);
                    i2 |= 4;
                    str9 = str3;
                    dgvVar3 = dgvVar2;
                    hqxVar2 = hqxVar;
                case 3:
                    hqxVar = hqxVar2;
                    dgvVar2 = dgvVar3;
                    str3 = str9;
                    num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                    i2 |= 8;
                    str9 = str3;
                    dgvVar3 = dgvVar2;
                    hqxVar2 = hqxVar;
                case 4:
                    hqxVar = hqxVar2;
                    dgvVar2 = dgvVar3;
                    str3 = str9;
                    rl6Var = (rl6) b.s(serialDescriptor, 4, pl6.a, rl6Var);
                    i2 |= 16;
                    str9 = str3;
                    dgvVar3 = dgvVar2;
                    hqxVar2 = hqxVar;
                case 5:
                    hqxVar = hqxVar2;
                    dgvVar2 = dgvVar3;
                    str3 = str9;
                    bool4 = (Boolean) b.s(serialDescriptor, 5, z96.a, bool4);
                    i2 |= 32;
                    str9 = str3;
                    dgvVar3 = dgvVar2;
                    hqxVar2 = hqxVar;
                case 6:
                    hqxVar = hqxVar2;
                    dgvVar2 = dgvVar3;
                    str9 = (String) b.s(serialDescriptor, 6, auu0.a, str9);
                    i2 |= 64;
                    dgvVar3 = dgvVar2;
                    hqxVar2 = hqxVar;
                case 7:
                    hqxVar = hqxVar2;
                    dgvVar3 = (dgv) b.s(serialDescriptor, 7, zfv.a, dgvVar3);
                    i2 |= 128;
                    str9 = str9;
                    hqxVar2 = hqxVar;
                case 8:
                    dgvVar = dgvVar3;
                    str = str9;
                    bool3 = (Boolean) b.s(serialDescriptor, 8, z96.a, bool3);
                    i2 |= 256;
                    str9 = str;
                    dgvVar3 = dgvVar;
                case 9:
                    dgvVar = dgvVar3;
                    str = str9;
                    bool2 = (Boolean) b.s(serialDescriptor, 9, z96.a, bool2);
                    i2 |= 512;
                    str9 = str;
                    dgvVar3 = dgvVar;
                case 10:
                    dgvVar = dgvVar3;
                    str = str9;
                    bool = (Boolean) b.s(serialDescriptor, 10, z96.a, bool);
                    i2 |= 1024;
                    str9 = str;
                    dgvVar3 = dgvVar;
                case 11:
                    dgvVar = dgvVar3;
                    str = str9;
                    hqxVar2 = (hqx) b.s(serialDescriptor, 11, aqx.a, hqxVar2);
                    i2 |= 2048;
                    str9 = str;
                    dgvVar3 = dgvVar;
                case 12:
                    dgvVar = dgvVar3;
                    str = str9;
                    str4 = (String) b.s(serialDescriptor, 12, auu0.a, str4);
                    i2 |= 4096;
                    str9 = str;
                    dgvVar3 = dgvVar;
                case 13:
                    dgvVar = dgvVar3;
                    str = str9;
                    str5 = (String) b.s(serialDescriptor, 13, auu0.a, str5);
                    i2 |= 8192;
                    str9 = str;
                    dgvVar3 = dgvVar;
                case 14:
                    dgvVar = dgvVar3;
                    str = str9;
                    list = (List) b.s(serialDescriptor, 14, (myi) i3yVarArr[14].getValue(), list);
                    i2 |= 16384;
                    str9 = str;
                    dgvVar3 = dgvVar;
                case 15:
                    dgvVar = dgvVar3;
                    str = str9;
                    ta7Var = (ta7) b.s(serialDescriptor, 15, ka7.a, ta7Var);
                    i = 32768;
                    i2 |= i;
                    str9 = str;
                    dgvVar3 = dgvVar;
                case 16:
                    dgvVar = dgvVar3;
                    str = str9;
                    str6 = (String) b.s(serialDescriptor, 16, auu0.a, str6);
                    i = 65536;
                    i2 |= i;
                    str9 = str;
                    dgvVar3 = dgvVar;
                case 17:
                    dgvVar = dgvVar3;
                    str = str9;
                    str7 = (String) b.s(serialDescriptor, 17, auu0.a, str7);
                    i = 131072;
                    i2 |= i;
                    str9 = str;
                    dgvVar3 = dgvVar;
                case 18:
                    str = str9;
                    dgvVar = dgvVar3;
                    str8 = (String) b.s(serialDescriptor, 18, auu0.a, str8);
                    i = 262144;
                    i2 |= i;
                    str9 = str;
                    dgvVar3 = dgvVar;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        hqx hqxVar3 = hqxVar2;
        String str11 = str9;
        String str12 = str10;
        zzs zzsVar2 = zzsVar;
        MapObjectType mapObjectType2 = mapObjectType;
        b.c(serialDescriptor);
        return new xpb0(i2, str12, zzsVar2, mapObjectType2, num, rl6Var, bool4, str11, dgvVar3, bool3, bool2, bool, hqxVar3, str4, str5, list, ta7Var, str6, str7, str8);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xpb0 xpb0Var = (xpb0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = xpb0.t;
        if (b.F() || xpb0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, xpb0Var.a);
        }
        if (b.F() || xpb0Var.b != null) {
            b.g(serialDescriptor, 1, b0t.a, xpb0Var.b);
        }
        if (b.F() || xpb0Var.c != MapObjectType.UNKNOWN) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), xpb0Var.c);
        }
        if (b.F() || xpb0Var.d != null) {
            b.g(serialDescriptor, 3, h6w.a, xpb0Var.d);
        }
        if (b.F() || xpb0Var.e != null) {
            b.g(serialDescriptor, 4, pl6.a, xpb0Var.e);
        }
        if (b.F() || xpb0Var.f != null) {
            b.g(serialDescriptor, 5, z96.a, xpb0Var.f);
        }
        if (b.F() || xpb0Var.g != null) {
            b.g(serialDescriptor, 6, auu0.a, xpb0Var.g);
        }
        if (b.F() || xpb0Var.h != null) {
            b.g(serialDescriptor, 7, zfv.a, xpb0Var.h);
        }
        if (b.F() || xpb0Var.i != null) {
            b.g(serialDescriptor, 8, z96.a, xpb0Var.i);
        }
        if (b.F() || xpb0Var.j != null) {
            b.g(serialDescriptor, 9, z96.a, xpb0Var.j);
        }
        if (b.F() || xpb0Var.k != null) {
            b.g(serialDescriptor, 10, z96.a, xpb0Var.k);
        }
        if (b.F() || xpb0Var.l != null) {
            b.g(serialDescriptor, 11, aqx.a, xpb0Var.l);
        }
        if (b.F() || xpb0Var.m != null) {
            b.g(serialDescriptor, 12, auu0.a, xpb0Var.m);
        }
        if (b.F() || xpb0Var.n != null) {
            b.g(serialDescriptor, 13, auu0.a, xpb0Var.n);
        }
        if (b.F() || xpb0Var.o != null) {
            b.g(serialDescriptor, 14, (KSerializer) i3yVarArr[14].getValue(), xpb0Var.o);
        }
        if (b.F() || xpb0Var.p != null) {
            b.g(serialDescriptor, 15, ka7.a, xpb0Var.p);
        }
        if (b.F() || xpb0Var.q != null) {
            b.g(serialDescriptor, 16, auu0.a, xpb0Var.q);
        }
        if (b.F() || xpb0Var.r != null) {
            b.g(serialDescriptor, 17, auu0.a, xpb0Var.r);
        }
        if (b.F() || xpb0Var.s != null) {
            b.g(serialDescriptor, 18, auu0.a, xpb0Var.s);
        }
        b.c(serialDescriptor);
    }
}
