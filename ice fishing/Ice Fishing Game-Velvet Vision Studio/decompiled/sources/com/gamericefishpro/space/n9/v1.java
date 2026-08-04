package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String i;
    public final /* synthetic */ String v;
    public final /* synthetic */ y1 w;

    public /* synthetic */ v1(y1 y1Var, String str, String str2, String str3, int i) {
        this.d = i;
        this.e = str;
        this.i = str2;
        this.v = str3;
        this.w = y1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y1 y1Var = this.w;
                y1Var.d.B();
                m mVar = y1Var.d.i;
                m4.T(mVar);
                return mVar.n0(this.e, this.i, this.v);
            case 1:
                y1 y1Var2 = this.w;
                y1Var2.d.B();
                m mVar2 = y1Var2.d.i;
                m4.T(mVar2);
                return mVar2.n0(this.e, this.i, this.v);
            case 2:
                y1 y1Var3 = this.w;
                y1Var3.d.B();
                m mVar3 = y1Var3.d.i;
                m4.T(mVar3);
                return mVar3.r0(this.e, this.i, this.v);
            default:
                y1 y1Var4 = this.w;
                y1Var4.d.B();
                m mVar4 = y1Var4.d.i;
                m4.T(mVar4);
                return mVar4.r0(this.e, this.i, this.v);
        }
    }
}
