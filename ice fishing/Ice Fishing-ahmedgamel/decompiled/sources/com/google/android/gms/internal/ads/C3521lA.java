package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.lA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3521lA {

    /* renamed from: a, reason: collision with root package name */
    public final Set f32521a;

    /* renamed from: b, reason: collision with root package name */
    public final C3737pA f32522b;

    public C3521lA(C3737pA c3737pA, Set set) {
        this.f32521a = set;
        this.f32522b = c3737pA;
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f32521a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3575mA) it.next()).b(hashMap);
        }
        return hashMap;
    }

    public final HashMap b(Context context, View view) {
        HashMap hashMap = new HashMap();
        Iterator it = this.f32521a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3575mA) it.next()).d(hashMap, context, view);
        }
        return hashMap;
    }

    public final HashMap c() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f32521a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3575mA) it.next()).a(hashMap);
        }
        return hashMap;
    }
}
