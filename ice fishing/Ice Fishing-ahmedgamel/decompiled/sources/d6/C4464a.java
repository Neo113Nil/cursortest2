package d6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;
import v7.AbstractC5113d;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4464a extends AbstractC5113d implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f37182n;

    public C4464a(List list) {
        h.e(list, "list");
        this.f37182n = new ArrayList(list);
    }

    @Override // v7.AbstractC5110a
    public final int a() {
        return this.f37182n.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f37182n.get(i);
    }

    @Override // v7.AbstractC5110a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f37182n.toArray(new Object[0]);
    }
}
