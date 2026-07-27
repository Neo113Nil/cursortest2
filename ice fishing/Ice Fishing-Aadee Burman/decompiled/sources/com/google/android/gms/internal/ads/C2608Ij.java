package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ij, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2608Ij implements Yq {

    /* renamed from: a, reason: collision with root package name */
    public final List f25558a;

    public C2608Ij(List list) {
        this.f25558a = list;
    }

    @Override // com.google.android.gms.internal.ads.Yq
    public final void q() {
        for (N3.a aVar : this.f25558a) {
            C2866Yb c2866Yb = new C2866Yb(28);
            aVar.a(new LD(0, aVar, c2866Yb), GD.f24952n);
        }
    }

    public C2608Ij(AbstractC2557Fj abstractC2557Fj) {
        this.f25558a = Collections.singletonList(QC.c(abstractC2557Fj));
    }
}
