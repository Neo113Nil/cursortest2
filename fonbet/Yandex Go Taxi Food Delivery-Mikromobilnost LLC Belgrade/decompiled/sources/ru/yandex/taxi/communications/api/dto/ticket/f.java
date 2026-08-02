package ru.yandex.taxi.communications.api.dto.ticket;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements uxs {
    public static final f a;
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset", fVar, 3);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("replay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, TicketTopAsset.d[1].getValue(), qke.n(g.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TicketTopAsset.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        TicketTopAsset.TicketTopAssetType ticketTopAssetType = null;
        h hVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                ticketTopAssetType = (TicketTopAsset.TicketTopAssetType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), ticketTopAssetType);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                hVar = (h) b.s(serialDescriptor, 2, g.a, hVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new TicketTopAsset(i, str, ticketTopAssetType, hVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TicketTopAsset ticketTopAsset = (TicketTopAsset) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TicketTopAsset.d;
        if (b.F() || !jl40.l(ticketTopAsset.a, "")) {
            b.o(serialDescriptor, 0, ticketTopAsset.a);
        }
        if (b.F() || ticketTopAsset.b != TicketTopAsset.TicketTopAssetType.IMAGE) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ticketTopAsset.b);
        }
        if (b.F() || ticketTopAsset.c != null) {
            b.g(serialDescriptor, 2, g.a, ticketTopAsset.c);
        }
        b.c(serialDescriptor);
    }
}
