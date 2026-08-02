package com.google.android.play.integrity.internal;

import android.content.Context;
import android.graphics.Typeface;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.ResourceType;
import com.withpersona.sdk2.inquiry.shared.ui.FontManager;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes4.dex */
public abstract class ak {
    public static String a(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(b(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(b(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String b(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String m = Recorder$$ExternalSyntheticOutline2.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m), (Throwable) e);
            return Boxes$$ExternalSyntheticOutline1.m("<", m, " threw ", e.getClass().getName(), ">");
        }
    }

    public static final Typeface getTypeface(Context context, String str) {
        Typeface typeface;
        context.getClass();
        str.getClass();
        String str2 = str + ".ttf";
        HashMap hashMap = FontManager.fontCache;
        HashMap hashMap2 = FontManager.fontCache;
        if (hashMap2.containsKey(str2)) {
            typeface = (Typeface) hashMap2.get(str2);
        } else {
            String[] list = context.getAssets().list("fonts");
            if (list == null || !ArraysKt___ArraysKt.contains(list, str2)) {
                Integer resourceIdFromName = ResToolsKt.resourceIdFromName(context, str, ResourceType.Font);
                if (resourceIdFromName != null) {
                    typeface = ResourcesCompat.getFont(context, resourceIdFromName.intValue());
                }
                typeface = null;
            } else {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/".concat(str2));
            }
        }
        HashMap hashMap3 = FontManager.fontCache;
        FontManager.fontCache.put(str2, typeface);
        return typeface;
    }
}
