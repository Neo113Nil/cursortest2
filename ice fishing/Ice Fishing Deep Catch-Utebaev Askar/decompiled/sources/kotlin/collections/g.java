package kotlin.collections;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f172d;

    public g(h list, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f170b = list;
        this.f171c = i2;
        d dVar = h.f173a;
        int iA = list.a();
        dVar.getClass();
        if (i2 < 0 || i3 > iA) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + iA);
        }
        if (i2 <= i3) {
            this.f172d = i3 - i2;
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
    }

    @Override // kotlin.collections.b
    public final int a() {
        return this.f172d;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        h.f173a.getClass();
        d.a(i2, this.f172d);
        return this.f170b.get(this.f171c + i2);
    }
}
