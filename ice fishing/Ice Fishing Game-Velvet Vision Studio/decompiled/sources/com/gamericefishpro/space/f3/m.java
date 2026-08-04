package com.gamericefishpro.space.f3;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h2.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.gamericefishpro.space.ei.l implements Function2 {
    public static final m A;
    public static final m e;
    public static final m i;
    public static final m v;
    public static final m w;
    public static final m y;
    public static final m z;
    public final /* synthetic */ int d;

    static {
        int i2 = 2;
        e = new m(i2, 0);
        i = new m(i2, 1);
        v = new m(i2, 2);
        w = new m(i2, 3);
        y = new m(i2, 4);
        z = new m(i2, 5);
        A = new m(i2, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.e((f0) obj).setUpdateBlock((Function1) obj2);
                return Unit.a;
            case 1:
                k.e((f0) obj).setReleaseBlock((Function1) obj2);
                return Unit.a;
            case 2:
                k.e((f0) obj).setModifier((com.gamericefishpro.space.h1.m) obj2);
                return Unit.a;
            case 3:
                k.e((f0) obj).setDensity((com.gamericefishpro.space.c3.c) obj2);
                return Unit.a;
            case 4:
                k.e((f0) obj).setLifecycleOwner((com.gamericefishpro.space.z4.u) obj2);
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                k.e((f0) obj).setSavedStateRegistryOwner((com.gamericefishpro.space.z5.e) obj2);
                return Unit.a;
            default:
                z zVarE = k.e((f0) obj);
                int iOrdinal = ((com.gamericefishpro.space.c3.l) obj2).ordinal();
                if (iOrdinal != 0) {
                    i2 = 1;
                    if (iOrdinal != 1) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                } else {
                    i2 = 0;
                }
                zVarE.setLayoutDirection(i2);
                return Unit.a;
        }
    }
}
