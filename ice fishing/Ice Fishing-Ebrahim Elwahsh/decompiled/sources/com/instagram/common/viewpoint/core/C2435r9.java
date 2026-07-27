package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2435r9 {
    public final InterfaceC2439rD A00;
    public final String A01;
    public final Collection<C2448rN> A02;
    public final Collection<C2448rN> A03;
    public final List<Rect> A04;

    public C2435r9(String str, InterfaceC2439rD interfaceC2439rD, List<Rect> rects, Collection<C2448rN> collection, Collection<C2448rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2439rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
