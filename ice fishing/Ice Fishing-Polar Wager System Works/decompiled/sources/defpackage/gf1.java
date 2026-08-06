package defpackage;

/* loaded from: classes.dex */
public final class gf1 extends android.text.style.CharacterStyle {
    public final boolean IHQe1A4L2xu;
    public final boolean oh6vYeIP;

    public gf1(boolean z, boolean z2) {
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setUnderlineText(this.IHQe1A4L2xu);
        textPaint.setStrikeThruText(this.oh6vYeIP);
    }
}
