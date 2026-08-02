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

/* loaded from: classes.dex */
public abstract class e3o {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, hag hagVar, boolean z, boolean z2) {
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
            e0h e0hVar = cdt.b;
            Typeface typeface2 = (Typeface) e0hVar.get(cdt.b(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (hagVar != null) {
                    new Handler(Looper.getMainLooper()).post(new zvh(20, hagVar, typeface2));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        hqc E = hld.E(resources.getXml(i), resources);
                        if (E == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (hagVar != null) {
                                hagVar.n(-3);
                            }
                        } else {
                            typeface = cdt.a(context, E, resources, i, charSequence2, typedValue.assetCookie, i2, hagVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface R = cdt.a.R(context, resources, i, charSequence2, i2);
                        if (R != null) {
                            e0hVar.put(cdt.b(resources, i, charSequence2, i4, i2), R);
                        }
                        if (hagVar != null) {
                            if (R != null) {
                                new Handler(Looper.getMainLooper()).post(new zvh(20, hagVar, R));
                            } else {
                                hagVar.n(-3);
                            }
                        }
                        typeface = R;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (hagVar != null) {
                        hagVar.n(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (hagVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (hagVar != null) {
            hagVar.n(-3);
        }
        if (typeface == null || hagVar != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
