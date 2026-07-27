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
    protected w f9983a;

    /* renamed from: b, reason: collision with root package name */
    protected y f9984b;

    /* renamed from: c, reason: collision with root package name */
    protected x f9985c;

    /* renamed from: d, reason: collision with root package name */
    protected a f9986d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f9987e;

    /* renamed from: f, reason: collision with root package name */
    protected FrameLayout f9988f;

    /* renamed from: g, reason: collision with root package name */
    protected CloseImageView f9989g;

    /* renamed from: h, reason: collision with root package name */
    protected int f9990h;
    protected com.anythink.basead.ui.f.a i;

    /* renamed from: j, reason: collision with root package name */
    private int f9991j;

    /* renamed from: k, reason: collision with root package name */
    private int f9992k;

    /* renamed from: com.anythink.basead.ui.BaseMediaATView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = BaseMediaATView.this.f9986d;
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
        this.f9991j = 0;
        this.f9992k = 0;
    }

    private void a() {
        if (this.f9992k <= 0) {
            int i = this.f9990h;
            if (i == 1 || i == 2) {
                this.f9992k = (int) (this.f9991j * 0.5f);
            } else {
                this.f9992k = (int) (this.f9991j * 0.75f);
            }
        }
    }

    private void b() {
        CloseImageView closeImageView = this.f9989g;
        if (closeImageView == null) {
            return;
        }
        if (this.f9987e) {
            closeImageView.setVisibility(0);
        } else {
            closeImageView.setVisibility(8);
        }
        a(this.f9989g, false);
        this.f9989g.setOnClickListener(new AnonymousClass1());
    }

    public void changeCloseViewSizeAfterClick() {
        CloseImageView closeImageView = this.f9989g;
        if (closeImageView == null || this.f9984b == null) {
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
        return this.f9992k;
    }

    public int getMediaViewWidth() {
        return this.f9991j;
    }

    public View getMonitorClickView() {
        return null;
    }

    public void init(int i, int i4, int i9) {
        this.f9991j = i;
        this.f9992k = i4;
        this.f9990h = i9;
        if (i4 <= 0) {
            if (i9 == 1 || i9 == 2) {
                this.f9992k = (int) (i * 0.5f);
            } else {
                this.f9992k = (int) (i * 0.75f);
            }
        }
        CloseImageView closeImageView = this.f9989g;
        if (closeImageView != null) {
            if (this.f9987e) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
            a(this.f9989g, false);
            this.f9989g.setOnClickListener(new AnonymousClass1());
        }
    }

    public BaseMediaATView(Context context, w wVar, x xVar, boolean z8, a aVar) {
        super(context);
        this.f9991j = 0;
        this.f9992k = 0;
        this.f9983a = wVar;
        this.f9984b = xVar.f14325o;
        this.f9987e = z8;
        this.f9986d = aVar;
        this.f9985c = xVar;
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "base_myoffer_media_ad_view", "layout"), this);
        this.f9988f = (FrameLayout) findViewById(q.a(getContext(), "base_media_view_content", "id"));
        this.f9989g = (CloseImageView) findViewById(q.a(getContext(), "base_media_ad_close", "id"));
    }

    private void a(b bVar, boolean z8) {
        com.anythink.basead.ui.f.b.a(bVar, z8, this.f9985c, true);
    }
}
