package k7;

import e7.AbstractC4482d;
import e7.C4481c;
import e7.InterfaceC4480b;
import java.util.List;

/* renamed from: k7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4664e implements c7.b, InterfaceC4480b {

    /* renamed from: b, reason: collision with root package name */
    public static final C4664e f38821b = new C4664e(AbstractC4482d.f37334a);

    /* renamed from: a, reason: collision with root package name */
    public final List f38822a;

    public C4664e(List list) {
        this.f38822a = list;
        AbstractC4482d.a(list);
        list.stream().mapToDouble(new C4481c()).toArray();
    }

    @Override // e7.InterfaceC4480b
    public final boolean a(g7.b bVar) {
        int ordinal = bVar.f37943e.ordinal();
        return ordinal == 0 || ordinal == 2;
    }

    public final String toString() {
        return "ExplicitBucketHistogramAggregation(" + this.f38822a.toString() + ")";
    }
}
