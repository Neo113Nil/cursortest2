package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Nk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2714Nk extends OK implements InterfaceC2857Wb {

    /* renamed from: v, reason: collision with root package name */
    public final Bundle f27304v;

    public C2714Nk(Set set) {
        super(set);
        this.f27304v = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2857Wb
    public final synchronized void o(String str, Bundle bundle) {
        this.f27304v.putAll(bundle);
        M1(C2958ak.f29868E);
    }
}
