package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.pA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3737pA implements InterfaceC3575mA {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f33824a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final synchronized void d(HashMap hashMap, Context context, View view) {
        ArrayList arrayList = this.f33824a;
        hashMap.put(com.anythink.expressad.foundation.d.d.f19344E, new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void a(HashMap hashMap) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mA
    public final void b(HashMap hashMap) {
    }
}
