package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.c.c;
import com.anythink.expressad.atsignalcommon.mraid.MraidUriUtil;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k implements Handler.Callback, d {

    /* renamed from: a, reason: collision with root package name */
    protected Pattern f18080a;

    /* renamed from: b, reason: collision with root package name */
    protected String f18081b;

    /* renamed from: d, reason: collision with root package name */
    protected Context f18083d;

    /* renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f18084e;

    /* renamed from: c, reason: collision with root package name */
    protected final int f18082c = 1;

    /* renamed from: f, reason: collision with root package name */
    protected Handler f18085f = new Handler(Looper.getMainLooper(), this);

    public k(Context context) {
        this.f18083d = context;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final WebView a() {
        return this.f18084e;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final b b(String str) {
        if (str == null) {
            return null;
        }
        b mraidMethodContext = MraidUriUtil.getMraidMethodContext(this.f18084e, str);
        if (mraidMethodContext != null) {
            mraidMethodContext.f18062a = this.f18084e;
            return mraidMethodContext;
        }
        Matcher matcher = this.f18080a.matcher(str);
        if (matcher.matches()) {
            b bVar = new b();
            int groupCount = matcher.groupCount();
            if (groupCount >= 5) {
                bVar.f18067f = matcher.group(5);
            }
            if (groupCount >= 3) {
                bVar.f18065d = matcher.group(1);
                bVar.f18068g = matcher.group(2);
                String group = matcher.group(3);
                bVar.f18066e = group;
                HashMap<String, String> hashMap = com.anythink.core.express.a.c.f17524c;
                if (hashMap != null && hashMap.containsKey(group)) {
                    bVar.f18066e = com.anythink.core.express.a.c.f17524c.get(bVar.f18066e);
                }
                bVar.f18062a = this.f18084e;
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str) {
        b bVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str != null) {
            bVar = MraidUriUtil.getMraidMethodContext(this.f18084e, str);
            if (bVar != null) {
                bVar.f18062a = this.f18084e;
            } else {
                Matcher matcher = this.f18080a.matcher(str);
                if (matcher.matches()) {
                    bVar = new b();
                    int groupCount = matcher.groupCount();
                    if (groupCount >= 5) {
                        bVar.f18067f = matcher.group(5);
                    }
                    if (groupCount >= 3) {
                        bVar.f18065d = matcher.group(1);
                        bVar.f18068g = matcher.group(2);
                        String group = matcher.group(3);
                        bVar.f18066e = group;
                        HashMap<String, String> hashMap = com.anythink.core.express.a.c.f17524c;
                        if (hashMap != null && hashMap.containsKey(group)) {
                            bVar.f18066e = com.anythink.core.express.a.c.f17524c.get(bVar.f18066e);
                        }
                        bVar.f18062a = this.f18084e;
                    }
                }
            }
            if (bVar != null) {
                return;
            }
            WindVaneWebView windVaneWebView = bVar.f18062a;
            Object jsObject = windVaneWebView != null ? windVaneWebView.getJsObject(bVar.f18065d) : null;
            if (jsObject == null) {
                return;
            }
            try {
                c.f a9 = com.anythink.expressad.atsignalcommon.c.c.a(this.f18083d.getClassLoader(), jsObject.getClass().getName()).a(bVar.f18066e, Object.class, String.class);
                a9.a();
                if (jsObject instanceof j) {
                    bVar.f18064c = a9;
                    bVar.f18063b = jsObject;
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = bVar;
                    this.f18085f.sendMessage(obtain);
                    return;
                }
                return;
            } catch (c.b.a e9) {
                if (com.anythink.expressad.a.f17618a) {
                    e9.printStackTrace();
                    return;
                }
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void d(String str) {
        this.f18081b = str;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        b bVar = (b) message.obj;
        if (bVar == null) {
            return false;
        }
        try {
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        if (message.what != 1) {
            return false;
        }
        Object obj = bVar.f18063b;
        c.f fVar = bVar.f18064c;
        if (fVar != null && obj != null) {
            fVar.a(obj, bVar, TextUtils.isEmpty(bVar.f18067f) ? "{}" : bVar.f18067f);
        }
        return true;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void a(WindVaneWebView windVaneWebView) {
        this.f18084e = windVaneWebView;
    }

    private void a(b bVar) {
        WindVaneWebView windVaneWebView = bVar.f18062a;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(bVar.f18065d);
        if (jsObject == null) {
            return;
        }
        try {
            c.f a9 = com.anythink.expressad.atsignalcommon.c.c.a(this.f18083d.getClassLoader(), jsObject.getClass().getName()).a(bVar.f18066e, Object.class, String.class);
            a9.a();
            if (jsObject instanceof j) {
                bVar.f18064c = a9;
                bVar.f18063b = jsObject;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = bVar;
                this.f18085f.sendMessage(obtain);
            }
        } catch (c.b.a e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void b(b bVar) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = bVar;
        this.f18085f.sendMessage(obtain);
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void a(Pattern pattern) {
        this.f18080a = pattern;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final String b() {
        return this.f18081b;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final boolean a(String str) {
        if (!com.anythink.core.express.d.d.a(str)) {
            return false;
        }
        this.f18080a = com.anythink.core.express.d.d.b(str);
        this.f18081b = str;
        return true;
    }
}
