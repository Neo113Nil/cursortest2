package s;

import N3.C;
import X.r;
import androidx.work.impl.WorkDatabase;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import u7.C5085k;
import z0.C5220i;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f40267a;

    /* renamed from: b, reason: collision with root package name */
    public Object f40268b;

    /* renamed from: c, reason: collision with root package name */
    public Object f40269c;

    public j(WorkDatabase database) {
        kotlin.jvm.internal.h.e(database, "database");
        this.f40267a = database;
        this.f40268b = new AtomicBoolean(false);
        this.f40269c = C.O(new r(4, this));
    }

    public static boolean m(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public C5220i a() {
        ((WorkDatabase) this.f40267a).a();
        return ((AtomicBoolean) this.f40268b).compareAndSet(false, true) ? (C5220i) ((C5085k) this.f40269c).getValue() : k();
    }

    public abstract void b();

    public abstract Object c(int i, int i4);

    public abstract Map d();

    public abstract int e();

    public abstract int f(Object obj);

    public abstract int g(Object obj);

    public abstract void h(Object obj, Object obj2);

    public abstract void i(int i);

    public abstract Object j(int i, Object obj);

    public C5220i k() {
        String l9 = l();
        WorkDatabase workDatabase = (WorkDatabase) this.f40267a;
        workDatabase.getClass();
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().R().k(l9);
    }

    public abstract String l();

    public void n(C5220i statement) {
        kotlin.jvm.internal.h.e(statement, "statement");
        if (statement == ((C5220i) ((C5085k) this.f40269c).getValue())) {
            ((AtomicBoolean) this.f40268b).set(false);
        }
    }

    public Object[] o(Object[] objArr, int i) {
        int e9 = e();
        if (objArr.length < e9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), e9);
        }
        for (int i4 = 0; i4 < e9; i4++) {
            objArr[i4] = c(i4, i);
        }
        if (objArr.length > e9) {
            objArr[e9] = null;
        }
        return objArr;
    }
}
