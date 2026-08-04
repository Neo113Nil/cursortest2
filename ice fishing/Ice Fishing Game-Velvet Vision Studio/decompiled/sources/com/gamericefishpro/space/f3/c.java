package com.gamericefishpro.space.f3;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.gamericefishpro.space.ei.l implements Function1 {
    public static final c e;
    public static final c i;
    public static final c v;
    public static final c w;
    public final /* synthetic */ int d;

    static {
        int i2 = 1;
        e = new c(i2, 0);
        i = new c(i2, 1);
        v = new c(i2, 2);
        w = new c(i2, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j jVar = (j) obj;
                jVar.getHandler().post(new a(1, jVar.K));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return Unit.a;
    }
}
