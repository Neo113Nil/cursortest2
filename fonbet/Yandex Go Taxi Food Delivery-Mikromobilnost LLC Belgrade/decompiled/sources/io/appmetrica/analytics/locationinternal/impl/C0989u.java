package io.appmetrica.analytics.locationinternal.impl;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0989u extends AbstractC0958j0 {
    public C0989u(C0966m c0966m) {
        super(c0966m);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0958j0
    public final boolean a(AbstractC0958j0 abstractC0958j0) {
        Object obj = abstractC0958j0.a;
        if (!(obj instanceof C0966m)) {
            return false;
        }
        C0966m c0966m = (C0966m) obj;
        Object obj2 = this.a;
        if (obj2 == c0966m) {
            return true;
        }
        C0966m c0966m2 = (C0966m) obj2;
        if (c0966m2.i != c0966m.i) {
            return false;
        }
        Integer num = c0966m2.b;
        Integer num2 = c0966m.b;
        if (num == null ? num2 != null : !num.equals(num2)) {
            return false;
        }
        Integer num3 = c0966m2.c;
        Integer num4 = c0966m.c;
        if (num3 == null ? num4 != null : !num3.equals(num4)) {
            return false;
        }
        Integer num5 = c0966m2.d;
        Integer num6 = c0966m.d;
        if (num5 == null ? num6 != null : !num5.equals(num6)) {
            return false;
        }
        Integer num7 = c0966m2.e;
        Integer num8 = c0966m.e;
        if (num7 == null ? num8 != null : !num7.equals(num8)) {
            return false;
        }
        String str = c0966m2.g;
        String str2 = c0966m.g;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        Integer num9 = c0966m2.j;
        Integer num10 = c0966m.j;
        return num9 != null ? num9.equals(num10) : num10 == null;
    }

    public final int hashCode() {
        C0966m c0966m = (C0966m) this.a;
        Integer num = c0966m.b;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = c0966m.c;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = c0966m.d;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = c0966m.e;
        int hashCode4 = (hashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str = c0966m.g;
        int hashCode5 = (((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + c0966m.i) * 31;
        Integer num5 = c0966m.j;
        return hashCode5 + (num5 != null ? num5.hashCode() : 0);
    }
}
