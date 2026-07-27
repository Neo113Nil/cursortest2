package androidx.versionedparcelable;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class NovaLayerMapperBuilderYG6Qzlsvln9dcHKOsc69324002352084 extends MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071 {
    public static int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public Font LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673 blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // androidx.versionedparcelable.MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071
    public final Typeface ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context, BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673[] blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr) {
        try {
            FontFamily RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr, context.getContentResolver());
            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
            FontStyle fontStyle = new FontStyle(Constants.MINIMAL_ERROR_STATUS_CODE, 0);
            Font font = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.getFont(0);
            int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(fontStyle, font.getStyle());
            for (int i = 1; i < RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.getSize(); i++) {
                Font font2 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.getFont(i);
                int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702 = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(fontStyle, font2.getStyle());
                if (YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702 < YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                    font = font2;
                    YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh961339147901702;
                }
            }
            return customFallbackBuilder.setStyle(font.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final FontFamily RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673[] blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673 blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673 : blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr) {
            if (Objects.equals(blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getScheme(), "systemfont")) {
                font = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673);
            } else {
                try {
                    Uri uri = blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    str = blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
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
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495).setSlant(blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 ? 1 : 0).setTtcIndex(blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
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
}
