package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.SmallSortedMap$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.internal.zzblp;
import com.google.android.libraries.places.internal.zzblq;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzaft implements Iterator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractMap zza;
    public int zzb;
    public boolean zzc;
    public Iterator zzd;

    public /* synthetic */ zzaft(zzafr zzafrVar) {
        this.$r8$classId = 0;
        Objects.requireNonNull(zzafrVar);
        this.zza = zzafrVar;
        this.zzb = -1;
    }

    public Iterator getOverflowIterator() {
        int i = this.$r8$classId;
        AbstractMap abstractMap = this.zza;
        switch (i) {
            case 1:
                if (this.zzd == null) {
                    this.zzd = ((SmallSortedMap$1) abstractMap).overflowEntries.entrySet().iterator();
                }
                break;
            default:
                if (this.zzd == null) {
                    this.zzd = ((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1) abstractMap).overflowEntries.entrySet().iterator();
                }
                break;
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.$r8$classId;
        AbstractMap abstractMap = this.zza;
        switch (i) {
            case 0:
                zzafr zzafrVar = (zzafr) abstractMap;
                if (this.zzb + 1 < zzafrVar.zzb || (!zzafrVar.zzc.isEmpty() && zza().hasNext())) {
                    break;
                }
                break;
            case 1:
                SmallSortedMap$1 smallSortedMap$1 = (SmallSortedMap$1) abstractMap;
                if (this.zzb + 1 < smallSortedMap$1.entryList.size() || (!smallSortedMap$1.overflowEntries.isEmpty() && getOverflowIterator().hasNext())) {
                    break;
                }
                break;
            case 2:
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh zzghVar = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh) abstractMap;
                if (this.zzb + 1 < zzghVar.zzb || (!zzghVar.zzc.isEmpty() && zza().hasNext())) {
                    break;
                }
                break;
            case 3:
                zzblp zzblpVar = (zzblp) abstractMap;
                if (this.zzb + 1 < zzblpVar.zzb || (!zzblpVar.zzc.isEmpty() && zza().hasNext())) {
                    break;
                }
                break;
            default:
                if (this.zzb + 1 < ((kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1) abstractMap).entryList.size() || getOverflowIterator().hasNext()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.$r8$classId;
        AbstractMap abstractMap = this.zza;
        switch (i) {
            case 0:
                this.zzc = true;
                int i2 = this.zzb + 1;
                this.zzb = i2;
                zzafr zzafrVar = (zzafr) abstractMap;
                return i2 < zzafrVar.zzb ? (zzafs) zzafrVar.zza[i2] : (Map.Entry) zza().next();
            case 1:
                this.zzc = true;
                int i3 = this.zzb + 1;
                this.zzb = i3;
                SmallSortedMap$1 smallSortedMap$1 = (SmallSortedMap$1) abstractMap;
                return i3 < smallSortedMap$1.entryList.size() ? (Map.Entry) smallSortedMap$1.entryList.get(this.zzb) : (Map.Entry) getOverflowIterator().next();
            case 2:
                this.zzc = true;
                int i4 = this.zzb + 1;
                this.zzb = i4;
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh zzghVar = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh) abstractMap;
                return i4 < zzghVar.zzb ? (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgi) zzghVar.zza[i4] : (Map.Entry) zza().next();
            case 3:
                this.zzc = true;
                int i5 = this.zzb + 1;
                this.zzb = i5;
                zzblp zzblpVar = (zzblp) abstractMap;
                return i5 < zzblpVar.zzb ? (zzblq) zzblpVar.zza[i5] : (Map.Entry) zza().next();
            default:
                this.zzc = true;
                int i6 = this.zzb + 1;
                this.zzb = i6;
                kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1 smallSortedMap$12 = (kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1) abstractMap;
                return i6 < smallSortedMap$12.entryList.size() ? (Map.Entry) smallSortedMap$12.entryList.get(this.zzb) : (Map.Entry) getOverflowIterator().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.$r8$classId;
        AbstractMap abstractMap = this.zza;
        switch (i) {
            case 0:
                if (!this.zzc) {
                    a$$ExternalSyntheticBUOutline0.m$1("remove() was called before next()");
                    break;
                } else {
                    this.zzc = false;
                    zzafr zzafrVar = (zzafr) abstractMap;
                    zzafrVar.zzn();
                    int i2 = this.zzb;
                    if (i2 >= zzafrVar.zzb) {
                        zza().remove();
                        break;
                    } else {
                        this.zzb = i2 - 1;
                        zzafrVar.zzl(i2);
                        break;
                    }
                }
            case 1:
                SmallSortedMap$1 smallSortedMap$1 = (SmallSortedMap$1) abstractMap;
                if (!this.zzc) {
                    a$$ExternalSyntheticBUOutline0.m$1("remove() was called before next()");
                    break;
                } else {
                    this.zzc = false;
                    int i3 = SmallSortedMap$1.$r8$clinit;
                    smallSortedMap$1.checkMutable();
                    if (this.zzb >= smallSortedMap$1.entryList.size()) {
                        getOverflowIterator().remove();
                        break;
                    } else {
                        int i4 = this.zzb;
                        this.zzb = i4 - 1;
                        smallSortedMap$1.removeArrayEntryAt(i4);
                        break;
                    }
                }
            case 2:
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh zzghVar = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh) abstractMap;
                if (!this.zzc) {
                    a$$ExternalSyntheticBUOutline0.m$1("remove() was called before next()");
                    break;
                } else {
                    this.zzc = false;
                    int i5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh.$r8$clinit;
                    zzghVar.zzo();
                    int i6 = this.zzb;
                    if (i6 >= zzghVar.zzb) {
                        zza().remove();
                        break;
                    } else {
                        this.zzb = i6 - 1;
                        zzghVar.zzm(i6);
                        break;
                    }
                }
            case 3:
                if (!this.zzc) {
                    a$$ExternalSyntheticBUOutline0.m$1("remove() was called before next()");
                    break;
                } else {
                    this.zzc = false;
                    zzblp zzblpVar = (zzblp) abstractMap;
                    zzblpVar.zzn();
                    int i7 = this.zzb;
                    if (i7 >= zzblpVar.zzb) {
                        zza().remove();
                        break;
                    } else {
                        this.zzb = i7 - 1;
                        zzblpVar.zzl(i7);
                        break;
                    }
                }
            default:
                kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1 smallSortedMap$12 = (kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1) abstractMap;
                if (!this.zzc) {
                    a$$ExternalSyntheticBUOutline0.m$1("remove() was called before next()");
                    break;
                } else {
                    this.zzc = false;
                    int i8 = kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1.$r8$clinit;
                    smallSortedMap$12.checkMutable();
                    if (this.zzb >= smallSortedMap$12.entryList.size()) {
                        getOverflowIterator().remove();
                        break;
                    } else {
                        int i9 = this.zzb;
                        this.zzb = i9 - 1;
                        smallSortedMap$12.removeArrayEntryAt(i9);
                        break;
                    }
                }
        }
    }

    public Iterator zza() {
        int i = this.$r8$classId;
        AbstractMap abstractMap = this.zza;
        switch (i) {
            case 0:
                if (this.zzd == null) {
                    this.zzd = ((zzafr) abstractMap).zzc.entrySet().iterator();
                }
                break;
            case 1:
            default:
                if (this.zzd == null) {
                    this.zzd = ((zzblp) abstractMap).zzc.entrySet().iterator();
                }
                break;
            case 2:
                if (this.zzd == null) {
                    this.zzd = ((com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgh) abstractMap).zzc.entrySet().iterator();
                }
                break;
        }
        return this.zzd;
    }

    public /* synthetic */ zzaft(AbstractMap abstractMap, int i) {
        this.$r8$classId = i;
        this.zza = abstractMap;
        this.zzb = -1;
    }

    public /* synthetic */ zzaft(zzblp zzblpVar) {
        this.$r8$classId = 3;
        Objects.requireNonNull(zzblpVar);
        this.zza = zzblpVar;
        this.zzb = -1;
    }
}
