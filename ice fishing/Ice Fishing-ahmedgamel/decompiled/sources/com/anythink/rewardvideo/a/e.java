package com.anythink.rewardvideo.a;

import com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;

/* loaded from: classes.dex */
public class e extends d implements CustomRewardedVideoEventListener {
    public e(f fVar, boolean z6, int i) {
        super(fVar, z6, i);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onAgainReward() {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onAgainReward();
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onAgainRewardFailed() {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onAgainRewardFailed();
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onReward() {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onReward();
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardFailed() {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onRewardFailed();
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdAgainPlayClicked() {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onRewardedVideoAdAgainPlayClicked();
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdAgainPlayEnd() {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onRewardedVideoAdAgainPlayEnd();
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdAgainPlayFailed(String str, String str2) {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onRewardedVideoAdAgainPlayFailed(str, str2);
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdAgainPlayStart() {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onRewardedVideoAdAgainPlayStart();
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdClosed() {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onRewardedVideoAdClosed();
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdPlayClicked() {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onRewardedVideoAdPlayClicked();
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdPlayEnd() {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onRewardedVideoAdPlayEnd();
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdPlayFailed(String str, String str2) {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onRewardedVideoAdPlayFailed(str, str2);
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public void onRewardedVideoAdPlayStart() {
        f fVar = this.f24083c;
        if (fVar != null) {
            fVar.onRewardedVideoAdPlayStart();
        }
    }
}
