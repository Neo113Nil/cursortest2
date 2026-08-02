package com.anythink.basead.ui.h5template;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.anythink.basead.b.c.d;
import com.anythink.basead.b.e;
import com.anythink.basead.d.f;
import com.anythink.basead.d.g;
import com.anythink.basead.ui.BaseATView;
import com.anythink.basead.ui.BaseScreenATView;
import com.anythink.basead.ui.CloseImageView;
import com.anythink.basead.ui.component.a;
import com.anythink.basead.webtemplet.WTWebContainerView;
import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;
import java.util.List;

/* loaded from: classes.dex */
public class WTWebViewBaseScreenATView extends BaseScreenATView {
    WTWebContainerView ah;
    final int ai;
    private final String aj;

    public WTWebViewBaseScreenATView(Context context) {
        super(context);
        this.aj = "WTWebViewBaseScreenATView";
        this.ai = 1;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void L() {
        CloseImageView closeImageView = this.f10641Q;
        if (closeImageView != null) {
            closeImageView.setVisibility(0);
            this.f10641Q.setAlpha(0.2f);
            this.f10641Q.animate().alpha(1.0f).setDuration(1000L).start();
            this.f10641Q.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.h5template.WTWebViewBaseScreenATView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WTWebViewBaseScreenATView.this.M();
                }
            });
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void M() {
        c(9);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void Q() {
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void U() {
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final CloseImageView X() {
        return null;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void ac() {
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final boolean b(int i) {
        return false;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final int r() {
        return 100;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final boolean t() {
        return false;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void x() {
        ab();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final int y() {
        return 8;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void c(int i) {
        N();
        WTWebContainerView wTWebContainerView = this.ah;
        if (wTWebContainerView != null) {
            wTWebContainerView.release();
        }
        super.c(i);
    }

    public WTWebViewBaseScreenATView(Context context, x xVar, w wVar, String str, int i, int i4) {
        super(context, xVar, wVar, str, i, i4);
        this.aj = "WTWebViewBaseScreenATView";
        this.ai = 1;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_h5_template_half_screen", "layout"), this);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void b() {
        super.b();
        WTWebContainerView wTWebContainerView = new WTWebContainerView(getContext(), this.f10522g, this.f10521f, new WTWebContainerView.a() { // from class: com.anythink.basead.ui.h5template.WTWebViewBaseScreenATView.1
            @Override // com.anythink.basead.webtemplet.WTWebContainerView.a
            public final void a() {
            }

            @Override // com.anythink.basead.webtemplet.WTWebContainerView.a
            public final void b() {
                if (((BaseScreenATView) WTWebViewBaseScreenATView.this).f10641Q != null) {
                    ((BaseScreenATView) WTWebViewBaseScreenATView.this).f10641Q.setVisibility(8);
                }
                WTWebViewBaseScreenATView.this.a(302);
                if (3 != ((BaseScreenATView) WTWebViewBaseScreenATView.this).f10648a || e.a(((BaseATView) WTWebViewBaseScreenATView.this).f10522g, ((BaseATView) WTWebViewBaseScreenATView.this).f10521f)) {
                    return;
                }
                WTWebViewBaseScreenATView.this.ae();
            }

            @Override // com.anythink.basead.webtemplet.WTWebContainerView.a
            public final void a(f fVar) {
                WTWebViewBaseScreenATView.this.a(g.a(g.f6965k, g.af + fVar.c()));
                WTWebViewBaseScreenATView.this.c(10);
            }
        });
        this.ah = wTWebContainerView;
        a aVar = this.f10532r;
        if (aVar != null) {
            aVar.a(wTWebContainerView);
            this.f10532r.b(true);
        }
        Object obj = null;
        try {
            if (d.a(this.f10522g)) {
                WTWebView d9 = d.d(d.a((x) null, this.f10522g, 3));
                if (d9 != null) {
                    obj = d9.getJsCommunicationObject();
                }
            } else {
                obj = new com.anythink.basead.webtemplet.adformat.intestitial.a();
            }
            if (obj != null && (obj instanceof com.anythink.basead.webtemplet.adformat.intestitial.a)) {
                ((com.anythink.basead.webtemplet.adformat.intestitial.a) obj).a(this.f10532r);
                ((com.anythink.basead.webtemplet.adformat.intestitial.a) obj).a(new com.anythink.basead.webtemplet.adformat.d() { // from class: com.anythink.basead.ui.h5template.WTWebViewBaseScreenATView.2
                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void a(int i, int i4) {
                        WTWebViewBaseScreenATView.this.a(i, i4);
                    }

                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void b(int i) {
                        if (i == 1) {
                            WTWebViewBaseScreenATView.this.a(BaseATView.a.f10563N);
                        } else {
                            WTWebViewBaseScreenATView.this.a(BaseATView.a.f10564O);
                        }
                    }

                    @Override // com.anythink.basead.webtemplet.adformat.d
                    public final void c() {
                        WTWebViewBaseScreenATView.this.ad();
                    }

                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void a(int i) {
                        WTWebViewBaseScreenATView.this.c(i);
                    }

                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void a(String str, String str2) {
                        WTWebViewBaseScreenATView.this.a(g.a(g.f6965k, g.af + str + "," + str2));
                        WTWebViewBaseScreenATView.this.c(10);
                    }

                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void b() {
                        ((BaseATView) WTWebViewBaseScreenATView.this).f10532r.c(0);
                        WTWebViewBaseScreenATView.this.C();
                    }

                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void a() {
                        WTWebViewBaseScreenATView.this.z();
                    }
                });
            }
        } catch (Throwable unused) {
        }
        if (obj != null && (obj instanceof com.anythink.basead.webtemplet.adformat.intestitial.a)) {
            this.ah.init(obj);
            if (this.f10637M != null) {
                this.ah.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f10637M.addView(this.ah, 1);
                return;
            }
            return;
        }
        a(g.a(g.f6965k, "Adx template show fail without exception:empty jsCommunication"));
        c(10);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void a(List<Bitmap> list) {
        super.a(list);
        this.f10532r.c(4);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a(int i) {
        super.a(i);
        if (this.ah != null) {
            com.anythink.basead.ui.improveclick.a aVar = this.f10533s;
            this.ah.notifyInnerAdEvent(i, aVar != null ? aVar.b() : null);
        }
    }
}
