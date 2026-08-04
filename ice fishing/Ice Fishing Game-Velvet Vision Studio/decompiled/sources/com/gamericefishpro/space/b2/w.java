package com.gamericefishpro.space.b2;

import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h2.o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.gamericefishpro.space.f3.z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.gamericefishpro.space.f3.z zVar, int i) {
        super(1);
        this.d = i;
        this.e = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                com.gamericefishpro.space.f3.z zVar = this.e;
                switch (actionMasked) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        zDispatchTouchEvent = zVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = zVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            case 1:
                o1 o1Var = (o1) obj;
                com.gamericefishpro.space.i2.t tVar = o1Var instanceof com.gamericefishpro.space.i2.t ? (com.gamericefishpro.space.i2.t) o1Var : null;
                com.gamericefishpro.space.f3.z zVar2 = this.e;
                if (tVar != null) {
                    tVar.getAndroidViewsHandler$ui().removeViewInLayout(zVar2);
                    com.gamericefishpro.space.ei.e0.b(tVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(tVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(zVar2));
                    zVar2.setImportantForAccessibility(0);
                }
                zVar2.removeAllViewsInLayout();
                return Unit.a;
            default:
                this.e.J = (Function1) obj;
                return Unit.a;
        }
    }
}
