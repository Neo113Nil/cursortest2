package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class WebvttParserUtil {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float parsePercentage(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long parseTimestampUs(String str) {
        String str2 = Util.DEVICE_DEBUG_INFO;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                a$$ExternalSyntheticBUOutline0.m$3("Expected 3 decimal places, got: ".concat(trim));
                return 0L;
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static void validateWebvttHeaderLine(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.position;
        Charset charset = StandardCharsets.UTF_8;
        String readLine = parsableByteArray.readLine(charset);
        if (readLine == null || !readLine.startsWith("WEBVTT")) {
            parsableByteArray.setPosition(i);
            throw ParserException.createForMalformedContainer(null, "Expected WEBVTT. Got " + parsableByteArray.readLine(charset));
        }
    }
}
