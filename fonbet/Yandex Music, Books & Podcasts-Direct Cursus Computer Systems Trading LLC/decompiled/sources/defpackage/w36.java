package defpackage;

/* loaded from: classes6.dex */
public final class w36 extends ou2 {
    public final /* synthetic */ int g;
    public final euo h;
    public final aqt i;

    public w36(int i) {
        this.g = i;
        switch (i) {
            case 1:
                this.h = euo.F0;
                this.i = new aqt(wjb.MusicHistoryScreen);
                break;
            case 2:
                this.h = euo.x;
                this.i = new aqt(wjb.ProfileScreen);
                break;
            case 3:
                this.h = euo.s;
                this.i = new aqt(wjb.PaywallScreen);
                break;
            default:
                this.h = euo.H0;
                this.i = new aqt(wjb.ConcertsLandingScreen);
                break;
        }
    }

    @Override // defpackage.ypt
    public final cqt T() {
        switch (this.g) {
        }
        return this.i;
    }

    @Override // defpackage.ypt
    public final euo getType() {
        switch (this.g) {
        }
        return this.h;
    }
}
