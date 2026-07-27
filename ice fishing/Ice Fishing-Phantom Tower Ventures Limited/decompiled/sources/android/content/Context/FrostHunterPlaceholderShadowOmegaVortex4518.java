package android.content.Context;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPlaceholderShadowOmegaVortex4518 extends FrostHunterDialogFragmentHyperionBeta7620 {
    @Override // android.content.Context.FrostHunterDialogFragmentHyperionBeta7620
    public final Font FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterPreviewHyperionMegaInferno5813 frostHunterPreviewHyperionMegaInferno5813) {
        Font FrostHunterServiceEliteCelestialThunder1757;
        Uri uri = frostHunterPreviewHyperionMegaInferno5813.FrostHunterAlphaAnimationNeoCosmos5761;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = frostHunterPreviewHyperionMegaInferno5813.FrostHunterLifecycleBlazeGammaElite2889;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (FrostHunterServiceEliteCelestialThunder1757 = FrostHunterConstraintLayoutHyperDelta1865.FrostHunterServiceEliteCelestialThunder1757(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return FrostHunterServiceEliteCelestialThunder1757;
                }
                try {
                    return new Font.Builder(FrostHunterServiceEliteCelestialThunder1757).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
