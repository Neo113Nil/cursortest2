package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.ParsableByteArray;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class WebvttCssParser {
    public static final Pattern VOICE_NAME_PATTERN = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern FONT_SIZE_PATTERN = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final ParsableByteArray styleInput = new ParsableByteArray();
    public final StringBuilder stringBuilder = new StringBuilder();

    public static String parseIdentifier(ParsableByteArray parsableByteArray, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = parsableByteArray.position;
        int i2 = parsableByteArray.limit;
        while (i < i2 && !z) {
            char c = (char) parsableByteArray.data[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        parsableByteArray.skipBytes(i - parsableByteArray.position);
        return sb.toString();
    }

    public static String parseNextToken(ParsableByteArray parsableByteArray, StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        String parseIdentifier = parseIdentifier(parsableByteArray, sb);
        if (!parseIdentifier.isEmpty()) {
            return parseIdentifier;
        }
        return "" + ((char) parsableByteArray.readUnsignedByte());
    }

    public static void skipWhitespaceAndComments(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z = true; parsableByteArray.bytesLeft() > 0 && z; z = false) {
                int i = parsableByteArray.position;
                byte[] bArr = parsableByteArray.data;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    parsableByteArray.skipBytes(1);
                } else {
                    int i2 = parsableByteArray.limit;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            parsableByteArray.skipBytes(i2 - parsableByteArray.position);
                        }
                    }
                }
            }
            return;
        }
    }
}
