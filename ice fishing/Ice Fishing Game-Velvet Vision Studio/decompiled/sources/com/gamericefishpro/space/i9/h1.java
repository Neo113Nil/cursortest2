package com.gamericefishpro.space.i9;

import android.app.Activity;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends g1 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Activity y;
    public final /* synthetic */ i1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, Activity activity, int i) {
        super(i1Var.d, true);
        this.w = i;
        switch (i) {
            case 1:
                this.y = activity;
                this.z = i1Var;
                super(i1Var.d, true);
                break;
            case 2:
                this.y = activity;
                this.z = i1Var;
                super(i1Var.d, true);
                break;
            case 3:
                this.y = activity;
                this.z = i1Var;
                super(i1Var.d, true);
                break;
            case 4:
                this.y = activity;
                this.z = i1Var;
                super(i1Var.d, true);
                break;
            default:
                this.y = activity;
                this.z = i1Var;
                break;
        }
    }

    @Override // com.gamericefishpro.space.i9.g1
    public final void a() {
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j0 j0Var = this.z.d.e;
                com.gamericefishpro.space.v8.c0.g(j0Var);
                j0Var.onActivityStartedByScionActivityInfo(v0.b(this.y), this.e);
                break;
            case 1:
                j0 j0Var2 = this.z.d.e;
                com.gamericefishpro.space.v8.c0.g(j0Var2);
                j0Var2.onActivityResumedByScionActivityInfo(v0.b(this.y), this.e);
                break;
            case 2:
                j0 j0Var3 = this.z.d.e;
                com.gamericefishpro.space.v8.c0.g(j0Var3);
                j0Var3.onActivityPausedByScionActivityInfo(v0.b(this.y), this.e);
                break;
            case 3:
                j0 j0Var4 = this.z.d.e;
                com.gamericefishpro.space.v8.c0.g(j0Var4);
                j0Var4.onActivityStoppedByScionActivityInfo(v0.b(this.y), this.e);
                break;
            default:
                j0 j0Var5 = this.z.d.e;
                com.gamericefishpro.space.v8.c0.g(j0Var5);
                j0Var5.onActivityDestroyedByScionActivityInfo(v0.b(this.y), this.e);
                break;
        }
    }
}
