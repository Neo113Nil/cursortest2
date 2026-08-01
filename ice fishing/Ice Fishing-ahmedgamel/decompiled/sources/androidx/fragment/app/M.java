package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M implements L {

    /* renamed from: a, reason: collision with root package name */
    public final int f4836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f4837b;

    public M(N n9, int i) {
        this.f4837b = n9;
        this.f4836a = i;
    }

    @Override // androidx.fragment.app.L
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        N n9 = this.f4837b;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = n9.f4871w;
        int i = this.f4836a;
        if (abstractComponentCallbacksC0475s == null || i >= 0 || !abstractComponentCallbacksC0475s.c().M(-1, 0)) {
            return n9.N(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
