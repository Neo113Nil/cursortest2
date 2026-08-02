package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class oon extends qon {
    public final ArrayList d = new ArrayList();
    public final x3n e;

    public oon(x3n x3nVar) {
        boolean z;
        this.e = x3nVar;
        Iterator it = Collections.unmodifiableCollection((Collection) ((lum) x3nVar.d).c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (!((qon) it.next()).b) {
                z = false;
                break;
            }
        }
        s(z);
    }

    @Override // defpackage.qon
    public final int b(qon qonVar, opn opnVar, int i) {
        lum lumVar = (lum) this.e.d;
        qon qonVar2 = (qon) lumVar.y(i);
        return qonVar2.b(qonVar2, opnVar, lumVar.z(i));
    }

    @Override // defpackage.qon
    public final int c() {
        Iterator it = ((List) ((lum) this.e.d).b).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((an6) it.next()).a();
        }
        return i;
    }

    @Override // defpackage.qon
    public final long d(int i) {
        x3n x3nVar = this.e;
        String l0 = x3nVar.l0(i);
        au1 au1Var = (au1) x3nVar.b;
        lum lumVar = (lum) x3nVar.d;
        long d = ((qon) lumVar.y(i)).d(lumVar.z(i));
        au1Var.getClass();
        String str = l0 + d;
        HashMap hashMap = (HashMap) au1Var.c;
        Long l = (Long) hashMap.get(str);
        if (l == null) {
            long j = au1Var.b;
            au1Var.b = 1 + j;
            l = Long.valueOf(j);
            hashMap.put(str, l);
        }
        return l.longValue();
    }

    @Override // defpackage.qon
    public final int f(int i) {
        x3n x3nVar = this.e;
        String l0 = x3nVar.l0(i);
        ppe ppeVar = (ppe) x3nVar.c;
        lum lumVar = (lum) x3nVar.d;
        int f = ((qon) lumVar.y(i)).f(lumVar.z(i));
        ppeVar.getClass();
        z4k z4kVar = new z4k(l0, Integer.valueOf(f));
        HashMap hashMap = ppeVar.b;
        Integer num = (Integer) hashMap.get(z4kVar);
        if (num == null) {
            int i2 = ppeVar.a;
            ppeVar.a = i2 + 1;
            num = Integer.valueOf(i2);
            hashMap.put(z4kVar, num);
            ppeVar.c.put(num, z4kVar);
        }
        return num.intValue();
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        lum lumVar = (lum) this.e.d;
        ((qon) lumVar.y(i)).j(opnVar, lumVar.z(i));
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        x3n x3nVar = this.e;
        z4k z4kVar = (z4k) ((ppe) x3nVar.c).c.get(Integer.valueOf(i));
        String str = (String) z4kVar.a;
        int intValue = ((Integer) z4kVar.b).intValue();
        Object obj = ((Map) ((lum) x3nVar.d).a).get(str);
        if (obj != null) {
            return ((qon) obj).m(viewGroup, intValue);
        }
        xq0.x(f1d.g("No source found for space type: ", str));
        return null;
    }

    @Override // defpackage.qon
    public final void r(ron ronVar) {
        super.r(ronVar);
        x3n x3nVar = this.e;
        ((qj) x3nVar.a).registerObserver(ronVar);
        Iterator it = Collections.unmodifiableCollection((Collection) ((lum) x3nVar.d).c).iterator();
        while (it.hasNext()) {
            ((qon) it.next()).r(ronVar);
        }
        this.d.add(ronVar);
    }

    @Override // defpackage.qon
    public final void t(ron ronVar) {
        super.t(ronVar);
        x3n x3nVar = this.e;
        ((qj) x3nVar.a).unregisterObserver(ronVar);
        Iterator it = Collections.unmodifiableCollection((Collection) ((lum) x3nVar.d).c).iterator();
        while (it.hasNext()) {
            ((qon) it.next()).t(ronVar);
        }
        this.d.remove(ronVar);
    }
}
