package com.gamericefishpro.space.t3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import com.gamericefishpro.space.r5.s0;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, b bVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            s0 s0Var = com.gamericefishpro.space.u3.f.b;
            Typeface typeface = (Typeface) s0Var.d(com.gamericefishpro.space.u3.f.b(resources, i, string, i3, i2));
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new com.gamericefishpro.space.bb.h(12, bVar, typeface));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        d dVarI = b.i(resources.getXml(i), resources);
                        if (dVarI == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typefaceA = com.gamericefishpro.space.u3.f.a(context, dVarI, resources, i, string, typedValue.assetCookie, i2, bVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceJ = com.gamericefishpro.space.u3.f.a.j(context, resources, i, string, i2);
                        if (typefaceJ != null) {
                            s0Var.g(com.gamericefishpro.space.u3.f.b(resources, i, string, i4, i2), typefaceJ);
                        }
                        if (bVar != null) {
                            if (typefaceJ != null) {
                                new Handler(Looper.getMainLooper()).post(new com.gamericefishpro.space.bb.h(12, bVar, typefaceJ));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typefaceA = typefaceJ;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                }
            }
        } else if (bVar != null) {
            bVar.a(-3);
        }
        if (typefaceA != null || bVar != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
