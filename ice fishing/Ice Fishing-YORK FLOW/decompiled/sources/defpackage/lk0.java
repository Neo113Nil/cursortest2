package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lk0 extends defpackage.lr1 {
    public final java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    public /* synthetic */ lk0(int i, java.lang.Object obj) {
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = obj;
    }

    @Override // defpackage.lr1
    public final int ZpBGe2uQfcn8() {
        int i = this.oh71FJcDz6S2;
        java.lang.Object obj = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                return ((java.util.regex.Matcher) ((defpackage.a7) obj).giKS3J6vZuNy).groupCount() + 1;
            default:
                defpackage.by0 by0Var = (defpackage.by0) obj;
                by0Var.getClass();
                return by0Var.oh71FJcDz6S2;
        }
    }

    @Override // defpackage.lr1, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        switch (this.oh71FJcDz6S2) {
            case 0:
                if (obj == null ? true : obj instanceof defpackage.kk0) {
                    return super.contains((defpackage.kk0) obj);
                }
                return false;
            default:
                return ((defpackage.by0) this.QiMR8OkAhezm).containsValue(obj);
        }
    }

    public defpackage.kk0 giKS3J6vZuNy(int i) {
        java.util.regex.Matcher matcher = (java.util.regex.Matcher) ((defpackage.a7) this.QiMR8OkAhezm).giKS3J6vZuNy;
        defpackage.p90 OVwOqzUGHcCU = defpackage.j80.OVwOqzUGHcCU(matcher.start(i), matcher.end(i));
        if (OVwOqzUGHcCU.WDYagTQQm9ns < 0) {
            return null;
        }
        java.lang.String group = matcher.group(i);
        group.getClass();
        return new defpackage.kk0(group, OVwOqzUGHcCU);
    }

    @Override // defpackage.lr1, java.util.Collection
    public boolean isEmpty() {
        switch (this.oh71FJcDz6S2) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.oh71FJcDz6S2) {
            case 0:
                return new defpackage.bp1(new defpackage.dj1(new defpackage.of(0, new defpackage.p90(0, size() - 1, 1)), new defpackage.fNwYGHIYeJcR(17, this), 1));
            default:
                defpackage.vp1 vp1Var = ((defpackage.by0) this.QiMR8OkAhezm).WDYagTQQm9ns;
                defpackage.wp1[] wp1VarArr = new defpackage.wp1[8];
                for (int i = 0; i < 8; i++) {
                    wp1VarArr[i] = new defpackage.xp1(2);
                }
                return new defpackage.iy0(vp1Var, wp1VarArr);
        }
    }
}
