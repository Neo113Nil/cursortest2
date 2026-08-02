package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M implements L {

    /* renamed from: a, reason: collision with root package name */
    public final int f4804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f4805b;

    public M(N n9, int i) {
        this.f4805b = n9;
        this.f4804a = i;
    }

    @Override // androidx.fragment.app.L
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        N n9 = this.f4805b;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = n9.f4839w;
        int i = this.f4804a;
        if (abstractComponentCallbacksC0479s == null || i >= 0 || !abstractComponentCallbacksC0479s.c().M(-1, 0)) {
            return n9.N(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
