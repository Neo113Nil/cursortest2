package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class zzcq extends zzcs implements Serializable {
    public static final zzcq zza = new zzcq(0);
    public static final zzcq zza$1 = new zzcq(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzcq(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs zza() {
        switch (this.$r8$classId) {
            case 0:
                return zza$1;
            default:
                return zza;
        }
    }
}
