package N;

import D1.i;
import u.C0354b;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f629a;

    /* renamed from: b, reason: collision with root package name */
    public int f630b;

    public b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f629a = new Object[i];
    }

    public Object a() {
        int i = this.f630b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f629a;
        Object obj = objArr[i2];
        i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.f630b--;
        return obj;
    }

    public void b(C0354b c0354b) {
        int i = this.f630b;
        Object[] objArr = this.f629a;
        if (i < objArr.length) {
            objArr[i] = c0354b;
            this.f630b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z2;
        i.e(obj, "instance");
        int i = this.f630b;
        int i2 = 0;
        while (true) {
            objArr = this.f629a;
            if (i2 >= i) {
                z2 = false;
                break;
            }
            if (objArr[i2] == obj) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f630b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f630b = i3 + 1;
        return true;
    }

    public b() {
        this.f629a = new Object[256];
    }
}
