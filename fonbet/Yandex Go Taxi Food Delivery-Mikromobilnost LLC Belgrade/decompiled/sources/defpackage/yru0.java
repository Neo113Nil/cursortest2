package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class yru0 extends Writer {
    public final StringBuilder a;
    public final xru0 b = new xru0();

    public yru0(StringBuilder sb) {
        this.a = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CharSequence charSequence = this.a;
        if (charSequence instanceof Closeable) {
            ((Closeable) charSequence).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        CharSequence charSequence = this.a;
        if (charSequence instanceof Flushable) {
            ((Flushable) charSequence).flush();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        xru0 xru0Var = this.b;
        xru0Var.a = cArr;
        xru0Var.b = null;
        this.a.append((CharSequence) xru0Var, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        Objects.requireNonNull(str);
        this.a.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.a.append((char) i);
    }
}
