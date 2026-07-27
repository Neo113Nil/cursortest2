package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Lk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2659Lk extends AbstractC2982bM implements InterfaceC2769Sb {

    /* renamed from: v, reason: collision with root package name */
    public final Bundle f26200v;

    public C2659Lk(Set set) {
        super(set);
        this.f26200v = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2769Sb
    public final synchronized void o(String str, Bundle bundle) {
        this.f26200v.putAll(bundle);
        u1(C2943ak.f29275E);
    }
}
