package p6;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f5611b = new l(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f5612a;

    public /* synthetic */ l(String str) {
        this.f5612a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return u.j(this.f5612a, ((l) obj).f5612a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5612a});
    }
}
