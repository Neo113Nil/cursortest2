package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.j.e;
import com.anythink.basead.ui.MraidContainerView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class MraidEndCardView extends BaseEndCardView {

    /* renamed from: h, reason: collision with root package name */
    private static String f10140h = "MraidEndCardView";

    /* renamed from: e, reason: collision with root package name */
    MraidContainerView f10141e;

    /* renamed from: f, reason: collision with root package name */
    a f10142f;

    /* renamed from: g, reason: collision with root package name */
    e f10143g;

    public interface a {
        void a();

        void a(String str);

        void b();

        void c();
    }

    public MraidEndCardView(Context context, w wVar, x xVar, e eVar) {
        super(context, wVar, xVar);
        this.f10143g = eVar;
        setId(q.a(getContext(), "myoffer_end_card_id", "id"));
    }

    @Override // com.anythink.basead.ui.BaseEndCardView
    public final void a() {
        MraidContainerView mraidContainerView = this.f10141e;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    @Override // com.anythink.basead.ui.BaseEndCardView
    public final Drawable b() {
        return new com.anythink.basead.ui.b.a();
    }

    public void init(boolean z3) {
        if (this.f9823c.f14168o.J() == 0) {
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MraidEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MraidEndCardView mraidEndCardView = MraidEndCardView.this;
                    a aVar = mraidEndCardView.f10142f;
                    if (aVar != null) {
                        aVar.a(mraidEndCardView.f9822b.H());
                    }
                }
            });
        }
        this.f10141e = new MraidContainerView(getContext(), this.f9822b, this.f9823c, this.f10143g, new MraidContainerView.a() { // from class: com.anythink.basead.ui.MraidEndCardView.2
            @Override // com.anythink.basead.ui.MraidContainerView.a
            public final void a(String str) {
                a aVar = MraidEndCardView.this.f10142f;
                if (aVar != null) {
                    aVar.a(str);
                }
            }

            @Override // com.anythink.basead.ui.MraidContainerView.a
            public final void b() {
            }

            @Override // com.anythink.basead.ui.MraidContainerView.a
            public final void c() {
                a aVar = MraidEndCardView.this.f10142f;
                if (aVar != null) {
                    aVar.c();
                }
            }

            @Override // com.anythink.basead.ui.MraidContainerView.a
            public final void a() {
                a aVar = MraidEndCardView.this.f10142f;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
        this.f10141e.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.f10141e);
        this.f10141e.setNeedRegisterVolumeChangeReceiver(true);
        this.f10141e.init();
        if (z3) {
            this.f10141e.loadMraidWebView(1);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        MraidContainerView mraidContainerView = this.f10141e;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z3);
        }
    }

    public void setEndCardListener(a aVar) {
        this.f10142f = aVar;
    }
}
