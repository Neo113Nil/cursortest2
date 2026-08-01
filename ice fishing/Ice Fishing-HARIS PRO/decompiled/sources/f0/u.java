package f0;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final w f2981a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f2982b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2983c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2984d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2985f;

    public u(w wVar, Bundle bundle, boolean z2, int i, boolean z3, int i2) {
        D1.i.e(wVar, "destination");
        this.f2981a = wVar;
        this.f2982b = bundle;
        this.f2983c = z2;
        this.f2984d = i;
        this.e = z3;
        this.f2985f = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(u uVar) {
        D1.i.e(uVar, "other");
        boolean z2 = uVar.f2983c;
        boolean z3 = this.f2983c;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.f2984d - uVar.f2984d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle = uVar.f2982b;
        Bundle bundle2 = this.f2982b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            D1.i.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = uVar.e;
        boolean z5 = this.e;
        if (z5 && !z4) {
            return 1;
        }
        if (z5 || !z4) {
            return this.f2985f - uVar.f2985f;
        }
        return -1;
    }
}
