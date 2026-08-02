package ru.yandex.video.m3.player.report.format;

import defpackage.b64;
import defpackage.j73;
import defpackage.w511;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.yandex.video.m3.player.report.dto.Record;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\f\u0010\u000b\u001a\u00020\u0007*\u00020\fH\u0002J\u0014\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\u00070\u0007*\u00020\u000fH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/report/format/RecordFormatterImpl;", "Lru/yandex/video/m3/player/report/format/RecordFormatter;", "()V", "format", "Ljava/text/SimpleDateFormat;", "getFormat", "()Ljava/text/SimpleDateFormat;", "", "Lru/yandex/video/m3/player/report/format/FormattedRecord;", "record", "Lru/yandex/video/m3/player/report/dto/Record;", "formatDetails", "Lru/yandex/video/m3/player/report/dto/Record$SpanLog;", "timeMsFormat", "kotlin.jvm.PlatformType", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RecordFormatterImpl implements RecordFormatter {
    public static final int $stable = 8;
    private final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss", Locale.ROOT);

    private final String formatDetails(Record.SpanLog spanLog) {
        String str = "duration=" + spanLog.getDurationMs() + " ms";
        String interruptionReason = spanLog.getInterruptionReason();
        return a.X(j73.A(new String[]{str, interruptionReason != null ? "interrupted by ".concat(interruptionReason) : null}), null, null, null, null, 63);
    }

    private final String timeMsFormat(long j) {
        return this.format.format(new Date(j));
    }

    @Override // ru.yandex.video.m3.player.report.format.RecordFormatter
    public String format(Record record) {
        if (record instanceof Record.Assert) {
            StringBuilder sb = new StringBuilder();
            sb.append(timeMsFormat(record.getTimestampMs()));
            sb.append(HexString.CHAR_SPACE);
            Record.Assert r6 = (Record.Assert) record;
            sb.append(r6.getTag());
            sb.append(Extension.COLON_SPACE);
            sb.append(r6.getMessage());
            return sb.toString();
        }
        if (record instanceof Record.Error) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(timeMsFormat(record.getTimestampMs()));
            sb2.append(HexString.CHAR_SPACE);
            Record.Error error = (Record.Error) record;
            sb2.append(error.getTag());
            sb2.append('$');
            sb2.append(error.getRegion());
            sb2.append(Extension.COLON_SPACE);
            sb2.append(error.getError().getClass().getName());
            sb2.append(HexString.CHAR_SPACE);
            sb2.append(error.getError().getMessage());
            return sb2.toString();
        }
        if (record instanceof Record.BasicLog) {
            return timeMsFormat(record.getTimestampMs()) + Extension.COLON_SPACE + ((Record.BasicLog) record).getMessage();
        }
        if (!(record instanceof Record.SpanLog)) {
            w511.b();
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        Record.SpanLog spanLog = (Record.SpanLog) record;
        sb3.append(timeMsFormat(spanLog.getStartMs()));
        sb3.append(LicenseUtility.SEPARATOR);
        sb3.append(timeMsFormat(spanLog.getEndMs()));
        sb3.append(Extension.COLON_SPACE);
        sb3.append(spanLog.getRegion());
        sb3.append(Extension.O_BRAKE_SPACE);
        return b64.p(sb3, formatDetails(spanLog), ')');
    }

    public final SimpleDateFormat getFormat() {
        return this.format;
    }
}
