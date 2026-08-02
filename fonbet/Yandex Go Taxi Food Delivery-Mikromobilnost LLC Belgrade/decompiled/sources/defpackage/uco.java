package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

/* loaded from: classes10.dex */
public final /* synthetic */ class uco implements uxs {
    public static final uco a;
    private static final SerialDescriptor descriptor;

    static {
        uco ucoVar = new uco();
        a = ucoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.sdc.experiment.EulaConfigOverride", ucoVar, 7);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("accept_all_title", true);
        pluginGeneratedSerialDescriptor.j("accept_button", true);
        pluginGeneratedSerialDescriptor.j("complete_rules", true);
        pluginGeneratedSerialDescriptor.j(CRLDistributionPointsExtension.POINTS, true);
        pluginGeneratedSerialDescriptor.j("text_content", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = wco.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, qke.n(lzc.a), i3yVarArr[4].getValue(), auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wco.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        nzc nzcVar = null;
        List list = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    nzcVar = (nzc) b.s(serialDescriptor, 3, lzc.a, nzcVar);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.k(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    str5 = b.k(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new wco(i, str, str2, str3, nzcVar, list, str4, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wco wcoVar = (wco) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wco.h;
        if (b.F() || !jl40.l(wcoVar.a, "")) {
            b.o(serialDescriptor, 0, wcoVar.a);
        }
        if (b.F() || !jl40.l(wcoVar.b, "")) {
            b.o(serialDescriptor, 1, wcoVar.b);
        }
        if (b.F() || !jl40.l(wcoVar.c, "")) {
            b.o(serialDescriptor, 2, wcoVar.c);
        }
        if (b.F() || wcoVar.d != null) {
            b.g(serialDescriptor, 3, lzc.a, wcoVar.d);
        }
        if (b.F() || !jl40.l(wcoVar.e, EmptyList.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), wcoVar.e);
        }
        if (b.F() || !jl40.l(wcoVar.f, "")) {
            b.o(serialDescriptor, 5, wcoVar.f);
        }
        if (b.F() || !jl40.l(wcoVar.g, "")) {
            b.o(serialDescriptor, 6, wcoVar.g);
        }
        b.c(serialDescriptor);
    }
}
