package F;

import java.io.FileOutputStream;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class Z extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public FileOutputStream f456d;

    /* renamed from: e, reason: collision with root package name */
    public FileOutputStream f457e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f459g;

    /* renamed from: h, reason: collision with root package name */
    public int f460h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f459g = a0Var;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f458f = obj;
        this.f460h |= Integer.MIN_VALUE;
        return this.f459g.b(null, this);
    }
}
