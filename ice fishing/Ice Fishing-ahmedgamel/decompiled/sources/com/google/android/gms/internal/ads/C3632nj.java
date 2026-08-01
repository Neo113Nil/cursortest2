package com.google.android.gms.internal.ads;

import t2.BinderC5036d;

/* renamed from: com.google.android.gms.internal.ads.nj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3632nj implements InterfaceC3204fl {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32760n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f32761u;

    public /* synthetic */ C3632nj(int i, Object obj) {
        this.f32760n = i;
        this.f32761u = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204fl
    public final /* synthetic */ void t() {
        BinderC5036d z02;
        switch (this.f32760n) {
            case 0:
                ((C2875Yk) this.f32761u).F();
                break;
            default:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f32761u;
                if (interfaceC4061vh != null && (z02 = interfaceC4061vh.z0()) != null) {
                    z02.t();
                    break;
                }
                break;
        }
    }
}
