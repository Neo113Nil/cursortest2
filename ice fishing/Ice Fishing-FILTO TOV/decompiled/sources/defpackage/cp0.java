package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cp0 extends dp0 implements gf {
    public static final cp0 encWxUiV2 = new cp0(za1.OOA6hdeuvCS, 0);

    public final cp0 Yi7zF1RB1(ps0 ps0Var, jd1 jd1Var) {
        qu Y6hRI1cF8 = this.OOA6hdeuvCS.Y6hRI1cF8(ps0Var.hashCode(), 0, ps0Var, jd1Var);
        return Y6hRI1cF8 == null ? this : new cp0((za1) Y6hRI1cF8.Yi7zF1RB1, this.EljAMC1QTz + Y6hRI1cF8.GWasM1elztuh);
    }

    @Override // defpackage.dp0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ps0) {
            return super.containsKey((ps0) obj);
        }
        return false;
    }

    @Override // defpackage.dp0, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof jd1) {
            return super.containsValue((jd1) obj);
        }
        return false;
    }

    @Override // defpackage.dp0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof ps0) {
            return (jd1) super.get((ps0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ps0) ? obj2 : (jd1) super.getOrDefault((ps0) obj, (jd1) obj2);
    }
}
