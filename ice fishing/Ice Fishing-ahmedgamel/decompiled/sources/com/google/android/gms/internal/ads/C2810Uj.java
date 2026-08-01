package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import q2.InterfaceC4870a;

/* renamed from: com.google.android.gms.internal.ads.Uj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2810Uj implements InterfaceC4870a {

    /* renamed from: n, reason: collision with root package name */
    public final C2858Xj f27970n;

    /* renamed from: u, reason: collision with root package name */
    public final C3052cu f27971u;

    public C2810Uj(C2858Xj c2858Xj, C3052cu c3052cu) {
        this.f27970n = c2858Xj;
        this.f27971u = c3052cu;
    }

    @Override // q2.InterfaceC4870a
    public final void onAdClicked() {
        C3052cu c3052cu = this.f27971u;
        C2858Xj c2858Xj = this.f27970n;
        String str = c3052cu.f29626g;
        synchronized (c2858Xj.f28555a) {
            try {
                ConcurrentHashMap concurrentHashMap = c2858Xj.f28556b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
