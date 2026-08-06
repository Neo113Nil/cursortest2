package defpackage;

/* loaded from: classes.dex */
public final class io0 {
    public final java.util.List IHQe1A4L2xu;
    public final int oh6vYeIP;

    public io0(int i, java.util.List list) {
        this.IHQe1A4L2xu = list;
        this.oh6vYeIP = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        JlrlGoKF.append(new defpackage.d70(0, list.size() - 1, 1));
        JlrlGoKF.append("'.");
        throw new java.lang.IllegalArgumentException(JlrlGoKF.toString().toString());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.io0.class != obj.getClass()) {
            return false;
        }
        defpackage.io0 io0Var = (defpackage.io0) obj;
        return this.oh6vYeIP == io0Var.oh6vYeIP && defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, io0Var.IHQe1A4L2xu);
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode() + (this.oh6vYeIP * 31);
    }

    public final java.lang.String toString() {
        return "NavigationEventHistory(currentIndex=" + this.oh6vYeIP + ", mergedHistory=" + this.IHQe1A4L2xu + ')';
    }

    public io0() {
        this(-1, defpackage.nt.adDC3e2L);
    }
}
