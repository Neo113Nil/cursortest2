package a3;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import e3.k;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends g {
    @Override // a3.g
    public final Font c0(k kVar) {
        Font d10;
        Uri uri = kVar.f2093a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = kVar.f2097e;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d10 = d.d(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return d10;
                }
                try {
                    return new Font.Builder(d10).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
