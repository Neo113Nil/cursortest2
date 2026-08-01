package o7;

import i7.AbstractC4593d;
import i7.C4592c;
import i7.InterfaceC4591b;
import java.util.List;

/* renamed from: o7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4806e implements g7.b, InterfaceC4591b {

    /* renamed from: b, reason: collision with root package name */
    public static final C4806e f39645b = new C4806e(AbstractC4593d.f38065a);

    /* renamed from: a, reason: collision with root package name */
    public final List f39646a;

    public C4806e(List list) {
        this.f39646a = list;
        AbstractC4593d.a(list);
        list.stream().mapToDouble(new C4592c()).toArray();
    }

    @Override // i7.InterfaceC4591b
    public final boolean a(k7.b bVar) {
        int ordinal = bVar.f38697e.ordinal();
        return ordinal == 0 || ordinal == 2;
    }

    public final String toString() {
        return "ExplicitBucketHistogramAggregation(" + this.f39646a.toString() + ")";
    }
}
