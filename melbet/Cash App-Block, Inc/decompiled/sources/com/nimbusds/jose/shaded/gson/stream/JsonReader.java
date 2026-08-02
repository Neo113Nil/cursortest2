package com.nimbusds.jose.shaded.gson.stream;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.StringReader;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes5.dex */
public class JsonReader implements Closeable {
    public final StringReader in;
    public int[] pathIndices;
    public String[] pathNames;
    public long peekedLong;
    public int peekedNumberLength;
    public String peekedString;
    public int[] stack;
    public int strictness = 2;
    public final char[] buffer = new char[1024];
    public int pos = 0;
    public int limit = 0;
    public int lineNumber = 0;
    public int lineStart = 0;
    public int peeked = 0;
    public int stackSize = 1;

    static {
        zzc.INSTANCE = new zzc(13);
    }

    public JsonReader(StringReader stringReader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        this.in = stringReader;
    }

    public final void beginArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 3) {
            throw unexpectedTokenError("BEGIN_ARRAY");
        }
        push(1);
        this.pathIndices[this.stackSize - 1] = 0;
        this.peeked = 0;
    }

    public final void beginObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 1) {
            throw unexpectedTokenError("BEGIN_OBJECT");
        }
        push(3);
        this.peeked = 0;
    }

    public final void checkLenient() {
        if (this.strictness == 1) {
            return;
        }
        syntaxError("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cd, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0222, code lost:
    
        if (isLiteral(r14) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a6, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0225, code lost:
    
        if (r12 != 2) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0227, code lost:
    
        if (r13 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x022d, code lost:
    
        if (r24 != Long.MIN_VALUE) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x022f, code lost:
    
        if (r7 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0236, code lost:
    
        if (r24 != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0238, code lost:
    
        if (r7 != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x023a, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023c, code lost:
    
        if (r7 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023f, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0240, code lost:
    
        r26.peekedLong = r4;
        r26.pos += r2;
        r9 = 15;
        r26.peeked = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0232, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x024c, code lost:
    
        if (r12 == r8) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x024f, code lost:
    
        if (r12 == 4) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0252, code lost:
    
        if (r12 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0254, code lost:
    
        r26.peekedNumberLength = r2;
        r9 = 16;
        r26.peeked = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int doPeek() {
        int nextNonWhitespace;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        int i4;
        int[] iArr = this.stack;
        boolean z = true;
        int i5 = this.stackSize - 1;
        int i6 = iArr[i5];
        char[] cArr = this.buffer;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int nextNonWhitespace2 = nextNonWhitespace(true);
            if (nextNonWhitespace2 != 44) {
                if (nextNonWhitespace2 != 59) {
                    if (nextNonWhitespace2 == 93) {
                        this.peeked = 4;
                        return 4;
                    }
                    syntaxError("Unterminated array");
                    throw null;
                }
                checkLenient();
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5 && (nextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (nextNonWhitespace != 59) {
                        if (nextNonWhitespace == 125) {
                            this.peeked = 2;
                            return 2;
                        }
                        syntaxError("Unterminated object");
                        throw null;
                    }
                    checkLenient();
                }
                int nextNonWhitespace3 = nextNonWhitespace(true);
                if (nextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (nextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (nextNonWhitespace3 == 125) {
                    if (i6 != 5) {
                        this.peeked = 2;
                        return 2;
                    }
                    syntaxError("Expected name");
                    throw null;
                }
                checkLenient();
                this.pos--;
                if (isLiteral((char) nextNonWhitespace3)) {
                    this.peeked = 14;
                    return 14;
                }
                syntaxError("Expected name");
                throw null;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                if (nextNonWhitespace4 != 58) {
                    if (nextNonWhitespace4 != 61) {
                        syntaxError("Expected ':'");
                        throw null;
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        int i7 = this.pos;
                        if (cArr[i7] == '>') {
                            this.pos = i7 + 1;
                        }
                    }
                }
            } else if (i6 == 6) {
                if (this.strictness == 1) {
                    nextNonWhitespace(true);
                    int i8 = this.pos;
                    this.pos = i8 - 1;
                    if (i8 + 4 <= this.limit || fillBuffer(5)) {
                        int i9 = this.pos;
                        if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
                            this.pos = i9 + 5;
                        }
                    }
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i6 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i6 == 8) {
                a$$ExternalSyntheticBUOutline0.m$1("JsonReader is closed");
                return 0;
            }
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (nextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (nextNonWhitespace5 == 44 || nextNonWhitespace5 == 59) {
            i = 1;
        } else {
            if (nextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (nextNonWhitespace5 == 93) {
                i = 1;
                if (i6 == 1) {
                    this.peeked = 4;
                    return 4;
                }
            } else {
                if (nextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                int i10 = this.pos - 1;
                this.pos = i10;
                char c2 = cArr[i10];
                if (c2 == 't' || c2 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                } else if (c2 == 'f' || c2 == 'F') {
                    str = "false";
                    str2 = "FALSE";
                    i2 = 6;
                } else {
                    if (c2 == 'n' || c2 == 'N') {
                        str = "null";
                        str2 = "NULL";
                        i2 = 7;
                    }
                    i3 = 0;
                    if (i3 == 0) {
                        return i3;
                    }
                    int i11 = this.pos;
                    int i12 = this.limit;
                    boolean z2 = true;
                    int i13 = 0;
                    long j = 0;
                    boolean z3 = false;
                    char c3 = 0;
                    while (true) {
                        if (i11 + i13 == i12) {
                            if (i13 == cArr.length) {
                                break;
                            }
                            if (!fillBuffer(i13 + 1)) {
                                long j2 = j;
                                break;
                            }
                            i11 = this.pos;
                            i12 = this.limit;
                        }
                        char c4 = cArr[i11 + i13];
                        if (c4 != '+') {
                            if (c4 == 'E' || c4 == 'e') {
                                if (c3 != 2 && c3 != 4) {
                                    break;
                                }
                                c3 = 5;
                                i13++;
                                z = true;
                            } else if (c4 != '-') {
                                if (c4 == '.') {
                                    if (c3 != 2) {
                                        break;
                                    }
                                    c3 = 3;
                                    i13++;
                                    z = true;
                                } else {
                                    if (c4 < '0' || c4 > '9') {
                                        break;
                                    }
                                    if (c3 == z || c3 == 0) {
                                        j = -(c4 - '0');
                                        c3 = 2;
                                    } else if (c3 != 2) {
                                        long j3 = j;
                                        if (c3 == 3) {
                                            j = j3;
                                            c3 = 4;
                                        } else if (c3 == 5 || c3 == 6) {
                                            j = j3;
                                            c3 = 7;
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        if (j == 0) {
                                            break;
                                        }
                                        long j4 = j;
                                        long j5 = (10 * j) - (c4 - '0');
                                        z2 &= j4 > -922337203685477580L || (j4 == -922337203685477580L && j5 < j4);
                                        j = j5;
                                    }
                                    i13++;
                                    z = true;
                                }
                            } else if (c3 == 0) {
                                z3 = true;
                                c3 = 1;
                                i13++;
                                z = true;
                            } else {
                                if (c3 != 5) {
                                    break;
                                }
                                c3 = 6;
                                i13++;
                                z = true;
                            }
                            if (i4 == 0) {
                                return i4;
                            }
                            if (!isLiteral(cArr[this.pos])) {
                                syntaxError("Expected value");
                                throw null;
                            }
                            checkLenient();
                            this.peeked = 10;
                            return 10;
                        }
                        if (c3 != 5) {
                            break;
                        }
                        c3 = 6;
                        i13++;
                        z = true;
                    }
                    i4 = 0;
                    if (i4 == 0) {
                    }
                }
                boolean z4 = this.strictness != 3;
                int length = str.length();
                int i14 = 0;
                while (true) {
                    int i15 = this.pos;
                    int i16 = this.limit;
                    if (i14 < length) {
                        if ((i15 + i14 >= i16 && !fillBuffer(i14 + 1)) || ((c = cArr[this.pos + i14]) != str.charAt(i14) && (!z4 || c != str2.charAt(i14)))) {
                            break;
                        }
                        i14++;
                    } else if ((i15 + length >= i16 && !fillBuffer(length + 1)) || !isLiteral(cArr[this.pos + length])) {
                        this.pos += length;
                        this.peeked = i2;
                        i3 = i2;
                    }
                }
                if (i3 == 0) {
                }
            }
        }
        if (i6 != i && i6 != 2) {
            syntaxError("Unexpected value");
            throw null;
        }
        checkLenient();
        this.pos -= i;
        this.peeked = 7;
        return 7;
    }

    public final void endArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 4) {
            throw unexpectedTokenError("END_ARRAY");
        }
        int i2 = this.stackSize;
        this.stackSize = i2 - 1;
        int[] iArr = this.pathIndices;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.peeked = 0;
    }

    public final void endObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 2) {
            throw unexpectedTokenError("END_OBJECT");
        }
        int i2 = this.stackSize;
        int i3 = i2 - 1;
        this.stackSize = i3;
        this.pathNames[i3] = null;
        int[] iArr = this.pathIndices;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.peeked = 0;
    }

    public final boolean fillBuffer(int i) {
        int i2;
        int i3;
        int i4 = this.lineStart;
        int i5 = this.pos;
        this.lineStart = i4 - i5;
        int i6 = this.limit;
        char[] cArr = this.buffer;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.limit = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            int i8 = this.limit;
            int read = this.in.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.limit + read;
            this.limit = i2;
            if (this.lineNumber == 0 && (i3 = this.lineStart) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String getPath(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.stackSize;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.stack[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.pathIndices[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.pathNames[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    a$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    public final boolean hasNext() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean isLiteral(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    public final String locationString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.lineNumber + 1, (this.pos - this.lineStart) + 1, " at line ", " column ", " path ");
        m107m.append(getPath(false));
        return m107m.toString();
    }

    public final boolean nextBoolean() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw unexpectedTokenError("a boolean");
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final double nextDouble() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (i == 8 || i == 9) {
            this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i != 11) {
            throw unexpectedTokenError("a double");
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        if (this.strictness != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            syntaxError("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public final int nextInt() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            long j = this.peekedLong;
            int i2 = (int) j;
            if (j == i2) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
        }
        if (i == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw unexpectedTokenError("an int");
            }
            if (i == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Expected an int but was ", (Object) this.peekedString, (Object) locationString());
            return 0;
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i6 = this.stackSize - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public final long nextLong() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw unexpectedTokenError("a long");
            }
            if (i == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Expected a long but was ", (Object) this.peekedString, (Object) locationString());
            return 0L;
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i4 = this.stackSize - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    public final String nextName() {
        String nextQuotedValue;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 14) {
            nextQuotedValue = nextUnquotedValue();
        } else if (i == 12) {
            nextQuotedValue = nextQuotedValue('\'');
        } else {
            if (i != 13) {
                throw unexpectedTokenError("a name");
            }
            nextQuotedValue = nextQuotedValue('\"');
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = nextQuotedValue;
        return nextQuotedValue;
    }

    public final int nextNonWhitespace(boolean z) {
        char c;
        int i = this.pos;
        int i2 = this.limit;
        while (true) {
            if (i == i2) {
                this.pos = i;
                if (!fillBuffer(1)) {
                    if (!z) {
                        return -1;
                    }
                    Path$$ExternalSyntheticBUOutline0.m$1("End of input".concat(locationString()));
                    return 0;
                }
                i = this.pos;
                i2 = this.limit;
            }
            int i3 = i + 1;
            char[] cArr = this.buffer;
            c = cArr[i];
            if (c == '\n') {
                this.lineNumber++;
                this.lineStart = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.pos = i3;
                    if (i3 == i2) {
                        this.pos = i;
                        boolean fillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!fillBuffer) {
                            break;
                        }
                    }
                    checkLenient();
                    int i4 = this.pos;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.pos = i4 + 1;
                        while (true) {
                            if (this.pos + 2 > this.limit && !fillBuffer(2)) {
                                syntaxError("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.pos;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.pos;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.limit;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.lineNumber++;
                                this.lineStart = i5 + 1;
                            }
                            this.pos++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.pos = i4 + 1;
                        skipToEndOfLine();
                        i = this.pos;
                        i2 = this.limit;
                    }
                } else {
                    if (c != '#') {
                        this.pos = i3;
                        return c;
                    }
                    this.pos = i3;
                    checkLenient();
                    skipToEndOfLine();
                    i = this.pos;
                    i2 = this.limit;
                }
            }
            i = i3;
        }
        return c;
    }

    public final void nextNull() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 7) {
            throw unexpectedTokenError("null");
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r11.pos = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.pos = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String nextQuotedValue(char c) {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.pos;
            int i3 = this.limit;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (true) {
                    cArr = this.buffer;
                    if (i2 >= i4) {
                        break;
                    }
                    int i6 = i2 + 1;
                    char c2 = cArr[i2];
                    if (this.strictness == 3 && c2 < ' ') {
                        syntaxError("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c2 == c) {
                        this.pos = i6;
                        int i7 = (i6 - i5) - 1;
                        if (sb == null) {
                            return new String(cArr, i5, i7);
                        }
                        sb.append(cArr, i5, i7);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        break;
                    }
                    if (c2 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i6;
                    }
                    i2 = i6;
                }
                sb.append(cArr, i5, i);
                sb.append(readEscapeCharacter());
                i2 = this.pos;
                i3 = this.limit;
            }
        } while (fillBuffer(1));
        syntaxError("Unterminated string");
        throw null;
    }

    public final String nextString() {
        String str;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 10) {
            str = nextUnquotedValue();
        } else if (i == 8) {
            str = nextQuotedValue('\'');
        } else if (i == 9) {
            str = nextQuotedValue('\"');
        } else if (i == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (i == 15) {
            str = Long.toString(this.peekedLong);
        } else {
            if (i != 16) {
                throw unexpectedTokenError("a string");
            }
            str = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        checkLenient();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String nextUnquotedValue() {
        char[] cArr;
        String sb;
        StringBuilder sb2 = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.pos + i2;
                int i4 = this.limit;
                cArr = this.buffer;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(cArr, this.pos, i2);
                    this.pos += i2;
                } else if (fillBuffer(i2 + 1)) {
                }
            }
            i = i2;
            int i5 = this.pos;
            if (sb2 != null) {
                sb = new String(cArr, i5, i);
            } else {
                sb2.append(cArr, i5, i);
                sb = sb2.toString();
            }
            this.pos += i;
            return sb;
        } while (fillBuffer(1));
        int i52 = this.pos;
        if (sb2 != null) {
        }
        this.pos += i;
        return sb;
    }

    public final int peek() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                Path$$ExternalSyntheticBUOutline0.m$2();
                return 0;
        }
    }

    public final void push(int i) {
        int i2 = this.stackSize;
        if (i2 - 1 >= 255) {
            throw new MalformedJsonException("Nesting limit 255 reached".concat(locationString()));
        }
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.stack = Arrays.copyOf(iArr, i3);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i3);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i3);
        }
        int[] iArr2 = this.stack;
        int i4 = this.stackSize;
        this.stackSize = i4 + 1;
        iArr2[i4] = i;
    }

    public final char readEscapeCharacter() {
        int i;
        if (this.pos == this.limit && !fillBuffer(1)) {
            syntaxError("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.pos;
        int i3 = i2 + 1;
        this.pos = i3;
        char[] cArr = this.buffer;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            syntaxError("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.limit && !fillBuffer(4)) {
                            syntaxError("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.pos;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    syntaxError("Malformed Unicode escape \\u".concat(new String(cArr, this.pos, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.pos += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.strictness == 3) {
            syntaxError("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.lineNumber++;
        this.lineStart = i3;
        if (this.strictness == 3) {
            syntaxError("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void skipQuotedValue(char c) {
        do {
            int i = this.pos;
            int i2 = this.limit;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.buffer[i];
                if (c2 == c) {
                    this.pos = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.pos = i3;
                    readEscapeCharacter();
                    i = this.pos;
                    i2 = this.limit;
                } else {
                    if (c2 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i3;
                    }
                    i = i3;
                }
            }
            this.pos = i;
        } while (fillBuffer(1));
        syntaxError("Unterminated string");
        throw null;
    }

    public final void skipToEndOfLine() {
        char c;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            int i = this.pos;
            int i2 = i + 1;
            this.pos = i2;
            c = this.buffer[i];
            if (c == '\n') {
                this.lineNumber++;
                this.lineStart = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void skipUnquotedValue() {
        do {
            int i = 0;
            while (true) {
                int i2 = this.pos + i;
                if (i2 < this.limit) {
                    char c = this.buffer[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.pos = i2;
                }
            }
            checkLenient();
            this.pos += i;
            return;
        } while (fillBuffer(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void skipValue() {
        int i = 0;
        do {
            int i2 = this.peeked;
            if (i2 == 0) {
                i2 = doPeek();
            }
            switch (i2) {
                case 1:
                    push(3);
                    i++;
                    this.peeked = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = null;
                    }
                    this.stackSize--;
                    i--;
                    this.peeked = 0;
                    break;
                case 3:
                    push(1);
                    i++;
                    this.peeked = 0;
                    break;
                case 4:
                    this.stackSize--;
                    i--;
                    this.peeked = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.peeked = 0;
                    break;
                case 8:
                    skipQuotedValue('\'');
                    this.peeked = 0;
                    break;
                case 9:
                    skipQuotedValue('\"');
                    this.peeked = 0;
                    break;
                case 10:
                    skipUnquotedValue();
                    this.peeked = 0;
                    break;
                case 12:
                    skipQuotedValue('\'');
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 13:
                    skipQuotedValue('\"');
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 14:
                    skipUnquotedValue();
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 16:
                    this.pos += this.peekedNumberLength;
                    this.peeked = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final void syntaxError(String str) {
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
        m.append(locationString());
        m.append("\nSee ");
        m.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(m.toString());
    }

    public final String toString() {
        return "JsonReader".concat(locationString());
    }

    public final IllegalStateException unexpectedTokenError(String str) {
        String str2 = peek() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Expected ", str, " but was ");
        m3m.append(SVG$Unit$EnumUnboxingLocalUtility.stringValueOf(peek()));
        m3m.append(locationString());
        m3m.append("\nSee ");
        m3m.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(m3m.toString());
    }
}
