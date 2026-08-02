package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class siz implements tiz {
    public final String a;
    public final LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId b;

    public siz(String str, LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId) {
        this.a = str;
        this.b = logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId;
    }

    public final String a() {
        return this.a;
    }

    public final LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof siz)) {
            return false;
        }
        siz sizVar = (siz) obj;
        return this.a.equals(sizVar.a) && this.b == sizVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VoiceForwardingCall(deliveryId=" + this.a + ", forwardingId=" + this.b + Extension.C_BRAKE;
    }
}
