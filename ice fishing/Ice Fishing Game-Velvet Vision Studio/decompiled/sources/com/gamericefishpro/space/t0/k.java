package com.gamericefishpro.space.t0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.gamericefishpro.space.vh.h implements Function2 {
    public int e;
    public int i;
    public int v;
    public int w;
    public /* synthetic */ Object y;
    public final /* synthetic */ l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.z = lVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        k kVar = new k(this.z, aVar);
        kVar.y = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((com.gamericefishpro.space.li.g) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.li.g gVar;
        int i;
        int i2;
        int i3;
        String strG;
        int i4;
        int i5;
        String str;
        l lVar = this.z;
        com.gamericefishpro.space.t.d0 d0Var = lVar.d;
        com.gamericefishpro.space.t.v vVar = lVar.i;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i6 = this.w;
        if (i6 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            gVar = (com.gamericefishpro.space.li.g) this.y;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.v;
            i2 = this.i;
            i3 = this.e;
            gVar = (com.gamericefishpro.space.li.g) this.y;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        if (i3 >= Math.min(lVar.v + 10, vVar.b)) {
            return Unit.a;
        }
        int i7 = i3 + 1;
        int iB = vVar.b(i3);
        switch (iB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                strG = "up";
                break;
            case 1:
                Object objF = d0Var.f(i2);
                i2++;
                strG = "down " + objF;
                break;
            case 2:
                strG = "remove " + vVar.b(i7) + ' ' + vVar.b(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strG = "move " + vVar.b(i7) + ' ' + vVar.b(i3 + 2) + ' ' + vVar.b(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strG = "clear";
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                i4 = i3 + 2;
                int iB2 = vVar.b(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iB2 + ' ' + d0Var.f(i2);
                int i8 = i4;
                strG = str;
                i7 = i8;
                i2 = i5;
                break;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = i3 + 2;
                int iB3 = vVar.b(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iB3 + ' ' + d0Var.f(i2);
                int i9 = i4;
                strG = str;
                i7 = i9;
                i2 = i5;
                break;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Object objF2 = d0Var.f(i2);
                Intrinsics.c(objF2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                com.gamericefishpro.space.ei.e0.c(2, objF2);
                i2 += 2;
                strG = "apply " + ((Function2) objF2);
                break;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                strG = "reuse " + lVar.e.f(i);
                i++;
                break;
            case 9:
                strG = "recompose pending";
                break;
            default:
                strG = com.gamericefishpro.space.m5.a.g(iB, "unknown op: ");
                break;
        }
        this.y = gVar;
        this.e = i7;
        this.i = i2;
        this.v = i;
        this.w = 1;
        gVar.a(i3 + ": " + strG, this);
        return aVar;
    }
}
