package com.bugsnag.android.internal;

import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.CharsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class JsonCollectionParser {
    public static final char[] ESCAPE_CHARS;
    public static final boolean[] VALID_ESCAPES;
    public static final boolean[] WHITESPACE;
    public final InputStream input;
    public long position;
    public int current = -1;
    public final StringBuilder stringBuilder = new StringBuilder();

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/bugsnag/android/internal/JsonCollectionParser$JsonParseException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "bugsnag-android-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class JsonParseException extends Exception {
    }

    static {
        boolean[] zArr = new boolean[128];
        zArr[32] = true;
        zArr[9] = true;
        zArr[10] = true;
        zArr[13] = true;
        WHITESPACE = zArr;
        boolean[] zArr2 = new boolean[128];
        zArr2[34] = true;
        zArr2[92] = true;
        zArr2[47] = true;
        zArr2[98] = true;
        zArr2[102] = true;
        zArr2[110] = true;
        zArr2[114] = true;
        zArr2[116] = true;
        zArr2[117] = true;
        VALID_ESCAPES = zArr2;
        char[] cArr = new char[128];
        cArr[34] = '\"';
        cArr[92] = '\\';
        cArr[47] = '/';
        cArr[98] = '\b';
        cArr[102] = '\f';
        cArr[110] = '\n';
        cArr[114] = '\r';
        cArr[116] = '\t';
        ESCAPE_CHARS = cArr;
    }

    public JsonCollectionParser(InputStream inputStream) {
        this.input = inputStream;
        advance();
    }

    public final void advance() {
        int read = this.input.read();
        this.current = read;
        if (read != -1) {
            this.position++;
        }
    }

    public final void expect(int i) {
        if (this.current == i) {
            advance();
            return;
        }
        StringBuilder sb = new StringBuilder("Expected '");
        sb.append((char) i);
        sb.append("' but got '");
        int i2 = this.current;
        sb.append(i2 == -1 ? "EOF" : Character.valueOf((char) i2));
        sb.append("' at position ");
        sb.append(this.position);
        throw new JsonParseException(sb.toString());
    }

    public final Serializable parse() {
        Serializable parseValue = parseValue();
        skipWhitespace();
        if (this.current == -1) {
            return parseValue;
        }
        throw new JsonParseException("Unexpected content after JSON at position " + this.position);
    }

    public final Boolean parseKeyword(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (this.current != str.charAt(i)) {
                StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Expected '", str, "' at position ");
                m3m.append(this.position);
                throw new JsonParseException(m3m.toString());
            }
            advance();
        }
        int hashCode = str.hashCode();
        if (hashCode != 3392903) {
            if (hashCode != 3569038) {
                if (hashCode == 97196323 && str.equals("false")) {
                    return Boolean.FALSE;
                }
            } else if (str.equals("true")) {
                return Boolean.TRUE;
            }
        } else if (str.equals("null")) {
            return null;
        }
        throw new JsonParseException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Unknown keyword '", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ce, code lost:
    
        expect(34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d5, code lost:
    
        return r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a3, code lost:
    
        throw new com.bugsnag.android.internal.JsonCollectionParser.JsonParseException("Invalid escape sequence at position " + r8.position);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String parseString() {
        expect(34);
        StringBuilder sb = this.stringBuilder;
        sb.setLength(0);
        loop0: while (true) {
            int i = this.current;
            if (i == -1 || i == 34) {
                break;
            }
            if (i != 92) {
                int readUtf8Char = readUtf8Char();
                if (readUtf8Char == -1) {
                    break;
                }
                if (readUtf8Char <= 65535) {
                    sb.append((char) readUtf8Char);
                } else {
                    int i2 = readUtf8Char - 65536;
                    int i3 = (i2 >> 10) + 55296;
                    int i4 = (i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2) + 56320;
                    sb.append((char) i3);
                    sb.append((char) i4);
                }
            } else {
                advance();
                int i5 = this.current;
                if (i5 == -1 || i5 >= 128 || !VALID_ESCAPES[i5]) {
                    break;
                }
                if (i5 == 117) {
                    advance();
                    char[] cArr = new char[4];
                    for (int i6 = 0; i6 < 4; i6++) {
                        int i7 = this.current;
                        if ((48 > i7 || i7 >= 58) && ((97 > i7 || i7 >= 103) && (65 > i7 || i7 >= 71))) {
                            break loop0;
                        }
                        advance();
                        cArr[i6] = (char) i7;
                    }
                    sb.appendCodePoint(Integer.parseInt(new String(cArr), CharsKt.checkRadix(16)));
                } else {
                    sb.append(ESCAPE_CHARS[i5]);
                    advance();
                }
            }
        }
        throw new JsonParseException("Invalid unicode escape at position " + this.position);
    }

    public final Serializable parseValue() {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        skipWhitespace();
        int i5 = this.current;
        if (i5 == 34) {
            return parseString();
        }
        if (i5 == 123) {
            expect(EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            skipWhitespace();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.current == 125) {
                advance();
                return linkedHashMap;
            }
            while (this.current == 34) {
                String parseString = parseString();
                skipWhitespace();
                expect(58);
                skipWhitespace();
                linkedHashMap.put(parseString, parseValue());
                skipWhitespace();
                int i6 = this.current;
                if (i6 != 44) {
                    if (i6 == 125) {
                        advance();
                        return linkedHashMap;
                    }
                    throw new JsonParseException("Expected ',' or '}' at position " + this.position);
                }
                advance();
                skipWhitespace();
            }
            throw new JsonParseException("Expected string key at position " + this.position);
        }
        if (i5 == 91) {
            expect(91);
            skipWhitespace();
            ArrayList arrayList = new ArrayList();
            if (this.current == 93) {
                advance();
                return arrayList;
            }
            while (true) {
                arrayList.add(parseValue());
                skipWhitespace();
                i4 = this.current;
                if (i4 != 44) {
                    break;
                }
                advance();
                skipWhitespace();
            }
            if (i4 == 93) {
                advance();
                return arrayList;
            }
            throw new JsonParseException("Expected ',' or ']' at position " + this.position);
        }
        if (i5 == 116) {
            return parseKeyword("true");
        }
        if (i5 == 102) {
            return parseKeyword("false");
        }
        if (i5 == 110) {
            return parseKeyword("null");
        }
        if (i5 != 45 && (48 > i5 || i5 >= 58)) {
            if (i5 != -1) {
                int readUtf8Char = readUtf8Char();
                this.current = i5;
                if (readUtf8Char == -1 || readUtf8Char > 65535) {
                    String num = Integer.toString(readUtf8Char, CharsKt.checkRadix(16));
                    num.getClass();
                    String upperCase = num.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    str = "U+".concat(upperCase);
                } else {
                    str = String.valueOf((char) readUtf8Char);
                }
            } else {
                str = "EOF";
            }
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Unexpected character '", str, "' at position ");
            m3m.append(this.position);
            throw new JsonParseException(m3m.toString());
        }
        StringBuilder sb = this.stringBuilder;
        boolean z = false;
        sb.setLength(0);
        if (this.current == 45) {
            sb.append('-');
            advance();
        }
        int i7 = this.current;
        if (i7 != 48) {
            if (48 <= i7 && i7 < 58) {
                do {
                    sb.appendCodePoint(this.current);
                    advance();
                    i = this.current;
                    if (48 > i) {
                        break;
                    }
                } while (i < 58);
            } else {
                throw new JsonParseException("Invalid number at position " + this.position);
            }
        } else {
            sb.append('0');
            advance();
        }
        boolean z2 = true;
        if (this.current == 46) {
            sb.append('.');
            advance();
            int i8 = this.current;
            if (48 > i8 || i8 >= 58) {
                throw new JsonParseException("Invalid number at position " + this.position);
            }
            do {
                sb.appendCodePoint(this.current);
                advance();
                i3 = this.current;
                if (48 > i3) {
                    break;
                }
            } while (i3 < 58);
            z = true;
        }
        int i9 = this.current;
        if (i9 == 101 || i9 == 69) {
            sb.appendCodePoint(i9);
            advance();
            int i10 = this.current;
            if (i10 == 43 || i10 == 45) {
                sb.appendCodePoint(i10);
                advance();
            }
            int i11 = this.current;
            if (48 <= i11 && i11 < 58) {
                do {
                    sb.appendCodePoint(this.current);
                    advance();
                    i2 = this.current;
                    if (48 > i2) {
                        break;
                    }
                } while (i2 < 58);
            } else {
                throw new JsonParseException("Invalid number at position " + this.position);
            }
        } else {
            z2 = z;
        }
        String sb2 = sb.toString();
        if (z2) {
            return Double.valueOf(Double.parseDouble(sb2));
        }
        try {
            return Long.valueOf(Long.parseLong(sb2));
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.parseDouble(sb2));
        }
    }

    public final int readUtf8Char() {
        int i;
        int i2;
        int i3 = this.current;
        if (i3 == -1) {
            return -1;
        }
        advance();
        if ((i3 & 128) == 0) {
            return i3;
        }
        if ((i3 & 224) == 192) {
            i = 2;
        } else if ((i3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) == 224) {
            i = 3;
        } else {
            if ((i3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE) != 240) {
                throw new JsonParseException("Invalid UTF-8 sequence at position " + this.position);
            }
            i = 4;
        }
        if (i == 2) {
            i2 = i3 & 31;
        } else if (i == 3) {
            i2 = i3 & 15;
        } else {
            if (i != 4) {
                throw new JsonParseException("Invalid UTF-8 sequence at position " + this.position);
            }
            i2 = i3 & 7;
        }
        int i4 = i - 1;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.current;
            if (i6 == -1 || (i6 & 192) != 128) {
                throw new JsonParseException("Invalid UTF-8 continuation byte at position " + this.position);
            }
            i2 = (i2 << 6) | (i6 & 63);
            advance();
        }
        if (i != 2) {
            if (i != 3) {
                if (i == 4 && i2 < 65536) {
                    throw new JsonParseException("Overlong UTF-8 encoding at position " + this.position);
                }
            } else if (i2 < 2048) {
                throw new JsonParseException("Overlong UTF-8 encoding at position " + this.position);
            }
        } else if (i2 < 128) {
            throw new JsonParseException("Overlong UTF-8 encoding at position " + this.position);
        }
        if (i2 <= 1114111 && (i2 < 55296 || i2 > 57343)) {
            return i2;
        }
        throw new JsonParseException("Invalid Unicode code point at position " + this.position);
    }

    public final void skipWhitespace() {
        while (true) {
            int i = this.current;
            if (i == -1 || i >= 128 || !WHITESPACE[i]) {
                return;
            } else {
                advance();
            }
        }
    }
}
