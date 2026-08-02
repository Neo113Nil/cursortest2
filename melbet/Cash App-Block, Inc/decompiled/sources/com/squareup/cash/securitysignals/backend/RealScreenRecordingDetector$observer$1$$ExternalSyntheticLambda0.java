package com.squareup.cash.securitysignals.backend;

import java.util.function.Consumer;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class RealScreenRecordingDetector$observer$1$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ RealScreenRecordingDetector f$0;

    public /* synthetic */ RealScreenRecordingDetector$observer$1$$ExternalSyntheticLambda0(RealScreenRecordingDetector realScreenRecordingDetector) {
        this.f$0 = realScreenRecordingDetector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r2.intValue() == 1) goto L9;
     */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        Integer num = (Integer) obj;
        StateFlowImpl stateFlowImpl = this.f$0._screenIsBeingRecorded;
        boolean z = num != null;
        Boolean valueOf = Boolean.valueOf(z);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, valueOf);
    }
}
