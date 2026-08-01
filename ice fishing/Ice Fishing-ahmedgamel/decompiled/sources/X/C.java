package X;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class C extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3473n;

    /* renamed from: u, reason: collision with root package name */
    public File f3474u;

    /* renamed from: v, reason: collision with root package name */
    public FileOutputStream f3475v;

    /* renamed from: w, reason: collision with root package name */
    public FileOutputStream f3476w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3477x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ D f3478y;

    /* renamed from: z, reason: collision with root package name */
    public int f3479z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d2, B7.c cVar) {
        super(cVar);
        this.f3478y = d2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3477x = obj;
        this.f3479z |= Integer.MIN_VALUE;
        return this.f3478y.j(null, this);
    }
}
