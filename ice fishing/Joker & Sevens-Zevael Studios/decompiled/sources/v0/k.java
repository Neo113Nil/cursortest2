package v0;

import ac.o;
import h2.u;
import java.util.Arrays;
import m0.l;
import m0.r;
import m0.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final j f7050a = new j(new u(28), new nd.d(11));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object b(Object[] objArr, i iVar, String str, oc.a aVar, r rVar, int i10, int i11) {
        Object[] objArr2;
        final Object obj;
        Object e10;
        if ((i11 & 2) != 0) {
            iVar = f7050a;
        }
        final i iVar2 = iVar;
        if ((i11 & 4) != 0) {
            str = null;
        }
        long j3 = rVar.T;
        if (str == null || str.length() == 0) {
            u2.b.i(36);
            str = Long.toString(j3, 36);
            pc.j.d(str, "toString(...)");
        }
        final String str2 = str;
        pc.j.c(iVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final e eVar = (e) rVar.j(g.f7043a);
        Object M = rVar.M();
        Object obj2 = l.f4646a;
        if (M == obj2) {
            Object b2 = (eVar == null || (e10 = eVar.e(str2)) == null) ? null : iVar2.b(e10);
            if (b2 == null) {
                b2 = aVar.invoke();
            }
            objArr2 = objArr;
            Object bVar = new b(iVar2, eVar, str2, b2, objArr2);
            rVar.i0(bVar);
            M = bVar;
        } else {
            objArr2 = objArr;
        }
        final b bVar2 = (b) M;
        Object obj3 = Arrays.equals(objArr2, bVar2.f7032k) ? bVar2.f7031j : null;
        if (obj3 == null) {
            obj3 = aVar.invoke();
        }
        boolean h10 = rVar.h(bVar2) | ((((i10 & 112) ^ 48) > 32 && rVar.h(iVar2)) || (i10 & 48) == 32) | rVar.h(eVar) | rVar.f(str2) | rVar.h(obj3) | rVar.h(objArr2);
        Object M2 = rVar.M();
        if (h10 || M2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            Object obj4 = new oc.a() { // from class: v0.a
                @Override // oc.a
                public final Object invoke() {
                    boolean z10;
                    b bVar3 = b.this;
                    e eVar2 = bVar3.f7029h;
                    e eVar3 = eVar;
                    boolean z11 = true;
                    if (eVar2 != eVar3) {
                        bVar3.f7029h = eVar3;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String str3 = bVar3.f7030i;
                    String str4 = str2;
                    if (pc.j.a(str3, str4)) {
                        z11 = z10;
                    } else {
                        bVar3.f7030i = str4;
                    }
                    bVar3.f7028g = iVar2;
                    bVar3.f7031j = obj;
                    bVar3.f7032k = objArr3;
                    a5.c cVar = bVar3.f7033l;
                    if (cVar != null && z11) {
                        cVar.R();
                        bVar3.f7033l = null;
                        bVar3.a();
                    }
                    return o.f277a;
                }
            };
            rVar.i0(obj4);
            M2 = obj4;
        } else {
            obj = obj3;
        }
        z.g((oc.a) M2, rVar);
        return obj;
    }

    public static final d c(r rVar) {
        rVar.X(1967008021);
        Object[] objArr = new Object[0];
        Object M = rVar.M();
        if (M == l.f4646a) {
            M = new e.b(13);
            rVar.i0(M);
        }
        d dVar = (d) b(Arrays.copyOf(objArr, 0), d.f7035k, null, (oc.a) M, rVar, 3456, 0);
        dVar.f7038i = (e) rVar.j(g.f7043a);
        rVar.q(false);
        return dVar;
    }
}
