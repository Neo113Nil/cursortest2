package com.bugsnag.android;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.Flushable;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class JsonStream implements Closeable, Flushable {
    public static final String[] REPLACEMENT_CHARS = new String[128];
    public String deferredName;
    public final ObjectJsonStreamer objectJsonStreamer;
    public final Writer out;
    public final String separator;
    public int[] stack;
    public int stackSize;

    public interface Streamable {
        void toStream(JsonStream jsonStream);
    }

    static {
        for (int i = 0; i < 32; i++) {
            REPLACEMENT_CHARS[i] = String.format("\\u%04x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
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
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonStream(Writer writer, ObjectJsonStreamer objectJsonStreamer) {
        this.out = writer;
        this.objectJsonStreamer = objectJsonStreamer;
        this.stack = new int[32];
        push(6);
        this.separator = ":";
    }

    public final void beforeValue() {
        int peek = peek();
        if (peek == 1) {
            this.stack[this.stackSize - 1] = 2;
            return;
        }
        Writer writer = this.out;
        if (peek == 2) {
            writer.write(44);
            return;
        }
        if (peek == 4) {
            writer.write(this.separator);
            this.stack[this.stackSize - 1] = 5;
        } else if (peek == 6) {
            this.stack[this.stackSize - 1] = 7;
        } else if (peek != 7) {
            a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("JSON must have only one top-level value.");
        }
    }

    public final void beginArray() {
        writeDeferredName();
        beforeValue();
        push(1);
        this.out.write("[");
    }

    public final void beginObject() {
        writeDeferredName();
        beforeValue();
        push(3);
        this.out.write("{");
    }

    public final void close(int i, int i2, String str) {
        int peek = peek();
        if (peek != i2 && peek != i) {
            a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
        } else if (this.deferredName != null) {
            Handlers$$ExternalSyntheticBUOutline0.m(this.deferredName, "Dangling name: ");
        } else {
            this.stackSize--;
            this.out.write(str);
        }
    }

    public final void endArray() {
        close(1, 2, "]");
    }

    public final void endObject() {
        close(3, 5, "}");
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.stackSize != 0) {
            this.out.flush();
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("JsonStream is closed.");
        }
    }

    public final void name(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("name == null");
            return;
        }
        if (this.deferredName != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        } else if (this.stackSize != 0) {
            this.deferredName = str;
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("JsonStream is closed.");
        }
    }

    public final void nullValue() {
        if (this.deferredName != null) {
            this.deferredName = null;
        } else {
            beforeValue();
            this.out.write("null");
        }
    }

    public final int peek() {
        int i = this.stackSize;
        if (i != 0) {
            return this.stack[i - 1];
        }
        a$$ExternalSyntheticBUOutline0.m$1("JsonStream is closed.");
        return 0;
    }

    public final void push(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.stack = iArr2;
        }
        int[] iArr3 = this.stack;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void string(String str) {
        int i;
        String str2;
        Writer writer = this.out;
        writer.write("\"");
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = REPLACEMENT_CHARS[charAt];
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
        writer.write("\"");
    }

    public final void value(File file) {
        BufferedReader bufferedReader;
        Throwable th;
        if (file == null || file.length() <= 0) {
            return;
        }
        Writer writer = this.out;
        writer.flush();
        beforeValue();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            try {
                IOUtils.copy(bufferedReader, writer);
                IOUtils.closeQuietly(bufferedReader);
                writer.flush();
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly(bufferedReader);
                throw th;
            }
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public final void writeDeferredName() {
        if (this.deferredName != null) {
            int peek = peek();
            if (peek == 5) {
                this.out.write(44);
            } else if (peek != 3) {
                a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
                return;
            }
            this.stack[this.stackSize - 1] = 4;
            String str = this.deferredName;
            str.getClass();
            string(str);
            this.deferredName = null;
        }
    }

    public JsonStream(Writer writer) {
        this(writer, new ObjectJsonStreamer());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.out.close();
        int i = this.stackSize;
        if (i <= 1 && (i != 1 || this.stack[i - 1] == 7)) {
            this.stackSize = 0;
        } else {
            a$$ExternalSyntheticBUOutline0.m$4("Incomplete document");
        }
    }

    public final void value(boolean z) {
        writeDeferredName();
        beforeValue();
        this.out.write(z ? "true" : "false");
    }

    public final void value(Boolean bool) {
        if (bool == null) {
            nullValue();
            return;
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? "true" : "false");
    }

    public final void value(long j) {
        writeDeferredName();
        beforeValue();
        this.out.write(String.valueOf(j));
    }

    public final void value(Number number) {
        if (number == null) {
            nullValue();
            return;
        }
        String obj = number.toString();
        if (!Intrinsics.areEqual(obj, "-Infinity") && !Intrinsics.areEqual(obj, "Infinity") && !Intrinsics.areEqual(obj, "NaN")) {
            writeDeferredName();
            beforeValue();
            this.out.write(obj);
            return;
        }
        this.deferredName = null;
    }

    public final void value(Object obj, boolean z) {
        if (obj instanceof Streamable) {
            ((Streamable) obj).toStream(this);
        } else {
            this.objectJsonStreamer.objectToStream(obj, this, z);
        }
    }

    public final void value(Object obj) {
        if (obj instanceof File) {
            value((File) obj);
        } else {
            value(obj, false);
        }
    }

    public final void value(String str) {
        if (str == null) {
            nullValue();
            return;
        }
        writeDeferredName();
        beforeValue();
        string(str);
    }
}
