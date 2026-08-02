package defpackage;

import com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.a;

/* loaded from: classes14.dex */
public final class wmz extends yx01 {
    public final /* synthetic */ int f;
    public final /* synthetic */ a g;

    public /* synthetic */ wmz(a aVar, int i) {
        this.f = i;
        this.g = aVar;
    }

    @Override // defpackage.yx01
    public final void d() {
        int i = this.f;
        a aVar = this.g;
        switch (i) {
            case 0:
                aVar.resume();
                super.d();
                break;
            default:
                aVar.detach();
                super.d();
                break;
        }
    }

    @Override // defpackage.yx01
    public final void e() {
        int i = this.f;
        a aVar = this.g;
        switch (i) {
            case 0:
                aVar.attach();
                super.e();
                break;
            default:
                aVar.pause();
                super.e();
                break;
        }
    }
}
