package i8;

import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class x implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static final w f38261n;

    static {
        y8.h hVar = y8.h.f41951w;
        kotlin.jvm.internal.h.e(hVar, "<this>");
        y8.e eVar = new y8.e();
        eVar.K(hVar);
        f38261n = new w(hVar.f41952n.length, eVar);
    }

    public abstract long b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j8.c.a(z());
    }

    public abstract p j();

    public abstract y8.g z();
}
