package F;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.internal.ads.B0;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f927a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f928b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f929c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface b(Context context, int i, TypedValue typedValue, int i4, b bVar, boolean z8, boolean z9) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i9 = typedValue.assetCookie;
            B0 b02 = G.j.f1159b;
            Typeface typeface2 = (Typeface) b02.b(G.j.b(resources, i, charSequence2, i9, i4));
            if (typeface2 != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new D5.b(1, bVar, typeface2));
                }
                typeface = typeface2;
            } else if (!z9) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        f i10 = b.i(resources.getXml(i), resources);
                        if (i10 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typeface = G.j.a(context, i10, resources, i, charSequence2, typedValue.assetCookie, i4, bVar, z8);
                        }
                    } else {
                        int i11 = typedValue.assetCookie;
                        Typeface k6 = G.j.f1158a.k(context, resources, i, charSequence2, i4);
                        if (k6 != null) {
                            b02.c(G.j.b(resources, i, charSequence2, i11, i4), k6);
                        }
                        if (bVar != null) {
                            if (k6 != null) {
                                new Handler(Looper.getMainLooper()).post(new D5.b(1, bVar, k6));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typeface = k6;
                    }
                } catch (IOException e6) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e6);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e9) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e9);
                    if (bVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (bVar != null) {
            bVar.a(-3);
        }
        if (typeface == null || bVar != null || z9) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
