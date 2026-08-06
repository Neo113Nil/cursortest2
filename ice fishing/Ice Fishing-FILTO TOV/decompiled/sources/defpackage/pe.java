package defpackage;

import com.combinations.level.experts.MainActivity;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pe extends WIEu4Ya2g8 {
    public boolean iwATDS1i01k;
    public final fo0 uFEq9NpZ;

    public pe(MainActivity mainActivity) {
        super(mainActivity);
        this.uFEq9NpZ = z50.WRKkgoJXwDn(null);
    }

    @Override // defpackage.WIEu4Ya2g8
    public final void Yi7zF1RB1(int i, qx qxVar) {
        qxVar.Uxq83abb04(420213850);
        int i2 = (qxVar.encWxUiV2(this) ? 4 : 2) | i;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 3) != 2)) {
            lv lvVar = (lv) this.uFEq9NpZ.getValue();
            if (lvVar == null) {
                qxVar.MjxSquD6Av(-1238823553);
            } else {
                qxVar.MjxSquD6Av(98585282);
                lvVar.EljAMC1QTz(qxVar, 0);
            }
            qxVar.WIEu4Ya2g8(false);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new iwATDS1i01k(this, i, 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return pe.class.getName();
    }

    @Override // defpackage.WIEu4Ya2g8
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.iwATDS1i01k;
    }

    public final void setContent(lv lvVar) {
        this.iwATDS1i01k = true;
        this.uFEq9NpZ.setValue(lvVar);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            OOA6hdeuvCS();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
