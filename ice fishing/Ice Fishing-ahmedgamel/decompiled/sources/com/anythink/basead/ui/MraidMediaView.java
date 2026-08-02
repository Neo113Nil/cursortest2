package com.anythink.basead.ui;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.j.e;
import com.anythink.basead.ui.BaseMediaATView;
import com.anythink.basead.ui.MraidContainerView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class MraidMediaView extends BaseMediaATView {

    /* renamed from: j, reason: collision with root package name */
    boolean f10932j;

    /* renamed from: k, reason: collision with root package name */
    boolean f10933k;

    /* renamed from: l, reason: collision with root package name */
    boolean f10934l;

    /* renamed from: m, reason: collision with root package name */
    e f10935m;

    /* renamed from: n, reason: collision with root package name */
    private MraidContainerView f10936n;

    /* renamed from: o, reason: collision with root package name */
    private a f10937o;

    public interface a {
        void a();

        void a(String str);
    }

    public MraidMediaView(Context context) {
        this(context, null, null, false, null, null);
    }

    private void b() {
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f10612a, this.f10614c, this.f10935m, new AnonymousClass1());
        this.f10936n = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = this.f10617f;
        if (frameLayout == null || this.f10936n == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f10617f.addView(this.f10936n, new ViewGroup.LayoutParams(-1, -1));
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_include_4_element_with_feedback", "layout"), (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.f10617f.addView(inflate, layoutParams);
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f10612a, this.f10614c);
        this.i = aVar;
        aVar.b(this);
    }

    @Override // com.anythink.basead.ui.BaseMediaATView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.f10936n;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    public void fireAudioVolumeChange(boolean z6) {
        MraidContainerView mraidContainerView = this.f10936n;
        if (mraidContainerView != null) {
            mraidContainerView.fireAudioVolumeChange(z6);
        }
    }

    @Override // com.anythink.basead.ui.BaseMediaATView
    public void init(int i, int i4, int i6) {
        super.init(i, i4, i6);
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f10612a, this.f10614c, this.f10935m, new AnonymousClass1());
        this.f10936n = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = this.f10617f;
        if (frameLayout == null || this.f10936n == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f10617f.addView(this.f10936n, new ViewGroup.LayoutParams(-1, -1));
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_include_4_element_with_feedback", "layout"), (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.f10617f.addView(inflate, layoutParams);
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f10612a, this.f10614c);
        this.i = aVar;
        aVar.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10933k = true;
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10933k = false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        MraidContainerView mraidContainerView = this.f10936n;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z6);
        }
    }

    public void setMraidWebViewListener(a aVar) {
        this.f10937o = aVar;
    }

    /* renamed from: com.anythink.basead.ui.MraidMediaView$1, reason: invalid class name */
    public class AnonymousClass1 implements MraidContainerView.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a(String str) {
            if (MraidMediaView.this.f10937o != null) {
                MraidMediaView.this.f10937o.a(str);
            }
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void b() {
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void c() {
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a() {
            MraidMediaView mraidMediaView = MraidMediaView.this;
            mraidMediaView.f10932j = true;
            mraidMediaView.a();
            if (MraidMediaView.this.f10937o != null) {
                MraidMediaView.this.f10937o.a();
            }
        }
    }

    public MraidMediaView(Context context, w wVar, x xVar, boolean z6, BaseMediaATView.a aVar, e eVar) {
        super(context, wVar, xVar, z6, aVar);
        this.f10935m = eVar;
    }

    public final synchronized void a() {
        if (this.f10932j && this.f10933k && !this.f10934l) {
            this.f10934l = true;
            com.anythink.core.common.u.e.a(this.f10614c, this.f10612a);
        }
    }

    private static void a(String str) {
        Log.d("MraidMediaView", str);
    }
}
