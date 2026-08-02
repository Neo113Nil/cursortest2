package ru.yandex.taxi.jobs.push;

import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.jobs.push.ToggleJobsExperiment;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.jobs.push.ToggleJobsExperiment.JobDto", bVar, 5);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("periodic_schedule_repeat_interval_minutes", true);
        pluginGeneratedSerialDescriptor.j("periodic_schedule_first_delay_minutes", true);
        pluginGeneratedSerialDescriptor.j("periodic_schedule_requires_charging", true);
        pluginGeneratedSerialDescriptor.j("periodic_schedule_requires_battery_not_low", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{ToggleJobsExperiment.a.f[0].getValue(), qke.n(pnzVar), qke.n(pnzVar), qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ToggleJobsExperiment.a.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        ToggleJobsExperiment.StateDto stateDto = null;
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                stateDto = (ToggleJobsExperiment.StateDto) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), stateDto);
                i |= 1;
            } else if (v == 1) {
                l = (Long) b.s(serialDescriptor, 1, pnz.a, l);
                i |= 2;
            } else if (v == 2) {
                l2 = (Long) b.s(serialDescriptor, 2, pnz.a, l2);
                i |= 4;
            } else if (v == 3) {
                bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bool2 = (Boolean) b.s(serialDescriptor, 4, z96.a, bool2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ToggleJobsExperiment.a(i, stateDto, l, l2, bool, bool2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ToggleJobsExperiment.a aVar = (ToggleJobsExperiment.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ToggleJobsExperiment.a.f;
        if (b.F() || aVar.a != ToggleJobsExperiment.StateDto.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, pnz.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, pnz.a, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, z96.a, aVar.d);
        }
        if (b.F() || aVar.e != null) {
            b.g(serialDescriptor, 4, z96.a, aVar.e);
        }
        b.c(serialDescriptor);
    }
}
