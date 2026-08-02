package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzbon implements zzboh {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final List zza;
    public final List zzb;

    static {
        zzfz.zza(Collections.EMPTY_SET);
    }

    public /* synthetic */ zzbon(List list, List list2) {
        this.zza = list;
        this.zzb = list2;
    }

    @Override // com.google.android.libraries.places.internal.zzcli
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzbok) list2.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object zzb = ((zzbok) list.get(i2)).zzb();
            zzb.getClass();
            hashSet.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
