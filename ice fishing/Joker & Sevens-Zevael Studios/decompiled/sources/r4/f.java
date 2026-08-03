package r4;

import android.os.Handler;
import o4.o;
import x4.j;
import y4.u;
import y4.v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f6059h;

    public /* synthetic */ f(g gVar, int i10) {
        this.f6058g = i10;
        this.f6059h = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6058g) {
            case 0:
                g.a(this.f6059h);
                return;
            default:
                g gVar = this.f6059h;
                if (gVar.f6067m != 0) {
                    o.d().a(g.f6060s, "Already started work for " + gVar.f6063i);
                    return;
                }
                gVar.f6067m = 1;
                o.d().a(g.f6060s, "onAllConstraintsMet for " + gVar.f6063i);
                if (!gVar.f6064j.f6079j.h(gVar.f6072r, null)) {
                    gVar.b();
                    return;
                }
                v vVar = gVar.f6064j.f6078i;
                j jVar = gVar.f6063i;
                synchronized (vVar.f8786d) {
                    o.d().a(v.f8782e, "Starting timer for " + jVar);
                    vVar.a(jVar);
                    u uVar = new u(vVar, jVar);
                    vVar.f8784b.put(jVar, uVar);
                    vVar.f8785c.put(jVar, gVar);
                    ((Handler) vVar.f8783a.f4957h).postDelayed(uVar, 600000L);
                }
                return;
        }
    }
}
