package defpackage;

import java.io.Closeable;
import java.nio.FloatBuffer;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class r2x0 implements Closeable {
    public final /* synthetic */ int a = 1;
    public int b;
    public final Object c;

    public r2x0(int i, FloatBuffer floatBuffer) {
        if (floatBuffer != null && floatBuffer.limit() % i != 0) {
            ny61.g("If non-null, vertex buffer data must be divisible by the number of data points per vertex");
            throw null;
        }
        this.b = i;
        this.c = new zi6(34962, floatBuffer);
    }

    public void a(FloatBuffer floatBuffer) {
        if (floatBuffer == null || floatBuffer.limit() % this.b == 0) {
            ((zi6) this.c).m(floatBuffer);
        } else {
            ny61.g("If non-null, vertex buffer data must be divisible by the number of data points per vertex");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((ArrayList) obj).clear();
                break;
            default:
                ((zi6) obj).f();
                break;
        }
    }

    public r2x0(ArrayList arrayList) {
        this.c = arrayList;
    }
}
