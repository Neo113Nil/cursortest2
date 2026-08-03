package m;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x0 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SearchView f4493h;

    public /* synthetic */ x0(SearchView searchView, int i10) {
        this.f4492g = i10;
        this.f4493h = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4492g) {
            case 0:
                this.f4493h.q();
                break;
            default:
                m3.b bVar = this.f4493h.U;
                if (bVar instanceof i1) {
                    bVar.b(null);
                    break;
                }
                break;
        }
    }
}
