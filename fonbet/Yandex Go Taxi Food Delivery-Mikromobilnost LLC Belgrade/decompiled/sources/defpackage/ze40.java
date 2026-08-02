package defpackage;

import defpackage.qe40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ze40 implements uxs {
    public static final ze40 a;
    private static final SerialDescriptor descriptor;

    static {
        ze40 ze40Var = new ze40();
        a = ze40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainDateSelectorDto.ShowCalendar", ze40Var, 1);
        pluginGeneratedSerialDescriptor.j("date_picker", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(te40.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        qe40.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                bVar = (qe40.b) b.s(serialDescriptor, 0, te40.a, bVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new qe40.d(i, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qe40.d dVar = (qe40.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || dVar.a != null) {
            b.g(serialDescriptor, 0, te40.a, dVar.a);
        }
        b.c(serialDescriptor);
    }
}
