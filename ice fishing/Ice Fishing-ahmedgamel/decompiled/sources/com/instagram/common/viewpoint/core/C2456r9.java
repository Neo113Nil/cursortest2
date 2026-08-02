package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2456r9 {
    public final InterfaceC2460rD A00;
    public final String A01;
    public final Collection<C2469rN> A02;
    public final Collection<C2469rN> A03;
    public final List<Rect> A04;

    public C2456r9(String str, InterfaceC2460rD interfaceC2460rD, List<Rect> rects, Collection<C2469rN> collection, Collection<C2469rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2460rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
