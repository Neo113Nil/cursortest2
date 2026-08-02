package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ij, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2628Ij implements Yq {

    /* renamed from: a, reason: collision with root package name */
    public final List f26307a;

    public C2628Ij(List list) {
        this.f26307a = list;
    }

    @Override // com.google.android.gms.internal.ads.Yq
    public final void q() {
        for (P3.a aVar : this.f26307a) {
            C2889Yb c2889Yb = new C2889Yb(28);
            aVar.a(new LD(0, aVar, c2889Yb), GD.f25742n);
        }
    }

    public C2628Ij(AbstractC2577Fj abstractC2577Fj) {
        this.f26307a = Collections.singletonList(QC.c(abstractC2577Fj));
    }
}
