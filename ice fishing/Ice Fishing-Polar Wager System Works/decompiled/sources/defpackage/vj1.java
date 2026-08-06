package defpackage;

/* loaded from: classes.dex */
public final class vj1 extends defpackage.uj1 {
    @Override // defpackage.uj1
    public final android.graphics.fonts.Font mAr5m2L7gYDP(defpackage.gz gzVar) {
        android.graphics.fonts.Font IHQe1A4L2xu;
        android.net.Uri uri = gzVar.IHQe1A4L2xu;
        boolean equals = java.util.Objects.equals(uri.getScheme(), "systemfont");
        java.lang.String str = gzVar.adDC3e2L;
        java.lang.String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            android.graphics.Typeface create = android.graphics.Typeface.create(authority, 0);
            android.graphics.Typeface create2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (IHQe1A4L2xu = defpackage.pj1.IHQe1A4L2xu(create)) != null) {
                if (android.text.TextUtils.isEmpty(str)) {
                    return IHQe1A4L2xu;
                }
                try {
                    return new android.graphics.fonts.Font.Builder(IHQe1A4L2xu).setFontVariationSettings(str).build();
                } catch (java.io.IOException unused) {
                    android.util.Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
