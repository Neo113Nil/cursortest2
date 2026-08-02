package androidx.core.graphics;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.provider.FontsContractCompat;
import com.google.android.gms.dynamite.zzg;
import java.io.IOException;

/* loaded from: classes.dex */
public final class TypefaceCompatApi31Impl extends zzg {
    @Override // com.google.android.gms.dynamite.zzg
    public final Font getFontFromSystemFont(FontsContractCompat.FontInfo fontInfo) {
        Font guessPrimaryFont;
        String systemFont = fontInfo.getSystemFont();
        if (systemFont != null) {
            Typeface create = Typeface.create(systemFont, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (guessPrimaryFont = TypefaceCompat.guessPrimaryFont(create)) != null) {
                if (TextUtils.isEmpty(fontInfo.getVariationSettings())) {
                    return guessPrimaryFont;
                }
                try {
                    return new Font.Builder(guessPrimaryFont).setFontVariationSettings(fontInfo.getVariationSettings()).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
