package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ugx implements uxs {
    public static final ugx a;
    private static final SerialDescriptor descriptor;

    static {
        ugx ugxVar = new ugx();
        a = ugxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.KeepAliveServiceBehaviorExperiment", ugxVar, 4);
        pluginGeneratedSerialDescriptor.j("do_not_stop_service_on_app_resume", true);
        pluginGeneratedSerialDescriptor.j("start_service_only_as_foreground", true);
        pluginGeneratedSerialDescriptor.j("restrict_start_service_for_push_handling_to", true);
        pluginGeneratedSerialDescriptor.j("metrica_tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ygx.f;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ygx.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            } else if (v == 2) {
                list3 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ygx(i, str, list, list2, list3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ygx ygxVar = (ygx) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ygx.f;
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(ygxVar.b, emptyList)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), ygxVar.b);
        }
        if (b.F() || !jl40.l(ygxVar.c, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ygxVar.c);
        }
        if (b.F() || !jl40.l(ygxVar.d, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), ygxVar.d);
        }
        if (b.F() || !jl40.l(ygxVar.e, "")) {
            b.o(serialDescriptor, 3, ygxVar.e);
        }
        b.c(serialDescriptor);
    }
}
