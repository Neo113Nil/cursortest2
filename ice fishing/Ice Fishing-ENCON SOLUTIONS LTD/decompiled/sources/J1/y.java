package J1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final v f1000a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1001b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1002c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1003d;

    /* renamed from: e, reason: collision with root package name */
    public final k f1004e;

    /* renamed from: f, reason: collision with root package name */
    public final m f1005f;

    /* renamed from: g, reason: collision with root package name */
    public final z f1006g;

    /* renamed from: h, reason: collision with root package name */
    public final y f1007h;

    /* renamed from: i, reason: collision with root package name */
    public final y f1008i;

    /* renamed from: j, reason: collision with root package name */
    public final y f1009j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1010k;

    /* renamed from: l, reason: collision with root package name */
    public final long f1011l;

    /* renamed from: m, reason: collision with root package name */
    public final N1.e f1012m;

    public y(v request, t protocol, String message, int i2, k kVar, m mVar, z zVar, y yVar, y yVar2, y yVar3, long j2, long j3, N1.e eVar) {
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(message, "message");
        this.f1000a = request;
        this.f1001b = protocol;
        this.f1002c = message;
        this.f1003d = i2;
        this.f1004e = kVar;
        this.f1005f = mVar;
        this.f1006g = zVar;
        this.f1007h = yVar;
        this.f1008i = yVar2;
        this.f1009j = yVar3;
        this.f1010k = j2;
        this.f1011l = j3;
        this.f1012m = eVar;
    }

    public static String a(y yVar, String str) {
        yVar.getClass();
        String a2 = yVar.f1005f.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    public final x b() {
        x xVar = new x();
        xVar.f987a = this.f1000a;
        xVar.f988b = this.f1001b;
        xVar.f989c = this.f1003d;
        xVar.f990d = this.f1002c;
        xVar.f991e = this.f1004e;
        xVar.f992f = this.f1005f.c();
        xVar.f993g = this.f1006g;
        xVar.f994h = this.f1007h;
        xVar.f995i = this.f1008i;
        xVar.f996j = this.f1009j;
        xVar.f997k = this.f1010k;
        xVar.f998l = this.f1011l;
        xVar.f999m = this.f1012m;
        return xVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f1006g;
        if (zVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        zVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f1001b + ", code=" + this.f1003d + ", message=" + this.f1002c + ", url=" + this.f1000a.f977a + '}';
    }
}
