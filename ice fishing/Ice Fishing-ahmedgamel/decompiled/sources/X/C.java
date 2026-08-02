package X;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class C extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3635n;

    /* renamed from: u, reason: collision with root package name */
    public File f3636u;

    /* renamed from: v, reason: collision with root package name */
    public FileOutputStream f3637v;

    /* renamed from: w, reason: collision with root package name */
    public FileOutputStream f3638w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3639x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ D f3640y;

    /* renamed from: z, reason: collision with root package name */
    public int f3641z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d9, B7.c cVar) {
        super(cVar);
        this.f3640y = d9;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3639x = obj;
        this.f3641z |= Integer.MIN_VALUE;
        return this.f3640y.j(null, this);
    }
}
