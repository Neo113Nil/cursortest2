package r;

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
import q.C1033c;
import q.C1034d;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class i extends AbstractC1050a {
    public static Font G(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int H2 = H(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int H3 = H(fontStyle, font2.getStyle());
            if (H3 < H2) {
                font = font2;
                H2 = H3;
            }
        }
        return font;
    }

    public static int H(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // u0.AbstractC1050a
    public final Typeface j(Context context, C1033c c1033c, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (C1034d c1034d : c1033c.f8433a) {
                try {
                    Font build = new Font.Builder(resources, c1034d.f8439f).setWeight(c1034d.f8435b).setSlant(c1034d.f8436c ? 1 : 0).setTtcIndex(c1034d.f8438e).setFontVariationSettings(c1034d.f8437d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(G(build2, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // u0.AbstractC1050a
    public final Typeface k(Context context, v.g[] gVarArr, int i2) {
        int i3;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = gVarArr.length;
            FontFamily.Builder builder = null;
            while (i3 < length) {
                v.g gVar = gVarArr[i3];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(gVar.f8497a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i3 = openFileDescriptor == null ? i3 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(gVar.f8499c).setSlant(gVar.f8500d ? 1 : 0).setTtcIndex(gVar.f8498b).build();
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
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(G(build2, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // u0.AbstractC1050a
    public final Typeface l(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // u0.AbstractC1050a
    public final Typeface m(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // u0.AbstractC1050a
    public final v.g q(v.g[] gVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
