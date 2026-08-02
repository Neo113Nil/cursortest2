package defpackage;

import java.io.OutputStream;
import java.io.Writer;
import org.w3c.dom.ls.LSOutput;

/* loaded from: classes4.dex */
public class ur61 implements LSOutput {
    public Writer a = null;
    public OutputStream b = null;
    public String c = null;
    public String d = null;

    @Override // org.w3c.dom.ls.LSOutput
    public final OutputStream getByteStream() {
        return this.b;
    }

    @Override // org.w3c.dom.ls.LSOutput
    public final Writer getCharacterStream() {
        return this.a;
    }

    @Override // org.w3c.dom.ls.LSOutput
    public final String getEncoding() {
        return this.d;
    }

    @Override // org.w3c.dom.ls.LSOutput
    public final String getSystemId() {
        return this.c;
    }

    @Override // org.w3c.dom.ls.LSOutput
    public final void setByteStream(OutputStream outputStream) {
        this.b = outputStream;
    }

    @Override // org.w3c.dom.ls.LSOutput
    public final void setCharacterStream(Writer writer) {
        this.a = writer;
    }

    @Override // org.w3c.dom.ls.LSOutput
    public final void setEncoding(String str) {
        this.d = str;
    }

    @Override // org.w3c.dom.ls.LSOutput
    public final void setSystemId(String str) {
        this.c = str;
    }
}
