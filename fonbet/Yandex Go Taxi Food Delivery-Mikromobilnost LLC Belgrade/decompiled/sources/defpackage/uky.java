package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.masstransit.geopayment.linkcard.network.model.LinkCardStatusResponse$LinkCardStatus;

/* loaded from: classes6.dex */
public final /* synthetic */ class uky implements uxs {
    public static final uky a;
    private static final SerialDescriptor descriptor;

    static {
        uky ukyVar = new uky();
        a = ukyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.linkcard.network.model.LinkCardStatusResponse", ukyVar, 1);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yky.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = yky.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        LinkCardStatusResponse$LinkCardStatus linkCardStatusResponse$LinkCardStatus = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                linkCardStatusResponse$LinkCardStatus = (LinkCardStatusResponse$LinkCardStatus) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), linkCardStatusResponse$LinkCardStatus);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new yky(i, linkCardStatusResponse$LinkCardStatus);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) yky.b[0].getValue(), ((yky) obj).a);
        b.c(serialDescriptor);
    }
}
