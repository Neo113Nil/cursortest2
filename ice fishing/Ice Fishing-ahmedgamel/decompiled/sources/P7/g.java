package P7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2618a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2619b;

    public /* synthetic */ g(int i, Object obj) {
        this.f2618a = i;
        this.f2619b = obj;
    }

    @Override // P7.h
    public final Iterator iterator() {
        switch (this.f2618a) {
            case 0:
                return new f(this);
            case 1:
                return (Iterator) this.f2619b;
            default:
                return ((Iterable) this.f2619b).iterator();
        }
    }
}
