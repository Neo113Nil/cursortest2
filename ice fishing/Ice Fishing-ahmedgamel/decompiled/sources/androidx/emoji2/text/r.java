package androidx.emoji2.text;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f4764a;

    /* renamed from: b, reason: collision with root package name */
    public u f4765b;

    public r(int i) {
        this.f4764a = new SparseArray(i);
    }

    public final void a(u uVar, int i, int i4) {
        int a9 = uVar.a(i);
        SparseArray sparseArray = this.f4764a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(a9);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(uVar.a(i), rVar);
        }
        if (i4 > i) {
            rVar.a(uVar, i + 1, i4);
        } else {
            rVar.f4765b = uVar;
        }
    }
}
