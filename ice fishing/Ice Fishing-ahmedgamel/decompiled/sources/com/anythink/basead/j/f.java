package com.anythink.basead.j;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f9121a;

    /* renamed from: b, reason: collision with root package name */
    private c f9122b;

    private f() {
    }

    public static f a() {
        if (f9121a == null) {
            synchronized (f.class) {
                try {
                    if (f9121a == null) {
                        f9121a = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9121a;
    }

    public final boolean b() {
        c cVar = this.f9122b;
        if (cVar != null) {
            return cVar.a();
        }
        return false;
    }

    public final String c() {
        return b() ? this.f9122b.b() : "";
    }

    private static boolean b(w wVar, x xVar) {
        return !com.anythink.basead.b.e.a(wVar, xVar) && wVar.n();
    }

    public final void a(c cVar) {
        this.f9122b = cVar;
    }

    public final String a(String str, w wVar, x xVar) {
        return (b() && b(wVar, xVar)) ? this.f9122b.a(str, wVar, xVar) : str;
    }

    public final boolean a(w wVar, x xVar) {
        return b() && !TextUtils.isEmpty(wVar.av()) && b(wVar, xVar);
    }

    public final b a(Context context, boolean z3, w wVar, x xVar) {
        if (b()) {
            return this.f9122b.a(context, z3, wVar, xVar);
        }
        return null;
    }

    public final b a(Context context, WebView webView, w wVar, x xVar) {
        if (b()) {
            return this.f9122b.a(context, webView, wVar, xVar);
        }
        return null;
    }
}
