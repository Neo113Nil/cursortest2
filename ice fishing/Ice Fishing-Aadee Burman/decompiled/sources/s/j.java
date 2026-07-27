package s;

import X.r;
import a.AbstractC0422a;
import androidx.work.impl.WorkDatabase;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import u7.C5093k;
import z0.C5253i;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f40428a;

    /* renamed from: b, reason: collision with root package name */
    public Object f40429b;

    /* renamed from: c, reason: collision with root package name */
    public Object f40430c;

    public j(WorkDatabase database) {
        kotlin.jvm.internal.h.e(database, "database");
        this.f40428a = database;
        this.f40429b = new AtomicBoolean(false);
        this.f40430c = AbstractC0422a.q(new r(4, this));
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

    public C5253i a() {
        ((WorkDatabase) this.f40428a).a();
        return ((AtomicBoolean) this.f40429b).compareAndSet(false, true) ? (C5253i) ((C5093k) this.f40430c).getValue() : k();
    }

    public abstract void b();

    public abstract Object c(int i, int i6);

    public abstract Map d();

    public abstract int e();

    public abstract int f(Object obj);

    public abstract int g(Object obj);

    public abstract void h(Object obj, Object obj2);

    public abstract void i(int i);

    public abstract Object j(int i, Object obj);

    public C5253i k() {
        String l9 = l();
        WorkDatabase workDatabase = (WorkDatabase) this.f40428a;
        workDatabase.getClass();
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().R().k(l9);
    }

    public abstract String l();

    public void n(C5253i statement) {
        kotlin.jvm.internal.h.e(statement, "statement");
        if (statement == ((C5253i) ((C5093k) this.f40430c).getValue())) {
            ((AtomicBoolean) this.f40429b).set(false);
        }
    }

    public Object[] o(Object[] objArr, int i) {
        int e9 = e();
        if (objArr.length < e9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), e9);
        }
        for (int i6 = 0; i6 < e9; i6++) {
            objArr[i6] = c(i6, i);
        }
        if (objArr.length > e9) {
            objArr[e9] = null;
        }
        return objArr;
    }
}
