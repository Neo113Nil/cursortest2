package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$Severity;
import com.squareup.cash.support.viewmodels.SupportNotification;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class TsUtil {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewAfterpayInAppBrowser.deepLinkSpecs;
    }

    public static long readPcrFromPacket(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.setPosition(i);
        if (parsableByteArray.bytesLeft() < 5) {
            return -9223372036854775807L;
        }
        int readInt = parsableByteArray.readInt();
        if ((8388608 & readInt) != 0 || ((2096896 & readInt) >> 8) != i2 || (readInt & 32) == 0 || parsableByteArray.readUnsignedByte() < 7 || parsableByteArray.bytesLeft() < 7 || (parsableByteArray.readUnsignedByte() & 16) != 16) {
            return -9223372036854775807L;
        }
        parsableByteArray.readBytes(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static final SupportNotification toNotification(Incident incident) {
        IncidentViewModel$Severity incidentViewModel$Severity;
        incident.getClass();
        String str = incident.title;
        String str2 = incident.details;
        String str3 = incident.id;
        int ordinal = incident.status.ordinal();
        if (ordinal == 0) {
            incidentViewModel$Severity = IncidentViewModel$Severity.ERROR;
        } else if (ordinal == 1) {
            incidentViewModel$Severity = IncidentViewModel$Severity.INFO;
        } else if (ordinal == 2) {
            incidentViewModel$Severity = IncidentViewModel$Severity.RESOLVED;
        } else {
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            incidentViewModel$Severity = IncidentViewModel$Severity.INFO;
        }
        return new SupportNotification(str, str2, new SupportNotification.Trigger.Incident(str3, incidentViewModel$Severity), false);
    }
}
