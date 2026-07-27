package com.anythink.expressad.out;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class TemplateBannerView extends RelativeLayout implements com.anythink.basead.f.c.c {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.b.a f20013a;

    /* renamed from: b, reason: collision with root package name */
    private h f20014b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20015c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20016d;

    /* renamed from: e, reason: collision with root package name */
    private String f20017e;

    /* renamed from: f, reason: collision with root package name */
    private String f20018f;

    public TemplateBannerView(Context context) {
        this(context, null);
    }

    public String getCreativeIdWithUnitId() {
        com.anythink.expressad.mbbanner.b.a aVar = this.f20013a;
        return aVar != null ? aVar.b() : "";
    }

    public String getRequestId() {
        com.anythink.expressad.mbbanner.b.a aVar = this.f20013a;
        return aVar != null ? aVar.a() : "";
    }

    public void init(i iVar, String str, String str2) {
        this.f20018f = str2;
        com.anythink.expressad.mbbanner.b.a aVar = new com.anythink.expressad.mbbanner.b.a(this, iVar, str, str2);
        this.f20013a = aVar;
        aVar.c(this.f20016d);
        this.f20013a.b(this.f20015c);
    }

    @Override // com.anythink.basead.f.c.c
    public boolean isReady() {
        return true;
    }

    public void load(com.anythink.expressad.foundation.d.e eVar) {
        com.anythink.expressad.mbbanner.b.a aVar = this.f20013a;
        if (aVar != null) {
            aVar.b(this.f20015c);
            this.f20013a.a(eVar);
        } else {
            h hVar = this.f20014b;
            if (hVar != null) {
                hVar.a(com.anythink.expressad.mbbanner.a.a.f19810a);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void onPause() {
        if (this.f20013a == null || !TextUtils.isEmpty(this.f20017e)) {
            return;
        }
        this.f20013a.d();
    }

    public void onResume() {
        if (this.f20013a == null || !TextUtils.isEmpty(this.f20017e) || com.anythink.expressad.foundation.f.b.f19049c) {
            return;
        }
        this.f20013a.e();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i6, int i9, int i10) {
        super.onSizeChanged(i, i6, i9, i10);
        com.anythink.expressad.mbbanner.b.a aVar = this.f20013a;
        if (aVar != null) {
            aVar.a(i, i6, i9, i10);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.f20016d = i == 0;
        com.anythink.expressad.mbbanner.b.a aVar = this.f20013a;
        if (aVar != null) {
            if (i == 0) {
                a();
            } else {
                aVar.c(false);
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f20016d = i == 0;
        if (this.f20013a != null) {
            if (i == 0) {
                a();
            } else {
                if (com.anythink.expressad.foundation.f.b.f19049c) {
                    return;
                }
                this.f20013a.c(false);
            }
        }
    }

    public void release() {
        if (this.f20014b != null) {
            this.f20014b = null;
        }
        com.anythink.expressad.mbbanner.b.a aVar = this.f20013a;
        if (aVar != null) {
            aVar.a((h) null);
            this.f20013a.c();
        }
        removeAllViews();
    }

    public void setAllowShowCloseBtn(boolean z3) {
        com.anythink.expressad.mbbanner.b.a aVar = this.f20013a;
        if (aVar != null) {
            aVar.a(z3);
        }
    }

    public void setBannerAdListener(h hVar) {
        this.f20014b = hVar;
        com.anythink.expressad.mbbanner.b.a aVar = this.f20013a;
        if (aVar != null) {
            aVar.a(hVar);
        }
    }

    public void updateBannerSize(i iVar) {
        com.anythink.expressad.mbbanner.b.a aVar = this.f20013a;
        if (aVar != null) {
            aVar.a(iVar);
        }
    }

    public TemplateBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(boolean z3) {
        this.f20015c = z3;
        com.anythink.expressad.mbbanner.b.a aVar = this.f20013a;
        if (aVar != null) {
            aVar.b(z3);
        }
    }

    public TemplateBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20015c = false;
        this.f20016d = false;
        com.anythink.expressad.foundation.b.a.c().b(context);
    }

    private void a() {
        postDelayed(new Runnable() { // from class: com.anythink.expressad.out.TemplateBannerView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (TemplateBannerView.this.f20013a == null || com.anythink.expressad.foundation.f.b.f19049c) {
                    return;
                }
                TemplateBannerView.this.f20013a.c(true);
            }
        }, 200L);
    }
}
