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
    private final BaseAd f10336a;

    /* renamed from: b, reason: collision with root package name */
    private IATThirdPartyMaterial f10337b;

    /* renamed from: c, reason: collision with root package name */
    private ATNativeAdInfo.AdPrepareInfo f10338c;

    /* renamed from: d, reason: collision with root package name */
    private ATNativeAdInfo.AdController f10339d;

    /* renamed from: e, reason: collision with root package name */
    private ATNativeAdCustomRender f10340e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.core.common.l.b f10341f;

    public c(BaseAd baseAd) {
        this.f10336a = baseAd;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final void a(ATNativeAdInfo.AdController adController) {
        this.f10339d = adController;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final ATBaseAdAdapter b() {
        return null;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final ATNativeAdInfo.AdPrepareInfo c() {
        return this.f10338c;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final ATNativeAdCustomRender d() {
        return this.f10340e;
    }

    @Override // com.anythink.core.api.ATNativeAdInfo
    public final ATNativeAdInfo.AdController getAdController() {
        return this.f10339d;
    }

    @Override // com.anythink.core.api.ATNativeAdInfo
    public final IATThirdPartyMaterial getAdMaterial() {
        BaseAd baseAd = this.f10336a;
        if (baseAd == null) {
            return null;
        }
        if (this.f10337b == null) {
            this.f10337b = new d(baseAd, this);
        }
        return this.f10337b;
    }

    @Override // com.anythink.core.api.ATNativeAdInfo
    public final void prepare(ATNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        this.f10338c = adPrepareInfo;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final BaseAd a() {
        return this.f10336a;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final void a(ATNativeAdCustomRender aTNativeAdCustomRender) {
        this.f10340e = aTNativeAdCustomRender;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final void a(com.anythink.core.common.l.b bVar) {
        this.f10341f = bVar;
    }

    @Override // com.anythink.core.common.l.e.a.g
    public final View a(int i, int i4, ATShakeViewListener aTShakeViewListener) {
        View shakeView;
        BaseAd baseAd = this.f10336a;
        if (baseAd != null && (shakeView = baseAd.getShakeView(i, i4, aTShakeViewListener)) != null) {
            return shakeView;
        }
        com.anythink.core.common.l.b bVar = this.f10341f;
        if (bVar == null) {
            return null;
        }
        Object a9 = bVar.a(i, i4, aTShakeViewListener);
        if (a9 instanceof View) {
            return (View) a9;
        }
        return null;
    }
}
