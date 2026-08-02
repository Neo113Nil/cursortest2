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
    protected w f12159a;

    /* renamed from: b, reason: collision with root package name */
    protected y f12160b;

    /* renamed from: c, reason: collision with root package name */
    protected x f12161c;

    /* renamed from: d, reason: collision with root package name */
    a f12162d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12163e;

    /* renamed from: f, reason: collision with root package name */
    private WTWebView f12164f;

    /* renamed from: g, reason: collision with root package name */
    private final List<i> f12165g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f12166h;

    public interface a {
        void a();

        void a(com.anythink.basead.d.f fVar);

        void b();
    }

    public WTWebContainerView(Context context) {
        super(context);
        this.f12163e = "WTWebContainerView";
        this.f12165g = Collections.synchronizedList(new ArrayList());
        this.f12166h = false;
    }

    public Object getJsCommunicationObject() {
        WTWebView wTWebView = this.f12164f;
        if (wTWebView != null) {
            return wTWebView.getJsCommunicationObject();
        }
        return null;
    }

    public void init(Object obj) {
        if (com.anythink.basead.b.c.d.a(this.f12159a)) {
            a();
            return;
        }
        String a9 = com.anythink.core.common.res.d.a(t.b().g()).a(this.f12159a.an());
        String a10 = com.anythink.basead.b.c.d.a((x) null, this.f12159a, 3);
        try {
            this.f12164f = new WTWebView(t.b().g());
            l.a(a10, new File(a9).toURI().toString(), this.f12164f, new l.a() { // from class: com.anythink.basead.webtemplet.WTWebContainerView.1
                @Override // com.anythink.basead.webtemplet.l.a
                public final void a() {
                    WTWebContainerView.this.a();
                }

                @Override // com.anythink.basead.webtemplet.l.a
                public final void a(com.anythink.basead.d.f fVar) {
                    a aVar = WTWebContainerView.this.f12162d;
                    if (aVar != null) {
                        aVar.a(fVar);
                    }
                }
            }, this.f12159a, this.f12161c, 2, obj);
        } catch (Throwable th) {
            a aVar = this.f12162d;
            if (aVar != null) {
                aVar.a(com.anythink.basead.d.g.a(com.anythink.basead.d.g.f6957b, "wtWebView create fail with " + th.getMessage()));
            }
        }
    }

    public void notifyInnerAdEvent(int i, Map<String, Object> map) {
        if (!this.f12166h) {
            synchronized (this.f12165g) {
                this.f12165g.add(new i(i, map));
            }
        } else {
            WTWebView wTWebView = this.f12164f;
            if (wTWebView != null) {
                wTWebView.notifyInnerAdEvent(i, map);
            }
        }
    }

    public void release() {
        WTWebView wTWebView = this.f12164f;
        if (wTWebView != null) {
            wTWebView.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f12164f == null) {
            this.f12164f = com.anythink.basead.b.c.d.c(com.anythink.basead.b.c.d.a((x) null, this.f12159a, 3));
        }
        if (this.f12164f != null) {
            this.f12166h = true;
            synchronized (this.f12165g) {
                try {
                    if (!this.f12165g.isEmpty()) {
                        for (i iVar : this.f12165g) {
                            notifyInnerAdEvent(iVar.f12300a, iVar.f12301b);
                        }
                        this.f12165g.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f12164f.prepare(new WTWebView.a() { // from class: com.anythink.basead.webtemplet.WTWebContainerView.2
                @Override // com.anythink.basead.webtemplet.WTWebView.a
                public final void a() {
                    a aVar = WTWebContainerView.this.f12162d;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
            this.f12164f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(this.f12164f);
        }
    }

    public WTWebContainerView(Context context, w wVar, x xVar, a aVar) {
        super(context);
        this.f12163e = "WTWebContainerView";
        this.f12165g = Collections.synchronizedList(new ArrayList());
        this.f12166h = false;
        this.f12159a = wVar;
        this.f12160b = xVar.f14954o;
        this.f12161c = xVar;
        this.f12162d = aVar;
    }
}
