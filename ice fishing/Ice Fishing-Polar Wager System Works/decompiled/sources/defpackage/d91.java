package defpackage;

/* loaded from: classes.dex */
public final class d91 extends android.text.style.CharacterStyle {
    public final float F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final float oh6vYeIP;
    public final float r1MBDhnF;

    public d91(int i, float f, float f2, float f3) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = f;
        this.r1MBDhnF = f2;
        this.F7NU4MC0GW = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setShadowLayer(this.F7NU4MC0GW, this.oh6vYeIP, this.r1MBDhnF, this.IHQe1A4L2xu);
    }
}
