package uc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6733a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6734b;

    public a(float f10, float f11) {
        this.f6733a = f10;
        this.f6734b = f11;
    }

    public static boolean a(Float f10, Float f11) {
        return f10.floatValue() <= f11.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        float f10 = this.f6733a;
        float f11 = this.f6734b;
        if (f10 > f11) {
            a aVar = (a) obj;
            if (aVar.f6733a > aVar.f6734b) {
                return true;
            }
        }
        a aVar2 = (a) obj;
        return f10 == aVar2.f6733a && f11 == aVar2.f6734b;
    }

    public final int hashCode() {
        float f10 = this.f6733a;
        float f11 = this.f6734b;
        if (f10 > f11) {
            return -1;
        }
        return Float.hashCode(f11) + (Float.hashCode(f10) * 31);
    }

    public final String toString() {
        return this.f6733a + ".." + this.f6734b;
    }
}
