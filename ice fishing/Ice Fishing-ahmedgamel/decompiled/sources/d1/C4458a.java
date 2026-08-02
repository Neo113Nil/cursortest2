package d1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4458a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f37174d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f37175a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37176b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f37177c;

    public C4458a(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f37176b = str;
        } else {
            this.f37176b = str.concat("/");
        }
        this.f37177c = map;
        if (callback instanceof View) {
            this.f37175a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f37175a = null;
        }
    }
}
