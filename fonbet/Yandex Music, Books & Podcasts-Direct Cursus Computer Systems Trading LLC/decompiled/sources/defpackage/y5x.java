package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class y5x extends u5x {
    public final /* synthetic */ z5x f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5x(z5x z5xVar) {
        super(0);
        this.f = z5xVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.u5x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return bfg.R(this.f.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return u().listIterator(0);
    }

    @Override // defpackage.r4x
    public final xkt o() {
        return u().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.d.size();
    }

    @Override // defpackage.u5x
    public final q5x v() {
        return new w5x(this);
    }
}
