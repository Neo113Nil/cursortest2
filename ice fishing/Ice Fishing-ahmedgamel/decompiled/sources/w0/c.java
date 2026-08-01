package w0;

import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final int f41637n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41638u;

    /* renamed from: v, reason: collision with root package name */
    public final String f41639v;

    /* renamed from: w, reason: collision with root package name */
    public final String f41640w;

    public c(int i, int i6, String str, String str2) {
        this.f41637n = i;
        this.f41638u = i6;
        this.f41639v = str;
        this.f41640w = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        h.e(other, "other");
        int i = this.f41637n - other.f41637n;
        return i == 0 ? this.f41638u - other.f41638u : i;
    }
}
