package e8;

import b8.InterfaceC0529a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class J extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37254n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4489v f37255u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(C4489v c4489v, int i) {
        super(0);
        this.f37254n = i;
        this.f37255u = c4489v;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u7.e] */
    @Override // I7.a
    public final Object invoke() {
        C4489v c4489v = this.f37255u;
        switch (this.f37254n) {
            case 0:
                return Integer.valueOf(I.c(c4489v, (c8.e[]) c4489v.f37330g.getValue()));
            case 1:
                C4490w c4490w = c4489v.f37325b;
                return c4490w != null ? new InterfaceC0529a[]{(InterfaceC0529a) c4490w.f37333b} : I.f37253b;
            default:
                return I.b(c4489v.f37325b != null ? new ArrayList(0) : null);
        }
    }
}
