package F;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.internal.ads.C0;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f879a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f880b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f881c = new Object();

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
    public static Typeface b(Context context, int i, TypedValue typedValue, int i6, b bVar, boolean z3, boolean z6) {
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
            C0 c02 = G.j.f1013b;
            Typeface typeface2 = (Typeface) c02.a(G.j.b(resources, i, charSequence2, i9, i6));
            if (typeface2 != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new n(0, bVar, typeface2));
                }
                typeface = typeface2;
            } else if (!z6) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        f i10 = b.i(resources.getXml(i), resources);
                        if (i10 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typeface = G.j.a(context, i10, resources, i, charSequence2, typedValue.assetCookie, i6, bVar, z3);
                        }
                    } else {
                        int i11 = typedValue.assetCookie;
                        Typeface g4 = G.j.f1012a.g(context, resources, i, charSequence2, i6);
                        if (g4 != null) {
                            c02.b(G.j.b(resources, i, charSequence2, i11, i6), g4);
                        }
                        if (bVar != null) {
                            if (g4 != null) {
                                new Handler(Looper.getMainLooper()).post(new n(0, bVar, g4));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typeface = g4;
                    }
                } catch (IOException e9) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e9);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e10) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e10);
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
        if (typeface == null || bVar != null || z6) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
