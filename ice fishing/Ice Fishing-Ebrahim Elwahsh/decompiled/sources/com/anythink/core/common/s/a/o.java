package com.anythink.core.common.s.a;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f16540n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16541u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16542v;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.f16540n = i;
        this.f16541u = obj;
        this.f16542v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16540n) {
            case 0:
                ((i) this.f16541u).b((Runnable) this.f16542v);
                break;
            default:
                ((a) this.f16541u).q((String) this.f16542v);
                break;
        }
    }
}
