package com.gamericefishpro.space.n2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.c3.j;
import com.gamericefishpro.space.ei.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements Function1 {
    public static final b e;
    public static final b i;
    public static final b v;
    public final /* synthetic */ int d;

    static {
        int i2 = 1;
        e = new b(i2, 0);
        i = new b(i2, 1);
        v = new b(i2, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj).longValue();
                return Unit.a;
            case 1:
                return Integer.valueOf(((i) obj).b);
            default:
                j jVar = ((i) obj).c;
                return Integer.valueOf(jVar.d - jVar.b);
        }
    }
}
