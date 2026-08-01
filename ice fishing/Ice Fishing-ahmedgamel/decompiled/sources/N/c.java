package N;

import kotlin.jvm.internal.h;
import u.C5046b;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1896a;

    /* renamed from: b, reason: collision with root package name */
    public int f1897b;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1896a = new Object[i];
    }

    public Object a() {
        int i = this.f1897b;
        if (i <= 0) {
            return null;
        }
        int i6 = i - 1;
        Object[] objArr = this.f1896a;
        Object obj = objArr[i6];
        h.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i6] = null;
        this.f1897b--;
        return obj;
    }

    public void b(C5046b c5046b) {
        int i = this.f1897b;
        Object[] objArr = this.f1896a;
        if (i < objArr.length) {
            objArr[i] = c5046b;
            this.f1897b = i + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z3;
        h.e(instance, "instance");
        int i = this.f1897b;
        int i6 = 0;
        while (true) {
            objArr = this.f1896a;
            if (i6 >= i) {
                z3 = false;
                break;
            }
            if (objArr[i6] == instance) {
                z3 = true;
                break;
            }
            i6++;
        }
        if (z3) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i9 = this.f1897b;
        if (i9 >= objArr.length) {
            return false;
        }
        objArr[i9] = instance;
        this.f1897b = i9 + 1;
        return true;
    }

    public c() {
        this.f1896a = new Object[256];
    }
}
