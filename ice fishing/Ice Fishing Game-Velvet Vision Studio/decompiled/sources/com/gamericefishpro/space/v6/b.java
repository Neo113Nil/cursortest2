package com.gamericefishpro.space.v6;

import androidx.work.impl.WorkDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.u8.q {
    public final /* synthetic */ int i;
    public final /* synthetic */ com.gamericefishpro.space.m6.o v;
    public final /* synthetic */ Object w;

    public /* synthetic */ b(com.gamericefishpro.space.m6.o oVar, Object obj, int i) {
        this.i = i;
        this.v = oVar;
        this.w = obj;
    }

    @Override // com.gamericefishpro.space.u8.q
    public final void b() {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.m6.o oVar = this.v;
                WorkDatabase workDatabase = oVar.c;
                workDatabase.c();
                try {
                    com.gamericefishpro.space.u8.q.a(oVar, ((UUID) this.w).toString());
                    workDatabase.u();
                    workDatabase.q();
                    com.gamericefishpro.space.m6.i.a(oVar.b, oVar.c, oVar.e);
                    return;
                } catch (Throwable th) {
                    workDatabase.q();
                    throw th;
                }
            default:
                com.gamericefishpro.space.m6.o oVar2 = this.v;
                WorkDatabase workDatabase2 = oVar2.c;
                workDatabase2.c();
                try {
                    ArrayList arrayListL = workDatabase2.B().l((String) this.w);
                    int size = arrayListL.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListL.get(i);
                        i++;
                        com.gamericefishpro.space.u8.q.a(oVar2, (String) obj);
                    }
                    workDatabase2.u();
                    return;
                } finally {
                    workDatabase2.q();
                }
        }
    }
}
