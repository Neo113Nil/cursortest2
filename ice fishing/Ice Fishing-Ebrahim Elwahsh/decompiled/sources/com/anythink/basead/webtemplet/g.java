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
    protected Pattern f11659a;

    /* renamed from: c, reason: collision with root package name */
    protected Context f11661c;

    /* renamed from: d, reason: collision with root package name */
    protected WTWebView f11662d;

    /* renamed from: e, reason: collision with root package name */
    protected Handler f11663e;

    /* renamed from: f, reason: collision with root package name */
    private final String f11664f = "g";

    /* renamed from: b, reason: collision with root package name */
    protected final int f11660b = 1;

    /* renamed from: com.anythink.basead.webtemplet.g$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f11665a;

        public AnonymousClass1(e eVar) {
            this.f11665a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                e eVar = this.f11665a;
                Object obj = eVar.f11649b;
                a.f fVar = eVar.f11650c;
                if (fVar == null || obj == null) {
                    return;
                }
                fVar.a(obj, eVar, TextUtils.isEmpty(eVar.f11653f) ? "{}" : this.f11665a.f11653f);
            } catch (Throwable unused) {
            }
        }
    }

    public g(WTWebView wTWebView) {
        this.f11661c = wTWebView != null ? wTWebView.getContext().getApplicationContext() : t.b().g();
        this.f11662d = wTWebView;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final WebView a() {
        return this.f11662d;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final e b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = this.f11659a.matcher(str);
        if (matcher.matches()) {
            e eVar = new e();
            int groupCount = matcher.groupCount();
            if (groupCount >= 5) {
                eVar.f11653f = matcher.group(5);
            }
            if (groupCount >= 3) {
                eVar.f11651d = matcher.group(1);
                eVar.f11654g = matcher.group(2);
                eVar.f11652e = matcher.group(3);
                eVar.f11648a = this.f11662d;
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
            Matcher matcher = this.f11659a.matcher(str);
            if (matcher.matches()) {
                eVar = new e();
                int groupCount = matcher.groupCount();
                if (groupCount >= 5) {
                    eVar.f11653f = matcher.group(5);
                }
                if (groupCount >= 3) {
                    eVar.f11651d = matcher.group(1);
                    eVar.f11654g = matcher.group(2);
                    eVar.f11652e = matcher.group(3);
                    eVar.f11648a = this.f11662d;
                    if (eVar != null) {
                        return;
                    }
                    com.anythink.core.common.v.k.b(eVar.f11653f);
                    WTWebView wTWebView = eVar.f11648a;
                    Object jsObject = wTWebView != null ? wTWebView.getJsObject(eVar.f11651d) : null;
                    if (jsObject == null) {
                        return;
                    }
                    try {
                        a.f a9 = com.anythink.basead.webtemplet.b.a.a(this.f11661c.getClassLoader(), jsObject.getClass().getName()).a(eVar.f11652e, Object.class, String.class);
                        a9.a();
                        if (jsObject instanceof d) {
                            eVar.f11650c = a9;
                            eVar.f11649b = jsObject;
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
        this.f11662d = wTWebView;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final boolean a(String str) {
        if (!h.a(str)) {
            return false;
        }
        this.f11659a = h.b(str);
        return true;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final void a(Pattern pattern) {
        this.f11659a = pattern;
    }

    private void a(e eVar) {
        WTWebView wTWebView = eVar.f11648a;
        Object jsObject = wTWebView == null ? null : wTWebView.getJsObject(eVar.f11651d);
        if (jsObject == null) {
            return;
        }
        try {
            a.f a9 = com.anythink.basead.webtemplet.b.a.a(this.f11661c.getClassLoader(), jsObject.getClass().getName()).a(eVar.f11652e, Object.class, String.class);
            a9.a();
            if (jsObject instanceof d) {
                eVar.f11650c = a9;
                eVar.f11649b = jsObject;
                t.b().b(new AnonymousClass1(eVar));
            }
        } catch (Throwable unused) {
        }
    }

    private void b(e eVar) {
        t.b().b(new AnonymousClass1(eVar));
    }
}
