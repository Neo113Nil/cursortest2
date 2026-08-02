package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0803Ar implements InterfaceC2476rY {
    public final List<InterfaceC2477rZ> A00 = new ArrayList();

    @Override // com.instagram.common.viewpoint.core.InterfaceC2476rY
    public final InterfaceC2477rZ A6i(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC2477rZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2476rY
    public final int size() {
        return this.A00.size();
    }
}
