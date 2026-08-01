package t0;

import android.util.SparseArray;

/* renamed from: t0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4995J {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f40562a;

    /* renamed from: b, reason: collision with root package name */
    public int f40563b;

    public final C4994I a(int i) {
        SparseArray sparseArray = this.f40562a;
        C4994I c4994i = (C4994I) sparseArray.get(i);
        if (c4994i != null) {
            return c4994i;
        }
        C4994I c4994i2 = new C4994I();
        sparseArray.put(i, c4994i2);
        return c4994i2;
    }
}
