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
    public static final ThreadLocal f942a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f943b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f944c = new Object();

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
    public static Typeface b(Context context, int i, TypedValue typedValue, int i4, b bVar, boolean z6, boolean z9) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i6 = typedValue.assetCookie;
            C0 c02 = G.j.f1039b;
            Typeface typeface2 = (Typeface) c02.a(G.j.b(resources, i, charSequence2, i6, i4));
            if (typeface2 != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new n(0, bVar, typeface2));
                }
                typeface = typeface2;
            } else if (!z9) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        f i9 = b.i(resources.getXml(i), resources);
                        if (i9 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typeface = G.j.a(context, i9, resources, i, charSequence2, typedValue.assetCookie, i4, bVar, z6);
                        }
                    } else {
                        int i10 = typedValue.assetCookie;
                        Typeface f2 = G.j.f1038a.f(context, resources, i, charSequence2, i4);
                        if (f2 != null) {
                            c02.b(G.j.b(resources, i, charSequence2, i10, i4), f2);
                        }
                        if (bVar != null) {
                            if (f2 != null) {
                                new Handler(Looper.getMainLooper()).post(new n(0, bVar, f2));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typeface = f2;
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
        if (typeface == null || bVar != null || z9) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
