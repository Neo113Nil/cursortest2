package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2124lb implements InterfaceC1004Jj {
    public static String[] A01 = {"5dk9XJP2wGzKf", "t9Sqq8YLjeTrFPP9jF9lF", "ZSSLQReFK2RnB4Tl20", "6LiPtiUXCvNXZPkDmbiLO", "ML1syn76y5DaiFADQPhnbgz9k8Qidn9e", "l6QdmjZcy6MGH", "", "GeXYkzAGCbUHzEIcx9bq6WN7r3"};
    public static final C2124lb A02 = new C2124lb();
    public final List<C2350pT> A00;

    public C2124lb() {
        this.A00 = Collections.emptyList();
    }

    public C2124lb(C2350pT c2350pT) {
        this.A00 = Collections.singletonList(c2350pT);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final List<C2350pT> A7X(long j6) {
        return j6 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final long A83(int i) {
        AbstractC06243y.A07(i == 0);
        if (A01[5].length() != 13) {
            throw new RuntimeException();
        }
        A01[7] = "BSEyCnkUJKVAglTMpAGc69o360";
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1004Jj
    public final int A8a(long j6) {
        return j6 < 0 ? 0 : -1;
    }
}
