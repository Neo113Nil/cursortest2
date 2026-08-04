package com.gamericefishpro.space.h2;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements Comparator {
    public static final l1 b = new l1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ l1(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                int iD = Intrinsics.d(f0Var2.J, f0Var.J);
                return iD != 0 ? iD : Intrinsics.d(f0Var.hashCode(), f0Var2.hashCode());
            default:
                f0 f0Var3 = (f0) obj;
                f0 f0Var4 = (f0) obj2;
                int iD2 = Intrinsics.d(f0Var3.J, f0Var4.J);
                return iD2 != 0 ? iD2 : Intrinsics.d(f0Var3.hashCode(), f0Var4.hashCode());
        }
    }
}
