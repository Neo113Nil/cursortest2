package X;

import java.io.File;
import java.io.FileOutputStream;
import x7.AbstractC5219c;

/* loaded from: classes.dex */
public final class C extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public D f3529n;

    /* renamed from: u, reason: collision with root package name */
    public File f3530u;

    /* renamed from: v, reason: collision with root package name */
    public FileOutputStream f3531v;

    /* renamed from: w, reason: collision with root package name */
    public FileOutputStream f3532w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3533x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ D f3534y;

    /* renamed from: z, reason: collision with root package name */
    public int f3535z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d2, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f3534y = d2;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f3533x = obj;
        this.f3535z |= Integer.MIN_VALUE;
        return this.f3534y.j(null, this);
    }
}
