package com.instagram.common.viewpoint.core;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.kw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2103kw implements LU<File> {
    @Override // com.instagram.common.viewpoint.core.LU
    public final LT<File> A3x(File file, InterfaceC1079Lm interfaceC1079Lm) {
        if (file.exists()) {
            return new LT<>(true, file);
        }
        return new LT<>(false, null);
    }

    @Override // com.instagram.common.viewpoint.core.LU
    public final void A5D(File file, InterfaceC1079Lm interfaceC1079Lm) {
    }
}
