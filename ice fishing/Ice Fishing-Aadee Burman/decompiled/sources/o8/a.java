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
    public final n f39651n;

    /* renamed from: u, reason: collision with root package name */
    public final i f39652u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39653v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f39654w;

    public a(g gVar, n url) {
        h.e(url, "url");
        this.f39654w = gVar;
        this.f39651n = url;
        this.f39652u = new i(((r) gVar.f39670c.f38405v).f41981n.L());
    }

    @Override // y8.x
    public final z L() {
        return this.f39652u;
    }

    public final void a(l trailers) {
        i8.r rVar;
        i8.b bVar;
        h.e(trailers, "trailers");
        g gVar = this.f39654w;
        int i = gVar.f39671d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + gVar.f39671d);
        }
        i iVar = this.f39652u;
        z zVar = iVar.f41955e;
        iVar.f41955e = z.f41996d;
        zVar.a();
        zVar.b();
        gVar.f39671d = 6;
        if (trailers.size() <= 0 || (rVar = gVar.f39668a) == null || (bVar = rVar.f38203j) == null) {
            return;
        }
        n8.g.b(bVar, this.f39651n, trailers);
    }

    @Override // y8.x
    public long d(long j6, y8.e sink) {
        g gVar = this.f39654w;
        h.e(sink, "sink");
        try {
            return ((r) gVar.f39670c.f38405v).d(j6, sink);
        } catch (IOException e9) {
            gVar.f39669b.d();
            a(g.f39667f);
            throw e9;
        }
    }
}
