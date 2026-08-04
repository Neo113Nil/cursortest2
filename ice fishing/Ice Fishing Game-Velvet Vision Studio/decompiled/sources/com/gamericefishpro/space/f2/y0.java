package com.gamericefishpro.space.f2;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ArrayList e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i, ArrayList arrayList) {
        super(1);
        this.d = i;
        this.e = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t0 t0Var = (t0) obj;
                ArrayList arrayList = this.e;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    t0.o(t0Var, (u0) arrayList.get(i), 0, 0);
                }
                break;
            case 1:
                t0 t0Var2 = (t0) obj;
                ArrayList arrayList2 = this.e;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    t0.l(t0Var2, (u0) arrayList2.get(i2), 0, 0);
                }
                break;
            default:
                t0 t0Var3 = (t0) obj;
                ArrayList arrayList3 = this.e;
                int size3 = arrayList3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    t0Var3.h((u0) arrayList3.get(i3), 0, 0, 0.0f);
                }
                break;
        }
        return Unit.a;
    }
}
