package com.gamericefishpro.space.d;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.z4.p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ k e;

    public /* synthetic */ c(k kVar, int i) {
        this.d = i;
        this.e = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.reportFullyDrawn();
                return Unit.a;
            case 1:
                k kVar = this.e;
                return new m(kVar.y, new c(kVar, 0));
            case 2:
                com.gamericefishpro.space.j5.a aVar = new com.gamericefishpro.space.j5.a();
                this.e.c().b(aVar);
                return aVar;
            case 3:
                k kVar2 = this.e;
                return new p0(kVar2.getApplication(), kVar2, kVar2.getIntent() != null ? kVar2.getIntent().getExtras() : null);
            default:
                k kVar3 = this.e;
                r rVar = new r(new b(kVar3, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                        kVar3.d.a(new d(0, rVar, kVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new com.gamericefishpro.space.bb.h(4, kVar3, rVar));
                    }
                }
                return rVar;
        }
    }
}
