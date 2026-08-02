package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* renamed from: com.google.android.gms.internal.consent_sdk.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4335e implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36434n;

    /* renamed from: u, reason: collision with root package name */
    public final C4409w2 f36435u;

    public /* synthetic */ C4335e(C4409w2 c4409w2, int i) {
        this.f36434n = i;
        this.f36435u = c4409w2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public final Object f() {
        switch (this.f36434n) {
            case 0:
                return new C4331d((Application) this.f36435u.f36550u);
            case 1:
                return new C4343g((Application) this.f36435u.f36550u);
            case 2:
                return new r((Application) this.f36435u.f36550u);
            default:
                return new C4406w((Application) this.f36435u.f36550u);
        }
    }
}
