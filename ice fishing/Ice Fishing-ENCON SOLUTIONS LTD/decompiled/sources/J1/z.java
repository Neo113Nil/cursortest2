package J1;

import a.AbstractC0083a;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1013a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1014b;

    /* renamed from: c, reason: collision with root package name */
    public final W1.i f1015c;

    public /* synthetic */ z(long j2, W1.i iVar, int i2) {
        this.f1013a = i2;
        this.f1014b = j2;
        this.f1015c = iVar;
    }

    public final byte[] a() {
        long b2 = b();
        if (b2 > 2147483647L) {
            throw new IOException(kotlin.jvm.internal.i.h(Long.valueOf(b2), "Cannot buffer entire body for content length: "));
        }
        W1.i c2 = c();
        try {
            byte[] f2 = c2.f();
            AbstractC0083a.e(c2, null);
            int length = f2.length;
            if (b2 == -1 || b2 == length) {
                return f2;
            }
            throw new IOException("Content-Length (" + b2 + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final long b() {
        switch (this.f1013a) {
        }
        return this.f1014b;
    }

    public final W1.i c() {
        switch (this.f1013a) {
            case 0:
                return (W1.g) this.f1015c;
            default:
                return (W1.q) this.f1015c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        K1.b.d(c());
    }
}
