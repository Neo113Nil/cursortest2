package r2;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f6032b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f6033c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f6034a;

    public l(int i10) {
        this.f6034a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f6034a == ((l) obj).f6034a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6034a;
    }

    public final String toString() {
        int i10 = this.f6034a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + u2.a.a(arrayList, ", ", null, 62) + ']';
    }
}
