package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class t50 {
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
        q50 q50Var = (q50) this.e.get(str);
        if ((q50Var != null ? q50Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                q50Var.a.a(q50Var.b.c(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    public abstract void b(int i, x40 x40Var, Object obj);

    public final s50 c(String str, x40 x40Var, u40 u40Var) {
        e(str);
        this.e.put(str, new q50(x40Var, u40Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            u40Var.a(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) vng.u(bundle, ActivityResult.class, str);
        if (activityResult != null) {
            bundle.remove(str);
            u40Var.a(x40Var.c(activityResult.getResultCode(), activityResult.getData()));
        }
        return new s50(this, str, x40Var, 1);
    }

    public final s50 d(final String str, pey peyVar, final x40 x40Var, final u40 u40Var) {
        Lifecycle lifecycle = peyVar.getLifecycle();
        if (lifecycle.b().a(Lifecycle.State.STARTED)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(peyVar);
            Lifecycle.State b = lifecycle.b();
            sb.append(" is attempting to register while current state is ");
            sb.append(b);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        r50 r50Var = (r50) linkedHashMap.get(str);
        if (r50Var == null) {
            r50Var = new r50(lifecycle);
        }
        q qVar = new q() { // from class: p50
            @Override // androidx.lifecycle.q
            public final void M1(pey peyVar2, Lifecycle.Event event) {
                t50 t50Var = t50.this;
                LinkedHashMap linkedHashMap2 = t50Var.e;
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                String str2 = str;
                if (event2 != event) {
                    if (Lifecycle.Event.ON_STOP == event) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY == event) {
                            t50Var.f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = t50Var.g;
                LinkedHashMap linkedHashMap3 = t50Var.f;
                x40 x40Var2 = x40Var;
                u40 u40Var2 = u40Var;
                linkedHashMap2.put(str2, new q50(x40Var2, u40Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    u40Var2.a(obj);
                }
                ActivityResult activityResult = (ActivityResult) vng.u(bundle, ActivityResult.class, str2);
                if (activityResult != null) {
                    bundle.remove(str2);
                    u40Var2.a(x40Var2.c(activityResult.getResultCode(), activityResult.getData()));
                }
            }
        };
        r50Var.a.a(qVar);
        r50Var.b.add(qVar);
        linkedHashMap.put(str, r50Var);
        return new s50(this, str, x40Var, 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        ar arVar = new ar(15);
        Iterator it = new a7e(new e2k(1, arVar, new ate0(11, arVar))).iterator();
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
        w511.i("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString((ActivityResult) vng.u(bundle, ActivityResult.class, str));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        r50 r50Var = (r50) linkedHashMap2.get(str);
        if (r50Var != null) {
            ArrayList arrayList = r50Var.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r50Var.a.d((q) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
