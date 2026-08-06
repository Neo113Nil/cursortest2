package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yq1 extends defpackage.xq1 {
    @Override // defpackage.xq1
    public final android.graphics.fonts.Font Fu5WBEia9jBo(defpackage.y00 y00Var) {
        android.graphics.fonts.Font JhCgjQRTAOCT;
        android.net.Uri uri = y00Var.ZpBGe2uQfcn8;
        boolean equals = java.util.Objects.equals(uri.getScheme(), "systemfont");
        java.lang.String str = y00Var.WDYagTQQm9ns;
        java.lang.String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            android.graphics.Typeface create = android.graphics.Typeface.create(authority, 0);
            android.graphics.Typeface create2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (JhCgjQRTAOCT = defpackage.rq1.JhCgjQRTAOCT(create)) != null) {
                if (android.text.TextUtils.isEmpty(str)) {
                    return JhCgjQRTAOCT;
                }
                try {
                    return new android.graphics.fonts.Font.Builder(JhCgjQRTAOCT).setFontVariationSettings(str).build();
                } catch (java.io.IOException unused) {
                    android.util.Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
