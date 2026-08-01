package e0;

import Z.O;
import androidx.lifecycle.Q;
import r.C0343k;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0128a extends Q {

    /* renamed from: c, reason: collision with root package name */
    public static final O f2836c = new O(1);

    /* renamed from: b, reason: collision with root package name */
    public final C0343k f2837b = new C0343k(0);

    @Override // androidx.lifecycle.Q
    public final void b() {
        C0343k c0343k = this.f2837b;
        if (c0343k.e() > 0) {
            c0343k.f(0).getClass();
            throw new ClassCastException();
        }
        int i = c0343k.f4326d;
        Object[] objArr = c0343k.f4325c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c0343k.f4326d = 0;
        c0343k.f4323a = false;
    }
}
