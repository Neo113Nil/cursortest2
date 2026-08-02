package defpackage;

import java.io.InputStream;

/* loaded from: classes4.dex */
public abstract class ufy extends InputStream {
    public final InputStream a;
    public final int b;

    public ufy(int i, InputStream inputStream) {
        this.a = inputStream;
        this.b = i;
    }

    public final void a() {
        InputStream inputStream = this.a;
        if (inputStream instanceof sqv) {
            sqv sqvVar = (sqv) inputStream;
            sqvVar.y = true;
            sqvVar.c();
        }
    }
}
