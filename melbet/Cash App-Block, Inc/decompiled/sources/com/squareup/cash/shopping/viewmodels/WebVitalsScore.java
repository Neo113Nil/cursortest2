package com.squareup.cash.shopping.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes7.dex */
public final class WebVitalsScore {
    public String value = "";
    public String score = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebVitalsScore)) {
            return false;
        }
        WebVitalsScore webVitalsScore = (WebVitalsScore) obj;
        return this.value.equals(webVitalsScore.value) && this.score.equals(webVitalsScore.score);
    }

    public final int hashCode() {
        return this.score.hashCode() + (this.value.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("WebVitalsScore(value=", this.value, ", score=", this.score, ")");
    }
}
