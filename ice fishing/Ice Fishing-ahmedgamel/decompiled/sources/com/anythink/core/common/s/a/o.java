package com.anythink.core.common.s.a;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f17169n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f17170u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f17171v;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.f17169n = i;
        this.f17170u = obj;
        this.f17171v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17169n) {
            case 0:
                ((i) this.f17170u).b((Runnable) this.f17171v);
                break;
            default:
                ((a) this.f17170u).q((String) this.f17171v);
                break;
        }
    }
}
