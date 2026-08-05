package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class fv extends FrameLayout implements lv {
    public boolean MdtA4re8;
    public boolean NCTxEWno;
    public boolean wxUZMvaN;

    public final void NCTxEWno() {
        setVisibility((!this.wxUZMvaN || (!this.NCTxEWno && this.MdtA4re8)) ? 8 : 0);
    }

    @Override // defpackage.qs
    public cs getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // defpackage.qs
    public final void qoPGr6Ce(cs csVar) {
        NCTxEWno();
    }

    public void setDividersEnabled(boolean z) {
        this.wxUZMvaN = z;
        NCTxEWno();
    }

    @Override // defpackage.lv
    public void setExpanded(boolean z) {
        this.NCTxEWno = z;
        NCTxEWno();
    }

    @Override // defpackage.lv
    public void setOnlyShowWhenExpanded(boolean z) {
        this.MdtA4re8 = z;
        NCTxEWno();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
