package k2;

import android.graphics.Typeface;
import yc.a0;
import yc.s1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final u7.d f3602a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3603b;

    /* renamed from: c, reason: collision with root package name */
    public final x4.e f3604c;

    /* renamed from: d, reason: collision with root package name */
    public final i f3605d;

    /* renamed from: e, reason: collision with root package name */
    public final f8.c f3606e;

    public f(u7.d dVar, a aVar) {
        x4.e eVar = g.f3607a;
        x4.e eVar2 = g.f3607a;
        i iVar = new i();
        h hVar = i.f3608a;
        zc.d dVar2 = o2.h.f5177a;
        hVar.getClass();
        a0.a(v6.a.K(hVar, dVar2).d(fc.j.f2348g).d(new s1(null)));
        f8.c cVar = new f8.c(21);
        this.f3602a = dVar;
        this.f3603b = aVar;
        this.f3604c = eVar;
        this.f3605d = iVar;
        this.f3606e = cVar;
        new e(0, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091 A[Catch: Exception -> 0x0099, TRY_ENTER, TryCatch #1 {Exception -> 0x0099, blocks: (B:25:0x003f, B:27:0x0052, B:30:0x0057, B:32:0x005b, B:33:0x0068, B:49:0x0091, B:50:0x0098, B:53:0x0064), top: B:24:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t a(s sVar) {
        Typeface b2;
        t tVar;
        Object remove;
        x4.e eVar = this.f3604c;
        synchronized (((m6.i) eVar.f8294g)) {
            try {
                t tVar2 = (t) ((s.q) eVar.f8295h).a(sVar);
                if (tVar2 != null) {
                    if (tVar2.f3626h) {
                        return tVar2;
                    }
                    s.q qVar = (s.q) eVar.f8295h;
                    synchronized (qVar.f6319c) {
                        b4.l lVar = qVar.f6318b;
                        lVar.getClass();
                        remove = lVar.f997a.remove(sVar);
                        if (remove != null) {
                            qVar.f6320d--;
                        }
                    }
                }
                try {
                    this.f3605d.getClass();
                    r rVar = sVar.f3620a;
                    q qVar2 = (q) this.f3606e.f2340h;
                    int i10 = sVar.f3622c;
                    l lVar2 = sVar.f3621b;
                    if (rVar != null && !(rVar instanceof b)) {
                        if (rVar instanceof n) {
                            b2 = qVar2.c((n) rVar, lVar2, i10);
                            tVar = new t(b2);
                            if (tVar == null) {
                                throw new IllegalStateException("Could not load font");
                            }
                            synchronized (((m6.i) eVar.f8294g)) {
                                if (((s.q) eVar.f8295h).a(sVar) == null && tVar.f3626h) {
                                    ((s.q) eVar.f8295h).b(sVar, tVar);
                                }
                            }
                            return tVar;
                        }
                        tVar = null;
                        if (tVar == null) {
                        }
                    }
                    b2 = qVar2.b(lVar2, i10);
                    tVar = new t(b2);
                    if (tVar == null) {
                    }
                } catch (Exception e10) {
                    throw new IllegalStateException("Could not load font", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final t b(r rVar, l lVar, int i10, int i11) {
        a aVar = this.f3603b;
        aVar.getClass();
        int i12 = aVar.f3599g;
        l lVar2 = (i12 == 0 || i12 == Integer.MAX_VALUE) ? lVar : new l(uc.e.h(lVar.f3615g + i12, 1, 1000));
        this.f3602a.getClass();
        return a(new s(rVar, lVar2, i10, i11, null));
    }
}
