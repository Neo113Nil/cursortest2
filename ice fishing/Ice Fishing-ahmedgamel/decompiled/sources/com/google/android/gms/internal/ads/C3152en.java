package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.en, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3152en implements InterfaceC3927t8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29973n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4061vh f29974u;

    public /* synthetic */ C3152en(InterfaceC4061vh interfaceC4061vh, int i) {
        this.f29973n = i;
        this.f29974u = interfaceC4061vh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927t8
    public final /* synthetic */ void f(C3873s8 c3873s8) {
        switch (this.f29973n) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != c3873s8.f33899j ? "0" : "1");
                this.f29974u.d("onAdVisibilityChanged", hashMap);
                break;
            case 1:
                Rect rect = c3873s8.f33894d;
                this.f29974u.g0().h(rect.left, rect.top);
                break;
            default:
                Rect rect2 = c3873s8.f33894d;
                this.f29974u.g0().h(rect2.left, rect2.top);
                break;
        }
    }
}
