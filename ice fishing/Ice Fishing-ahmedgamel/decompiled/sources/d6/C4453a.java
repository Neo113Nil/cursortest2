package d6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;
import v7.AbstractC5123d;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4453a extends AbstractC5123d implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f37073n;

    public C4453a(List list) {
        h.e(list, "list");
        this.f37073n = new ArrayList(list);
    }

    @Override // v7.AbstractC5120a
    public final int a() {
        return this.f37073n.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f37073n.get(i);
    }

    @Override // v7.AbstractC5120a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f37073n.toArray(new Object[0]);
    }
}
