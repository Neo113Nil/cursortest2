package com.gamericefishpro.space.f1;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h0.z0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m mVar = (m) obj;
                synchronized (p.c) {
                    j = p.e;
                    p.e = ((long) 1) + j;
                }
                return new c(j, mVar, (Function1) this.e, (Function1) this.i);
            default:
                z0 z0Var = (z0) this.e;
                Object obj2 = z0Var.b;
                com.gamericefishpro.space.pi.h hVar = (com.gamericefishpro.space.pi.h) this.i;
                synchronized (obj2) {
                    ((ArrayList) z0Var.c).remove(hVar);
                }
                return Unit.a;
        }
    }
}
