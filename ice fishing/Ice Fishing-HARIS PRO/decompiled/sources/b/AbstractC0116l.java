package b;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: b.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0116l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2301a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2302b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public D1.g f2303c;

    public AbstractC0116l(boolean z2) {
        this.f2301a = z2;
    }

    public abstract void a();

    /* JADX WARN: Type inference failed for: r1v1, types: [C1.a, D1.g] */
    public final void b(boolean z2) {
        this.f2301a = z2;
        ?? r1 = this.f2303c;
        if (r1 != 0) {
            r1.c();
        }
    }
}
