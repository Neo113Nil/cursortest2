package com.google.common.collect;

import com.google.android.gms.internal.mlkit_vision_barcode.zzbw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzco;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcw;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class AbstractMapBasedMultimap$1 implements Iterator {
    public final /* synthetic */ int $r8$classId;
    public Collection collection;
    public Object key;
    public final Iterator keyIterator;
    public final /* synthetic */ Serializable this$0;
    public Iterator valueIterator;

    public AbstractMapBasedMultimap$1(zzbw zzbwVar) {
        this.$r8$classId = 1;
        this.this$0 = zzbwVar;
        this.keyIterator = zzbwVar.zza.entrySet().iterator();
        this.key = null;
        this.collection = null;
        this.valueIterator = zzcw.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                if (this.keyIterator.hasNext() || this.valueIterator.hasNext()) {
                }
                break;
            default:
                if (this.keyIterator.hasNext() || this.valueIterator.hasNext()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.$r8$classId;
        Iterator it = this.keyIterator;
        switch (i) {
            case 0:
                if (!this.valueIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.key = entry.getKey();
                    Collection collection = (Collection) entry.getValue();
                    this.collection = collection;
                    this.valueIterator = collection.iterator();
                }
                return this.valueIterator.next();
            default:
                if (!this.valueIterator.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    this.key = entry2.getKey();
                    Collection collection2 = (Collection) entry2.getValue();
                    this.collection = collection2;
                    this.valueIterator = collection2.iterator();
                }
                return new zzco(this.key, this.valueIterator.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.$r8$classId;
        Serializable serializable = this.this$0;
        Iterator it = this.keyIterator;
        switch (i) {
            case 0:
                this.valueIterator.remove();
                Collection collection = this.collection;
                Objects.requireNonNull(collection);
                if (collection.isEmpty()) {
                    it.remove();
                }
                Multimaps$CustomListMultimap multimaps$CustomListMultimap = (Multimaps$CustomListMultimap) serializable;
                multimaps$CustomListMultimap.totalSize--;
                break;
            default:
                this.valueIterator.remove();
                Collection collection2 = this.collection;
                Objects.requireNonNull(collection2);
                if (collection2.isEmpty()) {
                    it.remove();
                }
                zzbw zzbwVar = (zzbw) serializable;
                zzbwVar.zzb--;
                break;
        }
    }

    public AbstractMapBasedMultimap$1(Multimaps$CustomListMultimap multimaps$CustomListMultimap) {
        this.$r8$classId = 0;
        this.this$0 = multimaps$CustomListMultimap;
        this.keyIterator = multimaps$CustomListMultimap.map.entrySet().iterator();
        this.key = null;
        this.collection = null;
        this.valueIterator = Iterators$EmptyModifiableIterator.INSTANCE;
    }
}
