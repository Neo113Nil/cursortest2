package android.content.Context;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterVelocityTrackerNovaXSpeedCelestial5635 {
    public final ArrayList FrostHunterAlphaAnimationNeoCosmos5761;
    public final StringBuilder FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public final ArrayList FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterRemoteConfigSpeedSpeed8566;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterVelocityTrackerNovaXSpeedCelestial5635(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.FrostHunterBundlePulseFusionHero2475 = sb;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.FrostHunterServiceEliteCelestialThunder1757 = 15;
        this.FrostHunterLifecycleBlazeGammaElite2889 = 0;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i2;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(char c) {
        StringBuilder sb = this.FrostHunterBundlePulseFusionHero2475;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    public final FrostHunterConstraintSetPhoenixVision2576 FrostHunterBundlePulseFusionHero2475(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) FrostHunterServiceEliteCelestialThunder1757());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.FrostHunterLifecycleBlazeGammaElite2889 + this.FrostHunterLevelListDrawableFusionDragonHero2232;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        int i5 = i;
        if (i5 == Integer.MIN_VALUE) {
            i5 = (this.FrostHunterRemoteConfigSpeedSpeed8566 != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.FrostHunterRemoteConfigSpeedSpeed8566 != 2 || i4 <= 0) ? 0 : 2 : 1;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.FrostHunterServiceEliteCelestialThunder1757;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.FrostHunterRemoteConfigSpeedSpeed8566 == 1) {
            i6 -= this.FrostHunterCameraXPixelTurboCosmos9814 - 1;
        }
        return new FrostHunterConstraintSetPhoenixVision2576(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, Integer.MIN_VALUE, f, i5, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        StringBuilder sb = this.FrostHunterBundlePulseFusionHero2475;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.FrostHunterAlphaAnimationNeoCosmos5761;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FrostHunterWorkManagerCelestialCyber2432 frostHunterWorkManagerCelestialCyber2432 = (FrostHunterWorkManagerCelestialCyber2432) arrayList.get(size);
                int i = frostHunterWorkManagerCelestialCyber2432.FrostHunterBundlePulseFusionHero2475;
                if (i != length) {
                    return;
                }
                frostHunterWorkManagerCelestialCyber2432.FrostHunterBundlePulseFusionHero2475 = i - 1;
            }
        }
    }

    public final boolean FrostHunterLifecycleBlazeGammaElite2889() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.isEmpty() && this.FrostHunterConstraintSetCloneMasterUltraRogue2633.isEmpty() && this.FrostHunterBundlePulseFusionHero2475.length() == 0;
    }

    public final SpannableString FrostHunterServiceEliteCelestialThunder1757() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.FrostHunterBundlePulseFusionHero2475);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i5 >= arrayList.size()) {
                break;
            }
            FrostHunterWorkManagerCelestialCyber2432 frostHunterWorkManagerCelestialCyber2432 = (FrostHunterWorkManagerCelestialCyber2432) arrayList.get(i5);
            boolean z2 = frostHunterWorkManagerCelestialCyber2432.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i7 = frostHunterWorkManagerCelestialCyber2432.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = FrostHunterPaintFlagsDrawFilterShadowSparkNovaX4326.FrostHunterEditTextPulseHyperion1262[i7];
                }
                z = z3;
            }
            int i8 = frostHunterWorkManagerCelestialCyber2432.FrostHunterBundlePulseFusionHero2475;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((FrostHunterWorkManagerCelestialCyber2432) arrayList.get(i5)).FrostHunterBundlePulseFusionHero2475 : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i3 = i4;
                    i6 = i8;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }
}
