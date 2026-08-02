package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class xll implements c4x {
    public Integer a;

    public final boolean a(xll xllVar, rvo rvoVar, rvo rvoVar2) {
        if (xllVar != null) {
            if (this instanceof vll) {
                vll vllVar = (vll) this;
                Object c = xllVar.c();
                lqu0 lqu0Var = c instanceof lqu0 ? (lqu0) c : null;
                if (lqu0Var != null) {
                    return jl40.l(vllVar.b.a.a(rvoVar), lqu0Var.a.a(rvoVar2));
                }
            } else if (this instanceof tll) {
                tll tllVar = (tll) this;
                Object c2 = xllVar.c();
                g7w g7wVar = c2 instanceof g7w ? (g7w) c2 : null;
                if (g7wVar != null && ((Number) tllVar.b.a.a(rvoVar)).longValue() == ((Number) g7wVar.a.a(rvoVar2)).longValue()) {
                    return true;
                }
            } else if (this instanceof ull) {
                ull ullVar = (ull) this;
                Object c3 = xllVar.c();
                on60 on60Var = c3 instanceof on60 ? (on60) c3 : null;
                if (on60Var != null && ((Number) ullVar.b.a.a(rvoVar)).doubleValue() == ((Number) on60Var.a.a(rvoVar2)).doubleValue()) {
                    return true;
                }
            } else if (this instanceof rll) {
                rll rllVar = (rll) this;
                Object c4 = xllVar.c();
                mhc mhcVar = c4 instanceof mhc ? (mhc) c4 : null;
                if (mhcVar != null && ((Number) rllVar.b.a.a(rvoVar)).intValue() == ((Number) mhcVar.a.a(rvoVar2)).intValue()) {
                    return true;
                }
            } else if (this instanceof qll) {
                qll qllVar = (qll) this;
                Object c5 = xllVar.c();
                w86 w86Var = c5 instanceof w86 ? (w86) c5 : null;
                if (w86Var != null && ((Boolean) qllVar.b.a.a(rvoVar)).booleanValue() == ((Boolean) w86Var.a.a(rvoVar2)).booleanValue()) {
                    return true;
                }
            } else if (this instanceof wll) {
                wll wllVar = (wll) this;
                Object c6 = xllVar.c();
                ci21 ci21Var = c6 instanceof ci21 ? (ci21) c6 : null;
                if (ci21Var != null) {
                    return jl40.l(wllVar.b.a.a(rvoVar), ci21Var.a.a(rvoVar2));
                }
            } else if (this instanceof sll) {
                sll sllVar = (sll) this;
                Object c7 = xllVar.c();
                zgj zgjVar = c7 instanceof zgj ? (zgj) c7 : null;
                if (zgjVar != null) {
                    return jl40.l(sllVar.b.a.a(rvoVar), zgjVar.a.a(rvoVar2));
                }
            } else {
                if (!(this instanceof pll)) {
                    w511.b();
                    return false;
                }
                pll pllVar = (pll) this;
                Object c8 = xllVar.c();
                p63 p63Var = c8 instanceof p63 ? (p63) c8 : null;
                if (p63Var != null) {
                    return jl40.l(pllVar.b.a.a(rvoVar), p63Var.a.a(rvoVar2));
                }
            }
        }
        return false;
    }

    public final int b() {
        int hashCode;
        int intValue;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = qoi0.a(getClass()).hashCode();
        if (this instanceof vll) {
            lqu0 lqu0Var = ((vll) this).b;
            Integer num2 = lqu0Var.b;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                int hashCode3 = qoi0.a(lqu0.class).hashCode() + lqu0Var.a.hashCode();
                lqu0Var.b = Integer.valueOf(hashCode3);
                intValue = hashCode3;
            }
        } else if (this instanceof tll) {
            g7w g7wVar = ((tll) this).b;
            Integer num3 = g7wVar.b;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                hashCode = g7wVar.a.hashCode() + qoi0.a(g7w.class).hashCode();
                g7wVar.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof ull) {
            on60 on60Var = ((ull) this).b;
            Integer num4 = on60Var.b;
            if (num4 != null) {
                intValue = num4.intValue();
            } else {
                hashCode = on60Var.a.hashCode() + qoi0.a(on60.class).hashCode();
                on60Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof rll) {
            mhc mhcVar = ((rll) this).b;
            Integer num5 = mhcVar.b;
            if (num5 != null) {
                intValue = num5.intValue();
            } else {
                hashCode = mhcVar.a.hashCode() + qoi0.a(mhc.class).hashCode();
                mhcVar.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof qll) {
            w86 w86Var = ((qll) this).b;
            Integer num6 = w86Var.b;
            if (num6 != null) {
                intValue = num6.intValue();
            } else {
                hashCode = w86Var.a.hashCode() + qoi0.a(w86.class).hashCode();
                w86Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof wll) {
            ci21 ci21Var = ((wll) this).b;
            Integer num7 = ci21Var.b;
            if (num7 != null) {
                intValue = num7.intValue();
            } else {
                hashCode = ci21Var.a.hashCode() + qoi0.a(ci21.class).hashCode();
                ci21Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof sll) {
            zgj zgjVar = ((sll) this).b;
            Integer num8 = zgjVar.b;
            if (num8 != null) {
                intValue = num8.intValue();
            } else {
                hashCode = zgjVar.a.hashCode() + qoi0.a(zgj.class).hashCode();
                zgjVar.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else {
            if (!(this instanceof pll)) {
                w511.b();
                return 0;
            }
            p63 p63Var = ((pll) this).b;
            Integer num9 = p63Var.b;
            if (num9 != null) {
                intValue = num9.intValue();
            } else {
                hashCode = p63Var.a.hashCode() + qoi0.a(p63.class).hashCode();
                p63Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        }
        int i = hashCode2 + intValue;
        this.a = Integer.valueOf(i);
        return i;
    }

    public final Object c() {
        if (this instanceof vll) {
            return ((vll) this).b;
        }
        if (this instanceof tll) {
            return ((tll) this).b;
        }
        if (this instanceof ull) {
            return ((ull) this).b;
        }
        if (this instanceof rll) {
            return ((rll) this).b;
        }
        if (this instanceof qll) {
            return ((qll) this).b;
        }
        if (this instanceof wll) {
            return ((wll) this).b;
        }
        if (this instanceof sll) {
            return ((sll) this).b;
        }
        if (this instanceof pll) {
            return ((pll) this).b;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((yll) ft6.b.C9.getValue()).b(ft6.a, this);
    }
}
