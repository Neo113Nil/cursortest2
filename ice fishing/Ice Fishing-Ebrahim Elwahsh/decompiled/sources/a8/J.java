package a8;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class J extends kotlin.jvm.internal.i implements E7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4439n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0454v f4440u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(C0454v c0454v, int i) {
        super(0);
        this.f4439n = i;
        this.f4440u = c0454v;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, q7.e] */
    @Override // E7.a
    public final Object invoke() {
        C0454v c0454v = this.f4440u;
        switch (this.f4439n) {
            case 0:
                return Integer.valueOf(I.c(c0454v, (Y7.e[]) c0454v.f4515g.getValue()));
            case 1:
                C0455w c0455w = c0454v.f4510b;
                return c0455w != null ? new X7.a[]{(X7.a) c0455w.f4518b} : I.f4438b;
            default:
                return I.b(c0454v.f4510b != null ? new ArrayList(0) : null);
        }
    }
}
