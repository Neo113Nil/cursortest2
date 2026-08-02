package defpackage;

import defpackage.z2z0;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.Calendar;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class v2z0 implements uxs {
    public static final v2z0 a;
    private static final SerialDescriptor descriptor;

    static {
        v2z0 v2z0Var = new v2z0();
        a = v2z0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.ticket.TicketTimer", v2z0Var, 5);
        pluginGeneratedSerialDescriptor.j("start_timer_date", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("time_text_color", true);
        pluginGeneratedSerialDescriptor.j(C0553n3.g, true);
        pluginGeneratedSerialDescriptor.j("message_after_end", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{vmt.a, auu0Var, auu0Var, auu0Var, x2z0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Calendar calendar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        z2z0.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                calendar = (Calendar) b.A(serialDescriptor, 0, vmt.a, calendar);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str3 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                aVar = (z2z0.a) b.A(serialDescriptor, 4, x2z0.a, aVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new z2z0(i, calendar, str, str2, str3, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z2z0 z2z0Var = (z2z0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(z2z0Var.a, Calendar.getInstance())) {
            b.e(serialDescriptor, 0, vmt.a, z2z0Var.a);
        }
        if (b.F() || !jl40.l(z2z0Var.b, "")) {
            b.o(serialDescriptor, 1, z2z0Var.b);
        }
        if (b.F() || !jl40.l(z2z0Var.c, "")) {
            b.o(serialDescriptor, 2, z2z0Var.c);
        }
        if (b.F() || !jl40.l(z2z0Var.d, "")) {
            b.o(serialDescriptor, 3, z2z0Var.d);
        }
        if (b.F() || !jl40.l(z2z0Var.e, new z2z0.a(0))) {
            b.e(serialDescriptor, 4, x2z0.a, z2z0Var.e);
        }
        b.c(serialDescriptor);
    }
}
