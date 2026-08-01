package V;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1242a;

    /* renamed from: b, reason: collision with root package name */
    public w f1243b;

    public t(int i) {
        this.f1242a = new SparseArray(i);
    }

    public final void a(w wVar, int i, int i2) {
        int a2 = wVar.a(i);
        SparseArray sparseArray = this.f1242a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(a2);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(wVar.a(i), tVar);
        }
        if (i2 > i) {
            tVar.a(wVar, i + 1, i2);
        } else {
            tVar.f1243b = wVar;
        }
    }
}
