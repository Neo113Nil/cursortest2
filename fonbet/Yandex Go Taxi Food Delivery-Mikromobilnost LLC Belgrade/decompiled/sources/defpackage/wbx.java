package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class wbx extends pcx implements Iterable {
    public final ArrayList a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof wbx) && ((wbx) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
