package com.anythink.basead.webtemplet;

import android.content.Context;
import android.widget.FrameLayout;
import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.basead.webtemplet.l;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class WTWebContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    protected w f11373a;

    /* renamed from: b, reason: collision with root package name */
    protected y f11374b;

    /* renamed from: c, reason: collision with root package name */
    protected x f11375c;

    /* renamed from: d, reason: collision with root package name */
    a f11376d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11377e;

    /* renamed from: f, reason: collision with root package name */
    private WTWebView f11378f;

    /* renamed from: g, reason: collision with root package name */
    private final List<i> f11379g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f11380h;

    public interface a {
        void a();

        void a(com.anythink.basead.d.f fVar);

        void b();
    }

    public WTWebContainerView(Context context) {
        super(context);
        this.f11377e = "WTWebContainerView";
        this.f11379g = Collections.synchronizedList(new ArrayList());
        this.f11380h = false;
    }

    public Object getJsCommunicationObject() {
        WTWebView wTWebView = this.f11378f;
        if (wTWebView != null) {
            return wTWebView.getJsCommunicationObject();
        }
        return null;
    }

    public void init(Object obj) {
        if (com.anythink.basead.b.c.d.a(this.f11373a)) {
            a();
            return;
        }
        String a9 = com.anythink.core.common.res.d.a(t.b().g()).a(this.f11373a.an());
        String a10 = com.anythink.basead.b.c.d.a((x) null, this.f11373a, 3);
        try {
            this.f11378f = new WTWebView(t.b().g());
            l.a(a10, new File(a9).toURI().toString(), this.f11378f, new l.a() { // from class: com.anythink.basead.webtemplet.WTWebContainerView.1
                @Override // com.anythink.basead.webtemplet.l.a
                public final void a() {
                    WTWebContainerView.this.a();
                }

                @Override // com.anythink.basead.webtemplet.l.a
                public final void a(com.anythink.basead.d.f fVar) {
                    a aVar = WTWebContainerView.this.f11376d;
                    if (aVar != null) {
                        aVar.a(fVar);
                    }
                }
            }, this.f11373a, this.f11375c, 2, obj);
        } catch (Throwable th) {
            a aVar = this.f11376d;
            if (aVar != null) {
                aVar.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6171b, "wtWebView create fail with " + th.getMessage()));
            }
        }
    }

    public void notifyInnerAdEvent(int i, Map<String, Object> map) {
        if (!this.f11380h) {
            synchronized (this.f11379g) {
                this.f11379g.add(new i(i, map));
            }
        } else {
            WTWebView wTWebView = this.f11378f;
            if (wTWebView != null) {
                wTWebView.notifyInnerAdEvent(i, map);
            }
        }
    }

    public void release() {
        WTWebView wTWebView = this.f11378f;
        if (wTWebView != null) {
            wTWebView.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f11378f == null) {
            this.f11378f = com.anythink.basead.b.c.d.c(com.anythink.basead.b.c.d.a((x) null, this.f11373a, 3));
        }
        if (this.f11378f != null) {
            this.f11380h = true;
            synchronized (this.f11379g) {
                try {
                    if (!this.f11379g.isEmpty()) {
                        for (i iVar : this.f11379g) {
                            notifyInnerAdEvent(iVar.f11514a, iVar.f11515b);
                        }
                        this.f11379g.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f11378f.prepare(new WTWebView.a() { // from class: com.anythink.basead.webtemplet.WTWebContainerView.2
                @Override // com.anythink.basead.webtemplet.WTWebView.a
                public final void a() {
                    a aVar = WTWebContainerView.this.f11376d;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
            this.f11378f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(this.f11378f);
        }
    }

    public WTWebContainerView(Context context, w wVar, x xVar, a aVar) {
        super(context);
        this.f11377e = "WTWebContainerView";
        this.f11379g = Collections.synchronizedList(new ArrayList());
        this.f11380h = false;
        this.f11373a = wVar;
        this.f11374b = xVar.f14168o;
        this.f11375c = xVar;
        this.f11376d = aVar;
    }
}
