package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vof {
    public static final ovn g = new ovn();
    public final Context a;
    public final LinkedHashMap b;
    public int c;
    public final int d;
    public final LinkedHashSet e;
    public final LinkedHashSet f;

    public vof(Context context, LinkedHashMap linkedHashMap, int i, int i2, LinkedHashSet linkedHashSet) {
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.a = context;
        this.b = linkedHashMap;
        this.c = i;
        this.d = i2;
        this.e = linkedHashSet2;
        this.f = linkedHashSet;
    }

    public final int a(n3b n3bVar) {
        mqf v = w1g.v(n3bVar);
        synchronized (this) {
            Integer num = (Integer) this.b.get(v);
            if (num != null) {
                int intValue = num.intValue();
                this.e.add(Integer.valueOf(intValue));
                return intValue;
            }
            int i = this.c;
            while (this.f.contains(Integer.valueOf(i))) {
                i = (i + 1) % rqf.c;
                if (i == this.c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.c = (i + 1) % rqf.c;
            this.e.add(Integer.valueOf(i));
            this.f.add(Integer.valueOf(i));
            this.b.put(v, Integer.valueOf(i));
            return i;
        }
    }

    public final Object b(wv0 wv0Var) {
        Object d = bld.a.d(this.a, uqf.b, k5r.i(this.d, "appWidgetLayout-"), new nz5(this, (Continuation) null, 26), wv0Var);
        return d == nm6.a ? d : Unit.a;
    }
}
