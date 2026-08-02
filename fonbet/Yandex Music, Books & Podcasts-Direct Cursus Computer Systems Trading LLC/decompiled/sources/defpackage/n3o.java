package defpackage;

import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class n3o extends Reader {
    public final ij3 a;
    public final Charset b;
    public boolean c;
    public InputStreamReader d;

    public n3o(ij3 ij3Var, Charset charset) {
        ij3Var.getClass();
        charset.getClass();
        this.a = ij3Var;
        this.b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Unit unit;
        this.c = true;
        InputStreamReader inputStreamReader = this.d;
        if (inputStreamReader != null) {
            inputStreamReader.close();
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        cArr.getClass();
        if (this.c) {
            kac.f("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.d;
        if (inputStreamReader == null) {
            ij3 ij3Var = this.a;
            inputStreamReader = new InputStreamReader(ij3Var.E0(), cvt.s(ij3Var, this.b));
            this.d = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
