package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.settings.api.dto.settings.types.SectionStyle;

/* loaded from: classes6.dex */
public final /* synthetic */ class x0q0 implements uxs {
    public static final x0q0 a;
    private static final SerialDescriptor descriptor;

    static {
        x0q0 x0q0Var = new x0q0();
        a = x0q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.api.dto.settings.SectionDto", x0q0Var, 3);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("items", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = z0q0.d;
        return new KSerializer[]{qke.n(auu0.a), i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = z0q0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        SectionStyle sectionStyle = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                sectionStyle = (SectionStyle) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), sectionStyle);
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
        return new z0q0(i, str, sectionStyle, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z0q0 z0q0Var = (z0q0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = z0q0.d;
        if (b.F() || z0q0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, z0q0Var.a);
        }
        if (b.F() || z0q0Var.b != SectionStyle.UNKNOWN) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), z0q0Var.b);
        }
        if (b.F() || !jl40.l(z0q0Var.c, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), z0q0Var.c);
        }
        b.c(serialDescriptor);
    }
}
