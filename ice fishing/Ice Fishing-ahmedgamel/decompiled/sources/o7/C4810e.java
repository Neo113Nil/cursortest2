package o7;

import i7.AbstractC4602d;
import i7.C4601c;
import i7.InterfaceC4600b;
import java.util.List;

/* renamed from: o7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4810e implements g7.b, InterfaceC4600b {

    /* renamed from: b, reason: collision with root package name */
    public static final C4810e f39753b = new C4810e(AbstractC4602d.f38184a);

    /* renamed from: a, reason: collision with root package name */
    public final List f39754a;

    public C4810e(List list) {
        this.f39754a = list;
        AbstractC4602d.a(list);
        list.stream().mapToDouble(new C4601c()).toArray();
    }

    @Override // i7.InterfaceC4600b
    public final boolean a(k7.b bVar) {
        int ordinal = bVar.f38624e.ordinal();
        return ordinal == 0 || ordinal == 2;
    }

    public final String toString() {
        return "ExplicitBucketHistogramAggregation(" + this.f39754a.toString() + ")";
    }
}
