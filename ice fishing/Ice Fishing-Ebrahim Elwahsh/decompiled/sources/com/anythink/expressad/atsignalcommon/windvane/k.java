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
    protected Pattern f18238a;

    /* renamed from: b, reason: collision with root package name */
    protected String f18239b;

    /* renamed from: d, reason: collision with root package name */
    protected Context f18241d;

    /* renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f18242e;

    /* renamed from: c, reason: collision with root package name */
    protected final int f18240c = 1;

    /* renamed from: f, reason: collision with root package name */
    protected Handler f18243f = new Handler(Looper.getMainLooper(), this);

    public k(Context context) {
        this.f18241d = context;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final WebView a() {
        return this.f18242e;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final b b(String str) {
        if (str == null) {
            return null;
        }
        b mraidMethodContext = MraidUriUtil.getMraidMethodContext(this.f18242e, str);
        if (mraidMethodContext != null) {
            mraidMethodContext.f18220a = this.f18242e;
            return mraidMethodContext;
        }
        Matcher matcher = this.f18238a.matcher(str);
        if (matcher.matches()) {
            b bVar = new b();
            int groupCount = matcher.groupCount();
            if (groupCount >= 5) {
                bVar.f18225f = matcher.group(5);
            }
            if (groupCount >= 3) {
                bVar.f18223d = matcher.group(1);
                bVar.f18226g = matcher.group(2);
                String group = matcher.group(3);
                bVar.f18224e = group;
                HashMap<String, String> hashMap = com.anythink.core.express.a.c.f17682c;
                if (hashMap != null && hashMap.containsKey(group)) {
                    bVar.f18224e = com.anythink.core.express.a.c.f17682c.get(bVar.f18224e);
                }
                bVar.f18220a = this.f18242e;
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
            bVar = MraidUriUtil.getMraidMethodContext(this.f18242e, str);
            if (bVar != null) {
                bVar.f18220a = this.f18242e;
            } else {
                Matcher matcher = this.f18238a.matcher(str);
                if (matcher.matches()) {
                    bVar = new b();
                    int groupCount = matcher.groupCount();
                    if (groupCount >= 5) {
                        bVar.f18225f = matcher.group(5);
                    }
                    if (groupCount >= 3) {
                        bVar.f18223d = matcher.group(1);
                        bVar.f18226g = matcher.group(2);
                        String group = matcher.group(3);
                        bVar.f18224e = group;
                        HashMap<String, String> hashMap = com.anythink.core.express.a.c.f17682c;
                        if (hashMap != null && hashMap.containsKey(group)) {
                            bVar.f18224e = com.anythink.core.express.a.c.f17682c.get(bVar.f18224e);
                        }
                        bVar.f18220a = this.f18242e;
                    }
                }
            }
            if (bVar != null) {
                return;
            }
            WindVaneWebView windVaneWebView = bVar.f18220a;
            Object jsObject = windVaneWebView != null ? windVaneWebView.getJsObject(bVar.f18223d) : null;
            if (jsObject == null) {
                return;
            }
            try {
                c.f a9 = com.anythink.expressad.atsignalcommon.c.c.a(this.f18241d.getClassLoader(), jsObject.getClass().getName()).a(bVar.f18224e, Object.class, String.class);
                a9.a();
                if (jsObject instanceof j) {
                    bVar.f18222c = a9;
                    bVar.f18221b = jsObject;
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = bVar;
                    this.f18243f.sendMessage(obtain);
                    return;
                }
                return;
            } catch (c.b.a e6) {
                if (com.anythink.expressad.a.f17776a) {
                    e6.printStackTrace();
                    return;
                }
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                return;
            }
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void d(String str) {
        this.f18239b = str;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        b bVar = (b) message.obj;
        if (bVar == null) {
            return false;
        }
        try {
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (message.what != 1) {
            return false;
        }
        Object obj = bVar.f18221b;
        c.f fVar = bVar.f18222c;
        if (fVar != null && obj != null) {
            fVar.a(obj, bVar, TextUtils.isEmpty(bVar.f18225f) ? "{}" : bVar.f18225f);
        }
        return true;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void a(WindVaneWebView windVaneWebView) {
        this.f18242e = windVaneWebView;
    }

    private void a(b bVar) {
        WindVaneWebView windVaneWebView = bVar.f18220a;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(bVar.f18223d);
        if (jsObject == null) {
            return;
        }
        try {
            c.f a9 = com.anythink.expressad.atsignalcommon.c.c.a(this.f18241d.getClassLoader(), jsObject.getClass().getName()).a(bVar.f18224e, Object.class, String.class);
            a9.a();
            if (jsObject instanceof j) {
                bVar.f18222c = a9;
                bVar.f18221b = jsObject;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = bVar;
                this.f18243f.sendMessage(obtain);
            }
        } catch (c.b.a e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void b(b bVar) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = bVar;
        this.f18243f.sendMessage(obtain);
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final void a(Pattern pattern) {
        this.f18238a = pattern;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final String b() {
        return this.f18239b;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.d
    public final boolean a(String str) {
        if (!com.anythink.core.express.d.d.a(str)) {
            return false;
        }
        this.f18238a = com.anythink.core.express.d.d.b(str);
        this.f18239b = str;
        return true;
    }
}
