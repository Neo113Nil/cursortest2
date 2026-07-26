package android.content.Context;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterDialogFragmentHyperionBeta7620 extends FrostHunterTextInputLayoutBlazePhoenix5492 {
    public static Font FrostHunterKeyframeGammaGamma1197(FontFamily fontFamily) {
        FontStyle fontStyle = new FontStyle(Constants.MINIMAL_ERROR_STATUS_CODE, 0);
        Font font = fontFamily.getFont(0);
        int FrostHunterLightSensorForceFusion4241 = FrostHunterLightSensorForceFusion4241(fontStyle, font.getStyle());
        for (int i = 1; i < fontFamily.getSize(); i++) {
            Font font2 = fontFamily.getFont(i);
            int FrostHunterLightSensorForceFusion42412 = FrostHunterLightSensorForceFusion4241(fontStyle, font2.getStyle());
            if (FrostHunterLightSensorForceFusion42412 < FrostHunterLightSensorForceFusion4241) {
                font = font2;
                FrostHunterLightSensorForceFusion4241 = FrostHunterLightSensorForceFusion42412;
            }
        }
        return font;
    }

    public static int FrostHunterLightSensorForceFusion4241(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // android.content.Context.FrostHunterTextInputLayoutBlazePhoenix5492
    public final Typeface FrostHunterBundlePulseFusionHero2475(Context context, FrostHunterPreviewHyperionMegaInferno5813[] frostHunterPreviewHyperionMegaInferno5813Arr) {
        try {
            FontFamily FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFragmentBetaMegaVortex6025(frostHunterPreviewHyperionMegaInferno5813Arr, context.getContentResolver());
            if (FrostHunterFragmentBetaMegaVortex6025 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(FrostHunterFragmentBetaMegaVortex6025).setStyle(FrostHunterKeyframeGammaGamma1197(FrostHunterFragmentBetaMegaVortex6025).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.Context.FrostHunterTextInputLayoutBlazePhoenix5492
    public final Typeface FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context, FrostHunterDataBindingHyperionEclipseNova9876 frostHunterDataBindingHyperionEclipseNova9876, Resources resources) {
        try {
            FontFamily.Builder builder = null;
            for (FrostHunterOnLongClickListenerGammaNovaXMaster7595 frostHunterOnLongClickListenerGammaNovaXMaster7595 : frostHunterDataBindingHyperionEclipseNova9876.FrostHunterAlphaAnimationNeoCosmos5761) {
                try {
                    Font build = new Font.Builder(resources, frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterLevelListDrawableFusionDragonHero2232).setWeight(frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterConstraintSetCloneMasterUltraRogue2633).setSlant(frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterBundlePulseFusionHero2475 ? 1 : 0).setTtcIndex(frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterLifecycleBlazeGammaElite2889).setFontVariationSettings(frostHunterOnLongClickListenerGammaNovaXMaster7595.FrostHunterServiceEliteCelestialThunder1757).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(FrostHunterKeyframeGammaGamma1197(build2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public final FontFamily FrostHunterFragmentBetaMegaVortex6025(FrostHunterPreviewHyperionMegaInferno5813[] frostHunterPreviewHyperionMegaInferno5813Arr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (FrostHunterPreviewHyperionMegaInferno5813 frostHunterPreviewHyperionMegaInferno5813 : frostHunterPreviewHyperionMegaInferno5813Arr) {
            if (Objects.equals(frostHunterPreviewHyperionMegaInferno5813.FrostHunterAlphaAnimationNeoCosmos5761.getScheme(), "systemfont")) {
                font = FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterPreviewHyperionMegaInferno5813);
            } else {
                try {
                    Uri uri = frostHunterPreviewHyperionMegaInferno5813.FrostHunterAlphaAnimationNeoCosmos5761;
                    str = frostHunterPreviewHyperionMegaInferno5813.FrostHunterLifecycleBlazeGammaElite2889;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(frostHunterPreviewHyperionMegaInferno5813.FrostHunterBundlePulseFusionHero2475).setSlant(frostHunterPreviewHyperionMegaInferno5813.FrostHunterServiceEliteCelestialThunder1757 ? 1 : 0).setTtcIndex(frostHunterPreviewHyperionMegaInferno5813.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // android.content.Context.FrostHunterTextInputLayoutBlazePhoenix5492
    public final Typeface FrostHunterLifecycleBlazeGammaElite2889(Context context, Resources resources, String str) {
        try {
            Font build = new Font.Builder(resources, R.font.frost_font).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public Font FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterPreviewHyperionMegaInferno5813 frostHunterPreviewHyperionMegaInferno5813) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // android.content.Context.FrostHunterTextInputLayoutBlazePhoenix5492
    public final Typeface FrostHunterServiceEliteCelestialThunder1757(Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFragmentBetaMegaVortex6025((FrostHunterPreviewHyperionMegaInferno5813[]) list.get(0), contentResolver);
            if (FrostHunterFragmentBetaMegaVortex6025 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(FrostHunterFragmentBetaMegaVortex6025);
            for (int i = 1; i < list.size(); i++) {
                FontFamily FrostHunterFragmentBetaMegaVortex60252 = FrostHunterFragmentBetaMegaVortex6025((FrostHunterPreviewHyperionMegaInferno5813[]) list.get(i), contentResolver);
                if (FrostHunterFragmentBetaMegaVortex60252 != null) {
                    customFallbackBuilder.addCustomFallback(FrostHunterFragmentBetaMegaVortex60252);
                }
            }
            return customFallbackBuilder.setStyle(FrostHunterKeyframeGammaGamma1197(FrostHunterFragmentBetaMegaVortex6025).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
