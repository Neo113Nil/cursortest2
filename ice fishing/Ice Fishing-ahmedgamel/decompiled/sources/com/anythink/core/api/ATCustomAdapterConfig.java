package com.anythink.core.api;

/* loaded from: classes.dex */
public class ATCustomAdapterConfig {
    private long adCacheTime;
    private int lossNoticePosition;
    private boolean realTimeBidSwitch;

    public static class Builder {
        private boolean realTimeBidSwitch = false;
        private long adCacheTime = 1800000;
        private int lossNoticePosition = -1;

        public Builder adCacheTime(long j6) {
            this.adCacheTime = j6;
            return this;
        }

        public ATCustomAdapterConfig build() {
            ATCustomAdapterConfig aTCustomAdapterConfig = new ATCustomAdapterConfig();
            aTCustomAdapterConfig.realTimeBidSwitch = this.realTimeBidSwitch;
            aTCustomAdapterConfig.adCacheTime = this.adCacheTime;
            aTCustomAdapterConfig.lossNoticePosition = this.lossNoticePosition;
            return aTCustomAdapterConfig;
        }

        public Builder lossNoticePosition(int i) {
            this.lossNoticePosition = i;
            return this;
        }

        public Builder realTimeBidSwitch(boolean z6) {
            this.realTimeBidSwitch = z6;
            return this;
        }
    }

    public long getAdCacheTime() {
        return this.adCacheTime;
    }

    public int getLossNoticePostion() {
        return this.lossNoticePosition;
    }

    public boolean isRealTimeBidSwitch() {
        return this.realTimeBidSwitch;
    }

    private ATCustomAdapterConfig() {
    }
}
