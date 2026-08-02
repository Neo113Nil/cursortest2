package com.squareup.cash.advertising.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.messagingplatformcommon.app.Video;
import java.util.List;

/* loaded from: classes5.dex */
public final class FullscreenAd {
    public final Status$Complete assetStatus;
    public final Config config;

    public final class Config {
        public final List actions;
        public final Asset asset;
        public final Video.AudioPreference audioPreference;

        public Config(Asset asset, List list, Video.AudioPreference audioPreference) {
            this.asset = asset;
            this.actions = list;
            this.audioPreference = audioPreference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.asset.equals(config.asset) && this.actions.equals(config.actions) && this.audioPreference == config.audioPreference;
        }

        public final int hashCode() {
            return this.audioPreference.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.asset.hashCode() * 31, 31, this.actions);
        }

        public final String toString() {
            return "Config(title=null, message=null, asset=" + this.asset + ", actions=" + this.actions + ", audioPreference=" + this.audioPreference + ")";
        }
    }

    public FullscreenAd(Config config, Status$Complete status$Complete) {
        this.config = config;
        this.assetStatus = status$Complete;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullscreenAd)) {
            return false;
        }
        FullscreenAd fullscreenAd = (FullscreenAd) obj;
        return this.config.equals(fullscreenAd.config) && this.assetStatus.equals(fullscreenAd.assetStatus);
    }

    public final int hashCode() {
        return this.assetStatus.hashCode() + (this.config.hashCode() * 31);
    }

    public final String toString() {
        return "FullscreenAd(config=" + this.config + ", assetStatus=" + this.assetStatus + ")";
    }
}
