package td;

import ac.o;
import androidx.lifecycle.m0;
import androidx.lifecycle.t0;
import bc.n;
import bd.e0;
import bd.q;
import bd.u;
import id.i;
import pc.j;
import yc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final i f6558b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f6559c;

    /* renamed from: d, reason: collision with root package name */
    public final q f6560d;

    public f(i iVar) {
        j.e(iVar, "repository");
        this.f6558b = iVar;
        e0 a6 = u.a(new d(n.L(new b("Start Game", a.f6543g), new b("Shop", a.f6544h), new b("Best Scores", a.f6546j), new b("Game Rules", a.f6545i)), new qd.j(0, 0), 0));
        this.f6559c = a6;
        this.f6560d = new q(a6);
        a0.q(m0.h(this), null, new ld.c(this, null, 4), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(f fVar, hc.c cVar) {
        e eVar;
        int i10;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i11 = eVar.f6557j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f6557j = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f6555h;
                i10 = eVar.f6557j;
                if (i10 != 0) {
                    v6.a.W(obj);
                    i iVar = fVar.f6558b;
                    eVar.f6554g = fVar;
                    eVar.f6557j = 1;
                    obj = iVar.a();
                    Object obj2 = gc.a.f2559g;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = eVar.f6554g;
                    v6.a.W(obj);
                }
                int intValue = ((Number) obj).intValue();
                e0 e0Var = fVar.f6559c;
                e0Var.h(null, d.a((d) e0Var.getValue(), null, intValue, 3));
                return o.f277a;
            }
        }
        eVar = new e(fVar, cVar);
        Object obj3 = eVar.f6555h;
        i10 = eVar.f6557j;
        if (i10 != 0) {
        }
        int intValue2 = ((Number) obj3).intValue();
        e0 e0Var2 = fVar.f6559c;
        e0Var2.h(null, d.a((d) e0Var2.getValue(), null, intValue2, 3));
        return o.f277a;
    }
}
