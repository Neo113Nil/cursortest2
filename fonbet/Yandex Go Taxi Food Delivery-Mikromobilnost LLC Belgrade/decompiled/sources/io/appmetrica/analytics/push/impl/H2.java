package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.model.BasePushMessage;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class H2 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
    
        if (a(r3, r1) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer a(Context context, String str) {
        Integer valueOf;
        if (str != null) {
            try {
                valueOf = Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                int identifierForType = CoreUtils.getIdentifierForType(context, str, "drawable");
                valueOf = identifierForType == 0 ? Integer.valueOf(CoreUtils.getIdentifierForType(context, str, "mipmap")) : Integer.valueOf(identifierForType);
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.intValue() == 0) {
            return null;
        }
        return valueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        if (r4 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer b(Context context, String str) {
        Integer valueOf;
        InputStream inputStream;
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                valueOf = Integer.valueOf(parseInt);
                try {
                    inputStream = context.getResources().openRawResource(parseInt);
                } catch (Resources.NotFoundException unused) {
                    inputStream = null;
                }
            } catch (NumberFormatException unused2) {
                valueOf = Integer.valueOf(CoreUtils.getIdentifierForType(context, str, "raw"));
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.intValue() == 0) {
            return null;
        }
        return valueOf;
    }

    public static Object a(String str) {
        return str == null ? "unknown" : str;
    }

    public static Drawable a(Context context, Integer num) {
        try {
            return context.getResources().getDrawable(num.intValue(), null);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static boolean a() {
        try {
            List list = OkHttpClient.a0;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static String a(Bundle bundle) {
        try {
            JSONObject root = new BasePushMessage(bundle).getRoot();
            if (root == null || !root.has("a")) {
                return null;
            }
            return root.getString("a");
        } catch (Throwable unused) {
            return null;
        }
    }
}
