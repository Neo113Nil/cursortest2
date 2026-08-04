package com.gamericefishpro.space.cb;

import androidx.work.impl.WorkDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((g) this.e).d.submit(new com.gamericefishpro.space.bb.h(3, (Callable) this.i, (com.gamericefishpro.space.vb.c) this.v));
            default:
                com.gamericefishpro.space.m6.f fVar = (com.gamericefishpro.space.m6.f) this.e;
                ArrayList arrayList = (ArrayList) this.i;
                String str = (String) this.v;
                WorkDatabase workDatabase = fVar.w;
                arrayList.addAll(workDatabase.C().j(str));
                return workDatabase.B().m(str);
        }
    }
}
