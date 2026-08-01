package com.anythink.core.common.s.a;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f16382n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16383u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16384v;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.f16382n = i;
        this.f16383u = obj;
        this.f16384v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16382n) {
            case 0:
                ((i) this.f16383u).b((Runnable) this.f16384v);
                break;
            default:
                ((a) this.f16383u).q((String) this.f16384v);
                break;
        }
    }
}
