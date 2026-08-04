package com.gamericefishpro.space.f0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f2.t0;
import com.gamericefishpro.space.t0.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ v0 e;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ List v;

    public /* synthetic */ p(v0 v0Var, ArrayList arrayList, List list, boolean z, int i) {
        this.d = i;
        this.e = v0Var;
        this.i = arrayList;
        this.v = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        List list = this.v;
        ArrayList arrayList = this.i;
        v0 v0Var = this.e;
        t0 t0Var = (t0) obj;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t0Var.d = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((r) arrayList.get(i2)).j(t0Var);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((r) list.get(i3)).j(t0Var);
                }
                Unit unit = Unit.a;
                t0Var.d = false;
                v0Var.getValue();
                break;
            default:
                t0Var.d = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((com.gamericefishpro.space.g0.m) arrayList.get(i4)).j(t0Var);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((com.gamericefishpro.space.g0.m) list.get(i5)).j(t0Var);
                }
                Unit unit2 = Unit.a;
                t0Var.d = false;
                v0Var.getValue();
                break;
        }
        return Unit.a;
    }
}
