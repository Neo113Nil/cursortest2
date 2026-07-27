package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* renamed from: com.google.android.gms.internal.consent_sdk.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4312e implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35665n;

    /* renamed from: u, reason: collision with root package name */
    public final C4386w2 f35666u;

    public /* synthetic */ C4312e(C4386w2 c4386w2, int i) {
        this.f35665n = i;
        this.f35666u = c4386w2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public final Object f() {
        switch (this.f35665n) {
            case 0:
                return new C4308d((Application) this.f35666u.f35781u);
            case 1:
                return new C4320g((Application) this.f35666u.f35781u);
            case 2:
                return new r((Application) this.f35666u.f35781u);
            default:
                return new C4383w((Application) this.f35666u.f35781u);
        }
    }
}
