package q3;

import android.util.SparseArray;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f5790a;

    /* renamed from: b, reason: collision with root package name */
    public t f5791b;

    public s(int i10) {
        this.f5790a = new SparseArray(i10);
    }

    public final void a(t tVar, int i10, int i11) {
        int a6 = tVar.a(i10);
        SparseArray sparseArray = this.f5790a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(a6);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(tVar.a(i10), sVar);
        }
        if (i11 > i10) {
            sVar.a(tVar, i10 + 1, i11);
        } else {
            sVar.f5791b = tVar;
        }
    }
}
