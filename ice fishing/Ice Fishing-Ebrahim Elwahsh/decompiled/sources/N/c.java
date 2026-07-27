package N;

import kotlin.jvm.internal.h;
import u.C5085b;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1940a;

    /* renamed from: b, reason: collision with root package name */
    public int f1941b;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1940a = new Object[i];
    }

    public Object a() {
        int i = this.f1941b;
        if (i <= 0) {
            return null;
        }
        int i4 = i - 1;
        Object[] objArr = this.f1940a;
        Object obj = objArr[i4];
        h.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i4] = null;
        this.f1941b--;
        return obj;
    }

    public void b(C5085b c5085b) {
        int i = this.f1941b;
        Object[] objArr = this.f1940a;
        if (i < objArr.length) {
            objArr[i] = c5085b;
            this.f1941b = i + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z8;
        h.e(instance, "instance");
        int i = this.f1941b;
        int i4 = 0;
        while (true) {
            objArr = this.f1940a;
            if (i4 >= i) {
                z8 = false;
                break;
            }
            if (objArr[i4] == instance) {
                z8 = true;
                break;
            }
            i4++;
        }
        if (z8) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i9 = this.f1941b;
        if (i9 >= objArr.length) {
            return false;
        }
        objArr[i9] = instance;
        this.f1941b = i9 + 1;
        return true;
    }

    public c() {
        this.f1940a = new Object[256];
    }
}
