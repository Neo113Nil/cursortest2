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
    public final n f39654n;

    /* renamed from: u, reason: collision with root package name */
    public final i f39655u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39656v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f39657w;

    public a(g gVar, n url) {
        h.e(url, "url");
        this.f39657w = gVar;
        this.f39654n = url;
        this.f39655u = new i(((r) gVar.f39673c.f38405v).f41984n.L());
    }

    @Override // y8.x
    public final z L() {
        return this.f39655u;
    }

    public final void a(l trailers) {
        i8.r rVar;
        i8.b bVar;
        h.e(trailers, "trailers");
        g gVar = this.f39657w;
        int i = gVar.f39674d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + gVar.f39674d);
        }
        i iVar = this.f39655u;
        z zVar = iVar.f41958e;
        iVar.f41958e = z.f41999d;
        zVar.a();
        zVar.b();
        gVar.f39674d = 6;
        if (trailers.size() <= 0 || (rVar = gVar.f39671a) == null || (bVar = rVar.f38203j) == null) {
            return;
        }
        n8.g.b(bVar, this.f39654n, trailers);
    }

    @Override // y8.x
    public long d(long j6, y8.e sink) {
        g gVar = this.f39657w;
        h.e(sink, "sink");
        try {
            return ((r) gVar.f39673c.f38405v).d(j6, sink);
        } catch (IOException e9) {
            gVar.f39672b.d();
            a(g.f39670f);
            throw e9;
        }
    }
}
