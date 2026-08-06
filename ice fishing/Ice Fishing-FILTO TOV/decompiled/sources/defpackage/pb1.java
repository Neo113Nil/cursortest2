package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pb1 extends ob1 {
    @Override // defpackage.ob1
    public final Font EXrPz3p7hFb(ru ruVar) {
        Font GWasM1elztuh;
        Uri uri = ruVar.GWasM1elztuh;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = ruVar.OOA6hdeuvCS;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (GWasM1elztuh = jb1.GWasM1elztuh(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return GWasM1elztuh;
                }
                try {
                    return new Font.Builder(GWasM1elztuh).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
