package kotlin.text;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishFABToolbarView extends CatchingFishMockkMVPLayout {
    @Override // kotlin.text.CatchingFishMockkMVPLayout
    public final Font CatchingFishMVVMAppCompat(CatchingFishRetrofitHiltFAB catchingFishRetrofitHiltFAB) {
        Font CatchingFishReduxKtor;
        Uri uri = catchingFishRetrofitHiltFAB.CatchingFishParcelableFAB;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = catchingFishRetrofitHiltFAB.CatchingFishDaggerWebsocket;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (CatchingFishReduxKtor = CatchingFishGraphQLAdMob.CatchingFishReduxKtor(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return CatchingFishReduxKtor;
                }
                try {
                    return new Font.Builder(CatchingFishReduxKtor).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
