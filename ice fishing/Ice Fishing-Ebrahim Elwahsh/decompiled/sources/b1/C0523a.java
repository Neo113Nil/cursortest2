package b1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f5519d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f5520a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5521b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f5522c;

    public C0523a(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f5521b = str;
        } else {
            this.f5521b = str.concat("/");
        }
        this.f5522c = map;
        if (callback instanceof View) {
            this.f5520a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f5520a = null;
        }
    }
}
