package G;

import L.j;
import a.AbstractC0078a;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends AbstractC0078a {
    public static Font e0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int g02 = g0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int g03 = g0(fontStyle, font2.getStyle());
            if (g03 < g02) {
                font = font2;
                g02 = g03;
            }
        }
        return font;
    }

    public static FontFamily f0(j[] jVarArr, ContentResolver contentResolver) {
        int i;
        ParcelFileDescriptor openFileDescriptor;
        int length = jVarArr.length;
        FontFamily.Builder builder = null;
        while (i < length) {
            j jVar = jVarArr[i];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(jVar.f431a, "r", null);
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            if (openFileDescriptor == null) {
                i = openFileDescriptor == null ? i + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(jVar.f433c).setSlant(jVar.f434d ? 1 : 0).setTtcIndex(jVar.f432b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int g0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // a.AbstractC0078a
    public final Typeface o(Context context, F.f fVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (F.g gVar : fVar.f197a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f202f).setWeight(gVar.f199b).setSlant(gVar.f200c ? 1 : 0).setTtcIndex(gVar.e).setFontVariationSettings(gVar.f201d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(e0(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // a.AbstractC0078a
    public final Typeface p(Context context, j[] jVarArr, int i) {
        try {
            FontFamily f02 = f0(jVarArr, context.getContentResolver());
            if (f02 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(f02).setStyle(e0(f02, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // a.AbstractC0078a
    public final Typeface q(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily f02 = f0((j[]) list.get(0), contentResolver);
            if (f02 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(f02);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily f03 = f0((j[]) list.get(i2), contentResolver);
                if (f03 != null) {
                    customFallbackBuilder.addCustomFallback(f03);
                }
            }
            return customFallbackBuilder.setStyle(e0(f02, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // a.AbstractC0078a
    public final Typeface r(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // a.AbstractC0078a
    public final j w(j[] jVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
