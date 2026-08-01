package com.anythink.basead.webtemplet.adformat;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.RoundCornerRelativeLayout;
import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.basead.webtemplet.a.b;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;
import com.anythink.core.common.v.y;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e implements b {

    /* renamed from: a, reason: collision with root package name */
    final String f11447a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    w f11448b;

    /* renamed from: c, reason: collision with root package name */
    x f11449c;

    /* renamed from: d, reason: collision with root package name */
    private a f11450d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.basead.ui.component.a f11451e;

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void controlShakeView(Object obj, String str) {
        try {
            if (!com.anythink.basead.b.e.a(this.f11449c)) {
                com.anythink.basead.webtemplet.a.a(obj, "not support shake");
                return;
            }
            int optInt = new JSONObject(str).optInt("control_show", 0);
            a aVar = this.f11450d;
            if (aVar == null) {
                com.anythink.basead.webtemplet.a.a(obj, "bridgeListener empty");
            } else {
                aVar.b(optInt);
                com.anythink.basead.webtemplet.a.b(obj, "");
            }
        } catch (Throwable th) {
            b(obj, "notifyClose", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void h5ShowException(Object obj, String str) {
        if (obj instanceof com.anythink.basead.webtemplet.e) {
            try {
                WTWebView wTWebView = ((com.anythink.basead.webtemplet.e) obj).f11491a;
                if (wTWebView == null) {
                    com.anythink.basead.webtemplet.a.a(obj, "WTWebView empty");
                } else {
                    wTWebView.h5ShowException(str);
                    com.anythink.basead.webtemplet.a.b(obj, "");
                }
            } catch (Throwable th) {
                b(obj, "h5ShowException", th);
            }
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void initSuccess(Object obj, String str) {
        String str2;
        if (obj instanceof com.anythink.basead.webtemplet.e) {
            try {
                WTWebView wTWebView = ((com.anythink.basead.webtemplet.e) obj).f11491a;
                if (wTWebView == null) {
                    com.anythink.basead.webtemplet.a.a(obj, "WTWebView empty");
                    return;
                }
                wTWebView.jsCallInitSuccess();
                try {
                    Context g4 = t.b().g();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(b.c.f11434a, 2);
                    jSONObject.put(b.c.f11435b, 1);
                    int k9 = m.k(g4) + q.b(g4);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("screen_width", m.j(g4));
                    jSONObject2.put("screen_height", k9);
                    int i = this.f11449c.f14163j;
                    if (i == 1 || i == 3 || i == 4) {
                        jSONObject2.put("top_padding", q.b(g4));
                    } else {
                        jSONObject2.put("top_padding", 0);
                    }
                    jSONObject.put(b.c.f11437d, jSONObject2);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, m.j(g4));
                    jSONObject3.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, k9);
                    HashMap<String, Object> hashMap = this.f11449c.f14176w;
                    if (hashMap != null) {
                        Object obj2 = hashMap.get(ATAdConst.KEY.AD_WIDTH);
                        if (obj2 != null) {
                            jSONObject3.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, obj2);
                        }
                        Object obj3 = this.f11449c.f14176w.get(ATAdConst.KEY.AD_HEIGHT);
                        if (obj3 != null) {
                            jSONObject3.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, obj3);
                        }
                        Object obj4 = this.f11449c.f14176w.get("orientation");
                        if (obj4 != null) {
                            jSONObject3.put(ATAdConst.KEY.AD_ORIENTATION, obj4);
                        }
                    }
                    jSONObject.put(b.c.f11438e, jSONObject3);
                    JSONObject jSONObject4 = new JSONObject();
                    if (!TextUtils.isEmpty(this.f11449c.f14175v)) {
                        try {
                            jSONObject4 = new JSONObject(this.f11449c.f14175v);
                        } catch (Throwable unused) {
                        }
                    }
                    jSONObject.put(b.c.f11439f, jSONObject4);
                    jSONObject.put("format", this.f11449c.f14163j);
                    jSONObject.put(b.c.i, wTWebView.isPreload() ? "1" : "2");
                    jSONObject.put(b.c.f11442j, Locale.getDefault().getLanguage());
                    str2 = jSONObject.toString();
                } catch (Throwable unused2) {
                    str2 = "";
                }
                if (TextUtils.isEmpty(str2)) {
                    com.anythink.basead.webtemplet.a.a(obj, "");
                } else {
                    com.anythink.basead.webtemplet.a.b(obj, str2);
                    wTWebView.offerDataInject();
                }
            } catch (Throwable th) {
                b(obj, "initSuccess", th);
            }
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void notifyClick(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("cl_s_type", 0);
            int optInt2 = jSONObject.optInt("cl_area", 0);
            a aVar = this.f11450d;
            if (aVar == null) {
                com.anythink.basead.webtemplet.a.a(obj, "bridgeListener empty");
            } else {
                aVar.a(optInt, optInt2);
                com.anythink.basead.webtemplet.a.b(obj, "");
            }
        } catch (Throwable th) {
            b(obj, "notifyClick", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void notifyClose(Object obj, String str) {
        try {
            int optInt = new JSONObject(str).optInt(b.C0074b.f12108a, 0);
            a aVar = this.f11450d;
            if (aVar == null) {
                com.anythink.basead.webtemplet.a.a(obj, "bridgeListener empty");
            } else {
                aVar.a(optInt);
                com.anythink.basead.webtemplet.a.b(obj, "");
            }
        } catch (Throwable th) {
            b(obj, "notifyClose", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void notifyReward(Object obj, String str) {
        try {
            a aVar = this.f11450d;
            if (aVar != null && (aVar instanceof d)) {
                ((d) aVar).c();
                com.anythink.basead.webtemplet.a.b(obj, "");
            } else if (aVar == null) {
                com.anythink.basead.webtemplet.a.a(obj, "bridgeListener empty");
            } else {
                com.anythink.basead.webtemplet.a.a(obj, "bridgeListener type error");
            }
        } catch (Throwable th) {
            b(obj, "notifyReward", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047 A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #2 {all -> 0x001c, blocks: (B:4:0x0006, B:6:0x000d, B:8:0x0013, B:15:0x0034, B:18:0x003c, B:19:0x0043, B:22:0x0040, B:23:0x0047), top: B:3:0x0006 }] */
    @Override // com.anythink.basead.webtemplet.adformat.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void openInWebView(Object obj, String str) {
        Context context;
        int i;
        String str2;
        JSONObject jSONObject;
        if (obj instanceof com.anythink.basead.webtemplet.e) {
            try {
                WTWebView wTWebView = ((com.anythink.basead.webtemplet.e) obj).f11491a;
                if (wTWebView != null) {
                    context = wTWebView.getContext();
                    if (context == null) {
                        context = t.b().g();
                    }
                } else {
                    context = null;
                }
                try {
                    jSONObject = new JSONObject(str);
                    i = jSONObject.optInt("type", 1);
                } catch (Throwable unused) {
                    i = 1;
                }
                try {
                    str2 = jSONObject.optString("url", "");
                } catch (Throwable unused2) {
                    str2 = "";
                    if (!TextUtils.isEmpty(str2)) {
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    com.anythink.basead.webtemplet.a.a(obj, "params error");
                    return;
                }
                if (i == 1) {
                    y.a(context, str2);
                } else {
                    y.a(str2);
                }
                com.anythink.basead.webtemplet.a.b(obj, "");
            } catch (Throwable th) {
                b(obj, "openInWebView", th);
            }
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewGetProgress(final Object obj, String str) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.webtemplet.adformat.e.2
            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f11451e == null || e.this.f11451e.l() == null) {
                    com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
                    return;
                }
                long i = e.this.f11451e.i();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(g.a.f12949C, i);
                    com.anythink.basead.webtemplet.a.a(obj, jSONObject);
                } catch (Throwable th) {
                    e.b(obj, "playerViewGetProgress", th);
                }
            }
        }, 2);
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewInit(final Object obj, String str) {
        com.anythink.basead.ui.component.a aVar = this.f11451e;
        if (aVar == null || aVar.l() == null) {
            com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            final int optInt = jSONObject.optInt("position_x", 0);
            final int optInt2 = jSONObject.optInt("position_y", 0);
            final int optInt3 = jSONObject.optInt("view_width", 0);
            final int optInt4 = jSONObject.optInt("view_height", 0);
            final int optInt5 = jSONObject.optInt("mute", 1);
            final int optInt6 = jSONObject.optInt("right_top_corner", 0);
            final int optInt7 = jSONObject.optInt("right_bottom_corner", 0);
            final int optInt8 = jSONObject.optInt("left_top_corner", 0);
            final int optInt9 = jSONObject.optInt("left_bottom_corner", 0);
            t.b().b(new Runnable() { // from class: com.anythink.basead.webtemplet.adformat.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    View m4 = e.this.f11451e.m();
                    if (m4 == null) {
                        m4 = e.this.f11451e.l();
                    }
                    if (m4 == null) {
                        com.anythink.basead.webtemplet.a.a(obj, "playerViewContainer empty");
                        return;
                    }
                    m4.setX(optInt);
                    m4.setY(optInt2);
                    ViewGroup.LayoutParams layoutParams = m4.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = optInt3;
                        layoutParams.height = optInt4;
                        m4.setLayoutParams(layoutParams);
                    }
                    e.this.f11451e.a(optInt5 == 1, (List<Bitmap>) null, (com.anythink.basead.j.e) null);
                    if (m4 instanceof RoundCornerRelativeLayout) {
                        ((RoundCornerRelativeLayout) m4).setRadius(optInt8, optInt6, optInt7, optInt9);
                    }
                    m4.requestLayout();
                    com.anythink.basead.webtemplet.a.b(obj, "");
                    if (e.this.f11450d != null) {
                        e.this.f11450d.b();
                    }
                }
            });
        } catch (Throwable th) {
            b(obj, "playerViewInit", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewMute(Object obj, String str) {
        com.anythink.basead.ui.component.a aVar = this.f11451e;
        if (aVar == null || aVar.l() == null) {
            com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
            return;
        }
        try {
            boolean z3 = true;
            int optInt = new JSONObject(str).optInt("mute", 1);
            com.anythink.basead.ui.component.a aVar2 = this.f11451e;
            if (optInt != 1) {
                z3 = false;
            }
            aVar2.c(z3);
            com.anythink.basead.webtemplet.a.b(obj, "");
        } catch (Throwable th) {
            b(obj, "playerViewMute", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewPauseOrResumePlay(Object obj, String str) {
        com.anythink.basead.ui.component.a aVar = this.f11451e;
        if (aVar == null || aVar.l() == null) {
            com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("is_resume", 1);
            boolean z3 = jSONObject.optInt("can_resume", 1) == 1;
            if (optInt == 1) {
                this.f11451e.a(z3);
            } else {
                this.f11451e.b(z3);
            }
            com.anythink.basead.webtemplet.a.b(obj, "");
        } catch (Throwable th) {
            b(obj, "playerViewPauseOrResumePlay", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewRelayout(Object obj, String str) {
        final Object obj2;
        final int optInt;
        final int optInt2;
        final int optInt3;
        final int optInt4;
        final int optInt5;
        final int optInt6;
        final int optInt7;
        final int optInt8;
        com.anythink.basead.ui.component.a aVar = this.f11451e;
        if (aVar == null || aVar.l() == null) {
            com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            optInt = jSONObject.optInt("position_x", 0);
            optInt2 = jSONObject.optInt("position_y", 0);
            optInt3 = jSONObject.optInt("view_width", 0);
            optInt4 = jSONObject.optInt("view_height", 0);
            optInt5 = jSONObject.optInt("right_top_corner", 0);
            optInt6 = jSONObject.optInt("right_bottom_corner", 0);
            optInt7 = jSONObject.optInt("left_top_corner", 0);
            optInt8 = jSONObject.optInt("left_bottom_corner", 0);
            obj2 = obj;
        } catch (Throwable th) {
            th = th;
            obj2 = obj;
        }
        try {
            t.b().b(new Runnable() { // from class: com.anythink.basead.webtemplet.adformat.e.3
                @Override // java.lang.Runnable
                public final void run() {
                    View m4 = e.this.f11451e.m();
                    if (m4 == null) {
                        e.this.f11451e.l();
                    }
                    if (m4 == null) {
                        com.anythink.basead.webtemplet.a.a(obj2, "videoComponent empty");
                        return;
                    }
                    m4.setX(optInt);
                    m4.setY(optInt2);
                    ViewGroup.LayoutParams layoutParams = m4.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = optInt3;
                        layoutParams.height = optInt4;
                        m4.setLayoutParams(layoutParams);
                    }
                    if (m4 instanceof RoundCornerRelativeLayout) {
                        ((RoundCornerRelativeLayout) m4).setRadius(optInt7, optInt5, optInt6, optInt8);
                    }
                    m4.requestLayout();
                    com.anythink.basead.webtemplet.a.b(obj2, "");
                }
            });
        } catch (Throwable th2) {
            th = th2;
            b(obj2, "playerViewRelayout", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewRemove(Object obj, String str) {
        com.anythink.basead.ui.component.a aVar = this.f11451e;
        if (aVar == null || aVar.l() == null) {
            com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
            return;
        }
        try {
            this.f11451e.b();
            com.anythink.basead.webtemplet.a.b(obj, "");
        } catch (Throwable th) {
            b(obj, "playerViewRemove", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void renderSuccess(Object obj, String str) {
        if (obj instanceof com.anythink.basead.webtemplet.e) {
            try {
                WTWebView wTWebView = ((com.anythink.basead.webtemplet.e) obj).f11491a;
                if (wTWebView == null) {
                    com.anythink.basead.webtemplet.a.a(obj, "WTWebView empty");
                } else {
                    wTWebView.renderSuccess();
                    com.anythink.basead.webtemplet.a.b(obj, "");
                }
            } catch (Throwable th) {
                b(obj, "renderSuccess", th);
            }
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void sendEventDA(Object obj, String str) {
        if (obj instanceof com.anythink.basead.webtemplet.e) {
            try {
                WTWebView wTWebView = ((com.anythink.basead.webtemplet.e) obj).f11491a;
                if (wTWebView == null) {
                    com.anythink.basead.webtemplet.a.a(obj, "WTWebView empty");
                } else {
                    wTWebView.sendEventDA(str);
                    com.anythink.basead.webtemplet.a.b(obj, "");
                }
            } catch (Throwable th) {
                b(obj, "sendEventDA", th);
            }
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void showFeedbackDialog(Object obj, String str) {
        a aVar = this.f11450d;
        if (aVar == null) {
            com.anythink.basead.webtemplet.a.a(obj, "bridgeListener empty");
        } else {
            aVar.a();
            com.anythink.basead.webtemplet.a.b(obj, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Object obj, String str, Throwable th) {
        if (obj == null || th == null) {
            return;
        }
        StringBuilder j6 = AbstractC4404f.j("call method ", str, " fail with exception:");
        j6.append(th.getMessage());
        com.anythink.basead.webtemplet.a.a(obj, j6.toString());
    }

    public final void a(w wVar, x xVar) {
        this.f11448b = wVar;
        this.f11449c = xVar;
    }

    public final void a(a aVar) {
        this.f11450d = aVar;
    }

    public final a a() {
        return this.f11450d;
    }

    public final void a(com.anythink.basead.ui.component.a aVar) {
        this.f11451e = aVar;
    }
}
