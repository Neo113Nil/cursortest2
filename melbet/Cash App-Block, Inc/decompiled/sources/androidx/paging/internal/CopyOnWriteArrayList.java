package androidx.paging.internal;

import java.util.Iterator;
import kotlin.UIntArray;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import kotlinx.serialization.internal.EnumDescriptor;

/* loaded from: classes3.dex */
public final class CopyOnWriteArrayList implements Iterable, KMappedMarker {
    public final /* synthetic */ int $r8$classId;
    public final Object delegate;

    public CopyOnWriteArrayList() {
        this.$r8$classId = 0;
        this.delegate = new java.util.concurrent.CopyOnWriteArrayList();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.$r8$classId;
        Object obj = this.delegate;
        switch (i) {
            case 0:
                Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) obj).iterator();
                it.getClass();
                return it;
            case 1:
                return ((Sequence) obj).iterator();
            default:
                return new UIntArray.Iterator((EnumDescriptor) obj);
        }
    }

    public /* synthetic */ CopyOnWriteArrayList(Object obj, int i) {
        this.$r8$classId = i;
        this.delegate = obj;
    }
}
