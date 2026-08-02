package t0;

import android.util.SparseArray;

/* renamed from: t0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4992H {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f40612a;

    /* renamed from: b, reason: collision with root package name */
    public int f40613b;

    public final C4991G a(int i) {
        SparseArray sparseArray = this.f40612a;
        C4991G c4991g = (C4991G) sparseArray.get(i);
        if (c4991g != null) {
            return c4991g;
        }
        C4991G c4991g2 = new C4991G();
        sparseArray.put(i, c4991g2);
        return c4991g2;
    }
}
