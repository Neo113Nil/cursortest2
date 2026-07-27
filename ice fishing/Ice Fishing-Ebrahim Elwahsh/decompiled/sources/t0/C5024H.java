package t0;

import android.util.SparseArray;

/* renamed from: t0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5024H {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f40584a;

    /* renamed from: b, reason: collision with root package name */
    public int f40585b;

    public final C5023G a(int i) {
        SparseArray sparseArray = this.f40584a;
        C5023G c5023g = (C5023G) sparseArray.get(i);
        if (c5023g != null) {
            return c5023g;
        }
        C5023G c5023g2 = new C5023G();
        sparseArray.put(i, c5023g2);
        return c5023g2;
    }
}
