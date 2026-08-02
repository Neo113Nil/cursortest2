package com.squareup.cash.shopping.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class WebVitals {
    public final WebVitalsScore CLS;
    public final WebVitalsScore FCP;
    public final WebVitalsScore FID;
    public final WebVitalsScore INP;
    public final WebVitalsScore LCP;
    public final WebVitalsScore TBT;
    public final WebVitalsScore TTFB;
    public final WebVitalsScore TTI;

    public WebVitals() {
        WebVitalsScore webVitalsScore = new WebVitalsScore();
        WebVitalsScore webVitalsScore2 = new WebVitalsScore();
        WebVitalsScore webVitalsScore3 = new WebVitalsScore();
        WebVitalsScore webVitalsScore4 = new WebVitalsScore();
        WebVitalsScore webVitalsScore5 = new WebVitalsScore();
        WebVitalsScore webVitalsScore6 = new WebVitalsScore();
        WebVitalsScore webVitalsScore7 = new WebVitalsScore();
        WebVitalsScore webVitalsScore8 = new WebVitalsScore();
        this.FCP = webVitalsScore;
        this.TBT = webVitalsScore2;
        this.CLS = webVitalsScore3;
        this.TTI = webVitalsScore4;
        this.FID = webVitalsScore5;
        this.INP = webVitalsScore6;
        this.LCP = webVitalsScore7;
        this.TTFB = webVitalsScore8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebVitals)) {
            return false;
        }
        WebVitals webVitals = (WebVitals) obj;
        return Intrinsics.areEqual(this.FCP, webVitals.FCP) && Intrinsics.areEqual(this.TBT, webVitals.TBT) && Intrinsics.areEqual(this.CLS, webVitals.CLS) && Intrinsics.areEqual(this.TTI, webVitals.TTI) && Intrinsics.areEqual(this.FID, webVitals.FID) && Intrinsics.areEqual(this.INP, webVitals.INP) && Intrinsics.areEqual(this.LCP, webVitals.LCP) && Intrinsics.areEqual(this.TTFB, webVitals.TTFB);
    }

    public final int hashCode() {
        return this.TTFB.hashCode() + ((this.LCP.hashCode() + ((this.INP.hashCode() + ((this.FID.hashCode() + ((this.TTI.hashCode() + ((this.CLS.hashCode() + ((this.TBT.hashCode() + (this.FCP.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WebVitals(FCP=" + this.FCP + ", TBT=" + this.TBT + ", CLS=" + this.CLS + ", TTI=" + this.TTI + ", FID=" + this.FID + ", INP=" + this.INP + ", LCP=" + this.LCP + ", TTFB=" + this.TTFB + ")";
    }
}
