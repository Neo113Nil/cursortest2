package defpackage;

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
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class re0 extends e50 {
    public static int KlHjfFWx(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Font sjUBp5pO(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int KlHjfFWx = KlHjfFWx(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int KlHjfFWx2 = KlHjfFWx(fontStyle, font2.getStyle());
            if (KlHjfFWx2 < KlHjfFWx) {
                font = font2;
                KlHjfFWx = KlHjfFWx2;
            }
        }
        return font;
    }

    public final FontFamily OxcuoDLp(ei[] eiVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (ei eiVar : eiVarArr) {
            if (Objects.equals(eiVar.qoPGr6Ce.getScheme(), "systemfont")) {
                font = amk52bBQ(eiVar);
            } else {
                try {
                    Uri uri = eiVar.qoPGr6Ce;
                    str = eiVar.VgvYg0wo;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(eiVar.MdtA4re8).setSlant(eiVar.wxUZMvaN ? 1 : 0).setTtcIndex(eiVar.NCTxEWno);
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

    @Override // defpackage.e50
    public final Typeface P7K7Inc8(Context context, ei[] eiVarArr, int i) {
        try {
            FontFamily OxcuoDLp = OxcuoDLp(eiVarArr, context.getContentResolver());
            if (OxcuoDLp == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(OxcuoDLp).setStyle(sjUBp5pO(OxcuoDLp, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.e50
    public final Typeface Qr9iLBAD(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.e50
    public final Typeface VgvYg0wo(Context context, bi biVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (ci ciVar : biVar.qoPGr6Ce) {
                try {
                    Font build = new Font.Builder(resources, ciVar.P7K7Inc8).setWeight(ciVar.NCTxEWno).setSlant(ciVar.MdtA4re8 ? 1 : 0).setTtcIndex(ciVar.VgvYg0wo).setFontVariationSettings(ciVar.wxUZMvaN).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(sjUBp5pO(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public Font amk52bBQ(ei eiVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.e50
    public final Typeface b2ZJblxo(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily OxcuoDLp = OxcuoDLp((ei[]) list.get(0), contentResolver);
            if (OxcuoDLp == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(OxcuoDLp);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily OxcuoDLp2 = OxcuoDLp((ei[]) list.get(i2), contentResolver);
                if (OxcuoDLp2 != null) {
                    customFallbackBuilder.addCustomFallback(OxcuoDLp2);
                }
            }
            return customFallbackBuilder.setStyle(sjUBp5pO(OxcuoDLp, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
