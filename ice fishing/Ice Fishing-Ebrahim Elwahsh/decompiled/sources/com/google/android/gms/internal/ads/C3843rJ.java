package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.rJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3843rJ implements AG {

    /* renamed from: a, reason: collision with root package name */
    public static final C3843rJ f34007a = new C3843rJ();

    /* renamed from: b, reason: collision with root package name */
    public static final C4002uG f34008b = new C4002uG(C3085dG.class, InterfaceC4054vE.class, DF.f24402V);

    @Override // com.google.android.gms.internal.ads.AG
    public final Class a() {
        return InterfaceC4054vE.class;
    }

    @Override // com.google.android.gms.internal.ads.AG
    public final Object b(C2593Hm c2593Hm, C4164xG c4164xG) {
        if (((HashMap) c2593Hm.f25416u).get(AbstractC3194fG.class) != null) {
            throw new ClassCastException();
        }
        c2593Hm.p();
        return new OJ();
    }

    @Override // com.google.android.gms.internal.ads.AG
    public final Class d() {
        return InterfaceC4054vE.class;
    }
}
