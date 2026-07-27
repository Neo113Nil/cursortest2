package D;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class T extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public Object f137h;

    /* renamed from: i, reason: collision with root package name */
    public FileInputStream f138i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f139j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ U f140k;

    /* renamed from: l, reason: collision with root package name */
    public int f141l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u2, x0.b bVar) {
        super(bVar);
        this.f140k = u2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f139j = obj;
        this.f141l |= Integer.MIN_VALUE;
        return U.a(this.f140k, this);
    }
}
