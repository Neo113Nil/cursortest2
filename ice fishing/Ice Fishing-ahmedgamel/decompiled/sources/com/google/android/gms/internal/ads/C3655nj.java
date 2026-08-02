package com.google.android.gms.internal.ads;

import v2.BinderC5100d;

/* renamed from: com.google.android.gms.internal.ads.nj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3655nj implements InterfaceC3227fl {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33547n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f33548u;

    public /* synthetic */ C3655nj(int i, Object obj) {
        this.f33547n = i;
        this.f33548u = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3227fl
    public final /* synthetic */ void t() {
        BinderC5100d y02;
        switch (this.f33547n) {
            case 0:
                ((C2898Yk) this.f33548u).F();
                break;
            default:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f33548u;
                if (interfaceC4084vh != null && (y02 = interfaceC4084vh.y0()) != null) {
                    y02.t();
                    break;
                }
                break;
        }
    }
}
