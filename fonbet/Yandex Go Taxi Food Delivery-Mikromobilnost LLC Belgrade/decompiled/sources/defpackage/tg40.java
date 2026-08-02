package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class tg40 implements uxs {
    public static final tg40 a;
    private static final SerialDescriptor descriptor;

    static {
        tg40 tg40Var = new tg40();
        a = tg40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainSchedulerDateButtonBarDto", tg40Var, 3);
        pluginGeneratedSerialDescriptor.j("selected_button_id", true);
        pluginGeneratedSerialDescriptor.j("action_button", true);
        pluginGeneratedSerialDescriptor.j("date_buttons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(oe40.a), vg40.d[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = vg40.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        qe40 qe40Var = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                qe40Var = (qe40) b.s(serialDescriptor, 1, oe40.a, qe40Var);
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
        return new vg40(i, str, qe40Var, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vg40 vg40Var = (vg40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = vg40.d;
        if (b.F() || !jl40.l(vg40Var.a, "")) {
            b.o(serialDescriptor, 0, vg40Var.a);
        }
        if (b.F() || vg40Var.b != null) {
            b.g(serialDescriptor, 1, oe40.a, vg40Var.b);
        }
        if (b.F() || !jl40.l(vg40Var.c, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), vg40Var.c);
        }
        b.c(serialDescriptor);
    }
}
