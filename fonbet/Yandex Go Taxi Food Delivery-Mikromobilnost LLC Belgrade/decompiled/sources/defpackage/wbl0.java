package defpackage;

import com.yandex.go.zone.dto.objects.VerticalType;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class wbl0 implements uxs {
    public static final wbl0 a;
    private static final SerialDescriptor descriptor;

    static {
        wbl0 wbl0Var = new wbl0();
        a = wbl0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.RouteStatsVertical", wbl0Var, 14);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("class", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("title_summary", true);
        pluginGeneratedSerialDescriptor.j("tariffs", true);
        pluginGeneratedSerialDescriptor.j("default_tariff", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("header_icon", true);
        pluginGeneratedSerialDescriptor.j("header_title", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j("multiclass", true);
        pluginGeneratedSerialDescriptor.j("trap_only", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ybl0.o;
        auu0 auu0Var = auu0.a;
        c7v c7vVar = c7v.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue(), auu0Var, auu0Var, i3yVarArr[5].getValue(), qke.n(auu0Var), qke.n(c7vVar), qke.n(c7vVar), qke.n(c7vVar), qke.n(auu0Var), qke.n(auu0Var), qke.n(zbl0.a), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ybl0.o;
        b.getClass();
        String str4 = null;
        String str5 = null;
        n7v n7vVar = null;
        n7v n7vVar2 = null;
        bcl0 bcl0Var = null;
        n7v n7vVar3 = null;
        int i = 0;
        Boolean bool = null;
        String str6 = null;
        VerticalType verticalType = null;
        String str7 = null;
        String str8 = null;
        List list = null;
        String str9 = null;
        boolean z = true;
        String str10 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str = str7;
                    z = false;
                    str7 = str;
                case 0:
                    str2 = str6;
                    str = str7;
                    str10 = b.k(serialDescriptor, 0);
                    i |= 1;
                    str6 = str2;
                    str7 = str;
                case 1:
                    str = str7;
                    i |= 2;
                    str6 = b.k(serialDescriptor, 1);
                    str7 = str;
                case 2:
                    str2 = str6;
                    str = str7;
                    verticalType = (VerticalType) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), verticalType);
                    i |= 4;
                    str6 = str2;
                    str7 = str;
                case 3:
                    str3 = str6;
                    str7 = b.k(serialDescriptor, 3);
                    i |= 8;
                    str6 = str3;
                case 4:
                    str3 = str6;
                    str8 = b.k(serialDescriptor, 4);
                    i |= 16;
                    str6 = str3;
                case 5:
                    str2 = str6;
                    str = str7;
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    str6 = str2;
                    str7 = str;
                case 6:
                    str2 = str6;
                    str = str7;
                    str9 = (String) b.s(serialDescriptor, 6, auu0.a, str9);
                    i |= 64;
                    str6 = str2;
                    str7 = str;
                case 7:
                    str2 = str6;
                    str = str7;
                    n7vVar3 = (n7v) b.s(serialDescriptor, 7, c7v.a, n7vVar3);
                    i |= 128;
                    str6 = str2;
                    str7 = str;
                case 8:
                    str2 = str6;
                    str = str7;
                    n7vVar2 = (n7v) b.s(serialDescriptor, 8, c7v.a, n7vVar2);
                    i |= 256;
                    str6 = str2;
                    str7 = str;
                case 9:
                    str2 = str6;
                    str = str7;
                    n7vVar = (n7v) b.s(serialDescriptor, 9, c7v.a, n7vVar);
                    i |= 512;
                    str6 = str2;
                    str7 = str;
                case 10:
                    str2 = str6;
                    str = str7;
                    str5 = (String) b.s(serialDescriptor, 10, auu0.a, str5);
                    i |= 1024;
                    str6 = str2;
                    str7 = str;
                case 11:
                    str2 = str6;
                    str = str7;
                    str4 = (String) b.s(serialDescriptor, 11, auu0.a, str4);
                    i |= 2048;
                    str6 = str2;
                    str7 = str;
                case 12:
                    str2 = str6;
                    str = str7;
                    bcl0Var = (bcl0) b.s(serialDescriptor, 12, zbl0.a, bcl0Var);
                    i |= 4096;
                    str6 = str2;
                    str7 = str;
                case 13:
                    str2 = str6;
                    str = str7;
                    bool = (Boolean) b.s(serialDescriptor, 13, z96.a, bool);
                    i |= 8192;
                    str6 = str2;
                    str7 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ybl0(i, str10, str6, verticalType, str7, str8, list, str9, n7vVar3, n7vVar2, n7vVar, str5, str4, bcl0Var, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ybl0 ybl0Var = (ybl0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ybl0.o;
        if (b.F() || !jl40.l(ybl0Var.a, "")) {
            b.o(serialDescriptor, 0, ybl0Var.a);
        }
        if (b.F() || !jl40.l(ybl0Var.b, "")) {
            b.o(serialDescriptor, 1, ybl0Var.b);
        }
        if (b.F() || ybl0Var.c != VerticalType.NONE) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), ybl0Var.c);
        }
        if (b.F() || !jl40.l(ybl0Var.d, "")) {
            b.o(serialDescriptor, 3, ybl0Var.d);
        }
        if (b.F() || !jl40.l(ybl0Var.e, "")) {
            b.o(serialDescriptor, 4, ybl0Var.e);
        }
        if (b.F() || !jl40.l(ybl0Var.f, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), ybl0Var.f);
        }
        if (b.F() || ybl0Var.g != null) {
            b.g(serialDescriptor, 6, auu0.a, ybl0Var.g);
        }
        if (b.F() || ybl0Var.h != null) {
            b.g(serialDescriptor, 7, c7v.a, ybl0Var.h);
        }
        if (b.F() || ybl0Var.i != null) {
            b.g(serialDescriptor, 8, c7v.a, ybl0Var.i);
        }
        if (b.F() || ybl0Var.j != null) {
            b.g(serialDescriptor, 9, c7v.a, ybl0Var.j);
        }
        if (b.F() || ybl0Var.k != null) {
            b.g(serialDescriptor, 10, auu0.a, ybl0Var.k);
        }
        if (b.F() || ybl0Var.l != null) {
            b.g(serialDescriptor, 11, auu0.a, ybl0Var.l);
        }
        if (b.F() || ybl0Var.m != null) {
            b.g(serialDescriptor, 12, zbl0.a, ybl0Var.m);
        }
        if (b.F() || ybl0Var.n != null) {
            b.g(serialDescriptor, 13, z96.a, ybl0Var.n);
        }
        b.c(serialDescriptor);
    }
}
