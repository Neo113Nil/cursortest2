package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class ob1 extends q70 {
    public static int ozMwhSAI(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public Font EXrPz3p7hFb(ru ruVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    public final FontFamily k8h8IjolWQ(ru[] ruVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (ru ruVar : ruVarArr) {
            if (Objects.equals(ruVar.GWasM1elztuh.getScheme(), "systemfont")) {
                font = EXrPz3p7hFb(ruVar);
            } else {
                try {
                    Uri uri = ruVar.GWasM1elztuh;
                    str = ruVar.OOA6hdeuvCS;
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
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(ruVar.X1lG3V04pd).setSlant(ruVar.xqGvceK5x ? 1 : 0).setTtcIndex(ruVar.Yi7zF1RB1);
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

    @Override // defpackage.q70
    public final Typeface rQPn8YBR(Context context, ru[] ruVarArr) {
        try {
            FontFamily k8h8IjolWQ = k8h8IjolWQ(ruVarArr, context.getContentResolver());
            if (k8h8IjolWQ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(k8h8IjolWQ);
            FontStyle fontStyle = new FontStyle(400, 0);
            Font font = k8h8IjolWQ.getFont(0);
            int ozMwhSAI = ozMwhSAI(fontStyle, font.getStyle());
            for (int i = 1; i < k8h8IjolWQ.getSize(); i++) {
                Font font2 = k8h8IjolWQ.getFont(i);
                int ozMwhSAI2 = ozMwhSAI(fontStyle, font2.getStyle());
                if (ozMwhSAI2 < ozMwhSAI) {
                    font = font2;
                    ozMwhSAI = ozMwhSAI2;
                }
            }
            return customFallbackBuilder.setStyle(font.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
