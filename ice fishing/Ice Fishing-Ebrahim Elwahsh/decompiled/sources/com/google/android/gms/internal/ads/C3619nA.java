package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.nA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3619nA {

    /* renamed from: a, reason: collision with root package name */
    public final Set f32839a;

    /* renamed from: b, reason: collision with root package name */
    public final C3888sA f32840b;

    public C3619nA(C3888sA c3888sA, Set set) {
        this.f32839a = set;
        this.f32840b = c3888sA;
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f32839a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3673oA) it.next()).c(hashMap);
        }
        return hashMap;
    }

    public final HashMap b(Context context, View view) {
        HashMap hashMap = new HashMap();
        Iterator it = this.f32839a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3673oA) it.next()).d(hashMap, context, view);
        }
        return hashMap;
    }

    public final HashMap c() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f32839a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3673oA) it.next()).b(hashMap);
        }
        return hashMap;
    }
}
