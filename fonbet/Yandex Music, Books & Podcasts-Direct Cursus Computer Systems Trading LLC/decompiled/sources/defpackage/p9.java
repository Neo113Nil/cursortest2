package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import kotlin.Unit;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes3.dex */
public abstract class p9 implements fft, lci, ksd {
    public Object a;

    public p9(int i) {
        switch (i) {
            case 1:
                char[] cArr = xut.a;
                this.a = new ArrayDeque(20);
                break;
            case 7:
                this.a = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                break;
            case 8:
                this.a = Collections.newSetFromMap(new IdentityHashMap());
                break;
            case 12:
                yyd yydVar = yyd.c;
                this.a = yyd.c;
                break;
            case 15:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = btf.b(new z3(4, this));
                break;
        }
    }

    public abstract void A(View view);

    public abstract void B(Object obj);

    public String C(Object obj) {
        String uuid = UUID.randomUUID().toString();
        ((LinkedHashMap) this.a).put(uuid, obj);
        return uuid;
    }

    public void D(String str, String str2) {
        ((TreeMap) this.a).put(str, str2);
    }

    public abstract String E(Object obj);

    public void F(Object obj, boolean z) {
        Set set = (Set) this.a;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                v();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            w();
        }
    }

    @Override // defpackage.fft
    public View e() {
        return (View) ((jyr) this.a).getValue();
    }

    public void k(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2, pm9 pm9Var) {
        j(view, e23Var, dp8Var, dp8Var2);
    }

    public ja8 l(e23 e23Var, String str, rct rctVar) {
        gc8 gc8Var = e23Var.a;
        rv8 divData = gc8Var.getDivData();
        if (divData != null) {
            xzb xzbVar = e23Var.b;
            zzb zzbVar = xzbVar instanceof zzb ? (zzb) xzbVar : null;
            if (zzbVar != null) {
                xqn xqnVar = new xqn();
                dw8 dataTag = gc8Var.getDataTag();
                rctVar.H(new qas(xqnVar, gc8Var, str, this, e23Var, 2));
                return zzbVar.d.k(str, ((efb) this.a).a(divData, dataTag), true, new gcp(21, xqnVar, rctVar));
            }
        }
        return ja8.b0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(e23 e23Var, View view, jc8 jc8Var, pm9 pm9Var) {
        e23 e23Var2;
        View view2;
        Unit unit;
        dp8 dp8Var;
        p9 p9Var;
        pm9 pm9Var2;
        view.getClass();
        jc8 div = ((f29) view).getDiv();
        if (jc8Var == div) {
            return;
        }
        ((gp8) this.a).d(e23Var, view, jc8Var, div);
        if (pm9Var != null) {
            dp8 d = jc8Var.d();
            if (div != null) {
                dp8Var = div.d();
                e23Var2 = e23Var;
                view2 = view;
                pm9Var2 = pm9Var;
                p9Var = this;
            } else {
                dp8Var = null;
                p9Var = this;
                e23Var2 = e23Var;
                view2 = view;
                pm9Var2 = pm9Var;
            }
            p9Var.k(view2, e23Var2, d, dp8Var, pm9Var2);
            unit = Unit.a;
        } else {
            e23Var2 = e23Var;
            view2 = view;
            unit = null;
        }
        if (unit == null) {
            j(view2, e23Var2, jc8Var.d(), div != null ? div.d() : null);
        }
    }

    public void n(String str) {
        ((LinkedHashMap) this.a).remove(str);
    }

    public View o(ViewGroup viewGroup) {
        if (((View) this.a) == null) {
            this.a = z(viewGroup);
        }
        View view = (View) this.a;
        if (view != null) {
            return view;
        }
        xq0.x("Required value was null.");
        return null;
    }

    public void p() {
        View view = (View) this.a;
        if (view != null) {
            A(view);
            this.a = null;
        }
    }

    public Object q(co6 co6Var, cg6 cg6Var) {
        return r(co6Var != null ? co6Var.a : null, co6Var != null ? co6Var.b : null, cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(CoverPath coverPath, qo6 qo6Var, cg6 cg6Var) {
        lnv lnvVar;
        int i;
        sce sceVar;
        if (cg6Var instanceof lnv) {
            lnvVar = (lnv) cg6Var;
            int i2 = lnvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lnvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lnvVar.j;
                nm6 nm6Var = nm6.a;
                i = lnvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (coverPath == null || qo6Var == null) {
                        ssg.a(5, "WidgetRecentlyManagerImpl", "[WidgetRecentlyEntitiesLoader] failed to get coverPath or coverType", null);
                        return null;
                    }
                    Context context = (Context) this.a;
                    int s = wct.s();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(cce.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    cce cceVar = (cce) qdcVar.C(I);
                    int c = to6.c(qo6Var, context);
                    int a = to6.a(qo6Var, context);
                    pce pceVar = new pce(context);
                    pceVar.c = coverPath.getPathForSize(s);
                    pceVar.c(c);
                    pceVar.v = Integer.valueOf(a);
                    pceVar.w = null;
                    pceVar.o = Boolean.FALSE;
                    rce a2 = pceVar.a();
                    lnvVar.l = 1;
                    obj = cceVar.a(a2, lnvVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                sceVar = (sce) obj;
                boolean z = sceVar instanceof bqr;
                k5r.v("[WidgetRecentlyEntitiesLoader] bitmap was loaded success = ", z, 4, "WidgetRecentlyManagerImpl", null);
                if (!(sceVar instanceof pgb)) {
                    return null;
                }
                if (z) {
                    return vq2.N(((bqr) sceVar).a, 0, 0, 7);
                }
                b6e.s();
                return null;
            }
        }
        lnvVar = new lnv(this, cg6Var);
        Object obj2 = lnvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lnvVar.l;
        if (i != 0) {
        }
        sceVar = (sce) obj2;
        boolean z2 = sceVar instanceof bqr;
        k5r.v("[WidgetRecentlyEntitiesLoader] bitmap was loaded success = ", z2, 4, "WidgetRecentlyManagerImpl", null);
        if (!(sceVar instanceof pgb)) {
        }
    }

    public tr3 s(String str) {
        str.getClass();
        liq liqVar = (liq) this.a;
        long h = liqVar.h(0L, -1L, str);
        long a = qc6.a(liqVar.a(str));
        if (a < 0) {
            a = 0;
        }
        return new tr3(h, a);
    }

    public String t(String str) {
        String str2 = (String) ((TreeMap) this.a).get(str);
        return str2 == null ? "" : str2;
    }

    public abstract orq u();

    public abstract void v();

    public abstract void w();

    public void x(sgm sgmVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(sgmVar);
        }
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new dm3(2, (dac) this.a);
    }

    public abstract View z(ViewGroup viewGroup);

    public /* synthetic */ p9(Object obj) {
        this.a = obj;
    }

    public void j(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2) {
    }
}
