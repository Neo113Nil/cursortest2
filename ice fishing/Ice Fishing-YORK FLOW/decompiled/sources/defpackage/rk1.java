package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rk1 extends android.text.style.CharacterStyle {
    public final boolean ZpBGe2uQfcn8;
    public final boolean giKS3J6vZuNy;

    public rk1(boolean z, boolean z2) {
        this.ZpBGe2uQfcn8 = z;
        this.giKS3J6vZuNy = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setUnderlineText(this.ZpBGe2uQfcn8);
        textPaint.setStrikeThruText(this.giKS3J6vZuNy);
    }
}
