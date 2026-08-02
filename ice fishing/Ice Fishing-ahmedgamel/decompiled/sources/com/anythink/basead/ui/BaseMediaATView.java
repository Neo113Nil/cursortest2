package com.anythink.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseMediaATView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    protected w f10612a;

    /* renamed from: b, reason: collision with root package name */
    protected y f10613b;

    /* renamed from: c, reason: collision with root package name */
    protected x f10614c;

    /* renamed from: d, reason: collision with root package name */
    protected a f10615d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f10616e;

    /* renamed from: f, reason: collision with root package name */
    protected FrameLayout f10617f;

    /* renamed from: g, reason: collision with root package name */
    protected CloseImageView f10618g;

    /* renamed from: h, reason: collision with root package name */
    protected int f10619h;
    protected com.anythink.basead.ui.f.a i;

    /* renamed from: j, reason: collision with root package name */
    private int f10620j;

    /* renamed from: k, reason: collision with root package name */
    private int f10621k;

    /* renamed from: com.anythink.basead.ui.BaseMediaATView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = BaseMediaATView.this.f10615d;
            if (aVar != null) {
                aVar.onClickCloseView();
            }
        }
    }

    public interface a {
        void onClickCloseView();
    }

    public BaseMediaATView(Context context) {
        super(context);
        this.f10620j = 0;
        this.f10621k = 0;
    }

    private void a() {
        if (this.f10621k <= 0) {
            int i = this.f10619h;
            if (i == 1 || i == 2) {
                this.f10621k = (int) (this.f10620j * 0.5f);
            } else {
                this.f10621k = (int) (this.f10620j * 0.75f);
            }
        }
    }

    private void b() {
        CloseImageView closeImageView = this.f10618g;
        if (closeImageView == null) {
            return;
        }
        if (this.f10616e) {
            closeImageView.setVisibility(0);
        } else {
            closeImageView.setVisibility(8);
        }
        a(this.f10618g, false);
        this.f10618g.setOnClickListener(new AnonymousClass1());
    }

    public void changeCloseViewSizeAfterClick() {
        CloseImageView closeImageView = this.f10618g;
        if (closeImageView == null || this.f10613b == null) {
            return;
        }
        a(closeImageView, true);
    }

    public void destroy() {
    }

    public List<View> getClickViews() {
        return new ArrayList();
    }

    public List<View> getContainerClickViews() {
        return new ArrayList();
    }

    public int getMediaViewHeight() {
        return this.f10621k;
    }

    public int getMediaViewWidth() {
        return this.f10620j;
    }

    public View getMonitorClickView() {
        return null;
    }

    public void init(int i, int i4, int i6) {
        this.f10620j = i;
        this.f10621k = i4;
        this.f10619h = i6;
        if (i4 <= 0) {
            if (i6 == 1 || i6 == 2) {
                this.f10621k = (int) (i * 0.5f);
            } else {
                this.f10621k = (int) (i * 0.75f);
            }
        }
        CloseImageView closeImageView = this.f10618g;
        if (closeImageView != null) {
            if (this.f10616e) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
            a(this.f10618g, false);
            this.f10618g.setOnClickListener(new AnonymousClass1());
        }
    }

    public BaseMediaATView(Context context, w wVar, x xVar, boolean z6, a aVar) {
        super(context);
        this.f10620j = 0;
        this.f10621k = 0;
        this.f10612a = wVar;
        this.f10613b = xVar.f14954o;
        this.f10616e = z6;
        this.f10615d = aVar;
        this.f10614c = xVar;
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "base_myoffer_media_ad_view", "layout"), this);
        this.f10617f = (FrameLayout) findViewById(q.a(getContext(), "base_media_view_content", "id"));
        this.f10618g = (CloseImageView) findViewById(q.a(getContext(), "base_media_ad_close", "id"));
    }

    private void a(b bVar, boolean z6) {
        com.anythink.basead.ui.f.b.a(bVar, z6, this.f10614c, true);
    }
}
