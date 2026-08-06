package h;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f3203b;

    public /* synthetic */ S(SearchView searchView, int i2) {
        this.f3202a = i2;
        this.f3203b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3202a) {
            case 0:
                this.f3203b.q();
                break;
            default:
                D.c cVar = this.f3203b.f2145T;
                if (cVar instanceof d0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
