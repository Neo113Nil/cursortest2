package com.gamericefishpro.space.h0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Intrinsics.d(((d1) obj2).a, ((d1) obj).a);
            case 1:
                return Intrinsics.d(((e0) obj).getIndex(), ((e0) obj2).getIndex());
            case 2:
                com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) obj;
                com.gamericefishpro.space.h2.f0 f0Var2 = (com.gamericefishpro.space.h2.f0) obj2;
                float f = f0Var.a0.p.W;
                float f2 = f0Var2.a0.p.W;
                return f == f2 ? Intrinsics.d(f0Var.w(), f0Var2.w()) : Float.compare(f, f2);
            case 3:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.e).intValue() - ((Number) pair.d).intValue()) - (((Number) pair2.e).intValue() - ((Number) pair2.d).intValue());
            case 4:
                return Intrinsics.d(((com.gamericefishpro.space.t0.m0) obj).b, ((com.gamericefishpro.space.t0.m0) obj2).b);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
        }
    }
}
