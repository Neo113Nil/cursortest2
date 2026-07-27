package h;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2135f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SearchView f2136g;

    public /* synthetic */ T(SearchView searchView, int i2) {
        this.f2135f = i2;
        this.f2136g = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2135f) {
            case 0:
                this.f2136g.q();
                break;
            default:
                B.c cVar = this.f2136g.T;
                if (cVar instanceof f0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
