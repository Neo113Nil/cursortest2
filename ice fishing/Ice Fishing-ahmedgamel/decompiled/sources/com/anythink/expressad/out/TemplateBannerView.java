package com.anythink.expressad.out;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class TemplateBannerView extends RelativeLayout implements com.anythink.basead.f.c.c {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.b.a f20800a;

    /* renamed from: b, reason: collision with root package name */
    private h f20801b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20802c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20803d;

    /* renamed from: e, reason: collision with root package name */
    private String f20804e;

    /* renamed from: f, reason: collision with root package name */
    private String f20805f;

    public TemplateBannerView(Context context) {
        this(context, null);
    }

    public String getCreativeIdWithUnitId() {
        com.anythink.expressad.mbbanner.b.a aVar = this.f20800a;
        return aVar != null ? aVar.b() : "";
    }

    public String getRequestId() {
        com.anythink.expressad.mbbanner.b.a aVar = this.f20800a;
        return aVar != null ? aVar.a() : "";
    }

    public void init(i iVar, String str, String str2) {
        this.f20805f = str2;
        com.anythink.expressad.mbbanner.b.a aVar = new com.anythink.expressad.mbbanner.b.a(this, iVar, str, str2);
        this.f20800a = aVar;
        aVar.c(this.f20803d);
        this.f20800a.b(this.f20802c);
    }

    @Override // com.anythink.basead.f.c.c
    public boolean isReady() {
        return true;
    }

    public void load(com.anythink.expressad.foundation.d.e eVar) {
        com.anythink.expressad.mbbanner.b.a aVar = this.f20800a;
        if (aVar != null) {
            aVar.b(this.f20802c);
            this.f20800a.a(eVar);
        } else {
            h hVar = this.f20801b;
            if (hVar != null) {
                hVar.a(com.anythink.expressad.mbbanner.a.a.f20597a);
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
        if (this.f20800a == null || !TextUtils.isEmpty(this.f20804e)) {
            return;
        }
        this.f20800a.d();
    }

    public void onResume() {
        if (this.f20800a == null || !TextUtils.isEmpty(this.f20804e) || com.anythink.expressad.foundation.f.b.f19836c) {
            return;
        }
        this.f20800a.e();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        com.anythink.expressad.mbbanner.b.a aVar = this.f20800a;
        if (aVar != null) {
            aVar.a(i, i4, i6, i9);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.f20803d = i == 0;
        com.anythink.expressad.mbbanner.b.a aVar = this.f20800a;
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
        this.f20803d = i == 0;
        if (this.f20800a != null) {
            if (i == 0) {
                a();
            } else {
                if (com.anythink.expressad.foundation.f.b.f19836c) {
                    return;
                }
                this.f20800a.c(false);
            }
        }
    }

    public void release() {
        if (this.f20801b != null) {
            this.f20801b = null;
        }
        com.anythink.expressad.mbbanner.b.a aVar = this.f20800a;
        if (aVar != null) {
            aVar.a((h) null);
            this.f20800a.c();
        }
        removeAllViews();
    }

    public void setAllowShowCloseBtn(boolean z6) {
        com.anythink.expressad.mbbanner.b.a aVar = this.f20800a;
        if (aVar != null) {
            aVar.a(z6);
        }
    }

    public void setBannerAdListener(h hVar) {
        this.f20801b = hVar;
        com.anythink.expressad.mbbanner.b.a aVar = this.f20800a;
        if (aVar != null) {
            aVar.a(hVar);
        }
    }

    public void updateBannerSize(i iVar) {
        com.anythink.expressad.mbbanner.b.a aVar = this.f20800a;
        if (aVar != null) {
            aVar.a(iVar);
        }
    }

    public TemplateBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(boolean z6) {
        this.f20802c = z6;
        com.anythink.expressad.mbbanner.b.a aVar = this.f20800a;
        if (aVar != null) {
            aVar.b(z6);
        }
    }

    public TemplateBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20802c = false;
        this.f20803d = false;
        com.anythink.expressad.foundation.b.a.c().b(context);
    }

    private void a() {
        postDelayed(new Runnable() { // from class: com.anythink.expressad.out.TemplateBannerView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (TemplateBannerView.this.f20800a == null || com.anythink.expressad.foundation.f.b.f19836c) {
                    return;
                }
                TemplateBannerView.this.f20800a.c(true);
            }
        }, 200L);
    }
}
