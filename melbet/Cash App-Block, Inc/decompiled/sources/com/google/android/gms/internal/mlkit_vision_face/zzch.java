package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.internal.mlkit_vision_barcode.zzdm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdo;
import com.google.android.gms.internal.mlkit_vision_common.zzw;
import com.google.android.gms.internal.mlkit_vision_common.zzx;
import com.google.android.gms.internal.mlkit_vision_common.zzy;
import com.google.android.gms.internal.mlkit_vision_text_common.zzci;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzch implements Map, Serializable {
    public final /* synthetic */ int $r8$classId;
    public transient AbstractCollection zza;
    public final transient Object[] zzb;
    public transient AbstractCollection zzb$1;
    public transient AbstractCollection zzc;

    public /* synthetic */ zzch(int i, Object[] objArr) {
        this.$r8$classId = i;
        this.zzb = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if (get(obj) != null) {
                }
                break;
            case 1:
                if (get(obj) != null) {
                }
                break;
            case 2:
                if (get(obj) != null) {
                }
                break;
            default:
                if (get(obj) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.$r8$classId;
        Object[] objArr = this.zzb;
        switch (i) {
            case 0:
                zzcg zzcgVar = (zzcg) this.zzc;
                if (zzcgVar == null) {
                    zzcgVar = new zzcg(1, this.zzb);
                    this.zzc = zzcgVar;
                }
                return zzcgVar.contains(obj);
            case 1:
                zzdo zzdoVar = (zzdo) this.zzc;
                if (zzdoVar == null) {
                    zzdoVar = new zzdo(1, objArr);
                    this.zzc = zzdoVar;
                }
                return zzdoVar.contains(obj);
            case 2:
                zzy zzyVar = (zzy) this.zzc;
                if (zzyVar == null) {
                    zzyVar = new zzy(1, this.zzb);
                    this.zzc = zzyVar;
                }
                return zzyVar.contains(obj);
            default:
                zzci zzciVar = (zzci) this.zzc;
                if (zzciVar == null) {
                    zzciVar = new zzci(1, objArr);
                    this.zzc = zzciVar;
                }
                return zzciVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        int i = this.$r8$classId;
        Object[] objArr = this.zzb;
        switch (i) {
            case 0:
                zzce zzceVar = (zzce) this.zza;
                if (zzceVar != null) {
                    return zzceVar;
                }
                zzce zzceVar2 = new zzce(this, this.zzb);
                this.zza = zzceVar2;
                return zzceVar2;
            case 1:
                zzdm zzdmVar = (zzdm) this.zza;
                if (zzdmVar != null) {
                    return zzdmVar;
                }
                zzdm zzdmVar2 = new zzdm(this, objArr);
                this.zza = zzdmVar2;
                return zzdmVar2;
            case 2:
                zzw zzwVar = (zzw) this.zza;
                if (zzwVar != null) {
                    return zzwVar;
                }
                zzw zzwVar2 = new zzw(this, this.zzb);
                this.zza = zzwVar2;
                return zzwVar2;
            default:
                com.google.android.gms.internal.mlkit_vision_text_common.zzcg zzcgVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzcg) this.zza;
                if (zzcgVar != null) {
                    return zzcgVar;
                }
                com.google.android.gms.internal.mlkit_vision_text_common.zzcg zzcgVar2 = new com.google.android.gms.internal.mlkit_vision_text_common.zzcg(this, objArr);
                this.zza = zzcgVar2;
                return zzcgVar2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 2:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i = this.$r8$classId;
        Object[] objArr = this.zzb;
        switch (i) {
            case 0:
                if (obj != null) {
                    Object obj6 = objArr[0];
                    obj6.getClass();
                    if (obj6.equals(obj)) {
                        obj2 = objArr[1];
                        obj2.getClass();
                        if (obj2 != null) {
                            return null;
                        }
                        return obj2;
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                }
            case 1:
                if (obj != null) {
                    Object obj7 = objArr[0];
                    Objects.requireNonNull(obj7);
                    if (obj7.equals(obj)) {
                        obj3 = objArr[1];
                        Objects.requireNonNull(obj3);
                        if (obj3 != null) {
                            return null;
                        }
                        return obj3;
                    }
                }
                obj3 = null;
                if (obj3 != null) {
                }
            case 2:
                if (obj != null) {
                    Object obj8 = objArr[0];
                    obj8.getClass();
                    if (obj8.equals(obj)) {
                        obj4 = objArr[1];
                        obj4.getClass();
                        if (obj4 != null) {
                            return null;
                        }
                        return obj4;
                    }
                }
                obj4 = null;
                if (obj4 != null) {
                }
            default:
                if (obj != null) {
                    Object obj9 = objArr[0];
                    Objects.requireNonNull(obj9);
                    if (obj9.equals(obj)) {
                        obj5 = objArr[1];
                        Objects.requireNonNull(obj5);
                        if (obj5 != null) {
                            return null;
                        }
                        return obj5;
                    }
                }
                obj5 = null;
                if (obj5 != null) {
                }
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            case 1:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
            case 2:
                Object obj5 = get(obj);
                return obj5 != null ? obj5 : obj2;
            default:
                Object obj6 = get(obj);
                return obj6 != null ? obj6 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = this.$r8$classId;
        Object[] objArr = this.zzb;
        switch (i) {
            case 0:
                zzce zzceVar = (zzce) this.zza;
                if (zzceVar == null) {
                    zzceVar = new zzce(this, this.zzb);
                    this.zza = zzceVar;
                }
                Iterator it = zzceVar.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i2 += next != null ? next.hashCode() : 0;
                }
                return i2;
            case 1:
                zzdm zzdmVar = (zzdm) this.zza;
                if (zzdmVar == null) {
                    zzdmVar = new zzdm(this, objArr);
                    this.zza = zzdmVar;
                }
                return CustomizeUtils.zza(zzdmVar);
            case 2:
                zzw zzwVar = (zzw) this.zza;
                if (zzwVar == null) {
                    zzwVar = new zzw(this, this.zzb);
                    this.zza = zzwVar;
                }
                Iterator it2 = zzwVar.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    i3 += next2 != null ? next2.hashCode() : 0;
                }
                return i3;
            default:
                com.google.android.gms.internal.mlkit_vision_text_common.zzcg zzcgVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzcg) this.zza;
                if (zzcgVar == null) {
                    zzcgVar = new com.google.android.gms.internal.mlkit_vision_text_common.zzcg(this, objArr);
                    this.zza = zzcgVar;
                }
                Iterator it3 = zzcgVar.iterator();
                int i4 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    i4 += next3 != null ? next3.hashCode() : 0;
                }
                return i4;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        int i = this.$r8$classId;
        Object[] objArr = this.zzb;
        switch (i) {
            case 0:
                zzcf zzcfVar = (zzcf) this.zzb$1;
                if (zzcfVar != null) {
                    return zzcfVar;
                }
                zzcf zzcfVar2 = new zzcf(this, new zzcg(0, this.zzb));
                this.zzb$1 = zzcfVar2;
                return zzcfVar2;
            case 1:
                com.google.android.gms.internal.mlkit_vision_barcode.zzdn zzdnVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzdn) this.zzb$1;
                if (zzdnVar != null) {
                    return zzdnVar;
                }
                com.google.android.gms.internal.mlkit_vision_barcode.zzdn zzdnVar2 = new com.google.android.gms.internal.mlkit_vision_barcode.zzdn(this, new zzdo(0, objArr));
                this.zzb$1 = zzdnVar2;
                return zzdnVar2;
            case 2:
                zzx zzxVar = (zzx) this.zzb$1;
                if (zzxVar != null) {
                    return zzxVar;
                }
                zzx zzxVar2 = new zzx(this, new zzy(0, this.zzb));
                this.zzb$1 = zzxVar2;
                return zzxVar2;
            default:
                com.google.android.gms.internal.mlkit_vision_text_common.zzch zzchVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzch) this.zzb$1;
                if (zzchVar != null) {
                    return zzchVar;
                }
                com.google.android.gms.internal.mlkit_vision_text_common.zzch zzchVar2 = new com.google.android.gms.internal.mlkit_vision_text_common.zzch(this, new zzci(0, objArr));
                this.zzb$1 = zzchVar2;
                return zzchVar2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.$r8$classId) {
        }
        return 1;
    }

    public final String toString() {
        boolean z = true;
        switch (this.$r8$classId) {
            case 0:
                StringBuilder sb = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb.append('{');
                Iterator it = ((zzce) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            case 1:
                StringBuilder sb2 = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb2.append('{');
                Iterator it2 = ((zzdm) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z = false;
                }
                sb2.append('}');
                return sb2.toString();
            case 2:
                StringBuilder sb3 = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb3.append('{');
                Iterator it3 = ((zzw) entrySet()).iterator();
                while (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    if (!z) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z = false;
                }
                sb3.append('}');
                return sb3.toString();
            default:
                StringBuilder sb4 = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb4.append('{');
                Iterator it4 = ((com.google.android.gms.internal.mlkit_vision_text_common.zzcg) entrySet()).iterator();
                while (it4.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it4.next();
                    if (!z) {
                        sb4.append(", ");
                    }
                    sb4.append(entry4.getKey());
                    sb4.append('=');
                    sb4.append(entry4.getValue());
                    z = false;
                }
                sb4.append('}');
                return sb4.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        int i = this.$r8$classId;
        Object[] objArr = this.zzb;
        switch (i) {
            case 0:
                zzcg zzcgVar = (zzcg) this.zzc;
                if (zzcgVar != null) {
                    return zzcgVar;
                }
                zzcg zzcgVar2 = new zzcg(1, this.zzb);
                this.zzc = zzcgVar2;
                return zzcgVar2;
            case 1:
                zzdo zzdoVar = (zzdo) this.zzc;
                if (zzdoVar != null) {
                    return zzdoVar;
                }
                zzdo zzdoVar2 = new zzdo(1, objArr);
                this.zzc = zzdoVar2;
                return zzdoVar2;
            case 2:
                zzy zzyVar = (zzy) this.zzc;
                if (zzyVar != null) {
                    return zzyVar;
                }
                zzy zzyVar2 = new zzy(1, this.zzb);
                this.zzc = zzyVar2;
                return zzyVar2;
            default:
                zzci zzciVar = (zzci) this.zzc;
                if (zzciVar != null) {
                    return zzciVar;
                }
                zzci zzciVar2 = new zzci(1, objArr);
                this.zzc = zzciVar2;
                return zzciVar2;
        }
    }
}
