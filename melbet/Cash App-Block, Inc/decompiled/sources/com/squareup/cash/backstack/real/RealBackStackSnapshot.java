package com.squareup.cash.backstack.real;

import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RealBackStackSnapshot {
    public final List backStackEntries;

    public RealBackStackSnapshot(List list) {
        list.getClass();
        this.backStackEntries = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RealBackStackSnapshot) && Intrinsics.areEqual(this.backStackEntries, ((RealBackStackSnapshot) obj).backStackEntries);
    }

    public final int hashCode() {
        return this.backStackEntries.hashCode();
    }

    public final ArrayList screens() {
        List list = this.backStackEntries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof BackStack$ScreenEntry) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((BackStack$ScreenEntry) it.next()).args);
        }
        return arrayList2;
    }

    public final String toString() {
        return this.backStackEntries.toString();
    }
}
