package androidx.media3.extractor.ts;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.VorbisBitArray;
import androidx.tracing.Trace;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.util.clock.AndroidClock;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class MpeghUtil {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAfterpayHub.deepLinkSpecs;
    }

    public static int readEscapedIntValue(VorbisBitArray vorbisBitArray, int i, int i2, int i3) {
        Trace.checkArgument(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        Math.addExact(Math.addExact(i4, i5), 1 << i3);
        if (vorbisBitArray.bitsLeft() < i) {
            return -1;
        }
        int readBits = vorbisBitArray.readBits(i);
        if (readBits == i4) {
            if (vorbisBitArray.bitsLeft() < i2) {
                return -1;
            }
            int readBits2 = vorbisBitArray.readBits(i2);
            readBits += readBits2;
            if (readBits2 == i5) {
                if (vorbisBitArray.bitsLeft() < i3) {
                    return -1;
                }
                return vorbisBitArray.readBits(i3) + readBits;
            }
        }
        return readBits;
    }

    public static void skipSbrConfig(VorbisBitArray vorbisBitArray) {
        vorbisBitArray.skipBits(3);
        vorbisBitArray.skipBits(8);
        boolean readBit = vorbisBitArray.readBit();
        boolean readBit2 = vorbisBitArray.readBit();
        if (readBit) {
            vorbisBitArray.skipBits(5);
        }
        if (readBit2) {
            vorbisBitArray.skipBits(6);
        }
    }

    public static void skipSpeakerConfig3d(VorbisBitArray vorbisBitArray) {
        int readBits;
        int readBits2 = vorbisBitArray.readBits(2);
        if (readBits2 == 0) {
            vorbisBitArray.skipBits(6);
            return;
        }
        int readEscapedIntValue = readEscapedIntValue(vorbisBitArray, 5, 8, 16) + 1;
        if (readBits2 == 1) {
            vorbisBitArray.skipBits(readEscapedIntValue * 7);
            return;
        }
        if (readBits2 == 2) {
            boolean readBit = vorbisBitArray.readBit();
            int i = readBit ? 1 : 5;
            int i2 = readBit ? 7 : 5;
            int i3 = readBit ? 8 : 6;
            int i4 = 0;
            while (i4 < readEscapedIntValue) {
                if (vorbisBitArray.readBit()) {
                    vorbisBitArray.skipBits(7);
                    readBits = 0;
                } else {
                    if (vorbisBitArray.readBits(2) == 3 && vorbisBitArray.readBits(i2) * i != 0) {
                        vorbisBitArray.skipBit();
                    }
                    readBits = vorbisBitArray.readBits(i3) * i;
                    if (readBits != 0 && readBits != 180) {
                        vorbisBitArray.skipBit();
                    }
                    vorbisBitArray.skipBit();
                }
                if (readBits != 0 && readBits != 180 && vorbisBitArray.readBit()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static final String subtitle(SupportPhoneStatus supportPhoneStatus, AndroidStringManager androidStringManager, AndroidDateFormatManager androidDateFormatManager, AndroidClock androidClock) {
        String format2;
        supportPhoneStatus.getClass();
        if (!(supportPhoneStatus instanceof SupportPhoneStatus.IsEligible)) {
            return null;
        }
        SupportPhoneStatus.IsEligible isEligible = (SupportPhoneStatus.IsEligible) supportPhoneStatus;
        if (isEligible.getAvailability().isAvailable) {
            return null;
        }
        Instant instant = isEligible.getAvailability().nextAvailableTimestamp;
        if (instant == null) {
            return androidStringManager.get(R.string.support_home_phone_button_text_service_unavailable);
        }
        ZoneId of = ZoneId.of(androidClock.timeZone().getID());
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(androidClock.millis()), of).toLocalDate();
        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(instant, of);
        boolean areEqual = Intrinsics.areEqual(ofInstant.toLocalDate(), localDate);
        AndroidClock androidClock2 = androidDateFormatManager.clock;
        if (areEqual) {
            format2 = androidDateFormatManager.getDateFormat("hma", androidClock2.timeZone()).formatter.format(ofInstant);
            format2.getClass();
        } else {
            format2 = androidDateFormatManager.getDateFormat("hma E", androidClock2.timeZone()).formatter.format(ofInstant);
            format2.getClass();
        }
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.support_home_phone_button_text_service_unavailable_available_at)).format(new Object[]{format2});
        format3.getClass();
        return format3;
    }

    public final class MhasPacketHeader implements SniffFailure {
        public final /* synthetic */ int $r8$classId = 0;
        public long packetLabel;
        public int packetLength;
        public int packetType;

        public MhasPacketHeader(int i, int i2, long j) {
            this.packetType = i;
            this.packetLabel = j;
            this.packetLength = i2;
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 1:
                    StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                    int i = this.packetType;
                    String str = Util.DEVICE_DEBUG_INFO;
                    sb.append(new String(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i}, StandardCharsets.US_ASCII));
                    sb.append(", size=");
                    sb.append(this.packetLabel);
                    sb.append(", minHeaderSize=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.packetLength, "}", sb);
                default:
                    return super.toString();
            }
        }

        public /* synthetic */ MhasPacketHeader() {
        }
    }
}
