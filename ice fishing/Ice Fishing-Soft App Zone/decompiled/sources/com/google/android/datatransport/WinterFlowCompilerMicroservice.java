package com.google.android.datatransport;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerMicroservice extends WinterFlowInheritanceProtocol {
    @Override // com.google.android.datatransport.WinterFlowInheritanceProtocol
    public final Font WinterFlowPackageIDE(WinterFlowLibraryEntity winterFlowLibraryEntity) {
        Font WinterFlowArrayNetwork;
        Uri uri = winterFlowLibraryEntity.WinterFlowRouterStructure;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = winterFlowLibraryEntity.WinterFlowVariableVersionControl;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (WinterFlowArrayNetwork = WinterFlowAlgorithmProxy.WinterFlowArrayNetwork(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return WinterFlowArrayNetwork;
                }
                try {
                    return new Font.Builder(WinterFlowArrayNetwork).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
