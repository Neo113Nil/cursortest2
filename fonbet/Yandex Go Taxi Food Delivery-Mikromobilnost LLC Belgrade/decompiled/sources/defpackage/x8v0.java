package defpackage;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class x8v0 implements uxs {
    public static final x8v0 a;
    private static final SerialDescriptor descriptor;

    static {
        x8v0 x8v0Var = new x8v0();
        a = x8v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.zerosuggest.SuggestV2ResultItemAddress", x8v0Var, 9);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("log", true);
        pluginGeneratedSerialDescriptor.j("distance", true);
        pluginGeneratedSerialDescriptor.j("point_id", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        KSerializer n = qke.n(w7sVar);
        KSerializer n2 = qke.n(w7sVar);
        KSerializer n3 = qke.n(c7v.a);
        KSerializer n4 = qke.n(sl2.e);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, n4, auu0Var, qke.n(r1k.a), qke.n(auu0Var), qke.n(b0t.a), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        n7v n7vVar = null;
        rl2 rl2Var = null;
        String str2 = null;
        t1k t1kVar = null;
        String str3 = null;
        zzs zzsVar = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    n7vVar = (n7v) b.s(serialDescriptor, 2, c7v.a, n7vVar);
                    i |= 4;
                    break;
                case 3:
                    rl2Var = (rl2) b.s(serialDescriptor, 3, sl2.e, rl2Var);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    t1kVar = (t1k) b.s(serialDescriptor, 5, r1k.a, t1kVar);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) b.s(serialDescriptor, 6, auu0.a, str3);
                    i |= 64;
                    break;
                case 7:
                    zzsVar = (zzs) b.s(serialDescriptor, 7, b0t.a, zzsVar);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new z8v0(i, formattedText, formattedText2, n7vVar, rl2Var, str2, t1kVar, str3, zzsVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z8v0 z8v0Var = (z8v0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || z8v0Var.a != null) {
            b.g(serialDescriptor, 0, w7s.a, z8v0Var.a);
        }
        if (b.F() || z8v0Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, z8v0Var.b);
        }
        if (b.F() || z8v0Var.c != null) {
            b.g(serialDescriptor, 2, c7v.a, z8v0Var.c);
        }
        if (b.F() || z8v0Var.d != null) {
            b.g(serialDescriptor, 3, sl2.e, z8v0Var.d);
        }
        if (b.F() || !jl40.l(z8v0Var.e, "")) {
            b.o(serialDescriptor, 4, z8v0Var.e);
        }
        if (b.F() || z8v0Var.f != null) {
            b.g(serialDescriptor, 5, r1k.a, z8v0Var.f);
        }
        if (b.F() || z8v0Var.g != null) {
            b.g(serialDescriptor, 6, auu0.a, z8v0Var.g);
        }
        if (b.F() || z8v0Var.h != null) {
            b.g(serialDescriptor, 7, b0t.a, z8v0Var.h);
        }
        if (b.F() || z8v0Var.i != null) {
            b.g(serialDescriptor, 8, auu0.a, z8v0Var.i);
        }
        b.c(serialDescriptor);
    }
}
