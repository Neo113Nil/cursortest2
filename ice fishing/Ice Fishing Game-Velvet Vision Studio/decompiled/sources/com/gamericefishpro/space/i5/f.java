package com.gamericefishpro.space.i5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.o2.s;
import com.gamericefishpro.space.o2.u;
import com.gamericefishpro.space.o2.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ f(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        String str = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(Intrinsics.a((String) obj, str));
            case 1:
                w wVar = (w) obj;
                com.gamericefishpro.space.ki.d[] dVarArr = u.a;
                wVar.b(s.a, com.gamericefishpro.space.ph.w.c(str));
                u.a(wVar, 5);
                return Unit.a;
            default:
                w wVar2 = (w) obj;
                com.gamericefishpro.space.ki.d[] dVarArr2 = u.a;
                wVar2.b(s.a, com.gamericefishpro.space.ph.w.c(str));
                u.a(wVar2, 5);
                return Unit.a;
        }
    }
}
