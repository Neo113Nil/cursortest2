package d4;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public final int f1667g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1668h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1669i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1670j;

    public c(int i10, int i11, String str, String str2) {
        this.f1667g = i10;
        this.f1668h = i11;
        this.f1669i = str;
        this.f1670j = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        j.e(cVar, "other");
        int i10 = this.f1667g - cVar.f1667g;
        return i10 == 0 ? this.f1668h - cVar.f1668h : i10;
    }
}
