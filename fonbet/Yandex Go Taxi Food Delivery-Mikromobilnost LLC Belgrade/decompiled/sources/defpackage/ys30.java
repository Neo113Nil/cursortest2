package defpackage;

import com.adjust.sdk.Constants;
import defpackage.qs30;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ys30 implements uxs {
    public static final ys30 a;
    private static final SerialDescriptor descriptor;

    static {
        ys30 ys30Var = new ys30();
        a = ys30Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.experiment.purchase_availability.MtPurchaseAvailabilityConfigDto.ShowPolicyDto", ys30Var, 3);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("allowed_scenario", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(os30.a), qke.n(auu0.a), qs30.e.d[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qs30.e.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        qs30.a aVar = null;
        String str = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aVar = (qs30.a) b.s(serialDescriptor, 0, os30.a, aVar);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new qs30.e(i, aVar, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qs30.e eVar = (qs30.e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qs30.e.d;
        if (b.F() || eVar.a != null) {
            b.g(serialDescriptor, 0, os30.a, eVar.a);
        }
        if (b.F() || eVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, eVar.b);
        }
        if (b.F() || !jl40.l(eVar.c, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), eVar.c);
        }
        b.c(serialDescriptor);
    }
}
