package com.gamericefishpro.space.i2;

import android.view.accessibility.AccessibilityEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, int i) {
        super(1);
        this.d = i;
        this.e = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z zVar = this.e;
                return Boolean.valueOf(zVar.v.getParent().requestSendAccessibilityEvent(zVar.v, (AccessibilityEvent) obj));
            default:
                r1 r1Var = (r1) obj;
                if (r1Var.e.contains(r1Var)) {
                    z zVar2 = this.e;
                    com.gamericefishpro.space.h2.q1 snapshotObserver = zVar2.v.getSnapshotObserver();
                    snapshotObserver.a.c(r1Var, zVar2.g0, new com.gamericefishpro.space.b2.b(6, r1Var, zVar2));
                }
                return Unit.a;
        }
    }
}
