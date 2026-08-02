package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;

/* loaded from: classes5.dex */
public final class rlh implements l7x0 {
    public final Context a;
    public final String b;
    public final ofg c;

    public rlh(Context context, String str, ofg ofgVar) {
        this.a = context;
        this.b = str;
        this.c = ofgVar;
    }

    @Override // defpackage.l7x0
    public final String a(String str) {
        return Uri.parse(this.b).buildUpon().appendEncodedPath("3.0/getimage").appendQueryParameter("tag", str).appendQueryParameter("size_hint", String.valueOf(this.a.getResources().getDisplayMetrics().densityDpi)).appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, this.c.b() ? "dark" : "light").build().toString();
    }
}
