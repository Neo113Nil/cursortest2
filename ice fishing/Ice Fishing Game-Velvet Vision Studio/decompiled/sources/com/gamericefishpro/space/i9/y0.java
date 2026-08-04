package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends g1 {
    public final /* synthetic */ j1 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(j1 j1Var, v0 v0Var, String str, String str2) {
        super(j1Var, true);
        this.B = v0Var;
        this.y = str;
        this.z = str2;
        Objects.requireNonNull(j1Var);
        this.A = j1Var;
    }

    @Override // com.gamericefishpro.space.i9.g1
    public final void a() {
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j0 j0Var = this.A.e;
                com.gamericefishpro.space.v8.c0.g(j0Var);
                j0Var.getConditionalUserProperties(this.y, this.z, (g0) this.B);
                break;
            default:
                j0 j0Var2 = this.A.e;
                com.gamericefishpro.space.v8.c0.g(j0Var2);
                j0Var2.setCurrentScreenByScionActivityInfo((v0) this.B, this.y, this.z, this.d);
                break;
        }
    }

    @Override // com.gamericefishpro.space.i9.g1
    public void b() {
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((g0) this.B).h(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(j1 j1Var, String str, String str2, g0 g0Var) {
        super(j1Var, true);
        this.y = str;
        this.z = str2;
        this.B = g0Var;
        this.A = j1Var;
    }
}
