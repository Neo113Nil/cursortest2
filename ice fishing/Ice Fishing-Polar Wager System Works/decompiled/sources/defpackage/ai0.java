package defpackage;

/* loaded from: classes.dex */
public final class ai0 extends defpackage.SyNS6RMn {
    public final /* synthetic */ int adDC3e2L;
    public final java.lang.Object xiZrDbcSW0;

    public /* synthetic */ ai0(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    @Override // defpackage.SyNS6RMn
    public final int IHQe1A4L2xu() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                return ((java.util.regex.Matcher) ((defpackage.v5) obj).oh6vYeIP).groupCount() + 1;
            default:
                defpackage.hu0 hu0Var = (defpackage.hu0) obj;
                hu0Var.getClass();
                return hu0Var.xiZrDbcSW0;
        }
    }

    @Override // defpackage.SyNS6RMn, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                if (obj == null ? true : obj instanceof defpackage.zh0) {
                    return super.contains((defpackage.zh0) obj);
                }
                return false;
            default:
                return ((defpackage.hu0) this.xiZrDbcSW0).containsValue(obj);
        }
    }

    @Override // defpackage.SyNS6RMn, java.util.Collection
    public boolean isEmpty() {
        switch (this.adDC3e2L) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.adDC3e2L) {
            case 0:
                return new defpackage.di1(new defpackage.ue1(new defpackage.zd(0, new defpackage.d70(0, size() - 1, 1)), new defpackage.DFo87pBq1E5(14, this), 1));
            default:
                defpackage.yi1 yi1Var = ((defpackage.hu0) this.xiZrDbcSW0).adDC3e2L;
                defpackage.zi1[] zi1VarArr = new defpackage.zi1[8];
                for (int i = 0; i < 8; i++) {
                    zi1VarArr[i] = new defpackage.aj1(2);
                }
                return new defpackage.pu0(yi1Var, zi1VarArr);
        }
    }

    public defpackage.zh0 oh6vYeIP(int i) {
        java.util.regex.Matcher matcher = (java.util.regex.Matcher) ((defpackage.v5) this.xiZrDbcSW0).oh6vYeIP;
        defpackage.d70 QPwENk36pDC = defpackage.x80.QPwENk36pDC(matcher.start(i), matcher.end(i));
        if (QPwENk36pDC.adDC3e2L < 0) {
            return null;
        }
        java.lang.String group = matcher.group(i);
        group.getClass();
        return new defpackage.zh0(group, QPwENk36pDC);
    }
}
