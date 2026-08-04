package com.gamericefishpro.space.y;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ z e;

    public /* synthetic */ a(z zVar, int i) {
        this.d = i;
        this.e = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.gamericefishpro.space.h2.i iVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.t0.a0 a0Var = n0.a;
                z zVar = this.e;
                q0 q0Var = (q0) com.gamericefishpro.space.h2.k.h(zVar, a0Var);
                if (q0Var == null) {
                    com.gamericefishpro.space.c0.a.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + q0Var);
                }
                q0 q0Var2 = zVar.P;
                zVar.P = q0Var;
                if (q0Var2 != null && !Intrinsics.a(q0Var, q0Var2) && ((iVar = zVar.Q) != null || !zVar.X)) {
                    if (iVar != null) {
                        zVar.B0(iVar);
                    }
                    zVar.Q = null;
                    zVar.I0();
                }
                return Unit.a;
            default:
                this.e.N.invoke();
                return Boolean.TRUE;
        }
    }
}
