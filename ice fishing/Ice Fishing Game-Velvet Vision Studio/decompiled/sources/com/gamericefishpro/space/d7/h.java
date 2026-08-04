package com.gamericefishpro.space.d7;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.s5.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends r {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.gamericefishpro.space.s5.r
    public void a(com.gamericefishpro.space.d6.b db) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(db, "db");
                super.a(db);
                com.gamericefishpro.space.wi.e eVar = k0.a;
                a0.u(a0.b(com.gamericefishpro.space.wi.d.i), null, new com.gamericefishpro.space.b0.o((Context) this.b, (com.gamericefishpro.space.th.a) null, 2), 3);
                break;
            default:
                super.a(db);
                break;
        }
    }

    @Override // com.gamericefishpro.space.s5.r
    public void b(com.gamericefishpro.space.d6.b db) throws com.gamericefishpro.space.f1.h {
        switch (this.a) {
            case 1:
                Intrinsics.checkNotNullParameter(db, "db");
                ((com.gamericefishpro.space.a7.c) this.b).invoke(db);
                break;
            default:
                super.b(db);
                break;
        }
    }
}
