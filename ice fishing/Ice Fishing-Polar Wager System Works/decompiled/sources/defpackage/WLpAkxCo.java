package defpackage;

/* loaded from: classes.dex */
public final class WLpAkxCo extends android.text.style.ClickableSpan {
    public final int AARZUJiTa;
    public final int adDC3e2L;
    public final defpackage.dOmtpLcqqI1y xiZrDbcSW0;

    public WLpAkxCo(int i, defpackage.dOmtpLcqqI1y domtplcqqi1y, int i2) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = domtplcqqi1y;
        this.AARZUJiTa = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.adDC3e2L);
        this.xiZrDbcSW0.IHQe1A4L2xu.performAction(this.AARZUJiTa, bundle);
    }
}
