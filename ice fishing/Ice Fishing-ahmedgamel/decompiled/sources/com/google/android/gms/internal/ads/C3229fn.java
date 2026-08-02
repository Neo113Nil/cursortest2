package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.fn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3229fn implements InterfaceC3950t8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31213n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4084vh f31214u;

    public /* synthetic */ C3229fn(InterfaceC4084vh interfaceC4084vh, int i) {
        this.f31213n = i;
        this.f31214u = interfaceC4084vh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950t8
    public final /* synthetic */ void f(C3896s8 c3896s8) {
        switch (this.f31213n) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != c3896s8.f34667j ? "0" : "1");
                this.f31214u.d("onAdVisibilityChanged", hashMap);
                break;
            case 1:
                Rect rect = c3896s8.f34662d;
                this.f31214u.h0().h(rect.left, rect.top);
                break;
            default:
                Rect rect2 = c3896s8.f34662d;
                this.f31214u.h0().h(rect2.left, rect2.top);
                break;
        }
    }
}
