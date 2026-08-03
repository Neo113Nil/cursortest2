package y4;

import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final String f8755j = o4.o.f("StopWorkRunnable");

    /* renamed from: g, reason: collision with root package name */
    public final p4.n f8756g;

    /* renamed from: h, reason: collision with root package name */
    public final p4.i f8757h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8758i;

    public m(p4.n nVar, p4.i iVar, boolean z10) {
        this.f8756g = nVar;
        this.f8757h = iVar;
        this.f8758i = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean c3;
        p4.o oVar;
        if (this.f8758i) {
            p4.e eVar = this.f8756g.f5498f;
            p4.i iVar = this.f8757h;
            eVar.getClass();
            String str = iVar.f5478a.f8307a;
            synchronized (eVar.f5474r) {
                try {
                    o4.o.d().a(p4.e.f5462s, "Processor stopping foreground work " + str);
                    oVar = (p4.o) eVar.f5468l.remove(str);
                    if (oVar != null) {
                        eVar.f5470n.remove(str);
                    }
                } finally {
                }
            }
            c3 = p4.e.c(str, oVar);
        } else {
            p4.e eVar2 = this.f8756g.f5498f;
            p4.i iVar2 = this.f8757h;
            eVar2.getClass();
            String str2 = iVar2.f5478a.f8307a;
            synchronized (eVar2.f5474r) {
                try {
                    p4.o oVar2 = (p4.o) eVar2.f5469m.remove(str2);
                    if (oVar2 == null) {
                        o4.o.d().a(p4.e.f5462s, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) eVar2.f5470n.get(str2);
                        if (set != null && set.contains(iVar2)) {
                            o4.o.d().a(p4.e.f5462s, "Processor stopping background work " + str2);
                            eVar2.f5470n.remove(str2);
                            c3 = p4.e.c(str2, oVar2);
                        }
                    }
                    c3 = false;
                } finally {
                }
            }
        }
        o4.o.d().a(f8755j, "StopWorkRunnable for " + this.f8757h.f5478a.f8307a + "; Processor.stopWork = " + c3);
    }
}
