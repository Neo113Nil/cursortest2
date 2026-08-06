package C1;

import A1.C0005f;
import F.P;
import F.Y;
import F.b0;
import h1.C0238h;
import h1.C0239i;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements t1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i2, Object obj) {
        super(1);
        this.f193e = i2;
        this.f194f = obj;
    }

    @Override // t1.l
    public final Object invoke(Object obj) {
        switch (this.f193e) {
            case 0:
                C0239i c0239i = C0239i.f3393a;
                ((C0005f) this.f194f).i(c0239i);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                P p2 = (P) this.f194f;
                if (th != null) {
                    p2.f419h.p(new b0(th));
                }
                if (p2.f421j.f3390b != C0238h.f3392a) {
                    ((Y) p2.f421j.a()).close();
                }
                break;
            default:
                ((I1.h) this.f194f).b();
                break;
        }
        return C0239i.f3393a;
    }
}
