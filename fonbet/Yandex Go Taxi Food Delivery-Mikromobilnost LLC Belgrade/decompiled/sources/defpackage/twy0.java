package defpackage;

import android.net.Uri;
import com.ybsdk.core.common.utils.theme.LateInitColorCallbackImpl;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.b;

/* loaded from: classes3.dex */
public abstract class twy0 {
    public static final ColorModel a(Uri uri, String str) {
        String l = sd90.l(uri, str);
        String l2 = sd90.l(uri, str.concat("_dark"));
        ColorModel.Hex.Companion.getClass();
        ColorModel.Hex a = b.a(l);
        ColorModel.Hex a2 = b.a(l2);
        return (a == null || a2 == null) ? a : new ColorModel.LateInitColor(new LateInitColorCallbackImpl(a, a2));
    }
}
