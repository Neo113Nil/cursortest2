package defpackage;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.Window;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes10.dex */
public abstract class qr6 {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static DisplayCutout b(Insets insets, Insets insets2) {
        return new DisplayCutout(insets, null, null, null, null, insets2);
    }

    public static Icon c(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String d(Context context) {
        return context.getAttributionTag();
    }

    public static void e(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static Insets f(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void g(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void h(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
