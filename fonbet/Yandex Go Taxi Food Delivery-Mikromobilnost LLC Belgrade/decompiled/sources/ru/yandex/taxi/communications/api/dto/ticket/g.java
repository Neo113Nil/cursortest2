package ru.yandex.taxi.communications.api.dto.ticket;

import defpackage.h6w;
import defpackage.i3y;
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
public final /* synthetic */ class g implements uxs {
    public static final g a;
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset.TicketTopAssetReplayConfig", gVar, 2);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h.c[0].getValue(), qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = h.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        TicketTopAsset.TicketTopAssetReplayMode ticketTopAssetReplayMode = null;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                ticketTopAssetReplayMode = (TicketTopAsset.TicketTopAssetReplayMode) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), ticketTopAssetReplayMode);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new h(i, ticketTopAssetReplayMode, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h hVar = (h) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) h.c[0].getValue();
        TicketTopAsset.TicketTopAssetReplayMode ticketTopAssetReplayMode = hVar.a;
        Integer num = hVar.b;
        b.e(serialDescriptor, 0, kSerializer, ticketTopAssetReplayMode);
        if (b.F() || num != null) {
            b.g(serialDescriptor, 1, h6w.a, num);
        }
        b.c(serialDescriptor);
    }
}
