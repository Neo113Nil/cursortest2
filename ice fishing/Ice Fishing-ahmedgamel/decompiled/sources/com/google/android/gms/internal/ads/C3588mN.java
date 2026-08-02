package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.mN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3588mN implements InterfaceC3320hN {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f32724c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f32725a;

    /* renamed from: b, reason: collision with root package name */
    public final List f32726b;

    static {
        C3374iN.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ C3588mN(List list, List list2) {
        this.f32725a = list;
        this.f32726b = list2;
    }

    public static S0.s a(int i, int i4) {
        return new S0.s(i, i4, 25, (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set f() {
        List list = this.f32725a;
        int size = list.size();
        List list2 = this.f32726b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((InterfaceC3534lN) list2.get(i)).f();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Object f2 = ((InterfaceC3534lN) list.get(i4)).f();
            f2.getClass();
            hashSet.add(f2);
        }
        int size4 = arrayList.size();
        for (int i6 = 0; i6 < size4; i6++) {
            for (Object obj : (Collection) arrayList.get(i6)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
