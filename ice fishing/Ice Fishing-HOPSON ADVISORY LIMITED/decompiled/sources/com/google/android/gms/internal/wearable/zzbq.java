package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzbq;
import com.google.android.gms.internal.wearable.zzbr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzbq<MessageType extends zzbr<MessageType, BuilderType>, BuilderType extends zzbq<MessageType, BuilderType>> implements zzek {
    private static void zza(List list, int i) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    protected static void zzp(Iterable iterable, List list) {
        iterable.getClass();
        if (!(iterable instanceof zzdx)) {
            if (iterable instanceof zzet) {
                list.addAll((Collection) iterable);
                return;
            }
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzev) {
                ((zzev) list).zze(list.size() + size);
            }
            int size2 = list.size();
            if (!(iterable instanceof RandomAccess)) {
                for (Object obj : iterable) {
                    if (obj == null) {
                        zza(list, size2);
                    }
                    list.add(obj);
                }
                return;
            }
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i = 0; i < size3; i++) {
                Object obj2 = list2.get(i);
                if (obj2 == null) {
                    zza(list, size2);
                }
                list.add(obj2);
            }
            return;
        }
        List zza = ((zzdx) iterable).zza();
        zzdx zzdxVar = (zzdx) list;
        int size4 = list.size();
        for (Object obj3 : zza) {
            if (obj3 == null) {
                int size5 = zzdxVar.size() - size4;
                StringBuilder sb = new StringBuilder(String.valueOf(size5).length() + 26);
                sb.append("Element at index ");
                sb.append(size5);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size6 = zzdxVar.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(sb2);
                    }
                    zzdxVar.remove(size6);
                }
            } else if (obj3 instanceof zzcg) {
                zzdxVar.zzb();
            } else if (obj3 instanceof byte[]) {
                byte[] bArr = (byte[]) obj3;
                zzcg.zzk(bArr, 0, bArr.length);
                zzdxVar.zzb();
            } else {
                zzdxVar.add((String) obj3);
            }
        }
    }

    @Override // 
    public abstract zzbq zzo();
}
