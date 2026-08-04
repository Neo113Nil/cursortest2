package com.gamericefishpro.space.f3;

import android.view.WindowInsets;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.o1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ z e;
    public final /* synthetic */ f0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(z zVar, f0 f0Var, int i) {
        super(1);
        this.d = i;
        this.e = zVar;
        this.i = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsC;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o1 o1Var = (o1) obj;
                com.gamericefishpro.space.i2.t tVar = o1Var instanceof com.gamericefishpro.space.i2.t ? (com.gamericefishpro.space.i2.t) o1Var : null;
                z zVar = this.e;
                if (tVar != null) {
                    HashMap<j, f0> holderToLayoutNode = tVar.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    f0 f0Var = this.i;
                    holderToLayoutNode.put(zVar, f0Var);
                    tVar.getAndroidViewsHandler$ui().addView(zVar);
                    tVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(f0Var, zVar);
                    zVar.setImportantForAccessibility(1);
                    l0.l(zVar, new com.gamericefishpro.space.i2.n(tVar, f0Var, tVar));
                }
                if (zVar.getView().getParent() != zVar) {
                    zVar.addView(zVar.getView());
                }
                break;
            case 1:
                k.d(this.e, this.i);
                break;
            default:
                f0 f0Var2 = this.i;
                z zVar2 = this.e;
                k.d(zVar2, f0Var2);
                ((com.gamericefishpro.space.i2.t) zVar2.i).c0 = true;
                int[] iArr = zVar2.G;
                int i = iArr[0];
                int i2 = iArr[1];
                zVar2.getView().getLocationOnScreen(iArr);
                long j = zVar2.H;
                long jF = ((com.gamericefishpro.space.f2.u) obj).F();
                zVar2.H = jF;
                com.gamericefishpro.space.d4.o1 o1Var2 = zVar2.I;
                if (o1Var2 != null && ((i != iArr[0] || i2 != iArr[1] || !com.gamericefishpro.space.c3.k.a(j, jF)) && (windowInsetsC = zVar2.m(o1Var2).c()) != null)) {
                    zVar2.getView().dispatchApplyWindowInsets(windowInsetsC);
                }
                break;
        }
        return Unit.a;
    }
}
