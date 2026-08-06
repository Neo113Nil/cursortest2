package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ay0 extends defpackage.by0 implements defpackage.oj {
    public static final defpackage.ay0 P05cfTpS5W5L = new defpackage.ay0(defpackage.vp1.WDYagTQQm9ns, 0);

    @Override // defpackage.by0, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof defpackage.t21) {
            return super.containsKey((defpackage.t21) obj);
        }
        return false;
    }

    @Override // defpackage.by0, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof defpackage.vs1) {
            return super.containsValue((defpackage.vs1) obj);
        }
        return false;
    }

    @Override // defpackage.by0, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof defpackage.t21) {
            return (defpackage.vs1) super.get((defpackage.t21) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof defpackage.t21) ? obj2 : (defpackage.vs1) super.getOrDefault((defpackage.t21) obj, (defpackage.vs1) obj2);
    }

    public final defpackage.ay0 giKS3J6vZuNy(defpackage.t21 t21Var, defpackage.vs1 vs1Var) {
        defpackage.wg w7APNrr0aGRc = this.WDYagTQQm9ns.w7APNrr0aGRc(t21Var.hashCode(), 0, t21Var, vs1Var);
        return w7APNrr0aGRc == null ? this : new defpackage.ay0((defpackage.vp1) w7APNrr0aGRc.giKS3J6vZuNy, this.oh71FJcDz6S2 + w7APNrr0aGRc.ZpBGe2uQfcn8);
    }
}
