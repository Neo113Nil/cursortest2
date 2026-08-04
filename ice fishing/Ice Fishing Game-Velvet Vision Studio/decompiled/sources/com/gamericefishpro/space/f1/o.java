package com.gamericefishpro.space.f1;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ o(int i, Function1 function1) {
        this.d = i;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = (g) this.e.invoke((m) obj);
                synchronized (p.c) {
                    p.d = p.d.h(gVar.g());
                    Unit unit = Unit.a;
                }
                return gVar;
            default:
                Function1 function1 = this.e;
                Long l = (Long) obj;
                l.longValue();
                return function1.invoke(l);
        }
    }
}
