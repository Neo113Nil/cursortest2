package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class fi {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        ci ciVar = (ci) this.e.get(str);
        if ((ciVar != null ? ciVar.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                ciVar.a.a(ciVar.b.parseResult(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new qh(i2, intent));
        return true;
    }

    public abstract void b(int i, uh uhVar, Object obj);

    public final ei c(String str, uh uhVar, rh rhVar) {
        str.getClass();
        e(str);
        this.e.put(str, new ci(uhVar, rhVar));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            rhVar.a(obj);
        }
        Bundle bundle = this.g;
        qh qhVar = (qh) vwb.O(bundle, qh.class, str);
        if (qhVar != null) {
            bundle.remove(str);
            rhVar.a(uhVar.parseResult(qhVar.a, qhVar.b));
        }
        return new ei(this, str, uhVar, 1);
    }

    public final ei d(final String str, dzf dzfVar, final uh uhVar, final rh rhVar) {
        str.getClass();
        dzfVar.getClass();
        uhVar.getClass();
        rhVar.getClass();
        nyf lifecycle = dzfVar.getLifecycle();
        if (lifecycle.b().compareTo(lyf.d) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(dzfVar);
            lyf b = lifecycle.b();
            sb.append(" is attempting to register while current state is ");
            sb.append(b);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        di diVar = (di) linkedHashMap.get(str);
        if (diVar == null) {
            diVar = new di(lifecycle);
        }
        uyf uyfVar = new uyf() { // from class: bi
            @Override // defpackage.uyf
            public final void Q(dzf dzfVar2, kyf kyfVar) {
                fi fiVar = fi.this;
                LinkedHashMap linkedHashMap2 = fiVar.e;
                kyf kyfVar2 = kyf.ON_START;
                String str2 = str;
                if (kyfVar2 != kyfVar) {
                    if (kyf.ON_STOP == kyfVar) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (kyf.ON_DESTROY == kyfVar) {
                            fiVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = fiVar.g;
                LinkedHashMap linkedHashMap3 = fiVar.f;
                uh uhVar2 = uhVar;
                rh rhVar2 = rhVar;
                linkedHashMap2.put(str2, new ci(uhVar2, rhVar2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    rhVar2.a(obj);
                }
                qh qhVar = (qh) vwb.O(bundle, qh.class, str2);
                if (qhVar != null) {
                    bundle.remove(str2);
                    rhVar2.a(uhVar2.parseResult(qhVar.a, qhVar.b));
                }
            }
        };
        diVar.a.a(uyfVar);
        diVar.b.add(uyfVar);
        linkedHashMap.put(str, diVar);
        return new ei(this, str, uhVar, 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new n86(new h5d(0, e1.v, new d0p(23))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        wvs.h("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder u = ouj.u("Dropping pending result for request ", str, ": ");
            u.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", u.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((qh) vwb.O(bundle, qh.class, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        di diVar = (di) linkedHashMap2.get(str);
        if (diVar != null) {
            ArrayList arrayList = diVar.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                diVar.a.d((uyf) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
