package w0;

import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final int f41416n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41417u;

    /* renamed from: v, reason: collision with root package name */
    public final String f41418v;

    /* renamed from: w, reason: collision with root package name */
    public final String f41419w;

    public c(int i, int i4, String str, String str2) {
        this.f41416n = i;
        this.f41417u = i4;
        this.f41418v = str;
        this.f41419w = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        h.e(other, "other");
        int i = this.f41416n - other.f41416n;
        return i == 0 ? this.f41417u - other.f41417u : i;
    }
}
