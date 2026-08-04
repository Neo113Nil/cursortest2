package com.gamericefishpro.space.i6;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends p {
    public final /* synthetic */ int a;
    public o b;

    public /* synthetic */ t() {
        this.a = 1;
    }

    @Override // com.gamericefishpro.space.i6.p, com.gamericefishpro.space.i6.m
    public void d(o oVar) {
        switch (this.a) {
            case 1:
                a aVar = (a) this.b;
                int i = aVar.X - 1;
                aVar.X = i;
                if (i == 0) {
                    aVar.Y = false;
                    aVar.m();
                }
                oVar.z(this);
                break;
            case 2:
                this.b.B();
                oVar.z(this);
                break;
        }
    }

    @Override // com.gamericefishpro.space.i6.p, com.gamericefishpro.space.i6.m
    public void e(o oVar) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a aVar = (a) this.b;
                aVar.V.remove(oVar);
                if (!aVar.s()) {
                    aVar.w(aVar, n.f, false);
                    aVar.K = true;
                    aVar.w(aVar, n.c, false);
                }
                break;
        }
    }

    @Override // com.gamericefishpro.space.i6.p, com.gamericefishpro.space.i6.m
    public void f(o oVar) {
        switch (this.a) {
            case 1:
                a aVar = (a) this.b;
                if (!aVar.Y) {
                    aVar.J();
                    aVar.Y = true;
                }
                break;
        }
    }

    public /* synthetic */ t(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }
}
