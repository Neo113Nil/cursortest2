package N;

import kotlin.jvm.internal.h;
import u.C5047b;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1898a;

    /* renamed from: b, reason: collision with root package name */
    public int f1899b;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1898a = new Object[i];
    }

    public Object a() {
        int i = this.f1899b;
        if (i <= 0) {
            return null;
        }
        int i4 = i - 1;
        Object[] objArr = this.f1898a;
        Object obj = objArr[i4];
        h.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i4] = null;
        this.f1899b--;
        return obj;
    }

    public void b(C5047b c5047b) {
        int i = this.f1899b;
        Object[] objArr = this.f1898a;
        if (i < objArr.length) {
            objArr[i] = c5047b;
            this.f1899b = i + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z6;
        h.e(instance, "instance");
        int i = this.f1899b;
        int i4 = 0;
        while (true) {
            objArr = this.f1898a;
            if (i4 >= i) {
                z6 = false;
                break;
            }
            if (objArr[i4] == instance) {
                z6 = true;
                break;
            }
            i4++;
        }
        if (z6) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i6 = this.f1899b;
        if (i6 >= objArr.length) {
            return false;
        }
        objArr[i6] = instance;
        this.f1899b = i6 + 1;
        return true;
    }

    public c() {
        this.f1898a = new Object[256];
    }
}
