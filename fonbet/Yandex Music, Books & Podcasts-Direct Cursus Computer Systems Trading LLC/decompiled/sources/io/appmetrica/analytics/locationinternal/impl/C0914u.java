package io.appmetrica.analytics.locationinternal.impl;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0914u extends AbstractC0883j0 {
    public C0914u(C0891m c0891m) {
        super(c0891m);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0883j0
    public final boolean a(AbstractC0883j0 abstractC0883j0) {
        Object obj = abstractC0883j0.a;
        if (!(obj instanceof C0891m)) {
            return false;
        }
        C0891m c0891m = (C0891m) obj;
        Object obj2 = this.a;
        if (obj2 == c0891m) {
            return true;
        }
        C0891m c0891m2 = (C0891m) obj2;
        if (c0891m2.i != c0891m.i) {
            return false;
        }
        Integer num = c0891m2.b;
        Integer num2 = c0891m.b;
        if (num == null ? num2 != null : !num.equals(num2)) {
            return false;
        }
        Integer num3 = c0891m2.c;
        Integer num4 = c0891m.c;
        if (num3 == null ? num4 != null : !num3.equals(num4)) {
            return false;
        }
        Integer num5 = c0891m2.d;
        Integer num6 = c0891m.d;
        if (num5 == null ? num6 != null : !num5.equals(num6)) {
            return false;
        }
        Integer num7 = c0891m2.e;
        Integer num8 = c0891m.e;
        if (num7 == null ? num8 != null : !num7.equals(num8)) {
            return false;
        }
        String str = c0891m2.g;
        String str2 = c0891m.g;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        Integer num9 = c0891m2.j;
        Integer num10 = c0891m.j;
        return num9 != null ? num9.equals(num10) : num10 == null;
    }

    public final int hashCode() {
        C0891m c0891m = (C0891m) this.a;
        Integer num = c0891m.b;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = c0891m.c;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = c0891m.d;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = c0891m.e;
        int hashCode4 = (hashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str = c0891m.g;
        int hashCode5 = (((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + c0891m.i) * 31;
        Integer num5 = c0891m.j;
        return hashCode5 + (num5 != null ? num5.hashCode() : 0);
    }
}
