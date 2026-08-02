package defpackage;

import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class r5g extends InputStream {
    public final InputStream a;
    public final int b;

    public r5g(int i, InputStream inputStream) {
        this.a = inputStream;
        this.b = i;
    }

    public final void a() {
        InputStream inputStream = this.a;
        if (inputStream instanceof nie) {
            nie nieVar = (nie) inputStream;
            nieVar.f = true;
            nieVar.b();
        }
    }
}
