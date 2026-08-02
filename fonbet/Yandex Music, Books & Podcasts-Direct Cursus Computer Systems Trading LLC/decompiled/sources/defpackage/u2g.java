package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class u2g extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ w2g l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2g(w2g w2gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = w2gVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                u2g u2gVar = new u2g(this.l, continuation, 0);
                u2gVar.k = obj;
                return u2gVar;
            case 1:
                u2g u2gVar2 = new u2g(this.l, continuation, 1);
                u2gVar2.k = obj;
                return u2gVar2;
            default:
                u2g u2gVar3 = new u2g(this.l, continuation, 2);
                u2gVar3.k = obj;
                return u2gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((u2g) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((u2g) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((u2g) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109 A[SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Iterator it;
        Continuation continuation = null;
        boolean z2 = true;
        r2 = true;
        boolean z3 = true;
        z2 = true;
        z2 = true;
        int i = 0;
        switch (this.j) {
            case 0:
                List list = (List) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                w2g w2gVar = this.l;
                h2g h2gVar = w2gVar.a;
                List list2 = list;
                boolean z4 = list2 instanceof Collection;
                if (!z4 || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (!((s2g) it2.next()).equals(q2g.a)) {
                            if (!z4 || !list2.isEmpty()) {
                                Iterator it3 = list2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((s2g) it3.next()).equals(r2g.a)) {
                                            q43 q43Var = (q43) w2gVar.f.a;
                                            q43Var.b(q43Var.a, 2, null, null);
                                            kzp kzpVar = w2gVar.i;
                                            if (kzpVar != null) {
                                                kzpVar.invoke(new d73(h2gVar));
                                            }
                                        }
                                    }
                                }
                            }
                            if (!z4 || !list2.isEmpty()) {
                                Iterator it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    if (!((s2g) it4.next()).equals(p2g.a)) {
                                        return Boolean.valueOf(z2);
                                    }
                                }
                            }
                            kzp kzpVar2 = w2gVar.i;
                            if (kzpVar2 != null) {
                                kzpVar2.invoke(new c73(h2gVar));
                            }
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 1:
                List list3 = (List) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                w2g w2gVar2 = this.l;
                List list4 = list3;
                boolean z5 = list4 instanceof Collection;
                if (!z5 || !list4.isEmpty()) {
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        if (!((s2g) it5.next()).equals(r2g.a)) {
                            z = false;
                            w2gVar2.g = z;
                            w2gVar2.k = false;
                            if (z5 || !list4.isEmpty()) {
                                it = list4.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((s2g) it.next()).equals(q2g.a)) {
                                            z3 = false;
                                        }
                                    }
                                }
                            }
                            return Boolean.valueOf(z3);
                        }
                    }
                }
                z = true;
                w2gVar2.g = z;
                w2gVar2.k = false;
                if (z5) {
                }
                it = list4.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                return Boolean.valueOf(z3);
            default:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                w2g w2gVar3 = this.l;
                String str = ((frt) w2gVar3.l.getValue()).c().a;
                q2g q2gVar = q2g.a;
                xdr a = ydr.a(q2gVar);
                xdr a2 = ydr.a(q2gVar);
                i2g i2gVar = w2gVar3.b;
                str.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(frt.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                String str2 = ((frt) qdcVar.C(I)).c().a;
                str2.getClass();
                e15 e15Var = i2gVar.a;
                k05 k05Var = new k05(e15Var.h("playlist", "playlist_track"), e15Var, str2, str, 1);
                int i2 = 10;
                ox6.B(zsd.k0(zsd.a0(k05Var, new t83(i2)), dm6.a), mm6Var, new t2g(w2gVar3, a, i));
                ox6.B(new eno(new ptd(w2gVar3, continuation, 23)), mm6Var, new t2g(w2gVar3, a2, z2 ? 1 : 0));
                u21 u21Var = new u21(10, a, a2, new t81(3, i2, continuation));
                x97.y(mm6Var, null, null, new v2g(u21Var, w2gVar3, continuation, i), 3);
                x97.y(mm6Var, null, null, new v2g(u21Var, w2gVar3, continuation, z2 ? 1 : 0), 3);
                return Unit.a;
        }
    }
}
