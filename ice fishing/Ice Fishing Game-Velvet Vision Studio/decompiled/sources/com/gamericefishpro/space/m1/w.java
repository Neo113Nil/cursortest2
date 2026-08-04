package com.gamericefishpro.space.m1;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.d5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ u e;
    public final /* synthetic */ u i;
    public final /* synthetic */ int v;
    public final /* synthetic */ com.gamericefishpro.space.f3.f w;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(u uVar, u uVar2, Object obj, int i, com.gamericefishpro.space.f3.f fVar, int i2) {
        super(1);
        this.d = i2;
        this.e = uVar;
        this.i = uVar2;
        this.y = obj;
        this.v = i;
        this.w = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.f2.e eVar = (com.gamericefishpro.space.f2.e) obj;
                u uVar = this.i;
                if (this.e != ((k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVar)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zI = com.gamericefishpro.space.i.a.I(uVar, (u) this.y, this.v, this.w);
                Boolean boolValueOf = Boolean.valueOf(zI);
                if (zI || !eVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                com.gamericefishpro.space.f2.e eVar2 = (com.gamericefishpro.space.f2.e) obj;
                u uVar2 = this.i;
                if (this.e != ((k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVar2)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean zU = d5.U(this.v, this.w, uVar2, (com.gamericefishpro.space.n1.c) this.y);
                Boolean boolValueOf2 = Boolean.valueOf(zU);
                if (zU || !eVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
