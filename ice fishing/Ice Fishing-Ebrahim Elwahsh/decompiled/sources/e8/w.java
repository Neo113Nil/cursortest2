package e8;

import com.google.android.gms.internal.ads.C4088vv;
import java.io.Closeable;
import q2.C4903n;

/* loaded from: classes2.dex */
public final class w implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public final S0.c f37522A;

    /* renamed from: B, reason: collision with root package name */
    public final w f37523B;

    /* renamed from: C, reason: collision with root package name */
    public final w f37524C;

    /* renamed from: D, reason: collision with root package name */
    public final w f37525D;

    /* renamed from: E, reason: collision with root package name */
    public final long f37526E;

    /* renamed from: F, reason: collision with root package name */
    public final long f37527F;

    /* renamed from: G, reason: collision with root package name */
    public final C4088vv f37528G;

    /* renamed from: H, reason: collision with root package name */
    public final B f37529H;

    /* renamed from: n, reason: collision with root package name */
    public final C4903n f37530n;

    /* renamed from: u, reason: collision with root package name */
    public final t f37531u;

    /* renamed from: v, reason: collision with root package name */
    public final String f37532v;

    /* renamed from: w, reason: collision with root package name */
    public final int f37533w;

    /* renamed from: x, reason: collision with root package name */
    public final l f37534x;

    /* renamed from: y, reason: collision with root package name */
    public final m f37535y;

    /* renamed from: z, reason: collision with root package name */
    public final y f37536z;

    public w(C4903n request, t protocol, String message, int i, l lVar, m mVar, y body, S0.c cVar, w wVar, w wVar2, w wVar3, long j9, long j10, C4088vv c4088vv, B trailersSource) {
        kotlin.jvm.internal.h.e(request, "request");
        kotlin.jvm.internal.h.e(protocol, "protocol");
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(body, "body");
        kotlin.jvm.internal.h.e(trailersSource, "trailersSource");
        this.f37530n = request;
        this.f37531u = protocol;
        this.f37532v = message;
        this.f37533w = i;
        this.f37534x = lVar;
        this.f37535y = mVar;
        this.f37536z = body;
        this.f37522A = cVar;
        this.f37523B = wVar;
        this.f37524C = wVar2;
        this.f37525D = wVar3;
        this.f37526E = j9;
        this.f37527F = j10;
        this.f37528G = c4088vv;
        this.f37529H = trailersSource;
    }

    public final v b() {
        v vVar = new v();
        vVar.f37510c = -1;
        vVar.f37514g = y.f37539n;
        vVar.f37521o = B.f37343a;
        vVar.f37508a = this.f37530n;
        vVar.f37509b = this.f37531u;
        vVar.f37510c = this.f37533w;
        vVar.f37511d = this.f37532v;
        vVar.f37512e = this.f37534x;
        vVar.f37513f = this.f37535y.d();
        vVar.f37514g = this.f37536z;
        vVar.f37515h = this.f37522A;
        vVar.i = this.f37523B;
        vVar.f37516j = this.f37524C;
        vVar.f37517k = this.f37525D;
        vVar.f37518l = this.f37526E;
        vVar.f37519m = this.f37527F;
        vVar.f37520n = this.f37528G;
        vVar.f37521o = this.f37529H;
        return vVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37536z.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f37531u + ", code=" + this.f37533w + ", message=" + this.f37532v + ", url=" + ((o) this.f37530n.f40101u) + '}';
    }
}
