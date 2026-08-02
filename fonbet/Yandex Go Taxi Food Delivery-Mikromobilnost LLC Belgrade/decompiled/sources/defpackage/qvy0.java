package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class qvy0 implements uxs {
    public static final qvy0 a;
    private static final SerialDescriptor descriptor;

    static {
        qvy0 qvy0Var = new qvy0();
        a = qvy0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.themes.colors.experiments.ThemeConvertHexColorsExperiment", qvy0Var, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j(C0553n3.g, true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("control", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = uvy0.g;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = uvy0.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                list2 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
                i |= 4;
            } else if (v == 3) {
                list3 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list4 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new uvy0(i, z2, list, list2, list3, list4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uvy0 uvy0Var = (uvy0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = uvy0.g;
        if (b.F() || uvy0Var.b) {
            b.n(serialDescriptor, 0, uvy0Var.b);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(uvy0Var.c, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), uvy0Var.c);
        }
        if (b.F() || !jl40.l(uvy0Var.d, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), uvy0Var.d);
        }
        if (b.F() || !jl40.l(uvy0Var.e, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), uvy0Var.e);
        }
        if (b.F() || !jl40.l(uvy0Var.f, emptyList)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), uvy0Var.f);
        }
        b.c(serialDescriptor);
    }
}
