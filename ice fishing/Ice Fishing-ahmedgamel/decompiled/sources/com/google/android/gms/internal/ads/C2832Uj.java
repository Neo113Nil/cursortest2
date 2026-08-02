package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import s2.InterfaceC4919a;

/* renamed from: com.google.android.gms.internal.ads.Uj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2832Uj implements InterfaceC4919a {

    /* renamed from: n, reason: collision with root package name */
    public final C2881Xj f28768n;

    /* renamed from: u, reason: collision with root package name */
    public final C3075cu f28769u;

    public C2832Uj(C2881Xj c2881Xj, C3075cu c3075cu) {
        this.f28768n = c2881Xj;
        this.f28769u = c3075cu;
    }

    @Override // s2.InterfaceC4919a
    public final void onAdClicked() {
        C3075cu c3075cu = this.f28769u;
        C2881Xj c2881Xj = this.f28768n;
        String str = c3075cu.f30396g;
        synchronized (c2881Xj.f29327a) {
            try {
                ConcurrentHashMap concurrentHashMap = c2881Xj.f29328b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
