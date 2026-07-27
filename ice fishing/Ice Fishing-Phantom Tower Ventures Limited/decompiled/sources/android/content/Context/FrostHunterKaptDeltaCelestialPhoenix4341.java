package android.content.Context;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterKaptDeltaCelestialPhoenix4341 {
    public final CharSequence FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public CharSequence FrostHunterCameraXPixelTurboCosmos9814;
    public final TextPaint FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public BoringLayout.Metrics FrostHunterLevelListDrawableFusionDragonHero2232;
    public boolean FrostHunterRemoteConfigSpeedSpeed8566;
    public float FrostHunterServiceEliteCelestialThunder1757 = Float.NaN;
    public float FrostHunterLifecycleBlazeGammaElite2889 = Float.NaN;

    public FrostHunterKaptDeltaCelestialPhoenix4341(CharSequence charSequence, TextPaint textPaint, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = charSequence;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = textPaint;
        this.FrostHunterBundlePulseFusionHero2475 = i;
    }

    public final BoringLayout.Metrics FrostHunterAlphaAnimationNeoCosmos5761() {
        if (!this.FrostHunterRemoteConfigSpeedSpeed8566) {
            TextDirectionHeuristic FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAnimatedVectorDrawableUltraPulse9884.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterBundlePulseFusionHero2475);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.FrostHunterAlphaAnimationNeoCosmos5761;
            TextPaint textPaint = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = i >= 33 ? BoringLayout.isBoring(charSequence, textPaint, FrostHunterAlphaAnimationNeoCosmos5761, true, null) : !FrostHunterAlphaAnimationNeoCosmos5761.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.FrostHunterRemoteConfigSpeedSpeed8566 = true;
        }
        return this.FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (android.content.Context.FrostHunterChipNovaPhantomElite7665.FrostHunterRemoteConfigSpeedSpeed8566(r2, android.content.Context.FrostHunterRoomDaoQuantumAuroraMaster3136.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float FrostHunterBundlePulseFusionHero2475() {
        if (!Float.isNaN(this.FrostHunterServiceEliteCelestialThunder1757)) {
            return this.FrostHunterServiceEliteCelestialThunder1757;
        }
        BoringLayout.Metrics FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
        float f = FrostHunterAlphaAnimationNeoCosmos5761 != null ? FrostHunterAlphaAnimationNeoCosmos5761.width : -1;
        TextPaint textPaint = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (f < 0.0f) {
            f = (float) Math.ceil(Layout.getDesiredWidth(FrostHunterConstraintSetCloneMasterUltraRogue2633(), 0, FrostHunterConstraintSetCloneMasterUltraRogue2633().length(), textPaint));
        }
        if (f != 0.0f) {
            CharSequence charSequence = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!FrostHunterChipNovaPhantomElite7665.FrostHunterRemoteConfigSpeedSpeed8566(spanned, FrostHunterLocationManagerVortexDragon3041.class)) {
                }
                f += 0.5f;
            }
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = f;
        return f;
    }

    public final CharSequence FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (charSequence == null) {
            charSequence = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (FrostHunterChipNovaPhantomElite7665.FrostHunterRemoteConfigSpeedSpeed8566(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    int i = 0;
                    while (true) {
                        if (!(i < characterStyleArr.length)) {
                            break;
                        }
                        int i2 = i + 1;
                        try {
                            CharacterStyle characterStyle = characterStyleArr[i];
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = charSequence;
        }
        return charSequence;
    }
}
