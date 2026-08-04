package com.gamericefishpro.space.i9;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends g1 {
    public final /* synthetic */ Bundle A;
    public final /* synthetic */ j1 B;
    public final /* synthetic */ int w;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(j1 j1Var, String str, String str2, Bundle bundle, int i) {
        super(j1Var, true);
        this.w = i;
        switch (i) {
            case 1:
                this.y = str;
                this.z = str2;
                this.A = bundle;
                Objects.requireNonNull(j1Var);
                this.B = j1Var;
                super(j1Var, true);
                break;
            default:
                this.y = str;
                this.z = str2;
                this.A = bundle;
                this.B = j1Var;
                break;
        }
    }

    @Override // com.gamericefishpro.space.i9.g1
    public final void a() {
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j0 j0Var = this.B.e;
                com.gamericefishpro.space.v8.c0.g(j0Var);
                j0Var.clearConditionalUserProperty(this.y, this.z, this.A);
                break;
            default:
                long j = this.d;
                j0 j0Var2 = this.B.e;
                com.gamericefishpro.space.v8.c0.g(j0Var2);
                j0Var2.logEvent(this.y, this.z, this.A, true, true, j);
                break;
        }
    }
}
