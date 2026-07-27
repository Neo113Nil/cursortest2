package androidx.versionedparcelable;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class CosmicForgeConcurrencyControllerQpjNZSAx4E2tyN5pDx54586687185784 extends NovaLayerMapperBuilderYG6Qzlsvln9dcHKOsc69324002352084 {
    @Override // androidx.versionedparcelable.NovaLayerMapperBuilderYG6Qzlsvln9dcHKOsc69324002352084
    public final Font LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673 blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673) {
        Font ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        Uri uri = blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = UltraBufferModuleContextMlhwMKPCmlLPCCyRVv91224359513707.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                }
                try {
                    return new Font.Builder(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
