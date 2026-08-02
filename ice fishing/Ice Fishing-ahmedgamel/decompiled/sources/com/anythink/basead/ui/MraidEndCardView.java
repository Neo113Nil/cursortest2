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
    private static String f10926h = "MraidEndCardView";

    /* renamed from: e, reason: collision with root package name */
    MraidContainerView f10927e;

    /* renamed from: f, reason: collision with root package name */
    a f10928f;

    /* renamed from: g, reason: collision with root package name */
    e f10929g;

    public interface a {
        void a();

        void a(String str);

        void b();

        void c();
    }

    public MraidEndCardView(Context context, w wVar, x xVar, e eVar) {
        super(context, wVar, xVar);
        this.f10929g = eVar;
        setId(q.a(getContext(), "myoffer_end_card_id", "id"));
    }

    @Override // com.anythink.basead.ui.BaseEndCardView
    public final void a() {
        MraidContainerView mraidContainerView = this.f10927e;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    @Override // com.anythink.basead.ui.BaseEndCardView
    public final Drawable b() {
        return new com.anythink.basead.ui.b.a();
    }

    public void init(boolean z6) {
        if (this.f10609c.f14954o.J() == 0) {
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MraidEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MraidEndCardView mraidEndCardView = MraidEndCardView.this;
                    a aVar = mraidEndCardView.f10928f;
                    if (aVar != null) {
                        aVar.a(mraidEndCardView.f10608b.H());
                    }
                }
            });
        }
        this.f10927e = new MraidContainerView(getContext(), this.f10608b, this.f10609c, this.f10929g, new MraidContainerView.a() { // from class: com.anythink.basead.ui.MraidEndCardView.2
            @Override // com.anythink.basead.ui.MraidContainerView.a
            public final void a(String str) {
                a aVar = MraidEndCardView.this.f10928f;
                if (aVar != null) {
                    aVar.a(str);
                }
            }

            @Override // com.anythink.basead.ui.MraidContainerView.a
            public final void b() {
            }

            @Override // com.anythink.basead.ui.MraidContainerView.a
            public final void c() {
                a aVar = MraidEndCardView.this.f10928f;
                if (aVar != null) {
                    aVar.c();
                }
            }

            @Override // com.anythink.basead.ui.MraidContainerView.a
            public final void a() {
                a aVar = MraidEndCardView.this.f10928f;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
        this.f10927e.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.f10927e);
        this.f10927e.setNeedRegisterVolumeChangeReceiver(true);
        this.f10927e.init();
        if (z6) {
            this.f10927e.loadMraidWebView(1);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        MraidContainerView mraidContainerView = this.f10927e;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z6);
        }
    }

    public void setEndCardListener(a aVar) {
        this.f10928f = aVar;
    }
}
