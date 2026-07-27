package D;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class b0 extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public FileOutputStream f169i;

    /* renamed from: j, reason: collision with root package name */
    public FileOutputStream f170j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f171k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c0 f172l;

    /* renamed from: m, reason: collision with root package name */
    public int f173m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, x0.b bVar) {
        super(bVar);
        this.f172l = c0Var;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f171k = obj;
        this.f173m |= Integer.MIN_VALUE;
        return this.f172l.b(null, this);
    }
}
