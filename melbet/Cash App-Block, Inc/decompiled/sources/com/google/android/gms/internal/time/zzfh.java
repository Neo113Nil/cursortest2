package com.google.android.gms.internal.time;

import androidx.datastore.preferences.protobuf.SmallSortedMap$1;
import com.google.android.gms.internal.measurement.zzafr;
import com.google.android.gms.internal.measurement.zzaft;
import com.google.android.gms.internal.measurement.zzzy;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh;
import com.google.android.libraries.places.internal.zzblp;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class zzfh extends AbstractSet {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzfh(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.zza;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((SmallSortedMap$1) obj2).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((zzafr) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 3:
            default:
                return super.add(obj);
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((zzgh) obj2).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 5:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((zzblp) obj2).put((Comparable) entry4.getKey(), entry4.getValue());
                return true;
            case 6:
                Map.Entry entry5 = (Map.Entry) obj;
                if (contains(entry5)) {
                    return false;
                }
                ((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1) obj2).put((Comparable) entry5.getKey(), entry5.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 1:
                ((SmallSortedMap$1) obj).clear();
                break;
            case 2:
                ((zzafr) obj).clear();
                break;
            case 3:
            default:
                super.clear();
                break;
            case 4:
                ((zzgh) obj).clear();
                break;
            case 5:
                ((zzblp) obj).clear();
                break;
            case 6:
                ((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.zza;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj3 = ((SmallSortedMap$1) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj3 != value) {
                    return obj3 != null && obj3.equals(value);
                }
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj4 = ((zzafr) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj4 != value2) {
                    return obj4 != null && obj4.equals(value2);
                }
                return true;
            case 3:
            default:
                return super.contains(obj);
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj5 = ((zzgh) obj2).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj5 != value3) {
                    return obj5 != null && obj5.equals(value3);
                }
                return true;
            case 5:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj6 = ((zzblp) obj2).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj6 != value4) {
                    return obj6 != null && obj6.equals(value4);
                }
                return true;
            case 6:
                Map.Entry entry5 = (Map.Entry) obj;
                Object obj7 = ((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1) obj2).get(entry5.getKey());
                Object value5 = entry5.getValue();
                if (obj7 != value5) {
                    return obj7 != null && obj7.equals(value5);
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.$r8$classId;
        int i2 = 2;
        Object obj = this.zza;
        switch (i) {
            case 0:
                return new zzfg(this, 0);
            case 1:
                return new zzaft((SmallSortedMap$1) obj, 1);
            case 2:
                return new zzaft((zzafr) obj);
            case 3:
                return new zzfg(this, i2);
            case 4:
                return new zzaft((zzgh) obj, i2);
            case 5:
                return new zzaft((zzblp) obj);
            default:
                return new zzaft((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1) obj, 4);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.zza;
        switch (i) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((SmallSortedMap$1) obj2).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((zzafr) obj2).remove(entry2.getKey());
                return true;
            case 3:
            default:
                return super.remove(obj);
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((zzgh) obj2).remove(entry3.getKey());
                return true;
            case 5:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((zzblp) obj2).remove(entry4.getKey());
                return true;
            case 6:
                Map.Entry entry5 = (Map.Entry) obj;
                if (!contains(entry5)) {
                    return false;
                }
                ((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1) obj2).remove(entry5.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 0:
                return ((zzfj) obj).zzd;
            case 1:
                return ((SmallSortedMap$1) obj).size();
            case 2:
                return ((zzafr) obj).size();
            case 3:
                return ((zzzy) obj).zzd;
            case 4:
                return ((zzgh) obj).size();
            case 5:
                return ((zzblp) obj).size();
            default:
                return ((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1) obj).size();
        }
    }
}
