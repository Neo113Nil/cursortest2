package G;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class o extends V2.a {
    public static Font y(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? com.anythink.core.common.m.a.f14401n : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int z3 = z(fontStyle, font.getStyle());
        for (int i6 = 1; i6 < fontFamily.getSize(); i6++) {
            Font font2 = fontFamily.getFont(i6);
            int z6 = z(fontStyle, font2.getStyle());
            if (z6 < z3) {
                font = font2;
                z3 = z6;
            }
        }
        return font;
    }

    public static int z(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // V2.a
    public final Typeface d(Context context, F.g gVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (F.h hVar : gVar.f857a) {
                try {
                    Font build = new Font.Builder(resources, hVar.f863f).setWeight(hVar.f859b).setSlant(hVar.f860c ? 1 : 0).setTtcIndex(hVar.f862e).setFontVariationSettings(hVar.f861d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(y(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // V2.a
    public final Typeface e(Context context, L.h[] hVarArr, int i) {
        int i6;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = hVarArr.length;
            FontFamily.Builder builder = null;
            while (i6 < length) {
                L.h hVar = hVarArr[i6];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(hVar.f1598a, com.anythink.expressad.foundation.d.d.bv, null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i6 = openFileDescriptor == null ? i6 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(hVar.f1600c).setSlant(hVar.f1601d ? 1 : 0).setTtcIndex(hVar.f1599b).build();
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
            if (builder != null) {
                FontFamily build2 = builder.build();
                return new Typeface.CustomFallbackBuilder(build2).setStyle(y(build2, i).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // V2.a
    public final Typeface f(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // V2.a
    public final Typeface g(Context context, Resources resources, int i, String str, int i6) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // V2.a
    public final L.h k(L.h[] hVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
