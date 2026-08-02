package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class uxb0 implements uxs {
    public static final uxb0 a;
    private static final SerialDescriptor descriptor;

    static {
        uxb0 uxb0Var = new uxb0();
        a = uxb0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.address.experiments.PinOverrideRule.VerticalOverride", uxb0Var, 3);
        pluginGeneratedSerialDescriptor.j("vertical_ids", true);
        pluginGeneratedSerialDescriptor.j("source_pin", true);
        pluginGeneratedSerialDescriptor.j("destination_on_map", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{wxb0.d[0].getValue(), qke.n(xdt0.a), qke.n(hzi.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wxb0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        zdt0 zdt0Var = null;
        jzi jziVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                zdt0Var = (zdt0) b.s(serialDescriptor, 1, xdt0.a, zdt0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                jziVar = (jzi) b.s(serialDescriptor, 2, hzi.a, jziVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new wxb0(i, list, zdt0Var, jziVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wxb0 wxb0Var = (wxb0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wxb0.d;
        if (b.F() || !jl40.l(wxb0Var.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), wxb0Var.a);
        }
        if (b.F() || wxb0Var.b != null) {
            b.g(serialDescriptor, 1, xdt0.a, wxb0Var.b);
        }
        if (b.F() || wxb0Var.c != null) {
            b.g(serialDescriptor, 2, hzi.a, wxb0Var.c);
        }
        b.c(serialDescriptor);
    }
}
