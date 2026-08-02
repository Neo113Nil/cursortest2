package defpackage;

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
public final class idt extends hdg {
    public static Font o0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int q0 = q0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int q02 = q0(fontStyle, font2.getStyle());
            if (q02 < q0) {
                font = font2;
                q0 = q02;
            }
        }
        return font;
    }

    public static FontFamily p0(vqc[] vqcVarArr, ContentResolver contentResolver) {
        int i;
        ParcelFileDescriptor openFileDescriptor;
        int length = vqcVarArr.length;
        FontFamily.Builder builder = null;
        while (i < length) {
            vqc vqcVar = vqcVarArr[i];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(vqcVar.a, "r", null);
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            if (openFileDescriptor == null) {
                i = openFileDescriptor == null ? i + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(vqcVar.c).setSlant(vqcVar.d ? 1 : 0).setTtcIndex(vqcVar.b).build();
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

    public static int q0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.hdg
    public final Typeface O(Context context, iqc iqcVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (jqc jqcVar : iqcVar.a) {
                try {
                    Font build = new Font.Builder(resources, jqcVar.f).setWeight(jqcVar.b).setSlant(jqcVar.c ? 1 : 0).setTtcIndex(jqcVar.e).setFontVariationSettings(jqcVar.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(o0(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.hdg
    public final Typeface P(Context context, vqc[] vqcVarArr, int i) {
        try {
            FontFamily p0 = p0(vqcVarArr, context.getContentResolver());
            if (p0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(p0).setStyle(o0(p0, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.hdg
    public final Typeface Q(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily p0 = p0((vqc[]) list.get(0), contentResolver);
            if (p0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(p0);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily p02 = p0((vqc[]) list.get(i2), contentResolver);
                if (p02 != null) {
                    customFallbackBuilder.addCustomFallback(p02);
                }
            }
            return customFallbackBuilder.setStyle(o0(p0, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.hdg
    public final Typeface R(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
