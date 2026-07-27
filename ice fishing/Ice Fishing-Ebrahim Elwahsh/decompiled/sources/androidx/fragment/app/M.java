package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M implements L {

    /* renamed from: a, reason: collision with root package name */
    public final int f4948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f4949b;

    public M(N n9, int i) {
        this.f4949b = n9;
        this.f4948a = i;
    }

    @Override // androidx.fragment.app.L
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        N n9 = this.f4949b;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = n9.f4983w;
        int i = this.f4948a;
        if (abstractComponentCallbacksC0485s == null || i >= 0 || !abstractComponentCallbacksC0485s.c().M(-1, 0)) {
            return n9.N(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
