package com.anythink.basead.mixad.c;

import android.view.View;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.ATNativeAdInfo;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IATThirdPartyMaterial;
import com.anythink.core.common.l.e.a.g;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private final BaseAd f9550a;

    /* renamed from: b, reason: collision with root package name */
    private IATThirdPartyMaterial f9551b;

    /* renamed from: c, reason: collision with root package name */
    private ATNativeAdInfo.AdPrepareInfo f9552c;

    /* renamed from: d, reason: collision with root package name */
    private ATNativeAdInfo.AdController f9553d;

    /* renamed from: e, reason: collision with root package name */
    private ATNativeAdCustomRender f9554e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.l.b f9555f;

    public c(BaseAd baseAd) {
        this.f9550a = baseAd;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final void a(ATNativeAdInfo.AdController adController) {
        this.f9553d = adController;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final ATBaseAdAdapter b() {
        return null;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final ATNativeAdInfo.AdPrepareInfo c() {
        return this.f9552c;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final ATNativeAdCustomRender d() {
        return this.f9554e;
    }

    @Override // com.anythink.core.api.ATNativeAdInfo
    public final ATNativeAdInfo.AdController getAdController() {
        return this.f9553d;
    }

    @Override // com.anythink.core.api.ATNativeAdInfo
    public final IATThirdPartyMaterial getAdMaterial() {
        BaseAd baseAd = this.f9550a;
        if (baseAd == null) {
            return null;
        }
        if (this.f9551b == null) {
            this.f9551b = new d(baseAd, this);
        }
        return this.f9551b;
    }

    @Override // com.anythink.core.api.ATNativeAdInfo
    public final void prepare(ATNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        this.f9552c = adPrepareInfo;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final BaseAd a() {
        return this.f9550a;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final void a(ATNativeAdCustomRender aTNativeAdCustomRender) {
        this.f9554e = aTNativeAdCustomRender;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final void a(com.anythink.core.common.l.b bVar) {
        this.f9555f = bVar;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final View a(int i, int i6, ATShakeViewListener aTShakeViewListener) {
        View shakeView;
        BaseAd baseAd = this.f9550a;
        if (baseAd != null && (shakeView = baseAd.getShakeView(i, i6, aTShakeViewListener)) != null) {
            return shakeView;
        }
        com.anythink.core.common.l.b bVar = this.f9555f;
        if (bVar == null) {
            return null;
        }
        Object a9 = bVar.a(i, i6, aTShakeViewListener);
        if (a9 instanceof View) {
            return (View) a9;
        }
        return null;
    }
}
