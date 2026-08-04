package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends g1 {
    public final /* synthetic */ int w;
    public final /* synthetic */ g0 y;
    public final /* synthetic */ j1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(j1 j1Var, g0 g0Var, int i) {
        super(j1Var, true);
        this.w = i;
        this.y = g0Var;
        this.z = j1Var;
    }

    @Override // com.gamericefishpro.space.i9.g1
    public final void a() {
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j0 j0Var = this.z.e;
                com.gamericefishpro.space.v8.c0.g(j0Var);
                j0Var.getGmpAppId(this.y);
                break;
            case 1:
                j0 j0Var2 = this.z.e;
                com.gamericefishpro.space.v8.c0.g(j0Var2);
                j0Var2.getCachedAppInstanceId(this.y);
                break;
            case 2:
                j0 j0Var3 = this.z.e;
                com.gamericefishpro.space.v8.c0.g(j0Var3);
                j0Var3.generateEventId(this.y);
                break;
            case 3:
                j0 j0Var4 = this.z.e;
                com.gamericefishpro.space.v8.c0.g(j0Var4);
                j0Var4.getCurrentScreenName(this.y);
                break;
            case 4:
                j0 j0Var5 = this.z.e;
                com.gamericefishpro.space.v8.c0.g(j0Var5);
                j0Var5.getCurrentScreenClass(this.y);
                break;
            default:
                j0 j0Var6 = this.z.e;
                com.gamericefishpro.space.v8.c0.g(j0Var6);
                j0Var6.getAppInstanceId(this.y);
                break;
        }
    }

    @Override // com.gamericefishpro.space.i9.g1
    public final void b() {
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.y.h(null);
                break;
            case 1:
                this.y.h(null);
                break;
            case 2:
                this.y.h(null);
                break;
            case 3:
                this.y.h(null);
                break;
            case 4:
                this.y.h(null);
                break;
            default:
                this.y.h(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(j1 j1Var, g0 g0Var) {
        super(j1Var, true);
        this.w = 5;
        this.y = g0Var;
        Objects.requireNonNull(j1Var);
        this.z = j1Var;
    }
}
