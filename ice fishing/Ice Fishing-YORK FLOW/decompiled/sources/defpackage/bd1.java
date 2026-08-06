package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bd1 extends android.text.style.CharacterStyle {
    public final float JhCgjQRTAOCT;
    public final int ZpBGe2uQfcn8;
    public final float fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;

    public bd1(int i, float f, float f2, float f3) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = f;
        this.fWTAfUmVKrZq = f2;
        this.JhCgjQRTAOCT = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setShadowLayer(this.JhCgjQRTAOCT, this.giKS3J6vZuNy, this.fWTAfUmVKrZq, this.ZpBGe2uQfcn8);
    }
}
