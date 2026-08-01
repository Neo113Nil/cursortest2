package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Nk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2694Nk extends OK implements InterfaceC2834Wb {

    /* renamed from: v, reason: collision with root package name */
    public final Bundle f26521v;

    public C2694Nk(Set set) {
        super(set);
        this.f26521v = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2834Wb
    public final synchronized void o(String str, Bundle bundle) {
        this.f26521v.putAll(bundle);
        M1(C2935ak.f29093E);
    }
}
