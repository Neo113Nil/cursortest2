package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class i30 {
    public static final ThreadLocal qoPGr6Ce = new ThreadLocal();
    public static final WeakHashMap NCTxEWno = new WeakHashMap(0);
    public static final Object MdtA4re8 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cc A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface qoPGr6Ce(Context context, int i, TypedValue typedValue, int i2, ej0 ej0Var, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            mq mqVar = me0.NCTxEWno;
            Typeface typeface2 = (Typeface) mqVar.Qr9iLBAD(me0.NCTxEWno(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (ej0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new a1GxQO7H(ej0Var, 2, typeface2));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        ai lwWCatUu = ra.lwWCatUu(resources.getXml(i), resources);
                        if (lwWCatUu == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (ej0Var != null) {
                                ej0Var.wxUZMvaN(-3);
                            }
                        } else {
                            typeface = me0.qoPGr6Ce(context, lwWCatUu, resources, i, charSequence2, typedValue.assetCookie, i2, ej0Var, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface Qr9iLBAD = me0.qoPGr6Ce.Qr9iLBAD(context, resources, i, charSequence2, i2);
                        if (Qr9iLBAD != null) {
                            mqVar.ow5vqvCr(me0.NCTxEWno(resources, i, charSequence2, i4, i2), Qr9iLBAD);
                        }
                        if (ej0Var != null) {
                            if (Qr9iLBAD != null) {
                                new Handler(Looper.getMainLooper()).post(new a1GxQO7H(ej0Var, 2, Qr9iLBAD));
                            } else {
                                ej0Var.wxUZMvaN(-3);
                            }
                        }
                        typeface = Qr9iLBAD;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (ej0Var != null) {
                        ej0Var.wxUZMvaN(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (ej0Var != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (ej0Var != null) {
            ej0Var.wxUZMvaN(-3);
        }
        if (typeface == null || ej0Var != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
