package com.gamericefishpro.space.n7;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object y;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.d = i2;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
        this.w = obj4;
        this.y = obj5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.d9.h.d((List) this.e, (Pair) this.i, (com.gamericefishpro.space.i7.d) this.v, (a0) this.w, (Function2) this.y, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.d9.h.d((List) this.e, (Pair) this.i, (com.gamericefishpro.space.i7.d) this.v, (a0) this.w, (Function2) this.y, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.i.a.g((String) this.e, (Function0) this.i, (com.gamericefishpro.space.v7.i) this.v, (com.gamericefishpro.space.x7.f) this.w, (com.gamericefishpro.space.x7.c) this.y, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                break;
        }
        return Unit.a;
    }
}
