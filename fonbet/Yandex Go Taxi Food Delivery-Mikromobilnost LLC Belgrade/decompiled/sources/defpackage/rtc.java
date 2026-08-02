package defpackage;

import defpackage.utc;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class rtc implements uxs {
    public static final rtc a;
    private static final SerialDescriptor descriptor;

    static {
        rtc rtcVar = new rtc();
        a = rtcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.CommunicationsParam.ApplicationState", rtcVar, 12);
        pluginGeneratedSerialDescriptor.j("accuracy", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("point_a", true);
        pluginGeneratedSerialDescriptor.j("current_mode", true);
        pluginGeneratedSerialDescriptor.j("user_action", true);
        pluginGeneratedSerialDescriptor.j("order_id", true);
        pluginGeneratedSerialDescriptor.j("fields", true);
        pluginGeneratedSerialDescriptor.j("nz", true);
        pluginGeneratedSerialDescriptor.j("selected_class", true);
        pluginGeneratedSerialDescriptor.j("multiclass_options", true);
        pluginGeneratedSerialDescriptor.j("payment_method", true);
        pluginGeneratedSerialDescriptor.j("active_screen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = utc.a.m;
        KSerializer n = qke.n(h6w.a);
        KSerializer n2 = qke.n(b0t.a);
        KSerializer n3 = qke.n(wtc.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[6].getValue()), qke.n(auu0Var), qke.n(auu0Var), qke.n(ytc.a), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        Integer num;
        String str;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = utc.a.m;
        b.getClass();
        String str2 = null;
        String str3 = null;
        utc.a.c cVar = null;
        String str4 = null;
        boolean z2 = true;
        String str5 = null;
        int i = 0;
        Integer num2 = null;
        zzs zzsVar = null;
        utc.a.b bVar = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List list = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str = str2;
                    z2 = false;
                    str2 = str;
                case 0:
                    str = str2;
                    num2 = (Integer) b.s(serialDescriptor, 0, h6w.a, num2);
                    i |= 1;
                    z2 = z2;
                    str2 = str;
                case 1:
                    z = z2;
                    num = num2;
                    zzsVar = (zzs) b.s(serialDescriptor, 1, b0t.a, zzsVar);
                    i |= 2;
                    z2 = z;
                    num2 = num;
                case 2:
                    z = z2;
                    num = num2;
                    bVar = (utc.a.b) b.s(serialDescriptor, 2, wtc.a, bVar);
                    i |= 4;
                    z2 = z;
                    num2 = num;
                case 3:
                    z = z2;
                    num = num2;
                    str6 = (String) b.s(serialDescriptor, 3, auu0.a, str6);
                    i |= 8;
                    z2 = z;
                    num2 = num;
                case 4:
                    z = z2;
                    num = num2;
                    str7 = (String) b.s(serialDescriptor, 4, auu0.a, str7);
                    i |= 16;
                    z2 = z;
                    num2 = num;
                case 5:
                    z = z2;
                    num = num2;
                    str8 = (String) b.s(serialDescriptor, 5, auu0.a, str8);
                    i |= 32;
                    z2 = z;
                    num2 = num;
                case 6:
                    z = z2;
                    num = num2;
                    list = (List) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list);
                    i |= 64;
                    z2 = z;
                    num2 = num;
                case 7:
                    z = z2;
                    num = num2;
                    str5 = (String) b.s(serialDescriptor, 7, auu0.a, str5);
                    i |= 128;
                    z2 = z;
                    num2 = num;
                case 8:
                    z = z2;
                    num = num2;
                    str4 = (String) b.s(serialDescriptor, 8, auu0.a, str4);
                    i |= 256;
                    z2 = z;
                    num2 = num;
                case 9:
                    z = z2;
                    num = num2;
                    cVar = (utc.a.c) b.s(serialDescriptor, 9, ytc.a, cVar);
                    i |= 512;
                    z2 = z;
                    num2 = num;
                case 10:
                    z = z2;
                    num = num2;
                    str3 = (String) b.s(serialDescriptor, 10, auu0.a, str3);
                    i |= 1024;
                    z2 = z;
                    num2 = num;
                case 11:
                    z = z2;
                    num = num2;
                    str2 = (String) b.s(serialDescriptor, 11, auu0.a, str2);
                    i |= 2048;
                    z2 = z;
                    num2 = num;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new utc.a(i, num2, zzsVar, bVar, str6, str7, str8, list, str5, str4, cVar, str3, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        utc.a aVar = (utc.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = utc.a.m;
        if (b.F() || aVar.a != null) {
            b.g(serialDescriptor, 0, h6w.a, aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, b0t.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, wtc.a, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, aVar.d);
        }
        if (b.F() || aVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, aVar.e);
        }
        if (b.F() || aVar.f != null) {
            b.g(serialDescriptor, 5, auu0.a, aVar.f);
        }
        if (b.F() || aVar.g != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), aVar.g);
        }
        if (b.F() || aVar.h != null) {
            b.g(serialDescriptor, 7, auu0.a, aVar.h);
        }
        if (b.F() || aVar.i != null) {
            b.g(serialDescriptor, 8, auu0.a, aVar.i);
        }
        if (b.F() || aVar.j != null) {
            b.g(serialDescriptor, 9, ytc.a, aVar.j);
        }
        if (b.F() || aVar.k != null) {
            b.g(serialDescriptor, 10, auu0.a, aVar.k);
        }
        if (b.F() || aVar.l != null) {
            b.g(serialDescriptor, 11, auu0.a, aVar.l);
        }
        b.c(serialDescriptor);
    }
}
