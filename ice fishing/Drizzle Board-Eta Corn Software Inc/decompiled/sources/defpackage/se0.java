package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class se0 extends re0 {
    @Override // defpackage.re0
    public final Font amk52bBQ(ei eiVar) {
        Font wxUZMvaN;
        Uri uri = eiVar.qoPGr6Ce;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = eiVar.VgvYg0wo;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (wxUZMvaN = me0.wxUZMvaN(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return wxUZMvaN;
                }
                try {
                    return new Font.Builder(wxUZMvaN).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
