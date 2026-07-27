package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.mN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3565mN implements InterfaceC3297hN {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31944c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f31945a;

    /* renamed from: b, reason: collision with root package name */
    public final List f31946b;

    static {
        C3351iN.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ C3565mN(List list, List list2) {
        this.f31945a = list;
        this.f31946b = list2;
    }

    public static S0.s a(int i, int i6) {
        return new S0.s(i, i6, 23, (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set f() {
        List list = this.f31945a;
        int size = list.size();
        List list2 = this.f31946b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((InterfaceC3511lN) list2.get(i)).f();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i6 = 0; i6 < size3; i6++) {
            Object f3 = ((InterfaceC3511lN) list.get(i6)).f();
            f3.getClass();
            hashSet.add(f3);
        }
        int size4 = arrayList.size();
        for (int i9 = 0; i9 < size4; i9++) {
            for (Object obj : (Collection) arrayList.get(i9)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
