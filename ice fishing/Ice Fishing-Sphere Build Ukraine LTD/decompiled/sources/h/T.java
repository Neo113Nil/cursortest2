package h;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SearchView f2144f;

    public /* synthetic */ T(SearchView searchView, int i2) {
        this.f2143e = i2;
        this.f2144f = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2143e) {
            case 0:
                this.f2144f.q();
                break;
            default:
                B.c cVar = this.f2144f.f1195S;
                if (cVar instanceof f0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
