package e8;

import b8.InterfaceC0537a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class J extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37330n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4506v f37331u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(C4506v c4506v, int i) {
        super(0);
        this.f37330n = i;
        this.f37331u = c4506v;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u7.e] */
    @Override // I7.a
    public final Object invoke() {
        C4506v c4506v = this.f37331u;
        switch (this.f37330n) {
            case 0:
                return Integer.valueOf(I.c(c4506v, (c8.e[]) c4506v.f37406g.getValue()));
            case 1:
                C4507w c4507w = c4506v.f37401b;
                return c4507w != null ? new InterfaceC0537a[]{(InterfaceC0537a) c4507w.f37409b} : I.f37329b;
            default:
                return I.b(c4506v.f37401b != null ? new ArrayList(0) : null);
        }
    }
}
