package com.airbnb.lottie.utils;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public class LottieTrace {
    private static final int MAX_DEPTH = 5;
    private final String[] sections = new String[5];
    private final long[] startTimeNs = new long[5];
    private int traceDepth = 0;
    private int depthPastMaxDepth = 0;

    public void beginSection(String str) {
        int i = this.traceDepth;
        if (i == 5) {
            this.depthPastMaxDepth++;
            return;
        }
        this.sections[i] = str;
        this.startTimeNs[i] = System.nanoTime();
        Trace.beginSection(str);
        this.traceDepth++;
    }

    public float endSection(String str) {
        int i = this.depthPastMaxDepth;
        if (i > 0) {
            this.depthPastMaxDepth = i - 1;
            return RecyclerView.DECELERATION_RATE;
        }
        int i2 = this.traceDepth - 1;
        this.traceDepth = i2;
        if (i2 == -1) {
            a$$ExternalSyntheticBUOutline0.m$1("Can't end trace section. There are none.");
            return RecyclerView.DECELERATION_RATE;
        }
        if (str.equals(this.sections[i2])) {
            Trace.endSection();
            return (System.nanoTime() - this.startTimeNs[this.traceDepth]) / 1000000.0f;
        }
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Unbalanced trace call ", str, ". Expected "), this.sections[this.traceDepth], "."));
        return RecyclerView.DECELERATION_RATE;
    }
}
