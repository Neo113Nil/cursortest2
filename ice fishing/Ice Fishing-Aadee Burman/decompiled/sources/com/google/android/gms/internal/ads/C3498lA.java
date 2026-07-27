package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.lA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3498lA {

    /* renamed from: a, reason: collision with root package name */
    public final Set f31741a;

    /* renamed from: b, reason: collision with root package name */
    public final C3714pA f31742b;

    public C3498lA(C3714pA c3714pA, Set set) {
        this.f31741a = set;
        this.f31742b = c3714pA;
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f31741a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3552mA) it.next()).b(hashMap);
        }
        return hashMap;
    }

    public final HashMap b(Context context, View view) {
        HashMap hashMap = new HashMap();
        Iterator it = this.f31741a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3552mA) it.next()).d(hashMap, context, view);
        }
        return hashMap;
    }

    public final HashMap c() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f31741a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3552mA) it.next()).a(hashMap);
        }
        return hashMap;
    }
}
