package com.gamericefishpro.space.f2;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ h0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ m0 e;

    public /* synthetic */ c0(m0 m0Var, h0 h0Var, int i, m0 m0Var2, int i2) {
        this.a = i2;
        this.c = h0Var;
        this.d = i;
        this.e = m0Var2;
        this.b = m0Var;
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final Map a() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.b.a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[LOOP:0: B:11:0x0035->B:32:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[SYNTHETIC] */
    @Override // com.gamericefishpro.space.f2.m0
    public final void b() {
        int i;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.d;
                h0 h0Var = this.c;
                h0Var.w = i2;
                this.e.b();
                com.gamericefishpro.space.v0.e eVar = h0Var.F;
                com.gamericefishpro.space.t.h0 h0Var2 = h0Var.E;
                long[] jArr = h0Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    Object obj = h0Var2.b[i7];
                                    e1 e1Var = (e1) h0Var2.c[i7];
                                    int i8 = eVar.i(obj);
                                    i = i4;
                                    if (i8 < 0 || i8 >= h0Var.w) {
                                        if (i8 >= 0) {
                                            Object[] objArr = eVar.d;
                                            Object obj2 = objArr[i8];
                                            objArr[i8] = x.b;
                                        }
                                        if (h0Var.C.b(obj)) {
                                            e1Var.a();
                                        }
                                        h0Var2.l(i7);
                                    }
                                } else {
                                    i = i4;
                                }
                                j >>= i;
                                i6++;
                                i4 = i;
                            }
                            if (i5 == i4) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        } else if (i3 != length) {
                            i3++;
                        }
                    }
                }
                h0Var.g(h0Var.v);
                break;
            default:
                int i9 = this.d;
                h0 h0Var3 = this.c;
                h0Var3.v = i9;
                this.e.b();
                if (h0Var3.d.B == null) {
                    h0Var3.g(h0Var3.v);
                }
                break;
        }
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final int c() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.b.c();
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final Function1 d() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.b.d();
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final int e() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.b.e();
    }
}
