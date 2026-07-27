package Z5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;
import r7.AbstractC4973d;

/* loaded from: classes2.dex */
public final class a extends AbstractC4973d implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4276n;

    public a(List list) {
        h.e(list, "list");
        this.f4276n = new ArrayList(list);
    }

    @Override // r7.AbstractC4970a
    public final int a() {
        return this.f4276n.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f4276n.get(i);
    }

    @Override // r7.AbstractC4970a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f4276n.toArray(new Object[0]);
    }
}
