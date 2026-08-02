package ru.yandex.taxi.communications.api.dto.ticket;

import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.ticket.TicketOnShowFeature;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements uxs {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.ticket.TicketOnShowFeature", dVar, 1);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{TicketOnShowFeature.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TicketOnShowFeature.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        TicketOnShowFeature.TicketOnShowFeatureType ticketOnShowFeatureType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                ticketOnShowFeatureType = (TicketOnShowFeature.TicketOnShowFeatureType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), ticketOnShowFeatureType);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new TicketOnShowFeature(i, ticketOnShowFeatureType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TicketOnShowFeature ticketOnShowFeature = (TicketOnShowFeature) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TicketOnShowFeature.b;
        if (b.F() || ticketOnShowFeature.a != TicketOnShowFeature.TicketOnShowFeatureType.NONE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), ticketOnShowFeature.a);
        }
        b.c(serialDescriptor);
    }
}
