package com.anythink.core.common.s.a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f17172n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f17173u;

    public /* synthetic */ p(a aVar, int i) {
        this.f17172n = i;
        this.f17173u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17172n) {
            case 0:
                ((j) this.f17173u).C();
                break;
            case 1:
                ((j) this.f17173u).u();
                break;
            default:
                ((g) this.f17173u).s();
                break;
        }
    }
}
