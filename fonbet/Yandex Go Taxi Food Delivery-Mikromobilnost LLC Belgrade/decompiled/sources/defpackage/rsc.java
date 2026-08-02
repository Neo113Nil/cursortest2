package defpackage;

import com.yandex.delivery.mapper.model.ForwardingId;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.CommunicationMethodDto;

/* loaded from: classes.dex */
public final class rsc {
    public static psc a(CommunicationMethodDto communicationMethodDto) {
        ForwardingId forwardingId;
        if (communicationMethodDto instanceof CommunicationMethodDto.CommunicationMethod_DirectPhoneCallDto) {
            return new msc(new hfb0(((CommunicationMethodDto.CommunicationMethod_DirectPhoneCallDto) communicationMethodDto).b.getPhoneNumber()));
        }
        if (!(communicationMethodDto instanceof CommunicationMethodDto.CommunicationMethod_VoiceForwardingCallDto)) {
            if (communicationMethodDto instanceof CommunicationMethodDto.Unknown_CommunicationMethodDto) {
                return nsc.a;
            }
            w511.b();
            return null;
        }
        int i = qsc.a[((CommunicationMethodDto.CommunicationMethod_VoiceForwardingCallDto) communicationMethodDto).b.getForwardingId().ordinal()];
        if (i == 1) {
            forwardingId = ForwardingId.PERFORMER;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            forwardingId = ForwardingId.INAPP;
        }
        return new osc(forwardingId);
    }
}
