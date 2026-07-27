package s;

import X.r;
import androidx.work.impl.WorkDatabase;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import q7.C4942k;
import z0.C5266i;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public Object f40400a;

    /* renamed from: b, reason: collision with root package name */
    public Object f40401b;

    /* renamed from: c, reason: collision with root package name */
    public Object f40402c;

    public j(WorkDatabase database) {
        kotlin.jvm.internal.h.e(database, "database");
        this.f40400a = database;
        this.f40401b = new AtomicBoolean(false);
        this.f40402c = com.bumptech.glide.e.q(new r(4, this));
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

    public C5266i a() {
        ((WorkDatabase) this.f40400a).a();
        return ((AtomicBoolean) this.f40401b).compareAndSet(false, true) ? (C5266i) ((C4942k) this.f40402c).getValue() : k();
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

    public C5266i k() {
        String l9 = l();
        WorkDatabase workDatabase = (WorkDatabase) this.f40400a;
        workDatabase.getClass();
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().R().k(l9);
    }

    public abstract String l();

    public void n(C5266i statement) {
        kotlin.jvm.internal.h.e(statement, "statement");
        if (statement == ((C5266i) ((C4942k) this.f40402c).getValue())) {
            ((AtomicBoolean) this.f40401b).set(false);
        }
    }

    public Object[] o(Object[] objArr, int i) {
        int e6 = e();
        if (objArr.length < e6) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), e6);
        }
        for (int i4 = 0; i4 < e6; i4++) {
            objArr[i4] = c(i4, i);
        }
        if (objArr.length > e6) {
            objArr[e6] = null;
        }
        return objArr;
    }
}
