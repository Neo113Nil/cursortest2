package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class AN implements InterfaceC4063vN {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23864c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f23865a;

    /* renamed from: b, reason: collision with root package name */
    public final List f23866b;

    static {
        C4117wN.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ AN(List list, List list2) {
        this.f23865a = list;
        this.f23866b = list2;
    }

    public static C4164xG a(int i, int i4) {
        return new C4164xG(i, i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set d() {
        List list = this.f23865a;
        int size = list.size();
        List list2 = this.f23866b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((InterfaceC4279zN) list2.get(i)).d();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Object d2 = ((InterfaceC4279zN) list.get(i4)).d();
            d2.getClass();
            hashSet.add(d2);
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
