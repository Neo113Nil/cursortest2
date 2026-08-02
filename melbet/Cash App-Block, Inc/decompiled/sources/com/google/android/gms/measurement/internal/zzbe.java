package com.google.android.gms.measurement.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import io.opentelemetry.context.internal.shaded.WeakConcurrentMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyField;

/* loaded from: classes9.dex */
public final class zzbe implements Iterator {
    public final /* synthetic */ int $r8$classId;
    public Iterator zza;

    public zzbe(WeakConcurrentMap weakConcurrentMap, Iterator it) {
        this.$r8$classId = 3;
        this.zza = it;
        if (it.hasNext()) {
            ((Map.Entry) it.next()).getKey().getClass();
            a$$ExternalSyntheticBUOutline0.m$1();
            throw null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
        }
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$r8$classId) {
            case 0:
                return zza();
            case 1:
                return ((Map.Entry) this.zza.next()).getValue();
            case 2:
                return ((Map.Entry) this.zza.next()).getValue();
            case 3:
                throw new NoSuchElementException();
            case 4:
                Map.Entry entry = (Map.Entry) this.zza.next();
                if (!(entry.getValue() instanceof LazyField)) {
                    return entry;
                }
                LazyField.LazyEntry lazyEntry = new LazyField.LazyEntry();
                lazyEntry.entry = entry;
                return lazyEntry;
            default:
                return (String) this.zza.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Remove not supported");
            case 1:
                this.zza.remove();
                return;
            case 2:
                this.zza.remove();
                return;
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                this.zza.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String zza() {
        return (String) this.zza.next();
    }

    public zzbe(zzbf zzbfVar) {
        this.$r8$classId = 0;
        Objects.requireNonNull(zzbfVar);
        this.zza = zzbfVar.zza.keySet().iterator();
    }

    public zzbe(Iterator it, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 2:
                it.getClass();
                this.zza = it;
                break;
            default:
                it.getClass();
                this.zza = it;
                break;
        }
    }

    public /* synthetic */ zzbe(int i) {
        this.$r8$classId = i;
    }
}
