package X;

import java.io.FileInputStream;
import x7.AbstractC5219c;

/* loaded from: classes.dex */
public final class y extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public D f3621n;

    /* renamed from: u, reason: collision with root package name */
    public FileInputStream f3622u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3623v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ D f3624w;

    /* renamed from: x, reason: collision with root package name */
    public int f3625x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(D d2, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f3624w = d2;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f3623v = obj;
        this.f3625x |= Integer.MIN_VALUE;
        return this.f3624w.f(this);
    }
}
