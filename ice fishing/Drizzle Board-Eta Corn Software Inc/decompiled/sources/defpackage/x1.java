package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class x1 extends g8 {
    public y1 eVhOlqcC;
    public int jb9XjC4I;

    public boolean getAllowsGoneWidget() {
        return this.eVhOlqcC.B1cjorwa;
    }

    public int getMargin() {
        return this.eVhOlqcC.X1t0wlBd;
    }

    public int getType() {
        return this.jb9XjC4I;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.eVhOlqcC.B1cjorwa = z;
    }

    public void setDpMargin(int i) {
        this.eVhOlqcC.X1t0wlBd = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.eVhOlqcC.X1t0wlBd = i;
    }

    public void setType(int i) {
        this.jb9XjC4I = i;
    }
}
