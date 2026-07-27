package com.anythink.core.common.s.a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f16543n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f16544u;

    public /* synthetic */ p(a aVar, int i) {
        this.f16543n = i;
        this.f16544u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16543n) {
            case 0:
                ((j) this.f16544u).C();
                break;
            case 1:
                ((j) this.f16544u).u();
                break;
            default:
                ((g) this.f16544u).s();
                break;
        }
    }
}
