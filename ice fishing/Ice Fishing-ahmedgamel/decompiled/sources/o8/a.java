package o8;

import i8.l;
import i8.n;
import java.io.IOException;
import kotlin.jvm.internal.h;
import y8.i;
import y8.r;
import y8.x;
import y8.z;

/* loaded from: classes2.dex */
public abstract class a implements x {

    /* renamed from: n, reason: collision with root package name */
    public final n f39762n;

    /* renamed from: u, reason: collision with root package name */
    public final i f39763u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39764v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f39765w;

    public a(g gVar, n url) {
        h.e(url, "url");
        this.f39765w = gVar;
        this.f39762n = url;
        this.f39763u = new i(((r) gVar.f39781c.f38917v).f41955n.L());
    }

    @Override // y8.x
    public final z L() {
        return this.f39763u;
    }

    public final void a(l trailers) {
        i8.r rVar;
        i8.b bVar;
        h.e(trailers, "trailers");
        g gVar = this.f39765w;
        int i = gVar.f39782d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + gVar.f39782d);
        }
        i iVar = this.f39763u;
        z zVar = iVar.f41929e;
        iVar.f41929e = z.f41970d;
        zVar.a();
        zVar.b();
        gVar.f39782d = 6;
        if (trailers.size() <= 0 || (rVar = gVar.f39779a) == null || (bVar = rVar.f38322j) == null) {
            return;
        }
        n8.g.b(bVar, this.f39762n, trailers);
    }

    @Override // y8.x
    public long d(long j6, y8.e sink) {
        g gVar = this.f39765w;
        h.e(sink, "sink");
        try {
            return ((r) gVar.f39781c.f38917v).d(j6, sink);
        } catch (IOException e9) {
            gVar.f39780b.d();
            a(g.f39778f);
            throw e9;
        }
    }
}
