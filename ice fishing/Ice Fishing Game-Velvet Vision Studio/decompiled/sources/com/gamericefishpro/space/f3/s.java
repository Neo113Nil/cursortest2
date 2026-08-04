package com.gamericefishpro.space.f3;

import android.graphics.Rect;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.a4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ t e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t tVar, int i) {
        super(1);
        this.d = i;
        this.e = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.m1.a aVar = (com.gamericefishpro.space.m1.a) obj;
                t tVar = this.e;
                View viewC = k.c(tVar);
                if (!viewC.isFocused() && !viewC.hasFocus()) {
                    com.gamericefishpro.space.m1.h focusOwner = ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(tVar)).getFocusOwner();
                    View viewU = com.gamericefishpro.space.h2.k.u(tVar);
                    Integer numC = com.gamericefishpro.space.m1.d.c(aVar.a);
                    int[] iArr = new int[2];
                    viewU.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewC.getLocationOnScreen(iArr2);
                    com.gamericefishpro.space.m1.u uVarV = a4.v(((com.gamericefishpro.space.m1.k) focusOwner).c);
                    Rect rect = null;
                    com.gamericefishpro.space.n1.c cVarW = uVarV != null ? a4.w(uVarV) : null;
                    if (cVarW != null) {
                        int i = (int) cVarW.a;
                        int i2 = iArr[0];
                        int i3 = iArr2[0];
                        int i4 = (int) cVarW.b;
                        int i5 = iArr[1];
                        int i6 = iArr2[1];
                        rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) cVarW.c) + i2) - i3, (((int) cVarW.d) + i5) - i6);
                    }
                    if (!com.gamericefishpro.space.m1.d.b(viewC, numC, rect)) {
                        aVar.b = true;
                    }
                }
                break;
            default:
                k.c(this.e);
                break;
        }
        return Unit.a;
    }
}
