package com.anythink.core.common.s.a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f16385n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f16386u;

    public /* synthetic */ p(a aVar, int i) {
        this.f16385n = i;
        this.f16386u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16385n) {
            case 0:
                ((j) this.f16386u).C();
                break;
            case 1:
                ((j) this.f16386u).u();
                break;
            default:
                ((g) this.f16386u).s();
                break;
        }
    }
}
