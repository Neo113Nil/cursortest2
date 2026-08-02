package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class yx7 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx7(int i, gc8 gc8Var, String str, Object obj) {
        super(1);
        this.r = 1;
        this.s = i;
        this.t = gc8Var;
        this.u = str;
        this.v = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                if (obj == ((zx7) this.t)) {
                    xq0.q("A derived state calculation cannot read itself");
                    break;
                } else {
                    if (obj instanceof mer) {
                        int i = ((bqe) this.u).a;
                        cpi cpiVar = (cpi) this.v;
                        cpiVar.i(Math.min(i - this.s, cpiVar.f(Integer.MAX_VALUE, obj)), obj);
                    }
                    break;
                }
            case 1:
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                int i2 = this.s;
                if (i2 >= 0 && i2 < length) {
                    break;
                } else {
                    gc8 gc8Var = (gc8) this.t;
                    StringBuilder q = k5r.q(i2, "Index out of bound (", ") for mutation ");
                    q.append((String) this.u);
                    q.append(" (");
                    q.append(length);
                    q.append(')');
                    gc8Var.I(new IndexOutOfBoundsException(q.toString()));
                    break;
                }
            case 2:
                jsk jskVar = (jsk) obj;
                ksk kskVar = (ksk) this.v;
                mfh mfhVar = (mfh) this.t;
                g3e g3eVar = (g3e) this.u;
                int i3 = g3eVar.b;
                lbs lbsVar = g3eVar.a;
                l7t l7tVar = g3eVar.c;
                dds ddsVar = (dds) g3eVar.d.invoke();
                lbsVar.a(bxj.b, szf.K(mfhVar, i3, l7tVar, ddsVar != null ? ddsVar.a : null, mfhVar.getLayoutDirection() == xof.b, kskVar.a), this.s, kskVar.a);
                jsk.g(jskVar, kskVar, Math.round(-lbsVar.a.e()), 0);
                break;
            case 3:
                ewm ewmVar = (ewm) obj;
                ewmVar.getClass();
                if (ewmVar instanceof dwm) {
                    ((ConcurrentHashMap) this.t).put(Integer.valueOf(this.s), new jif(((dwm) ewmVar).a));
                } else if (ewmVar instanceof cwm) {
                    ((Function1) this.u).invoke(((cwm) ewmVar).a);
                }
                ((CountDownLatch) this.v).countDown();
                break;
            default:
                jsk jskVar2 = (jsk) obj;
                ksk kskVar2 = (ksk) this.v;
                mfh mfhVar2 = (mfh) this.t;
                c1u c1uVar = (c1u) this.u;
                int i4 = c1uVar.b;
                lbs lbsVar2 = c1uVar.a;
                l7t l7tVar2 = c1uVar.c;
                dds ddsVar2 = (dds) c1uVar.d.invoke();
                lbsVar2.a(bxj.a, szf.K(mfhVar2, i4, l7tVar2, ddsVar2 != null ? ddsVar2.a : null, false, kskVar2.a), this.s, kskVar2.b);
                jsk.g(jskVar2, kskVar2, 0, Math.round(-lbsVar2.a.e()));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx7(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(1);
        this.r = i2;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.s = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx7(ConcurrentHashMap concurrentHashMap, int i, Function1 function1, CountDownLatch countDownLatch) {
        super(1);
        this.r = 3;
        this.t = concurrentHashMap;
        this.s = i;
        this.u = function1;
        this.v = countDownLatch;
    }
}
