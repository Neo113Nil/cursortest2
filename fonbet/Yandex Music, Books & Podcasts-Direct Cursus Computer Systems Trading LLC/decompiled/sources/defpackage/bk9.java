package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class bk9 implements u1f {
    public Integer a;

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(bk9 bk9Var, xzb xzbVar, xzb xzbVar2) {
        if (bk9Var != null) {
            if (this instanceof yj9) {
                yj9 yj9Var = (yj9) this;
                Object c = bk9Var.c();
                return yj9Var.b.a(c instanceof jz8 ? (jz8) c : null, xzbVar, xzbVar2);
            }
            if (this instanceof zj9) {
                zj9 zj9Var = (zj9) this;
                Object c2 = bk9Var.c();
                a99 a99Var = c2 instanceof a99 ? (a99) c2 : null;
                if (a99Var != null) {
                    a99 a99Var2 = zj9Var.b;
                    kk9 kk9Var = a99Var2.a;
                    kk9 kk9Var2 = a99Var.a;
                    if (kk9Var != null ? kk9Var.a(kk9Var2, xzbVar, xzbVar2) : kk9Var2 == null) {
                        kk9 kk9Var3 = a99Var2.b;
                        kk9 kk9Var4 = a99Var.b;
                        if (kk9Var3 != null ? kk9Var3.a(kk9Var4, xzbVar, xzbVar2) : kk9Var4 == null) {
                            szb szbVar = a99Var2.c;
                            Double d = szbVar != null ? (Double) szbVar.a(xzbVar) : null;
                            szb szbVar2 = a99Var.c;
                            if (Intrinsics.b(d, szbVar2 != null ? (Double) szbVar2.a(xzbVar2) : null)) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                if (!(this instanceof ak9)) {
                    b6e.s();
                    return false;
                }
                ak9 ak9Var = (ak9) this;
                Object c3 = bk9Var.c();
                x1a x1aVar = c3 instanceof x1a ? (x1a) c3 : null;
                if (x1aVar != null) {
                    x1a x1aVar2 = ak9Var.b;
                    szb szbVar3 = x1aVar2.a;
                    Boolean bool = szbVar3 != null ? (Boolean) szbVar3.a(xzbVar) : null;
                    szb szbVar4 = x1aVar.a;
                    if (Intrinsics.d(bool, szbVar4 != null ? (Boolean) szbVar4.a(xzbVar2) : null)) {
                        kk9 kk9Var5 = x1aVar2.b;
                        kk9 kk9Var6 = x1aVar.b;
                        if (kk9Var5 != null ? kk9Var5.a(kk9Var6, xzbVar, xzbVar2) : kk9Var6 == null) {
                            kk9 kk9Var7 = x1aVar2.c;
                            kk9 kk9Var8 = x1aVar.c;
                            if (kk9Var7 != null ? kk9Var7.a(kk9Var8, xzbVar, xzbVar2) : kk9Var8 == null) {
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int b;
        int intValue;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(getClass()).hashCode();
        if (this instanceof yj9) {
            intValue = ((yj9) this).b.b();
        } else if (this instanceof zj9) {
            a99 a99Var = ((zj9) this).b;
            Integer num2 = a99Var.d;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                int hashCode2 = ern.a(a99.class).hashCode();
                kk9 kk9Var = a99Var.a;
                int b2 = hashCode2 + (kk9Var != null ? kk9Var.b() : 0);
                kk9 kk9Var2 = a99Var.b;
                int b3 = b2 + (kk9Var2 != null ? kk9Var2.b() : 0);
                szb szbVar = a99Var.c;
                b = b3 + (szbVar != null ? szbVar.hashCode() : 0);
                a99Var.d = Integer.valueOf(b);
                intValue = b;
            }
        } else {
            if (!(this instanceof ak9)) {
                b6e.s();
                return 0;
            }
            x1a x1aVar = ((ak9) this).b;
            Integer num3 = x1aVar.d;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                int hashCode3 = ern.a(x1a.class).hashCode();
                szb szbVar2 = x1aVar.a;
                int hashCode4 = hashCode3 + (szbVar2 != null ? szbVar2.hashCode() : 0);
                kk9 kk9Var3 = x1aVar.b;
                int b4 = hashCode4 + (kk9Var3 != null ? kk9Var3.b() : 0);
                kk9 kk9Var4 = x1aVar.c;
                b = b4 + (kk9Var4 != null ? kk9Var4.b() : 0);
                x1aVar.d = Integer.valueOf(b);
                intValue = b;
            }
        }
        int i = hashCode + intValue;
        this.a = Integer.valueOf(i);
        return i;
    }

    public final Object c() {
        if (this instanceof yj9) {
            return ((yj9) this).b;
        }
        if (this instanceof zj9) {
            return ((zj9) this).b;
        }
        if (this instanceof ak9) {
            return ((ak9) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((ck9) rj3.b.q7.getValue()).b(rj3.a, this);
    }
}
