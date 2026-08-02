package defpackage;

import com.yandex.go.taxi.order.search.overlay.ordinary.mvp.c;
import com.yandex.go.taxi.order.search.ui.search.SearchViews;
import com.yandex.go.taxi.order.search.ui.search_views.d;

/* loaded from: classes14.dex */
public final class xd80 extends yx01 {
    public final /* synthetic */ int f;
    public final /* synthetic */ c g;

    public /* synthetic */ xd80(c cVar, int i) {
        this.f = i;
        this.g = cVar;
    }

    @Override // defpackage.yx01
    public final int b() {
        switch (this.f) {
        }
        return 200;
    }

    @Override // defpackage.yx01
    public final void c() {
        int i = this.f;
        c cVar = this.g;
        switch (i) {
            case 0:
                d dVar = cVar.w;
                dVar.M1(false);
                dVar.B0(1.0f);
                super.c();
                break;
            default:
                d dVar2 = cVar.w;
                dVar2.B0(1.0f);
                dVar2.M1(true);
                super.c();
                break;
        }
    }

    @Override // defpackage.yx01
    public final void d() {
        int i = this.f;
        c cVar = this.g;
        switch (i) {
            case 0:
                cVar.resume();
                d dVar = cVar.w;
                dVar.M1(true);
                dVar.B0(1.0f);
                SearchViews I = dVar.I();
                if (I != null) {
                    I.addPollingBubblesView();
                }
                super.d();
                break;
            default:
                d dVar2 = cVar.w;
                dVar2.B0(0.0f);
                dVar2.M1(false);
                cVar.detach();
                super.d();
                break;
        }
    }

    @Override // defpackage.yx01
    public final void e() {
        int i = this.f;
        c cVar = this.g;
        switch (i) {
            case 0:
                cVar.attach();
                d dVar = cVar.w;
                dVar.B0(0.0f);
                dVar.M1(true);
                super.e();
                break;
            default:
                cVar.pause();
                d dVar2 = cVar.w;
                dVar2.B0(1.0f);
                dVar2.M1(true);
                super.e();
                break;
        }
    }

    @Override // defpackage.yx01
    public final void f(float f) {
        int i = this.f;
        c cVar = this.g;
        switch (i) {
            case 0:
                cVar.w.B0(f);
                break;
            default:
                cVar.w.B0(1.0f - f);
                break;
        }
    }
}
