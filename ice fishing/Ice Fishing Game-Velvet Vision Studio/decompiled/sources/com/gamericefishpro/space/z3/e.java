package com.gamericefishpro.space.z3;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t.r0;
import com.gamericefishpro.space.u6.l;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.c4.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.gamericefishpro.space.c4.a
    public final void accept(Object obj) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((l) this.b).m(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.c) {
                    try {
                        r0 r0Var = g.d;
                        ArrayList arrayList = (ArrayList) r0Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        r0Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((com.gamericefishpro.space.c4.a) arrayList.get(i)).accept(fVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
