package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class wuj0 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:53:0x003f, code lost:
    
        if (r4.c == r9.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        tuj0 tuj0Var;
        uuj0 uuj0Var = new uuj0(resources, theme);
        synchronized (c) {
            try {
                SparseArray sparseArray = (SparseArray) b.get(uuj0Var);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (tuj0Var = (tuj0) sparseArray.get(i)) != null) {
                    if (tuj0Var.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (tuj0Var.c != 0) {
                            }
                            colorStateList2 = tuj0Var.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = xgc.a(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (c) {
            try {
                WeakHashMap weakHashMap = b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(uuj0Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(uuj0Var, sparseArray2);
                }
                sparseArray2.append(i, new tuj0(colorStateList, uuj0Var.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static Typeface b(int i, Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bf A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, vuj0 vuj0Var, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            Typeface typeface2 = (Typeface) ep11.b.c(ep11.d(resources, i, charSequence2, typedValue.assetCookie, i2));
            int i3 = 19;
            if (typeface2 != null) {
                if (vuj0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new xmf0(i3, vuj0Var, typeface2));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        yyr F = jx81.F(resources.getXml(i), resources);
                        if (F == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (vuj0Var != null) {
                                vuj0Var.a(-3);
                            }
                        } else {
                            typeface = ep11.b(context, F, resources, i, charSequence2, typedValue.assetCookie, i2, vuj0Var, z);
                        }
                    } else {
                        Typeface c2 = ep11.c(resources, i, charSequence2, typedValue.assetCookie, i2);
                        if (vuj0Var != null) {
                            if (c2 != null) {
                                new Handler(Looper.getMainLooper()).post(new xmf0(i3, vuj0Var, c2));
                            } else {
                                vuj0Var.a(-3);
                            }
                        }
                        typeface = c2;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (vuj0Var != null) {
                        vuj0Var.a(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (vuj0Var != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (vuj0Var != null) {
            vuj0Var.a(-3);
        }
        if (typeface == null || vuj0Var != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
