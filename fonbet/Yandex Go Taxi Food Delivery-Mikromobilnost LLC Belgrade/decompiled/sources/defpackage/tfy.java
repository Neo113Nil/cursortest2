package defpackage;

import java.io.InputStream;

/* loaded from: classes9.dex */
public abstract class tfy extends InputStream {
    public final InputStream a;
    public final int b;

    public tfy(int i, InputStream inputStream) {
        this.a = inputStream;
        this.b = i;
    }

    public final void a() {
        InputStream inputStream = this.a;
        if (inputStream instanceof rqv) {
            ((rqv) inputStream).d(true);
        }
    }
}
