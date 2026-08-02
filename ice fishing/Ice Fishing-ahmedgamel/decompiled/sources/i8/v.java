package i8;

import com.google.android.gms.internal.ads.C3451jv;
import com.google.android.gms.internal.ads.WP;
import java.io.Closeable;
import s2.C4945n;

/* loaded from: classes2.dex */
public final class v implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public final WP f38363A;

    /* renamed from: B, reason: collision with root package name */
    public final v f38364B;

    /* renamed from: C, reason: collision with root package name */
    public final v f38365C;

    /* renamed from: D, reason: collision with root package name */
    public final v f38366D;

    /* renamed from: E, reason: collision with root package name */
    public final long f38367E;

    /* renamed from: F, reason: collision with root package name */
    public final long f38368F;

    /* renamed from: G, reason: collision with root package name */
    public final C3451jv f38369G;

    /* renamed from: H, reason: collision with root package name */
    public final A f38370H;

    /* renamed from: n, reason: collision with root package name */
    public final C4945n f38371n;

    /* renamed from: u, reason: collision with root package name */
    public final s f38372u;

    /* renamed from: v, reason: collision with root package name */
    public final String f38373v;

    /* renamed from: w, reason: collision with root package name */
    public final int f38374w;

    /* renamed from: x, reason: collision with root package name */
    public final k f38375x;

    /* renamed from: y, reason: collision with root package name */
    public final l f38376y;

    /* renamed from: z, reason: collision with root package name */
    public final x f38377z;

    public v(C4945n request, s protocol, String message, int i, k kVar, l lVar, x body, WP wp, v vVar, v vVar2, v vVar3, long j6, long j9, C3451jv c3451jv, A trailersSource) {
        kotlin.jvm.internal.h.e(request, "request");
        kotlin.jvm.internal.h.e(protocol, "protocol");
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(body, "body");
        kotlin.jvm.internal.h.e(trailersSource, "trailersSource");
        this.f38371n = request;
        this.f38372u = protocol;
        this.f38373v = message;
        this.f38374w = i;
        this.f38375x = kVar;
        this.f38376y = lVar;
        this.f38377z = body;
        this.f38363A = wp;
        this.f38364B = vVar;
        this.f38365C = vVar2;
        this.f38366D = vVar3;
        this.f38367E = j6;
        this.f38368F = j9;
        this.f38369G = c3451jv;
        this.f38370H = trailersSource;
    }

    public final u b() {
        u uVar = new u();
        uVar.f38351c = -1;
        uVar.f38355g = x.f38380n;
        uVar.f38362o = A.f38185a;
        uVar.f38349a = this.f38371n;
        uVar.f38350b = this.f38372u;
        uVar.f38351c = this.f38374w;
        uVar.f38352d = this.f38373v;
        uVar.f38353e = this.f38375x;
        uVar.f38354f = this.f38376y.d();
        uVar.f38355g = this.f38377z;
        uVar.f38356h = this.f38363A;
        uVar.i = this.f38364B;
        uVar.f38357j = this.f38365C;
        uVar.f38358k = this.f38366D;
        uVar.f38359l = this.f38367E;
        uVar.f38360m = this.f38368F;
        uVar.f38361n = this.f38369G;
        uVar.f38362o = this.f38370H;
        return uVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38377z.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f38372u + ", code=" + this.f38374w + ", message=" + this.f38373v + ", url=" + ((n) this.f38371n.f40491u) + '}';
    }
}
