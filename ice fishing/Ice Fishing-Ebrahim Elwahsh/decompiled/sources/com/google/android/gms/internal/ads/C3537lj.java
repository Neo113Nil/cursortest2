package com.google.android.gms.internal.ads;

import s2.BinderC4996d;

/* renamed from: com.google.android.gms.internal.ads.lj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3537lj implements InterfaceC3108dl {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32580n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f32581u;

    public /* synthetic */ C3537lj(int i, Object obj) {
        this.f32580n = i;
        this.f32581u = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3108dl
    public final /* synthetic */ void a() {
        BinderC4996d w02;
        switch (this.f32580n) {
            case 0:
                ((C2863Xk) this.f32581u).x();
                break;
            default:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f32581u;
                if (interfaceC3858rh != null && (w02 = interfaceC3858rh.w0()) != null) {
                    w02.z();
                    break;
                }
                break;
        }
    }
}
