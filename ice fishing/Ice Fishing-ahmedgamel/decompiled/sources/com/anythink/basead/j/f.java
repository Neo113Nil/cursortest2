package com.anythink.basead.j;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f9907a;

    /* renamed from: b, reason: collision with root package name */
    private c f9908b;

    private f() {
    }

    public static f a() {
        if (f9907a == null) {
            synchronized (f.class) {
                try {
                    if (f9907a == null) {
                        f9907a = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9907a;
    }

    public final boolean b() {
        c cVar = this.f9908b;
        if (cVar != null) {
            return cVar.a();
        }
        return false;
    }

    public final String c() {
        return b() ? this.f9908b.b() : "";
    }

    private static boolean b(w wVar, x xVar) {
        return !com.anythink.basead.b.e.a(wVar, xVar) && wVar.n();
    }

    public final void a(c cVar) {
        this.f9908b = cVar;
    }

    public final String a(String str, w wVar, x xVar) {
        return (b() && b(wVar, xVar)) ? this.f9908b.a(str, wVar, xVar) : str;
    }

    public final boolean a(w wVar, x xVar) {
        return b() && !TextUtils.isEmpty(wVar.av()) && b(wVar, xVar);
    }

    public final b a(Context context, boolean z6, w wVar, x xVar) {
        if (b()) {
            return this.f9908b.a(context, z6, wVar, xVar);
        }
        return null;
    }

    public final b a(Context context, WebView webView, w wVar, x xVar) {
        if (b()) {
            return this.f9908b.a(context, webView, wVar, xVar);
        }
        return null;
    }
}
