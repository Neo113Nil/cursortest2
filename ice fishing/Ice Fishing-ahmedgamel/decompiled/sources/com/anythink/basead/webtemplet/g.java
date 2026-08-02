package com.anythink.basead.webtemplet;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.basead.webtemplet.b.a;
import com.anythink.core.common.d.t;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class g implements com.anythink.basead.webtemplet.adformat.c {

    /* renamed from: a, reason: collision with root package name */
    protected Pattern f12288a;

    /* renamed from: c, reason: collision with root package name */
    protected Context f12290c;

    /* renamed from: d, reason: collision with root package name */
    protected WTWebView f12291d;

    /* renamed from: e, reason: collision with root package name */
    protected Handler f12292e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12293f = "g";

    /* renamed from: b, reason: collision with root package name */
    protected final int f12289b = 1;

    /* renamed from: com.anythink.basead.webtemplet.g$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f12294a;

        public AnonymousClass1(e eVar) {
            this.f12294a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                e eVar = this.f12294a;
                Object obj = eVar.f12278b;
                a.f fVar = eVar.f12279c;
                if (fVar == null || obj == null) {
                    return;
                }
                fVar.a(obj, eVar, TextUtils.isEmpty(eVar.f12282f) ? "{}" : this.f12294a.f12282f);
            } catch (Throwable unused) {
            }
        }
    }

    public g(WTWebView wTWebView) {
        this.f12290c = wTWebView != null ? wTWebView.getContext().getApplicationContext() : t.b().g();
        this.f12291d = wTWebView;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final WebView a() {
        return this.f12291d;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final e b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = this.f12288a.matcher(str);
        if (matcher.matches()) {
            e eVar = new e();
            int groupCount = matcher.groupCount();
            if (groupCount >= 5) {
                eVar.f12282f = matcher.group(5);
            }
            if (groupCount >= 3) {
                eVar.f12280d = matcher.group(1);
                eVar.f12283g = matcher.group(2);
                eVar.f12281e = matcher.group(3);
                eVar.f12277a = this.f12291d;
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.anythink.basead.webtemplet.adformat.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str) {
        e eVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = this.f12288a.matcher(str);
            if (matcher.matches()) {
                eVar = new e();
                int groupCount = matcher.groupCount();
                if (groupCount >= 5) {
                    eVar.f12282f = matcher.group(5);
                }
                if (groupCount >= 3) {
                    eVar.f12280d = matcher.group(1);
                    eVar.f12283g = matcher.group(2);
                    eVar.f12281e = matcher.group(3);
                    eVar.f12277a = this.f12291d;
                    if (eVar != null) {
                        return;
                    }
                    com.anythink.core.common.v.k.b(eVar.f12282f);
                    WTWebView wTWebView = eVar.f12277a;
                    Object jsObject = wTWebView != null ? wTWebView.getJsObject(eVar.f12280d) : null;
                    if (jsObject == null) {
                        return;
                    }
                    try {
                        a.f a9 = com.anythink.basead.webtemplet.b.a.a(this.f12290c.getClassLoader(), jsObject.getClass().getName()).a(eVar.f12281e, Object.class, String.class);
                        a9.a();
                        if (jsObject instanceof d) {
                            eVar.f12279c = a9;
                            eVar.f12278b = jsObject;
                            t.b().b(new AnonymousClass1(eVar));
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final void a(WTWebView wTWebView) {
        this.f12291d = wTWebView;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final boolean a(String str) {
        if (!h.a(str)) {
            return false;
        }
        this.f12288a = h.b(str);
        return true;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final void a(Pattern pattern) {
        this.f12288a = pattern;
    }

    private void a(e eVar) {
        WTWebView wTWebView = eVar.f12277a;
        Object jsObject = wTWebView == null ? null : wTWebView.getJsObject(eVar.f12280d);
        if (jsObject == null) {
            return;
        }
        try {
            a.f a9 = com.anythink.basead.webtemplet.b.a.a(this.f12290c.getClassLoader(), jsObject.getClass().getName()).a(eVar.f12281e, Object.class, String.class);
            a9.a();
            if (jsObject instanceof d) {
                eVar.f12279c = a9;
                eVar.f12278b = jsObject;
                t.b().b(new AnonymousClass1(eVar));
            }
        } catch (Throwable unused) {
        }
    }

    private void b(e eVar) {
        t.b().b(new AnonymousClass1(eVar));
    }
}
