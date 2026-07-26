package android.content.Context;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnimatedVectorDrawableMaxRogueShadow9762 implements Spannable {
    public boolean FrostHunterCameraXPixelTurboCosmos9814 = false;
    public Spannable FrostHunterFlowMaxDragonHero5809;

    public FrostHunterAnimatedVectorDrawableMaxRogueShadow9762(Spannable spannable) {
        this.FrostHunterFlowMaxDragonHero5809 = spannable;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        Spannable spannable = this.FrostHunterFlowMaxDragonHero5809;
        if (!this.FrostHunterCameraXPixelTurboCosmos9814) {
            if ((Build.VERSION.SDK_INT < 28 ? new FrostHunterAuthPixelSolar5465() : new FrostHunterOnItemClickListenerGammaNovaCelestial9513()).FrostHunterLifecycleBlazeGammaElite2889(spannable)) {
                this.FrostHunterFlowMaxDragonHero5809 = new SpannableString(spannable);
            }
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.FrostHunterFlowMaxDragonHero5809.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.FrostHunterFlowMaxDragonHero5809.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.FrostHunterFlowMaxDragonHero5809.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.FrostHunterFlowMaxDragonHero5809.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.FrostHunterFlowMaxDragonHero5809.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.FrostHunterFlowMaxDragonHero5809.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.FrostHunterFlowMaxDragonHero5809.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.FrostHunterFlowMaxDragonHero5809.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.FrostHunterFlowMaxDragonHero5809.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        FrostHunterAlphaAnimationNeoCosmos5761();
        this.FrostHunterFlowMaxDragonHero5809.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        FrostHunterAlphaAnimationNeoCosmos5761();
        this.FrostHunterFlowMaxDragonHero5809.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.FrostHunterFlowMaxDragonHero5809.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.FrostHunterFlowMaxDragonHero5809.toString();
    }
}
