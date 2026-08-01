package S7;

import z7.InterfaceC5270g;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.i implements I7.p {

    /* renamed from: u, reason: collision with root package name */
    public static final r f2985u = new r(2, 0);

    /* renamed from: v, reason: collision with root package name */
    public static final r f2986v = new r(2, 1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2987n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i6) {
        super(i);
        this.f2987n = i6;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2987n) {
            case 0:
                return ((InterfaceC5272i) obj).n((InterfaceC5270g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((InterfaceC5272i) obj).n((InterfaceC5270g) obj2);
        }
    }
}
