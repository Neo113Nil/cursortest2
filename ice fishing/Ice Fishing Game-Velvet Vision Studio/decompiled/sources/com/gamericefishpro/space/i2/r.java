package com.gamericefishpro.space.i2;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ t e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, int i) {
        super(0);
        this.d = i;
        this.e = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int actionMasked;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t tVar = this.e;
                MotionEvent motionEvent = tVar.M0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    tVar.N0 = SystemClock.uptimeMillis();
                    tVar.post(tVar.S0);
                }
                return Unit.a;
            default:
                return this.e.get_viewTreeOwners();
        }
    }
}
