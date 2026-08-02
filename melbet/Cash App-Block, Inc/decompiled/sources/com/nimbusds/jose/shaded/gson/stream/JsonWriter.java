package com.nimbusds.jose.shaded.gson.stream;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.shaded.gson.FormattingStyle;
import com.plaid.internal.EnumC0170g;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public class JsonWriter implements Closeable, Flushable {
    public static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    public String deferredName;
    public String formattedColon;
    public String formattedComma;
    public FormattingStyle formattingStyle;
    public boolean htmlSafe;
    public final Writer out;
    public boolean serializeNulls;
    public int[] stack;
    public int stackSize;
    public int strictness;
    public boolean usesEmptyNewlineAndIndent;
    public static final Pattern VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] REPLACEMENT_CHARS = new String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        int[] iArr = new int[32];
        this.stack = iArr;
        this.stackSize = 0;
        if (iArr.length == 0) {
            this.stack = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.stack;
        int i = this.stackSize;
        this.stackSize = i + 1;
        iArr2[i] = 6;
        this.strictness = 2;
        this.serializeNulls = true;
        Objects.requireNonNull(writer, "out == null");
        this.out = writer;
        setFormattingStyle(FormattingStyle.COMPACT);
    }

    public final void beforeValue() {
        int peek = peek();
        if (peek == 1) {
            this.stack[this.stackSize - 1] = 2;
            newline();
            return;
        }
        Writer writer = this.out;
        if (peek == 2) {
            writer.append((CharSequence) this.formattedComma);
            newline();
            return;
        }
        if (peek == 4) {
            writer.append((CharSequence) this.formattedColon);
            this.stack[this.stackSize - 1] = 5;
            return;
        }
        if (peek != 6) {
            if (peek != 7) {
                a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
                return;
            } else if (this.strictness != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("JSON must have only one top-level value.");
                return;
            }
        }
        this.stack[this.stackSize - 1] = 7;
    }

    public void beginArray() {
        writeDeferredName();
        beforeValue();
        int i = this.stackSize;
        int[] iArr = this.stack;
        if (i == iArr.length) {
            this.stack = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.stack;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        iArr2[i2] = 1;
        this.out.write(91);
    }

    public void beginObject() {
        writeDeferredName();
        beforeValue();
        int i = this.stackSize;
        int[] iArr = this.stack;
        if (i == iArr.length) {
            this.stack = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.stack;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        iArr2[i2] = 3;
        this.out.write(EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
        int i = this.stackSize;
        if (i > 1 || (i == 1 && this.stack[i - 1] != 7)) {
            a$$ExternalSyntheticBUOutline0.m$4("Incomplete document");
        } else {
            this.stackSize = 0;
        }
    }

    public final void closeScope(char c, int i, int i2) {
        int peek = peek();
        if (peek != i2 && peek != i) {
            a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
            return;
        }
        if (this.deferredName != null) {
            a$$ExternalSyntheticBUOutline0.m$2(this.deferredName, "Dangling name: ");
            return;
        }
        this.stackSize--;
        if (peek == i2) {
            newline();
        }
        this.out.write(c);
    }

    public void endArray() {
        closeScope(']', 1, 2);
    }

    public void endObject() {
        closeScope('}', 3, 5);
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.stackSize != 0) {
            this.out.flush();
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("JsonWriter is closed.");
        }
    }

    public void name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.deferredName != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Already wrote a name, expecting a value.");
            return;
        }
        int peek = peek();
        if (peek == 3 || peek == 5) {
            this.deferredName = str;
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Please begin an object before writing a name.");
        }
    }

    public final void newline() {
        if (this.usesEmptyNewlineAndIndent) {
            return;
        }
        String str = this.formattingStyle.newline;
        Writer writer = this.out;
        writer.write(str);
        int i = this.stackSize;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.formattingStyle.indent);
        }
    }

    public JsonWriter nullValue() {
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public final int peek() {
        int i = this.stackSize;
        if (i != 0) {
            return this.stack[i - 1];
        }
        a$$ExternalSyntheticBUOutline0.m$1("JsonWriter is closed.");
        return 0;
    }

    public final void setFormattingStyle(FormattingStyle formattingStyle) {
        Objects.requireNonNull(formattingStyle);
        this.formattingStyle = formattingStyle;
        this.formattedComma = ",";
        if (formattingStyle.spaceAfterSeparators) {
            this.formattedColon = ": ";
            if (formattingStyle.newline.isEmpty()) {
                this.formattedComma = ", ";
            }
        } else {
            this.formattedColon = ":";
        }
        this.usesEmptyNewlineAndIndent = this.formattingStyle.newline.isEmpty() && this.formattingStyle.indent.isEmpty();
    }

    public final void setStrictness(int i) {
        if (i == 0) {
            throw null;
        }
        this.strictness = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void string(String str) {
        int i;
        String str2;
        String[] strArr = this.htmlSafe ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        Writer writer = this.out;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    writer.write(str, i2, i - i2);
                }
                writer.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                writer.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    public void value(Number number) {
        if (number == null) {
            nullValue();
            return;
        }
        writeDeferredName();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.strictness != 1) {
                    a$$ExternalSyntheticBUOutline0.m$3("Numeric values must be finite, but was ".concat(obj));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !VALID_JSON_NUMBER_PATTERN.matcher(obj).matches()) {
                Handlers$$ExternalSyntheticBUOutline0.m$1("String created by ", cls, " is not a valid JSON number: ", obj);
                return;
            }
        }
        beforeValue();
        this.out.append((CharSequence) obj);
    }

    public final void writeDeferredName() {
        if (this.deferredName != null) {
            int peek = peek();
            if (peek == 5) {
                this.out.write(this.formattedComma);
            } else if (peek != 3) {
                a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
                return;
            }
            newline();
            this.stack[this.stackSize - 1] = 4;
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public void value(boolean z) {
        writeDeferredName();
        beforeValue();
        this.out.write(z ? "true" : "false");
    }

    public void value(double d) {
        writeDeferredName();
        if (this.strictness != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Numeric values must be finite, but was ", d);
        } else {
            beforeValue();
            this.out.append((CharSequence) Double.toString(d));
        }
    }

    public void value(long j) {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j));
    }

    public void value(String str) {
        if (str == null) {
            nullValue();
            return;
        }
        writeDeferredName();
        beforeValue();
        string(str);
    }
}
