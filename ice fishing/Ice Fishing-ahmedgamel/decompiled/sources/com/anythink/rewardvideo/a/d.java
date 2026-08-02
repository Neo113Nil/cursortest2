package com.anythink.rewardvideo.a;

import android.content.Context;
import com.anythink.core.api.ATCommonImpressionListener;
import com.anythink.core.api.ATNetworkConfirmInfo;

/* loaded from: classes.dex */
public abstract class d implements ATCommonImpressionListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f24081a;

    /* renamed from: b, reason: collision with root package name */
    private int f24082b;

    /* renamed from: c, reason: collision with root package name */
    protected final f f24083c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f24084d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f24085e = false;

    public d(f fVar, boolean z6, int i) {
        this.f24083c = fVar;
        this.f24081a = z6;
        this.f24082b = i;
    }

    private boolean a() {
        return this.f24082b == 1;
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdClick() {
        if (!this.f24081a || this.f24083c == null) {
            return;
        }
        if (this.f24082b != 1) {
            onAdReward();
        }
        this.f24083c.onRewardedVideoAdPlayClicked();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdDismiss() {
        if (!this.f24081a || this.f24083c == null) {
            return;
        }
        if (!this.f24084d) {
            this.f24084d = true;
            this.f24083c.onRewardedVideoAdPlayEnd();
        }
        onAdReward();
        this.f24083c.onRewardedVideoAdClosed();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdImpression() {
        f fVar;
        if (!this.f24081a || (fVar = this.f24083c) == null) {
            return;
        }
        fVar.onRewardedVideoAdPlayStart();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdReward() {
        if (this.f24083c == null || this.f24085e) {
            return;
        }
        this.f24085e = true;
        this.f24083c.onReward();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdRewardFailed() {
        if (this.f24083c == null || this.f24085e) {
            return;
        }
        this.f24085e = true;
        this.f24083c.onRewardFailed();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdShowFail(String str, String str2) {
        f fVar;
        if (!this.f24081a || (fVar = this.f24083c) == null) {
            return;
        }
        fVar.onRewardedVideoAdPlayFailed(str, str2);
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdVideoPlayEnd() {
        if (!this.f24081a || this.f24083c == null || this.f24084d) {
            return;
        }
        this.f24084d = true;
        this.f24083c.onRewardedVideoAdPlayEnd();
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onAdVideoPlayStart() {
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onDeeplinkCallback(boolean z6) {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onDeeplinkCallback(z6);
        }
    }

    @Override // com.anythink.core.api.ATCommonImpressionListener
    public void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onDownloadConfirm(context, aTNetworkConfirmInfo);
        }
    }
}
