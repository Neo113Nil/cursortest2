package f1;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public f8.c f2273e;

    /* renamed from: f, reason: collision with root package name */
    public long f2274f = 9205357640488583168L;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Shader f2275g;

    public n(Shader shader) {
        this.f2275g = shader;
    }

    @Override // f1.d0
    public final void g(float f10, long j3, l6.l lVar) {
        Paint paint = (Paint) lVar.f4199b;
        f8.c cVar = this.f2273e;
        if (cVar == null || !e1.e.a(this.f2274f, j3)) {
            if (e1.e.e(j3)) {
                this.f2273e = null;
                this.f2274f = 9205357640488583168L;
                cVar = null;
            } else {
                cVar = this.f2273e;
                if (cVar == null) {
                    cVar = new f8.c(10, false);
                    this.f2273e = cVar;
                }
                cVar.f2340h = this.f2275g;
                this.f2273e = cVar;
                this.f2274f = j3;
            }
        }
        long b2 = d0.b(paint.getColor());
        long j6 = q.f2277b;
        if (!q.c(b2, j6)) {
            lVar.f(j6);
        }
        if (!pc.j.a((Shader) lVar.f4200c, cVar != null ? (Shader) cVar.f2340h : null)) {
            lVar.h(cVar != null ? (Shader) cVar.f2340h : null);
        }
        if (paint.getAlpha() / 255.0f == f10) {
            return;
        }
        lVar.d(f10);
    }
}
