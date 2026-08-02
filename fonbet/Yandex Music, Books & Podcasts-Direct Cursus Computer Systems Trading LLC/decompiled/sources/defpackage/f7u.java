package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class f7u {
    public final List a;
    public final List b;
    public final e7u c;
    public final int d;
    public final boolean e;

    public f7u(List list, List list2, e7u e7uVar) {
        this.a = list;
        this.b = list2;
        this.c = e7uVar;
        int size = list2.size();
        int i = e7uVar.a;
        int i2 = (size - i) - 1;
        this.d = i2 < 0 ? 0 : i2;
        this.e = e7uVar.c && i >= 99;
    }

    public static f7u b(f7u f7uVar, List list, e7u e7uVar, int i) {
        List list2 = f7uVar.a;
        if ((i & 2) != 0) {
            list = f7uVar.b;
        }
        if ((i & 4) != 0) {
            e7uVar = f7uVar.c;
        }
        f7uVar.getClass();
        list.getClass();
        return new f7u(list2, list, e7uVar);
    }

    public final f7u a(int i) {
        List list = this.b;
        if (i < 0 || i >= list.size()) {
            throw new IllegalStateException(("Unable to perform atPosition(" + i + ") operation. Position is out of queue bounds " + u75.f(list)).toString());
        }
        e7u e7uVar = this.c;
        int i2 = e7uVar.b;
        int i3 = i2 + 1;
        if (i > i3) {
            i = i3;
        }
        return i == e7uVar.a ? this : b(this, null, new e7u(i, Integer.max(i, i2)), 3);
    }

    public final s7u c() {
        if (e()) {
            return (s7u) this.b.get(this.c.a);
        }
        xq0.q("Queue does not contain current item");
        return null;
    }

    public final s7u d() {
        if (g()) {
            return (s7u) this.b.get(this.c.a - 1);
        }
        xq0.q("Queue does not contain previous item");
        return null;
    }

    public final boolean e() {
        int size = this.b.size();
        int i = this.c.a;
        return i >= 0 && i < size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7u)) {
            return false;
        }
        f7u f7uVar = (f7u) obj;
        return this.a.equals(f7uVar.a) && this.b.equals(f7uVar.b) && this.c.equals(f7uVar.c);
    }

    public final boolean f() {
        return this.d >= 1;
    }

    public final boolean g() {
        int size = this.b.size();
        int i = this.c.a - 1;
        return i >= 0 && i < size;
    }

    public final f7u h() {
        boolean f = f();
        List list = this.b;
        if (!f) {
            wb8.h(dfi.c(list.size(), "Unable to perform next(skip=false) operation without pending item (size=", ")"));
            return null;
        }
        if (this.e) {
            return b(this, list.subList(1, list.size()), null, 5);
        }
        e7u e7uVar = this.c;
        int i = e7uVar.a;
        int i2 = e7uVar.b;
        return b(this, null, (e7uVar.c || i2 == -1) ? new e7u(i + 1, i2 + 1) : new e7u(i + 1, i2), 3);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final f7u i() {
        if (g()) {
            return b(this, null, new e7u(r1.a - 1, this.c.b), 3);
        }
        xq0.q("Unable to perform prev() operation without previous item");
        return null;
    }

    public final f7u j(x7u x7uVar) {
        x7uVar.getClass();
        return b(this, CollectionsKt.g0(this.b, p6g.p(x7uVar.a, x7uVar.b)), null, 5);
    }

    public final String toString() {
        return "VideoClipRadioPlaybackQueueImpl(predefinedItemIds=" + this.a + ", queueItems=" + this.b + ", position=" + this.c + ")";
    }
}
