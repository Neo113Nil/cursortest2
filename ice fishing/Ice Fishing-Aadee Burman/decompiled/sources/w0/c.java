package w0;

import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final int f41634n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41635u;

    /* renamed from: v, reason: collision with root package name */
    public final String f41636v;

    /* renamed from: w, reason: collision with root package name */
    public final String f41637w;

    public c(int i, int i6, String str, String str2) {
        this.f41634n = i;
        this.f41635u = i6;
        this.f41636v = str;
        this.f41637w = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        h.e(other, "other");
        int i = this.f41634n - other.f41634n;
        return i == 0 ? this.f41635u - other.f41635u : i;
    }
}
