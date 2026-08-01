package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2436r9 {
    public final InterfaceC2440rD A00;
    public final String A01;
    public final Collection<C2449rN> A02;
    public final Collection<C2449rN> A03;
    public final List<Rect> A04;

    public C2436r9(String str, InterfaceC2440rD interfaceC2440rD, List<Rect> rects, Collection<C2449rN> collection, Collection<C2449rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2440rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
