package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class O implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26634n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2881Yl f26635u;

    public /* synthetic */ O(C2881Yl c2881Yl, int i) {
        this.f26634n = i;
        this.f26635u = c2881Yl;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f26634n) {
            case 0:
                ((P) this.f26635u.f28863v).f26797h.d();
                break;
            case 1:
                ((P) this.f26635u.f28863v).f26797h.i();
                break;
            default:
                ((P) this.f26635u.f28863v).f26797h.getClass();
                break;
        }
    }

    public /* synthetic */ O(C2881Yl c2881Yl, C3100dd c3100dd) {
        this.f26634n = 2;
        this.f26635u = c2881Yl;
    }
}
