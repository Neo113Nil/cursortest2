package com.google.android.gms.internal.fido;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzck extends zzcf implements NavigableSet, Iterable {
    public final transient Comparator zza;
    public transient zzck zzb;

    public zzck(Comparator comparator) {
        this.zza = comparator;
    }

    public static zzcv zzs(Comparator comparator) {
        if (zzcq.zza == comparator) {
            return zzcv.zzc;
        }
        zzbz zzbzVar = zzcc.zza;
        return new zzcv(zzct.zza, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.zza;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        zzcv zzcvVar = (zzcv) this;
        return zzcvVar.zzw(0, zzcvVar.zzu(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        zzcv zzcvVar = (zzcv) this;
        return zzcvVar.zzw(zzcvVar.zzv(obj, true), zzcvVar.zzd.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzck descendingSet() {
        zzck zzckVar = this.zzb;
        if (zzckVar == null) {
            zzcv zzcvVar = (zzcv) this;
            Comparator reverseOrder = Collections.reverseOrder(((zzck) zzcvVar).zza);
            zzckVar = zzcvVar.isEmpty() ? zzs(reverseOrder) : new zzcv(zzcvVar.zzd.zzf(), reverseOrder);
            this.zzb = zzckVar;
            zzckVar.zzb = this;
        }
        return zzckVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: zzp, reason: merged with bridge method [inline-methods] */
    public final zzcv subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.zza.compare(obj, obj2) > 0) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return null;
        }
        zzcv zzcvVar = (zzcv) this;
        zzcv zzw = zzcvVar.zzw(zzcvVar.zzv(obj, z), zzcvVar.zzd.size());
        return zzw.zzw(0, zzw.zzu(obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        zzcv zzcvVar = (zzcv) this;
        return zzcvVar.zzw(0, zzcvVar.zzu(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        zzcv zzcvVar = (zzcv) this;
        return zzcvVar.zzw(zzcvVar.zzv(obj, z), zzcvVar.zzd.size());
    }
}
