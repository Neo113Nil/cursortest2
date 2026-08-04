package com.gamericefishpro.space.b2;

import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ v e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, int i) {
        super(1);
        this.d = i;
        this.e = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                w wVar = this.e.a;
                if (wVar != null) {
                    wVar.invoke(motionEvent);
                    return Unit.a;
                }
                Intrinsics.h("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                w wVar2 = this.e.a;
                if (wVar2 != null) {
                    wVar2.invoke(motionEvent2);
                    return Unit.a;
                }
                Intrinsics.h("onTouchEvent");
                throw null;
        }
    }
}
