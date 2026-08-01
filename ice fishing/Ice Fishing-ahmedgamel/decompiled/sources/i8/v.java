package i8;

import com.google.android.gms.internal.ads.C3428jv;
import java.io.Closeable;
import q2.C4896n;

/* loaded from: classes2.dex */
public final class v implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public final m8.i f38244A;

    /* renamed from: B, reason: collision with root package name */
    public final v f38245B;

    /* renamed from: C, reason: collision with root package name */
    public final v f38246C;

    /* renamed from: D, reason: collision with root package name */
    public final v f38247D;

    /* renamed from: E, reason: collision with root package name */
    public final long f38248E;

    /* renamed from: F, reason: collision with root package name */
    public final long f38249F;

    /* renamed from: G, reason: collision with root package name */
    public final C3428jv f38250G;

    /* renamed from: H, reason: collision with root package name */
    public final A f38251H;

    /* renamed from: n, reason: collision with root package name */
    public final C4896n f38252n;

    /* renamed from: u, reason: collision with root package name */
    public final s f38253u;

    /* renamed from: v, reason: collision with root package name */
    public final String f38254v;

    /* renamed from: w, reason: collision with root package name */
    public final int f38255w;

    /* renamed from: x, reason: collision with root package name */
    public final k f38256x;

    /* renamed from: y, reason: collision with root package name */
    public final l f38257y;

    /* renamed from: z, reason: collision with root package name */
    public final x f38258z;

    public v(C4896n request, s protocol, String message, int i, k kVar, l lVar, x body, m8.i iVar, v vVar, v vVar2, v vVar3, long j6, long j9, C3428jv c3428jv, A trailersSource) {
        kotlin.jvm.internal.h.e(request, "request");
        kotlin.jvm.internal.h.e(protocol, "protocol");
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(body, "body");
        kotlin.jvm.internal.h.e(trailersSource, "trailersSource");
        this.f38252n = request;
        this.f38253u = protocol;
        this.f38254v = message;
        this.f38255w = i;
        this.f38256x = kVar;
        this.f38257y = lVar;
        this.f38258z = body;
        this.f38244A = iVar;
        this.f38245B = vVar;
        this.f38246C = vVar2;
        this.f38247D = vVar3;
        this.f38248E = j6;
        this.f38249F = j9;
        this.f38250G = c3428jv;
        this.f38251H = trailersSource;
    }

    public final u b() {
        u uVar = new u();
        uVar.f38232c = -1;
        uVar.f38236g = x.f38261n;
        uVar.f38243o = A.f38066a;
        uVar.f38230a = this.f38252n;
        uVar.f38231b = this.f38253u;
        uVar.f38232c = this.f38255w;
        uVar.f38233d = this.f38254v;
        uVar.f38234e = this.f38256x;
        uVar.f38235f = this.f38257y.d();
        uVar.f38236g = this.f38258z;
        uVar.f38237h = this.f38244A;
        uVar.i = this.f38245B;
        uVar.f38238j = this.f38246C;
        uVar.f38239k = this.f38247D;
        uVar.f38240l = this.f38248E;
        uVar.f38241m = this.f38249F;
        uVar.f38242n = this.f38250G;
        uVar.f38243o = this.f38251H;
        return uVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38258z.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f38253u + ", code=" + this.f38255w + ", message=" + this.f38254v + ", url=" + ((n) this.f38252n.f40192u) + '}';
    }
}
