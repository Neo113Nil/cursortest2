package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class wx9 implements u1f {
    public Integer a;

    public final boolean a(wx9 wx9Var, xzb xzbVar, xzb xzbVar2) {
        if (wx9Var == null) {
            return false;
        }
        if (this instanceof ux9) {
            ux9 ux9Var = (ux9) this;
            Object c = wx9Var.c();
            rir rirVar = c instanceof rir ? (rir) c : null;
            if (rirVar == null) {
                return false;
            }
            return Intrinsics.d(ux9Var.b.a.a(xzbVar), rirVar.a.a(xzbVar2));
        }
        if (this instanceof sx9) {
            sx9 sx9Var = (sx9) this;
            Object c2 = wx9Var.c();
            dre dreVar = c2 instanceof dre ? (dre) c2 : null;
            return dreVar != null && ((Number) sx9Var.b.a.a(xzbVar)).longValue() == ((Number) dreVar.a.a(xzbVar2)).longValue();
        }
        if (this instanceof tx9) {
            tx9 tx9Var = (tx9) this;
            Object c3 = wx9Var.c();
            dhj dhjVar = c3 instanceof dhj ? (dhj) c3 : null;
            return dhjVar != null && ((Number) tx9Var.b.a.a(xzbVar)).doubleValue() == ((Number) dhjVar.a.a(xzbVar2)).doubleValue();
        }
        if (this instanceof qx9) {
            qx9 qx9Var = (qx9) this;
            Object c4 = wx9Var.c();
            ba5 ba5Var = c4 instanceof ba5 ? (ba5) c4 : null;
            return ba5Var != null && ((Number) qx9Var.b.a.a(xzbVar)).intValue() == ((Number) ba5Var.a.a(xzbVar2)).intValue();
        }
        if (this instanceof px9) {
            px9 px9Var = (px9) this;
            Object c5 = wx9Var.c();
            tb3 tb3Var = c5 instanceof tb3 ? (tb3) c5 : null;
            return tb3Var != null && ((Boolean) px9Var.b.a.a(xzbVar)).booleanValue() == ((Boolean) tb3Var.a.a(xzbVar2)).booleanValue();
        }
        if (this instanceof vx9) {
            vx9 vx9Var = (vx9) this;
            Object c6 = wx9Var.c();
            lqt lqtVar = c6 instanceof lqt ? (lqt) c6 : null;
            if (lqtVar == null) {
                return false;
            }
            return Intrinsics.d(vx9Var.b.a.a(xzbVar), lqtVar.a.a(xzbVar2));
        }
        if (this instanceof rx9) {
            rx9 rx9Var = (rx9) this;
            Object c7 = wx9Var.c();
            h28 h28Var = c7 instanceof h28 ? (h28) c7 : null;
            if (h28Var == null) {
                return false;
            }
            return Intrinsics.d(rx9Var.b.a.a(xzbVar), h28Var.a.a(xzbVar2));
        }
        if (!(this instanceof ox9)) {
            b6e.s();
            return false;
        }
        ox9 ox9Var = (ox9) this;
        Object c8 = wx9Var.c();
        ez0 ez0Var = c8 instanceof ez0 ? (ez0) c8 : null;
        if (ez0Var == null) {
            return false;
        }
        return Intrinsics.d(ox9Var.b.a.a(xzbVar), ez0Var.a.a(xzbVar2));
    }

    public final int b() {
        int hashCode;
        int intValue;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = ern.a(getClass()).hashCode();
        if (this instanceof ux9) {
            rir rirVar = ((ux9) this).b;
            Integer num2 = rirVar.b;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                int hashCode3 = ern.a(rir.class).hashCode() + rirVar.a.hashCode();
                rirVar.b = Integer.valueOf(hashCode3);
                intValue = hashCode3;
            }
        } else if (this instanceof sx9) {
            dre dreVar = ((sx9) this).b;
            Integer num3 = dreVar.b;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                hashCode = dreVar.a.hashCode() + ern.a(dre.class).hashCode();
                dreVar.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof tx9) {
            dhj dhjVar = ((tx9) this).b;
            Integer num4 = dhjVar.b;
            if (num4 != null) {
                intValue = num4.intValue();
            } else {
                hashCode = dhjVar.a.hashCode() + ern.a(dhj.class).hashCode();
                dhjVar.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof qx9) {
            ba5 ba5Var = ((qx9) this).b;
            Integer num5 = ba5Var.b;
            if (num5 != null) {
                intValue = num5.intValue();
            } else {
                hashCode = ba5Var.a.hashCode() + ern.a(ba5.class).hashCode();
                ba5Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof px9) {
            tb3 tb3Var = ((px9) this).b;
            Integer num6 = tb3Var.b;
            if (num6 != null) {
                intValue = num6.intValue();
            } else {
                hashCode = tb3Var.a.hashCode() + ern.a(tb3.class).hashCode();
                tb3Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof vx9) {
            lqt lqtVar = ((vx9) this).b;
            Integer num7 = lqtVar.b;
            if (num7 != null) {
                intValue = num7.intValue();
            } else {
                hashCode = lqtVar.a.hashCode() + ern.a(lqt.class).hashCode();
                lqtVar.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof rx9) {
            h28 h28Var = ((rx9) this).b;
            Integer num8 = h28Var.b;
            if (num8 != null) {
                intValue = num8.intValue();
            } else {
                hashCode = h28Var.a.hashCode() + ern.a(h28.class).hashCode();
                h28Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else {
            if (!(this instanceof ox9)) {
                b6e.s();
                return 0;
            }
            ez0 ez0Var = ((ox9) this).b;
            Integer num9 = ez0Var.b;
            if (num9 != null) {
                intValue = num9.intValue();
            } else {
                hashCode = ez0Var.a.hashCode() + ern.a(ez0.class).hashCode();
                ez0Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        }
        int i = hashCode2 + intValue;
        this.a = Integer.valueOf(i);
        return i;
    }

    public final Object c() {
        if (this instanceof ux9) {
            return ((ux9) this).b;
        }
        if (this instanceof sx9) {
            return ((sx9) this).b;
        }
        if (this instanceof tx9) {
            return ((tx9) this).b;
        }
        if (this instanceof qx9) {
            return ((qx9) this).b;
        }
        if (this instanceof px9) {
            return ((px9) this).b;
        }
        if (this instanceof vx9) {
            return ((vx9) this).b;
        }
        if (this instanceof rx9) {
            return ((rx9) this).b;
        }
        if (this instanceof ox9) {
            return ((ox9) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((xx9) rj3.b.F9.getValue()).b(rj3.a, this);
    }
}
