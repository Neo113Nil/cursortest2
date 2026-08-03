package a3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import e3.k;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class g extends v6.a {
    public static Font a0(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int d02 = d0(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int d03 = d0(fontStyle, font2.getStyle());
            if (d03 < d02) {
                font = font2;
                d02 = d03;
            }
        }
        return font;
    }

    public static int d0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // v6.a
    public final k B(k[] kVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final FontFamily b0(k[] kVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (k kVar : kVarArr) {
            if (Objects.equals(kVar.f2093a.getScheme(), "systemfont")) {
                font = c0(kVar);
            } else {
                try {
                    Uri uri = kVar.f2093a;
                    str = kVar.f2097e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e10) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(kVar.f2095c).setSlant(kVar.f2096d ? 1 : 0).setTtcIndex(kVar.f2094b);
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

    public Font c0(k kVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // v6.a
    public final Typeface t(Context context, z2.e eVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (z2.f fVar : eVar.f9076a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f9082f).setWeight(fVar.f9078b).setSlant(fVar.f9079c ? 1 : 0).setTtcIndex(fVar.f9081e).setFontVariationSettings(fVar.f9080d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(a0(build2, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // v6.a
    public final Typeface u(Context context, k[] kVarArr, int i10) {
        try {
            FontFamily b02 = b0(kVarArr, context.getContentResolver());
            if (b02 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(b02).setStyle(a0(b02, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // v6.a
    public final Typeface v(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily b02 = b0((k[]) list.get(0), contentResolver);
            if (b02 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(b02);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily b03 = b0((k[]) list.get(i11), contentResolver);
                if (b03 != null) {
                    customFallbackBuilder.addCustomFallback(b03);
                }
            }
            return customFallbackBuilder.setStyle(a0(b02, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // v6.a
    public final Typeface w(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }
}
