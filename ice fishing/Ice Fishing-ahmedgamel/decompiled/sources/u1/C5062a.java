package u1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5062a extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final q f41045a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41046b;

    /* renamed from: c, reason: collision with root package name */
    public x f41047c;

    public C5062a(q qVar, r rVar, ReferenceQueue referenceQueue) {
        super(rVar, referenceQueue);
        N1.g.c(qVar, "Argument must not be null");
        this.f41045a = qVar;
        boolean z3 = rVar.f41161n;
        this.f41047c = null;
        this.f41046b = z3;
    }
}
