package com.anythink.rewardvideo.a;

import android.content.Context;
import com.anythink.core.api.ATCommonImpressionListener;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* loaded from: classes.dex */
public abstract class d implements ATCommonImpressionListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f23294a;

    /* renamed from: b, reason: collision with root package name */
    private int f23295b;

    /* renamed from: c, reason: collision with root package name */
    protected final f f23296c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f23297d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f23298e = false;

    public d(f fVar, boolean z3, int i) {
        this.f23296c = fVar;
        this.f23294a = z3;
        this.f23295b = i;
    }

    private boolean a() {
        return this.f23295b == 1;
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdClick() {
        if (!this.f23294a || this.f23296c == null) {
            return;
        }
        if (this.f23295b != 1) {
            onAdReward();
        }
        this.f23296c.onRewardedVideoAdPlayClicked();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdDismiss() {
        if (!this.f23294a || this.f23296c == null) {
            return;
        }
        if (!this.f23297d) {
            this.f23297d = true;
            this.f23296c.onRewardedVideoAdPlayEnd();
        }
        onAdReward();
        this.f23296c.onRewardedVideoAdClosed();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdImpression() {
        f fVar;
        if (!this.f23294a || (fVar = this.f23296c) == null) {
            return;
        }
        fVar.onRewardedVideoAdPlayStart();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdReward() {
        if (this.f23296c == null || this.f23298e) {
            return;
        }
        this.f23298e = true;
        this.f23296c.onReward();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdRewardFailed() {
        if (this.f23296c == null || this.f23298e) {
            return;
        }
        this.f23298e = true;
        this.f23296c.onRewardFailed();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdShowFail(String str, String str2) {
        f fVar;
        if (!this.f23294a || (fVar = this.f23296c) == null) {
            return;
        }
        fVar.onRewardedVideoAdPlayFailed(str, str2);
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdVideoPlayEnd() {
        if (!this.f23294a || this.f23296c == null || this.f23297d) {
            return;
        }
        this.f23297d = true;
        this.f23296c.onRewardedVideoAdPlayEnd();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdVideoPlayStart() {
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onDeeplinkCallback(boolean z3) {
        f fVar = this.f23296c;
        if (fVar != null) {
            fVar.onDeeplinkCallback(z3);
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        f fVar = this.f23296c;
        if (fVar != null) {
            fVar.onDownloadConfirm(context, aTNetworkConfirmInfo);
        }
    }
}
