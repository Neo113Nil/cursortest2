package defpackage;

import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z891 implements Iterator {
    public final Iterator a;

    public z891(zzbe zzbeVar) {
        this.a = zzbeVar.zzg().keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
