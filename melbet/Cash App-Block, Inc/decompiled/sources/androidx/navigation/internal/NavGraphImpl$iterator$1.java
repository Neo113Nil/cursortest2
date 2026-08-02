package androidx.navigation.internal;

import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.navigation.NavDestination;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class NavGraphImpl$iterator$1 implements Iterator, KMappedMarker {
    public int index = -1;
    public final /* synthetic */ TraceParser this$0;
    public boolean wentToNext;

    public NavGraphImpl$iterator$1(TraceParser traceParser) {
        this.this$0 = traceParser;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.index + 1 < ((SparseArrayCompat) this.this$0.projectPackages).size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        this.wentToNext = true;
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) this.this$0.projectPackages;
        int i = this.index + 1;
        this.index = i;
        return (NavDestination) sparseArrayCompat.valueAt(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.wentToNext) {
            a$$ExternalSyntheticBUOutline0.m$1("You must call next() before you can remove an element");
            return;
        }
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) this.this$0.projectPackages;
        ((NavDestination) sparseArrayCompat.valueAt(this.index)).parent = null;
        int i = this.index;
        Object[] objArr = sparseArrayCompat.values;
        Object obj = objArr[i];
        Object obj2 = SieveCacheKt.DELETED$1;
        if (obj != obj2) {
            objArr[i] = obj2;
            sparseArrayCompat.garbage = true;
        }
        this.index = i - 1;
        this.wentToNext = false;
    }
}
