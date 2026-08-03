package g1;

import s.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final u f2461a;

    static {
        q qVar = d.f2433e;
        int i10 = qVar.f2428c;
        e eVar = new e(qVar, qVar, 1);
        int i11 = qVar.f2428c;
        l lVar = d.f2452x;
        int i12 = (lVar.f2428c << 6) | i11;
        g gVar = new g(qVar, lVar, 0);
        int i13 = (i11 << 6) | lVar.f2428c;
        g gVar2 = new g(lVar, qVar, 0);
        u uVar = s.l.f6301a;
        u uVar2 = new u();
        uVar2.h(i10 | (i10 << 6), eVar);
        uVar2.h(i12, gVar);
        uVar2.h(i13, gVar2);
        f2461a = uVar2;
    }
}
