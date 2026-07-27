package D;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class b0 extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public FileOutputStream f169h;

    /* renamed from: i, reason: collision with root package name */
    public FileOutputStream f170i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f171j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c0 f172k;

    /* renamed from: l, reason: collision with root package name */
    public int f173l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, x0.b bVar) {
        super(bVar);
        this.f172k = c0Var;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f171j = obj;
        this.f173l |= Integer.MIN_VALUE;
        return this.f172k.b(null, this);
    }
}
