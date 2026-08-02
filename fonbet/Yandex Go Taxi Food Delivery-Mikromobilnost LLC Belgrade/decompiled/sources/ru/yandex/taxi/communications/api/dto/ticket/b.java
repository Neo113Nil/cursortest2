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
import ru.yandex.taxi.communications.api.dto.ticket.TicketBottomButton;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.ticket.TicketBottomButton", bVar, 1);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{TicketBottomButton.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TicketBottomButton.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        TicketBottomButton.TicketBottomButtonType ticketBottomButtonType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                ticketBottomButtonType = (TicketBottomButton.TicketBottomButtonType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), ticketBottomButtonType);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new TicketBottomButton(i, ticketBottomButtonType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TicketBottomButton ticketBottomButton = (TicketBottomButton) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TicketBottomButton.b;
        if (b.F() || ticketBottomButton.a != TicketBottomButton.TicketBottomButtonType.CLOSE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), ticketBottomButton.a);
        }
        b.c(serialDescriptor);
    }
}
