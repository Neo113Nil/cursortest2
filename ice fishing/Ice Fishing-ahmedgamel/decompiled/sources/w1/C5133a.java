package w1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5133a extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final p f41428a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41429b;

    /* renamed from: c, reason: collision with root package name */
    public w f41430c;

    public C5133a(p pVar, q qVar, ReferenceQueue referenceQueue) {
        super(qVar, referenceQueue);
        P1.g.c(pVar, "Argument must not be null");
        this.f41428a = pVar;
        boolean z6 = qVar.f41544n;
        this.f41430c = null;
        this.f41429b = z6;
    }
}
