package com.gamericefishpro.space.n9;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements Runnable {
    public final /* synthetic */ t2 A;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long i;
    public final /* synthetic */ Bundle v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public m2(t2 t2Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.d = str;
        this.e = str2;
        this.i = j;
        this.v = bundle;
        this.w = z;
        this.y = z2;
        this.z = z3;
        this.A = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.A(this.d, this.e, this.i, this.v, this.w, this.y, this.z);
    }
}
